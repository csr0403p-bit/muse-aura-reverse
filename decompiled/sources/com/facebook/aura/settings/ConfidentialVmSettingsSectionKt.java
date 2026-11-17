package com.facebook.aura.settings;

import X.AKQ;
import X.AbstractC0885AGm;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B1U;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BQN;
import X.BRg;
import X.C00x;
import X.C0861A6i;
import X.C1515AkP;
import X.C1BO;
import X.C3U4;
import X.C5wL;
import X.C78N;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.common.ui.settings.HatchSettingsDescriptionKt;
import com.facebook.aura.permissions.defaults.ConfidentialVmSettings;
import com.facebook.aura.permissions.defaults.ConfidentialVmToggle;
import com.facebook.aura.settings.ConfidentialVmSettingsViewModel;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ConfidentialVmSettingsSectionKt {

    /* renamed from: com.facebook.aura.settings.ConfidentialVmSettingsSectionKt$ConfidentialVmSettingsSection$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $showHeading;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$showHeading = z;
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
            ConfidentialVmSettingsSectionKt.ConfidentialVmSettingsSection(this.$showHeading, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void ConfidentialVmSettingsSection(boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass2;
        B1U b1uA00;
        BRg bRg2 = bRg;
        bfm.AgG(251592602);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0n |= 48;
        } else if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 19, 18), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            ConfidentialVmSettingsViewModel.Factory factory = new ConfidentialVmSettingsViewModel.Factory(AnonymousClass002.A0h(bfm));
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            ConfidentialVmSettingsViewModel confidentialVmSettingsViewModel = (ConfidentialVmSettingsViewModel) BQN.A00(factory, bodA00, AnonymousClass005.A0Y(bodA00), null, new C0861A6i(ConfidentialVmSettingsViewModel.class));
            ConfidentialVmSettings confidentialVmSettings = (ConfidentialVmSettings) C1BO.A07(bfm, confidentialVmSettingsViewModel.uiState);
            if (confidentialVmSettings == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass2 = new ConfidentialVmSettingsSectionKt$ConfidentialVmSettingsSection$settings$1(z, bRg2, i, i2);
                    bBbAAc.A06 = anonymousClass2;
                }
                return;
            }
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
            } else {
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
                C90l c90l = C90l.A00;
                bfm.AgE(-699019289);
                int i4 = 0;
                for (Object obj : confidentialVmSettings.toggles) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        AbstractC0885AGm.A14();
                    } else {
                        ConfidentialVmToggle confidentialVmToggle = (ConfidentialVmToggle) obj;
                        String str = confidentialVmSettings.heading;
                        if (z && i4 == 0 && str != null) {
                            bfm.AgE(-500088917);
                            b1uA00 = B1V.A00(bfm, new ConfidentialVmSettingsSectionKt$ConfidentialVmSettingsSection$1$1$1$1(str), -1107230600);
                            BBI.A0R(bbi, false);
                        } else {
                            bfm.AgE(-500088918);
                            BBI.A0R(bbi, false);
                            b1uA00 = null;
                        }
                        boolean zA1M = AnonymousClass003.A1M(bfm, confidentialVmToggle, confidentialVmSettingsViewModel);
                        Object objAaT = bfm.AaT();
                        if (zA1M || objAaT == C78N.A00) {
                            objAaT = new ConfidentialVmSettingsSectionKt$ConfidentialVmSettingsSection$1$1$2$1(confidentialVmToggle, confidentialVmSettingsViewModel);
                            bfm.Ai0(objAaT);
                        }
                        HatchSectionKt.m2326HatchSectionuDo3WH8(c90l, false, b1uA00, 0L, (G0U) objAaT, bfm, 6, 5);
                        String str2 = confidentialVmToggle.description;
                        if (str2 == null) {
                            bfm.AgE(-499424495);
                        } else {
                            bfm.AgE(-499424494);
                            HatchSettingsDescriptionKt.HatchSettingsDescription(str2, C3U4.A06(BRg.A00, AuraDimensKt.SpacingXsmall), bfm, 0, 0);
                        }
                        BBI.A0R(bbi, false);
                        i4 = i5;
                    }
                }
                AnonymousClass003.A0q(bbi);
            }
            throw F60.createAndThrow();
        }
        bfm.Afo();
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass2 = new AnonymousClass2(z, bRg2, i, i2);
            bBbAAc.A06 = anonymousClass2;
        }
    }
}
