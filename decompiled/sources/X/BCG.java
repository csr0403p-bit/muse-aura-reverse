package X;

/* loaded from: classes4.dex */
public final class BCG {
    public final Object A00;
    public final Object A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BCG) {
                BCG bcg = (BCG) obj;
                if (!C7384Etj.areEqual(this.A00, bcg.A00) || !C7384Etj.areEqual(this.A01, bcg.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.A00;
        int iOrdinal = (obj instanceof Enum ? ((Enum) obj).ordinal() : C60R.A01(obj)) * 31;
        Object obj2 = this.A01;
        return iOrdinal + (obj2 instanceof Enum ? ((Enum) obj2).ordinal() : C60R.A01(obj2));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("JoinedKey(left=");
        sbA0x.append(this.A00);
        sbA0x.append(", right=");
        return AnonymousClass007.A0Z(this.A01, sbA0x);
    }

    public BCG(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }
}
