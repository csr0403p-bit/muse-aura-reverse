package X;

/* renamed from: X.Aki, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1529Aki {
    public final int A00;

    public static String A00(int i) {
        return i == 1 ? "Next" : i == 2 ? "Previous" : i == 3 ? "Left" : i == 4 ? "Right" : i == 5 ? "Up" : i == 6 ? "Down" : i == 7 ? "Enter" : i == 8 ? "Exit" : "Invalid FocusDirection";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1529Aki) && this.A00 == ((C1529Aki) obj).A00;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return A00(this.A00);
    }
}
