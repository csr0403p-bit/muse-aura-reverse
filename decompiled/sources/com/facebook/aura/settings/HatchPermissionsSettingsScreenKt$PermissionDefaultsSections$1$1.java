package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;

/* loaded from: classes3.dex */
public final class HatchPermissionsSettingsScreenKt$PermissionDefaultsSections$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ HatchPermissionsSettingsViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPermissionsSettingsScreenKt$PermissionDefaultsSections$1$1(HatchPermissionsSettingsViewModel hatchPermissionsSettingsViewModel) {
        super(1);
        this.$viewModel = hatchPermissionsSettingsViewModel;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$viewModel.refresh();
        return new C78g() { // from class: com.facebook.aura.settings.HatchPermissionsSettingsScreenKt$PermissionDefaultsSections$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
