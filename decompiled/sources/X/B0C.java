package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import com.facebook.aura.bloks.fonts.AuraTypefaceCreatorKt;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class B0C {
    public static ThreadLocal<Paint> A00 = new ThreadLocal<>();

    public static final Typeface A00(Context context, Typeface typeface, B08 b08) {
        String strA00;
        int i;
        float fAhA;
        if (typeface == null) {
            return null;
        }
        List<B0G> list = b08.A00;
        if (list.isEmpty()) {
            return typeface;
        }
        ThreadLocal<Paint> threadLocal = A00;
        Paint paint = threadLocal.get();
        if (paint == null) {
            paint = new Paint();
            threadLocal.set(paint);
        }
        paint.setFontVariationSettings(null);
        paint.setTypeface(typeface);
        C1498Ak5 c1498Ak5A00 = AbstractC1500Ak7.A00(context);
        if (context == null || Build.VERSION.SDK_INT < 31 || C8j3.A0Z(context).fontWeightAdjustment == Integer.MAX_VALUE || (i = C8j3.A0Z(context).fontWeightAdjustment) == 0) {
            strA00 = C1Vi.A00(", ", "", "", list, C2297BSx.A00(c1498Ak5A00, 37));
        } else {
            int size = list.size();
            strA00 = "";
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                B0G b0g = list.get(i2);
                if (AuraTypefaceCreatorKt.WEIGHT_AXIS.equals(b0g.ACh())) {
                    fAhA = ATD.A03(b0g.AhA(c1498Ak5A00) + i, 1.0f, 1000.0f);
                    z = true;
                } else {
                    fAhA = b0g.AhA(c1498Ak5A00);
                }
                if (i2 != 0) {
                    strA00 = FGI.A0E(strA00, ',');
                }
                StringBuilder sbA0g = C3cG.A0g(strA00);
                sbA0g.append('\'');
                sbA0g.append(b0g.ACh());
                sbA0g.append("' ");
                sbA0g.append(fAhA);
                strA00 = sbA0g.toString();
            }
            if (!z) {
                float fA03 = ATD.A03(i + 400.0f, 1.0f, 1000.0f);
                if (!list.isEmpty()) {
                    strA00 = FGI.A0E(strA00, ',');
                }
                StringBuilder sbA0g2 = C3cG.A0g(strA00);
                sbA0g2.append("'wght' ");
                sbA0g2.append(fA03);
                strA00 = sbA0g2.toString();
            }
        }
        paint.setFontVariationSettings(strA00);
        return paint.getTypeface();
    }
}
