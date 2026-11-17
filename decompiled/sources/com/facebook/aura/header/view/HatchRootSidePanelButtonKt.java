package com.facebook.aura.header.view;

import X.AKQ;
import X.ARD;
import X.AXN;
import X.AYD;
import X.AbstractC07539Wl;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
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
import X.BRg;
import X.C00x;
import X.C06G;
import X.C0Hi;
import X.C10G;
import X.C1515AkP;
import X.C15z;
import X.C1BO;
import X.C3U4;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.HatchSidePanelController;
import com.facebook.aura.navigation.RootChromeRevealKt;
import com.facebook.aura.navigation.SidePanelLocalsKt;
import com.facebook.aura.tabs.HatchSidePanelEntryKt;
import com.facebook.aura.ui.HatchFloatingChromeGeometryKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchRootSidePanelButtonKt {
    public static final String TAG = "HatchRootSidePanel";

    /* renamed from: com.facebook.aura.header.view.HatchRootSidePanelButtonKt$HatchRootSidePanelButton$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BRg bRg, int i, int i2) {
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
            HatchRootSidePanelButtonKt.HatchRootSidePanelButton(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.header.view.HatchRootSidePanelButtonKt$HatchRootSidePanelButton$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(BRg bRg, int i, int i2) {
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
            HatchRootSidePanelButtonKt.HatchRootSidePanelButton(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.header.view.HatchRootSidePanelButtonKt$SuppressRootSidePanelButton$2, reason: invalid class name and case insensitive filesystem */
    public final class C121952 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121952(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchRootSidePanelButtonKt.SuppressRootSidePanelButton(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void HatchRootSidePanelButton(BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass7;
        BRg bRg2 = bRg;
        bfm.AgG(1849671385);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            HatchSidePanelController hatchSidePanelController = (HatchSidePanelController) bfm.A6v(SidePanelLocalsKt.LocalSidePanelController);
            boolean zA65 = bfm.A65(auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = AnonymousClass003.A0R(bfm, new HatchRootSidePanelButtonKt$HatchRootSidePanelButton$topKey$2$1(auraNavigatorA0b));
            }
            C1BO c1bo = (C1BO) objAaT;
            boolean docksBesidePages = hatchSidePanelController.getPresentation().getDocksBesidePages();
            AuraNavKey auraNavKey = (AuraNavKey) c1bo.getValue();
            boolean zIsSidePanelDockedOn = docksBesidePages ? HatchSidePanelEntryKt.isSidePanelDockedOn(auraNavKey) : HatchSidePanelEntryKt.isSidePanelOfferedBy(auraNavKey, hatchSidePanelController.getPresentation());
            Object value = c1bo.getValue();
            Boolean boolValueOf = Boolean.valueOf(zIsSidePanelDockedOn);
            boolean zA1T = AnonymousClass003.A1T(bfm, c1bo, zIsSidePanelDockedOn);
            Object objAaT2 = bfm.AaT();
            if (zA1T || objAaT2 == C78N.A00) {
                objAaT2 = new HatchRootSidePanelButtonKt$HatchRootSidePanelButton$1$1(zIsSidePanelDockedOn, c1bo);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A19(bfm, objAaT2, value, boolValueOf);
            if (!zIsSidePanelDockedOn || MutableState.A0A(hatchSidePanelController.isButtonSuppressed$delegate)) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass7 = new AnonymousClass2(bRg2, i, i2);
                    bBbAAc.A06 = anonymousClass7;
                }
                return;
            }
            C0Hi c0HiA0Z = AnonymousClass001.A0Z(bfm);
            String strA01 = AbstractC2271BQs.A01(bfm, (!hatchSidePanelController.getPresentation().getDocksBesidePages() ? hatchSidePanelController.getContentKey() != null : !MutableState.A0A(hatchSidePanelController.isDockCollapsed$delegate)) ? R.string._name_removed__res_0x7f120606 : R.string._name_removed__res_0x7f120607);
            HatchStatusPillMetrics hatchStatusPillMetricsA0a = AnonymousClass002.A0a(bfm);
            AXN axnA0Y = AnonymousClass002.A0Y(bfm);
            C1BO<Float> c1boRememberRootChromeRevealAlpha = RootChromeRevealKt.rememberRootChromeRevealAlpha(bfm, 0);
            boolean zA652 = bfm.A65(hatchStatusPillMetricsA0a);
            Object objAaT3 = bfm.AaT();
            if (zA652 || objAaT3 == C78N.A00) {
                objAaT3 = new HatchRootSidePanelButtonKt$HatchRootSidePanelButton$3$1(hatchStatusPillMetricsA0a);
                bfm.Ai0(objAaT3);
            }
            AnonymousClass001.A17(bfm, objAaT3, hatchStatusPillMetricsA0a);
            boolean zA653 = bfm.A65(c1boRememberRootChromeRevealAlpha);
            Object objAaT4 = bfm.AaT();
            if (zA653 || objAaT4 == C78N.A00) {
                objAaT4 = new HatchRootSidePanelButtonKt$HatchRootSidePanelButton$4$1(c1boRememberRootChromeRevealAlpha);
                bfm.Ai0(objAaT4);
            }
            BRg bRgA0W = AnonymousClass001.A0W(bRg2, objAaT4);
            boolean zA67 = bfm.A67(hatchSidePanelController);
            Object objAaT5 = bfm.AaT();
            if (zA67 || objAaT5 == C78N.A00) {
                objAaT5 = new HatchRootSidePanelButtonKt$HatchRootSidePanelButton$5$1(hatchSidePanelController);
                bfm.Ai0(objAaT5);
            }
            BRg bRgA04 = C10G.A04(C3U4.A0B(C15z.A00(bfm, AYD.A03(bRgA0W, (G0U) objAaT5)), C06G.A00(bfm), AuraDimensKt.SpacingXsmall), 60.0f);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA04);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
            HeaderLeadingButton headerLeadingButton = HeaderLeadingButton.SidePanel;
            boolean zA1M = AnonymousClass003.A1M(bfm, c0HiA0Z, hatchSidePanelController);
            Object objAaT6 = bfm.AaT();
            if (zA1M || objAaT6 == C78N.A00) {
                objAaT6 = new HatchRootSidePanelButtonKt$HatchRootSidePanelButton$6$1$1(c0HiA0Z, hatchSidePanelController);
                bfm.Ai0(objAaT6);
            }
            Function0 function02 = (Function0) objAaT6;
            BRg bRgA00 = AbstractC07539Wl.A00(BRg.A00, headerLeadingButton.getTestTagId$fbandroid_express_aura_java_com_facebook_aura_header_view_view());
            boolean zA654 = bfm.A65(strA01);
            Object objAaT7 = bfm.AaT();
            if (zA654 || objAaT7 == C78N.A00) {
                objAaT7 = new HatchRootSidePanelButtonKt$HatchRootSidePanelButton$6$2$1(strA01);
                bfm.Ai0(objAaT7);
            }
            BRg bRgTrackFloatingChromeObstacle = HatchFloatingChromeGeometryKt.trackFloatingChromeObstacle(ARD.A01(bRgA00, (G0U) objAaT7, false), false, bfm, 0, 1);
            boolean zA1K = AnonymousClass003.A1K(bfm, hatchStatusPillMetricsA0a, axnA0Y);
            Object objAaT8 = bfm.AaT();
            if (zA1K || objAaT8 == C78N.A00) {
                objAaT8 = new HatchRootSidePanelButtonKt$HatchRootSidePanelButton$6$3$1(hatchStatusPillMetricsA0a, axnA0Y);
                bfm.Ai0(objAaT8);
            }
            HatchHeaderLeadingButtonKt.HatchHeaderLeadingButton(headerLeadingButton, function02, HatchStatusPillMetricsKt.onBoundsInWindowChanged(bRgTrackFloatingChromeObstacle, (G0U) objAaT8), false, bfm, 6, 8);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass7 = new AnonymousClass7(bRg2, i, i2);
            bBbAAc.A06 = anonymousClass7;
        }
    }

    public static final void SuppressRootSidePanelButton(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1Q(bfm, 146042227, i), bfm, i)) {
            HatchSidePanelController hatchSidePanelController = (HatchSidePanelController) bfm.A6v(SidePanelLocalsKt.LocalSidePanelController);
            boolean zA67 = bfm.A67(hatchSidePanelController);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchRootSidePanelButtonKt$SuppressRootSidePanelButton$1$1(hatchSidePanelController);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, hatchSidePanelController);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C121952(i);
        }
    }

    public static final /* synthetic */ AuraNavKey access$HatchRootSidePanelButton$lambda$1(C1BO c1bo) {
        return (AuraNavKey) c1bo.getValue();
    }
}
