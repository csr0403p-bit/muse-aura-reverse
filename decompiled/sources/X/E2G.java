package X;

import android.util.Pair;
import androidx.media3.common.util.Util;
import com.facebook.forker.Process;

/* loaded from: classes5.dex */
public final class E2G implements InterfaceC6418E4u {
    public final long A00;
    public final long[] A01;
    public final long[] A02;

    /* JADX WARN: Incorrect types in method signature: (J[J[J)Landroid/util/Pair<Ljava/lang/Long;Ljava/lang/Long;>; */
    public static Pair A00(long[] jArr, long[] jArr2, long j) {
        Long lValueOf;
        Long lValueOf2;
        int iA08 = Util.A08(jArr, j, true);
        long j2 = jArr[iA08];
        long j3 = jArr2[iA08];
        int i = iA08 + 1;
        if (i == jArr.length) {
            lValueOf = Long.valueOf(j2);
            lValueOf2 = Long.valueOf(j3);
        } else {
            long j4 = ((long) ((jArr[i] == j2 ? 0.0d : (j - j2) / (r4 - j2)) * (jArr2[i] - j3))) + j3;
            lValueOf = Long.valueOf(j);
            lValueOf2 = Long.valueOf(j4);
        }
        return Pair.create(lValueOf, lValueOf2);
    }

    @Override // X.InterfaceC6418E4u
    public final long AEb() {
        return -1L;
    }

    @Override // X.InterfaceC6418E4u
    public final long AEc() {
        return 0L;
    }

    @Override // X.InterfaceC5509Djl
    public final long AEy() {
        return this.A00;
    }

    @Override // X.InterfaceC5509Djl
    public final DkQ AK7(long j) {
        Pair pairA00 = A00(this.A02, this.A01, Util.A0B(BV8.A0J(j, this.A00)));
        E29 e29 = new E29(Util.A0A(C3cG.A05(pairA00.first)), BV7.A0T(pairA00));
        return new DkQ(e29, e29);
    }

    @Override // X.InterfaceC6418E4u
    public final long ALf(long j) {
        return Util.A0A(BV7.A0T(A00(this.A01, this.A02, j)));
    }

    @Override // X.InterfaceC5509Djl
    public final boolean isSeekable() {
        return true;
    }

    public E2G(long[] jArr, long[] jArr2, long j) {
        this.A01 = jArr;
        this.A02 = jArr2;
        this.A00 = j == -9223372036854775807L ? Util.A0A(jArr2[jArr2.length - 1]) : j;
    }

    @Override // X.InterfaceC6418E4u
    public final int ACf() {
        return Process.WAIT_RESULT_STOPPED;
    }
}
