package X;

/* renamed from: X.GdV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9673GdV {
    public final int A00;
    public final Class<?> A01;
    public final AbstractC9870GjI[] A02;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj != null && obj.getClass() == getClass()) {
                C9673GdV c9673GdV = (C9673GdV) obj;
                if (this.A00 == c9673GdV.A00 && this.A01 == c9673GdV.A01) {
                    AbstractC9870GjI[] abstractC9870GjIArr = c9673GdV.A02;
                    AbstractC9870GjI[] abstractC9870GjIArr2 = this.A02;
                    int length = abstractC9870GjIArr2.length;
                    if (length == abstractC9870GjIArr.length) {
                        for (int i = 0; i < length; i++) {
                            if (C6xC.A00(abstractC9870GjIArr2[i], abstractC9870GjIArr[i])) {
                            }
                        }
                    }
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
        return FGI.A0M(this.A01.getName(), "<>");
    }

    public C9673GdV(Class<?> cls, AbstractC9870GjI[] abstractC9870GjIArr, int i) {
        this.A01 = cls;
        this.A02 = abstractC9870GjIArr;
        this.A00 = AnonymousClass005.A0E(cls) + i;
    }
}
