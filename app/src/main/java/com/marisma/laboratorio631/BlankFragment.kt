package com.marisma.laboratorio631

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat
import kotlin.random.Random

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

@Suppress("DEPRECATION")
class BlankFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val aux = inflater.inflate(R.layout.fragment_blank, container, false)
        return aux
    }
    private val colors = arrayOf(
        R.color.black,
        R.color.green,
        R.color.blue,
        R.color.purple,
        R.color.red,
        R.color.yellow,
        R.color.orange,
        R.color.cyan,
        R.color.pink,
    )
    fun cambiarColor(view: View) {
        // Obtener el color gray desde colors.xml
        val colorGray = resources.getColor(R.color.gray)
        view.setBackgroundColor(colorGray)
    }

    companion object {
        fun newInstance(param1: String, param2: String) =
            BlankFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}