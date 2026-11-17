package X;

/* renamed from: X.Agx, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1312Agx {
    public final int A00;

    public static String A00(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1312Agx) && this.A00 == ((C1312Agx) obj).A00;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return A00(this.A00);
    }
}
