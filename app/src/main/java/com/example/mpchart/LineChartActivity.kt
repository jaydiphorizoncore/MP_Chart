package com.example.mpchart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.mikephil.charting.animation.Easing
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.github.mikephil.charting.utils.ColorTemplate

class LineChartActivity : AppCompatActivity() {
    private lateinit var lineChart: LineChart

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_line_chart)

        lineChart = findViewById(R.id.line_chart)

        val entries = ArrayList<Entry>()
        entries.add(Entry(10f, 80f))
        entries.add(Entry(20f, 90f))
        entries.add(Entry(30f, 200f))
        entries.add(Entry(40f, 50f))
        entries.add(Entry(50f, 150f))

        val dataSet = LineDataSet(entries, "Data")
        dataSet.valueTextSize = 15f
        dataSet.lineWidth = 2f
        dataSet.setColors(ColorTemplate.VORDIPLOM_COLORS, 255)

        val lineData = LineData(dataSet)
        lineChart.data = lineData
        lineChart.description.text = "Line Chart"
        lineChart.description.textSize = 15f
        lineChart.animateY(2000)

    }
}