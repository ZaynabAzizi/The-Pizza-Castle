package com.example.PizzaCastleAssignmentTwo20180472

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.*

class MainActivity() : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button) // to variable button to btResult
        button.setOnClickListener { view ->
            var dialog = dialogfrag()
            dialog.show(supportFragmentManager, "customDialog")


        }
        var flag: String = "Veggie Pizza"
        val spinnerVal: Spinner = findViewById(R.id.spinner)
        var options = arrayOf("Veggie Pizza ","Pepperoni Pizza","Margherita Pizza","BBQ Chicken Pizza","Hawaiian Pizza")
        spinnerVal.adapter =
            ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, options)
        spinnerVal.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                var flag = options.get(p2)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.first_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.item1 -> Toast.makeText(
                this,
                "a local online store that provides the best pizza in town!",
                Toast.LENGTH_SHORT
            ).show()
            R.id.item2 -> Toast.makeText(
                this,
                "Facebook : The Pizza Castle     PhoneNumber : 0787539979",
                Toast.LENGTH_SHORT
            ).show()
        }
        return true;
    }



}

