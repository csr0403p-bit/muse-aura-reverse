package X;

import com.facebook.aura.bloks.fonts.AuraBloksFontCreator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class FP6 {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ FP6[] A01;
    public static final FP6 A02;
    public static final FP6 A03;
    public static final FP6 A04;
    public static final FP6 A05;
    public static final FP6 A06;
    public static final FP6 A07;
    public static final FP6 A08;
    public static final FP6 A09;
    public static final FP6 A0A;
    public final String value;

    static {
        FP6 fp6 = new FP6("OPTIMISTIC_DISPLAY_APP", 0, "Optimistic Display App");
        A03 = fp6;
        FP6 fp62 = new FP6("OPTIMISTIC_DISPLAY_APP_MEDIUM", 1, "Optimistic Display App Medium");
        FP6 fp63 = new FP6("OPTIMISTIC_TEXT_APP", 2, "Optimistic Text App Regular");
        A04 = fp63;
        FP6 fp64 = new FP6("OPTIMISTIC_TEXT_APP_REGULAR", 3, "Optimistic Text App Regular");
        A07 = fp64;
        FP6 fp65 = new FP6("OPTIMISTIC_TEXT_APP_MEDIUM", 4, "Optimistic Text App Medium");
        A06 = fp65;
        FP6 fp66 = new FP6("OPTIMISTIC_TEXT_APP_BOLD", 5, "Optimistic Text App Bold");
        A05 = fp66;
        FP6 fp67 = new FP6("OPTIMISTIC_VF_APP_LITE", 6, "Optimistic VF App Lite");
        A08 = fp67;
        FP6 fp68 = new FP6("OPTIMISTIC_AI", 7, AuraBloksFontCreator.OPTIMISTIC_AI);
        A02 = fp68;
        FP6 fp69 = new FP6("SANS_SERIF", 8, "sans-serif");
        A09 = fp69;
        FP6 fp610 = new FP6("SANS_SERIF_MEDIUM", 9, "sans-serif-medium");
        A0A = fp610;
        FP6[] fp6Arr = {fp6, fp62, fp63, fp64, fp65, fp66, fp67, fp68, fp69, fp610, new FP6("ROBOTO_MONO_REGULAR", 10, "Roboto Mono Regular")};
        A01 = fp6Arr;
        A00 = C3cG.A0w(fp6Arr);
    }

    public static FP6 valueOf(String str) {
        return (FP6) Enum.valueOf(FP6.class, str);
    }

    public static FP6[] values() {
        return (FP6[]) A01.clone();
    }

    public FP6(String str, int i, String str2) {
        this.value = str2;
    }
}
