package X;

/* renamed from: X.GdR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9669GdR {
    public AbstractC9870GjI A00;
    public Class<?> A01;
    public boolean A02;
    public int A03;

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (obj != this) {
                if (obj.getClass() == getClass()) {
                    C9669GdR c9669GdR = (C9669GdR) obj;
                    if (c9669GdR.A02 == this.A02) {
                        Class<?> cls = this.A01;
                        if (cls == null) {
                            return this.A00.equals(c9669GdR.A00);
                        }
                        if (c9669GdR.A01 == cls) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A03;
    }

    public final String toString() {
        StringBuilder sbA0x;
        Class<?> cls = this.A01;
        if (cls != null) {
            sbA0x = C60O.A0x("{class: ");
            BV6.A18(cls, sbA0x);
        } else {
            sbA0x = C60O.A0x("{type: ");
            sbA0x.append(this.A00);
        }
        sbA0x.append(", typed? ");
        sbA0x.append(this.A02);
        return AnonymousClass001.A0v("}", sbA0x);
    }

    public C9669GdR() {
    }

    public C9669GdR(Class<?> cls, boolean z) {
        this.A01 = cls;
        this.A00 = null;
        this.A02 = z;
        int iHashCode = cls.getName().hashCode();
        this.A03 = z ? iHashCode + 1 : iHashCode;
    }

    public C9669GdR(AbstractC9870GjI abstractC9870GjI, boolean z) {
        int i;
        this.A00 = abstractC9870GjI;
        this.A01 = null;
        this.A02 = z;
        int iHashCode = abstractC9870GjI.hashCode();
        if (z) {
            i = iHashCode - 2;
        } else {
            i = iHashCode - 1;
        }
        this.A03 = i;
    }
}
