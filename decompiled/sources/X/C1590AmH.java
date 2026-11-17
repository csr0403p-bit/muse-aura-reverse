package X;

/* renamed from: X.AmH, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1590AmH implements InterfaceC1762AqF {
    public final int A00;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (getClass().equals(obj != null ? obj.getClass() : null)) {
                C7384Etj.A0Z(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
                if (this.A00 != ((C1590AmH) obj).A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return C8j4.A0w("AndroidPointerIcon(type=", this.A00);
    }

    public C1590AmH(int i) {
        this.A00 = i;
    }
}
