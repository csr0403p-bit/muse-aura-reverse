package com.facebook.aura.login.nativeflow;

import X.AGI;
import X.AHD;
import X.AHI;
import X.AIW;
import X.AKQ;
import X.AbstractC0878AGe;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BO6;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C06I;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1DG;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.header.view.HatchHeaderTitleAlignment;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.login.nativeflow.HatchTosGroup;
import com.facebook.aura.ui.adaptive.AuraContentRole;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class NativeLoginLinkingDisclosureScreenKt {

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginLinkingDisclosureScreenKt$NativeLoginLinkingDisclosureScreen$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onDecline;
        public final /* synthetic */ G0U<String, Unit> $onTosTokenTap;
        public final /* synthetic */ NativeLoginLinkingDisclosureUiState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(NativeLoginLinkingDisclosureUiState nativeLoginLinkingDisclosureUiState, boolean z, Function0<Unit> function0, Function0<Unit> function02, G0U<? super String, Unit> g0u) {
            super(4);
            this.$state = nativeLoginLinkingDisclosureUiState;
            this.$isLoading = z;
            this.$onConfirm = function0;
            this.$onDecline = function02;
            this.$onTosTokenTap = g0u;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1296invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m1296invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA04), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            BS0 bs0 = BRg.A00;
            BRg bRgA07 = C3U4.A07(C10G.A01, NativeLoginCommonKt.NATIVE_LOGIN_PAGE_GUTTER);
            C3TH c3th = C2VU.A00;
            NativeLoginLinkingDisclosureUiState nativeLoginLinkingDisclosureUiState = this.$state;
            boolean z = this.$isLoading;
            Function0<Unit> function0 = this.$onConfirm;
            Function0<Unit> function02 = this.$onDecline;
            G0U<String, Unit> g0u = this.$onTosTokenTap;
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 48);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i2 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i2);
            G0U<InterfaceC1516AkQ, Unit> g0u2 = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u2);
            C90l c90l = C90l.A00;
            BRg bRgAiP = c90l.AiP(bs0, 1.0f, true);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA0H = AnonymousClass007.A0H(bfm, bRgAiP, c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, c3th, 48);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0H);
            AnonymousClass005.A0n(bfm, bbi, function03);
            BPg.A02(bfm, interfaceC1380AiAA002, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D);
            C01N.A0B(bfm, bs0, bRgA012, g0vA0u, f);
            HatchTosGroup.Prose prose = nativeLoginLinkingDisclosureUiState.prose;
            String strA0v = prose.pageTitle;
            if (strA0v == null && (strA0v = prose.title) == null) {
                bfm.AgE(-517010955);
                strA0v = AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f1204d5);
            } else {
                bfm.AgE(-517013621);
            }
            BBI.A0R(bbi, false);
            NativeLoginCommonKt.NativeLoginHero(strA0v, null, null, false, false, null, bfm, 0, 62);
            C01N.A06(bfm, bs0);
            boolean zA67 = bfm.A67(nativeLoginLinkingDisclosureUiState);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new NativeLoginLinkingDisclosureScreenKt$NativeLoginLinkingDisclosureScreen$1$1$1$1$1(nativeLoginLinkingDisclosureUiState);
                bfm.Ai0(objAaT);
            }
            AnonymousClass007.A0o(c90l, bfm, objAaT);
            C01N.A08(bfm, bs0, AuraDimensKt.SpacingLargePlusMicro);
            HatchTosGroup.Prose prose2 = nativeLoginLinkingDisclosureUiState.prose;
            NativeLoginTosDisclosureKt.NativeLoginTosProseBody(prose2.body, prose2.bodyRuns, null, bfm, 0, 4);
            BBI.A0R(bbi, true);
            C01N.A06(bfm, bs0);
            HatchTosDisclosure hatchTosDisclosure = nativeLoginLinkingDisclosureUiState.footer;
            if (hatchTosDisclosure == null) {
                bfm.AgE(-1546550159);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-1546550158);
                NativeLoginTosDisclosureKt.m1307NativeLoginTosDisclosuregm0gx_Q(hatchTosDisclosure, c1062ATq, 5, false, g0u, null, bfm, 3120, 32);
                C01N.A04(bfm, bbi, bs0, AuraDimensKt.SpacingXsmall, false);
            }
            String strA01 = nativeLoginLinkingDisclosureUiState.confirmLabel;
            if (strA01 == null) {
                bfm.AgE(-1296802829);
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1204a4);
            } else {
                bfm.AgE(-1296803511);
            }
            BBI.A0R(bbi, false);
            boolean z2 = !z;
            NativeLoginCommonKt.NativeLoginPrimaryButton(strA01, function0, null, z2, z, bfm, 0, 4);
            String strA012 = nativeLoginLinkingDisclosureUiState.declineLabel;
            if (strA012 == null) {
                bfm.AgE(-1296794618);
                strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1204d4);
            } else {
                bfm.AgE(-1296795858);
            }
            BBI.A0R(bbi, false);
            NativeLoginCommonKt.m1283NativeLoginTextLinkfWhpE4E(strA012, function02, null, C06G.A0C(bfm), C06G.A0W(bfm), z2, bfm, 0, 4);
            C01N.A04(bfm, bbi, bs0, f2, true);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginLinkingDisclosureScreenKt$NativeLoginLinkingDisclosureScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onDecline;
        public final /* synthetic */ G0U<String, Unit> $onTosTokenTap;
        public final /* synthetic */ NativeLoginLinkingDisclosureUiState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(NativeLoginLinkingDisclosureUiState nativeLoginLinkingDisclosureUiState, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, G0U<? super String, Unit> g0u, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$state = nativeLoginLinkingDisclosureUiState;
            this.$onConfirm = function0;
            this.$onDecline = function02;
            this.$onBack = function03;
            this.$onTosTokenTap = g0u;
            this.$isLoading = z;
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
            NativeLoginLinkingDisclosureScreenKt.NativeLoginLinkingDisclosureScreen(this.$state, this.$onConfirm, this.$onDecline, this.$onBack, this.$onTosTokenTap, this.$isLoading, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final NativeLoginLinkingDisclosureUiState linkingDisclosureFor(NativeLoginAccountUiModel nativeLoginAccountUiModel, HatchDisclosurePresentation hatchDisclosurePresentation, HatchTosDisclosure hatchTosDisclosure, HatchItemizedConsent hatchItemizedConsent) {
        HatchDisclosurePresentation hatchDisclosurePresentation2;
        HatchTosGroup.Prose proseProseGroup;
        AnonymousClass003.A0u(nativeLoginAccountUiModel, hatchDisclosurePresentation);
        if (!hatchDisclosurePresentation.isDrawnOnItsOwnScreen() || hatchTosDisclosure == null || ((hatchDisclosurePresentation == (hatchDisclosurePresentation2 = HatchDisclosurePresentation.ITEMIZED_CONSENT_SCREEN) && hatchItemizedConsent == null) || (proseProseGroup = proseGroup(hatchTosDisclosure)) == null)) {
            return null;
        }
        HatchTosGroup.Prose prose = settledOn(proseProseGroup, nativeLoginAccountUiModel);
        HatchTosDisclosure hatchTosDisclosure2 = settledOn(hatchTosDisclosure, prose);
        HatchTosDisclosure hatchTosDisclosure3 = null;
        if (!hatchTosDisclosure2.runs.isEmpty()) {
            hatchTosDisclosure3 = hatchTosDisclosure2;
        }
        return new NativeLoginLinkingDisclosureUiState(nativeLoginAccountUiModel, hatchDisclosurePresentation, prose, hatchTosDisclosure3, hatchTosDisclosure.contentVersion, proseProseGroup.confirmLabel, proseProseGroup.declineLabel, hatchDisclosurePresentation == hatchDisclosurePresentation2 ? hatchItemizedConsent : null);
    }

    public static final HatchTosGroup.Prose settledOn(HatchTosGroup.Prose prose, NativeLoginAccountUiModel nativeLoginAccountUiModel) {
        String str;
        String str2;
        AHD<HatchTosBodyRun> ahd;
        AHI ahi;
        String str3;
        HatchTosProseVariant hatchTosProseVariantVariantFor = NativeLoginTosDisclosureKt.variantFor(prose, nativeLoginAccountUiModel);
        if (hatchTosProseVariantVariantFor == null) {
            ahi = AHI.A01;
            str = prose.title;
            str3 = prose.subtitle;
            str2 = prose.body;
            ahd = prose.bodyRuns;
        } else {
            str = hatchTosProseVariantVariantFor.title;
            if (str == null) {
                str = prose.title;
            }
            str2 = hatchTosProseVariantVariantFor.body;
            ahd = hatchTosProseVariantVariantFor.bodyRuns;
            ahi = AHI.A01;
            str3 = prose.subtitle;
        }
        return prose.copy(str, str3, str2, ahd, ahi, prose.pageTitle, prose.confirmLabel, prose.declineLabel);
    }

    public static final void NativeLoginLinkingDisclosureScreen(NativeLoginLinkingDisclosureUiState nativeLoginLinkingDisclosureUiState, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, G0U<? super String, Unit> g0u, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(nativeLoginLinkingDisclosureUiState, 0);
        AnonymousClass005.A11(function0, function02, function03, 1);
        C7384Etj.A0Y(g0u, 4);
        bfm.AgG(-1490487742);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, nativeLoginLinkingDisclosureUiState) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, function02);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0W(bfm, function03);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0X(bfm, g0u);
        }
        if ((196608 & i) == 0) {
            iA0T |= AnonymousClass004.A0s(bfm, z);
        }
        int i3 = i2 & 64;
        int iA0j = 1572864;
        if (i3 != 0) {
            iA0T |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRg2);
            iA0T |= iA0j;
        }
        if (AnonymousClass001.A1b(AnonymousClass007.A1J(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            HatchPageScreenKt.m997HatchPageScreenZOcclw(AuraContainer.PrimaryScreen.INSTANCE, HatchImpressionModifierKt.hatchImpression(bRg2, HatchOrigin.ONBOARDING, HatchSurface.ONBOARDING, HatchSubsurface.ONBOARDING_PRE_AUTH, HatchScreen.LOGIN_LINKING_DISCLOSURE, HatchComponent.LOGIN_LINKING_DISCLOSURE_CARD, null, null, null, 500L, 0.0f, null, null, null), AuraContentRole.Focused, 0L, null, null, function03, HatchHeaderTitleAlignment.HIDDEN, false, false, 0, null, null, null, null, null, null, 0L, 0L, null, NativeLoginCommonKt.NATIVE_LOGIN_CONTENT_TOP_SPACING, null, null, null, 0, null, null, null, false, B1V.A00(bfm, new AnonymousClass1(nativeLoginLinkingDisclosureUiState, z, function0, function02, g0u), 2132849159), bfm, AnonymousClass006.A03(iA0T << 9), 0, 805306368, 535822136);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(nativeLoginLinkingDisclosureUiState, function0, function02, function03, g0u, z, bRg2, i, i2);
        }
    }

    public static /* synthetic */ NativeLoginLinkingDisclosureUiState linkingDisclosureFor$default(NativeLoginAccountUiModel nativeLoginAccountUiModel, HatchDisclosurePresentation hatchDisclosurePresentation, HatchTosDisclosure hatchTosDisclosure, HatchItemizedConsent hatchItemizedConsent, int i, Object obj) {
        if ((i & 8) != 0) {
            hatchItemizedConsent = null;
        }
        return linkingDisclosureFor(nativeLoginAccountUiModel, hatchDisclosurePresentation, hatchTosDisclosure, hatchItemizedConsent);
    }

    public static final HatchTosGroup.Prose proseGroup(HatchTosDisclosure hatchTosDisclosure) {
        Collection<HatchTosGroup> collectionValues = hatchTosDisclosure.groups.values();
        ArrayList arrayList = new ArrayList();
        for (HatchTosGroup hatchTosGroup : collectionValues) {
            if (hatchTosGroup instanceof HatchTosGroup.Prose) {
                arrayList.add(hatchTosGroup);
            }
        }
        return (HatchTosGroup.Prose) AbstractC0878AGe.A0G(arrayList);
    }

    public static final HatchTosDisclosure settledOn(HatchTosDisclosure hatchTosDisclosure, HatchTosGroup.Prose prose) {
        BO6<String, HatchTosGroup> bo6 = hatchTosDisclosure.groups;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AIW.A0H(bo6.size()));
        Iterator itA0n = AnonymousClass002.A0n(bo6);
        while (itA0n.hasNext()) {
            Map.Entry entry = (Map.Entry) itA0n.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof HatchTosGroup.Prose) {
                value = prose;
            }
            linkedHashMap.put(key, value);
        }
        return hatchTosDisclosure.copy(hatchTosDisclosure.runs, AGI.A08(linkedHashMap), hatchTosDisclosure.contentVersion);
    }
}
