package org.geeksforgeeks.calcolator;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
private EditText e1, e2;
private TextView t1;
private int num1, num2;
// Method to retrieve numbers from the inputs
public boolean getNumbers() {
e1 = findViewById(R.id.num1);
e2 = findViewById(R.id.num2);
t1 = findViewById(R.id.result);
String s1 = e1.getText().toString().trim();
String s2 = e2.getText().toString().trim();
// Check if both inputs are empty
if (TextUtils.isEmpty(s1) && TextUtils.isEmpty(s2)) {
e1.setText("Please enter value 1");
e2.setText("Please enter value 2");
return false;
}
// Check if only the first input is empty
if (TextUtils.isEmpty(s1)) {
e1.setText("Please enter value 1");
return false;
}
// Check if only the second input is empty
7
if (TextUtils.isEmpty(s2)) {
e2.setText("Please enter value 2");
return false;
}
// Convert strings to integers
try {
num1 = Integer.parseInt(s1);
num2 = Integer.parseInt(s2);
} catch (NumberFormatException e) {
t1.setText("Invalid input, please enter integers only");
return false;
}
return true;
}
// Sum function
public void doSum(View v) {
if (getNumbers()) {
int sum = num1 + num2;
t1.setText(Integer.toString(sum));
} else {
t1.setText("Error: Please enter valid values");
}
}
// Clear input for num1
public void clearTextNum1(View v) {
e1.getText().clear();
}
// Clear input for num2
public void clearTextNum2(View v) {
e2.getText().clear();
}
// Power function
public void doPow(View v) {
if (getNumbers()) {
double result = Math.pow(num1, num2);
t1.setText(Double.toString(result));
8
} else {
t1.setText("Error: Please enter valid values");
}
}
// Subtraction function
public void doSub(View v) {
if (getNumbers()) {
int result = num1 - num2;
t1.setText(Integer.toString(result));
} else {
t1.setText("Error: Please enter valid values");
}
}
// Multiplication function
public void doMul(View v) {
if (getNumbers()) {
int result = num1 * num2;
t1.setText(Integer.toString(result));
} else {
t1.setText("Error: Please enter valid values");
}
}
// Division function
public void doDiv(View v) {
if (getNumbers()) {
if (num2 != 0) {
double result = num1 / (num2 * 1.0);
t1.setText(Double.toString(result));
} else {
t1.setText("Error: Division by zero");
}
} else {
t1.setText("Error: Please enter valid values");
}
}
// Modulus function
public void doMod(View v) {
if (getNumbers()) {
9
double result = num1 % num2;
t1.setText(Double.toString(result));
} else {
t1.setText("Error: Please enter valid values");
}
}
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
e1 = findViewById(R.id.num1);
e2 = findViewById(R.id.num2);
t1 = findViewById(R.id.result);
}
}