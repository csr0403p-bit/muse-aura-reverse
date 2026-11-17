package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class B1U implements G0V, G0W, G2j, G2k, G2l, G2n, G2p, G2q, G2s, G2t, G2u, G2v, G31, G30, G2w, G2z, G2y, G2m, G2o {
    public ApJ A00;
    public Object A01;
    public List<ApJ> A02;
    public final int A03;
    public final boolean A04;

    public static B1U A01(Object obj, int i) {
        return new B1U(obj, i, false);
    }

    public static B1U A02(Object obj, int i) {
        return new B1U(obj, i, true);
    }

    public static final Object A05(BFM bfm, B1U b1u, Object obj, Object obj2, int i) {
        int iA00 = (A00(bfm, b1u) << 7) | i;
        Object obj3 = b1u.A01;
        C7384Etj.A0Z(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        C0862A6j.A02(obj3, 4);
        Object objInvoke = ((G2j) obj3).invoke(obj, obj2, bfm, Integer.valueOf(iA00));
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new BTR(b1u, obj, obj2, i, 5);
        }
        return objInvoke;
    }

    public static final Object A06(BFM bfm, B1U b1u, Object obj, Object obj2, Object obj3, int i) {
        int iA00 = (A00(bfm, b1u) << 10) | i;
        Object obj4 = b1u.A01;
        C7384Etj.A0Z(obj4, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        C0862A6j.A02(obj4, 5);
        Object objInvoke = ((G2k) obj4).invoke(obj, obj2, obj3, bfm, Integer.valueOf(iA00));
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new BTZ(obj, b1u, obj3, obj2, i, 1);
        }
        return objInvoke;
    }

    public static final Object A07(BFM bfm, B1U b1u, Object obj, Object obj2, Object obj3, Object obj4, int i) {
        int iA00 = (A00(bfm, b1u) << 13) | i;
        Object obj5 = b1u.A01;
        C7384Etj.A0Z(obj5, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        C0862A6j.A02(obj5, 6);
        Object objInvoke = ((G2l) obj5).invoke(obj, obj2, obj3, obj4, bfm, Integer.valueOf(iA00));
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C2302BTc(obj4, obj, b1u, obj2, obj3, i, 1);
        }
        return objInvoke;
    }

    public static final Object A08(BFM bfm, final B1U b1u, final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, final int i) {
        int iA00 = i | (A00(bfm, b1u) << 19);
        Object obj7 = b1u.A01;
        C7384Etj.A0Z(obj7, "null cannot be cast to non-null type kotlin.Function8<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        C0862A6j.A02(obj7, 8);
        Object objInvoke = ((G2n) obj7).invoke(obj, obj2, obj3, obj4, obj5, obj6, bfm, Integer.valueOf(iA00));
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: X.B1W
                @Override // X.G0V
                public final Object invoke(Object obj8, Object obj9) {
                    B1U.A08((BFM) obj8, this.A01, obj, obj2, obj3, obj4, obj5, obj6, AnonymousClass011.A01(i) | 1);
                    return Unit.INSTANCE;
                }
            };
        }
        return objInvoke;
    }

    public static int A00(BFM bfm, B1U b1u) {
        bfm.AgG(b1u.A03);
        b1u.A09(bfm);
        return bfm.A65(b1u) ? 2 : 1;
    }

    public static B1U A03(Object obj, int i, boolean z) {
        return new B1U(obj, i, z);
    }

    public static final Object A04(BFM bfm, B1U b1u, Object obj, int i) {
        bfm.AgG(b1u.A03);
        b1u.A09(bfm);
        int i2 = bfm.A65(b1u) ? 2 : 1;
        Object obj2 = b1u.A01;
        C7384Etj.A0Z(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        C0862A6j.A02(obj2, 3);
        Object objInvoke = ((G0W) obj2).invoke(obj, bfm, Integer.valueOf((i2 << 4) | i));
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new BTH(b1u, obj, i, 14);
        }
        return objInvoke;
    }

    private final void A09(BFM bfm) {
        BBb bBbA0V;
        if (!this.A04 || (bBbA0V = ((BBI) bfm).A0V()) == null) {
            return;
        }
        bBbA0V.A01 |= 1;
        if (A0A(this.A00, bBbA0V)) {
            this.A00 = bBbA0V;
            return;
        }
        List arrayList = this.A02;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.A02 = arrayList;
        } else {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (A0A((ApJ) arrayList.get(i), bBbA0V)) {
                    arrayList.set(i, bBbA0V);
                    return;
                }
            }
        }
        arrayList.add(bBbA0V);
    }

    public static final boolean A0A(ApJ apJ, ApJ apJ2) {
        B1X b1x;
        if (apJ == null) {
            return true;
        }
        if (!(apJ instanceof BBb) || !(apJ2 instanceof BBb)) {
            return false;
        }
        BBb bBb = (BBb) apJ;
        return bBb.A05 == null || (b1x = bBb.A04) == null || !AnonymousClass002.A1P(((BCR) b1x).A00, Integer.MIN_VALUE) || apJ.equals(apJ2) || C7384Etj.areEqual(bBb.A04, ((BBb) apJ2).A04);
    }

    public final Object A0B(BFM bfm, int i) {
        bfm.AgG(this.A03);
        A09(bfm);
        int i2 = 1 << 1;
        if (bfm.A65(this)) {
            i2 = 2 << 1;
        }
        Object obj = this.A01;
        C7384Etj.A0Z(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        C0862A6j.A02(obj, 2);
        Object objInvoke = ((G0V) obj).invoke(bfm, Integer.valueOf(i | i2));
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new BUM(this, 2);
        }
        return objInvoke;
    }

    @Override // X.G0W
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return A04((BFM) obj2, this, obj, ((Number) obj3).intValue());
    }

    public B1U(Object obj, int i, boolean z) {
        this.A03 = i;
        this.A04 = z;
        this.A01 = obj;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return A0B((BFM) obj, ((Number) obj2).intValue());
    }

    @Override // X.G2n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return A08((BFM) obj7, this, obj, obj2, obj3, obj4, obj5, obj6, AnonymousClass001.A0F(obj8));
    }

    @Override // X.G2l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return A07((BFM) obj5, this, obj, obj2, obj3, obj4, AnonymousClass001.A0F(obj6));
    }

    @Override // X.G2k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return A06((BFM) obj4, this, obj, obj2, obj3, AnonymousClass001.A0F(obj5));
    }

    @Override // X.G2j
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return A05((BFM) obj3, this, obj, obj2, AnonymousClass001.A0F(obj4));
    }
}
