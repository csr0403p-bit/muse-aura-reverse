package X;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: X.HBu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10355HBu {
    public final /* synthetic */ HB9 A00;

    public AbstractC10355HBu(HB9 hb9) {
        this.A00 = hb9;
    }

    public final void A00(String str) {
        HB9 hb9;
        HBM hbm;
        if (this instanceof HBY) {
            HBY hby = (HBY) this;
            hby.A00 += hby.A01.A03.A00.measureText(str);
            return;
        }
        if (this instanceof HBC) {
            HBC hbc = (HBC) this;
            HB9 hb92 = hbc.A03;
            if (HB9.A0o(hb92)) {
                Rect rectA0X = AbstractC7607F5u.A0X();
                hb92.A03.A00.getTextBounds(str, 0, str.length(), rectA0X);
                RectF rectF = new RectF(rectA0X);
                rectF.offset(hbc.A00, hbc.A01);
                hbc.A02.union(rectF);
            }
            hbc.A00 += hb92.A03.A00.measureText(str);
            return;
        }
        if (this instanceof HBH) {
            HBH hbh = (HBH) this;
            HB9 hb93 = hbh.A03;
            if (HB9.A0o(hb93)) {
                Path pathA0V = AbstractC7607F5u.A0V();
                hb93.A03.A00.getTextPath(str, 0, str.length(), hbh.A00, hbh.A01, pathA0V);
                hbh.A02.addPath(pathA0V);
            }
            hbh.A00 += hb93.A03.A00.measureText(str);
            return;
        }
        HBM hbm2 = (HBM) this;
        if (hbm2 instanceof HBK) {
            HBK hbk = (HBK) hbm2;
            hb9 = hbk.A01;
            hbm = hbk;
            if (HB9.A0o(hb9)) {
                HBE hbe = hb9.A03;
                if (hbe.A05) {
                    hb9.A01.drawTextOnPath(str, hbk.A00, ((HBM) hbk).A00, ((HBM) hbk).A01, hbe.A00);
                }
                HBE hbe2 = hb9.A03;
                hbm = hbk;
                if (hbe2.A06) {
                    hb9.A01.drawTextOnPath(str, hbk.A00, ((HBM) hbk).A00, ((HBM) hbk).A01, hbe2.A01);
                    hbm = hbk;
                }
            }
        } else {
            hb9 = hbm2.A02;
            hbm = hbm2;
            if (HB9.A0o(hb9)) {
                HBE hbe3 = hb9.A03;
                if (hbe3.A05) {
                    hb9.A01.drawText(str, hbm2.A00, hbm2.A01, hbe3.A00);
                }
                HBE hbe4 = hb9.A03;
                hbm = hbm2;
                if (hbe4.A06) {
                    hb9.A01.drawText(str, hbm2.A00, hbm2.A01, hbe4.A01);
                    hbm = hbm2;
                }
            }
        }
        hbm.A00 += hb9.A03.A00.measureText(str);
    }
}
