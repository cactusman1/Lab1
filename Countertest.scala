// package practice

// import chisel3._
// import chisel3.util._
// import org.scalatest.FreeSpec
// import chisel3.experimental.BundleLiterals._


// class Countertest extends FreeSpec with ChiselScalatestTester{
//     "Chisel Tester file" in {
//         test (new Counter(4, 10)) { a =>

//         a.clock.step(12)
//         a.io.result.expect(1.B)
//         }
//     }
// }