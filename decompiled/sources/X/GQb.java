package X;

/* loaded from: classes6.dex */
public final class GQb extends C06G implements InterfaceC05673vm {
    public final long A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof GQb) && this.A00 == ((GQb) obj).A00);
    }

    public final int hashCode() {
        return AnonymousClass002.A0A(this.A00);
    }

    public final String toString() {
        return FGI.A0J("Connected(callConnectedTimestampMs=", this.A00, ")");
    }

    public GQb(long j) {
        this.A00 = j;
    }
}
