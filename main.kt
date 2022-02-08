fun main(args: Array<String>) {
var nums = arrayListOf<Int>()
    nums.addAll(listOf(3,2,4))
    var target =6
    var range1=nums.count()-2
    var range2=nums.count()-1
    
    println(nums)
    println(target)
    
    for(num1 in 0..range1){
        
      for(num2 in 1..range2){
        if(nums[num1]+nums[num2]==target){
            print("[$num1 , $num2]")
        }
          
      }
      
        
    }
    
}