package X;

/* loaded from: classes5.dex */
public final class COA extends COS {
    public final long A00;

    public final boolean equals(Object obj) {
        return this == obj || (obj != null && getClass() == obj.getClass() && this.A00 == ((COA) obj).A00);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        COS cos = (COS) obj;
        int iA01 = A01();
        int iA012 = cos.A01();
        if (iA01 != iA012) {
            return iA01 - iA012;
        }
        long jAbs = Math.abs(this.A00);
        long jAbs2 = Math.abs(((COA) cos).A00);
        if (jAbs < jAbs2) {
            return -1;
        }
        return AnonymousClass002.A1N((jAbs > jAbs2 ? 1 : (jAbs == jAbs2 ? 0 : -1))) ? 1 : 0;
    }

    public final String toString() {
        return Long.toString(this.A00);
    }

    public COA(long j) {
        this.A00 = j;
    }

    public final int hashCode() {
        return BV7.A0D(Integer.valueOf(A01()), Long.valueOf(this.A00));
    }
}
