package X;

import kotlin.jvm.functions.Function0;

/* renamed from: X.9iD, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9iD extends C9iK {
    public final F0C A00;
    public final BL8 A01;

    public C9iD(final String str, final int i) {
        super(str, null, i);
        this.A01 = C9i9.A00;
        this.A00 = AbstractC5321DgF.A03(new Function0() { // from class: X.9iC
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                String str2 = str;
                C9iD c9iD = this;
                C9iZ[] c9iZArr = new C9iZ[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    c9iZArr[i3] = C9iY.A03(FGI.A0O(str2, c9iD.A08[i3], '.'), C9iE.A00);
                }
                return c9iZArr;
            }
        });
    }

    @Override // X.C9iK
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof C9iZ)) {
                C9iZ c9iZ = (C9iZ) obj;
                if (c9iZ.AGs() != C9i9.A00 || !this.A03.equals(c9iZ.AKP()) || !C7384Etj.areEqual(C9iG.A00(this), C9iG.A00(c9iZ))) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C9iK, X.C9iZ
    public final C9iZ AF3(int i) {
        return ((C9iZ[]) this.A00.getValue())[i];
    }

    @Override // X.C9iK, X.C9iZ
    public final BL8 AGs() {
        return this.A01;
    }

    @Override // X.C9iK
    public final int hashCode() {
        int iHashCode = this.A03.hashCode();
        BT4 bt4 = new BT4(this);
        int iHashCode2 = 1;
        while (bt4.hasNext()) {
            int i = iHashCode2 * 31;
            String str = (String) bt4.next();
            iHashCode2 = i + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // X.C9iK
    public final String toString() {
        return AbstractC0878AGe.A0L(", ", FGI.A0E(this.A03, '('), ")", new BHQ(this), null);
    }
}
