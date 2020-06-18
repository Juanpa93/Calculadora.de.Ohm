package com.example.calculadoradeohm

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var Digito_1 = 0
        var Digito_2 = 0
        var Digito_3 = 1
        var Digito_4 = 0
        var resistencia = 0
        var resist_doble: Double = 1000000000.0
//------------------------------------------------------------------------
        bt_negro_1.setOnClickListener { it: View? ->
            Digito_1 = 0
            resistencia = ((Digito_1 * 10) + (Digito_2)) * (Digito_3)
            resist_doble = ((Digito_1 * 10) + (Digito_2)).toDouble() * (Digito_3).toDouble()
            if (resist_doble < 1000.0) {
                tv_result_ohm.text = "$resistencia   Ω "
            }
            if ((resist_doble > 1000.0)&&(resist_doble < 1000000.0)){
                resist_doble=resist_doble/1000
                tv_result_ohm.text = "   $resist_doble   kΩ "
            }
            if ((resist_doble > 1000000.0)){
                resist_doble=resist_doble/1000000
                tv_result_ohm.text = "   $resist_doble   MΩ "
            }


            tv_color_1.setBackgroundColor(Color.parseColor("#000000"))
        }
        bt_negro_2.setOnClickListener { it: View? ->
            Digito_2 = 0
            resistencia = ((Digito_1 * 10) + (Digito_2)) * (Digito_3)
            resist_doble = ((Digito_1 * 10) + (Digito_2)).toDouble() * (Digito_3).toDouble()
             if (resist_doble < 1000.0) {
                tv_result_ohm.text = "$resistencia   Ω "
            }
            if ((resist_doble > 1000)&&(resist_doble < 1000000)){
                resist_doble=resist_doble/1000
                tv_result_ohm.text = "   $resist_doble   kΩ "
            }
            if ((resist_doble > 1000000)){
                resist_doble=resist_doble/1000000
                tv_result_ohm.text = "   $resist_doble   MΩ "
            }

            tv_color_2.setBackgroundColor(Color.parseColor("#000000"))
        }
        bt_negro_3.setOnClickListener { it: View? ->
            Digito_3 = 1
            resistencia = ((Digito_1 * 10) + (Digito_2)) * (Digito_3)
            resist_doble = ((Digito_1 * 10) + (Digito_2)).toDouble() * (Digito_3).toDouble()
             if (resist_doble < 1000.0) {
                tv_result_ohm.text = "$resistencia   Ω "
            }
            if ((resist_doble > 1000)&&(resist_doble < 1000000)){
                resist_doble=resist_doble/1000
                tv_result_ohm.text = "   $resist_doble   kΩ "
            }
            if ((resist_doble > 1000000)){
                resist_doble=resist_doble/1000000
                tv_result_ohm.text = "   $resist_doble   MΩ "
            }
            tv_color_3.setBackgroundColor(Color.parseColor("#000000"))
        }
//------------------------------------------------------------------------
        bt_cafe_1.setOnClickListener { it: View? ->
            Digito_1 = 1
            resistencia = ((Digito_1 * 10) + (Digito_2)) * (Digito_3)
            resist_doble = ((Digito_1 * 10) + (Digito_2)).toDouble() * (Digito_3).toDouble()
            if (resist_doble < 1000.0) {
                tv_result_ohm.text = "$resistencia   Ω "
            }
            if ((resist_doble > 1000)&&(resist_doble < 1000000)){
                resist_doble=resist_doble/1000
                tv_result_ohm.text = "   $resist_doble   kΩ "
            }
            if ((resist_doble > 1000000)){
                resist_doble=resist_doble/1000000
                tv_result_ohm.text = "   $resist_doble   MΩ "
            }
            tv_color_1.setBackgroundColor(Color.parseColor("#a52a2a"))
        }
        bt_cafe_2.setOnClickListener { it: View? ->
            Digito_2 = 1
            resistencia = ((Digito_1 * 10) + (Digito_2)) * (Digito_3)
            resist_doble = ((Digito_1 * 10) + (Digito_2)).toDouble() * (Digito_3).toDouble()
             if (resist_doble < 1000.0) {
                tv_result_ohm.text = "$resistencia   Ω "
            }
            if ((resist_doble > 1000)&&(resist_doble < 1000000)){
                resist_doble=resist_doble/1000
                tv_result_ohm.text = "   $resist_doble   kΩ "
            }
            if ((resist_doble > 1000000)){
                resist_doble=resist_doble/1000000
                tv_result_ohm.text = "   $resist_doble   MΩ "
            }
            tv_color_2.setBackgroundColor(Color.parseColor("#a52a2a"))
        }
        bt_cafe_3.setOnClickListener { it: View? ->
            Digito_3 = 10
            resistencia = ((Digito_1 * 10) + (Digito_2)) * (Digito_3)
            resist_doble = ((Digito_1 * 10) + (Digito_2)).toDouble() * (Digito_3).toDouble()
             if (resist_doble < 1000.0) {
                tv_result_ohm.text = "$resistencia   Ω "
            }
            if ((resist_doble > 1000)&&(resist_doble < 1000000)){
                resist_doble=resist_doble/1000
                tv_result_ohm.text = "   $resist_doble   kΩ "
            }
            if ((resist_doble > 1000000)){
                resist_doble=resist_doble/1000000
                tv_result_ohm.text = "   $resist_doble   MΩ "
            }
            tv_color_3.setBackgroundColor(Color.parseColor("#a52a2a"))
        }
//------------------------------------------------------------------------
        bt_rojo_1.setOnClickListener { it: View? ->
            Digito_1 = 2
            resistencia = ((Digito_1 * 10) + (Digito_2)) * (Digito_3)
            resist_doble = ((Digito_1 * 10) + (Digito_2)).toDouble() * (Digito_3).toDouble()
            if (resist_doble < 1000.0) {
                tv_result_ohm.text = "$resistencia   Ω "
            }
            if ((resist_doble > 1000)&&(resist_doble < 1000000)){
                resist_doble=resist_doble/1000
                tv_result_ohm.text = "   $resist_doble   kΩ "
            }
            if ((resist_doble > 1000000)){
                resist_doble=resist_doble/1000000
                tv_result_ohm.text = "   $resist_doble   MΩ "
            }
            tv_color_1.setBackgroundColor(Color.parseColor("#FF0000"))
        }
        bt_rojo_2.setOnClickListener { it: View? ->
            Digito_2 = 2
            resistencia = ((Digito_1 * 10) + (Digito_2)) * (Digito_3)
            resist_doble = ((Digito_1 * 10) + (Digito_2)).toDouble() * (Digito_3).toDouble()
             if (resist_doble < 1000.0) {
                tv_result_ohm.text = "$resistencia   Ω "
            }
            if ((resist_doble > 1000)&&(resist_doble < 1000000)){
                resist_doble=resist_doble/1000
                tv_result_ohm.text = "   $resist_doble   kΩ "
            }
            if ((resist_doble > 1000000)){
                resist_doble=resist_doble/1000000
                tv_result_ohm.text = "   $resist_doble   MΩ "
            }
            tv_color_2.setBackgroundColor(Color.parseColor("#FF0000"))
        }
        bt_rojo_3.setOnClickListener { it: View? ->
            Digito_3 = 100
            resistencia = ((Digito_1 * 10) + (Digito_2)) * (Digito_3)
            resist_doble = ((Digito_1 * 10) + (Digito_2)).toDouble() * (Digito_3).toDouble()
             if (resist_doble < 1000.0) {
                tv_result_ohm.text = "$resistencia   Ω "
            }
            if ((resist_doble > 1000)&&(resist_doble < 1000000)){
                resist_doble=resist_doble/1000
                tv_result_ohm.text = "   $resist_doble   kΩ "
            }
            if ((resist_doble > 1000000)){
                resist_doble=resist_doble/1000000
                tv_result_ohm.text = "   $resist_doble   MΩ "
            }
            tv_color_3.setBackgroundColor(Color.parseColor("#FF0000"))

        }
//------------------------------------------------------------------------
        bt_naranja_1.setOnClickListener { it: View? ->
            Digito_1 = 3
            resistencia = ((Digito_1 * 10) + (Digito_2)) * (Digito_3)
            resist_doble = ((Digito_1 * 10) + (Digito_2)).toDouble() * (Digito_3).toDouble()
            if (resist_doble < 1000.0) {
                tv_result_ohm.text = "$resistencia   Ω "
            }
            if ((resist_doble > 1000)&&(resist_doble < 1000000)){
                resist_doble=resist_doble/1000
                tv_result_ohm.text = "   $resist_doble   kΩ "
            }
            if ((resist_doble > 1000000)){
                resist_doble=resist_doble/1000000
                tv_result_ohm.text = "   $resist_doble   MΩ "
            }
            tv_color_1.setBackgroundColor(Color.parseColor("#FF5722"))
        }
        bt_naranja_2.setOnClickListener { it: View? ->
            Digito_2 = 3
            resistencia = ((Digito_1 * 10) + (Digito_2)) * (Digito_3)
            resist_doble = ((Digito_1 * 10) + (Digito_2)).toDouble() * (Digito_3).toDouble()
             if (resist_doble < 1000.0) {
                tv_result_ohm.text = "$resistencia   Ω "
            }
            if ((resist_doble > 1000)&&(resist_doble < 1000000)){
                resist_doble=resist_doble/1000
                tv_result_ohm.text = "   $resist_doble   kΩ "
            }
            if ((resist_doble > 1000000)){
                resist_doble=resist_doble/1000000
                tv_result_ohm.text = "   $resist_doble   MΩ "
            }
            tv_color_2.setBackgroundColor(Color.parseColor("#FF5722"))
        }
        bt_naranja_3.setOnClickListener { it: View? ->
            Digito_3 = 1000
            resistencia = ((Digito_1 * 10) + (Digito_2)) * (Digito_3)
            resist_doble = ((Digito_1 * 10) + (Digito_2)).toDouble() * (Digito_3).toDouble()
             if (resist_doble < 1000.0) {
                tv_result_ohm.text = "$resistencia   Ω "
            }
            if ((resist_doble > 1000)&&(resist_doble < 1000000)){
                resist_doble=resist_doble/1000
                tv_result_ohm.text = "   $resist_doble   kΩ "
            }
            if ((resist_doble > 1000000)){
                resist_doble=resist_doble/1000000
                tv_result_ohm.text = "   $resist_doble   MΩ "
            }
            tv_color_3.setBackgroundColor(Color.parseColor("#FF5722"))
        }
//------------------------------------------------------------------------
        bt_amarillo_1.setOnClickListener { it: View? ->
            Digito_1 = 4
            resistencia = ((Digito_1 * 10) + (Digito_2)) * (Digito_3)
            resist_doble = ((Digito_1 * 10) + (Digito_2)).toDouble() * (Digito_3).toDouble()
             if (resist_doble < 1000.0) {
                tv_result_ohm.text = "$resistencia   Ω "
            }
            if ((resist_doble > 1000)&&(resist_doble < 1000000)){
                resist_doble=resist_doble/1000
                tv_result_ohm.text = "   $resist_doble   kΩ "
            }
            if ((resist_doble > 1000000)){
                resist_doble=resist_doble/1000000
                tv_result_ohm.text = "   $resist_doble   MΩ "
            }
            tv_color_1.setBackgroundColor(Color.parseColor("#ffff00"))
        }
        bt_amarillo_2.setOnClickListener { it: View? ->
            Digito_2 = 4
            resistencia = ((Digito_1 * 10) + (Digito_2)) * (Digito_3)
            resist_doble = ((Digito_1 * 10) + (Digito_2)).toDouble() * (Digito_3).toDouble()
             if (resist_doble < 1000.0) {
                tv_result_ohm.text = "$resistencia   Ω "
            }
            if ((resist_doble > 1000)&&(resist_doble < 1000000)){
                resist_doble=resist_doble/1000
                tv_result_ohm.text = "   $resist_doble   kΩ "
            }
            if ((resist_doble > 1000000)){
                resist_doble=resist_doble/1000000
                tv_result_ohm.text = "   $resist_doble   MΩ "
            }
            tv_color_2.setBackgroundColor(Color.parseColor("#ffff00"))

        }
        bt_amarillo_3.setOnClickListener { it: View? ->
            Digito_3 = 10000
            resistencia = ((Digito_1 * 10) + (Digito_2)) * (Digito_3)
            resist_doble = ((Digito_1 * 10) + (Digito_2)).toDouble() * (Digito_3).toDouble()
            if (resist_doble < 1000.0) {
                tv_result_ohm.text = "$resistencia   Ω "
            }
            if ((resist_doble > 1000)&&(resist_doble < 1000000)){
                resist_doble=resist_doble/1000
                tv_result_ohm.text = "   $resist_doble   kΩ "
            }
            if ((resist_doble > 1000000)){
                resist_doble=resist_doble/1000000
                tv_result_ohm.text = "   $resist_doble   MΩ "
            }
            tv_color_3.setBackgroundColor(Color.parseColor("#ffff00"))
        }
//------------------------------------------------------------------------
        bt_verde_1.setOnClickListener { it: View? ->
            Digito_1 = 5
            resistencia = ((Digito_1 * 10) + (Digito_2)) * (Digito_3)
            resist_doble = ((Digito_1 * 10) + (Digito_2)).toDouble() * (Digito_3).toDouble()
            if (resist_doble < 1000.0) {
                tv_result_ohm.text = "$resistencia   Ω "
            }
            if ((resist_doble > 1000)&&(resist_doble < 1000000)){
                resist_doble=resist_doble/1000
                tv_result_ohm.text = "   $resist_doble   kΩ "
            }
            if ((resist_doble > 1000000)){
                resist_doble=resist_doble/1000000
                tv_result_ohm.text = "   $resist_doble   MΩ "
            }
            tv_color_1.setBackgroundColor(Color.parseColor("#008000"))
        }
        bt_verde_2.setOnClickListener { it: View? ->
            Digito_2 = 5
            resistencia = ((Digito_1 * 10) + (Digito_2)) * (Digito_3)
            resist_doble = ((Digito_1 * 10) + (Digito_2)).toDouble() * (Digito_3).toDouble()
            if (resist_doble < 1000.0) {
                tv_result_ohm.text = "$resistencia   Ω "
            }
            if ((resist_doble > 1000.0)&&(resist_doble < 1000000.0)){
                resist_doble=resist_doble/1000
                tv_result_ohm.text = "   $resist_doble   kΩ "
            }
            if ((resist_doble > 1000000.0)){
                resist_doble=resist_doble/1000000
                tv_result_ohm.text = "   $resist_doble   MΩ "
            }
            tv_color_2.setBackgroundColor(Color.parseColor("#008000"))
        }
        bt_verde_3.setOnClickListener { it: View? ->
            Digito_3 = 100000
            resistencia = ((Digito_1 * 10) + (Digito_2)) * (Digito_3)
            resist_doble = ((Digito_1 * 10) + (Digito_2)).toDouble() * (Digito_3).toDouble()
            if (resist_doble < 1000.0) {
                tv_result_ohm.text = "$resistencia   Ω "
            }
            if ((resist_doble > 1000)&&(resist_doble < 1000000)){
                resist_doble=resist_doble/1000
                tv_result_ohm.text = "   $resist_doble   kΩ "
            }
            if ((resist_doble > 1000000)){
                resist_doble=resist_doble/1000000
                tv_result_ohm.text = "   $resist_doble   MΩ "
            }
            tv_color_3.setBackgroundColor(Color.parseColor("#008000"))
        }
//------------------------------------------------------------------------
        bt_azul_1.setOnClickListener { it: View? ->
            Digito_1 = 6
            resistencia = ((Digito_1 * 10) + (Digito_2)) * (Digito_3)
            resist_doble = ((Digito_1 * 10) + (Digito_2)).toDouble() * (Digito_3).toDouble()
            if (resist_doble < 1000.0) {
                tv_result_ohm.text = "$resistencia   Ω "
            }
            if ((resist_doble > 1000)&&(resist_doble < 1000000)){
                resist_doble=resist_doble/1000
                tv_result_ohm.text = "   $resist_doble   kΩ "
            }
            if ((resist_doble > 1000000)){
                resist_doble=resist_doble/1000000
                tv_result_ohm.text = "   $resist_doble   MΩ "
            }
            tv_color_1.setBackgroundColor(Color.parseColor("#2196F3"))
        }
        bt_azul_2.setOnClickListener { it: View? ->
            Digito_2 = 6
            resistencia = ((Digito_1 * 10) + (Digito_2)) * (Digito_3)
            resist_doble = ((Digito_1 * 10) + (Digito_2)).toDouble() * (Digito_3).toDouble()
            if (resist_doble < 1000.0) {
                tv_result_ohm.text = "$resistencia   Ω "
            }
            if ((resist_doble > 1000)&&(resist_doble < 1000000)){
                resist_doble=resist_doble/1000
                tv_result_ohm.text = "   $resist_doble   kΩ "
            }
            if ((resist_doble > 1000000)){
                resist_doble=resist_doble/1000000
                tv_result_ohm.text = "   $resist_doble   MΩ "
            }
            tv_color_2.setBackgroundColor(Color.parseColor("#2196F3"))
        }
        bt_azul_3.setOnClickListener { it: View? ->
            Digito_3 = 1000000
            resistencia = ((Digito_1 * 10) + (Digito_2)) * (Digito_3)
            resist_doble = ((Digito_1 * 10) + (Digito_2)).toDouble() * (Digito_3).toDouble()
            if (resist_doble < 1000.0) {
                tv_result_ohm.text = "$resistencia   Ω "
            }
            if ((resist_doble > 1000)&&(resist_doble < 1000000)){
                resist_doble=resist_doble/1000
                tv_result_ohm.text = "   $resist_doble   kΩ "
            }
            if ((resist_doble > 1000000)){
                resist_doble=resist_doble/1000000
                tv_result_ohm.text = "   $resist_doble   MΩ "
            }
            tv_color_3.setBackgroundColor(Color.parseColor("#2196F3"))
        }
//------------------------------------------------------------------------
        bt_violet_1.setOnClickListener { it: View? ->
            Digito_1 = 7
            resistencia = ((Digito_1 * 10) + (Digito_2)) * (Digito_3)
            resist_doble = ((Digito_1 * 10) + (Digito_2)).toDouble() * (Digito_3).toDouble()
            if (resist_doble < 1000.0) {
                tv_result_ohm.text = "$resistencia   Ω "
            }
            if ((resist_doble > 1000)&&(resist_doble < 1000000)){
                resist_doble=resist_doble/1000
                tv_result_ohm.text = "   $resist_doble   kΩ "
            }
            if ((resist_doble > 1000000)){
                resist_doble=resist_doble/1000000
                tv_result_ohm.text = "   $resist_doble   MΩ "
            }
            tv_color_1.setBackgroundColor(Color.parseColor("#8a2be2"))
        }
        bt_violet_2.setOnClickListener { it: View? ->
            Digito_2 = 7
            resistencia = ((Digito_1 * 10) + (Digito_2)) * (Digito_3)
            resist_doble = ((Digito_1 * 10) + (Digito_2)).toDouble() * (Digito_3).toDouble()
            if (resist_doble < 1000.0) {
                tv_result_ohm.text = "$resistencia   Ω "
            }
            if ((resist_doble > 1000)&&(resist_doble < 1000000)){
                resist_doble=resist_doble/1000
                tv_result_ohm.text = "   $resist_doble   kΩ "
            }
            if ((resist_doble > 1000000)){
                resist_doble=resist_doble/1000000
                tv_result_ohm.text = "   $resist_doble   MΩ "
            }
            tv_color_2.setBackgroundColor(Color.parseColor("#8a2be2"))
        }
        bt_violet_3.setOnClickListener { it: View? ->
            Digito_3 = 10000000
            resistencia = ((Digito_1 * 10) + (Digito_2)) * (Digito_3)
            resist_doble = ((Digito_1 * 10) + (Digito_2)).toDouble() * (Digito_3).toDouble()
            if (resist_doble < 1000.0) {
                tv_result_ohm.text = "$resistencia   Ω "
            }
            if ((resist_doble > 1000)&&(resist_doble < 1000000)){
                resist_doble=resist_doble/1000
                tv_result_ohm.text = "   $resist_doble   kΩ "
            }
            if ((resist_doble > 1000000)){
                resist_doble=resist_doble/1000000
                tv_result_ohm.text = "   $resist_doble   MΩ "
            }
            tv_color_3.setBackgroundColor(Color.parseColor("#8a2be2"))
        }
//------------------------------------------------------------------------

        bt_gris_1.setOnClickListener { it: View? ->
            Digito_1 = 8
            resistencia = ((Digito_1 * 10) + (Digito_2)) * (Digito_3)
            resist_doble = ((Digito_1 * 10) + (Digito_2)).toDouble() * (Digito_3).toDouble()
            if (resist_doble < 1000.0) {
                tv_result_ohm.text = "$resistencia   Ω "
            }
            if ((resist_doble > 1000)&&(resist_doble < 1000000)){
                resist_doble=resist_doble/1000
                tv_result_ohm.text = "   $resist_doble   kΩ "
            }
            if ((resist_doble > 1000000)){
                resist_doble=resist_doble/1000000
                tv_result_ohm.text = "   $resist_doble   MΩ "
            }
            tv_color_1.setBackgroundColor(Color.parseColor("#808080"))
        }
        bt_gris_2.setOnClickListener { it: View? ->
            Digito_2 = 8
            resistencia = ((Digito_1 * 10) + (Digito_2)) * (Digito_3)
            resist_doble = ((Digito_1 * 10) + (Digito_2)).toDouble() * (Digito_3).toDouble()
            if (resist_doble < 1000.0) {
                tv_result_ohm.text = "$resistencia   Ω "
            }
            if ((resist_doble > 1000)&&(resist_doble < 1000000)){
                resist_doble=resist_doble/1000
                tv_result_ohm.text = "   $resist_doble   kΩ "
            }
            if ((resist_doble > 1000000)){
                resist_doble=resist_doble/1000000
                tv_result_ohm.text = "   $resist_doble   MΩ "
            }
            tv_color_2.setBackgroundColor(Color.parseColor("#808080"))
        }
        bt_gris_3.setOnClickListener { it: View? ->
            Digito_3 = 100000000
            resistencia = ((Digito_1 * 10) + (Digito_2)) * (Digito_3)
            resist_doble = ((Digito_1 * 10) + (Digito_2)).toDouble() * (Digito_3).toDouble()
            if (resist_doble < 1000.0) {
                tv_result_ohm.text = "$resistencia   Ω "
            }
            if ((resist_doble > 1000)&&(resist_doble < 1000000)){
                resist_doble=resist_doble/1000
                tv_result_ohm.text = "   $resist_doble   kΩ "
            }
            if ((resist_doble > 1000000)){
                resist_doble=resist_doble/1000000
                tv_result_ohm.text = "   $resist_doble   MΩ "
            }
            tv_color_3.setBackgroundColor(Color.parseColor("#808080"))
        }
//------------------------------------------------------------------------
        bt_blanco_1.setOnClickListener { it: View? ->
            Digito_1 = 9
            resistencia = ((Digito_1 * 10) + (Digito_2)) * (Digito_3)
            resist_doble = ((Digito_1 * 10) + (Digito_2)).toDouble() * (Digito_3).toDouble()
            if (resist_doble < 1000.0) {
                tv_result_ohm.text = "$resistencia   Ω "
            }
            if ((resist_doble > 1000)&&(resist_doble < 1000000)){
                resist_doble=resist_doble/1000
                tv_result_ohm.text = "   $resist_doble   kΩ "
            }
            if ((resist_doble > 1000000)){
                resist_doble=resist_doble/1000000
                tv_result_ohm.text = "   $resist_doble   MΩ "
            }
            tv_color_1.setBackgroundColor(Color.parseColor("#FFFFFF"))
        }
        bt_blanco_2.setOnClickListener { it: View? ->
            Digito_2 = 9
            resistencia = ((Digito_1 * 10) + (Digito_2)) * (Digito_3)
            resist_doble = ((Digito_1 * 10) + (Digito_2)).toDouble() * (Digito_3).toDouble()

            if (resist_doble < 1000.0) {
                tv_result_ohm.text = "$resistencia   Ω "
            }
            if ((resist_doble > 1000)&&(resist_doble < 1000000)){
                resist_doble=resist_doble/1000
                tv_result_ohm.text = "   $resist_doble   kΩ "
            }
            if ((resist_doble > 1000000)){
                resist_doble=resist_doble/1000000
                tv_result_ohm.text = "   $resist_doble   MΩ "
            }
            tv_color_2.setBackgroundColor(Color.parseColor("#FFFFFF"))
        }
        bt_blanco_3.setOnClickListener { it: View? ->
            Digito_3 = 1000000000
            resistencia = ((Digito_1 * 10) + (Digito_2)) * (Digito_3)
            resist_doble = ((Digito_1 * 10) + (Digito_2)).toDouble() * (Digito_3).toDouble()
            if (resist_doble < 1000.0) {
                tv_result_ohm.text = "$resistencia   Ω "
            }
            if ((resist_doble > 1000)&&(resist_doble < 1000000)){
                resist_doble=resist_doble/1000
                tv_result_ohm.text = "   $resist_doble   kΩ "
            }
            if ((resist_doble > 1000000)){
                resist_doble=resist_doble/1000000
                tv_result_ohm.text = "   $resist_doble   MΩ "
            }
            tv_color_3.setBackgroundColor(Color.parseColor("#FFFFFF"))


        }

        bt_dorado.setOnClickListener {
            tv_color_4.setBackgroundColor(Color.parseColor("#ffd700"))
            tv_tolerancia.text = "   +/- 5 %"

        }
        bt_plateado.setOnClickListener {
            tv_color_4.setBackgroundColor(Color.parseColor("#c0c0c0"))
            tv_tolerancia.text = "   +/- 10 %"

        }
//------------------------------------------------------------------------
    }
}

