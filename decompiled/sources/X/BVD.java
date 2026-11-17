package X;

/* loaded from: classes5.dex */
public final class BVD {
    public int A00;
    public int A01;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public volatile boolean A09 = true;
    public volatile long A08 = Long.MIN_VALUE;
    public long A03 = -9223372036854775807L;
    public long A02 = -9223372036854775807L;

    /* JADX WARN: Removed duplicated region for block: B:8:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(X.BVD r2) {
        /*
            boolean r0 = r2.A05
            if (r0 != 0) goto Ld
            boolean r0 = r2.A04
            if (r0 == 0) goto Ld
            boolean r1 = r2.A06
            r0 = 0
            if (r1 != 0) goto Le
        Ld:
            r0 = 1
        Le:
            r2.A09 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BVD.A00(X.BVD):void");
    }

    public final void A01() {
        if (this.A09) {
            return;
        }
        synchronized (this) {
            if (!this.A09) {
                this.A07 = true;
                this.A03 = -9223372036854775807L;
                this.A02 = -9223372036854775807L;
            }
        }
    }

    public final void A02(long j) {
        if (this.A09) {
            if (j < this.A08) {
                this.A08 = Long.MIN_VALUE;
                return;
            }
            return;
        }
        synchronized (this) {
            if (!this.A09 && this.A07) {
                long j2 = this.A03;
                if (j2 == -9223372036854775807L || j < j2) {
                    this.A03 = j;
                    this.A02 = -9223372036854775807L;
                } else if (this.A02 == -9223372036854775807L && j > j2) {
                    this.A02 = j;
                }
            }
        }
    }
}
