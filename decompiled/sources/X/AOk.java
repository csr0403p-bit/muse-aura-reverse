package X;

import java.util.Iterator;

/* loaded from: classes4.dex */
public class AOk implements Iterable<Long>, BOA {
    public final long A00;
    public final long A01;
    public final long A02;

    public boolean equals(Object obj) {
        if (!(obj instanceof AOk)) {
            return false;
        }
        if (isEmpty() && ((AOk) obj).isEmpty()) {
            return true;
        }
        AOk aOk = (AOk) obj;
        return this.A00 == aOk.A00 && this.A01 == aOk.A01 && this.A02 == aOk.A02;
    }

    public final boolean isEmpty() {
        if (this instanceof C07739il) {
            return AnonymousClass002.A1N((this.A00 > this.A01 ? 1 : (this.A00 == this.A01 ? 0 : -1)));
        }
        long j = this.A02;
        long j2 = this.A00;
        long j3 = this.A01;
        return j > 0 ? j2 > j3 : j2 < j3;
    }

    @Override // java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator<Long> iterator() {
        return new C3015Bs0(this.A00, this.A01, this.A02);
    }

    public String toString() {
        long j = this.A02;
        long j2 = this.A00;
        StringBuilder sbA0w = C60O.A0w();
        if (j > 0) {
            sbA0w.append(j2);
            sbA0w.append("..");
            sbA0w.append(this.A01);
            sbA0w.append(" step ");
        } else {
            sbA0w.append(j2);
            sbA0w.append(" downTo ");
            sbA0w.append(this.A01);
            sbA0w.append(" step ");
            j = -j;
        }
        sbA0w.append(j);
        return sbA0w.toString();
    }

    public AOk(long j, long j2, long j3) {
        this.A00 = j;
        if (j3 > 0) {
            if (j < j2) {
                long j4 = j2 % j3;
                long j5 = j % j3;
                long j6 = ((j4 < 0 ? j4 + j3 : j4) - (j5 < 0 ? j5 + j3 : j5)) % j3;
                j2 -= j6 < 0 ? j6 + j3 : j6;
            }
        } else {
            if (j3 >= 0) {
                throw C60O.A0i("Step is zero.");
            }
            if (j > j2) {
                long j7 = -j3;
                long j8 = j % j7;
                long j9 = j2 % j7;
                long j10 = ((j8 < 0 ? j8 + j7 : j8) - (j9 < 0 ? j9 + j7 : j9)) % j7;
                j2 += j10 < 0 ? j10 + j7 : j10;
            }
        }
        this.A01 = j2;
        this.A02 = j3;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return C8j4.A0B(this.A02, AnonymousClass006.A06(this.A01, AnonymousClass005.A07(this.A00)));
    }
}
