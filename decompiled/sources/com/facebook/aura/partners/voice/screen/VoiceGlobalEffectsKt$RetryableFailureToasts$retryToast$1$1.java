package com.facebook.aura.partners.voice.screen;

import X.AGH;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.G0U;
import X.G0V;
import android.view.View;
import com.facebook.aura.partners.voice.intf.VoiceCallStart;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import com.facebook.aura.vds.compose.toast.AuraToastOption;
import com.facebook.aura.vds.toast.AuraToast;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class VoiceGlobalEffectsKt$RetryableFailureToasts$retryToast$1$1 extends AbstractC7559F3s implements G0V<String, VoiceCallErrorToastReason, AuraToast.ToastArgs> {
    public final /* synthetic */ G0U<VoiceCallStart, Unit> $retryCall;
    public final /* synthetic */ String $retryLabel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VoiceGlobalEffectsKt$RetryableFailureToasts$retryToast$1$1(String str, G0U<? super VoiceCallStart, Unit> g0u) {
        super(2);
        this.$retryLabel = str;
        this.$retryCall = g0u;
    }

    @Override // X.G0V
    public final AuraToast.ToastArgs invoke(String str, final VoiceCallErrorToastReason voiceCallErrorToastReason) {
        boolean zA1a = AnonymousClass002.A1a(str, voiceCallErrorToastReason);
        AuraToastOption.Button button = new AuraToastOption.Button(this.$retryLabel, null, false, zA1a);
        AuraToast.Duration duration = AuraToast.Duration.LONG;
        final G0U<VoiceCallStart, Unit> g0u = this.$retryCall;
        return new AuraToast.ToastArgs(str, null, duration, null, button, new View.OnClickListener() { // from class: com.facebook.aura.partners.voice.screen.VoiceGlobalEffectsKt$RetryableFailureToasts$retryToast$1$1.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceCallErrorToastTelemetry.INSTANCE.logRetryTapped(voiceCallErrorToastReason);
                g0u.invoke(new VoiceCallStart(null, AGH.A0E()));
            }
        }, zA1a, null, AuraThemeMode.DEFAULT, null, null, false, false, null, null, null, AuraIconSize.MEDIUM, null);
    }
}
