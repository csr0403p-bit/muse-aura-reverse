package X;

import kotlin.Unit;

/* loaded from: classes4.dex */
public abstract class B82 {
    /* JADX WARN: Incorrect types in method signature: (ZLX/G0V<LX/20Q<LX/B9z;>;-LX/HtJ<Lkotlin/Unit;>;+Ljava/lang/Object;>;LX/BFM;II)V */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void A00(BFM bfm, final G0V g0v, final int i, final int i2, boolean z) {
        final boolean zA1Q = z;
        bfm.AgG(-642000585);
        int i3 = i2 & 1;
        int iA0n = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0n(bfm, zA1Q) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 19, 18), bfm, iA0n)) {
            zA1Q = C60Q.A1Q(i3, zA1Q);
            C28u c28uA00 = C1EP.A00(bfm);
            InterfaceC2262BMi interfaceC2262BMiA00 = AbstractC1772AqQ.A00(bfm);
            C28u c28u = c28uA00;
            if (c28uA00 == null) {
                c28u = interfaceC2262BMiA00;
                if (interfaceC2262BMiA00 == 0) {
                    throw C60O.A0i("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                }
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = new B83(interfaceC2262BMiA00 != 0 ? interfaceC2262BMiA00.getOnBackPressedDispatcher() : null, c28uA00 != null ? c28uA00.getNavigationEventDispatcher() : null);
                BBI.A0T(bfm, objAaT);
            }
            C3UX c3ux = (C3UX) AnonymousClass004.A15(bfm, bfm.AaT(), obj);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            boolean zA65 = bfm.A65(objAaT) | bfm.A64(j);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == obj) {
                objAaT2 = new B86(new ANK(c28u, j), c3ux);
                BBI.A0O(bbi, objAaT2);
            }
            bfm.AgE(-348495408);
            boolean zA1M = AnonymousClass003.A1M(bfm, objAaT2, g0v);
            Object objAaT3 = bfm.AaT();
            if (zA1M || objAaT3 == obj) {
                objAaT3 = new BTB(1, objAaT2, g0v);
                bfm.Ai0(objAaT3);
            }
            AnonymousClass001.A15(bfm, objAaT3);
            Boolean boolValueOf = Boolean.valueOf(zA1Q);
            int i4 = iA0n & 14;
            boolean zA1Q2 = AnonymousClass002.A1Q(i4, 4) | bfm.A67(objAaT2);
            Object objAaT4 = bfm.AaT();
            if (zA1Q2 || objAaT4 == obj) {
                objAaT4 = new BT7(objAaT2, 1, zA1Q);
                bfm.Ai0(objAaT4);
            }
            C7bA.A04(bfm, null, boolValueOf, objAaT2, (G0U) objAaT4, i4, 4);
            boolean zA1M2 = AnonymousClass003.A1M(bfm, objAaT, objAaT2);
            Object objAaT5 = bfm.AaT();
            if (zA1M2 || objAaT5 == obj) {
                objAaT5 = BTA.A00(bfm, objAaT2, objAaT, 1);
            }
            AnonymousClass001.A19(bfm, objAaT5, objAaT, objAaT2);
            BBI.A0R(bbi, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: X.21X
                @Override // X.G0V
                public final Object invoke(Object obj2, Object obj3) {
                    boolean z2 = zA1Q;
                    G0V g0v2 = g0v;
                    int i5 = i;
                    B82.A00((BFM) obj2, g0v2, AnonymousClass011.A00(i5), i2, z2);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
