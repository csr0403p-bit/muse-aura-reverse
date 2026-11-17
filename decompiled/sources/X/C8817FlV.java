package X;

import java.util.AbstractCollection;

/* renamed from: X.FlV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8817FlV extends AbstractC8825Fld {
    public final float A00;
    public final float A01;

    public C8817FlV(float f, float f2) {
        super(false, false);
        this.A00 = f;
        this.A01 = f2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8817FlV) {
                C8817FlV c8817FlV = (C8817FlV) obj;
                if (Float.compare(this.A00, c8817FlV.A00) != 0 || Float.compare(this.A01, c8817FlV.A01) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public static void A00(AbstractCollection abstractCollection, float f) {
        abstractCollection.add(new C8817FlV(f, f));
    }

    public static void A01(AbstractCollection abstractCollection, float f, float f2) {
        abstractCollection.add(new C8817FlV(f, f2));
    }

    public final int hashCode() {
        return C8j4.A06(C8j4.A04(this.A00), this.A01);
    }

    public final String toString() {
        return FGI.A0P("RelativeLineTo(dx=", ", dy=", ')', this.A00, this.A01);
    }
}
