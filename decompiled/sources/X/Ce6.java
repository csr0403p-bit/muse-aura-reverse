package X;

/* loaded from: classes5.dex */
public final class Ce6 {
    public final String A00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Ce6) {
            return this.A00.equals(((Ce6) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode() ^ 1000003;
    }

    public final String toString() {
        return FGI.A0U("Encoding{name=\"", this.A00, "\"}");
    }

    public Ce6(String str) {
        this.A00 = str;
    }
}
