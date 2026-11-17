package com.facebook.aura.partners.voice.screen;

import X.AGH;
import X.AbstractC7559F3s;
import X.C1BO;
import X.G0U;
import android.view.View;
import com.facebook.aura.partners.voice.intf.VoiceCallStart;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import com.facebook.aura.vds.compose.toast.AuraToastOption;
import com.facebook.aura.vds.toast.AuraToast;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceGlobalEffectsKt$OtherCallActiveToast$3$1 extends AbstractC7559F3s implements Function0<AuraToast.ToastArgs> {
    public final /* synthetic */ C1BO<G0U<VoiceCallStart, Unit>> $currentRetryCall$delegate;
    public final /* synthetic */ String $message;
    public final /* synthetic */ String $retryLabel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VoiceGlobalEffectsKt$OtherCallActiveToast$3$1(String str, String str2, C1BO<? extends G0U<? super VoiceCallStart, Unit>> c1bo) {
        super(0);
        this.$retryLabel = str;
        this.$message = str2;
        this.$currentRetryCall$delegate = c1bo;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final AuraToast.ToastArgs invoke() {
        AuraToastOption.Button button = new AuraToastOption.Button(this.$retryLabel, null, false, true);
        AuraToast.Duration duration = AuraToast.Duration.LONG;
        final C1BO<G0U<VoiceCallStart, Unit>> c1bo = this.$currentRetryCall$delegate;
        return new AuraToast.ToastArgs(this.$message, null, duration, null, button, new View.OnClickListener() { // from class: com.facebook.aura.partners.voice.screen.VoiceGlobalEffectsKt$OtherCallActiveToast$3$1.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceCallErrorToastTelemetry.INSTANCE.logRetryTapped(VoiceCallErrorToastReason.ALREADY_ON_CALL);
                C1BO.A0B(c1bo).invoke(new VoiceCallStart(null, AGH.A0E()));
            }
        }, true, null, AuraThemeMode.DEFAULT, null, null, false, false, null, null, null, AuraIconSize.MEDIUM, null);
    }
}
