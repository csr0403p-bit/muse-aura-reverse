package X;

/* loaded from: classes5.dex */
public final class DaX implements InterfaceC5167Dax {
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof DaX) && this.A00 == ((DaX) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return FGI.A0I("ListIndex(value=", this.A00, ")");
    }

    public DaX(int i) {
        this.A00 = i;
    }
}
