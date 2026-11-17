package X;

import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;

/* loaded from: classes4.dex */
public final class B6A {
    public final long A00;
    public static final long A01 = 4278190080L << 32;
    public static final long A03 = 4287137928L << 32;
    public static final long A04 = 4291611852L << 32;
    public static final long A08 = 4294967295L << 32;
    public static final long A05 = 4294901760L << 32;
    public static final long A02 = 4278190335L << 32;
    public static final long A09 = 4294967040L << 32;
    public static final long A06 = 0 << 32;
    public static final long A07 = HxS.A04(HDi.A0J, 0.0f, 0.0f, 0.0f, 0.0f);

    public static final float A00(long j) {
        float f;
        float f2;
        if ((63 & j) == 0) {
            f = (float) ((0.0d * 2048.0d) + ((j >>> 56) & 255 & 2047));
            f2 = 255.0f;
        } else {
            f = (float) ((0.0d * 2048.0d) + ((j >>> 6) & 1023 & 2047));
            f2 = 1023.0f;
        }
        return f / f2;
    }

    public static final float A01(long j) {
        int i;
        int i2;
        if ((63 & j) == 0) {
            return ((float) ((0.0d * 2048.0d) + (((j >>> 32) & 255) & 2047))) / 255.0f;
        }
        short s = (short) ((j >>> 16) & 65535);
        int i3 = 32768 & s;
        int i4 = ((65535 & s) >>> 10) & 31;
        int i5 = s & 1023;
        if (i4 != 0) {
            i = i5 << 13;
            if (i4 == 31) {
                if (i != 0) {
                    i |= 4194304;
                }
                i2 = 255;
            } else {
                i2 = i4 + HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            }
        } else {
            if (i5 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i5 + 1056964608) - B6D.A00;
                return i3 != 0 ? -fIntBitsToFloat : fIntBitsToFloat;
            }
            i2 = 0;
            i = 0;
        }
        return Float.intBitsToFloat((i2 << 23) | (i3 << 16) | i);
    }

    public static final float A02(long j) {
        int i;
        int i2;
        if ((63 & j) == 0) {
            return ((float) ((0.0d * 2048.0d) + (((j >>> 40) & 255) & 2047))) / 255.0f;
        }
        short s = (short) ((j >>> 32) & 65535);
        int i3 = 32768 & s;
        int i4 = ((65535 & s) >>> 10) & 31;
        int i5 = s & 1023;
        if (i4 != 0) {
            i = i5 << 13;
            if (i4 == 31) {
                if (i != 0) {
                    i |= 4194304;
                }
                i2 = 255;
            } else {
                i2 = i4 + HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            }
        } else {
            if (i5 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i5 + 1056964608) - B6D.A00;
                return i3 != 0 ? -fIntBitsToFloat : fIntBitsToFloat;
            }
            i2 = 0;
            i = 0;
        }
        return Float.intBitsToFloat((i2 << 23) | (i3 << 16) | i);
    }

    public static final float A03(long j) {
        int i;
        int i2;
        long j2 = 63 & j;
        long j3 = j >>> 48;
        if (j2 == 0) {
            return ((float) ((0.0d * 2048.0d) + ((j3 & 255) & 2047))) / 255.0f;
        }
        short s = (short) (j3 & 65535);
        int i3 = 32768 & s;
        int i4 = ((65535 & s) >>> 10) & 31;
        int i5 = s & 1023;
        if (i4 != 0) {
            i = i5 << 13;
            if (i4 == 31) {
                if (i != 0) {
                    i |= 4194304;
                }
                i2 = 255;
            } else {
                i2 = i4 + HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            }
        } else {
            if (i5 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i5 + 1056964608) - B6D.A00;
                return i3 != 0 ? -fIntBitsToFloat : fIntBitsToFloat;
            }
            i2 = 0;
            i = 0;
        }
        return Float.intBitsToFloat((i2 << 23) | (i3 << 16) | i);
    }

    public static final long A05(Hw7 hw7, long j) {
        HDj hDjA06;
        Hw7 hw72 = HDi.A0O[(int) (j & 63)];
        int i = hw72.A00;
        int i2 = hw7.A00;
        if ((i | i2) < 0) {
            hDjA06 = A06(hw72, hw7);
        } else {
            Ab2<HDj> ab2 = B6B.A00;
            int i3 = i | (i2 << 6);
            HDj hDjA04 = ab2.A04(i3);
            if (hDjA04 == null) {
                hDjA04 = A06(hw72, hw7);
                ab2.A0B(i3, hDjA04);
            }
            hDjA06 = hDjA04;
        }
        return hDjA06.A01(j);
    }

    public static final HDj A06(Hw7 hw7, Hw7 hw72) {
        if (hw7 == hw72) {
            return new B6C(hw7);
        }
        long j = hw7.A01;
        long j2 = AbstractC10598Hxv.A01;
        return (j == j2 && hw72.A01 == j2) ? new HDk((C10376HDg) hw7, (C10376HDg) hw72) : new HDj(hw7, hw72);
    }

    public static String A07(long j) {
        StringBuilder sbA0x = C60O.A0x("Color(");
        sbA0x.append(A03(j));
        sbA0x.append(", ");
        sbA0x.append(A02(j));
        sbA0x.append(", ");
        sbA0x.append(A01(j));
        sbA0x.append(", ");
        sbA0x.append(A00(j));
        sbA0x.append(", ");
        sbA0x.append(HDi.A0O[(int) (j & 63)].A02);
        return AnonymousClass006.A0z(sbA0x);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof B6A) && this.A00 == ((B6A) obj).A00;
    }

    public final int hashCode() {
        return AnonymousClass002.A0A(this.A00);
    }

    public final String toString() {
        return A07(this.A00);
    }

    public /* synthetic */ B6A(long j) {
        this.A00 = j;
    }
}
