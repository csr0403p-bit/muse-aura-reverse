package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C0dx;
import X.C1BO;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.ConversationTabScreenKey;
import com.facebook.aura.partners.voice.gating.VoiceGating;
import com.facebook.aura.partners.voice.ui.VoiceHapticsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class VoiceCreationActionKt$rememberVoiceCreationAction$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $changeVoicePrompt;
    public final /* synthetic */ HatchConversationViewModel $conversationViewModel;
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnBeforeNavigate$delegate;
    public final /* synthetic */ C0dx $haptics;
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VoiceCreationActionKt$rememberVoiceCreationAction$1$1(C0dx c0dx, HatchConversationViewModel hatchConversationViewModel, String str, AuraNavigator auraNavigator, C1BO<? extends Function0<Unit>> c1bo) {
        super(0);
        this.$haptics = c0dx;
        this.$conversationViewModel = hatchConversationViewModel;
        this.$changeVoicePrompt = str;
        this.$navigator = auraNavigator;
        this.$currentOnBeforeNavigate$delegate = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (VoiceGating.INSTANCE.isVoiceDesignEnabled()) {
            VoiceHapticsKt.performClickHaptic(this.$haptics);
            C1BO.A0D(this.$currentOnBeforeNavigate$delegate);
            this.$conversationViewModel.setComposerText(this.$changeVoicePrompt);
            this.$conversationViewModel.requestComposerFocus();
            AuraNavigator auraNavigator = this.$navigator;
            ConversationTabScreenKey conversationTabScreenKey = ConversationTabScreenKey.INSTANCE;
            auraNavigator.popToTabRoot(conversationTabScreenKey);
            this.$navigator.navigate(conversationTabScreenKey, LaunchFlag.BRING_TO_FRONT);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
