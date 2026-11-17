package X;

import androidx.media3.common.util.Util;
import java.math.RoundingMode;

/* loaded from: classes5.dex */
public final class E4A implements InterfaceC5509Djl {
    public final int A00;
    public final long A01;
    public final C6403E4f A02;
    public final long A03;
    public final long A04;

    @Override // X.InterfaceC5509Djl
    public final long AEy() {
        return this.A01;
    }

    @Override // X.InterfaceC5509Djl
    public final DkQ AK7(long j) {
        C6403E4f c6403E4f = this.A02;
        long j2 = c6403E4f.A03;
        long j3 = this.A00;
        long j4 = this.A03 - 1;
        long jA0J = BV8.A0J((j2 * j) / (j3 * 1000000), j4);
        long j5 = this.A04;
        long j6 = c6403E4f.A01;
        RoundingMode roundingMode = RoundingMode.DOWN;
        long jA0F = Util.A0F(roundingMode, jA0J * j3, 1000000L, j2);
        E29 e29 = new E29(jA0F, j5 + (j6 * jA0J));
        if (jA0F >= j || jA0J == j4) {
            return new DkQ(e29, e29);
        }
        long j7 = jA0J + 1;
        return DkQ.A00(e29, Util.A0F(roundingMode, j7 * j3, 1000000L, j2), j5 + (j6 * j7));
    }

    @Override // X.InterfaceC5509Djl
    public final boolean isSeekable() {
        return true;
    }

    public E4A(C6403E4f c6403E4f, int i, long j, long j2) {
        this.A02 = c6403E4f;
        this.A00 = i;
        this.A04 = j;
        long j3 = (j2 - j) / c6403E4f.A01;
        this.A03 = j3;
        this.A01 = BV8.A0I(j3 * i, c6403E4f.A03);
    }
}
