package X;

/* loaded from: classes6.dex */
public final class GRC extends GRE {
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof GRC) && this.A00 == ((GRC) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return FGI.A0I("Active(aiBotState=", this.A00, ")");
    }

    public GRC(int i) {
        this.A00 = i;
    }
}
