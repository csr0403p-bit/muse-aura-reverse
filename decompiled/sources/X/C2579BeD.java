package X;

/* renamed from: X.BeD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2579BeD extends AbstractC2534BdL {
    public final int A00;
    public final Throwable A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC2534BdL) {
                C2579BeD c2579BeD = (C2579BeD) ((AbstractC2534BdL) obj);
                if (this.A00 == c2579BeD.A00) {
                    Throwable th = this.A01;
                    Throwable th2 = c2579BeD.A01;
                    if (th == null) {
                        if (th2 == null) {
                        }
                    } else if (th.equals(th2)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.A00 ^ 1000003) * 1000003) ^ AnonymousClass006.A0D(this.A01);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("StateError{code=");
        sbA0x.append(this.A00);
        sbA0x.append(", cause=");
        return BV8.A0v(this.A01, sbA0x);
    }

    public C2579BeD(int i, Throwable th) {
        this.A00 = i;
        this.A01 = th;
    }
}
