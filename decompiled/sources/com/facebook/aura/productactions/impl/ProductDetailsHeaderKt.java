package com.facebook.aura.productactions.impl;

import X.AGI;
import X.AHD;
import X.AII;
import X.AIM;
import X.AKO;
import X.AKQ;
import X.AVy;
import X.AbstractC1798ArH;
import X.AbstractC2271BQs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BOf;
import X.BRg;
import X.C00x;
import X.C1515AkP;
import X.C3cG;
import X.C5wL;
import X.C78N;
import X.C8j4;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.productactions.impl.ProductDetailsActionsViewModel;
import com.facebook.aura.session.LocalUserSessionKt;
import com.facebook.aura.vds.compose.button.AuraElevatedButtonKt;
import com.facebook.aura.vds.compose.button.AuraMultiIconButtonPillEntry;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class ProductDetailsHeaderKt {
    /* renamed from: $r8$lambda$mMpe6-uwbqnP6rYwCldM_KD2FvM, reason: not valid java name */
    public static /* synthetic */ Unit m1866$r8$lambda$mMpe6uwbqnP6rYwCldM_KD2FvM(MutableState mutableState) {
        MutableState.A09(true, mutableState);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit $r8$lambda$sQMpkDth0jC7zo2ikNGZiZeFBrc(MutableState mutableState) {
        MutableState.A09(false, mutableState);
        return Unit.INSTANCE;
    }

    public static final Unit ProductDetailsTopBar$lambda$3$2$0$0(MutableState mutableState) {
        MutableState.A09(true, mutableState);
        return Unit.INSTANCE;
    }

    public static final Unit ProductDetailsTopBar$lambda$5$0$0$0(MutableState mutableState) {
        MutableState.A09(false, mutableState);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.productactions.impl.ProductDetailsActions rememberProductDetailsActions(final com.facebook.aura.navigation.key.ShoppingProductDetailsPageKey r5, final com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel r6, java.lang.String r7, X.BFM r8, int r9) {
        /*
            r4 = 0
            X.AnonymousClass005.A10(r5, r6, r7)
            java.lang.String r0 = "_actions"
            java.lang.String r3 = X.FGI.A0M(r7, r0)
            r0 = r9 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r2 = 32
            if (r0 <= r2) goto L18
            boolean r0 = r8.A67(r6)
            if (r0 != 0) goto L1d
        L18:
            r1 = r9 & 48
            r0 = 0
            if (r1 != r2) goto L1e
        L1d:
            r0 = 1
        L1e:
            boolean r0 = X.AnonymousClass001.A1T(r8, r5, r0)
            java.lang.Object r1 = r8.AaT()
            if (r0 != 0) goto L2c
            java.lang.Object r0 = X.C78N.A00
            if (r1 != r0) goto L34
        L2c:
            com.facebook.aura.productactions.impl.ProductDetailsHeaderKt$$ExternalSyntheticLambda8 r1 = new com.facebook.aura.productactions.impl.ProductDetailsHeaderKt$$ExternalSyntheticLambda8
            r1.<init>()
            X.BBI.A0T(r8, r1)
        L34:
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            com.facebook.aura.productactions.impl.ProductDetailsActions r0 = rememberActionsViewModel(r3, r1, r8, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.productactions.impl.ProductDetailsHeaderKt.rememberProductDetailsActions(com.facebook.aura.navigation.key.ShoppingProductDetailsPageKey, com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel, java.lang.String, X.BFM, int):com.facebook.aura.productactions.impl.ProductDetailsActions");
    }

    public static final void ProductDetailsTopBar(final Function0<Unit> function0, final Boolean bool, final Function0<Unit> function02, final Function0<Unit> function03, final boolean z, BRg bRg, BFM bfm, final int i, final int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> g0v;
        BRg bRgA0Q = bRg;
        bfm.AgG(-735375764);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bool);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, function02);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0W(bfm, function03);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0r(bfm, z);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0T |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRgA0Q);
            iA0T |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0T, 74898), bfm, iA0T)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            boolean zA66 = bfm.A66(AnonymousClass002.A1X(function03));
            Object objAaT = bfm.AaT();
            if (zA66 || objAaT == C78N.A00) {
                objAaT = AbstractC1798ArH.A07(false, bfm);
            }
            final MutableState mutableState = (MutableState) objAaT;
            AVy aVyA00 = BOf.A00(bfm, R.drawable.arrow_big_reply_wght400_outline_24, 0);
            AVy aVyA002 = BOf.A00(bfm, R.drawable.ellipsis_wght400_outline_24, 0);
            boolean zA1b = AnonymousClass002.A1b(bool, true);
            int i4 = R.drawable.bookmark_outline_24_wght500;
            if (zA1b) {
                i4 = R.drawable.bookmark_filled_24_wght500;
            }
            AVy aVyA003 = BOf.A00(bfm, i4, 0);
            int i5 = R.string._name_removed__res_0x7f12056f;
            if (zA1b) {
                i5 = R.string._name_removed__res_0x7f120573;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, i5);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12056d);
            String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120704);
            bfm.AgE(1973524875);
            AII aiiA17 = AIM.A17();
            if (function0 != null) {
                aiiA17.add(new AuraMultiIconButtonPillEntry(aVyA00, strA012, function0, null, z));
            }
            if (bool != null) {
                aiiA17.add(new AuraMultiIconButtonPillEntry(aVyA003, strA01, function02, null, z));
            }
            if (function03 == null) {
                bfm.AgE(1882042185);
            } else {
                boolean zA1Y = AnonymousClass001.A1Y(mutableState, bfm, 1882042186);
                Object objAaT2 = bfm.AaT();
                if (zA1Y || objAaT2 == C78N.A00) {
                    objAaT2 = new Function0() { // from class: com.facebook.aura.productactions.impl.ProductDetailsHeaderKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            MutableState.A09(true, mutableState);
                            return Unit.INSTANCE;
                        }
                    };
                    BBI.A0T(bfm, objAaT2);
                }
                aiiA17.add(new AuraMultiIconButtonPillEntry(aVyA002, strA013, (Function0) objAaT2, null, z));
            }
            BBI bbiA07 = C3cG.A07(bfm);
            AII aiiA18 = AIM.A18(aiiA17);
            BBI.A0R(bbiA07, false);
            if (aiiA18.isEmpty()) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    final BRg bRg2 = bRgA0Q;
                    g0v = new G0V() { // from class: com.facebook.aura.productactions.impl.ProductDetailsHeaderKt$$ExternalSyntheticLambda4
                        @Override // X.G0V
                        public final Object invoke(Object obj, Object obj2) {
                            Function0 function04 = function0;
                            Boolean bool2 = bool;
                            Function0 function05 = function02;
                            Function0 function06 = function03;
                            boolean z2 = z;
                            BRg bRg3 = bRg2;
                            int i6 = i;
                            ProductDetailsHeaderKt.ProductDetailsTopBar(function04, bool2, function05, function06, z2, bRg3, (BFM) obj, AnonymousClass011.A02(obj2, i6), i2);
                            return Unit.INSTANCE;
                        }
                    };
                    bBbAAc.A06 = g0v;
                }
                return;
            }
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            int iA0J = AnonymousClass003.A0J(bbiA07);
            AKQ akqA04 = BBI.A04(bbiA07);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Q);
            Function0<InterfaceC1516AkQ> function04 = C1515AkP.A00;
            if (bbiA07.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA07, function04);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            AuraElevatedButtonKt.m2419AuraMultiIconButtonPill942rkJo(aiiA18, null, 0.0f, null, bfm, 0, 14);
            if (function03 == null) {
                bfm.AgE(190198771);
            } else {
                bfm.AgE(190198772);
                boolean zA0A = MutableState.A0A(mutableState);
                boolean zA65 = bfm.A65(mutableState);
                Object objAaT3 = bfm.AaT();
                if (zA65 || objAaT3 == C78N.A00) {
                    objAaT3 = new Function0() { // from class: com.facebook.aura.productactions.impl.ProductDetailsHeaderKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            MutableState.A09(false, mutableState);
                            return Unit.INSTANCE;
                        }
                    };
                    BBI.A0O(bbiA07, objAaT3);
                }
                ProductDetailsMoreMenu(zA0A, function03, (Function0) objAaT3, bfm, 0);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbiA07, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            final BRg bRg3 = bRgA0Q;
            g0v = new G0V() { // from class: com.facebook.aura.productactions.impl.ProductDetailsHeaderKt$$ExternalSyntheticLambda6
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    Function0 function05 = function0;
                    Boolean bool2 = bool;
                    Function0 function06 = function02;
                    Function0 function07 = function03;
                    boolean z2 = z;
                    BRg bRg4 = bRg3;
                    int i6 = i;
                    ProductDetailsHeaderKt.ProductDetailsTopBar(function05, bool2, function06, function07, z2, bRg4, (BFM) obj, AnonymousClass011.A02(obj2, i6), i2);
                    return Unit.INSTANCE;
                }
            };
            bBbAAc.A06 = g0v;
        }
    }

    public static final ProductDetailsActions rememberActionsViewModel(String str, Function0<ProductDetailsActionsPage> function0, BFM bfm, int i) {
        BBI bbi = (BBI) bfm;
        ProductDetailsActionsViewModel.Factory factory = new ProductDetailsActionsViewModel.Factory(function0, AKO.A06(LocalUserSessionKt.LocalUserSession, bbi));
        BOD bodA00 = C5wL.A00(bfm);
        if (bodA00 == null) {
            throw AnonymousClass001.A0o();
        }
        ProductDetailsActionsViewModel productDetailsActionsViewModel = (ProductDetailsActionsViewModel) AnonymousClass003.A0Y(factory, bodA00, AnonymousClass005.A0Y(bodA00), ProductDetailsActionsViewModel.class, str);
        boolean zA65 = bfm.A65(productDetailsActionsViewModel);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = new ProductDetailsActions(productDetailsActionsViewModel);
            BBI.A0O(bbi, objAaT);
        }
        return (ProductDetailsActions) objAaT;
    }

    public static final void ProductDetailsMoreMenu(final boolean z, final Function0<Unit> function0, final Function0<Unit> function02, BFM bfm, final int i) {
        bfm.AgG(537189717);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0V(bfm, function02);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 147, 146), bfm, iA0n)) {
            final String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120571);
            final AVy aVyA00 = BOf.A00(bfm, R.drawable.arrow_share_wght400_outline_24, 0);
            int i2 = iA0n & 896;
            boolean zA1Q = AnonymousClass002.A1Q(i2, 256) | AnonymousClass001.A1N(iA0n);
            Object objAaT = bfm.AaT();
            if (zA1Q || objAaT == C78N.A00) {
                objAaT = new G0U() { // from class: com.facebook.aura.productactions.impl.ProductDetailsHeaderKt$$ExternalSyntheticLambda0
                    @Override // X.G0U
                    public final Object invoke(Object obj) {
                        return C8j4.A1B(function02, function0);
                    }
                };
                BBI.A0T(bfm, objAaT);
            }
            AuraContextMenuKt.m2519AuraContextMenukiaLOpA(null, (G0U) objAaT, function02, z, null, 0L, null, false, new G0V() { // from class: com.facebook.aura.productactions.impl.ProductDetailsHeaderKt$$ExternalSyntheticLambda1
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    return ProductDetailsHeaderKt.ProductDetailsMoreMenu$lambda$1(strA01, aVyA00, (BFM) obj, AnonymousClass001.A0F(obj2));
                }
            }, false, null, null, null, false, bfm, i2 | ((iA0n << 9) & 7168), 0, 16113);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.productactions.impl.ProductDetailsHeaderKt$$ExternalSyntheticLambda2
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    ProductDetailsHeaderKt.ProductDetailsMoreMenu(z, function0, function02, (BFM) obj, AnonymousClass011.A00(i));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final AHD ProductDetailsMoreMenu$lambda$1(String str, AVy aVy, BFM bfm, int i) {
        bfm.AgE(-934279779);
        boolean zA1K = AnonymousClass003.A1K(bfm, str, aVy);
        Object objAaT = bfm.AaT();
        if (zA1K || objAaT == C78N.A00) {
            objAaT = AGI.A0E(new AuraContextMenuItem(0, str, null, aVy, null, null, false, false, false, true, false, BRg.A00, 1, 1));
            bfm.Ai0(objAaT);
        }
        AHD ahd = (AHD) objAaT;
        AnonymousClass002.A19(bfm);
        return ahd;
    }

    public static final Unit ProductDetailsMoreMenu$lambda$2(boolean z, Function0 function0, Function0 function02, int i, BFM bfm, int i2) {
        ProductDetailsMoreMenu(z, function0, function02, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }

    public static final Unit ProductDetailsTopBar$lambda$4(Function0 function0, Boolean bool, Function0 function02, Function0 function03, boolean z, BRg bRg, int i, int i2, BFM bfm, int i3) {
        ProductDetailsTopBar(function0, bool, function02, function03, z, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final Unit ProductDetailsTopBar$lambda$6(Function0 function0, Boolean bool, Function0 function02, Function0 function03, boolean z, BRg bRg, int i, int i2, BFM bfm, int i3) {
        ProductDetailsTopBar(function0, bool, function02, function03, z, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.productactions.impl.ProductDetailsActions rememberInstacartProductDetailsActions(final com.facebook.aura.navigation.key.InstacartProductDetailsSheetKey r3, final com.facebook.aura.shopping.viewmodel.InstacartProductDetailsViewModel r4, X.BFM r5, int r6) {
        /*
            X.AnonymousClass003.A0u(r3, r4)
            r0 = r6 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r2 = 32
            if (r0 <= r2) goto L11
            boolean r0 = r5.A67(r4)
            if (r0 != 0) goto L16
        L11:
            r1 = r6 & 48
            r0 = 0
            if (r1 != r2) goto L17
        L16:
            r0 = 1
        L17:
            boolean r0 = X.AnonymousClass001.A1T(r5, r3, r0)
            java.lang.Object r2 = r5.AaT()
            if (r0 != 0) goto L25
            java.lang.Object r0 = X.C78N.A00
            if (r2 != r0) goto L2d
        L25:
            com.facebook.aura.productactions.impl.ProductDetailsHeaderKt$$ExternalSyntheticLambda7 r2 = new com.facebook.aura.productactions.impl.ProductDetailsHeaderKt$$ExternalSyntheticLambda7
            r2.<init>()
            X.BBI.A0T(r5, r2)
        L2d:
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r1 = 6
            java.lang.String r0 = "instacart_product_actions"
            com.facebook.aura.productactions.impl.ProductDetailsActions r0 = rememberActionsViewModel(r0, r2, r5, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.productactions.impl.ProductDetailsHeaderKt.rememberInstacartProductDetailsActions(com.facebook.aura.navigation.key.InstacartProductDetailsSheetKey, com.facebook.aura.shopping.viewmodel.InstacartProductDetailsViewModel, X.BFM, int):com.facebook.aura.productactions.impl.ProductDetailsActions");
    }
}
