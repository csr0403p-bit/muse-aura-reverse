package X;

import android.graphics.Color;
import android.graphics.PointF;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class HwH {
    public static final C6823Eab A00 = AbstractC7607F5u.A0p("x", "y");

    public static float A00(AbstractC6806EaH abstractC6806EaH) {
        Integer numA0C = abstractC6806EaH.A0C();
        int iIntValue = numA0C.intValue();
        if (iIntValue == 6) {
            return (float) abstractC6806EaH.A09();
        }
        if (iIntValue != 0) {
            throw new IllegalArgumentException(FGI.A0M("Unknown value for token of type ", EY4.A00(numA0C)));
        }
        abstractC6806EaH.A0F();
        float fA09 = (float) abstractC6806EaH.A09();
        while (abstractC6806EaH.A0L()) {
            abstractC6806EaH.A0K();
        }
        abstractC6806EaH.A0H();
        return fA09;
    }

    public static int A01(AbstractC6806EaH abstractC6806EaH) {
        abstractC6806EaH.A0F();
        int iA09 = (int) (abstractC6806EaH.A09() * 255.0d);
        int iA092 = (int) (abstractC6806EaH.A09() * 255.0d);
        int iA093 = (int) (abstractC6806EaH.A09() * 255.0d);
        while (abstractC6806EaH.A0L()) {
            abstractC6806EaH.A0K();
        }
        abstractC6806EaH.A0H();
        return Color.argb(255, iA09, iA092, iA093);
    }

    public static PointF A02(AbstractC6806EaH abstractC6806EaH, float f) {
        float fA09;
        float fA092;
        int iIntValue = abstractC6806EaH.A0C().intValue();
        if (iIntValue == 6) {
            fA09 = (float) abstractC6806EaH.A09();
            fA092 = (float) abstractC6806EaH.A09();
            while (abstractC6806EaH.A0L()) {
                abstractC6806EaH.A0K();
            }
        } else if (iIntValue == 0) {
            abstractC6806EaH.A0F();
            fA09 = (float) abstractC6806EaH.A09();
            fA092 = (float) abstractC6806EaH.A09();
            while (abstractC6806EaH.A0C() != C79.A01) {
                abstractC6806EaH.A0K();
            }
            abstractC6806EaH.A0H();
        } else {
            if (iIntValue != 2) {
                Integer numA0C = abstractC6806EaH.A0C();
                throw new IllegalArgumentException(FGI.A0M("Unknown point starts with ", numA0C != null ? EY4.A00(numA0C) : HatchCcvLoggingKt.NO_POSTAL_FIELD));
            }
            abstractC6806EaH.A0G();
            fA09 = 0.0f;
            fA092 = 0.0f;
            while (abstractC6806EaH.A0L()) {
                int iA0B = abstractC6806EaH.A0B(A00);
                if (iA0B == 0) {
                    fA09 = A00(abstractC6806EaH);
                } else if (iA0B != 1) {
                    abstractC6806EaH.A0J();
                    abstractC6806EaH.A0K();
                } else {
                    fA092 = A00(abstractC6806EaH);
                }
            }
            abstractC6806EaH.A0I();
        }
        return new PointF(fA09 * f, fA092 * f);
    }

    public static List<PointF> A03(AbstractC6806EaH abstractC6806EaH, float f) {
        ArrayList arrayListA0h = C3cG.A0h();
        abstractC6806EaH.A0F();
        while (abstractC6806EaH.A0C() == C79.A00) {
            abstractC6806EaH.A0F();
            arrayListA0h.add(A02(abstractC6806EaH, f));
            abstractC6806EaH.A0H();
        }
        abstractC6806EaH.A0H();
        return arrayListA0h;
    }
}
