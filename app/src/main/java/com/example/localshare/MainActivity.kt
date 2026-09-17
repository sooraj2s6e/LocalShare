package com.example.localshare

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER_HORIZONTAL
            setPadding(32, 50, 32, 32)
            setBackgroundColor(Color.rgb(245, 247, 251))
        }

        val title = TextView(this).apply {
            text = "Local Share"
            textSize = 30f
            setTextColor(Color.rgb(17, 24, 39))
            gravity = Gravity.CENTER
        }

        val subtitle = TextView(this).apply {
            text = "Share files locally — no internet required"
            textSize = 15f
            setTextColor(Color.GRAY)
            gravity = Gravity.CENTER
            setPadding(0, 8, 0, 35)
        }

        val address = EditText(this).apply {
            hint = "PC address: 192.168.1.5:8000"
            singleLine = true
            setPadding(20, 10, 20, 10)
        }

        val testButton = Button(this).apply {
            text = "TEST CONNECTION"
        }

        val sendButton = Button(this).apply {
            text = "📤  SEND FILES"
        }

        val receiveButton = Button(this).apply {
            text = "📥  RECEIVE FILES"
        }

        val qrButton = Button(this).apply {
            text = "📷  SCAN QR CODE"
        }

        val status = TextView(this).apply {
            text = "Connect your phone and PC to the same Wi-Fi."
            textSize = 14f
            setTextColor(Color.DKGRAY)
            gravity = Gravity.CENTER
            setPadding(0, 25, 0, 0)
        }

        root.addView(title)

        root.addView(
            subtitle,
            LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
        )

        root.addView(
            address,
            LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                60
            )
        )

        root.addView(
            testButton,
            LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                60
            )
        )

        root.addView(
            sendButton,
            LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                65
            )
        )

        root.addView(
            receiveButton,
            LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                65
            )
        )

        root.addView(
            qrButton,
            LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                65
            )
        )

        root.addView(status)

        setContentView(root)
    }
}
