package com.example.mpchart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var barChart: Button
    private lateinit var pieChart: Button
    private lateinit var radarChart: Button
    private lateinit var lineChart: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
        clickListener()
    }

    private fun clickListener() {
        barChart.setOnClickListener {
            val i = Intent(this, BarChartActivity::class.java)
            startActivity(i)
        }
        pieChart.setOnClickListener {
            val i = Intent(this, PieChartActivity::class.java)
            startActivity(i)
        }
        radarChart.setOnClickListener {
            val i = Intent(this, RadarChartActivity::class.java)
            startActivity(i)
        }
        lineChart . setOnClickListener {
            val i = Intent(this, LineChartActivity::class.java)
            startActivity(i)
        }
    }

    private fun initView() {
        barChart = findViewById(R.id.btn_bar_chart)
        pieChart = findViewById(R.id.btn_pie_chart)
        radarChart = findViewById(R.id.btn_radar_chart)
        lineChart = findViewById(R.id.btn_line_chart)
    }
}