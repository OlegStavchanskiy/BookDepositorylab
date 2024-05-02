package ru.rsue.stavchanskiy

import androidx.fragment.app.Fragment

class BookListActivity : SingleFragmentActivity() {
    override fun createFragment(): Fragment = BookListFragment()
}