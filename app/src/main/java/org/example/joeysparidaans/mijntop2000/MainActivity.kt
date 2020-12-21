package org.example.joeysparidaans.mijntop2000

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import org.example.joeysparidaans.mijntop2000.network.Top2000ApiService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Top2000ApiService.Top2000Api.RETROFIT_API_SERVICE.getTop2000().enqueue(
            object : Callback<String> {
                override fun onResponse(call: Call<String>, response: Response<String>) {
                    Toast.makeText(
                        applicationContext,
                        "Successfully retrieved Top2000",
                        Toast.LENGTH_SHORT
                    ).show()
                }

                override fun onFailure(call: Call<String>, t: Throwable) {
                    Toast.makeText(
                        applicationContext,
                        "Failed to retrieve Top2000",
                        Toast.LENGTH_SHORT
                    ).show()
                }

            }
        )
    }
}