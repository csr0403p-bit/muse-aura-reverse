package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.permissions.defaults.PermissionDefaultMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchPermissionsSettingsScreenKt$PermissionDefaultOptionCard$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $checked;
    public final /* synthetic */ PermissionDefaultMode $mode;
    public final /* synthetic */ G0U<PermissionDefaultMode, Unit> $onSelected;
    public final /* synthetic */ String $permissionKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchPermissionsSettingsScreenKt$PermissionDefaultOptionCard$1$1(boolean z, String str, PermissionDefaultMode permissionDefaultMode, G0U<? super PermissionDefaultMode, Unit> g0u) {
        super(0);
        this.$checked = z;
        this.$permissionKey = str;
        this.$mode = permissionDefaultMode;
        this.$onSelected = g0u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$checked) {
            return;
        }
        HatchPermissionsSettingsScreenKt.logPermissionDefaultSelected(this.$permissionKey, this.$mode);
        this.$onSelected.invoke(this.$mode);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
