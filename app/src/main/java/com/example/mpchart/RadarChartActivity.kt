package com.example.mpchart

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.mikephil.charting.animation.Easing
import com.github.mikephil.charting.charts.RadarChart
import com.github.mikephil.charting.data.RadarData
import com.github.mikephil.charting.data.RadarDataSet
import com.github.mikephil.charting.data.RadarEntry
import com.github.mikephil.charting.utils.ColorTemplate

class RadarChartActivity : AppCompatActivity() {
    private lateinit var radarChart: RadarChart

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radar_chart)

        radarChart = findViewById(R.id.radar_chart)

        val entries = mutableListOf<RadarEntry>()
        entries.add(RadarEntry(100f))
        entries.add(RadarEntry(200f))
        entries.add(RadarEntry(300f))
        entries.add(RadarEntry(400f))
        entries.add(RadarEntry(500f))

        val dataSet = RadarDataSet(entries, "Data")
        dataSet.setColors(ColorTemplate.VORDIPLOM_COLORS, 255)
        dataSet.lineWidth = 2f
        dataSet.valueTextSize = 20f
        dataSet.valueTextColor = Color.RED

        val radarData = RadarData(dataSet)
        radarChart.data = radarData
        radarChart.description.text = "Radar Chart"
        radarChart.description.textSize = 15f
        radarChart.animateY(2000, Easing.EaseInOutQuad)

    }
}