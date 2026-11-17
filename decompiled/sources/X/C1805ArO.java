package X;

/* renamed from: X.ArO, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1805ArO {
    public static final AFs<C1805ArO, Object> A03 = C0872AFu.A00(C2282BSi.A00(49), 27);
    public final long A00;
    public final ApQ A01;
    public final Au3 A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1805ArO) {
                C1805ArO c1805ArO = (C1805ArO) obj;
                if (this.A00 != c1805ArO.A00 || !C7384Etj.areEqual(this.A02, c1805ArO.A02) || !C7384Etj.areEqual(this.A01, c1805ArO.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iA06 = AnonymousClass006.A06(this.A00, AnonymousClass005.A0E(this.A01));
        Au3 au3 = this.A02;
        return iA06 + (au3 != null ? C3cG.A02(au3.A00) : 0);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("TextFieldValue(text='");
        sbA0x.append((Object) this.A01);
        sbA0x.append("', selection=");
        sbA0x.append((Object) Au3.A03(this.A00));
        sbA0x.append(", composition=");
        return AnonymousClass007.A0Z(this.A02, sbA0x);
    }

    public C1805ArO(ApQ apQ, Au3 au3, long j) {
        this.A01 = apQ;
        int iA0I = C8j3.A0I(apQ);
        this.A00 = AbstractC1815ArZ.A01(j, iA0I);
        this.A02 = au3 != null ? C8j3.A0j(AbstractC1815ArZ.A01(au3.A00, iA0I)) : null;
    }

    public C1805ArO(String str, long j) {
        this(AnonymousClass005.A0X(str), null, j);
    }
}
