class Solution {
    fun isLongPressedName(name: String, typed: String): Boolean {

        var index = 0
        var lastChar : Char? = null
        for(ch in typed){
            if(index< name.length && ch == name[index]) {
                lastChar = ch
                index++
            }else if(ch == lastChar){
                continue
            }else{
                return false
            }
        }

        return index == name.length
        
    }
}