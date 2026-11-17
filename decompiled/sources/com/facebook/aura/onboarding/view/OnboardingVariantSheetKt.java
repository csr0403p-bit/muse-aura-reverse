package com.facebook.aura.onboarding.view;

import X.AKL;
import X.AKQ;
import X.AbstractC1103AYp;
import X.AbstractC3358CGz;
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
import X.BO6;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C06H;
import X.C07C;
import X.C0881AGi;
import X.C1062ATq;
import X.C10G;
import X.C1110AYw;
import X.C1515AkP;
import X.C1822Arm;
import X.C1YL;
import X.C3U4;
import X.C3UX;
import X.C78N;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.app.Activity;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.onboarding.OnboardingStateManager;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.bottomsheet.model.AuraBottomSheetHeaderConfig;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.card.AuraCardContent;
import com.facebook.aura.vds.compose.card.AuraCardKt;
import com.facebook.aura.vds.compose.card.AuraCardStyle;
import com.facebook.aura.vds.compose.card.AuraCardType;
import com.facebook.aura.vds.compose.card.SettingsKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class OnboardingVariantSheetKt {

    /* renamed from: com.facebook.aura.onboarding.view.OnboardingVariantSheetKt$OnboardingVariantSheet$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ Activity $hostActivity;
        public final /* synthetic */ MutableState<Boolean> $isResetting$delegate;
        public final /* synthetic */ String $resetOnboardingTitle;
        public final /* synthetic */ String $resetWarning;
        public final /* synthetic */ C3UX $scope;
        public final /* synthetic */ MutableState<String> $selectedVariant$delegate;
        public final /* synthetic */ OnboardingStateManager $stateManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, OnboardingStateManager onboardingStateManager, C3UX c3ux, Activity activity, MutableState<Boolean> mutableState, MutableState<String> mutableState2) {
            super(2);
            this.$resetWarning = str;
            this.$resetOnboardingTitle = str2;
            this.$stateManager = onboardingStateManager;
            this.$scope = c3ux;
            this.$hostActivity = activity;
            this.$isResetting$delegate = mutableState;
            this.$selectedVariant$delegate = mutableState2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
                BS0 bs0 = BRg.A00;
                C1062ATq c1062ATq = C10G.A02;
                BRg bRgA07 = C3U4.A07(c1062ATq, AuraDimensKt.SpacingLarge);
                String str = this.$resetWarning;
                String str2 = this.$resetOnboardingTitle;
                OnboardingStateManager onboardingStateManager = this.$stateManager;
                C3UX c3ux = this.$scope;
                Activity activity = this.$hostActivity;
                MutableState<Boolean> mutableState = this.$isResetting$delegate;
                MutableState<String> mutableState2 = this.$selectedVariant$delegate;
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA07);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
                AuraTextKt.m2639AuraTextUY9GdpU(str, c1062ATq, AnonymousClass002.A0c(bfm).errorText, AnonymousClass002.A0f(bfm).footnoteEmphasized, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 54, 0, 16304);
                float f = AuraDimensKt.SpacingMedium;
                C01N.A08(bfm, bs0, f);
                AuraButtonSize auraButtonSize = AuraButtonSize.LARGE;
                AuraLabelButtonStyle auraLabelButtonStyleA0h = AnonymousClass006.A0h(bfm);
                boolean zA0A = MutableState.A0A((MutableState) mutableState);
                boolean z = !MutableState.A0A((MutableState) mutableState);
                boolean zA1S = AnonymousClass005.A1S(bfm, onboardingStateManager, c3ux, activity);
                Object objAaT = bfm.AaT();
                if (zA1S || objAaT == C78N.A00) {
                    objAaT = new OnboardingVariantSheetKt$OnboardingVariantSheet$2$1$1$1(onboardingStateManager, c3ux, mutableState, mutableState2, str2, activity);
                    bfm.Ai0(objAaT);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, str2, null, c1062ATq, auraLabelButtonStyleA0h, auraButtonSize, null, false, false, z, zA0A, false, null, null, (Function0) objAaT, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199728, 0, 0, 134199749);
                C01N.A04(bfm, bbi, bs0, f, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.onboarding.view.OnboardingVariantSheetKt$OnboardingVariantSheet$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ String $defaultVariantSubtitle;
        public final /* synthetic */ String $defaultVariantTitle;
        public final /* synthetic */ String $emptyVariantsText;
        public final /* synthetic */ MutableState<Boolean> $isLoading$delegate;
        public final /* synthetic */ MutableState<String> $selectedVariant$delegate;
        public final /* synthetic */ MutableState<List<String>> $variants$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, MutableState<Boolean> mutableState, String str2, String str3, MutableState<String> mutableState2, MutableState<List<String>> mutableState3) {
            super(3);
            this.$emptyVariantsText = str;
            this.$isLoading$delegate = mutableState;
            this.$defaultVariantTitle = str2;
            this.$defaultVariantSubtitle = str3;
            this.$selectedVariant$delegate = mutableState2;
            this.$variants$delegate = mutableState3;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
                BS0 bs0 = BRg.A00;
                C1062ATq c1062ATq = C10G.A02;
                BRg bRgA07 = C3U4.A07(c1062ATq, AuraDimensKt.SpacingLarge);
                String str = this.$emptyVariantsText;
                MutableState<Boolean> mutableState = this.$isLoading$delegate;
                String str2 = this.$defaultVariantTitle;
                String str3 = this.$defaultVariantSubtitle;
                MutableState<String> mutableState2 = this.$selectedVariant$delegate;
                MutableState<List<String>> mutableState3 = this.$variants$delegate;
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                BBI bbi = (BBI) bfm;
                long j = bbi.A06;
                int i2 = (int) (j ^ (j >>> 32));
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA07);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
                BPg.A02(bfm, interfaceC1380AiAA0U, g0v);
                G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
                G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i2);
                G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
                G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
                C90l c90l = C90l.A00;
                if (MutableState.A0A((MutableState) mutableState)) {
                    bfm.AgE(-119324056);
                    BRg bRgA04 = C10G.A04(c1062ATq, 80.0f);
                    InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
                    int iA0D = AnonymousClass001.A0D(bbi);
                    AKQ akqA042 = BBI.A04(bbi);
                    BRg bRgA012 = AxM.A01(bfm, bRgA04);
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    BPg.A02(bfm, interfaceC1380AiAA0a, g0v);
                    BPg.A02(bfm, akqA042, g0v2);
                    AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                    BPg.A02(bfm, bRgA012, g0vA0u);
                    AnonymousClass007.A0s(bfm, bbi);
                } else {
                    Object objA0p = AnonymousClass001.A0p(bfm, -119115209);
                    if (objA0p == C78N.A00) {
                        objA0p = new OnboardingVariantSheetKt$OnboardingVariantSheet$3$1$2$1(str2, str3, mutableState2, mutableState3);
                        bfm.Ai0(objA0p);
                    }
                    HatchSectionKt.m2326HatchSectionuDo3WH8(c90l, false, null, 0L, (G0U) objA0p, bfm, 24582, 7);
                    if (mutableState3.getValue().isEmpty()) {
                        bfm.AgE(-118402395);
                        C01N.A06(bfm, bs0);
                        AuraTextKt.m2639AuraTextUY9GdpU(str, null, C06G.A08(bfm), C06G.A0Y(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 6, 0, 16370);
                    } else {
                        bfm.AgE(-118165989);
                    }
                    BBI.A0R(bbi, false);
                }
                BBI.A0R(bbi, false);
                C01N.A03(bfm, bbi, bs0, AuraDimensKt.SpacingMedium);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.onboarding.view.OnboardingVariantSheetKt$OnboardingVariantSheet$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            OnboardingVariantSheetKt.OnboardingVariantSheet(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.onboarding.view.OnboardingVariantSheetKt$VariantRow$3, reason: invalid class name and case insensitive filesystem */
    public final class C128063 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $isSelected;
        public final /* synthetic */ Function0<Unit> $onSelected;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128063(String str, String str2, boolean z, Function0<Unit> function0, int i) {
            super(2);
            this.$title = str;
            this.$subtitle = str2;
            this.$isSelected = z;
            this.$onSelected = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            OnboardingVariantSheetKt.VariantRow(this.$title, this.$subtitle, this.$isSelected, this.$onSelected, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final void OnboardingVariantSheet(BFM bfm, int i) {
        bfm.AgG(-49769600);
        if (AnonymousClass001.A1b(AnonymousClass002.A1L(i), bfm, i)) {
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            Activity activity = (Activity) bfm.A6v(AKL.A00);
            boolean zA65 = bfm.A65(abstractC3358CGzA0h);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = OnboardingStateManager.Companion.getInstance(abstractC3358CGzA0h);
                bfm.Ai0(objAaT);
            }
            OnboardingStateManager onboardingStateManager = (OnboardingStateManager) objAaT;
            Object objAaT2 = bfm.AaT();
            Object obj = C78N.A00;
            C3UX c3ux = (C3UX) AnonymousClass004.A15(bfm, objAaT2, obj);
            C1110AYw c1110AYwA00 = AbstractC1103AYp.A00(0, bfm, 0, 1);
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = AnonymousClass004.A11(bfm, C0881AGi.A00);
            }
            MutableState mutableState = (MutableState) objAaT3;
            MutableState mutableState2 = (MutableState) AnonymousClass005.A0h(bfm, obj, true);
            MutableState mutableState3 = (MutableState) AnonymousClass005.A0h(bfm, obj, false);
            Object objAaT4 = bfm.AaT();
            if (objAaT4 == obj) {
                String selectedVariant = onboardingStateManager.getSelectedVariant();
                if (selectedVariant == null) {
                    selectedVariant = "";
                }
                objAaT4 = AnonymousClass004.A11(bfm, selectedVariant);
            }
            MutableState mutableState4 = (MutableState) objAaT4;
            Unit unit = Unit.INSTANCE;
            boolean zA67 = bfm.A67(abstractC3358CGzA0h);
            Object objAaT5 = bfm.AaT();
            if (zA67 || objAaT5 == obj) {
                objAaT5 = new OnboardingVariantSheetKt$OnboardingVariantSheet$1$1(abstractC3358CGzA0h, mutableState, mutableState2, null);
                bfm.Ai0(objAaT5);
            }
            AnonymousClass001.A18(bfm, objAaT5, unit);
            AuraBottomSheetContentKt.AuraBottomSheetContent(AuraContainer.SecondaryBottomSheet.INSTANCE, null, c1110AYwA00, new AuraBottomSheetHeaderConfig("Reset Onboarding", "Pick a variant to pin for the next completion, then reset.", null, null, null, AuraBottomSheetHeaderConfig.Style.DEFAULT, null), B1V.A00(bfm, new AnonymousClass2("Resetting Onboarding will clear your chat history", "Reset Onboarding", onboardingStateManager, c3ux, activity, mutableState3, mutableState4), -93370375), null, null, false, false, false, null, B1V.A00(bfm, new AnonymousClass3("No server-configured variants.", mutableState2, "Default", "Server picks the standard flow", mutableState4, mutableState), -1568278083), bfm, 24582, 48, 2018);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void VariantRow(String str, String str2, boolean z, Function0<Unit> function0, BFM bfm, int i) {
        bfm.AgG(-1769517494);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function0);
        }
        int i2 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            AuraCardType.Radio radio = AuraCardType.Radio.INSTANCE;
            AuraIconAndHeadlineStyle auraIconAndHeadlineStyle = null;
            Object[] objArr5 = 0;
            Object[] objArr6 = 0;
            Object[] objArr7 = 0;
            Object[] objArr8 = 0;
            Object[] objArr9 = 0;
            Object[] objArr10 = 0;
            Object[] objArr11 = 0;
            Object[] objArr12 = 0;
            Object[] objArr13 = 0;
            Object[] objArr14 = 0;
            Object[] objArr15 = 0;
            Object[] objArr16 = 0;
            C1062ATq c1062ATq = C10G.A02;
            AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
            C0881AGi c0881AGi = C0881AGi.A00;
            ApQ apQ = new ApQ(str, c0881AGi);
            ApQ apQ2 = str2 != null ? new ApQ(str2, c0881AGi) : null;
            long j = 0;
            AuraCardContent auraCardContent = new AuraCardContent(apQ, auraIconAndHeadlineStyle, (BO6) (objArr16 == true ? 1 : 0), (B6A) (objArr15 == true ? 1 : 0), apQ2, (G0U) (objArr14 == true ? 1 : 0), (AuraIconAndBodyStyle) (objArr13 == true ? 1 : 0), (B6A) (objArr12 == true ? 1 : 0), (String) (objArr11 == true ? 1 : 0), (C1822Arm) (objArr10 == true ? 1 : 0), i2, (int) (objArr4 == true ? 1 : 0), (int) (objArr3 == true ? 1 : 0), (String) (objArr9 == true ? 1 : 0), (boolean) (objArr2 == true ? 1 : 0), (boolean) (objArr == true ? 1 : 0), (ApQ) (objArr8 == true ? 1 : 0), (C1822Arm) (objArr7 == true ? 1 : 0), j, j, (C1YL) (objArr6 == true ? 1 : 0), 2097134, (C06H) (objArr5 == true ? 1 : 0));
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zA1D = AnonymousClass003.A1D(iA0d) | AnonymousClass003.A1E(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1D || objAaT == C78N.A00) {
                objAaT = new OnboardingVariantSheetKt$VariantRow$2$1(z, function0);
                bfm.Ai0(objAaT);
            }
            AuraCardKt.m2484AuraCardjQVUvHA(c1062ATq, auraCardStyleCardStyleForSettings, auraCardContent, radio, null, null, null, boolValueOf, (G0U) objAaT, null, false, false, null, null, 0L, false, null, null, bfm, ((iA0d << 15) & 29360128) | 3078, 0, 261744);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C128063(str, str2, z, function0, i);
        }
    }

    public static final /* synthetic */ List access$OnboardingVariantSheet$lambda$2(MutableState mutableState) {
        return (List) mutableState.getValue();
    }
}
