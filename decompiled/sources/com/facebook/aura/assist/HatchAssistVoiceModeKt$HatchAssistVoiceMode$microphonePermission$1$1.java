package com.facebook.aura.assist;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.partners.voice.intf.VoiceMicPermissionLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchAssistVoiceModeKt$HatchAssistVoiceMode$microphonePermission$1$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ MutableState<Boolean> $permissionPending$delegate;
    public final /* synthetic */ Function0<Unit> $startCall;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAssistVoiceModeKt$HatchAssistVoiceMode$microphonePermission$1$1(Function0<Unit> function0, MutableState<Boolean> mutableState) {
        super(1);
        this.$startCall = function0;
        this.$permissionPending$delegate = mutableState;
    }

    public final void invoke(boolean z) {
        MutableState.A09(false, this.$permissionPending$delegate);
        VoiceMicPermissionLogger.INSTANCE.logDecision(z);
        if (z) {
            this.$startCall.invoke();
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
