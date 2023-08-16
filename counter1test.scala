package practice

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._

class countertest extends FreeSpec with ChiselScalatestTester{
    "Chisel Tester file " in {
        test (new counter (4.U)) { a =>

        a.clock.step(12)
        a.io.result.expect(0.B)
        }
    }
}