package com.facebook.aura.appupdate;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;

/* loaded from: classes4.dex */
public final class PlayInAppUpdateEffectKt$PlayInAppUpdateEffect$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ AuraPlayUpdateController $controller;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayInAppUpdateEffectKt$PlayInAppUpdateEffect$2$1(AuraPlayUpdateController auraPlayUpdateController) {
        super(1);
        this.$controller = auraPlayUpdateController;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$controller.startListening();
        final AuraPlayUpdateController auraPlayUpdateController = this.$controller;
        return new C78g() { // from class: com.facebook.aura.appupdate.PlayInAppUpdateEffectKt$PlayInAppUpdateEffect$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                auraPlayUpdateController.dispose();
            }
        };
    }
}
