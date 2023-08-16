// package practice

// import chisel3._
// import chisel3.tester._
// import org.scalatest.FreeSpec
// import chisel3.experimental.BundleLiterals._

// class chiselTester extends FreeSpec with ChiselScalatestTester{
//     "Chisel Tester file " in {
//         test (new chisel) { a =>
//         a.io.in1.poke(6.U)
//         a.io.in2.poke(5.U)
//         a.clock.step(1)
//        // a.io.out.expect(3.U)
//         a.io.out1.expect(4.U)
//         }
//     }
// }