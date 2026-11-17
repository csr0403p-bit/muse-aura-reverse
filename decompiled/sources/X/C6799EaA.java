package X;

import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;

/* renamed from: X.EaA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6799EaA {
    public int A00;
    public final byte[] A01 = new byte[24];

    public static void A01(C6799EaA c6799EaA, int i) {
        byte[] bArr = c6799EaA.A01;
        int i2 = c6799EaA.A00 + 1;
        c6799EaA.A00 = i2;
        bArr[i2] = (byte) i;
    }

    public static void A03(C6799EaA c6799EaA, int i) {
        byte[] bArr = c6799EaA.A01;
        int i2 = c6799EaA.A00 + 1;
        c6799EaA.A00 = i2;
        bArr[i2] = (byte) (i + 48);
    }

    public static void A04(C6799EaA c6799EaA, int i) {
        int i2;
        byte b;
        if (i != 0) {
            A02(c6799EaA, i);
        }
        while (true) {
            byte[] bArr = c6799EaA.A01;
            i2 = c6799EaA.A00;
            b = bArr[i2];
            if (b != 48) {
                break;
            } else {
                c6799EaA.A00 = i2 - 1;
            }
        }
        if (b == 46) {
            c6799EaA.A00 = i2 + 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A05(X.C6799EaA r27, int r28, int r29, long r30) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6799EaA.A05(X.EaA, int, int, long):void");
    }

    public static long A00(long j, long j2, long j3) {
        long jA00 = ((j * j3) >>> 1) + AbstractC6801EaC.A00(j2, j3);
        return (AbstractC6801EaC.A00(j, j3) + (jA00 >>> 63)) | (((jA00 & LinkEncryptedPairingKt.LINK_COUNTER_MAX) + LinkEncryptedPairingKt.LINK_COUNTER_MAX) >>> 63);
    }

    public static void A02(C6799EaA c6799EaA, int i) {
        int iA01 = BV8.A01(i);
        int i2 = 0;
        do {
            int i3 = iA01 * 10;
            A03(c6799EaA, i3 >>> 28);
            iA01 = i3 & 268435455;
            i2++;
        } while (i2 < 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A06(X.C6799EaA r8, int r9, long r10) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6799EaA.A06(X.EaA, int, long):void");
    }
}
