package X;

/* renamed from: X.FTp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8102FTp {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8102FTp) {
                C8102FTp c8102FTp = (C8102FTp) obj;
                int i = this.A00;
                if (i == c8102FTp.A00) {
                    if (i == 8) {
                        int i2 = this.A01;
                        int i3 = this.A02;
                        if (AbstractC7607F5u.A0B(i2, i3) != 1 || i2 != c8102FTp.A02 || i3 != c8102FTp.A01) {
                        }
                    }
                    if (this.A01 == c8102FTp.A01 && this.A02 == c8102FTp.A02) {
                        Object obj2 = this.A03;
                        Object obj3 = c8102FTp.A03;
                        if (obj2 != null) {
                            if (!obj2.equals(obj3)) {
                                return false;
                            }
                        } else if (obj3 != null) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A00 * 31) + this.A02) * 31) + this.A01;
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        AbstractC7609F5w.A1K(sbA0w, this);
        sbA0w.append("[");
        int i = this.A00;
        sbA0w.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sbA0w.append(",s:");
        sbA0w.append(this.A02);
        sbA0w.append("c:");
        sbA0w.append(this.A01);
        sbA0w.append(",p:");
        return BV8.A0u(this.A03, sbA0w);
    }
}
