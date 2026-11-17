package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.common.prefs.HatchDeveloperPrefs;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchWhatsAppSettingsScreenKt$WhatsAppConsentScreen$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchWhatsAppViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchWhatsAppSettingsScreenKt$WhatsAppConsentScreen$2$1(HatchWhatsAppViewModel hatchWhatsAppViewModel) {
        super(0);
        this.$viewModel = hatchWhatsAppViewModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.CHANNELS, HatchScreen.CHANNELS_WHATSAPP, HatchComponent.CONNECT_BUTTON, null, null, null);
        if (HatchDeveloperPrefs.whatsAppConnectionPreview.getValue() == HatchDeveloperPrefs.WhatsAppConnectionPreview.OFF) {
            this.$viewModel.connect(ChannelPairingEntryPoint.SETTINGS);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
