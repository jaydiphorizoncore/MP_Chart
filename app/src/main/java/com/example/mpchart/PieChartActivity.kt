package com.example.mpchart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.size
import com.github.mikephil.charting.animation.Easing
import com.github.mikephil.charting.charts.PieChart
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter
import com.github.mikephil.charting.utils.ColorTemplate

class PieChartActivity : AppCompatActivity() {
    private lateinit var pieChart: PieChart
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pie_chart)

        pieChart = findViewById(R.id.pie_chart)

        val entries = mutableListOf<PieEntry>()
        entries.add(PieEntry(100f, "100"))
        entries.add(PieEntry(50f, "50"))
        entries.add(PieEntry(90f, "90"))
        entries.add(PieEntry(120f, "120"))
        entries.add(PieEntry(104f, "104"))


        val dataSet = PieDataSet(entries, "Data")
        dataSet.setColors(ColorTemplate.VORDIPLOM_COLORS, 255)
        dataSet.valueTextSize = 20f

        val pieData = PieData(dataSet)
        pieChart.data = pieData
        pieChart.description.text = "Pie Chart"
        pieChart.description.textSize = 20f
        pieChart.centerText = "Data"
        pieChart.setCenterTextSize(30f)
        pieChart.animateY(2000, Easing.EaseInOutQuad)




    }
}