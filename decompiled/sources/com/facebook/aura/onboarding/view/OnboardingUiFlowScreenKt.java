package com.facebook.aura.onboarding.view;

import X.AKQ;
import X.ANR;
import X.AbstractC04540eo;
import X.AbstractC1396AiR;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B18;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPg;
import X.BRg;
import X.C00x;
import X.C01N;
import X.C0dm;
import X.C0v5;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1335AhM;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1D3;
import X.C1D8;
import X.C1DG;
import X.C1DM;
import X.C1EQ;
import X.C1OM;
import X.C1b8;
import X.C2CK;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C60P;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.HDi;
import X.HtJ;
import X.HxS;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1497Ak4;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import android.net.Uri;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.avatarsize.HatchAvatarSizeKt;
import com.facebook.aura.avatarsize.HatchAvatarSizeRepositoryKt;
import com.facebook.aura.common.video.HatchVideoPlayer;
import com.facebook.aura.common.video.HatchVideoPlayerComposableKt;
import com.facebook.aura.common.video.RememberHatchVideoPlayerKt;
import com.facebook.aura.identity.provider.HatchIdentityProvider;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.onboarding.GreetingVideoState;
import com.facebook.aura.onboarding.OnboardingAssetPrefetchRepoKt;
import com.facebook.aura.onboarding.OnboardingGreetingVideo;
import com.facebook.aura.onboarding.OnboardingUiFlowStep;
import com.facebook.aura.onboarding.OnboardingUiFlowUiState;
import com.facebook.aura.onboarding.OnboardingUiFlowViewModel;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class OnboardingUiFlowScreenKt {
    public static final float AvatarRenderSize = 184.0f;
    public static final float AvatarRevealBlur = 16.0f;
    public static final int AvatarRevealDurationMs = 220;
    public static final float AvatarRevealStartScale = 0.45f;
    public static final int GreetingVideoFadeMs = 200;
    public static final float IdeasContentGap = 20.0f;
    public static final float NameAvatarFallbackTop = 56.0f;
    public static final float NameAvatarKeyboardSize = 112.0f;
    public static final float NameAvatarSize = 184.0f;
    public static final float NamePillVerticalPadding = 8.0f;

    /* renamed from: com.facebook.aura.onboarding.view.OnboardingUiFlowScreenKt$OnboardingUiFlowEffects$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $isCompleted;
        public final /* synthetic */ G0U<HtJ<? super Unit>, Object> $onCompleting;
        public final /* synthetic */ OnboardingUiFlowViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(OnboardingUiFlowViewModel onboardingUiFlowViewModel, boolean z, G0U<? super HtJ<? super Unit>, ? extends Object> g0u, int i) {
            super(2);
            this.$viewModel = onboardingUiFlowViewModel;
            this.$isCompleted = z;
            this.$onCompleting = g0u;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            OnboardingUiFlowScreenKt.OnboardingUiFlowEffects(this.$viewModel, this.$isCompleted, this.$onCompleting, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.onboarding.view.OnboardingUiFlowScreenKt$OnboardingUiFlowGreetingVideo$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $url;
        public final /* synthetic */ OnboardingGreetingVideo $video;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(String str, OnboardingGreetingVideo onboardingGreetingVideo, BRg bRg, int i, int i2) {
            super(2);
            this.$url = str;
            this.$video = onboardingGreetingVideo;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            OnboardingUiFlowScreenKt.OnboardingUiFlowGreetingVideo(this.$url, this.$video, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.onboarding.view.OnboardingUiFlowScreenKt$OnboardingUiFlowNamePill$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $agentName;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$agentName = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            OnboardingUiFlowScreenKt.OnboardingUiFlowNamePill(this.$agentName, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.onboarding.view.OnboardingUiFlowScreenKt$OnboardingUiFlowPrimaryButton$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ OnboardingNameReveal $nameReveal;
        public final /* synthetic */ Function0<Unit> $onContinue;
        public final /* synthetic */ Function0<Unit> $onFinish;
        public final /* synthetic */ OnboardingUiFlowUiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(OnboardingUiFlowUiState onboardingUiFlowUiState, OnboardingNameReveal onboardingNameReveal, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$uiState = onboardingUiFlowUiState;
            this.$nameReveal = onboardingNameReveal;
            this.$onContinue = function0;
            this.$onFinish = function02;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            OnboardingUiFlowScreenKt.OnboardingUiFlowPrimaryButton(this.$uiState, this.$nameReveal, this.$onContinue, this.$onFinish, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.onboarding.view.OnboardingUiFlowScreenKt$OnboardingUiFlowScreen$5, reason: invalid class name and case insensitive filesystem */
    public final class C128025 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ OnboardingUiFlowViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128025(OnboardingUiFlowViewModel onboardingUiFlowViewModel, BRg bRg, int i, int i2) {
            super(2);
            this.$viewModel = onboardingUiFlowViewModel;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            OnboardingUiFlowScreenKt.OnboardingUiFlowScreen(this.$viewModel, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.onboarding.view.OnboardingUiFlowScreenKt$OnboardingUiFlowSkip$1, reason: invalid class name and case insensitive filesystem */
    public final class C128031 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onSkip;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128031(boolean z, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$enabled = z;
            this.$onSkip = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            OnboardingUiFlowScreenKt.OnboardingUiFlowSkip(this.$enabled, this.$onSkip, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.onboarding.view.OnboardingUiFlowScreenKt$OnboardingUiFlowStepButton$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C128042 extends AbstractC7559F3s implements G0V<BFM, Integer, C1822Arm> {
        public static final C128042 INSTANCE = new C128042();

        public C128042() {
            super(2);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ C1822Arm invoke(BFM bfm, Integer num) {
            return invoke(bfm, AnonymousClass001.A0F(num));
        }

        public final C1822Arm invoke(BFM bfm, int i) {
            bfm.AgE(-1313123234);
            C1822Arm action = OnboardingUiFlowTypography.INSTANCE.getAction(bfm, 6);
            AnonymousClass002.A19(bfm);
            return action;
        }
    }

    /* renamed from: com.facebook.aura.onboarding.view.OnboardingUiFlowScreenKt$OnboardingUiFlowStepButton$5, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C128055 extends AbstractC7559F3s implements G0V<BFM, Integer, C1822Arm> {
        public static final C128055 INSTANCE = new C128055();

        public C128055() {
            super(2);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ C1822Arm invoke(BFM bfm, Integer num) {
            return invoke(bfm, AnonymousClass001.A0F(num));
        }

        public final C1822Arm invoke(BFM bfm, int i) {
            bfm.AgE(995705237);
            C1822Arm action = OnboardingUiFlowTypography.INSTANCE.getAction(bfm, 6);
            AnonymousClass002.A19(bfm);
            return action;
        }
    }

    /* renamed from: com.facebook.aura.onboarding.view.OnboardingUiFlowScreenKt$OnboardingUiFlowStepButton$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ OnboardingNameReveal $nameReveal;
        public final /* synthetic */ Function0<Unit> $onContinue;
        public final /* synthetic */ Function0<Unit> $onFinish;
        public final /* synthetic */ OnboardingUiFlowUiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(OnboardingUiFlowUiState onboardingUiFlowUiState, OnboardingNameReveal onboardingNameReveal, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$uiState = onboardingUiFlowUiState;
            this.$nameReveal = onboardingNameReveal;
            this.$onContinue = function0;
            this.$onFinish = function02;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            OnboardingUiFlowScreenKt.OnboardingUiFlowStepButton(this.$uiState, this.$nameReveal, this.$onContinue, this.$onFinish, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final float rememberIdeasContentTop(BFM bfm, int i) {
        float fRememberAvatarSizeDp = HatchAvatarSizeKt.rememberAvatarSizeDp(HatchAvatarSizeRepositoryKt.rememberHatchAvatarSize(bfm, 0), bfm, 0);
        bfm.AgE(1261258053);
        float fAgw = ((C0dm) bfm.A6v(Am0.A04)).Agw(AuraTheme.INSTANCE.getTypography(bfm, 6).subheadlineEmphasized.A00.A04);
        AnonymousClass001.A1D(bfm);
        return ((14.0f + fRememberAvatarSizeDp) - HatchAvatarSizeKt.PillAvatarOverlap) + fAgw + (NamePillVerticalPadding * 2.0f) + IdeasContentGap;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OnboardingUiFlowStep.values().length];
            try {
                AnonymousClass002.A13(OnboardingUiFlowStep.NAME, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(OnboardingUiFlowStep.IDEAS, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0264  */
    /* renamed from: OnboardingUiFlowAvatar-eWuZFaY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1622OnboardingUiFlowAvatareWuZFaY(com.facebook.aura.onboarding.OnboardingUiFlowStep r40, float r41, float r42, java.lang.String r43, com.facebook.aura.onboarding.OnboardingGreetingVideo r44, boolean r45, java.lang.String r46, X.BRg r47, X.BFM r48, int r49, int r50) {
        /*
            Method dump skipped, instructions count: 711
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.onboarding.view.OnboardingUiFlowScreenKt.m1622OnboardingUiFlowAvatareWuZFaY(com.facebook.aura.onboarding.OnboardingUiFlowStep, float, float, java.lang.String, com.facebook.aura.onboarding.OnboardingGreetingVideo, boolean, java.lang.String, X.BRg, X.BFM, int, int):void");
    }

    /* renamed from: OnboardingUiFlowAvatarImage-EOp_iR4, reason: not valid java name */
    public static final void m1623OnboardingUiFlowAvatarImageEOp_iR4(String str, float f, long j, OnboardingGreetingVideo onboardingGreetingVideo, Function0<Float> function0, BRg bRg, BFM bfm, int i, int i2) {
        boolean z;
        String str2;
        BRg bRg2 = bRg;
        bfm.AgG(587177718);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A05(bfm, f);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0O(bfm, j);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, onboardingGreetingVideo);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, function0);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0d |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA0d |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0d, 74898), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA07 = C10G.A07(bRg2, f);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0D);
            BRg bRgA06 = C10G.A06(BRg.A00, AvatarRenderSize);
            boolean zA1C = AnonymousClass003.A1C(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1C || objAaT == C78N.A00) {
                objAaT = new OnboardingUiFlowScreenKt$OnboardingUiFlowAvatarImage$1$imageModifier$1$1(f);
                bfm.Ai0(objAaT);
            }
            BRg bRgA012 = C1b8.A01(AbstractC1396AiR.A00(bRgA06, (G0U) objAaT), j);
            if (str == null) {
                bfm.AgE(1479924440);
                AuraImageKt.AuraImage(HatchIdentityProvider.Companion.getInstance(AnonymousClass002.A0h(bfm)).rememberDefaultAvatarSource(null, bfm, HatchIdentityProvider.$stable << 3, 1), bRgA012, null, null, false, false, null, false, null, bfm, 196608, 476);
                BBI.A0R(bbi, false);
                z = false;
            } else {
                bfm.AgE(1480177493);
                z = false;
                AuraImageKt.m2573AuraImageXRP3Ue8(str, bRgA012, B18.A00, null, null, false, null, 0L, false, false, true, null, null, null, null, bfm, (iA0d & 14) | 805306752, 6, 31224);
                BBI.A0R(bbi, false);
            }
            if (onboardingGreetingVideo == null || (str2 = onboardingGreetingVideo.url) == null) {
                bfm.AgE(1480918610);
            } else {
                bfm.AgE(1480492887);
                C1BO c1boA02 = C2CK.A02(bfm, onboardingGreetingVideo.state);
                if (c1boA02.getValue() != GreetingVideoState.FAILED) {
                    boolean zA1Y = AnonymousClass001.A1Y(c1boA02, bfm, 1480614748);
                    if ((iA0d & 57344) == 16384) {
                        z = true;
                    }
                    boolean z2 = zA1Y | z;
                    Object objAaT2 = bfm.AaT();
                    if (z2 || objAaT2 == C78N.A00) {
                        objAaT2 = new OnboardingUiFlowScreenKt$OnboardingUiFlowAvatarImage$1$1$1(function0, c1boA02);
                        bfm.Ai0(objAaT2);
                    }
                    OnboardingUiFlowGreetingVideo(str2, onboardingGreetingVideo, AbstractC1396AiR.A00(bRgA012, (G0U) objAaT2), bfm, (iA0d >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 0);
                } else {
                    bfm.AgE(1480912658);
                }
                BBI.A0R(bbi, false);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new OnboardingUiFlowScreenKt$OnboardingUiFlowAvatarImage$2(str, f, j, onboardingGreetingVideo, function0, bRg2, i, i2);
        }
    }

    public static final void OnboardingUiFlowGreetingVideo(String str, OnboardingGreetingVideo onboardingGreetingVideo, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-803676019);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, onboardingGreetingVideo);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            HatchVideoPlayer hatchVideoPlayerRememberHatchVideoPlayer = RememberHatchVideoPlayerKt.rememberHatchVideoPlayer(HatchVideoPlayer.RepeatMode.ALL, false, false, bfm, 6, 6);
            boolean zA1M = AnonymousClass003.A1M(bfm, onboardingGreetingVideo, hatchVideoPlayerRememberHatchVideoPlayer);
            Object objAaT = bfm.AaT();
            if (zA1M || objAaT == C78N.A00) {
                objAaT = new OnboardingUiFlowScreenKt$OnboardingUiFlowGreetingVideo$1$1(hatchVideoPlayerRememberHatchVideoPlayer, onboardingGreetingVideo);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A19(bfm, objAaT, hatchVideoPlayerRememberHatchVideoPlayer, onboardingGreetingVideo);
            boolean z = (iA0d & 14) == 4;
            Object objAaT2 = bfm.AaT();
            if (z || objAaT2 == C78N.A00) {
                objAaT2 = Uri.parse(str);
                bfm.Ai0(objAaT2);
            }
            Uri uri = (Uri) objAaT2;
            C7384Etj.A0X(uri);
            HatchVideoPlayer.ResizeMode resizeMode = HatchVideoPlayer.ResizeMode.ZOOM;
            boolean zA67 = bfm.A67(onboardingGreetingVideo);
            Object objAaT3 = bfm.AaT();
            if (zA67 || objAaT3 == C78N.A00) {
                objAaT3 = new OnboardingUiFlowScreenKt$OnboardingUiFlowGreetingVideo$3$1(onboardingGreetingVideo);
                bfm.Ai0(objAaT3);
            }
            InterfaceC7353EnQ interfaceC7353EnQ = (InterfaceC7353EnQ) objAaT3;
            boolean zA672 = bfm.A67(onboardingGreetingVideo);
            Object objAaT4 = bfm.AaT();
            if (zA672 || objAaT4 == C78N.A00) {
                objAaT4 = new OnboardingUiFlowScreenKt$OnboardingUiFlowGreetingVideo$4$1(onboardingGreetingVideo);
                bfm.Ai0(objAaT4);
            }
            HatchVideoPlayerComposableKt.HatchVideoPlayerComposable(bRg2, uri, hatchVideoPlayerRememberHatchVideoPlayer, OnboardingAssetPrefetchRepoKt.GREETING_VIDEO_ASSET, null, null, false, false, false, false, false, false, resizeMode, 0.0f, "aura_onboarding_greeting_video", null, false, false, true, null, false, null, null, (G0U) objAaT4, (Function0) interfaceC7353EnQ, null, null, bfm, ((iA0d >> 6) & 14) | 100666368, 102261126, 0, 108702448);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass5(str, onboardingGreetingVideo, bRg2, i, i2);
        }
    }

    public static final void OnboardingUiFlowNamePill(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-757732576);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraColors colors = auraTheme.getColors(bfm, 6);
            C1D3 c1d3A00 = C1D8.A00(auraTheme.getDimensions(bfm, 6).bubbleCornerRadius);
            C1822Arm c1822Arm = auraTheme.getTypography(bfm, 6).subheadlineEmphasized;
            long j = colors.primaryText;
            long j2 = colors.shadow;
            AuraTextKt.m2639AuraTextUY9GdpU(str, C3U4.A0B(C1b8.A03(C11U.A03(AbstractC04540eo.A00(bRg2, c1d3A00, 8.0f, 4, j2, j2), c1d3A00), c1d3A00, colors.elevated), 12.0f, NamePillVerticalPadding), j, c1822Arm, null, null, null, false, 0, 1, 2, null, null, null, bfm, (iA0d & 14) | 805306368, 6, 14832);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(str, bRg2, i, i2);
        }
    }

    /* renamed from: OnboardingUiFlowPages-E4Q9ldg, reason: not valid java name */
    public static final void m1624OnboardingUiFlowPagesE4Q9ldg(OnboardingUiFlowUiState onboardingUiFlowUiState, OnboardingUiFlowViewModel onboardingUiFlowViewModel, OnboardingNameReveal onboardingNameReveal, float f, boolean z, float f2, G0U<? super InterfaceC1497Ak4, Unit> g0u, Function0<Float> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1876023450);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, onboardingUiFlowUiState) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, onboardingUiFlowViewModel);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, onboardingNameReveal);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A07(bfm, f);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0r(bfm, z);
        }
        if ((196608 & i) == 0) {
            iA0T |= AnonymousClass004.A09(bfm, f2);
        }
        if ((1572864 & i) == 0) {
            iA0T |= AnonymousClass004.A0Z(bfm, g0u);
        }
        if ((12582912 & i) == 0) {
            iA0T |= AnonymousClass004.A0a(bfm, function0);
        }
        int i3 = i2 & 256;
        int iA0l = 100663296;
        if (i3 != 0) {
            iA0T |= iA0l;
        } else if ((100663296 & i) == 0) {
            iA0l = AnonymousClass004.A0l(bfm, bRg2);
            iA0T |= iA0l;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(38347923 & iA0T, 38347922), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            OnboardingUiFlowStep onboardingUiFlowStep = onboardingUiFlowUiState.step;
            BRg bRgA0T = AnonymousClass001.A0T(bRg2);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = OnboardingUiFlowScreenKt$OnboardingUiFlowPages$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            ANR.A02(bfm, null, bRgA0T, onboardingUiFlowStep, "OnboardingUiFlowStep", (G0U) objAaT, null, B1V.A00(bfm, new OnboardingUiFlowScreenKt$OnboardingUiFlowPages$2(onboardingUiFlowUiState, onboardingNameReveal, f, z, f2, g0u, onboardingUiFlowViewModel, function0), -1780077892), 1597824, 40);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new OnboardingUiFlowScreenKt$OnboardingUiFlowPages$3(onboardingUiFlowUiState, onboardingUiFlowViewModel, onboardingNameReveal, f, z, f2, g0u, function0, bRg2, i, i2);
        }
    }

    public static final void OnboardingUiFlowPrimaryButton(OnboardingUiFlowUiState onboardingUiFlowUiState, OnboardingNameReveal onboardingNameReveal, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-76729132);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, onboardingUiFlowUiState) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, onboardingNameReveal);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0W(bfm, function02);
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
            long j = C3cH.A0W(bfm).highlight;
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            OnboardingUiFlowStep onboardingUiFlowStep = onboardingUiFlowUiState.step;
            OnboardingUiFlowStep onboardingUiFlowStep2 = OnboardingUiFlowStep.NAME;
            BRg bRgOnboardingNameEntrance = BRg.A00;
            if (onboardingUiFlowStep == onboardingUiFlowStep2) {
                bRgOnboardingNameEntrance = OnboardingUiFlowNameKt.onboardingNameEntrance(bRgOnboardingNameEntrance, onboardingNameReveal, 600);
            }
            BRg bRgThen2 = bRgThen.then(bRgOnboardingNameEntrance);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen2);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0U);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            BRg bRgA04 = C10G.A04(c1062ATq, AuraDimensKt.SpacingLargePlusMicro);
            C1335AhM c1335AhMA01 = C1EQ.A01(Arrays.asList(C60P.A04(HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), 0.0f)), C60P.A04(j)), 0.0f, Float.POSITIVE_INFINITY);
            C1DM c1dm = C1OM.A00;
            C01N.A07(bfm, C1b8.A02(bRgA04, c1335AhMA01, c1dm));
            BRg bRgA0B = C3U4.A0B(C1b8.A03(c1062ATq, c1dm, j), AuraDimensKt.SpacingMedium, AuraDimensKt.SpacingSmall);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0B);
            AnonymousClass005.A0n(bfm, bbi, function03);
            BPg.A02(bfm, interfaceC1380AiAA0c, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            OnboardingUiFlowStepButton(onboardingUiFlowUiState, onboardingNameReveal, function0, function02, C1b8.A03(c1062ATq, C1D8.A02(50), AuraTheme.INSTANCE.getColors(bfm, 6).card), bfm, iA0T & 8190, 0);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(onboardingUiFlowUiState, onboardingNameReveal, function0, function02, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0237  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void OnboardingUiFlowScreen(com.facebook.aura.onboarding.OnboardingUiFlowViewModel r40, X.BRg r41, X.BFM r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 836
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.onboarding.view.OnboardingUiFlowScreenKt.OnboardingUiFlowScreen(com.facebook.aura.onboarding.OnboardingUiFlowViewModel, X.BRg, X.BFM, int, int):void");
    }

    public static final void OnboardingUiFlowScreen$lambda$14(MutableState<C1DG> mutableState, float f) {
        mutableState.Af8(new C1DG(f));
    }

    public static final void OnboardingUiFlowSkip(boolean z, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-112829068);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0n |= 384;
        } else if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 147, 146), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d4a), C3U4.A09(C0v5.A04(bRg2, C3cG.A0A(0), null, function0, z), AuraDimensKt.SpacingMedium), C3cH.A07(bfm, AuraTheme.INSTANCE), OnboardingUiFlowTypography.INSTANCE.getAction(bfm, 6), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C128031(z, function0, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void OnboardingUiFlowStepButton(com.facebook.aura.onboarding.OnboardingUiFlowUiState r38, com.facebook.aura.onboarding.view.OnboardingNameReveal r39, kotlin.jvm.functions.Function0<kotlin.Unit> r40, kotlin.jvm.functions.Function0<kotlin.Unit> r41, X.BRg r42, X.BFM r43, int r44, int r45) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.onboarding.view.OnboardingUiFlowScreenKt.OnboardingUiFlowStepButton(com.facebook.aura.onboarding.OnboardingUiFlowUiState, com.facebook.aura.onboarding.view.OnboardingNameReveal, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.BRg, X.BFM, int, int):void");
    }

    public static final float OnboardingUiFlowAvatar_eWuZFaY$lambda$4(C1BO<C1DG> c1bo) {
        return c1bo.getValue().A00;
    }

    public static final float OnboardingUiFlowAvatar_eWuZFaY$lambda$5(C1BO<C1DG> c1bo) {
        return c1bo.getValue().A00;
    }

    public static final void OnboardingUiFlowEffects(OnboardingUiFlowViewModel onboardingUiFlowViewModel, boolean z, G0U<? super HtJ<? super Unit>, ? extends Object> g0u, BFM bfm, int i) {
        bfm.AgG(-2070062979);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, onboardingUiFlowViewModel) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass003.A05(AnonymousClass004.A1Z(g0u, bfm, i) ? 1 : 0);
        }
        boolean z2 = true;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 147, 146), bfm, iA0T)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d41);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zA1C = AnonymousClass003.A1C(iA0T);
            if ((iA0T & 896) != 256 && ((iA0T & 512) == 0 || !bfm.A67(g0u))) {
                z2 = false;
            }
            boolean zA1V = AnonymousClass002.A1V(bfm, auraNavigatorA0b, zA1C, z2);
            Object objAaT = bfm.AaT();
            if (zA1V || objAaT == C78N.A00) {
                objAaT = new OnboardingUiFlowScreenKt$OnboardingUiFlowEffects$1$1(z, g0u, auraNavigatorA0b, null);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A18(bfm, objAaT, boolValueOf);
            boolean zA1S = AnonymousClass004.A1S(bfm, strA01, auraNavigatorA0b, bfm.A67(onboardingUiFlowViewModel));
            Object objAaT2 = bfm.AaT();
            if (zA1S || objAaT2 == C78N.A00) {
                objAaT2 = new OnboardingUiFlowScreenKt$OnboardingUiFlowEffects$2$1(onboardingUiFlowViewModel, strA01, auraNavigatorA0b, null);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A18(bfm, objAaT2, onboardingUiFlowViewModel);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(onboardingUiFlowViewModel, z, g0u, i);
        }
    }

    public static final float OnboardingUiFlowScreen$lambda$13(MutableState<C1DG> mutableState) {
        return mutableState.getValue().A00;
    }

    public static final float OnboardingUiFlowScreen$lambda$5(C1BO<C1DG> c1bo) {
        return c1bo.getValue().A00;
    }

    public static final /* synthetic */ GreetingVideoState access$OnboardingUiFlowAvatarImage_EOp_iR4$lambda$0$1(C1BO c1bo) {
        return (GreetingVideoState) c1bo.getValue();
    }

    public static final /* synthetic */ OnboardingUiFlowUiState access$OnboardingUiFlowScreen$lambda$0(C1BO c1bo) {
        return (OnboardingUiFlowUiState) c1bo.getValue();
    }

    public static final /* synthetic */ InterfaceC1497Ak4 access$OnboardingUiFlowScreen$lambda$7(MutableState mutableState) {
        return (InterfaceC1497Ak4) mutableState.getValue();
    }
}
