package com.tw.custombottomnavigationdemo

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.tw.custombottomnavigationdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var mbinding: ActivityMainBinding
    private val TAG = this.javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mbinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mbinding.root)


        val firstFragment= HomeFragment()
        val secondFragment= ShortsFragment()
        val thirdFragment= AddFragment()
        val fourthFragment= SubscriptionFragment()
        val fifthFragment= LibraryFragment()

        //this fragment load initialy when MainActivity is loaded
        setNewFragment(firstFragment)

        mbinding.bottomNavigationView.setOnItemSelectedListener {

            when(it.itemId){

                R.id.home ->{
                    setNewFragment(firstFragment)
                    Toast.makeText(this, "Home Clicked", Toast.LENGTH_SHORT).show()
                }

                R.id.shorts ->{
                    setNewFragment(secondFragment)
                    Toast.makeText(this, "Shorts Clicked", Toast.LENGTH_SHORT).show()
                }

                R.id.subscriptions ->{
                    setNewFragment(fourthFragment)
                    Toast.makeText(this, "Subscription Clicked", Toast.LENGTH_SHORT).show()
                }

                R.id.library ->{
                    setNewFragment(fifthFragment)
                    Toast.makeText(this, "Library Clicked", Toast.LENGTH_SHORT).show()
                }
            }
            true
        }

        mbinding.fabAddNew.setOnClickListener {
            setNewFragment(thirdFragment)
            Toast.makeText(this, "Add Clicked", Toast.LENGTH_SHORT).show()
        }

    }

    private fun setNewFragment(fragment: Fragment){
//        val bundle = Bundle()
//        bundle.putLong("Month", 2)
//        fragment.arguments = bundle
        FragBackStackUtil.showFreg(fragment, this)
    }

}