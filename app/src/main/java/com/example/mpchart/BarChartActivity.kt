package com.example.mpchart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.mikephil.charting.animation.Easing
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter

class BarChartActivity : AppCompatActivity() {
    private lateinit var barChart: BarChart
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bar_chart)

        barChart = findViewById(R.id.bar_chart)

        val entries = mutableListOf<BarEntry>()

        entries.add(BarEntry(1f, 100f))
        entries.add(BarEntry(2f, 200f))
        entries.add(BarEntry(3f, 150f))
        entries.add(BarEntry(4f, 300f))
        entries.add(BarEntry(5f, 250f))

        val colors = intArrayOf(
            android.R.color.holo_red_light,
            android.R.color.holo_orange_light,
            android.R.color.holo_green_light,
            android.R.color.holo_blue_light,
            android.R.color.holo_purple
        )

        val dataSet = BarDataSet(entries, "Data")
        dataSet.valueTextSize = 20f
        dataSet.colors = colors.map { resources.getColor(it, null) }.toMutableList()

        val labels = mutableListOf<String>()
        labels.add("One")
        labels.add("Two")
        labels.add("Three")
        labels.add("Four")
        labels.add("Five")

        val xAxis = barChart.xAxis
        xAxis.textSize = 15f
        xAxis.valueFormatter = IndexAxisValueFormatter(labels)
        xAxis.position = XAxis.XAxisPosition.BOTTOM

        val barData = BarData(dataSet)
        barChart.data = barData
        barChart.description.text = "Bar Chart"
        barChart.description.textSize = 15f
        barChart.animateY(2000, Easing.EaseInOutQuad)
        //  barChart.invalidate()

    }
}