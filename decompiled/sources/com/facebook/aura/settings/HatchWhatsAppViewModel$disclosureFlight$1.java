package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import com.facebook.aura.settings.WhatsAppConnectDisclosure;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class HatchWhatsAppViewModel$disclosureFlight$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ HatchWhatsAppViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchWhatsAppViewModel$disclosureFlight$1(HatchWhatsAppViewModel hatchWhatsAppViewModel) {
        super(0);
        this.this$0 = hatchWhatsAppViewModel;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(this.this$0._uiState.getValue().disclosure instanceof WhatsAppConnectDisclosure.Loaded);
    }
}
