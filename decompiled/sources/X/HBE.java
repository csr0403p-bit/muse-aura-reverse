package X;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.Log;

/* loaded from: classes6.dex */
public final class HBE {
    public Paint A00;
    public Paint A01;
    public HBQ A02;
    public HBQ A03;
    public HBB A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final /* synthetic */ HB9 A08;

    public HBE(HB9 hb9) {
        this.A08 = hb9;
        Paint paintA0T = AbstractC7607F5u.A0T();
        this.A00 = paintA0T;
        paintA0T.setFlags(193);
        this.A00.setHinting(0);
        AbstractC7607F5u.A1G(this.A00);
        Paint paint = this.A00;
        Typeface typeface = Typeface.DEFAULT;
        paint.setTypeface(typeface);
        Paint paintA0T2 = AbstractC7607F5u.A0T();
        this.A01 = paintA0T2;
        paintA0T2.setFlags(193);
        this.A01.setHinting(0);
        this.A01.setStyle(Paint.Style.STROKE);
        this.A01.setTypeface(typeface);
        this.A04 = HBB.A00();
    }

    public HBE(HBE hbe, HB9 hb9) {
        this.A08 = hb9;
        this.A05 = hbe.A05;
        this.A06 = hbe.A06;
        this.A00 = new Paint(hbe.A00);
        this.A01 = new Paint(hbe.A01);
        HBQ hbq = hbe.A03;
        if (hbq != null) {
            this.A03 = new HBQ(hbq);
        }
        HBQ hbq2 = hbe.A02;
        if (hbq2 != null) {
            this.A02 = new HBQ(hbq2);
        }
        this.A07 = hbe.A07;
        try {
            this.A04 = (HBB) hbe.A04.clone();
        } catch (CloneNotSupportedException e) {
            Log.e("SVGAndroidRenderer", "Unexpected clone error", e);
            this.A04 = HBB.A00();
        }
    }
}
