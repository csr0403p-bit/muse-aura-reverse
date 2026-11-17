package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import com.facebook.aura.vds.compose.toast.AuraToastOption;
import com.facebook.aura.vds.toast.AuraToast;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceGlobalEffectsKt$LiveAvatarUnavailableToast$3$1 extends AbstractC7559F3s implements Function0<AuraToast.ToastArgs> {
    public final /* synthetic */ MutableState<String> $avatar$delegate;
    public final /* synthetic */ String $message;
    public final /* synthetic */ VoiceCallStateHolder $voiceCallStateHolder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceGlobalEffectsKt$LiveAvatarUnavailableToast$3$1(VoiceCallStateHolder voiceCallStateHolder, String str, MutableState<String> mutableState) {
        super(0);
        this.$voiceCallStateHolder = voiceCallStateHolder;
        this.$message = str;
        this.$avatar$delegate = mutableState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final AuraToast.ToastArgs invoke() {
        String strA05 = MutableState.A05(this.$avatar$delegate);
        if (strA05 != null) {
            this.$voiceCallStateHolder.onLiveAvatarUnavailableShown(strA05);
        }
        return new AuraToast.ToastArgs(this.$message, null, AuraToast.Duration.SHORT, null, AuraToastOption.None.INSTANCE, null, false, null, AuraThemeMode.DEFAULT, null, null, false, false, null, null, null, AuraIconSize.MEDIUM, null);
    }
}
