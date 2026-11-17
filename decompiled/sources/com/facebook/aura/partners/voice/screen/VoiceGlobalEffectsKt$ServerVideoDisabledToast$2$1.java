package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import com.facebook.aura.vds.compose.toast.AuraToastOption;
import com.facebook.aura.vds.toast.AuraToast;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class VoiceGlobalEffectsKt$ServerVideoDisabledToast$2$1 extends AbstractC7559F3s implements Function0<AuraToast.ToastArgs> {
    public final /* synthetic */ String $message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceGlobalEffectsKt$ServerVideoDisabledToast$2$1(String str) {
        super(0);
        this.$message = str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final AuraToast.ToastArgs invoke() {
        return new AuraToast.ToastArgs(this.$message, null, AuraToast.Duration.SHORT, null, AuraToastOption.None.INSTANCE, null, false, null, AuraThemeMode.DEFAULT, null, null, false, false, null, null, null, AuraIconSize.MEDIUM, null);
    }
}
