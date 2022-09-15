package com.example.chapter4topic2task.berita

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.chapter4topic2task.R
import com.example.chapter4topic2task.databinding.ActivityNewsBinding

class NewsActivity : AppCompatActivity() {

    lateinit var  binding : ActivityNewsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_news)

        var listnews= arrayListOf(
            News ("Hacker Jangan Menyerang", "danialfarros",R.drawable.bjorka,"18/10/2022", "kata Jony G plate jangan menyerang ya"),
            News ("Perayaan Tahun Baru ditengah Pandemi", "muhammadburhan", R.drawable.happynuyear,"18/10/2022",  "pandemi datang hati tidak senang"),
            News ("berikut adalah sosok gus syamsudin", "helsa", R.drawable.imagepicture,"18/10/2022",  "syamsyuddin di gresik adalah sosok pemulung yang ramah"),
            News ("tetap tersenyum ditengah serangan hacker", "helsa", R.drawable.kalaubisajanganmenyerang, "17/10/2022",  " pemerintah sedang merayakan ulang tahun ketua DPR meskipun tengah di serang hacker"),
            News ("ternyata ini alasasan luhut tidak vaksin", "anonim", R.drawable.luhutbelumvaksin, "17/10/2022"," luhut punya riwayatr alergi kutu"),
            News ("Bersama jikiti membangun negeri", "wotabee", R.drawable.oioi2,"17/10/2022",  "Jangan lupa nonoton jekiti di manifest"),
            News ("jokowi 2 Periode digantikan Anis", "laskar FII", R.drawable.periodeoioi,"16/10/2022",  "penembakan laskar FPI kasusnya akan di dalami ulang"),
            News ("Begini cara mengatasi serangan hacker", "muhammadburhan", R.drawable.happynuyear,"16/10/2022",  "tetap santuy dan siap membantuy"),
            News ("begini kerja syamsuddin setelah kehilangan job", "helsa", R.drawable.imagepicture, "15/10/2022", " ya main tiktok aja"),
            News ("tetap tenang dan siap menyerang", "helsa", R.drawable.kalaubisajanganmenyerang,"13/10/2022",  "capek broo"),
        )

        binding.rvberita.adapter = NewsAdapter(listnews)
        binding.rvberita.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)

    }
}