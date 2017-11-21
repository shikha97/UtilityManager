package com.utilitymanager;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Calculator extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, ba, bs, bm, bd, be,cl;
    TextView tv1, tv2;
    String s,s1,res,s2,resultString;
    int c,i,i1,result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        b9 = (Button) findViewById(R.id.button9);
        b0 = (Button) findViewById(R.id.button0);
        tv1 = (TextView) findViewById((R.id.textView1));
        tv2 = (TextView) findViewById((R.id.textView2));
        ba=(Button) findViewById(R.id.buttonadd);
        bs=(Button) findViewById(R.id.buttonsub);
        bm=(Button) findViewById(R.id.buttonmul);
        bd=(Button) findViewById(R.id.buttondiv);
        be=(Button) findViewById(R.id.buttonequ);
        cl=(Button) findViewById((R.id.clear));
        b1.setOnClickListener(new View.OnClickListener() {
                                  public void onClick(View v) {
                                      s = (String) tv1.getText();
                                      if(s.equals("-") || s.equals("+") || s.equals("*") || s.equals("/"))
                                      {
                                          tv1.setText("");
                                          s="";
                                      }
                                      s = s + "1";
                                      tv1.setText(s);
                                      s = "";
                                  }
                              }

        );
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                s = (String) tv1.getText();
                if(s.equals("-") || s.equals("+") || s.equals("*") || s.equals("/"))
                {
                    tv1.setText("");
                    s="";
                }
                s = s + "2";
                tv1.setText(s);
                s = "";
            }
                              }

        );
        b3.setOnClickListener(new View.OnClickListener() {
                                  public void onClick(View v) {
                                      s = (String) tv1.getText();
                                      if(s.equals("-") || s.equals("+") || s.equals("*") || s.equals("/"))
                                      {
                                          tv1.setText("");
                                          s="";
                                      }
                                      s = s + "3";
                                      tv1.setText(s);
                                      s = "";
                                  }
                              }

        );
        b4.setOnClickListener(new View.OnClickListener() {
                                  public void onClick(View v) {
                                      s = (String) tv1.getText();
                                      if(s.equals("-") || s.equals("+") || s.equals("*") || s.equals("/"))
                                      {
                                          tv1.setText("");
                                          s="";
                                      }
                                      s = s + "4";
                                      tv1.setText(s);
                                      s = "";
                                  }
                              }

        );
        b5.setOnClickListener(new View.OnClickListener() {
                                  public void onClick(View v) {
                                      s = (String) tv1.getText();
                                      if(s.equals("-") || s.equals("+") || s.equals("*") || s.equals("/"))
                                      {
                                          tv1.setText("");
                                          s="";
                                      }
                                      s = s + "5";
                                      tv1.setText(s);
                                      s = "";
                                  }
                              }

        );
        b6.setOnClickListener(new View.OnClickListener() {
                                  public void onClick(View v) {
                                      s = (String) tv1.getText();
                                      if(s.equals("-") || s.equals("+") || s.equals("*") || s.equals("/"))
                                      {
                                          tv1.setText("");
                                          s="";
                                      }
                                      s = s + "6";
                                      tv1.setText(s);
                                      s = "";
                                  }
                              }

        );
        b7.setOnClickListener(new View.OnClickListener() {
                                  public void onClick(View v) {
                                      s = (String) tv1.getText();
                                      if(s.equals("-") || s.equals("+") || s.equals("*") || s.equals("/"))
                                      {
                                          tv1.setText("");
                                          s="";
                                      }
                                      s = s + "7";
                                      tv1.setText(s);
                                      s = "";
                                  }
                              }

        );
        b8.setOnClickListener(new View.OnClickListener() {
                                  public void onClick(View v) {
                                      s = (String) tv1.getText();
                                      if(s.equals("-") || s.equals("+") || s.equals("*") || s.equals("/"))
                                      {
                                          tv1.setText("");
                                          s="";
                                      }
                                      s = s + "8";
                                      tv1.setText(s);
                                      s = "";
                                  }
                              }

        );
        b9.setOnClickListener(new View.OnClickListener() {
                                  public void onClick(View v) {
                                      s = (String) tv1.getText();
                                      if(s.equals("-") || s.equals("+") || s.equals("*") || s.equals("/"))
                                      {
                                          tv1.setText("");
                                          s="";
                                      }
                                      s = s + "9";
                                      tv1.setText(s);
                                      s = "";
                                  }
                              }

        );
        b0.setOnClickListener(new View.OnClickListener() {
                                  public void onClick(View v) {
                                      s = (String) tv1.getText();
                                      if(s.equals("-") || s.equals("+") || s.equals("*") || s.equals("/"))
                                      {
                                          tv1.setText("");
                                          s="";
                                      }
                                      s = s + "0";
                                      tv1.setText(s);
                                      s = "";
                                  }
                              }

        );
        ba.setOnClickListener(new View.OnClickListener() {
                                  public void onClick(View v) {
                                      String tmp=(String) tv1.getText();
                                      if(tmp.equals(""))s1="0";
                                          //  else if(tmp.equals("+") || tmp.equals("-") || tmp.equals("*") || tmp.equals("/") )
                                      else  s1=tmp;
                                      c=0;
                                      res="";
                                      tv1.setText("+");
                                      tv2.setText(s1+"+");
                                  }
                              }

        );
        bs.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String tmp=(String) tv1.getText();
                if(tmp.equals(""))s1="0";
                    // else if(tmp.equals("+") || tmp.equals("-") || tmp.equals("*") || tmp.equals("/") )
                else   s1=tmp;
                c=1;
                res="";
                tv1.setText("-");
                tv2.setText(s1+"-");
            }
        });
        bm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String tmp=(String) tv1.getText();
                if(tmp.equals(""))s1="0";
                    // else if(tmp.equals("+") || tmp.equals("-") || tmp.equals("*") || tmp.equals("/") )
                else   s1=tmp;
                c=2;
                res="";
                tv1.setText("*");
                tv2.setText(s1+"*");
            }
        });
        bd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String tmp=(String) tv1.getText();
                if(tmp.equals(""))s1="0";
                    //else if(tmp.equals("+") || tmp.equals("-") || tmp.equals("*") || tmp.equals("/") )
                else  s1=tmp;
                c=3;
                res="";
                tv1.setText("/");
                tv2.setText(s1+"/");
            }
        });
        be.setOnClickListener(new View.OnClickListener() {
                                  public void onClick(View v) {
                                      String operator = "";
                                      if (s1.equals("+") || s1.equals("-") || s1.equals("*") || s1.equals("/") || s1.isEmpty() || s1 == null)
                                          i = 0;
                                      else i = Integer.parseInt(s1);

                                      if (res.isEmpty()) {
                                          s2 = (String) tv1.getText();
                                          if (s2.equals("+") || s2.equals("-") || s2.equals("*") || s2.equals("/") || s2.isEmpty() || s2 == null)
                                              i1 = 0;
                                          else i1 = Integer.parseInt(s2);

                                      } else i1 = result;
                                      if (c == 0) {
                                          result = i + i1;
                                          operator = "+";
                                      }
                                      if (c == 1) {
                                          result = i - i1;
                                          operator = "-";
                                      }
                                      if (c == 2) {
                                          result = i * i1;
                                          operator = "*";
                                      }
                                      if (c == 3) {
                                          if (i1 == 0)
                                          {
                                              Toast.makeText(getApplicationContext(), "Invalid Input", Toast.LENGTH_LONG).show();
                                              result = 0;
                                              operator = "";}
                                          else {operator="/";result=i/i1;}
                                      }
                                      if (!operator.isEmpty()) {
                                          tv2.setText(i + "" + operator + "" + i1);
                                      } else {
                                          tv2.setText("");
                                      }
                                      resultString = String.valueOf(result);
                                      tv1.setText(resultString);
                                  }
                              }
        );
        cl.setOnClickListener(new View.OnClickListener(){public void onClick(View v){tv1.setText("");s1="";tv2.setText("");s2="";result=0;resultString="";c=0;i=0;i1=0;}});


    }
    public void backspace(View v)
    {
        String s=tv1.getText().toString();
        if(s.length()!=0)
            s=s.substring(0,s.length()-1);
        tv1.setText(s);
    }
}


