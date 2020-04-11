package com.example.beer

class ML {
    companion object {
        fun calculate (price: Double, ml: Double): String {
            val final = price / ml;
            return String.format("%.3f", final);
        }
    }
}