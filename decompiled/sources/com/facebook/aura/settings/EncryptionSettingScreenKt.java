package com.facebook.aura.settings;

import X.AKH;
import X.AKQ;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C07C;
import X.C1515AkP;
import X.C1DG;
import X.C3U4;
import X.C78N;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.theme.AuraDimensions;
import com.facebook.aura.vds.compose.theme.AuraDimensionsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class EncryptionSettingScreenKt {

    /* renamed from: com.facebook.aura.settings.EncryptionSettingScreenKt$EncryptionSettingScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ ConfidentialVmSwitchViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel, AuraNavigator auraNavigator) {
            super(4);
            this.$viewModel = confidentialVmSwitchViewModel;
            this.$navigator = auraNavigator;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1932invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m1932invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            BS0 bs0 = BRg.A00;
            BRg bRgA0M = AnonymousClass006.A0M(bfm);
            AKH<AuraDimensions> akh = AuraDimensionsKt.LocalAuraDimensions;
            BRg bRgA0C = C3U4.A0C(bRgA0M, C06G.A01(bfm, akh), 0.0f, C06G.A01(bfm, akh), C06G.A01(bfm, akh));
            ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel = this.$viewModel;
            AuraNavigator auraNavigator = this.$navigator;
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            C90l c90l = C90l.A00;
            C01N.A08(bfm, bs0, f);
            ConfidentialVmSettingsSectionKt.ConfidentialVmSettingsSection(false, C3U4.A0C(bs0, 0.0f, 0.0f, 0.0f, AuraDimensKt.SpacingMedium), bfm, 6, 0);
            boolean zA1M = AnonymousClass003.A1M(bfm, confidentialVmSwitchViewModel, auraNavigator);
            Object objAaT = bfm.AaT();
            if (zA1M || objAaT == C78N.A00) {
                objAaT = new EncryptionSettingScreenKt$EncryptionSettingScreen$3$1$1$1(confidentialVmSwitchViewModel, auraNavigator);
                bfm.Ai0(objAaT);
            }
            HatchSectionKt.m2326HatchSectionuDo3WH8(c90l, false, null, 0L, (G0U) objAaT, bfm, 6, 7);
            boolean zA1M2 = AnonymousClass003.A1M(bfm, confidentialVmSwitchViewModel, auraNavigator);
            Object objAaT2 = bfm.AaT();
            if (zA1M2 || objAaT2 == C78N.A00) {
                objAaT2 = new EncryptionSettingScreenKt$EncryptionSettingScreen$3$1$2$1(confidentialVmSwitchViewModel, auraNavigator);
                bfm.Ai0(objAaT2);
            }
            EncryptionSettingScreenKt.SwitchBackSection(c90l, (Function0) objAaT2, bfm, 6);
            C01N.A04(bfm, bbi, bs0, f2, true);
        }
    }

    /* renamed from: com.facebook.aura.settings.EncryptionSettingScreenKt$EncryptionSettingScreen$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ConfidentialVmSwitchViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(BRg bRg, ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$viewModel = confidentialVmSwitchViewModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            EncryptionSettingScreenKt.EncryptionSettingScreen(this.$modifier, this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.EncryptionSettingScreenKt$SwitchBackSection$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ C07C $this_SwitchBackSection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C07C c07c, Function0<Unit> function0, int i) {
            super(2);
            this.$this_SwitchBackSection = c07c;
            this.$onClick = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            EncryptionSettingScreenKt.SwitchBackSection(this.$this_SwitchBackSection, this.$onClick, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void EncryptionSettingScreen(X.BRg r46, com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel r47, X.BFM r48, int r49, int r50) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.EncryptionSettingScreenKt.EncryptionSettingScreen(X.BRg, com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel, X.BFM, int, int):void");
    }

    public static final void SwitchBackSection(C07C c07c, Function0<Unit> function0, BFM bfm, int i) {
        bfm.AgG(1798038034);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            boolean zA1O = AnonymousClass001.A1O(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1O || objAaT == C78N.A00) {
                objAaT = new EncryptionSettingScreenKt$SwitchBackSection$1$1(function0);
                bfm.Ai0(objAaT);
            }
            HatchSectionKt.m2326HatchSectionuDo3WH8(c07c, true, null, 0L, (G0U) objAaT, bfm, (iA0d & 14) | 48, 6);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(c07c, function0, i);
        }
    }
}
