package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;

/* loaded from: classes.dex */
public final class HatchWhatsAppSettingsScreenKt$WhatsAppConsentScreen$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ HatchWhatsAppViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchWhatsAppSettingsScreenKt$WhatsAppConsentScreen$1$1(HatchWhatsAppViewModel hatchWhatsAppViewModel) {
        super(1);
        this.$viewModel = hatchWhatsAppViewModel;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$viewModel.loadDisclosure();
        return new C78g() { // from class: com.facebook.aura.settings.HatchWhatsAppSettingsScreenKt$WhatsAppConsentScreen$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
