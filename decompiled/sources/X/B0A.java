package X;

/* loaded from: classes4.dex */
public final class B0A {
    public final int A00;

    public final boolean equals(Object obj) {
        return (obj instanceof B0A) && this.A00 == ((B0A) obj).A00;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        int i = this.A00;
        return i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid";
    }
}
