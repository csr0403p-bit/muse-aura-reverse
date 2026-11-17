package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import com.facebook.aura.common.prefs.HatchDeveloperPrefs;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchWhatsAppSettingsScreenKt$WhatsAppConnectedScreen$4$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchWhatsAppViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchWhatsAppSettingsScreenKt$WhatsAppConnectedScreen$4$1(HatchWhatsAppViewModel hatchWhatsAppViewModel) {
        super(0);
        this.$viewModel = hatchWhatsAppViewModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchDeveloperPrefs.WhatsAppConnectionPreview value = HatchDeveloperPrefs.whatsAppConnectionPreview.getValue();
        HatchDeveloperPrefs.WhatsAppConnectionPreview whatsAppConnectionPreview = HatchDeveloperPrefs.WhatsAppConnectionPreview.OFF;
        HatchWhatsAppViewModel hatchWhatsAppViewModel = this.$viewModel;
        if (value != whatsAppConnectionPreview) {
            hatchWhatsAppViewModel.dismissDisconnectDialog();
        } else {
            hatchWhatsAppViewModel.disconnect();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
