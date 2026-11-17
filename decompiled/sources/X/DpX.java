package X;

import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;

/* loaded from: classes5.dex */
public final class DpX {
    public static final DpX A02;
    public static final DpX A03;
    public static final DpX A04;
    public static final DpX A05;
    public static final DpX A06;
    public final long A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                DpX dpX = (DpX) obj;
                if (this.A01 != dpX.A01 || this.A00 != dpX.A00) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        DpX dpX = new DpX(0L, 0L);
        A04 = dpX;
        A02 = new DpX(LinkEncryptedPairingKt.LINK_COUNTER_MAX, LinkEncryptedPairingKt.LINK_COUNTER_MAX);
        A06 = new DpX(LinkEncryptedPairingKt.LINK_COUNTER_MAX, 0L);
        A05 = new DpX(0L, LinkEncryptedPairingKt.LINK_COUNTER_MAX);
        A03 = dpX;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long A00(long r12, long r14, long r16) {
        /*
            r11 = this;
            long r5 = r11.A01
            r9 = 0
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 != 0) goto Lf
            long r1 = r11.A00
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 != 0) goto Lf
        Le:
            return r12
        Lf:
            r0 = r12
            long r3 = r12 - r5
            long r5 = r5 ^ r12
            long r12 = r12 ^ r3
            long r12 = r12 & r5
            int r2 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r2 >= 0) goto L54
            r12 = -9223372036854775808
        L1b:
            long r5 = r11.A00
            long r7 = r0 + r5
            long r3 = r0 ^ r7
            long r5 = r5 ^ r7
            long r3 = r3 & r5
            int r2 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r2 >= 0) goto L2c
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L2c:
            r6 = 1
            int r2 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r2 > 0) goto L36
            int r2 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            r5 = 1
            if (r2 <= 0) goto L37
        L36:
            r5 = 0
        L37:
            r3 = r16
            int r2 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r2 > 0) goto L52
            int r2 = (r16 > r7 ? 1 : (r16 == r7 ? 0 : -1))
            if (r2 > 0) goto L52
        L41:
            if (r5 == 0) goto L56
            if (r6 == 0) goto L51
            long r5 = X.BV6.A0J(r14, r0)
            long r1 = X.BV6.A0J(r3, r0)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L58
        L51:
            return r14
        L52:
            r6 = 0
            goto L41
        L54:
            r12 = r3
            goto L1b
        L56:
            if (r6 == 0) goto Le
        L58:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DpX.A00(long, long, long):long");
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }

    public DpX(long j, long j2) {
        C1G.A07(C8j3.A1Q((j > 0L ? 1 : (j == 0L ? 0 : -1))));
        C1G.A07(j2 >= 0);
        this.A01 = j;
        this.A00 = j2;
    }
}
