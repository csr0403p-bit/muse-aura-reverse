package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class B81 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void A00(boolean z, final Function0<Unit> function0, BFM bfm, final int i, final int i2) {
        final boolean zA1Q = z;
        bfm.AgG(-361453782);
        int i3 = i2 & 1;
        int iA0n = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 19, 18), bfm, iA0n)) {
            zA1Q = C60Q.A1Q(i3, z);
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
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            boolean zA65 = bfm.A65(objAaT) | bfm.A64(j);
            Object objAaT2 = bfm.AaT();
            Object obj2 = objAaT2;
            if (zA65 || objAaT2 == obj) {
                B84 b84 = new B84(new ANJ(c28u, j));
                b84.A00 = new C2283BSj(0);
                BBI.A0O(bbi, b84);
                obj2 = b84;
            }
            boolean zA1Z = AnonymousClass001.A1Z(obj2, bfm, -585289004) | AnonymousClass004.A1I(iA0n);
            Object objAaT3 = bfm.AaT();
            if (zA1Z || objAaT3 == obj) {
                objAaT3 = new BTB(0, obj2, function0);
                bfm.Ai0(objAaT3);
            }
            AnonymousClass001.A15(bfm, objAaT3);
            Boolean boolValueOf = Boolean.valueOf(zA1Q);
            int i4 = iA0n & 14;
            boolean zA67 = bfm.A67(obj2) | (i4 == 4);
            Object objAaT4 = bfm.AaT();
            if (zA67 || objAaT4 == obj) {
                objAaT4 = new BT7(obj2, 0, zA1Q);
                bfm.Ai0(objAaT4);
            }
            C7bA.A04(bfm, null, boolValueOf, obj2, (G0U) objAaT4, i4, 4);
            boolean zA1M = AnonymousClass003.A1M(bfm, objAaT, obj2);
            Object objAaT5 = bfm.AaT();
            if (zA1M || objAaT5 == obj) {
                objAaT5 = BTA.A00(bfm, obj2, objAaT, 0);
            }
            AnonymousClass001.A19(bfm, objAaT5, objAaT, obj2);
            BBI.A0R(bbi, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: X.8kg
                @Override // X.G0V
                public final Object invoke(Object obj3, Object obj4) {
                    boolean z2 = zA1Q;
                    Function0 function02 = function0;
                    int i5 = i;
                    B81.A00(z2, function02, (BFM) obj3, AnonymousClass011.A00(i5), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
