package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class HyU {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ HyU[] A01;
    public static final HyU A02;
    public static final HyU A03;
    public static final HyU A04;
    public static final HyU A05;
    public final float colorAlphaMultiplierDark;
    public final float colorAlphaMultiplierLight;
    public final boolean hasFoaStroke;
    public final int shadowColorDark;
    public final int shadowColorLight;
    public final FP5 shadowColorToken;
    public final int verticalOffsetDp;
    public final float cornerRadiusDp = 4.0f;
    public final float shadowSizeDp = 12.0f;

    static {
        FP5 fp5 = FP5.A0G;
        A04 = new HyU(fp5, "PRIMARY", 0.1f, 0.1f, 0, 0, true);
        A05 = new HyU(fp5, "PRIMARY_FALLBACK", 0.05f, 0.2f, 1, 0, false);
        A02 = new HyU(FP5.A08, "ELEVATED", 0.2f, 1.0f, 2, 5, false);
        HyU hyU = new HyU(FP5.A0B, "PERSISTENT", 0.05f, 0.6f, 3, 5, false);
        A03 = hyU;
        HyU[] hyUArr = {A04, A05, A02, hyU};
        A01 = hyUArr;
        A00 = C3cG.A0w(hyUArr);
    }

    /* JADX WARN: Incorrect types in method signature: (FFFFLX/FP5;ZI)V */
    public HyU(FP5 fp5, String str, float f, float f2, int i, int i2, boolean z) {
        this.colorAlphaMultiplierLight = f;
        this.colorAlphaMultiplierDark = f2;
        this.shadowColorToken = fp5;
        this.hasFoaStroke = z;
        this.verticalOffsetDp = i2;
        this.shadowColorLight = FP4.A01(fp5).A01;
        this.shadowColorDark = FP4.A01(fp5).A00;
    }

    public static HyU valueOf(String str) {
        return (HyU) Enum.valueOf(HyU.class, str);
    }

    public static HyU[] values() {
        return (HyU[]) A01.clone();
    }
}
