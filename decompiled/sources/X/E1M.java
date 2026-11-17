package X;

import android.graphics.Color;

/* loaded from: classes5.dex */
public final class E1M {
    public final float A00;
    public final int A01;
    public final int A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public static boolean A02(String str) throws NumberFormatException {
        try {
            int i = Integer.parseInt(str);
            return i == 1 || i == -1;
        } catch (NumberFormatException e) {
            CNC.A06("SsaStyle", FGI.A0U("Failed to parse boolean value: '", str, "'"), e);
            return false;
        }
    }

    public static Integer A01(String str) {
        try {
            long j = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            C1G.A07(BV7.A1R((j > 4294967295L ? 1 : (j == 4294967295L ? 0 : -1))));
            return Integer.valueOf(Color.argb(DX6.A00(((j >> 24) & 255) ^ 255), DX6.A00(j & 255), DX6.A00((j >> 8) & 255), DX6.A00((j >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            CNC.A06("SsaStyle", FGI.A0U("Failed to parse color expression: '", str, "'"), e);
            return null;
        }
    }

    public E1M(Integer num, Integer num2, String str, float f, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A05 = str;
        this.A01 = i;
        this.A04 = num;
        this.A03 = num2;
        this.A00 = f;
        this.A06 = z;
        this.A07 = z2;
        this.A09 = z3;
        this.A08 = z4;
        this.A02 = i2;
    }

    public static int A00(String str) throws NumberFormatException {
        try {
            int i = Integer.parseInt(str.trim());
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return i;
            }
        } catch (NumberFormatException unused) {
        }
        CNC.A04("SsaStyle", FGI.A0M("Ignoring unknown alignment: ", str));
        return -1;
    }
}
