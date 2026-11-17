package X;

import androidx.media3.common.util.Util;
import com.facebook.forker.Process;
import java.math.RoundingMode;

/* loaded from: classes5.dex */
public final class E26 implements InterfaceC6418E4u {
    public final E23 A00;
    public final int A01;
    public final long A02;
    public final long A03;

    public E26(long j, long j2, long j3) {
        this.A00 = new E23(new long[]{j2}, new long[]{0}, j);
        this.A03 = j2;
        this.A02 = j3;
        int i = Process.WAIT_RESULT_STOPPED;
        if (j != -9223372036854775807L) {
            long jA0F = Util.A0F(RoundingMode.HALF_UP, j2 - j3, 8L, j);
            if (jA0F > 0 && jA0F <= 2147483647L) {
                i = (int) jA0F;
            }
        }
        this.A01 = i;
    }

    public final boolean A00(long j) {
        C6316E0o c6316E0o = this.A00.A02;
        int i = c6316E0o.A00;
        return i != 0 && j - c6316E0o.A00(i - 1) < 100000;
    }

    @Override // X.InterfaceC6418E4u
    public final int ACf() {
        return this.A01;
    }

    @Override // X.InterfaceC6418E4u
    public final long AEb() {
        return this.A02;
    }

    @Override // X.InterfaceC6418E4u
    public final long AEc() {
        return this.A03;
    }

    @Override // X.InterfaceC5509Djl
    public final long AEy() {
        return this.A00.A00;
    }

    @Override // X.InterfaceC5509Djl
    public final DkQ AK7(long j) {
        return this.A00.AK7(j);
    }

    @Override // X.InterfaceC6418E4u
    public final long ALf(long j) {
        return this.A00.A00(j);
    }

    @Override // X.InterfaceC5509Djl
    public final boolean isSeekable() {
        return this.A00.isSeekable();
    }
}
