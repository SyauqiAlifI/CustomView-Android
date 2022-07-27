/*
package com.alifidn.customviewdemo

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class CircleView(ctx: Context, attr: AttributeSet) : View(ctx, attr){

    //  Radius untuk view/circle
    private var radius = 100f

    //  Memberi warna pada tampilan view
    private var paint = Paint(Paint.ANTI_ALIAS_FLAG)

    //  Menggambar view ke tampilan
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        paint.color = Color.RED
        canvas?.drawCircle(radius, radius, radius, paint)
    }

    //  onFinishedInflate() => Dipanggil setelah view dan semua temannya
    //                         berhasil di inflate dari XML
    //  onMeasure() => Dipanggil ketika menentukan ukuran view
    //                 dan semua temannnya.
    //  onLayout() => Dpanggil ketika view harus menetapkan
    //                ukuran dan posisi untuk semua teman-nya
    //  onSizeChanged() => Dipanggil ketika ukuran view berubah
    //  onDraw() => Dipanggil ketika tampilan harus melakukan render konten-nya
    //  onKeyDown() => Dipanggil ketika ada sebuah event key down baru saja terjadi
    //  on
}*/
