package X;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FiM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8661FiM {
    public final List<C8664FiP<Bitmap>> A00;
    public final List<C8664FiP<CharSequence>> A01;
    public final List<C8664FiP<ColorFilter>> A02;
    public final List<C8664FiP<Float>> A03;
    public final List<C8664FiP<Object[]>> A04;
    public final List<C8664FiP<Integer>> A05;
    public final List<C8664FiP<PointF>> A06;
    public final List<C8664FiP<C8770Fk9>> A07;
    public final List<C8664FiP<Typeface>> A08;

    public C8661FiM(List<? extends C8664FiP<?>> list) {
        ArrayList arrayListA0h = C3cG.A0h();
        for (C8664FiP<?> c8664FiP : list) {
            if (c8664FiP.A01 instanceof Integer) {
                arrayListA0h.add(c8664FiP);
            }
        }
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (C8664FiP<?> c8664FiP2 : list) {
            if (c8664FiP2.A01 instanceof PointF) {
                arrayListA0h2.add(c8664FiP2);
            }
        }
        ArrayList arrayListA0h3 = C3cG.A0h();
        for (C8664FiP<?> c8664FiP3 : list) {
            if (c8664FiP3.A01 instanceof Float) {
                arrayListA0h3.add(c8664FiP3);
            }
        }
        ArrayList arrayListA0h4 = C3cG.A0h();
        for (C8664FiP<?> c8664FiP4 : list) {
            if (c8664FiP4.A01 instanceof C8770Fk9) {
                arrayListA0h4.add(c8664FiP4);
            }
        }
        ArrayList arrayListA0h5 = C3cG.A0h();
        Iterator<? extends C8664FiP<?>> it = list.iterator();
        while (it.hasNext()) {
            BV6.A1S(arrayListA0h5, it);
        }
        ArrayList arrayListA0h6 = C3cG.A0h();
        for (C8664FiP<?> c8664FiP5 : list) {
            if (c8664FiP5.A01 instanceof Object[]) {
                arrayListA0h6.add(c8664FiP5);
            }
        }
        ArrayList arrayListA0h7 = C3cG.A0h();
        for (C8664FiP<?> c8664FiP6 : list) {
            if (c8664FiP6.A01 instanceof Typeface) {
                arrayListA0h7.add(c8664FiP6);
            }
        }
        ArrayList arrayListA0h8 = C3cG.A0h();
        for (C8664FiP<?> c8664FiP7 : list) {
            if (c8664FiP7.A01 instanceof Bitmap) {
                arrayListA0h8.add(c8664FiP7);
            }
        }
        ArrayList arrayListA0h9 = C3cG.A0h();
        for (C8664FiP<?> c8664FiP8 : list) {
            if (c8664FiP8.A01 instanceof CharSequence) {
                arrayListA0h9.add(c8664FiP8);
            }
        }
        this.A05 = arrayListA0h;
        this.A06 = arrayListA0h2;
        this.A03 = arrayListA0h3;
        this.A07 = arrayListA0h4;
        this.A02 = arrayListA0h5;
        this.A04 = arrayListA0h6;
        this.A08 = arrayListA0h7;
        this.A00 = arrayListA0h8;
        this.A01 = arrayListA0h9;
    }
}
