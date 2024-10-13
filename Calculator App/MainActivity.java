package com.example.myapplication1;
//Packages for all widgets
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
EdgeToEdge.enable(this);
//layout is class
setContentView(R.layout.activity_main);
Button num1Button = (Button) findViewById(R.id.buttonnum);
EditText number1 = (EditText) findViewById(R.id.editTextNumberDecimal1);
EditText number2 = (EditText) findViewById(R.id.editTextNumberDecimal);
Button addButton = (Button) findViewById(R.id.add);

Button subButton = (Button) findViewById(R.id.sub);
Button multButton = (Button) findViewById(R.id.multiply);
Button divButton = (Button) findViewById(R.id.divide);
Button logButton = (Button) findViewById(R.id.log);
Button factorialButton = (Button) findViewById(R.id.factorial);
Button squareButton = (Button) findViewById(R.id.sq);
Button sqrtButton = (Button) findViewById(R.id.sqrt);
TextView result = (TextView) findViewById(R.id.editTextText2);
addButton.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
//int num1=Integer.parseInt(number1.getText().toString());
final String myStr=number1.getText().toString();
final String myStr2=number2.getText().toString();
if (!myStr.isEmpty() && !myStr2.isEmpty())
{
int num1 = Integer.parseInt(myStr);
int num2=Integer.parseInt(myStr2);
int sum=num1+num2;
result.setText(String.valueOf(sum));
}
else
{
Toast.makeText(getApplicationContext(), "Please enter input.",

Toast.LENGTH_SHORT).show();
}
}
});
subButton.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
final String myStr=number1.getText().toString();
final String myStr2=number2.getText().toString();
if (!myStr.isEmpty() && !myStr2.isEmpty())
{
int num1 = Integer.parseInt(myStr);
int num2=Integer.parseInt(myStr2);
int sub=num1-num2;
result.setText(String.valueOf(sub));
}
else
{

Toast.makeText(getApplicationContext(), "Please enter input.",

Toast.LENGTH_SHORT).show();
}
}
});
multButton.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
final String myStr=number1.getText().toString();
final String myStr2=number2.getText().toString();
if (!myStr.isEmpty() && !myStr2.isEmpty())
{
int num1 = Integer.parseInt(myStr);
int num2=Integer.parseInt(myStr2);
int multi=num1*num2;
result.setText(String.valueOf(multi));
}
else
{
Toast.makeText(getApplicationContext(), "Please enter input.",

Toast.LENGTH_SHORT).show();
}
}
});
divButton.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
final String myStr=number1.getText().toString();
final String myStr2=number2.getText().toString();
if (!myStr.isEmpty() && !myStr2.isEmpty())
{
int num1 = Integer.parseInt(myStr);
int num2=Integer.parseInt(myStr2);
if(num2!=0){
int div=num1/num2;
result.setText(String.valueOf(div));
}
else{
result.setText("Number cannot divide by 0.");
}
}
else
{

Toast.makeText(getApplicationContext(), "Please enter input.",
Toast.LENGTH_SHORT).show();
}
}
});
logButton.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
final String myStr=number1.getText().toString();
if (!myStr.isEmpty() )
{
double num1=Integer.parseInt(myStr);
double log=Math.log(num1);
result.setText(String.valueOf(log));
}
else
{
Toast.makeText(getApplicationContext(), "Please enter input.",

Toast.LENGTH_SHORT).show();
}
}
});
factorialButton.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
final String myStr=number1.getText().toString();
if (!myStr.isEmpty() )
{
int num1=Integer.parseInt(myStr);
int i,fact=1;
for(i=1;i<=num1;i++){
fact=fact*i;
}
result.setText(String.valueOf(fact));
}
else
{
Toast.makeText(getApplicationContext(), "Please enter input.",

Toast.LENGTH_SHORT).show();
}
}
});
squareButton.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View view) {
final String myStr=number1.getText().toString();
if (!myStr.isEmpty() )
{
double num1=Integer.parseInt(myStr);
double sq=num1*num1;
result.setText(String.valueOf(sq));
}
else
{
Toast.makeText(getApplicationContext(), "Please enter input.",

Toast.LENGTH_SHORT).show();
}
}
});
sqrtButton.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
final String myStr=number1.getText().toString();
if (!myStr.isEmpty() )
{
double num1=Integer.parseInt(myStr);
double sqrt=Math.sqrt(num1);
result.setText(String.valueOf(sqrt));
}
else
{
Toast.makeText(getApplicationContext(), "Please enter input.",

Toast.LENGTH_SHORT).show();
}
}
});
}}