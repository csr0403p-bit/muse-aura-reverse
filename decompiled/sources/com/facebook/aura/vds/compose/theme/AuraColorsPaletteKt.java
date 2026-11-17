package com.facebook.aura.vds.compose.theme;

import X.B6A;
import X.HDi;
import X.HxS;

/* loaded from: classes6.dex */
public abstract class AuraColorsPaletteKt {
    public static final AuraColorsPalette auraColorsPaletteDark;
    public static final AuraColorsPalette auraColorsPaletteLight;

    public static final AuraColorsPalette getAuraColorsPaletteDark() {
        return auraColorsPaletteDark;
    }

    public static final AuraColorsPalette getAuraColorsPaletteLight() {
        return auraColorsPaletteLight;
    }

    static {
        long j = B6A.A01;
        long j2 = 4294967295L << 32;
        long j3 = BaseColors.GRAY_100;
        long j4 = BaseColors.GRAY_50;
        long j5 = BaseColors.BLACK_ALPHA_700;
        long j6 = BaseColors.BLACK;
        long jA04 = HxS.A04(HDi.A0O[(int) (j6 & 63)], B6A.A03(j6), B6A.A02(j6), B6A.A01(j6), 0.2f);
        long j7 = 4294046967L << 32;
        long j8 = BaseColors.GRAY_1000;
        long j9 = B6A.A06;
        SurfaceColors surfaceColors = new SurfaceColors(4294769916L << 32, j2, j3, j4, j2, 4293849072L << 32, j5, jA04, 1291845632 << 32, 855638016 << 32, 4292665573L << 32, j7, j8, j2, j4, j9);
        long j10 = 4293520107L << 32;
        long j11 = 436207616 << 32;
        long j12 = 4281611316L << 32;
        BorderColors borderColors = new BorderColors(j10, j10, j11, j6, j12, j11, 251658240 << 32);
        long j13 = BaseColors.WHITE;
        long j14 = 4278215892L << 32;
        ButtonColors buttonColors = new ButtonColors(j6, j13, j14, 4290780983L << 32, j4);
        long j15 = 4278191113L << 32;
        long jA042 = HxS.A04(HDi.A0O[(int) (j15 & 63)], B6A.A03(j15), B6A.A02(j15), B6A.A01(j15), 0.6f);
        long j16 = 4278191889L << 32;
        long jA043 = HxS.A04(HDi.A0O[(int) (j16 & 63)], B6A.A03(j16), B6A.A02(j16), B6A.A01(j16), 0.35f);
        long j17 = 4278192148L << 32;
        long jA044 = HxS.A04(HDi.A0O[(int) (j17 & 63)], B6A.A03(j17), B6A.A02(j17), B6A.A01(j17), 0.2902f);
        long j18 = BaseColors.RED_650;
        long j19 = 4288782753L << 32;
        long j20 = 4284715007L << 32;
        long j21 = 4294914112L << 32;
        long j22 = 4294919482L << 32;
        long j23 = 4294931717L << 32;
        long j24 = 4287532691L << 32;
        long j25 = 4293943145L << 32;
        auraColorsPaletteLight = new AuraColorsPalette(surfaceColors, borderColors, buttonColors, new TextAndIconColors(4279308562L << 32, jA042, jA043, jA044, j18, j13, j19, BaseColors.RED_750, j6, j13), new FeatureColors(j20, j21), new SemanticColors(j14, j22, 4280660313L << 32, j23, 4278223360L << 32, j24, j25));
        long j26 = 4280229663L << 32;
        long j27 = BaseColors.GRAY_1050;
        long j28 = 4281611832L << 32;
        SurfaceColors surfaceColors2 = new SurfaceColors(4278519045L << 32, j26, j26, j27, j28, 4281151024L << 32, j5, HxS.A04(HDi.A0O[(int) (j6 & 63)], B6A.A03(j6), B6A.A02(j6), B6A.A01(j6), 0.2f), 2147483648L << 32, 452984831 << 32, 4280036147L << 32, 4281352779L << 32, j7, j27, j8, j9);
        BorderColors borderColors2 = new BorderColors(4279900698L << 32, j28, 536870911 << 32, j19, j12, j11, 268435455 << 32);
        long j29 = 4278222845L << 32;
        ButtonColors buttonColors2 = new ButtonColors(j13, j6, j29, 4293342538L << 32, j8);
        long j30 = 4294113279L << 32;
        long jA045 = HxS.A04(HDi.A0O[(int) (j30 & 63)], B6A.A03(j30), B6A.A02(j30), B6A.A01(j30), 0.6f);
        long j31 = 4294047487L << 32;
        long jA046 = HxS.A04(HDi.A0O[(int) (j31 & 63)], B6A.A03(j31), B6A.A02(j31), B6A.A01(j31), 0.4f);
        long j32 = 4293981951L << 32;
        long j33 = 4278250071L << 32;
        auraColorsPaletteDark = new AuraColorsPalette(surfaceColors2, borderColors2, buttonColors2, new TextAndIconColors(4294309365L << 32, jA045, jA046, HxS.A04(HDi.A0O[(int) (j32 & 63)], B6A.A03(j32), B6A.A02(j32), B6A.A01(j32), 0.3105f), j18, BaseColors.GRAY_1100, j19, BaseColors.RED_450, j6, j13), new FeatureColors(j20, j21), new SemanticColors(j29, j22, j33, j23, j33, j24, j25));
    }
}
