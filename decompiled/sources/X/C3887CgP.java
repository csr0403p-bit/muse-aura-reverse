package X;

/* renamed from: X.CgP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3887CgP extends AbstractC3927Ch8 {
    public final long A00;

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof AbstractC3927Ch8) && this.A00 == ((C3887CgP) ((AbstractC3927Ch8) obj)).A00);
    }

    public final int hashCode() {
        return 1000003 ^ AnonymousClass002.A0A(this.A00);
    }

    public final String toString() {
        return FGI.A0J("LogResponse{nextRequestWaitMillis=", this.A00, "}");
    }

    public C3887CgP(long j) {
        this.A00 = j;
    }
}
