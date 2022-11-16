package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    val num1 = 1000
    val num2 = 5

    try {
        val result = num1/num2;
        println(result);
    }
    catch (error: ArithmeticException){
        println(error);
    }

}