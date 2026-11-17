package X;

/* renamed from: X.AkH, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1510AkH {
    public final int A00;

    public final boolean equals(Object obj) {
        return (obj instanceof C1510AkH) && this.A00 == ((C1510AkH) obj).A00;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return this.A00 == 1 ? "Touch" : "Keyboard";
    }
}
