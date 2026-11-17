package X;

/* renamed from: X.1YL, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1YL {
    public final int A00;

    public static C1YL A00() {
        return new C1YL(3);
    }

    public static String A01(int i) {
        return i == 1 ? "Left" : i == 2 ? "Right" : i == 3 ? "Center" : i == 4 ? "Justify" : i == 5 ? "Start" : i == 6 ? "End" : i == 0 ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1YL) && this.A00 == ((C1YL) obj).A00;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return A01(this.A00);
    }

    public /* synthetic */ C1YL(int i) {
        this.A00 = i;
    }
}
