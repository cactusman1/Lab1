package practice

import chisel3._
import chisel3.util._

class upDownCounter (n: Int) extends Module {
    val io = IO ( new  Bundle {
      //val data_in = Input ( UInt ( n . W ) )
      //val reload = Input ( Bool () )
        val out = Output(Bool())
    })

    val count = RegInit(0.U(n.W))
    val maxcount = RegInit(6.U(n.W))

    when (count === maxcount){
        count := count - 1.U
    }
    .otherwise{
        count := count + 1.U
    }
   
    io.out := (count === maxcount | count === 0.U)

}