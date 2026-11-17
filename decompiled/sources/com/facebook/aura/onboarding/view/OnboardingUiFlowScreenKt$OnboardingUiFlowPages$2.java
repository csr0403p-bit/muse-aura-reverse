package com.facebook.aura.onboarding.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BFM;
import X.C06c;
import X.C78N;
import X.G0U;
import X.G2j;
import X.InterfaceC1497Ak4;
import X.InterfaceC7353EnQ;
import com.facebook.aura.onboarding.OnboardingTask;
import com.facebook.aura.onboarding.OnboardingUiFlowStep;
import com.facebook.aura.onboarding.OnboardingUiFlowUiState;
import com.facebook.aura.onboarding.OnboardingUiFlowViewModel;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class OnboardingUiFlowScreenKt$OnboardingUiFlowPages$2 extends AbstractC7559F3s implements G2j<C06c, OnboardingUiFlowStep, BFM, Integer, Unit> {
    public final /* synthetic */ Function0<Float> $exitProgress;
    public final /* synthetic */ boolean $isKeyboardVisible;
    public final /* synthetic */ float $nameAvatarSize;
    public final /* synthetic */ float $nameBottomInset;
    public final /* synthetic */ OnboardingNameReveal $nameReveal;
    public final /* synthetic */ G0U<InterfaceC1497Ak4, Unit> $onNameAvatarSlotPlaced;
    public final /* synthetic */ OnboardingUiFlowUiState $uiState;
    public final /* synthetic */ OnboardingUiFlowViewModel $viewModel;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OnboardingUiFlowScreenKt$OnboardingUiFlowPages$2(OnboardingUiFlowUiState onboardingUiFlowUiState, OnboardingNameReveal onboardingNameReveal, float f, boolean z, float f2, G0U<? super InterfaceC1497Ak4, Unit> g0u, OnboardingUiFlowViewModel onboardingUiFlowViewModel, Function0<Float> function0) {
        super(4);
        this.$uiState = onboardingUiFlowUiState;
        this.$nameReveal = onboardingNameReveal;
        this.$nameAvatarSize = f;
        this.$isKeyboardVisible = z;
        this.$nameBottomInset = f2;
        this.$onNameAvatarSlotPlaced = g0u;
        this.$viewModel = onboardingUiFlowViewModel;
        this.$exitProgress = function0;
    }

    public final void invoke(C06c c06c, OnboardingUiFlowStep onboardingUiFlowStep, BFM bfm, int i) {
        int iA09 = i;
        boolean zA1a = AnonymousClass002.A1a(c06c, onboardingUiFlowStep);
        if ((i & 48) == 0) {
            iA09 = i | AnonymousClass005.A09(bfm, onboardingUiFlowStep);
        }
        if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA09 & 145, VoiceCallForegroundService.AVATAR_TARGET_PX), bfm, iA09)) {
            bfm.Afo();
            return;
        }
        int iOrdinal = onboardingUiFlowStep.ordinal();
        if (iOrdinal == 0) {
            bfm.AgE(-1257867390);
            OnboardingUiFlowUiState onboardingUiFlowUiState = this.$uiState;
            String str = onboardingUiFlowUiState.userFirstName;
            boolean z = onboardingUiFlowUiState.isIdentityResolved;
            OnboardingNameReveal onboardingNameReveal = this.$nameReveal;
            float f = this.$nameAvatarSize;
            boolean z2 = this.$isKeyboardVisible;
            float f2 = this.$nameBottomInset;
            G0U<InterfaceC1497Ak4, Unit> g0u = this.$onNameAvatarSlotPlaced;
            String str2 = onboardingUiFlowUiState.agentName;
            AHD<String> ahd = onboardingUiFlowUiState.nameSuggestions;
            OnboardingUiFlowViewModel onboardingUiFlowViewModel = this.$viewModel;
            boolean zA67 = bfm.A67(onboardingUiFlowViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new OnboardingUiFlowScreenKt$OnboardingUiFlowPages$2$1$1(onboardingUiFlowViewModel);
                bfm.Ai0(objAaT);
            }
            G0U g0u2 = (G0U) ((InterfaceC7353EnQ) objAaT);
            OnboardingUiFlowViewModel onboardingUiFlowViewModel2 = this.$viewModel;
            boolean zA672 = bfm.A67(onboardingUiFlowViewModel2);
            Object objAaT2 = bfm.AaT();
            if (zA672 || objAaT2 == C78N.A00) {
                objAaT2 = new OnboardingUiFlowScreenKt$OnboardingUiFlowPages$2$2$1(onboardingUiFlowViewModel2);
                bfm.Ai0(objAaT2);
            }
            G0U g0u3 = (G0U) ((InterfaceC7353EnQ) objAaT2);
            OnboardingUiFlowViewModel onboardingUiFlowViewModel3 = this.$viewModel;
            boolean zA673 = bfm.A67(onboardingUiFlowViewModel3);
            Object objAaT3 = bfm.AaT();
            if (zA673 || objAaT3 == C78N.A00) {
                objAaT3 = new OnboardingUiFlowScreenKt$OnboardingUiFlowPages$2$3$1(onboardingUiFlowViewModel3);
                bfm.Ai0(objAaT3);
            }
            OnboardingUiFlowNameKt.m1618OnboardingUiFlowNameioSWKzA(str, z, onboardingNameReveal, f, z2, f2, g0u, str2, ahd, g0u2, g0u3, (Function0) ((InterfaceC7353EnQ) objAaT3), null, bfm, 0, 0, 4096);
        } else {
            if (iOrdinal != zA1a) {
                throw AnonymousClass005.A0k(bfm, -1257868789);
            }
            bfm.AgE(-1257844491);
            OnboardingUiFlowUiState onboardingUiFlowUiState2 = this.$uiState;
            AHD<OnboardingTask> ahd2 = onboardingUiFlowUiState2.ideas;
            String str3 = onboardingUiFlowUiState2.selectedIdeaId;
            boolean z3 = onboardingUiFlowUiState2.isLoadingIdeas;
            OnboardingUiFlowViewModel onboardingUiFlowViewModel4 = this.$viewModel;
            boolean zA674 = bfm.A67(onboardingUiFlowViewModel4);
            Object objAaT4 = bfm.AaT();
            if (zA674 || objAaT4 == C78N.A00) {
                objAaT4 = new OnboardingUiFlowScreenKt$OnboardingUiFlowPages$2$4$1(onboardingUiFlowViewModel4);
                bfm.Ai0(objAaT4);
            }
            G0U g0u4 = (G0U) ((InterfaceC7353EnQ) objAaT4);
            OnboardingUiFlowViewModel onboardingUiFlowViewModel5 = this.$viewModel;
            boolean zA675 = bfm.A67(onboardingUiFlowViewModel5);
            Object objAaT5 = bfm.AaT();
            if (zA675 || objAaT5 == C78N.A00) {
                objAaT5 = new OnboardingUiFlowScreenKt$OnboardingUiFlowPages$2$5$1(onboardingUiFlowViewModel5);
                bfm.Ai0(objAaT5);
            }
            OnboardingUiFlowIdeasKt.OnboardingUiFlowIdeas(ahd2, str3, z3, g0u4, (Function0) ((InterfaceC7353EnQ) objAaT5), null, this.$uiState.sentMessageId, this.$exitProgress, bfm, 0, 32);
        }
        AnonymousClass001.A1D(bfm);
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Unit invoke(C06c c06c, OnboardingUiFlowStep onboardingUiFlowStep, BFM bfm, Integer num) {
        invoke(c06c, onboardingUiFlowStep, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
