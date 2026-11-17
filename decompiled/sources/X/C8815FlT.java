package X;

import java.util.AbstractCollection;

/* renamed from: X.FlT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8815FlT extends AbstractC8825Fld {
    public final float A00;
    public final float A01;

    public C8815FlT(float f, float f2) {
        super(false, false);
        this.A00 = f;
        this.A01 = f2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8815FlT) {
                C8815FlT c8815FlT = (C8815FlT) obj;
                if (Float.compare(this.A00, c8815FlT.A00) != 0 || Float.compare(this.A01, c8815FlT.A01) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public static void A00(AbstractCollection abstractCollection, float f, float f2) {
        abstractCollection.add(new C8815FlT(f, f2));
    }

    public final int hashCode() {
        return C8j4.A06(C8j4.A04(this.A00), this.A01);
    }

    public final String toString() {
        return FGI.A0P("MoveTo(x=", ", y=", ')', this.A00, this.A01);
    }
}
