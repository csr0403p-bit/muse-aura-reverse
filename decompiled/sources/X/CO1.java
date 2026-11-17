package X;

/* loaded from: classes5.dex */
public final class CO1 extends COS {
    public final boolean A00;

    public final boolean equals(Object obj) {
        return this == obj || (obj != null && getClass() == obj.getClass() && this.A00 == ((CO1) obj).A00);
    }

    public final int hashCode() {
        return BV7.A0D(7, Boolean.valueOf(this.A00));
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        COS cos = (COS) obj;
        int iA01 = cos.A01();
        if (7 != iA01) {
            return 7 - iA01;
        }
        return (true != this.A00 ? 20 : 21) - (true == ((CO1) cos).A00 ? 21 : 20);
    }

    public final String toString() {
        return Boolean.toString(this.A00);
    }

    public CO1(boolean z) {
        this.A00 = z;
    }
}
