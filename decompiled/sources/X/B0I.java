package X;

/* loaded from: classes4.dex */
public final class B0I {
    public final int A00;

    public final boolean equals(Object obj) {
        return (obj instanceof B0I) && this.A00 == ((B0I) obj).A00;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        int i = this.A00;
        return i == 0 ? "None" : i == 1 ? "Weight" : i == 2 ? "Style" : i == 65535 ? "All" : "Invalid";
    }
}
