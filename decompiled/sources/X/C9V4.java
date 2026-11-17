package X;

/* renamed from: X.9V4, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9V4 extends C06G {
    public final double A00;
    public final double A01;

    /* JADX WARN: Illegal instructions before constructor call */
    public C9V4() {
        double d = 0.0d;
        this(null, d, d, 3);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9V4) {
                C9V4 c9v4 = (C9V4) obj;
                if (Double.compare(this.A01, c9v4.A01) != 0 || Double.compare(this.A00, c9v4.A00) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass002.A0A(Double.doubleToLongBits(this.A01)) * 31) + AnonymousClass002.A0A(Double.doubleToLongBits(this.A00));
    }

    public /* synthetic */ C9V4(C06H c06h, double d, double d2, int i) {
        this.A01 = 2.0d;
        this.A00 = 22.0d;
    }
}
