package practice
import chisel3 . _
class counter (counterBits : UInt)  extends Module {
val io = IO (new Bundle {
val result = Output ( Bool () )
})
val max = (1.U << counterBits ) - (1.U << (counterBits-1.U) ) 
val count = RegInit (0.U (3.W ))
 

when ( count === max ) {
count := 0.U
} .otherwise {
count := count + (1.U)
}
//io . result := count 
//-+println ( s" counter created with max value $max ")


}