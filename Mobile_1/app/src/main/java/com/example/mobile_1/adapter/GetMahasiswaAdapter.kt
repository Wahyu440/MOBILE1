package com.example.mobile_1.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.PopupMenu
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mobile_1.R
import com.example.mobile_1.model.ResponseGetMahasiswaItem

class GetMahasiswaAdapter(val mhs: List<ResponseGetMahasiswaItem>?):
    RecyclerView.Adapter<GetMahasiswaAdapter.MahasiswaHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): GetMahasiswaAdapter.MahasiswaHolder {
        return MahasiswaHolder(LayoutInflater.from(parent.context).inflate(R.layout.rv_item_mahasiswa, parent, false))
    }
    override fun onBindViewHolder(holder: GetMahasiswaAdapter.MahasiswaHolder,
                                  position: Int) {
        holder.bindMahasiswa(mhs?.get(position))
    }
    override fun getItemCount(): Int {
        return mhs?.size ?: 0
    }
    class MahasiswaHolder(view: View) : RecyclerView.ViewHolder(view) {
        init{
            view.setOnLongClickListener {
                // V is View variable and tv is name of textView

                val pop= PopupMenu(view.context,it)
                pop.inflate(R.menu.menu_mahasiswa)
                pop.setOnMenuItemClickListener {item->
                    when(item.itemId)
                    {
                        R.id.delete_mhs->{ }
                    }
                    true
                }
                pop.show()
                true
            }
        }
        lateinit var txtIdMhs: TextView
        lateinit var txtNamaMhs: TextView
        lateinit var txtNimMhs: TextView
        lateinit var txtAlamatMhs: TextView
        lateinit var txtEmailMhs: TextView
        lateinit var txtFotoMhs: TextView
        fun bindMahasiswa(mhs: ResponseGetMahasiswaItem?) {
            itemView.apply {
                txtNamaMhs = findViewById(R.id.txtNamaMhs)
                txtEmailMhs = findViewById(R.id.txtEmailMhs)
                txtAlamatMhs = findViewById(R.id.txtAlamatMhs)
                txtNimMhs = findViewById(R.id.txtNimMhs)
                txtIdMhs = findViewById(R.id.txtIdMhs)
                txtFotoMhs = findViewById(R.id.txtFotoMhs)
                txtNamaMhs.text = mhs?.nama
                txtEmailMhs.text = mhs?.email
                txtNimMhs.text = mhs?.nim
                txtAlamatMhs.text = mhs?.alamat
                txtFotoMhs.text = mhs?.foto
                txtIdMhs.text = mhs?.id.toString()
            }
        }
    }
}