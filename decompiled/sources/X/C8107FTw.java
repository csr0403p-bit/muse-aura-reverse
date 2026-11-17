package X;

/* renamed from: X.FTw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8107FTw {
    public long A00 = 0;
    public C8107FTw A01;

    private void A00() {
        if (this.A01 == null) {
            this.A01 = new C8107FTw();
        }
    }

    public final int A01(int i) {
        long j;
        long j2;
        C8107FTw c8107FTw = this.A01;
        if (c8107FTw == null) {
            j2 = this.A00;
            if (i >= 64) {
                return Long.bitCount(j2);
            }
            j = (1 << i) - 1;
        } else {
            if (i >= 64) {
                return c8107FTw.A01(i - 64) + Long.bitCount(this.A00);
            }
            j = this.A00;
            j2 = (1 << i) - 1;
        }
        return Long.bitCount(j & j2);
    }

    public final void A02() {
        this.A00 = 0L;
        C8107FTw c8107FTw = this.A01;
        if (c8107FTw != null) {
            c8107FTw.A02();
        }
    }

    public final void A03(int i) {
        if (i < 64) {
            this.A00 &= (1 << i) ^ (-1);
            return;
        }
        C8107FTw c8107FTw = this.A01;
        if (c8107FTw != null) {
            c8107FTw.A03(i - 64);
        }
    }

    public final void A04(int i) {
        if (i < 64) {
            this.A00 |= 1 << i;
        } else {
            A00();
            this.A01.A04(i - 64);
        }
    }

    public final void A05(int i, boolean z) {
        if (i >= 64) {
            A00();
            this.A01.A05(i - 64, z);
            return;
        }
        long j = this.A00;
        boolean zA1L = AnonymousClass002.A1L(((Long.MIN_VALUE & j) > 0L ? 1 : ((Long.MIN_VALUE & j) == 0L ? 0 : -1)));
        long j2 = (1 << i) - 1;
        this.A00 = ((j & (j2 ^ (-1))) << 1) | (j & j2);
        if (z) {
            A04(i);
        } else {
            A03(i);
        }
        if (zA1L || this.A01 != null) {
            A00();
            this.A01.A05(0, zA1L);
        }
    }

    public final boolean A06(int i) {
        if (i < 64) {
            return AnonymousClass002.A1L(((this.A00 & (1 << i)) > 0L ? 1 : ((this.A00 & (1 << i)) == 0L ? 0 : -1)));
        }
        A00();
        return this.A01.A06(i - 64);
    }

    public final boolean A07(int i) {
        if (i >= 64) {
            A00();
            return this.A01.A07(i - 64);
        }
        long j = 1 << i;
        long j2 = this.A00;
        boolean zA1L = AnonymousClass002.A1L(((j2 & j) > 0L ? 1 : ((j2 & j) == 0L ? 0 : -1)));
        long j3 = j2 & (j ^ (-1));
        this.A00 = j3;
        long j4 = j - 1;
        this.A00 = (j3 & j4) | Long.rotateRight((j4 ^ (-1)) & j3, 1);
        C8107FTw c8107FTw = this.A01;
        if (c8107FTw == null) {
            return zA1L;
        }
        if (c8107FTw.A06(0)) {
            A04(63);
        }
        this.A01.A07(0);
        return zA1L;
    }

    public final String toString() {
        C8107FTw c8107FTw = this.A01;
        return c8107FTw == null ? Long.toBinaryString(this.A00) : FGI.A0U(c8107FTw.toString(), "xx", Long.toBinaryString(this.A00));
    }
}
