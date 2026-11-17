package X;

import X.AOd;

/* loaded from: classes4.dex */
public final class Aag<V extends AOd> {
    public final V A00;
    public final C28s A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Aag) {
                Aag aag = (Aag) obj;
                if (!C7384Etj.areEqual(this.A00, aag.A00) || !this.A01.equals(aag.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0F(this.A01, AnonymousClass005.A0E(this.A00));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("VectorizedKeyframeSpecElementInfo(vectorValue=");
        sbA0x.append(this.A00);
        sbA0x.append(", easing=");
        sbA0x.append(this.A01);
        sbA0x.append(", arcMode=");
        sbA0x.append((Object) FGI.A0G("ArcMode(value=", ')', 0));
        return C8j3.A16(sbA0x, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Aag(AOd aOd, C28s c28s) {
        this.A00 = aOd;
        this.A01 = c28s;
    }
}
