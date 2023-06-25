package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class Multiply {

    @Autowired
    logic logic;

    /*@GetMapping("/Multiply")
    public long mulNum(@RequestParam("a") long a, @RequestParam("b") long b){
        return a*b;*/

    @PostMapping("/Mul")
    public ResponseEntity <Result> mulNum(@RequestBody numbers num){
        long value = logic.mul(num.getNum1(), num.getNum2());
        Result value1 = new Result(num.getNum1(), num.getNum2(), value);
        return ResponseEntity.ok(value1);
    }

    public static class Result {
        private long num1;
        private long num2;
        private long mul;

        public Result(long num1,long num2,long mul) {
            this.num1=num1;
            this.num2=num2;
            this.mul=mul;
        }

        public long getMul() {
            return mul;
        }

        public void setMul(long mul) {
            this.mul = mul;
        }

        public long getNum1() {
            return num1;
        }

        public long getNum2() {
            return num2;
        }

        public void setNum1(long num1) {
            this.num1 = num1;
        }

        public void setNum2(long num2) {
            this.num2 = num2;
        }
    }
    }

