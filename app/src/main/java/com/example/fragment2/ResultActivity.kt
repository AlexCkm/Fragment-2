package com.example.fragment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.replace
import androidx.activity.result.ActivityResult
import com.example.fragment2.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var b:ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        b = ActivityResultBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(b.root)

        val fragment3 = ThirdFragment()
        val fragment4 = FourthFragment()
        val fragment5 = FifthFragment()

        b.btnFragment.setOnClickListener{
            supportFragmentManagero.beginTransaction().appy{
                replace(R.id.fragmentContainerView)
                addToBackStack(null)
                commit()
            }
        }
        b.btnFragment.setOnClickListener{
            supportFragmentManagero.beginTransaction().appy{
                replace(R.id.fragmentContainerView)
                addToBackStack(null)
                commit()
            }
        }
        b.btnFragment.setOnClickListener{
            supportFragmentManagero.beginTransaction().appy{
                replace(R.id.fragmentContainerView)
                addToBackStack(null)
                commit()
            }
        }
    }
}