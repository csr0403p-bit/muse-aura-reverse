package X;

/* renamed from: X.BbX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2444BbX extends AbstractC2445BbY {
    public final Throwable A00;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2445BbY) {
            return this.A00.equals(((C2444BbX) ((AbstractC2445BbY) obj)).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode() ^ 1000003;
    }

    public final String toString() {
        return BV8.A0v(this.A00, C60O.A0x("ErrorWrapper{error="));
    }

    public C2444BbX(Throwable th) {
        if (th == null) {
            throw BV4.A0a("Null error");
        }
        this.A00 = th;
    }
}
