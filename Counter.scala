// package practice

// import chisel3._
// import chisel3.util._

// class Counter ( size : Int , maxValue : Int ) extends Module {
// val io = IO (new Bundle {
// val result = Output ( Bool () )
// })

// def genCounter ( n : Int , max : Int ) = {
// val count = RegInit (0. U ( n . W ) )
// val cmax = max.asUInt
// when ( count === cmax ) {
// count := 0.U
// } .otherwise {
// count := count + 1.U
// }
// count
// }

// val counter1 = genCounter ( size , maxValue )
// io . result := counter1 ( size -1)
// }
