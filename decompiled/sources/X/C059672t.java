package X;

/* renamed from: X.72t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C059672t {
    public final int A00;
    public final int A01;
    public static final C059672t A04 = new C059672t(0, 0);
    public static final C059672t A03 = new C059672t(0, 1);
    public static final C059672t A02 = new C059672t(1, 1);

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (getClass().equals(obj != null ? obj.getClass() : null)) {
                C7384Etj.A0Z(obj, "null cannot be cast to non-null type androidx.glance.layout.Alignment");
                C059672t c059672t = (C059672t) obj;
                if (this.A00 != c059672t.A00 || this.A01 != c059672t.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Alignment(horizontal=");
        sbA0x.append((Object) FGI.A0G("Horizontal(value=", ')', this.A00));
        sbA0x.append(", vertical=");
        sbA0x.append((Object) FGI.A0G("Vertical(value=", ')', this.A01));
        sbA0x.append(')');
        return sbA0x.toString();
    }

    public C059672t(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }
}
