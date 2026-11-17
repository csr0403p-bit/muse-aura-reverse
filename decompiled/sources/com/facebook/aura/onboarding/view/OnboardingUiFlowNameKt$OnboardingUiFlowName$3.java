package com.facebook.aura.onboarding.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import X.InterfaceC1497Ak4;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class OnboardingUiFlowNameKt$OnboardingUiFlowName$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ String $agentName;
    public final /* synthetic */ float $avatarSize;
    public final /* synthetic */ float $bottomInset;
    public final /* synthetic */ boolean $isKeyboardVisible;
    public final /* synthetic */ boolean $isRevealed;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ List<String> $nameSuggestions;
    public final /* synthetic */ G0U<String, Unit> $onAgentNameChange;
    public final /* synthetic */ G0U<InterfaceC1497Ak4, Unit> $onAvatarSlotPlaced;
    public final /* synthetic */ Function0<Unit> $onRegenerateName;
    public final /* synthetic */ G0U<String, Unit> $onSuggestionSelected;
    public final /* synthetic */ OnboardingNameReveal $reveal;
    public final /* synthetic */ String $userFirstName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OnboardingUiFlowNameKt$OnboardingUiFlowName$3(String str, boolean z, OnboardingNameReveal onboardingNameReveal, float f, boolean z2, float f2, G0U<? super InterfaceC1497Ak4, Unit> g0u, String str2, List<String> list, G0U<? super String, Unit> g0u2, G0U<? super String, Unit> g0u3, Function0<Unit> function0, BRg bRg, int i, int i2, int i3) {
        super(2);
        this.$userFirstName = str;
        this.$isRevealed = z;
        this.$reveal = onboardingNameReveal;
        this.$avatarSize = f;
        this.$isKeyboardVisible = z2;
        this.$bottomInset = f2;
        this.$onAvatarSlotPlaced = g0u;
        this.$agentName = str2;
        this.$nameSuggestions = list;
        this.$onAgentNameChange = g0u2;
        this.$onSuggestionSelected = g0u3;
        this.$onRegenerateName = function0;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        OnboardingUiFlowNameKt.m1618OnboardingUiFlowNameioSWKzA(this.$userFirstName, this.$isRevealed, this.$reveal, this.$avatarSize, this.$isKeyboardVisible, this.$bottomInset, this.$onAvatarSlotPlaced, this.$agentName, this.$nameSuggestions, this.$onAgentNameChange, this.$onSuggestionSelected, this.$onRegenerateName, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}
