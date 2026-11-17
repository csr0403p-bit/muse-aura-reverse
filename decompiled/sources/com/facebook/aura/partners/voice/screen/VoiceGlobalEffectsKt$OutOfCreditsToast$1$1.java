package com.facebook.aura.partners.voice.screen;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C1BO;
import android.view.View;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import com.facebook.aura.vds.compose.toast.AuraToastOption;
import com.facebook.aura.vds.toast.AuraToast;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class VoiceGlobalEffectsKt$OutOfCreditsToast$1$1 extends AbstractC7559F3s implements Function0<AuraToast.ToastArgs> {
    public final /* synthetic */ String $message;
    public final /* synthetic */ C1BO<AuraNavigator> $navigator$delegate;
    public final /* synthetic */ String $upgradeLabel;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VoiceGlobalEffectsKt$OutOfCreditsToast$1$1(String str, String str2, AbstractC3358CGz abstractC3358CGz, C1BO<? extends AuraNavigator> c1bo) {
        super(0);
        this.$upgradeLabel = str;
        this.$message = str2;
        this.$userSession = abstractC3358CGz;
        this.$navigator$delegate = c1bo;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final AuraToast.ToastArgs invoke() {
        AuraToastOption.Button button = new AuraToastOption.Button(this.$upgradeLabel, null, false, true);
        AuraToast.Duration duration = AuraToast.Duration.LONG;
        final AbstractC3358CGz abstractC3358CGz = this.$userSession;
        final C1BO<AuraNavigator> c1bo = this.$navigator$delegate;
        return new AuraToast.ToastArgs(this.$message, null, duration, null, button, new View.OnClickListener() { // from class: com.facebook.aura.partners.voice.screen.VoiceGlobalEffectsKt$OutOfCreditsToast$1$1.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceCallStarterKt.openOutOfCreditsSheet(c1bo.getValue(), abstractC3358CGz, HatchComponent.UPGRADE_BUTTON, VoiceCallErrorToastTelemetry.INSTANCE.errorTypeMetadata(VoiceCallErrorToastReason.OUT_OF_CREDITS));
            }
        }, true, null, AuraThemeMode.DEFAULT, null, null, false, false, null, null, null, AuraIconSize.MEDIUM, null);
    }
}
