package com.facebook.aura.sharesheet;

import X.AKH;
import X.AKQ;
import X.ARD;
import X.AVy;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.ApQ;
import X.AxM;
import X.B81;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C10G;
import X.C1419Aio;
import X.C1515AkP;
import X.C1731ApS;
import X.C1824Aro;
import X.C1DI;
import X.C1Pn;
import X.C1SA;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.vds.compose.bottomsheet.state.AuraSheetState;
import com.facebook.aura.vds.compose.bottomsheet.state.AuraSheetStateKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraShapes;
import com.facebook.aura.vds.compose.theme.AuraShapesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchMessageShareReviewKt {

    /* renamed from: com.facebook.aura.sharesheet.HatchMessageShareReviewKt$HatchMessageShareReviewWaiting$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onCancel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onCancel = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMessageShareReviewKt.HatchMessageShareReviewWaiting(this.$onCancel, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.sharesheet.HatchMessageShareReviewKt$HatchMessageShareReviewWarning$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMessageShareReviewKt.HatchMessageShareReviewWarning(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.sharesheet.HatchMessageShareReviewKt$HatchShareCancellationEffects$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ HatchShareSheetViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchShareSheetViewModel hatchShareSheetViewModel, int i) {
            super(2);
            this.$viewModel = hatchShareSheetViewModel;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMessageShareReviewKt.HatchShareCancellationEffects(this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.sharesheet.HatchMessageShareReviewKt$HatchShareCancellationEffects$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ HatchShareSheetViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(HatchShareSheetViewModel hatchShareSheetViewModel, int i) {
            super(2);
            this.$viewModel = hatchShareSheetViewModel;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMessageShareReviewKt.HatchShareCancellationEffects(this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void HatchShareCancellationEffects(HatchShareSheetViewModel hatchShareSheetViewModel, BFM bfm, int i) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass4;
        C7384Etj.A0Y(hatchShareSheetViewModel, 0);
        bfm.AgG(63380918);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchShareSheetViewModel, bfm, i) ? 1 : 0) | i : i;
        boolean z = true;
        if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 3, 2), bfm, iA05)) {
            bfm.Afo();
        } else {
            if (!hatchShareSheetViewModel.requiresShareCancellation) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass4 = new AnonymousClass1(hatchShareSheetViewModel, i);
                    bBbAAc.A06 = anonymousClass4;
                }
                return;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            int i2 = iA05 & 14;
            boolean zA1T = AnonymousClass001.A1T(bfm, auraNavigatorA0b, i2 == 4 || ((iA05 & 8) != 0 && bfm.A67(hatchShareSheetViewModel)));
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new HatchMessageShareReviewKt$HatchShareCancellationEffects$2$1(hatchShareSheetViewModel, auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            B81.A00(false, (Function0) objAaT, bfm, 0, 1);
            AuraSheetState auraSheetState = (AuraSheetState) bfm.A6v(AuraSheetStateKt.LocalAuraSheetState);
            C1Pn c1Pn = auraSheetState != null ? auraSheetState.sheetState : null;
            boolean zA65 = bfm.A65(c1Pn);
            if (i2 != 4 && ((iA05 & 8) == 0 || !bfm.A67(hatchShareSheetViewModel))) {
                z = false;
            }
            boolean z2 = zA65 | z;
            Object objAaT2 = bfm.AaT();
            if (z2 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchMessageShareReviewKt$HatchShareCancellationEffects$3$1(c1Pn, hatchShareSheetViewModel, null);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A1A(bfm, objAaT2, hatchShareSheetViewModel, c1Pn);
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass4 = new AnonymousClass4(hatchShareSheetViewModel, i);
            bBbAAc.A06 = anonymousClass4;
        }
    }

    public static final void HatchMessageShareReviewWaiting(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(function0, 0);
        bfm.AgG(-786788412);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1205c3);
            BRg bRgA06 = C3U4.A06(AnonymousClass001.A0R(bRg2), 24.0f);
            InterfaceC1380AiA interfaceC1380AiAA0T = AnonymousClass006.A0T(bfm, C2VU.A00, 8.0f);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA06);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0T, akqA04, bRgA01, iA0J);
            BS0 bs0 = BRg.A00;
            boolean zA65 = bfm.A65(strA01);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new HatchMessageShareReviewKt$HatchMessageShareReviewWaiting$1$1$1(strA01);
                bfm.Ai0(objAaT);
            }
            AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(ARD.A01(bs0, (G0U) objAaT, false), null, 0L, bfm, 0, 6);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1205c1);
            AuraLabelButtonStyle auraLabelButtonStyleTertiary = AuraButtonStyles.INSTANCE.tertiary(null, bfm, 48, 1);
            boolean zA1S = AnonymousClass001.A1S(bfm, auraNavigatorA0b, AnonymousClass002.A1O(iA0T & 14));
            Object objAaT2 = bfm.AaT();
            if (zA1S || objAaT2 == C78N.A00) {
                objAaT2 = new HatchMessageShareReviewKt$HatchMessageShareReviewWaiting$1$2$1(function0, auraNavigatorA0b);
                bfm.Ai0(objAaT2);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM("share-review-cancel", strA012, null, null, auraLabelButtonStyleTertiary, null, null, false, false, false, false, false, null, null, (Function0) objAaT2, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 6, 0, 0, 134201324);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(function0, bRg2, i, i2);
        }
    }

    public static final void HatchMessageShareReviewWarning(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1714933279);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1205e9);
            String strA0t = AnonymousClass001.A0t(bfm, strA01, R.string._name_removed__res_0x7f1205e8);
            AuraColors auraColorsA0c = AnonymousClass002.A0c(bfm);
            C1824Aro c1824AroA01 = C1824Aro.A01(AnonymousClass002.A0f(bfm).footnoteMedium.A02, 65534, auraColorsA0c.primaryText, 0L);
            C1731ApS c1731ApSA0X = AnonymousClass006.A0X(strA0t);
            int iA0B = C7BY.A0B(strA0t, strA01, 0, false);
            if (iA0B >= 0) {
                c1731ApSA0X.A0A(c1824AroA01, iA0B, strA01.length() + iA0B);
            }
            ApQ apQA04 = c1731ApSA0X.A04();
            BRg bRgA0V = AnonymousClass001.A0V(AnonymousClass001.A0R(bRg2), 60.0f);
            long j = auraColorsA0c.elevated;
            AKH<AuraShapes> akh = AuraShapesKt.LocalAuraShapes;
            BRg bRgA02 = C1DI.A02(C1b8.A03(bRgA0V, ((AuraShapes) bfm.A6v(akh)).card, j), ((AuraShapes) bfm.A6v(akh)).card, 1.0f, auraColorsA0c.fillDivider);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = HatchMessageShareReviewKt$HatchMessageShareReviewWarning$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA08 = C3U4.A08(AnonymousClass001.A0Y(bRgA02, objAaT, true), 16.0f);
            InterfaceC1380AiA interfaceC1380AiAA0L = AnonymousClass007.A0L(bfm, 16.0f);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA08);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0L, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            AVy aVyA00 = BOf.A00(bfm, R.drawable.rectanglealert_outline_24_wght400_light, 0);
            C1419Aio c1419AioA0S = AnonymousClass002.A0S(auraColorsA0c.primaryText);
            BS0 bs0 = BRg.A00;
            C1SA.A00(bfm, null, C10G.A07(bs0, 18.0f), c1419AioA0S, aVyA00, null, null, 0.0f, AVy.$stable | 432, 56);
            AuraTextKt.m2640AuraTextVmYn7U0(apQA04, c90m.AiP(bs0, 1.0f, true), auraColorsA0c.secondaryText, C06G.A0Y(bfm), null, null, null, 0L, false, 0, 0, 0, null, null, null, bfm, 0, 0, 32752);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(bRg2, i, i2);
        }
    }
}
