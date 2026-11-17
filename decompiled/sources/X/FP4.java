package X;

import com.facebook.dsp.core.ColorData;

/* loaded from: classes6.dex */
public abstract class FP4 {
    public static FPW A00 = new FPZ();

    public static final int A00(FP5 fp5, boolean z) {
        C7384Etj.A0Y(fp5, 0);
        ColorData colorDataA01 = A01(fp5);
        return z ? colorDataA01.A00 : colorDataA01.A01;
    }

    public static final ColorData A01(FP5 fp5) {
        EnumC7995FOo themeName = A00.getThemeName();
        C7384Etj.A0Y(themeName, 0);
        return FQX.A00(themeName).A6Y(fp5);
    }
}
