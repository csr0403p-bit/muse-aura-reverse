package com.facebook.aura.assist;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C7OU;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.partners.voice.intf.Voice;
import com.facebook.aura.partners.voice.intf.VoiceMicPermissionLogger;
import com.facebook.aura.utils.HatchPermissionUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchAssistVoiceModeKt$HatchAssistVoiceMode$requestCall$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C7OU<String, Boolean> $microphonePermission;
    public final /* synthetic */ MutableState<Boolean> $permissionPending$delegate;
    public final /* synthetic */ AssistVoicePresentation $presentation;
    public final /* synthetic */ AbstractC3358CGz $session;
    public final /* synthetic */ Function0<Unit> $startCall;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAssistVoiceModeKt$HatchAssistVoiceMode$requestCall$1$1(AssistVoicePresentation assistVoicePresentation, AbstractC3358CGz abstractC3358CGz, Context context, Function0<Unit> function0, C7OU<String, Boolean> c7ou, MutableState<Boolean> mutableState) {
        super(0);
        this.$presentation = assistVoicePresentation;
        this.$session = abstractC3358CGz;
        this.$context = context;
        this.$startCall = function0;
        this.$microphonePermission = c7ou;
        this.$permissionPending$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (MutableState.A0A((MutableState) this.$permissionPending$delegate) || this.$presentation.getShowingVoice() || !Voice.INSTANCE.isCallSupported(this.$session)) {
            return;
        }
        boolean zHasPermission = HatchPermissionUtils.INSTANCE.hasPermission(this.$context, "android.permission.RECORD_AUDIO");
        VoiceMicPermissionLogger voiceMicPermissionLogger = VoiceMicPermissionLogger.INSTANCE;
        voiceMicPermissionLogger.logStatus(this.$context);
        if (zHasPermission) {
            this.$startCall.invoke();
            return;
        }
        voiceMicPermissionLogger.onPromptLaunched(this.$context, HatchScreen.VOICE_OVERLAY);
        MutableState.A09(true, this.$permissionPending$delegate);
        A02("android.permission.RECORD_AUDIO");
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
