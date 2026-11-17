package X;

import com.facebook.aura.handoff.impl.HandoffLinkVerifier;
import com.facebook.aura.localbrowser.ManagedBrowserSitePolicy;
import java.util.Arrays;

/* renamed from: X.Gne, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10006Gne {
    public static final char[] A00;
    public static final int[] A01;
    public static final int[] A02;
    public static final int[] A03;
    public static final int[] A04;
    public static final int[] A05;
    public static final int[] A06;
    public static final int[] A07;
    public static final byte[] A08;
    public static final byte[] A09;
    public static final char[] A0A;
    public static final int[] A0B;
    public static final int[] A0C;

    static {
        int[] iArr;
        char[] charArray = HandoffLinkVerifier.HEX_DIGITS.toCharArray();
        A00 = charArray;
        char[] charArray2 = ManagedBrowserSitePolicy.HEX.toCharArray();
        A0A = charArray2;
        int length = charArray.length;
        byte[] bArr = new byte[length];
        A08 = bArr;
        byte[] bArr2 = new byte[length];
        A09 = bArr2;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = (byte) A00[i2];
            bArr2[i2] = (byte) charArray2[i2];
        }
        int[] iArr2 = new int[256];
        for (int i3 = 0; i3 < 32; i3++) {
            iArr2[i3] = -1;
        }
        iArr2[34] = 1;
        iArr2[92] = 1;
        A02 = iArr2;
        int[] iArr3 = new int[256];
        System.arraycopy(iArr2, 0, iArr3, 0, 256);
        int i4 = 128;
        loop2: while (true) {
            int i5 = -1;
            while (true) {
                iArr3[i4] = i5;
                i4++;
                if (i4 >= 256) {
                    break loop2;
                }
                if ((i4 & 224) != 192) {
                    if ((i4 & 240) != 224) {
                        i5 = 4;
                        if ((i4 & 248) != 240) {
                            break;
                        }
                    } else {
                        i5 = 3;
                    }
                } else {
                    i5 = 2;
                }
            }
        }
        A05 = iArr3;
        int[] iArr4 = new int[256];
        Arrays.fill(iArr4, -1);
        int i6 = 33;
        do {
            if (Character.isJavaIdentifierPart((char) i6)) {
                iArr4[i6] = 0;
            }
            i6++;
        } while (i6 < 256);
        iArr4[64] = 0;
        iArr4[35] = 0;
        iArr4[42] = 0;
        iArr4[45] = 0;
        iArr4[43] = 0;
        A04 = iArr4;
        int[] iArr5 = new int[256];
        System.arraycopy(iArr4, 0, iArr5, 0, 256);
        Arrays.fill(iArr5, 128, 128, 0);
        A06 = iArr5;
        int[] iArr6 = new int[256];
        int[] iArr7 = A05;
        System.arraycopy(iArr7, 128, iArr6, 128, 128);
        Arrays.fill(iArr6, 0, 32, -1);
        iArr6[9] = 0;
        iArr6[10] = 10;
        iArr6[13] = 13;
        iArr6[42] = 42;
        A03 = iArr6;
        int[] iArr8 = new int[256];
        System.arraycopy(iArr7, 128, iArr8, 128, 128);
        Arrays.fill(iArr8, 0, 32, -1);
        iArr8[32] = 1;
        iArr8[9] = 1;
        iArr8[10] = 10;
        iArr8[13] = 13;
        iArr8[47] = 47;
        iArr8[35] = 35;
        A0B = iArr8;
        int[] iArr9 = new int[128];
        int i7 = 0;
        do {
            iArr9[i7] = -1;
            i7++;
        } while (i7 < 32);
        iArr9[34] = 34;
        iArr9[92] = 92;
        iArr9[8] = 98;
        iArr9[9] = 116;
        iArr9[12] = 102;
        iArr9[10] = 110;
        iArr9[13] = 114;
        A07 = iArr9;
        int[] iArrCopyOf = Arrays.copyOf(iArr9, 128);
        A0C = iArrCopyOf;
        iArrCopyOf[47] = 47;
        int[] iArr10 = new int[256];
        A01 = iArr10;
        Arrays.fill(iArr10, -1);
        int i8 = 0;
        do {
            iArr = A01;
            iArr[i8 + 48] = i8;
            i8++;
        } while (i8 < 10);
        do {
            int i9 = i + 10;
            iArr[i + 97] = i9;
            iArr[i + 65] = i9;
            i++;
        } while (i < 6);
    }

    public static byte[] A00(boolean z) {
        return (byte[]) (z ? A08 : A09).clone();
    }

    public static char[] A01(boolean z) {
        return (char[]) (z ? A00 : A0A).clone();
    }

    public static int[] A02(int i, boolean z) {
        if (i == 34) {
            return z ? A0C : A07;
        }
        C10162GqX c10162GqX = C10162GqX.A02;
        if (!z) {
            int[][] iArr = c10162GqX.A00;
            int[] iArr2 = iArr[i];
            if (iArr2 != null) {
                return iArr2;
            }
            int[] iArrCopyOf = Arrays.copyOf(A07, 128);
            if (iArrCopyOf[i] == 0) {
                iArrCopyOf[i] = -1;
            }
            iArr[i] = iArrCopyOf;
            return iArrCopyOf;
        }
        int[][] iArr3 = c10162GqX.A01;
        int[] iArr4 = iArr3[i];
        if (iArr4 != null) {
            return iArr4;
        }
        int[][] iArr5 = c10162GqX.A00;
        int[] iArrCopyOf2 = iArr5[i];
        if (iArrCopyOf2 == null) {
            iArrCopyOf2 = Arrays.copyOf(A07, 128);
            if (iArrCopyOf2[i] == 0) {
                iArrCopyOf2[i] = -1;
            }
            iArr5[i] = iArrCopyOf2;
        }
        iArrCopyOf2[47] = 47;
        iArr3[i] = iArrCopyOf2;
        return iArrCopyOf2;
    }
}
