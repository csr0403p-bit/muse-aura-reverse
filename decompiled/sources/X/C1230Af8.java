package X;

import android.os.Trace;
import androidx.compose.ui.unit.Constraints;
import kotlin.Unit;

/* renamed from: X.Af8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1230Af8 implements Ac3, AfH, Ac6 {
    public long A00;
    public long A01;
    public long A02 = System.nanoTime() - AfJ.A00;
    public Af9 A03;
    public AfD A04;
    public AfC A05;
    public Constraints A06;
    public Object A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final int A0E;
    public final AfB A0F;
    public final InterfaceC1234AfO A0G;
    public final G0U<Ac6, Unit> A0H;
    public final /* synthetic */ C1227Af5 A0I;

    @Override // X.Ac3
    public final void AQ7() {
        this.A0B = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1230Af8(C1227Af5 c1227Af5, int i, AfB afB, InterfaceC1234AfO interfaceC1234AfO, G0U<? super Ac6, Unit> g0u) {
        this.A0I = c1227Af5;
        this.A0E = g0u;
        this.A0F = i;
        this.A0G = afB;
        this.A0H = interfaceC1234AfO;
    }

    private final boolean A01() {
        AfD afD;
        return this.A08 || ((afD = this.A04) != null && afD.isComplete());
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01f9 A[Catch: all -> 0x0336, TryCatch #0 {all -> 0x0336, blocks: (B:34:0x00aa, B:36:0x00ae, B:38:0x00b8, B:40:0x00be, B:41:0x00c6, B:48:0x00e3, B:190:0x032f, B:191:0x0335, B:42:0x00cc, B:43:0x00d0, B:45:0x00d6, B:47:0x00da, B:49:0x00e9, B:51:0x00f2, B:53:0x00f8, B:54:0x00fc, B:55:0x00ff, B:57:0x0105, B:58:0x0109, B:71:0x012c, B:73:0x0130, B:186:0x0315, B:83:0x015e, B:85:0x0162, B:87:0x0177, B:88:0x017c, B:187:0x031c, B:100:0x01aa, B:102:0x01b1, B:104:0x01c4, B:106:0x01cc, B:108:0x01d4, B:110:0x01dc, B:112:0x01e6, B:113:0x01e8, B:128:0x022a, B:114:0x01ea, B:115:0x01f1, B:117:0x01f9, B:119:0x0203, B:121:0x0207, B:123:0x020c, B:124:0x020e, B:126:0x0218, B:127:0x021f, B:146:0x0275, B:149:0x027d, B:150:0x0282, B:153:0x0289, B:155:0x028f, B:157:0x0296, B:189:0x0328), top: B:197:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A02(X.AfI r21) {
        /*
            Method dump skipped, instructions count: 831
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1230Af8.A02(X.AfI):boolean");
    }

    @Override // X.AfH
    public final boolean AAz(AfI afI) {
        boolean zA02;
        if (!this.A0I.A00) {
            return false;
        }
        if (this.A0B) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                zA02 = A02(afI);
            } finally {
                Trace.endSection();
            }
        } else {
            zA02 = A02(afI);
        }
        Trace.setCounter("compose:lazy:prefetch:execute:item", -1L);
        return zA02;
    }

    @Override // X.Ac3
    public final void cancel() {
        if (this.A09) {
            return;
        }
        this.A09 = true;
        AfD afD = this.A04;
        if (afD != null) {
            afD.cancel();
        }
        this.A04 = null;
        AfC afC = this.A05;
        if (afC != null) {
            afC.dispose();
        }
        this.A05 = null;
        this.A03 = null;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("HandleAndRequestImpl { index = ");
        sbA0x.append(this.A0E);
        sbA0x.append(", constraints = ");
        sbA0x.append(this.A06);
        sbA0x.append(", isComposed = ");
        sbA0x.append(A01());
        sbA0x.append(", isMeasured = ");
        sbA0x.append(this.A0A);
        sbA0x.append(", isCanceled = ");
        sbA0x.append(this.A09);
        return AnonymousClass001.A0v(" }", sbA0x);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C1230Af8 r15) {
        /*
            long r4 = java.lang.System.nanoTime()
            long r0 = X.AfJ.A00
            long r4 = r4 - r0
            long r6 = r15.A02
            X.F24 r8 = X.F24.A06
            r2 = 1
            long r9 = r6 - r2
            long r9 = r9 | r2
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 != 0) goto L5a
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L55
            r2 = 0
        L1f:
            r0 = 1
            long r6 = r2 >> r0
            int r0 = (int) r2
            r0 = r0 & 1
            if (r0 == 0) goto L35
            r1 = 9223372036854(0x8637bd05af6, double:4.5569512622224E-311)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L44
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L35:
            r15.A01 = r6
            long r1 = r15.A00
            long r1 = r1 - r6
            r15.A00 = r1
            r15.A02 = r4
            java.lang.String r0 = "compose:lazy:prefetch:available_time_nanos"
            android.os.Trace.setCounter(r0, r1)
            return
        L44:
            r1 = -9223372036854(0xfffff79c842fa50a, double:NaN)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L50
            r6 = -9223372036854775808
            goto L35
        L50:
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r6 = r6 * r0
            goto L35
        L55:
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            goto La7
        L5a:
            long r0 = r4 - r2
            long r9 = r2 | r0
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 != 0) goto L6e
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L6b
            long r2 = X.C0851A5x.A02
            goto L1f
        L6b:
            long r2 = X.C0851A5x.A01
            goto L1f
        L6e:
            long r0 = r4 - r6
            long r13 = r0 ^ r4
            long r11 = r0 ^ r6
            r9 = -1
            long r11 = r11 ^ r9
            long r13 = r13 & r11
            r11 = 0
            int r9 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r9 >= 0) goto Lba
            X.F24 r9 = X.F24.A04
            int r10 = r8.compareTo(r9)
            if (r10 >= 0) goto La5
            java.util.concurrent.TimeUnit r1 = r8.timeUnit
            java.util.concurrent.TimeUnit r0 = r9.timeUnit
            long r10 = r1.convert(r2, r0)
            long r2 = r4 / r10
            long r0 = r6 / r10
            long r2 = r2 - r0
            long r0 = r4 % r10
            long r6 = r6 % r10
            long r0 = r0 - r6
            long r2 = X.AbstractC0852A5y.A02(r9, r2)
            long r0 = X.AbstractC0852A5y.A02(r8, r0)
            long r2 = X.C0851A5x.A03(r2, r0)
            goto L1f
        La5:
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
        La7:
            if (r2 >= 0) goto Lb7
            long r6 = X.C0851A5x.A02
        Lab:
            r8 = 1
            long r0 = r6 >> r8
            long r2 = -r0
            int r0 = (int) r6
            r0 = r0 & 1
            long r2 = r2 << r8
            long r0 = (long) r0
            long r2 = r2 + r0
            goto L1f
        Lb7:
            long r6 = X.C0851A5x.A01
            goto Lab
        Lba:
            long r2 = X.AbstractC0852A5y.A02(r8, r0)
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1230Af8.A00(X.Af8):void");
    }
}
