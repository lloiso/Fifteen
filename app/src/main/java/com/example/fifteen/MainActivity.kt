package com.example.fifteen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button_16.isEnabled = false
        button_16.setText("")
        val listNumber = mutableListOf<String>(
            "1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",
            "10",
            "11",
            "12",
            "13",
            "14",
            "15"
        )
        val listOfButton = mutableListOf<Button>(
            button_1,
            button_2,
            button_3,
            button_4,
            button_5,
            button_6,
            button_7,
            button_8,
            button_9,
            button_10,
            button_11,
            button_12,
            button_13,
            button_14,
            button_15,
            button_16
        )
        button_shufle.setOnClickListener {
            listNumber.shuffle()
            for (i in 0..listOfButton.size - 2) {
                listOfButton[i].setText(listNumber[i])
            }
            for (i in 0..listOfButton.size - 2) {
                listOfButton[i].isEnabled = true
            }
            button_16.isEnabled = false
            button_16.setText("")

        }

        button_1.setOnClickListener {
            if (!button_2.isEnabled) {
                button_2.isEnabled = !button_2.isEnabled
                button_1.isEnabled = !button_1.isEnabled
                button_2.setText(button_1.text)
                button_1.setText("")
            } else if (!button_5.isEnabled) {
                button_5.isEnabled = !button_5.isEnabled
                button_1.isEnabled = !button_1.isEnabled
                button_5.setText(button_1.text)
                button_1.setText("")
            }
        }

        button_2.setOnClickListener {
            if (!button_3.isEnabled) {
                button_3.isEnabled = !button_3.isEnabled
                button_2.isEnabled = !button_2.isEnabled
                button_3.setText(button_2.text)
                button_2.setText("")
            } else if (!button_6.isEnabled) {
                button_6.isEnabled = !button_6.isEnabled
                button_2.isEnabled = !button_2.isEnabled
                button_6.setText(button_2.text)
                button_2.setText("")
            } else if (!button_1.isEnabled) {
                button_2.isEnabled = !button_2.isEnabled
                button_1.isEnabled = !button_1.isEnabled
                button_1.setText(button_2.text)
                button_2.setText("")
            }
        }

        button_3.setOnClickListener {
            if (!button_4.isEnabled) {
                button_4.isEnabled = !button_4.isEnabled
                button_3.isEnabled = !button_3.isEnabled
                button_4.setText(button_3.text)
                button_3.setText("")
            } else if (!button_7.isEnabled) {
                button_7.isEnabled = !button_7.isEnabled
                button_3.isEnabled = !button_3.isEnabled
                button_7.setText(button_3.text)
                button_3.setText("")
            } else if (!button_2.isEnabled) {
                button_3.isEnabled = !button_3.isEnabled
                button_2.isEnabled = !button_2.isEnabled
                button_2.setText(button_3.text)
                button_3.setText("")
            }
        }

        button_4.setOnClickListener {
            if (!button_8.isEnabled) {
                button_8.isEnabled = !button_8.isEnabled
                button_4.isEnabled = !button_4.isEnabled
                button_8.setText(button_4.text)
                button_4.setText("")
            } else if (!button_3.isEnabled) {
                button_3.isEnabled = !button_3.isEnabled
                button_4.isEnabled = !button_4.isEnabled
                button_3.setText(button_4.text)
                button_4.setText("")
            }
        }

        button_5.setOnClickListener {
            if (!button_6.isEnabled) {
                button_6.isEnabled = !button_6.isEnabled
                button_5.isEnabled = !button_5.isEnabled
                button_6.setText(button_5.text)
                button_5.setText("")
            } else if (!button_9.isEnabled) {
                button_9.isEnabled = !button_9.isEnabled
                button_5.isEnabled = !button_5.isEnabled
                button_9.setText(button_5.text)
                button_5.setText("")
            } else if (!button_1.isEnabled) {
                button_1.isEnabled = !button_1.isEnabled
                button_5.isEnabled = !button_5.isEnabled
                button_1.setText(button_5.text)
                button_5.setText("")
            }
        }

        button_6.setOnClickListener {
            if (!button_7.isEnabled) {
                button_7.isEnabled = !button_7.isEnabled
                button_6.isEnabled = !button_6.isEnabled
                button_7.setText(button_6.text)
                button_6.setText("")
            } else if (!button_10.isEnabled) {
                button_6.isEnabled = !button_6.isEnabled
                button_10.isEnabled = !button_10.isEnabled
                button_10.setText(button_6.text)
                button_6.setText("")
            } else if (!button_5.isEnabled) {
                button_5.isEnabled = !button_5.isEnabled
                button_6.isEnabled = !button_6.isEnabled
                button_5.setText(button_6.text)
                button_6.setText("")
            } else if (!button_2.isEnabled) {
                button_2.isEnabled = !button_2.isEnabled
                button_6.isEnabled = !button_6.isEnabled
                button_2.setText(button_6.text)
                button_6.setText("")
            }
        }

        button_7.setOnClickListener {
            if (!button_8.isEnabled) {
                button_8.isEnabled = !button_8.isEnabled
                button_7.isEnabled = !button_7.isEnabled
                button_8.setText(button_7.text)
                button_7.setText("")
            } else if (!button_11.isEnabled) {
                button_7.isEnabled = !button_7.isEnabled
                button_11.isEnabled = !button_11.isEnabled
                button_11.setText(button_7.text)
                button_7.setText("")
            } else if (!button_6.isEnabled) {
                button_6.isEnabled = !button_6.isEnabled
                button_7.isEnabled = !button_7.isEnabled
                button_6.setText(button_7.text)
                button_7.setText("")
            } else if (!button_3.isEnabled) {
                button_7.isEnabled = !button_7.isEnabled
                button_3.isEnabled = !button_3.isEnabled
                button_3.setText(button_7.text)
                button_7.setText("")
            }
        }

        button_8.setOnClickListener {
            if (!button_12.isEnabled) {
                button_12.isEnabled = !button_12.isEnabled
                button_8.isEnabled = !button_8.isEnabled
                button_12.setText(button_8.text)
                button_8.setText("")
            } else if (!button_7.isEnabled) {
                button_8.isEnabled = !button_8.isEnabled
                button_7.isEnabled = !button_7.isEnabled
                button_7.setText(button_8.text)
                button_8.setText("")
            } else if (!button_4.isEnabled) {
                button_8.isEnabled = !button_8.isEnabled
                button_4.isEnabled = !button_4.isEnabled
                button_4.setText(button_8.text)
                button_8.setText("")
            }
        }

        button_9.setOnClickListener {
            if (!button_10.isEnabled) {
                button_9.isEnabled = !button_9.isEnabled
                button_10.isEnabled = !button_10.isEnabled
                button_10.setText(button_9.text)
                button_9.setText("")
            } else if (!button_13.isEnabled) {
                button_13.isEnabled = !button_13.isEnabled
                button_9.isEnabled = !button_9.isEnabled
                button_13.setText(button_9.text)
                button_9.setText("")
            } else if (!button_5.isEnabled) {
                button_5.isEnabled = !button_5.isEnabled
                button_9.isEnabled = !button_9.isEnabled
                button_5.setText(button_9.text)
                button_9.setText("")
            }
        }
        button_10.setOnClickListener {
            if (!button_11.isEnabled) {
                button_10.isEnabled = !button_10.isEnabled
                button_11.isEnabled = !button_11.isEnabled
                button_11.setText(button_10.text)
                button_10.setText("")
            } else if (!button_14.isEnabled) {
                button_14.isEnabled = !button_14.isEnabled
                button_10.isEnabled = !button_10.isEnabled
                button_14.setText(button_10.text)
                button_10.setText("")
            } else if (!button_9.isEnabled) {
                button_9.isEnabled = !button_9.isEnabled
                button_10.isEnabled = !button_10.isEnabled
                button_9.setText(button_10.text)
                button_10.setText("")
            } else if (!button_6.isEnabled) {
                button_6.isEnabled = !button_6.isEnabled
                button_10.isEnabled = !button_10.isEnabled
                button_6.setText(button_10.text)
                button_10.setText("")
            }
        }

        button_11.setOnClickListener {
            if (!button_12.isEnabled) {
                button_11.isEnabled = !button_11.isEnabled
                button_12.isEnabled = !button_12.isEnabled
                button_12.setText(button_11.text)
                button_11.setText("")
            } else if (!button_15.isEnabled) {
                button_15.isEnabled = !button_15.isEnabled
                button_11.isEnabled = !button_11.isEnabled
                button_15.setText(button_11.text)
                button_11.setText("")
            } else if (!button_10.isEnabled) {
                button_10.isEnabled = !button_10.isEnabled
                button_11.isEnabled = !button_11.isEnabled
                button_10.setText(button_11.text)
                button_11.setText("")
            } else if (!button_7.isEnabled) {
                button_7.isEnabled = !button_7.isEnabled
                button_11.isEnabled = !button_11.isEnabled
                button_7.setText(button_11.text)
                button_11.setText("")
            }
        }
        button_12.setOnClickListener {
            if (!button_16.isEnabled) {
                button_12.isEnabled = !button_12.isEnabled
                button_16.isEnabled = !button_16.isEnabled
                button_16.setText(button_12.text)
                button_12.setText("")
            } else if (!button_11.isEnabled) {
                button_12.isEnabled = !button_12.isEnabled
                button_11.isEnabled = !button_11.isEnabled
                button_11.setText(button_12.text)
                button_12.setText("")
            } else if (!button_8.isEnabled) {
                button_12.isEnabled = !button_12.isEnabled
                button_8.isEnabled = !button_8.isEnabled
                button_8.setText(button_12.text)
                button_12.setText("")
            }
        }
        button_13.setOnClickListener {
            if (!button_14.isEnabled) {
                button_13.isEnabled = !button_13.isEnabled
                button_14.isEnabled = !button_14.isEnabled
                button_14.setText(button_13.text)
                button_13.setText("")
            } else if (!button_9.isEnabled) {
                button_13.isEnabled = !button_13.isEnabled
                button_9.isEnabled = !button_9.isEnabled
                button_9.setText(button_13.text)
                button_13.setText("")
            }
        }
        button_14.setOnClickListener {
            if (!button_15.isEnabled) {
                button_14.isEnabled = !button_14.isEnabled
                button_15.isEnabled = !button_15.isEnabled
                button_15.setText(button_14.text)
                button_14.setText("")
            } else if (!button_10.isEnabled) {
                button_10.isEnabled = !button_10.isEnabled
                button_14.isEnabled = !button_14.isEnabled
                button_10.setText(button_14.text)
                button_14.setText("")
            } else if (!button_13.isEnabled) {
                button_14.isEnabled = !button_14.isEnabled
                button_13.isEnabled = !button_13.isEnabled
                button_13.setText(button_14.text)
                button_14.setText("")
            }
        }
        button_15.setOnClickListener {
            if (!button_16.isEnabled) {
                button_16.isEnabled = !button_16.isEnabled
                button_15.isEnabled = !button_15.isEnabled
                button_16.setText(button_15.text)
                button_15.setText("")
            } else if (!button_11.isEnabled) {
                button_11.isEnabled = !button_11.isEnabled
                button_15.isEnabled = !button_15.isEnabled
                button_11.setText(button_15.text)
                button_15.setText("")
            } else if (!button_14.isEnabled) {
                button_15.isEnabled = !button_15.isEnabled
                button_14.isEnabled = !button_14.isEnabled
                button_14.setText(button_15.text)
                button_15.setText("")
            }
        }
        button_16.setOnClickListener {
            if (!button_15.isEnabled) {
                button_15.isEnabled = !button_15.isEnabled
                button_16.isEnabled = !button_16.isEnabled
                button_15.setText(button_16.text)
                button_16.setText("")
            } else if (!button_12.isEnabled) {
                button_12.isEnabled = !button_12.isEnabled
                button_16.isEnabled = !button_16.isEnabled
                button_12.setText(button_16.text)
                button_16.setText("")
            }
        }

    }


}