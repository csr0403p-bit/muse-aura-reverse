package X;

import com.facebook.aura.installsource.AuraInstallSourceDetector;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class FIH {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ FIH[] A01;
    public static final FIH A02;
    public static final FIH A03;
    public static final FIH A04;
    public static final FIH A05;
    public static final FIH A06;
    public static final FIH A07;
    public static final FIH A08;
    public static final FIH A09;
    public static final FIH A0A;
    public static final FIH A0B;
    public static final FIH A0C;
    public static final FIH A0D;
    public static final FIH A0E;

    static {
        FIH fih = new FIH("TEXT", 0);
        A0C = fih;
        FIH fih2 = new FIH("NUMBER", 1);
        A08 = fih2;
        FIH fih3 = new FIH("EMAIL", 2);
        A07 = fih3;
        FIH fih4 = new FIH("PHONE", 3);
        A0B = fih4;
        FIH fih5 = new FIH("PASSWORD", 4);
        A0A = fih5;
        FIH fih6 = new FIH("PASSCODE", 5);
        A09 = fih6;
        FIH fih7 = new FIH("AMOUNT", 6);
        A02 = fih7;
        FIH fih8 = new FIH("DATE", 7);
        A06 = fih8;
        FIH fih9 = new FIH("CAP_WORDS", 8);
        A05 = fih9;
        FIH fih10 = new FIH("CAP_SENTENCES", 9);
        A04 = fih10;
        FIH fih11 = new FIH("CAP_LETTERS", 10);
        A03 = fih11;
        FIH fih12 = new FIH("TEXT_NO_SUGGESTIONS", 11);
        A0D = fih12;
        FIH fih13 = new FIH("URL", 12);
        A0E = fih13;
        FIH[] fihArr = {fih, fih2, fih3, fih4, fih5, fih6, fih7, fih8, fih9, fih10, fih11, fih12, fih13};
        A01 = fihArr;
        A00 = C3cG.A0w(fihArr);
    }

    public static FIH valueOf(String str) {
        return (FIH) Enum.valueOf(FIH.class, str);
    }

    public static FIH[] values() {
        return (FIH[]) A01.clone();
    }

    public final int A00() {
        switch (ordinal()) {
            case 0:
                return 131073;
            case 1:
                return 2;
            case 2:
                return 33;
            case 3:
                return 3;
            case 4:
                return AuraInstallSourceDetector.SYSTEM_IMAGE_FLAGS;
            case 5:
                return 18;
            case 6:
                return 12290;
            case 7:
                return 20;
            case 8:
                return 139265;
            case 9:
                return 180225;
            case 10:
                return 135169;
            case 11:
                return 655361;
            case 12:
                return 17;
            default:
                throw C3cG.A0q();
        }
    }

    public FIH(String str, int i) {
    }
}
