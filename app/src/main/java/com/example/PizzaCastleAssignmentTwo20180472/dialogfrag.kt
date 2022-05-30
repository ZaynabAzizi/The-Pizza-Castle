package com.example.PizzaCastleAssignmentTwo20180472
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.fragment.app.DialogFragment

class dialogfrag:DialogFragment(R.layout.custom_frag_dialog) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        val cancelbt : Button = view.findViewById(R.id.button2);
        val submitbt : Button = view.findViewById(R.id.button3);
        val radioGroup = requireView().findViewById<RadioGroup>(R.id.radioGroup2)

        cancelbt.setOnClickListener{
            dismiss()
        }

        submitbt.setOnClickListener {
            val selectedOption: Int = radioGroup.checkedRadioButtonId
            val radioButton = view.findViewById<RadioButton>(selectedOption)
            Toast.makeText(context,radioButton.text,Toast.LENGTH_SHORT).show()
            Toast.makeText(context,"Enjoy your pizza!",Toast.LENGTH_SHORT).show()
            dismiss()
        }
    }

}

