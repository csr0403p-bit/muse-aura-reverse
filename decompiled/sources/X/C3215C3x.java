package X;

/* renamed from: X.C3x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3215C3x {
    public final int A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3215C3x) {
            C3215C3x c3215C3x = (C3215C3x) obj;
            if (this.A00 == c3215C3x.A00) {
                return this.A01.equals(c3215C3x.A01);
            }
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass001.A0G(this.A01) + this.A00;
    }

    public C3215C3x(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }
}
