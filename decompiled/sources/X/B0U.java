package X;

/* loaded from: classes4.dex */
public final class B0U {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    static {
        new B0U(0, 0, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (getClass().equals(obj != null ? obj.getClass() : null)) {
                C7384Etj.A0Z(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
                B0U b0u = (B0U) obj;
                if (this.A01 != b0u.A01 || this.A03 != b0u.A03 || this.A02 != b0u.A02 || this.A00 != b0u.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.A01 * 31) + this.A03) * 31) + this.A02) * 31) + this.A00;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Bounds { [");
        sbA0x.append(this.A01);
        sbA0x.append(',');
        sbA0x.append(this.A03);
        sbA0x.append(',');
        sbA0x.append(this.A02);
        sbA0x.append(',');
        sbA0x.append(this.A00);
        return AnonymousClass001.A0v("] }", sbA0x);
    }

    public B0U(int i, int i2, int i3, int i4) {
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
        if (i > i3) {
            throw C8j3.A0v("Left must be less than or equal to right, left: ", ", right: ", i, i3);
        }
        if (i2 > i4) {
            throw C8j3.A0v("top must be less than or equal to bottom, top: ", ", bottom: ", i2, i4);
        }
    }
}
