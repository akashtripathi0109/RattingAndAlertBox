package com.example.rattingandalertbox

import android.app.AlertDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var rating=findViewById(R.id.rating)as RatingBar
        var btn=findViewById(R.id.btn)as Button
        var rating2=findViewById<RatingBar>(R.id.rating2) as RatingBar
        var rating3=findViewById<RatingBar>(R.id.rating3) as RatingBar
        var rating4=findViewById<RatingBar>(R.id.rating4) as RatingBar
        var total=findViewById<RatingBar>(R.id.total) as RatingBar
        btn.setOnClickListener{
            val tot=(rating.rating+rating2.rating+rating3.rating+rating4.rating)/4;
            total.rating=tot;
        }

    }
    override fun onBackPressed() {
        val dialog= AlertDialog.Builder(this)
        dialog.setTitle("Review")
        dialog.setView(R.layout.custom_rating)
        dialog.setPositiveButton("Ok") { dialogs: DialogInterface, which: Int ->
            Toast.makeText(this, "done", Toast.LENGTH_SHORT).show()
        }
        dialog.show()

    }
}