package com.facebook.aura.onboarding.view;

import X.AKQ;
import X.ASZ;
import X.AbstractC0878AGe;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00r;
import X.C00x;
import X.C01N;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1497Ak4;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class OnboardingUiFlowNameKt$OnboardingUiFlowName$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ String $agentName;
    public final /* synthetic */ float $avatarSize;
    public final /* synthetic */ String $currentTitle;
    public final /* synthetic */ List<String> $nameSuggestions;
    public final /* synthetic */ G0U<String, Unit> $onAgentNameChange;
    public final /* synthetic */ G0U<InterfaceC1497Ak4, Unit> $onAvatarSlotPlaced;
    public final /* synthetic */ Function0<Unit> $onRegenerateName;
    public final /* synthetic */ G0U<String, Unit> $onSuggestionSelected;
    public final /* synthetic */ C00r $questionLines$delegate;
    public final /* synthetic */ TextRevealTiming $questionTiming;
    public final /* synthetic */ OnboardingNameReveal $reveal;
    public final /* synthetic */ C00r $titleLines$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OnboardingUiFlowNameKt$OnboardingUiFlowName$2(float f, G0U<? super InterfaceC1497Ak4, Unit> g0u, OnboardingNameReveal onboardingNameReveal, String str, TextRevealTiming textRevealTiming, String str2, G0U<? super String, Unit> g0u2, Function0<Unit> function0, List<String> list, G0U<? super String, Unit> g0u3, C00r c00r, C00r c00r2) {
        super(2);
        this.$avatarSize = f;
        this.$onAvatarSlotPlaced = g0u;
        this.$reveal = onboardingNameReveal;
        this.$currentTitle = str;
        this.$questionTiming = textRevealTiming;
        this.$agentName = str2;
        this.$onAgentNameChange = g0u2;
        this.$onRegenerateName = function0;
        this.$nameSuggestions = list;
        this.$onSuggestionSelected = g0u3;
        this.$titleLines$delegate = c00r;
        this.$questionLines$delegate = c00r2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            BS0 bs0 = BRg.A00;
            BRg bRgA07 = C3U4.A07(C10G.A02, AuraDimensKt.SpacingLargePlusMicro);
            C3TH c3th = C2VU.A00;
            float f = this.$avatarSize;
            G0U<InterfaceC1497Ak4, Unit> g0u = this.$onAvatarSlotPlaced;
            OnboardingNameReveal onboardingNameReveal = this.$reveal;
            String str = this.$currentTitle;
            TextRevealTiming textRevealTiming = this.$questionTiming;
            String str2 = this.$agentName;
            G0U<String, Unit> g0u2 = this.$onAgentNameChange;
            Function0<Unit> function0 = this.$onRegenerateName;
            List<String> list = this.$nameSuggestions;
            G0U<String, Unit> g0u3 = this.$onSuggestionSelected;
            C00r c00r = this.$titleLines$delegate;
            C00r c00r2 = this.$questionLines$delegate;
            InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass002.A0V(bfm, c3th);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0V, akqA04, bRgA01, iA02);
            C01N.A07(bfm, ASZ.A00(C10G.A07(bs0, f), g0u));
            float f2 = AuraDimensKt.SpacingLarge;
            C01N.A08(bfm, bs0, f2);
            String strA05 = MutableState.A05(onboardingNameReveal.title$delegate);
            if (strA05 == null) {
                strA05 = str;
            }
            boolean zA65 = bfm.A65(onboardingNameReveal);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new OnboardingUiFlowNameKt$OnboardingUiFlowName$2$1$1$1(onboardingNameReveal);
                bfm.Ai0(objAaT);
            }
            Function0 function03 = (Function0) objAaT;
            TextRevealTiming textRevealTiming2 = OnboardingUiFlowNameKt.GreetingTitleTiming;
            OnboardingUiFlowTypography onboardingUiFlowTypography = OnboardingUiFlowTypography.INSTANCE;
            C1822Arm title = onboardingUiFlowTypography.getTitle(bfm, 6);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            long jA06 = C3cH.A06(bfm, auraTheme);
            Object objAaT2 = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT2 == obj) {
                objAaT2 = new OnboardingUiFlowNameKt$OnboardingUiFlowName$2$1$2$1(c00r);
                bfm.Ai0(objAaT2);
            }
            int i2 = TextRevealTiming.$stable;
            OnboardingUiFlowTextRevealKt.m1630OnboardingUiFlowTextRevealNpZTi58(strA05, function03, textRevealTiming2, title, jA06, null, true, (G0U) objAaT2, bfm, (i2 << 6) | 14155776, 32);
            C01N.A05(bfm, bs0);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d49);
            boolean zA652 = bfm.A65(onboardingNameReveal);
            Object objAaT3 = bfm.AaT();
            if (zA652 || objAaT3 == obj) {
                objAaT3 = new OnboardingUiFlowNameKt$OnboardingUiFlowName$2$1$3$1(onboardingNameReveal);
                bfm.Ai0(objAaT3);
            }
            Function0 function04 = (Function0) objAaT3;
            C1822Arm greetingSubtitle = onboardingUiFlowTypography.getGreetingSubtitle(bfm, 6);
            long jA07 = C3cH.A07(bfm, auraTheme);
            Object objAaT4 = bfm.AaT();
            if (objAaT4 == obj) {
                objAaT4 = new OnboardingUiFlowNameKt$OnboardingUiFlowName$2$1$4$1(c00r2);
                bfm.Ai0(objAaT4);
            }
            OnboardingUiFlowTextRevealKt.m1630OnboardingUiFlowTextRevealNpZTi58(strA01, function04, textRevealTiming, greetingSubtitle, jA07, null, false, (G0U) objAaT4, bfm, (i2 << 6) | 12582912, 96);
            C01N.A08(bfm, bs0, f2);
            OnboardingUiFlowNameKt.OnboardingUiFlowNameField(str2, g0u2, function0, OnboardingUiFlowNameKt.onboardingNameEntrance(bs0, onboardingNameReveal, 300), bfm, 0, 0);
            C01N.A08(bfm, bs0, AuraDimensKt.SpacingMedium);
            OnboardingUiFlowNameKt.OnboardingUiFlowNameChips(AbstractC0878AGe.A0a(AbstractC0878AGe.A0Z(list, 1), 4), g0u3, OnboardingUiFlowNameKt.onboardingNameEntrance(bs0, onboardingNameReveal, 450), bfm, 0, 0);
            BBI.A0R(bbi, true);
            return;
        }
        bfm.Afo();
    }
}
