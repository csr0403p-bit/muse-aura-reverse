package X;

import java.util.ArrayList;

/* renamed from: X.DIb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4958DIb {
    public final int A00;
    public final int A01;
    public final ArrayList<AbstractC4959DId> A02;
    public final ArrayList<String> A03;
    public final F0C A04 = new C5322DgG(null, new EQf(this, 6));
    public final F0C A05 = new C5322DgG(null, new EQf(this, 7));

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4958DIb) {
                C4958DIb c4958DIb = (C4958DIb) obj;
                if (this.A00 != c4958DIb.A00 || this.A01 != c4958DIb.A01 || !C7384Etj.areEqual(this.A02, c4958DIb.A02) || !C7384Etj.areEqual(this.A03, c4958DIb.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ((this.A00 * 31) + this.A01) * 31;
        ArrayList<AbstractC4959DId> arrayList = this.A02;
        int iHashCode = (i + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ArrayList<String> arrayList2 = this.A03;
        return iHashCode + (arrayList2 != null ? arrayList2.hashCode() : 0);
    }

    public final String toString() {
        int i = this.A00;
        int i2 = this.A01;
        ArrayList<AbstractC4959DId> arrayList = this.A02;
        ArrayList<String> arrayList2 = this.A03;
        StringBuilder sbA0y = C60O.A0y("CrashResilientEventSchema(markerId=", i);
        sbA0y.append(", maxConcurrentEvents=");
        sbA0y.append(i2);
        sbA0y.append(", annotationFields=");
        sbA0y.append(arrayList);
        return C3cJ.A0L(arrayList2, ", pointNames=", sbA0y);
    }

    /* JADX WARN: Incorrect types in method signature: (IILjava/util/ArrayList<LX/DId;>;Ljava/util/ArrayList<Ljava/lang/String;>;)V */
    public C4958DIb(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = arrayList;
        this.A03 = arrayList2;
    }
}
