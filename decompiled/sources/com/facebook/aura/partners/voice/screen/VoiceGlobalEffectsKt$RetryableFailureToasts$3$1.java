package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.G0V;
import com.facebook.aura.vds.toast.AuraToast;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceGlobalEffectsKt$RetryableFailureToasts$3$1 extends AbstractC7559F3s implements Function0<AuraToast.ToastArgs> {
    public final /* synthetic */ String $failureMessage;
    public final /* synthetic */ G0V<String, VoiceCallErrorToastReason, AuraToast.ToastArgs> $retryToast;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VoiceGlobalEffectsKt$RetryableFailureToasts$3$1(G0V<? super String, ? super VoiceCallErrorToastReason, AuraToast.ToastArgs> g0v, String str) {
        super(0);
        this.$retryToast = g0v;
        this.$failureMessage = str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final AuraToast.ToastArgs invoke() {
        return this.$retryToast.invoke(this.$failureMessage, VoiceCallErrorToastReason.GENERIC_FAILURE);
    }
}
