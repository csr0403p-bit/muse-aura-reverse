package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.model.VoiceOptionData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchVoiceOptionsWidgetKt$VoiceChooseButton$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $label;
    public final /* synthetic */ String $message;
    public final /* synthetic */ HatchScreen $screen;
    public final /* synthetic */ VoiceOptionsWidgetState $state;
    public final /* synthetic */ VoiceOptionData $voice;

    /* renamed from: com.facebook.aura.partners.voice.screen.HatchVoiceOptionsWidgetKt$VoiceChooseButton$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ String $message;
        public final /* synthetic */ VoiceOptionsWidgetState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(VoiceOptionsWidgetState voiceOptionsWidgetState, String str) {
            super(0);
            this.$state = voiceOptionsWidgetState;
            this.$message = str;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$state.onSendSwitchVoiceMessage.invoke(this.$message);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVoiceOptionsWidgetKt$VoiceChooseButton$1$1(VoiceOptionData voiceOptionData, VoiceOptionsWidgetState voiceOptionsWidgetState, String str, HatchScreen hatchScreen, String str2) {
        super(0);
        this.$voice = voiceOptionData;
        this.$state = voiceOptionsWidgetState;
        this.$label = str;
        this.$screen = hatchScreen;
        this.$message = str2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        VoiceOptionData voiceOptionData = this.$voice;
        if (voiceOptionData != null) {
            VoiceOptionsWidgetState voiceOptionsWidgetState = this.$state;
            voiceOptionsWidgetState.viewModel.onWidgetVoiceChosen(voiceOptionsWidgetState.widgetStateMutationHost, voiceOptionsWidgetState.hostMessageId, voiceOptionsWidgetState.widget.widgetId, voiceOptionData.voiceId, this.$label, this.$screen, new AnonymousClass1(voiceOptionsWidgetState, this.$message));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
