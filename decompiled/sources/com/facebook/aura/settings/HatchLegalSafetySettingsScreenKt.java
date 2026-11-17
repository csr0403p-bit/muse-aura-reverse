package com.facebook.aura.settings;

import X.AKQ;
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
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C1515AkP;
import X.C1731ApS;
import X.C1736ApY;
import X.C1809ArT;
import X.C1824Aro;
import X.C1DG;
import X.C7384Etj;
import X.C78N;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.common.ui.settings.HatchSettingsDescriptionKt;
import com.facebook.aura.header.view.HatchBackClickAnalytics;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.utils.navigation.SecureUri;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.theme.AuraDimensionsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchLegalSafetySettingsScreenKt {

    /* renamed from: com.facebook.aura.settings.HatchLegalSafetySettingsScreenKt$HatchLegalSafetySettingsScreen$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ G0V<String, String, Unit> $onOpenLegalPage;
        public final /* synthetic */ boolean $showHatchSupplementalTerms;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(G0V<? super String, ? super String, Unit> g0v, boolean z) {
            super(4);
            this.$onOpenLegalPage = g0v;
            this.$showHatchSupplementalTerms = z;
        }

        public static final void invoke_i1RSzL4$openLegalPage(G0V<? super String, ? super String, Unit> g0v, SecureUri secureUri, String str) {
            HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.LEGAL_INFO, HatchScreen.LEGAL_INFO, HatchComponent.LEGAL_LINK, null, null, null);
            String string = secureUri.uri.toString();
            C7384Etj.A0U(string);
            g0v.invoke(string, str);
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1953invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m1953invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f13);
            String strA0v = AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120c57);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c55);
            String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c51);
            String strA014 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c53);
            String strA015 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c52);
            String strA016 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c54);
            String strA017 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c56);
            SecureUri museSupplementalPrivacyPolicyUri = AuraExternalUriRegistry.INSTANCE.getMuseSupplementalPrivacyPolicyUri();
            BS0 bs0 = BRg.A00;
            BRg bRgA0O = C06G.A0O(bfm, AnonymousClass006.A0M(bfm));
            G0V<String, String, Unit> g0v = this.$onOpenLegalPage;
            boolean z = this.$showHatchSupplementalTerms;
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0O);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            C90l c90l = C90l.A00;
            C01N.A08(bfm, bs0, f);
            long jA07 = C06G.A07(bfm);
            bfm.AgE(-53735084);
            C1731ApS c1731ApSA0W = AnonymousClass006.A0W();
            c1731ApSA0W.A0E(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c4f));
            c1731ApSA0W.A0E(InviteCodeScratcherKt.CODE_SEPARATOR);
            C1736ApY c1736ApY = C1736ApY.A03;
            long j = C1809ArT.A01;
            int iA02 = c1731ApSA0W.A02(new C1824Aro(null, null, null, null, null, c1736ApY, null, null, null, null, null, jA07, j, j, B6A.A07));
            try {
                c1731ApSA0W.A0E(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c50));
                c1731ApSA0W.A06(iA02);
                ApQ apQA04 = c1731ApSA0W.A04();
                BBI.A0R(bbi, false);
                boolean zA1K = AnonymousClass003.A1K(bfm, g0v, strA01);
                Object objAaT = bfm.AaT();
                if (zA1K || objAaT == C78N.A00) {
                    objAaT = new HatchLegalSafetySettingsScreenKt$HatchLegalSafetySettingsScreen$1$1$1$1(strA01, g0v);
                    bfm.Ai0(objAaT);
                }
                HatchSettingsDescriptionKt.HatchSettingsDescription(apQA04, null, (Function0) objAaT, bfm, 0, 2);
                C01N.A02(bfm, AuraDimensionsKt.LocalAuraDimensions, bs0);
                boolean zA1T = AnonymousClass005.A1T(bfm, strA015, strA016, strA017, AnonymousClass005.A1T(bfm, strA012, strA013, strA014, AnonymousClass005.A1X(bfm, g0v, museSupplementalPrivacyPolicyUri, bfm.A66(z), bfm.A65(strA0v))));
                Object objAaT2 = bfm.AaT();
                if (zA1T || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchLegalSafetySettingsScreenKt$HatchLegalSafetySettingsScreen$1$1$2$1(z, museSupplementalPrivacyPolicyUri, strA0v, g0v, strA012, strA013, strA014, strA015, strA016, strA017);
                    bfm.Ai0(objAaT2);
                }
                HatchSectionKt.m2326HatchSectionuDo3WH8(c90l, false, null, 0L, (G0U) objAaT2, bfm, 6, 7);
                C01N.A04(bfm, bbi, bs0, f2, true);
            } catch (Throwable th) {
                c1731ApSA0W.A06(iA02);
                throw th;
            }
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchLegalSafetySettingsScreenKt$HatchLegalSafetySettingsScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ G0V<String, String, Unit> $onOpenLegalPage;
        public final /* synthetic */ boolean $showHatchSupplementalTerms;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function0<Unit> function0, G0V<? super String, ? super String, Unit> g0v, BRg bRg, boolean z, int i, int i2) {
            super(2);
            this.$onBack = function0;
            this.$onOpenLegalPage = g0v;
            this.$modifier = bRg;
            this.$showHatchSupplementalTerms = z;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchLegalSafetySettingsScreenKt.HatchLegalSafetySettingsScreen(this.$onBack, this.$onOpenLegalPage, this.$modifier, this.$showHatchSupplementalTerms, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchLegalSafetySettingsScreen(Function0<Unit> function0, G0V<? super String, ? super String, Unit> g0v, BRg bRg, boolean z, BFM bfm, int i, int i2) {
        boolean z2 = z;
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(function0, g0v);
        bfm.AgG(1770168812);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, g0v);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0q(bfm, z2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z2 = true;
            }
            HatchPageScreenKt.m997HatchPageScreenZOcclw(AuraContainer.SecondaryScreen.INSTANCE, bRg2, null, 0L, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f13), null, function0, null, zA1b, zA1b, zA1b ? 1 : 0, null, null, null, null, null, null, 0L, 0L, null, 0.0f, null, null, null, zA1b ? 1 : 0, null, null, new HatchBackClickAnalytics(HatchSurface.SETTINGS, HatchScreen.LEGAL_INFO), zA1b, B1V.A00(bfm, new AnonymousClass1(g0v, z2), 596220593), bfm, AnonymousClass007.A03(iA0T >> 3, iA0T), zA1b ? 1 : 0, C06G.A02(), 402653100);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(function0, g0v, bRg2, z2, i, i2);
        }
    }
}
