package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;

/* loaded from: classes.dex */
public final class HatchMessengerSettingsScreenKt$HatchMessengerSettingsScreen$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ boolean $initialIsLinked;
    public final /* synthetic */ HatchMessengerViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessengerSettingsScreenKt$HatchMessengerSettingsScreen$1$1(HatchMessengerViewModel hatchMessengerViewModel, boolean z) {
        super(1);
        this.$viewModel = hatchMessengerViewModel;
        this.$initialIsLinked = z;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$viewModel.onScreenShown(this.$initialIsLinked);
        return new C78g() { // from class: com.facebook.aura.settings.HatchMessengerSettingsScreenKt$HatchMessengerSettingsScreen$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
