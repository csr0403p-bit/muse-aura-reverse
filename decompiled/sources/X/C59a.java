package X;

/* renamed from: X.59a, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C59a extends C06G {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59a) {
                C59a c59a = (C59a) obj;
                if (this.A00 != c59a.A00 || this.A01 != c59a.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01;
    }

    public C59a(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }
}
