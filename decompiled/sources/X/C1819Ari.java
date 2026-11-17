package X;

/* renamed from: X.Ari, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1819Ari {
    public final int A00;

    public static String A00(int i) {
        return i == 1 ? "Ltr" : i == 2 ? "Rtl" : i == 3 ? "Content" : i == 4 ? "ContentOrLtr" : i == 5 ? "ContentOrRtl" : i == 0 ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1819Ari) && this.A00 == ((C1819Ari) obj).A00;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return A00(this.A00);
    }
}
