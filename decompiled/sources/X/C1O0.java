package X;

/* renamed from: X.1O0, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1O0 implements C1O2 {
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || (obj != null && getClass() == obj.getClass() && this.A00 == ((C1O0) obj).A00);
    }

    public final int hashCode() {
        return this.A00 + 31;
    }

    public final String toString() {
        return FGI.A0Q("MultiLine(minHeightInLines=", ", maxHeightInLines=", ')', 1, this.A00);
    }

    public C1O0(int i) {
        this.A00 = i;
    }

    public C1O0() {
        this(Integer.MAX_VALUE);
    }
}
