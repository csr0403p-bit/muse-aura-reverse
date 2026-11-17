package com.facebook.aura.assist;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C3cH;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class AssistVoiceCameraKt$rememberAssistVoiceCameraLauncher$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Long> $callAttemptGeneration$delegate;
    public final /* synthetic */ VoiceCallStateHolder $holder;
    public final /* synthetic */ Function0<Unit> $launchCamera;
    public final /* synthetic */ AssistVoicePhotoSender $sender;
    public final /* synthetic */ MutableState<String> $threadId$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistVoiceCameraKt$rememberAssistVoiceCameraLauncher$1$1(VoiceCallStateHolder voiceCallStateHolder, AssistVoicePhotoSender assistVoicePhotoSender, Function0<Unit> function0, MutableState<String> mutableState, MutableState<Long> mutableState2) {
        super(0);
        this.$holder = voiceCallStateHolder;
        this.$sender = assistVoicePhotoSender;
        this.$launchCamera = function0;
        this.$threadId$delegate = mutableState;
        this.$callAttemptGeneration$delegate = mutableState2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        VoiceCallStateHolder voiceCallStateHolder = this.$holder;
        AssistVoicePhotoSender assistVoicePhotoSender = this.$sender;
        Function0<Unit> function0 = this.$launchCamera;
        MutableState<String> mutableState = this.$threadId$delegate;
        MutableState<Long> mutableState2 = this.$callAttemptGeneration$delegate;
        synchronized (voiceCallStateHolder) {
            if (voiceCallStateHolder.canAcceptInput() && !C3cH.A1R(assistVoicePhotoSender.isSending)) {
                mutableState.Af8(C3cG.A0c(voiceCallStateHolder));
                AssistVoiceCameraKt.rememberAssistVoiceCameraLauncher$lambda$8(mutableState2, C3cH.A09(voiceCallStateHolder.callAttemptGeneration));
                function0.invoke();
            }
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
