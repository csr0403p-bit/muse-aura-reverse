package com.facebook.aura.login.nativeflow;

import X.AHD;
import X.AKQ;
import X.AVy;
import X.AX9;
import X.AbstractC0878AGe;
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
import X.AxM;
import X.B18;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C11S;
import X.C1515AkP;
import X.C1822Arm;
import X.C19U;
import X.C1DG;
import X.C1SA;
import X.C1YD;
import X.C2VX;
import X.C3U4;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.header.view.HatchHeaderTitleAlignment;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.ui.adaptive.AuraContentRole;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class NativeLoginTwoFactorMethodScreenKt {

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginTwoFactorMethodScreenKt$NativeLoginTwoFactorMethodRadio$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $selected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$selected = z;
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
            NativeLoginTwoFactorMethodScreenKt.NativeLoginTwoFactorMethodRadio(this.$selected, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginTwoFactorMethodScreenKt$NativeLoginTwoFactorMethodRow$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ HatchTwoFactorMethod $method;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onSelect;
        public final /* synthetic */ boolean $selected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchTwoFactorMethod hatchTwoFactorMethod, boolean z, Function0<Unit> function0, boolean z2, BRg bRg, int i, int i2) {
            super(2);
            this.$method = hatchTwoFactorMethod;
            this.$selected = z;
            this.$onSelect = function0;
            this.$enabled = z2;
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
            NativeLoginTwoFactorMethodScreenKt.NativeLoginTwoFactorMethodRow(this.$method, this.$selected, this.$onSelect, this.$enabled, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginTwoFactorMethodScreenKt$NativeLoginTwoFactorMethodScreen$1, reason: invalid class name and case insensitive filesystem */
    public final class C125891 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ AHD<HatchTwoFactorMethod> $methods;
        public final /* synthetic */ G0U<HatchTwoFactorMethod, Unit> $onMethodSelected;
        public final /* synthetic */ HatchTwoFactorMethod $selectedMethod;
        public final /* synthetic */ MutableState<String> $selectedMethodId$delegate;
        public final /* synthetic */ HatchTwoFactorSourceApp $sourceApp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C125891(HatchTwoFactorSourceApp hatchTwoFactorSourceApp, AHD<HatchTwoFactorMethod> ahd, HatchTwoFactorMethod hatchTwoFactorMethod, MutableState<String> mutableState, boolean z, G0U<? super HatchTwoFactorMethod, Unit> g0u) {
            super(4);
            this.$sourceApp = hatchTwoFactorSourceApp;
            this.$methods = ahd;
            this.$selectedMethod = hatchTwoFactorMethod;
            this.$selectedMethodId$delegate = mutableState;
            this.$isLoading = z;
            this.$onMethodSelected = g0u;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1308invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0162  */
        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m1308invokei1RSzL4(float r56, float r57, X.BFM r58, int r59) {
            /*
                Method dump skipped, instructions count: 378
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginTwoFactorMethodScreenKt.C125891.m1308invokei1RSzL4(float, float, X.BFM, int):void");
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginTwoFactorMethodScreenKt$NativeLoginTwoFactorMethodScreen$2, reason: invalid class name and case insensitive filesystem */
    public final class C125902 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ AHD<HatchTwoFactorMethod> $methods;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ G0U<HatchTwoFactorMethod, Unit> $onMethodSelected;
        public final /* synthetic */ HatchTwoFactorSourceApp $sourceApp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C125902(AHD<HatchTwoFactorMethod> ahd, HatchTwoFactorSourceApp hatchTwoFactorSourceApp, G0U<? super HatchTwoFactorMethod, Unit> g0u, Function0<Unit> function0, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$methods = ahd;
            this.$sourceApp = hatchTwoFactorSourceApp;
            this.$onMethodSelected = g0u;
            this.$onBack = function0;
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
            NativeLoginTwoFactorMethodScreenKt.NativeLoginTwoFactorMethodScreen(this.$methods, this.$sourceApp, this.$onMethodSelected, this.$onBack, this.$isLoading, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void NativeLoginTwoFactorMethodRadio(boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-803898110);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0n |= 48;
        } else if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 19, 18), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            int i4 = z ? AnonymousClass006.A0j(bfm, 548035726).radioChecked : AnonymousClass006.A0j(bfm, 548037392).radioUnchecked;
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            AVy aVyA00 = BOf.A00(bfm, i4, 0);
            C2VX c2vx = B18.A04;
            long j = z ? AnonymousClass003.A0c(bfm, 548043144).accent : AnonymousClass003.A0c(bfm, 548044074).inactive;
            BBI.A0R(bbi, false);
            C1SA.A00(bfm, null, AnonymousClass001.A0S(bRg2), AnonymousClass002.A0S(j), aVyA00, c2vx, null, 0.0f, AVy.$stable | 24624, 40);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(z, bRg2, i, i2);
        }
    }

    public static final int methodSubtitleRes(HatchTwoFactorSourceApp hatchTwoFactorSourceApp) {
        int iOrdinal;
        if (hatchTwoFactorSourceApp == null || (iOrdinal = hatchTwoFactorSourceApp.ordinal()) == -1) {
            return R.string._name_removed__res_0x7f120532;
        }
        if (iOrdinal == 0) {
            return R.string._name_removed__res_0x7f120533;
        }
        if (iOrdinal == 1) {
            return R.string._name_removed__res_0x7f120534;
        }
        if (iOrdinal == 2) {
            return R.string._name_removed__res_0x7f120535;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* loaded from: classes2.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchTwoFactorSourceApp.values().length];
            try {
                AnonymousClass002.A13(HatchTwoFactorSourceApp.Facebook, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchTwoFactorSourceApp.Instagram, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HatchTwoFactorSourceApp.Meta, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void NativeLoginTwoFactorMethodRow(HatchTwoFactorMethod hatchTwoFactorMethod, boolean z, Function0<Unit> function0, boolean z2, BRg bRg, BFM bfm, int i, int i2) {
        BBI bbiA0M;
        String strA01;
        BRg bRg2 = bRg;
        bfm.AgG(-1053309403);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, hatchTwoFactorMethod) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0q(bfm, z2);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0T |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 9363, 9362), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (hatchTwoFactorMethod.type == HatchTwoFactorMethodType.RECOVERY_CODES) {
                bfm.AgE(-109100291);
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120531);
                bbiA0M = (BBI) bfm;
                BBI.A0R(bbiA0M, false);
            } else {
                bbiA0M = AnonymousClass002.A0M(bfm, -109001153);
                strA01 = hatchTwoFactorMethod.label;
            }
            BRg bRgA00 = C11S.A00(bRg2.then(new AX9(null, null, new C1YD(3), function0, z, false, z2)), z2 ? 1.0f : 0.3f);
            float f = AuraDimensKt.SpacingMedium;
            float f2 = AuraDimensKt.SpacingSmall;
            BRg bRgA0B = C3U4.A0B(bRgA00, f, f2);
            InterfaceC1380AiA interfaceC1380AiAA0K = AnonymousClass007.A0K(bfm, f2);
            int iA0J = AnonymousClass003.A0J(bbiA0M);
            AKQ akqA04 = BBI.A04(bbiA0M);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbiA0M.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA0M, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0K, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            String str = strA01;
            AuraTextKt.m2639AuraTextUY9GdpU(str, c90m.AiP(BRg.A00, 1.0f, true), C06G.A0C(bfm), C1822Arm.A00(null, C06G.A0T(bfm), null, null, null, null, null, null, null, null, 0, 0, 0, 16777087, 0L, 0L, C19U.A03(0), 0L), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            NativeLoginTwoFactorMethodRadio(z, null, bfm, (iA0T >> 3) & 14, 2);
            BBI.A0R(bbiA0M, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(hatchTwoFactorMethod, z, function0, z2, bRg2, i, i2);
        }
    }

    public static final void NativeLoginTwoFactorMethodScreen(AHD<HatchTwoFactorMethod> ahd, HatchTwoFactorSourceApp hatchTwoFactorSourceApp, G0U<? super HatchTwoFactorMethod, Unit> g0u, Function0<Unit> function0, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        Object next;
        BRg bRg2 = bRg;
        AnonymousClass005.A11(ahd, g0u, function0, 0);
        bfm.AgG(-483674545);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, ahd) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0E(bfm, AnonymousClass003.A0K(hatchTwoFactorSourceApp));
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, g0u);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0W(bfm, function0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0r(bfm, z);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0T |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA0T |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1A(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object[] objArr = new Object[0];
            boolean zA67 = bfm.A67(ahd);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new NativeLoginTwoFactorMethodScreenKt$NativeLoginTwoFactorMethodScreen$selectedMethodId$2$1(ahd);
                bfm.Ai0(objAaT);
            }
            MutableState mutableStateA0N = AnonymousClass002.A0N(bfm, objAaT, objArr);
            Iterator it = ahd.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (MutableState.A0B(mutableStateA0N, ((HatchTwoFactorMethod) next).id)) {
                        break;
                    }
                }
            }
            HatchTwoFactorMethod hatchTwoFactorMethod = (HatchTwoFactorMethod) next;
            if (hatchTwoFactorMethod == null) {
                hatchTwoFactorMethod = (HatchTwoFactorMethod) AbstractC0878AGe.A0G(ahd);
            }
            HatchPageScreenKt.m997HatchPageScreenZOcclw(AuraContainer.PrimaryScreen.INSTANCE, HatchImpressionModifierKt.hatchImpression(bRg2, HatchOrigin.ONBOARDING, HatchSurface.ONBOARDING, HatchSubsurface.ONBOARDING_PRE_AUTH, HatchScreen.LOGIN_OTP, HatchComponent.LOGIN_TWO_FACTOR_METHOD_LIST, null, null, null, 500L, 0.0f, null, null, null), AuraContentRole.Focused, 0L, null, null, function0, HatchHeaderTitleAlignment.CENTER, false, false, 0, null, null, null, null, null, null, 0L, 0L, null, NativeLoginCommonKt.NATIVE_LOGIN_HEADER_LOGO_CONTENT_TOP_SPACING, null, null, null, 0, ComposableSingletons$NativeLoginTwoFactorMethodScreenKt.f77lambda$797993990, null, null, false, B1V.A00(bfm, new C125891(hatchTwoFactorSourceApp, ahd, hatchTwoFactorMethod, mutableStateA0N, z, g0u), -1902996524), bfm, AnonymousClass006.A03(iA0T << 9), 0, 805502976, 502267704);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C125902(ahd, hatchTwoFactorSourceApp, g0u, function0, z, bRg2, i, i2);
        }
    }
}
