package com.facebook.aura.login.nativeflow;

import X.AKQ;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06I;
import X.C10G;
import X.C1515AkP;
import X.C1DG;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.header.view.HatchHeaderTitleAlignment;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.login.nativeflow.HatchReTosScreen;
import com.facebook.aura.ui.adaptive.AuraContentRole;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class NativeLoginReTosProseScreenKt {

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginReTosProseScreenKt$NativeLoginReTosProseScreen$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ G0U<String, Unit> $onTosTokenTap;
        public final /* synthetic */ HatchReTosScreen.Prose $screen;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(HatchReTosScreen.Prose prose, G0U<? super String, Unit> g0u, Function0<Unit> function0, boolean z) {
            super(4);
            this.$screen = prose;
            this.$onTosTokenTap = g0u;
            this.$onConfirm = function0;
            this.$isLoading = z;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1305invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m1305invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            BS0 bs0 = BRg.A00;
            BRg bRgA0B = C3U4.A0B(AnonymousClass006.A0M(bfm), NativeLoginCommonKt.NATIVE_LOGIN_PAGE_GUTTER, 0.0f);
            C3TH c3th = C2VU.A00;
            HatchReTosScreen.Prose prose = this.$screen;
            G0U<String, Unit> g0u = this.$onTosTokenTap;
            Function0<Unit> function0 = this.$onConfirm;
            boolean z = this.$isLoading;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, c3th, 48);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i2 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, i2);
            C01N.A08(bfm, bs0, f);
            NativeLoginCommonKt.NativeLoginHero(prose.title, null, null, false, false, NativeLoginTitleStyle.TEXT_MEDIUM, bfm, 196608, 30);
            C01N.A08(bfm, bs0, AuraDimensKt.SpacingXsmall);
            NativeLoginTosDisclosureKt.m1307NativeLoginTosDisclosuregm0gx_Q(prose.clause, C3U4.A0B(C10G.A02, AuraDimensKt.SpacingMedium, 0.0f), 3, false, g0u, null, bfm, 3072, 32);
            C01N.A08(bfm, bs0, AuraDimensKt.SpacingXlarge);
            NativeLoginCommonKt.NativeLoginPrimaryButton(prose.confirmLabel, function0, null, !z, z, bfm, 0, 4);
            C01N.A04(bfm, bbi, bs0, f2, true);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginReTosProseScreenKt$NativeLoginReTosProseScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ G0U<String, Unit> $onTosTokenTap;
        public final /* synthetic */ HatchReTosScreen.Prose $screen;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(HatchReTosScreen.Prose prose, Function0<Unit> function0, G0U<? super String, Unit> g0u, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$screen = prose;
            this.$onConfirm = function0;
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
            NativeLoginReTosProseScreenKt.NativeLoginReTosProseScreen(this.$screen, this.$onConfirm, this.$onTosTokenTap, this.$isLoading, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void NativeLoginReTosProseScreen(HatchReTosScreen.Prose prose, Function0<Unit> function0, G0U<? super String, Unit> g0u, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AnonymousClass005.A10(prose, function0, g0u);
        bfm.AgG(1562937963);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, prose) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, g0u);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0q(bfm, z);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0T |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            HatchPageScreenKt.m997HatchPageScreenZOcclw(AuraContainer.PrimaryScreen.INSTANCE, HatchImpressionModifierKt.hatchImpression(bRg2, HatchOrigin.ONBOARDING, HatchSurface.ONBOARDING, HatchSubsurface.ONBOARDING_POST_AUTH, HatchScreen.ONBOARDING_RETOS, HatchComponent.RISK_DISCLOSURE, null, null, null, 500L, 0.0f, null, null, null), AuraContentRole.Focused, 0L, null, null, null, HatchHeaderTitleAlignment.HIDDEN, false, false, 0, null, null, null, null, null, null, 0L, 0L, null, NativeLoginCommonKt.NATIVE_LOGIN_CONTENT_TOP_SPACING, null, null, null, 0, null, null, null, false, B1V.A00(bfm, new AnonymousClass1(prose, g0u, function0, z), 358673968), bfm, 817889670, 0, 805306368, 535821688);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(prose, function0, g0u, z, bRg2, i, i2);
        }
    }
}
