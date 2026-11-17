package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;

/* loaded from: classes.dex */
public final class HatchNodeDebugScreenKt$HatchNodeDebugScreen$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ boolean $isConnected;
    public final /* synthetic */ HatchNodeDebugViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchNodeDebugScreenKt$HatchNodeDebugScreen$1$1(boolean z, HatchNodeDebugViewModel hatchNodeDebugViewModel) {
        super(1);
        this.$isConnected = z;
        this.$viewModel = hatchNodeDebugViewModel;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (this.$isConnected) {
            this.$viewModel.fetchRemoteNodes();
        }
        return new C78g() { // from class: com.facebook.aura.settings.HatchNodeDebugScreenKt$HatchNodeDebugScreen$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
