package com.facebook.aura.assist;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import java.io.File;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class AssistVoiceCameraKt$rememberAssistVoiceCameraLauncher$launchCamera$1$1 extends AbstractC7559F3s implements G0U<File, Unit> {
    public final /* synthetic */ MutableState<Long> $callAttemptGeneration$delegate;
    public final /* synthetic */ String $photoRequest;
    public final /* synthetic */ AssistVoicePhotoSender $sender;
    public final /* synthetic */ MutableState<String> $threadId$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(File file) {
        C7384Etj.A0Y(file, 0);
        this.$sender.sendPhoto(file, MutableState.A05(this.$threadId$delegate), C3cG.A05(this.$callAttemptGeneration$delegate.getValue()), this.$photoRequest);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistVoiceCameraKt$rememberAssistVoiceCameraLauncher$launchCamera$1$1(AssistVoicePhotoSender assistVoicePhotoSender, String str, MutableState<String> mutableState, MutableState<Long> mutableState2) {
        super(1);
        this.$sender = assistVoicePhotoSender;
        this.$photoRequest = str;
        this.$threadId$delegate = mutableState;
        this.$callAttemptGeneration$delegate = mutableState2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(File file) {
        invoke2(file);
        return Unit.INSTANCE;
    }
}
