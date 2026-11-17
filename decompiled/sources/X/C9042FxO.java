package X;

import X.InterfaceC9011Fwo;
import java.util.Set;

/* renamed from: X.FxO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9042FxO<T extends InterfaceC9011Fwo> {
    public final int A00;
    public final int A01;
    public final C9025Fx3 A02;
    public final String A03;
    public final Set<C9012Fwp> A04;
    public final C9uG<T> A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (getClass().equals(BV5.A0N(obj))) {
                C7384Etj.A0Z(obj, "null cannot be cast to non-null type androidx.health.connect.client.request.ReadRecordsRequest<*>");
                C9042FxO c9042FxO = (C9042FxO) obj;
                if (!this.A05.equals(c9042FxO.A05) || !this.A02.equals(c9042FxO.A02) || !this.A04.equals(c9042FxO.A04) || this.A06 != c9042FxO.A06 || this.A01 != c9042FxO.A01 || !C7384Etj.areEqual(this.A03, c9042FxO.A03) || this.A00 != c9042FxO.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((C0KA.A01(AnonymousClass005.A0F(this.A04, AnonymousClass005.A0F(this.A02, this.A05.hashCode() * 31)), this.A06) + this.A01) * 31) + BV7.A0I(this.A03)) * 31) + this.A00;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/9uG<TT;>;LX/Fx3;Ljava/util/Set<LX/Fwp;>;ZILjava/lang/String;I)V */
    public C9042FxO(C9025Fx3 c9025Fx3, String str, Set set, C9uG c9uG, int i, int i2, boolean z) {
        this.A05 = c9uG;
        this.A02 = c9025Fx3;
        this.A04 = set;
        this.A06 = z;
        this.A01 = i;
        this.A03 = str;
        this.A00 = i2;
        if (i <= 0) {
            throw C60O.A0i("pageSize must be positive.");
        }
    }
}
