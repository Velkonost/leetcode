class Solution {
    fun validateCoupons(
        code: Array<String>,
        businessLine: Array<String>,
        isActive: BooleanArray
    ): List<String> {
        val map = hashMapOf<String, List<String>>()
        map["electronics"] = mutableListOf()
        map["grocery"] = mutableListOf()
        map["pharmacy"] = mutableListOf()
        map["restaurant"] = mutableListOf()
        
        for (i in 0..code.size - 1) {
            if (!isActive[i]) continue
            if (!code[i].isCode()) continue
            
            val category = businessLine[i]
            if (!category.isCategory()) continue

            map[category] = map.getOrDefault(category, mutableListOf<String>()) + code[i]
        }

        return map["electronics"]!!.sorted() + map["grocery"]!!.sorted() + map["pharmacy"]!!.sorted() + map["restaurant"]!!.sorted()

    }

    private fun String.isCategory(): Boolean {
        return this in listOf("electronics", "grocery", "pharmacy", "restaurant")
    }

    private fun String.isCode(): Boolean {
        return this.isNotEmpty() && this.all { it.isLetterOrDigit() || it == '_' }
    }
}