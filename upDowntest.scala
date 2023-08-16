package practice
import chiseltest._
import chisel3._
import chisel3.util._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._ 

class upDownCounterTester extends FreeSpec with ChiselScalatestTester{
    "Chisel Tester File" in {
        test (new upDownCounter (4)){ a =>
       // a.io.data_in.poke()
       // a.io.reload.poke(0.B)
        a.clock.step(6)
        a.io.out.expect(1.B)    
        }
    }
}