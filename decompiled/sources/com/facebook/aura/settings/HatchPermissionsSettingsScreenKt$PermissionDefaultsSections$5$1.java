package com.facebook.aura.settings;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.permissions.defaults.PermissionDefaultMode;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final /* synthetic */ class HatchPermissionsSettingsScreenKt$PermissionDefaultsSections$5$1 extends C7438Evz implements G0U<PermissionDefaultMode, Unit> {
    public HatchPermissionsSettingsScreenKt$PermissionDefaultsSections$5$1(Object obj) {
        super(1, obj, HatchPermissionsSettingsViewModel.class, "setNetworkDefault", "setNetworkDefault(Lcom/facebook/aura/permissions/defaults/PermissionDefaultMode;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PermissionDefaultMode permissionDefaultMode) {
        ((HatchPermissionsSettingsViewModel) AnonymousClass006.A0o(permissionDefaultMode, this)).setNetworkDefault(permissionDefaultMode);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(PermissionDefaultMode permissionDefaultMode) {
        invoke2(permissionDefaultMode);
        return Unit.INSTANCE;
    }
}
