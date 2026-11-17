package X;

import android.animation.ValueAnimator;
import android.util.TypedValue;
import com.facebook.aura.R;
import com.instagram.common.bloks.lexer.ParsingException;

/* loaded from: classes6.dex */
public final class FE3 extends ValueAnimator {
    public final FGV A00;
    public final FGV A01;
    public final FDW A02;
    public final FDW A03;
    public final Integer A04;
    public final FBB A05;
    public final Integer A06;

    public FE3(FGV fgv, FGV fgv2, Integer num, Integer num2) {
        float[] fArr;
        String str;
        C7747FCz c7747FCzA00;
        int iA1a = AnonymousClass002.A1a(fgv, fgv2);
        this.A01 = fgv;
        this.A00 = fgv2;
        this.A04 = num;
        this.A06 = num2;
        FBB fbb = fgv2.A03;
        this.A05 = fbb;
        this.A03 = fgv.A04;
        this.A02 = fgv2.A04;
        fgv2.setVisibility(4);
        if (fbb != null && (str = (String) FBB.A01(fbb, R.id.bk_screen_container_id)) != null && (c7747FCzA00 = AbstractC7724FCa.A00(str, false)) != null) {
            c7747FCzA00.A06.add(FZO.A02(this, 9));
        }
        int iIntValue = this.A04.intValue();
        if (iIntValue == 0) {
            fArr = new float[]{0.0f, 1.0f};
        } else {
            if (iIntValue != iA1a && iIntValue != 2) {
                throw C3cG.A0q();
            }
            fArr = new float[iA1a];
            fArr[0] = 1.0f;
        }
        setFloatValues(fArr);
        addListener(new I05(this, 7));
        addUpdateListener(new C8919Ftb(this, 4));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02e5 A[LOOP:9: B:148:0x02df->B:150:0x02e5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.FDW A00(X.FE3 r30, X.FDW r31, float r32, float r33) throws java.lang.NumberFormatException, com.instagram.common.bloks.lexer.ParsingException {
        /*
            Method dump skipped, instructions count: 1312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FE3.A00(X.FE3, X.FDW, float, float):X.FDW");
    }

    public static final Float A01(FDW fdw) throws NumberFormatException, ParsingException {
        float fApplyDimension;
        String strA0u = AbstractC7608F5v.A0u(fdw);
        if (strA0u == null) {
            return null;
        }
        String strA0F = fdw.A0F(53);
        if (strA0F != null) {
            float f = Float.parseFloat(C06827l3.A02("[^0-9.]").A03(strA0u, ""));
            int iA07 = HiY.A07(strA0F);
            if (iA07 == 0) {
                return Float.valueOf(f);
            }
            fApplyDimension = iA07 != 1 ? TypedValue.applyDimension(2, f, C60Q.A0B(AbstractC7608F5v.A0D())) : AbstractC7607F5u.A09(f, C60Q.A0B(AbstractC7608F5v.A0D()).densityDpi / 160.0f);
        } else {
            fApplyDimension = TypedValue.applyDimension(2, HiY.A02(strA0u), C60Q.A0B(AbstractC7608F5v.A0D()));
        }
        return Float.valueOf(fApplyDimension);
    }
}
