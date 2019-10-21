package az.devedu.deveducalcondroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    public fun addition(view: View) {
        var element1 = findViewById<EditText>(R.id.leftNumber).text
        Log.d("Addition", "Leftnum = $element1")
        var element2 = findViewById<EditText>(R.id.rightNumber).text
        Log.d("Addition", "Rightnum = $element2")
        var resText = findViewById<TextView>(R.id.result)
        Log.d("Addition", "Result = $resText")

        var firstNumber: Double = element1.toString().toDouble()
        Log.d("Division", "Passed here $firstNumber")
        var secondNumber: Double = element2.toString().toDouble()
        Log.d("Addition", "Passed here $secondNumber")
        var result = firstNumber + secondNumber
        Log.d("Addition", "Result = $result")
        resText.setText(result.toString())
        Log.d("Addition", "Process Addition finished")
    }

    public fun subtraction(view: View) {
        var element1 = findViewById<EditText>(R.id.leftNumber).text
        Log.d("Subtraction", "Leftnum = $element1")
        var element2 = findViewById<EditText>(R.id.rightNumber).text
        Log.d("Subtraction", "Rightnum = $element2")
        var resText = findViewById<TextView>(R.id.result)
        Log.d("Subtraction", "Result = $resText")

        var firstNumber: Double = element1.toString().toDouble()
        Log.d("Division", "Passed here $firstNumber")
        var secondNumber: Double = element2.toString().toDouble()
        Log.d("Subtraction", "Passed here $secondNumber")
        var result = firstNumber - secondNumber
        Log.d("Subtraction", "Result = $result")
        resText.setText(result.toString())
        Log.d("Subtraction", "Process Subtraction finished")
    }

    public fun division(view: View) {
        var element1 = findViewById<EditText>(R.id.leftNumber).text
        Log.d("Division", "Leftnum = $element1")
        var element2 = findViewById<EditText>(R.id.rightNumber).text
        Log.d("Division", "Rightnum = $element2")
        var resText = findViewById<TextView>(R.id.result)
        Log.d("Division", "Result = $resText")

        var firstNumber: Int = element1.toString().toInt()
        Log.d("Division", "Passed here $firstNumber")
        var secondNumber: Int = element2.toString().toInt()
        Log.d("Division", "Passed here $secondNumber")
        if (secondNumber != 0) {
            var result = firstNumber.toDouble() / secondNumber.toDouble()
            Log.d("Division", "Result = $result")
            resText.setText(result.toString())
        } else {
            var result = "You try to divide it by ZERO"
            resText.setText(result)
        }
        Log.d("Division", "Process Division finished")
    }

    public fun multiply(view: View) {
        var element1 = findViewById<EditText>(R.id.leftNumber).text
        Log.d("Multiply", "Leftnum = $element1")
        var element2 = findViewById<EditText>(R.id.rightNumber).text
        Log.d("Multiply", "Rightnum = $element2")
        var resText = findViewById<TextView>(R.id.result)
        Log.d("Multiply", "Result = $resText")

        var firstNumber: Double = element1.toString().toDouble()
        Log.d("Multiply", "Passed here $firstNumber")
        var secondNumber: Double = element2.toString().toDouble()
        Log.d("Multiply", "Passed here $secondNumber")
        var result = firstNumber * secondNumber
        Log.d("Multiply", "Result = $result")
        resText.setText(result.toString())
        Log.d("Multiply", "Process Multiply finished")
    }

    public fun squared(view: View) {
        var element1 = findViewById<EditText>(R.id.leftNumber).text
        Log.d("Squared", "Leftnum = $element1")
        var element2 = findViewById<EditText>(R.id.rightNumber).text
        Log.d("Squared", "Rightnum = $element2")
        var resText = findViewById<TextView>(R.id.result)
        Log.d("Squared", "Result = $resText")

        var firstNumber: Double = element1.toString().toDouble()
        Log.d("Squared", "Passed here $firstNumber")
        var secondNumber: Double = element2.toString().toDouble()
        Log.d("Squared", "Passed here $secondNumber")
        var result = Math.pow(firstNumber, secondNumber)
        Log.d("Squared", "Result = $result")
        resText.setText(result.toString())
        Log.d("Squared", "Process Squared finished")
    }

    public fun root(view: View) {
        var element1 = findViewById<EditText>(R.id.leftNumber).text
        Log.d("Root", "Leftnum = $element1")
        var element2 = findViewById<EditText>(R.id.rightNumber).text
        Log.d("Root", "Rightnum = $element2")
        var resText = findViewById<TextView>(R.id.result)
        Log.d("Root", "Result = $resText")
        var firstNumber: Double = element1.toString().toDouble()
        Log.d("Root", "Passed here $firstNumber")
        //var secondNumber: Double = element2.toString().toDouble()
        //Log.d("Root", "Passed here $secondNumber")
        var result = Math.sqrt(firstNumber)
        Log.d("Root", "Result = $result")
        resText.setText(result.toString())
        Log.d("Root", "Process Root finished")
    }

    public fun percent(view: View) {
        var element1 = findViewById<EditText>(R.id.leftNumber).text
        Log.d("Percent", "Leftnum = $element1")
        var element2 = findViewById<EditText>(R.id.rightNumber).text
        Log.d("Percent", "Rightnum = $element2")
        var resText = findViewById<TextView>(R.id.result)
        Log.d("Percent", "Result = $resText")

        var firstNumber: Double = element1.toString().toDouble()
        Log.d("Percent", "Passed here $firstNumber")
        var secondNumber: Double = element2.toString().toDouble()
        Log.d("Percent", "Passed here $secondNumber")
        var result = (firstNumber/100)*secondNumber
        Log.d("Percent", "Result = $result")
        resText.setText(result.toString())
        Log.d("Percent", "Process Percent finished")
    }
    //TODO create new functions
}
