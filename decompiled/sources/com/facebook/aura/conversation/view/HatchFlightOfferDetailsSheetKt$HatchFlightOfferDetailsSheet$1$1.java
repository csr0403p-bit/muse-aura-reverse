package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.navigation.AuraNavigator;

/* loaded from: classes2.dex */
public final class HatchFlightOfferDetailsSheetKt$HatchFlightOfferDetailsSheet$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchFlightOfferDetailsSheetKt$HatchFlightOfferDetailsSheet$1$1(AuraNavigator auraNavigator) {
        super(1);
        this.$navigator = auraNavigator;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$navigator.back();
        return new C78g() { // from class: com.facebook.aura.conversation.view.HatchFlightOfferDetailsSheetKt$HatchFlightOfferDetailsSheet$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
