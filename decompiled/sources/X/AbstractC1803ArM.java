package X;

import java.util.List;

/* renamed from: X.ArM, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1803ArM {
    public static final AFs<ApQ, Object> A00 = C0872AFu.A01(C2282BSi.A00(13), 40);
    public static final AFs<List<C1733ApU<? extends Object>>, Object> A01 = C0872AFu.A00(C2282BSi.A00(20), 2);
    public static final AFs<C1733ApU<? extends Object>, Object> A02 = C0872AFu.A00(C2282BSi.A00(32), 14);
    public static final AFs<C1681AoJ, Object> A0L = C0872AFu.A00(C2282BSi.A00(39), 16);
    public static final AFs<C1OR, Object> A0K = C0872AFu.A00(C2282BSi.A00(41), 17);
    public static final AFs<C1ji, Object> A09 = C0872AFu.A01(C2282BSi.A00(18), 49);
    public static final AFs<BGe, Object> A04 = C0872AFu.A00(C2282BSi.A00(29), 10);
    public static final AFs<C1818Arh, Object> A0C = C0872AFu.A00(C2282BSi.A00(40), 18);
    public static final AFs<C1824Aro, Object> A0E = C0872AFu.A00(C2282BSi.A00(42), 19);
    public static final AFs<C1697Aoc, Object> A0I = C0872AFu.A01(C2282BSi.A00(43), 39);
    public static final AFs<BG3, Object> A0F = C0872AFu.A01(C2282BSi.A00(14), 41);
    public static final AFs<C1807ArQ, Object> A0G = C0872AFu.A01(C2282BSi.A00(15), 42);
    public static final AFs<C1810ArU, Object> A0H = C0872AFu.A01(C2282BSi.A00(16), 43);
    public static final AFs<C1736ApY, Object> A07 = C0872AFu.A01(C2282BSi.A00(17), 44);
    public static final AFs<ArS, Object> A03 = C0872AFu.A01(C2282BSi.A00(19), 45);
    public static final AFs<Au3, Object> A0J = C0872AFu.A01(C2282BSi.A00(21), 46);
    public static final AFs<C1780Aqg, Object> A0D = C0872AFu.A01(C2282BSi.A00(22), 47);
    public static final AFt<B6A, Object> A0M = new C0873AFv(BIS.A00, new G0U<Object, B6A>() { // from class: X.1YU
        @Override // X.G0U
        public final /* bridge */ /* synthetic */ B6A invoke(Object obj) {
            long jA0F;
            if (C7384Etj.areEqual(obj, AnonymousClass001.A0h())) {
                jA0F = B6A.A07;
            } else {
                C7384Etj.A0Z(obj, "null cannot be cast to non-null type kotlin.Int");
                jA0F = AnonymousClass001.A0F(obj) << 32;
            }
            return new B6A(jA0F);
        }
    });
    public static final AFt<C1YL, Object> A0S = new C0873AFv(C2282BSi.A00(23), new C2279BSf(48));
    public static final AFt<C1819Ari, Object> A0T = A00(C2282BSi.A00(24), 0);
    public static final AFt<C1814ArY, Object> A0N = A00(C2282BSi.A00(25), 1);
    public static final AFs<B0A, Object> A05 = C0872AFu.A00(C2282BSi.A00(26), 3);
    public static final AFs<B0I, Object> A06 = C0872AFu.A00(C2282BSi.A00(27), 4);
    public static final AFt<C1809ArT, Object> A0U = A00(C2282BSi.A00(28), 5);
    public static final AFt<C1813ArX, Object> A0V = A00(C2282BSi.A00(30), 6);
    public static final AFt<AWx, Object> A0R = A00(C2282BSi.A00(31), 7);
    public static final AFs<C0874AGa, Object> A0A = C0872AFu.A00(C2282BSi.A00(33), 8);
    public static final AFs<BN1, Object> A0B = C0872AFu.A00(C2282BSi.A00(34), 9);
    public static final AFs<C1804ArN, Object> A08 = C0872AFu.A00(C2282BSi.A00(35), 11);
    public static final AFt<C1806ArP, Object> A0O = A00(C2282BSi.A00(36), 12);
    public static final AFt<C1812ArW, Object> A0Q = A00(C2282BSi.A00(37), 13);
    public static final AFt<C1808ArR, Object> A0P = A00(C2282BSi.A00(38), 15);

    public static C0873AFv A00(G0V g0v, int i) {
        return new C0873AFv(g0v, new C2276BSc(i));
    }

    /* JADX WARN: Incorrect types in method signature: <T::LX/AFs<TOriginal;TSaveable;>;Original:Ljava/lang/Object;Saveable:Ljava/lang/Object;>(TOriginal;TT;LX/1bi;)Ljava/lang/Object; */
    public static final Object A01(AFs aFs, C1bi c1bi, Object obj) {
        Object objAc1;
        return (obj == null || (objAc1 = aFs.Ac1(c1bi, obj)) == null) ? AnonymousClass001.A0h() : objAc1;
    }
}
