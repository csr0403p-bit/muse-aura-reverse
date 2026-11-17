package X;

/* loaded from: classes5.dex */
public final class CY4 extends C06G {
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof CY4) && this.A00 == ((CY4) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return FGI.A0I("Key(value=", this.A00, ")");
    }

    public CY4(int i) {
        this.A00 = i;
    }
}
