package com.example.biharinnovation1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.FrameLayout
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import android.R

import androidx.annotation.NonNull





class MainActivity : AppCompatActivity() {

    lateinit var drawerLayout: DrawerLayout
    lateinit var coordinatorLayout: CoordinatorLayout
    lateinit var toolbar: androidx.appcompat.widget.Toolbar
    lateinit var frameLayout: FrameLayout
    lateinit var navigationView: NavigationView
    var previousMenuItem:MenuItem? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawerLayout=findViewById(R.id.drawer_layout)
        coordinatorLayout=findViewById(R.id.coordinator_layout)
        toolbar = findViewById(R.id.toolbar)
        frameLayout=findViewById(R.id.frame)
        navigationView=findViewById(R.id.nav_view)

        setUpToolbar()

        openHome()

        val actionBarDrawerToggle= ActionBarDrawerToggle(
            this@MainActivity,
            drawerLayout,
            R.string.open_drawer,
            R.string.close_drawer
        )

        drawerLayout.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()

        navigationView.setNavigationItemSelectedListener {

            if(previousMenuItem != null){
                previousMenuItem?.isChecked = false
            }
            it.isCheckable = true
            it.isChecked = true
            previousMenuItem=it


            when(it.itemId){
                R.id.home -> {
                    openHome()
                    drawerLayout.closeDrawers()
                }
                R.id.services -> {
                    supportFragmentManager.beginTransaction().replace(R.id.frame,ServicesFragment())
                    .commit()

                    supportActionBar?.title="Services"
                    drawerLayout.closeDrawers()
                }
                R.id.products -> {
                    supportFragmentManager.beginTransaction().replace(R.id.frame,ProductsFragment())
                    .commit()

                    supportActionBar?.title="Products"
                    drawerLayout.closeDrawers()
                }
                R.id.courses -> {
                    supportFragmentManager.beginTransaction().replace(R.id.frame,CoursesFragment())
                   .commit()

                    supportActionBar?.title="Courses"
                    drawerLayout.closeDrawers()
                }
                R.id.contact -> {
                    supportFragmentManager.beginTransaction().replace(R.id.frame,ContactUsFragment())
                   .commit()

                    supportActionBar?.title="Contact Us"
                    drawerLayout.closeDrawers()
                }
                R.id.aboutUs -> {
                    supportFragmentManager.beginTransaction().replace(R.id.frame,AboutUsFragment())
                        .commit()

                    supportActionBar?.title="About Us"
                    drawerLayout.closeDrawers()
                }
                R.id.members -> {
                    supportFragmentManager.beginTransaction().replace(R.id.frame,MembersFragment())
                        .commit()

                    supportActionBar?.title="Members"
                    drawerLayout.closeDrawers()
                }
                R.id.logIn -> {
                    supportFragmentManager.beginTransaction().replace(R.id.frame,LogInFragment())
                        .commit()

                    supportActionBar?.title="Log In"
                    drawerLayout.closeDrawers()
                }
            }
            return@setNavigationItemSelectedListener true
        }
    }

    private fun setUpToolbar(){
        setSupportActionBar(toolbar)
        supportActionBar?.title="Toolbar Title"
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId

        if(id== android.R.id.home){
            drawerLayout.openDrawer(GravityCompat.START)
        }
        return super.onOptionsItemSelected(item)
    }

     fun openHome(){
        val fragment = HomeFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frame,fragment)
        transaction.commit()
        supportActionBar?.title="Home"
         navigationView.setCheckedItem(R.id.home)
    }

    override fun onBackPressed() {
        val frag = supportFragmentManager.findFragmentById(R.id.frame)

        when (frag){
            !is HomeFragment ->  openHome()

            else ->   super.onBackPressed()
        }
    }
}