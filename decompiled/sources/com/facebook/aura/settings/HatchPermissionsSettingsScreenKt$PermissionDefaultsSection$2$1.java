package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.C7384Etj;
import X.Ey9;
import X.G0U;
import com.facebook.aura.permissions.defaults.PermissionDefaultMode;
import com.facebook.aura.permissions.defaults.PermissionDefaultSurfaceContent;
import com.facebook.aura.ui.HatchSectionScope;
import java.util.Iterator;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchPermissionsSettingsScreenKt$PermissionDefaultsSection$2$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ PermissionDefaultSurfaceContent $content;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ G0U<PermissionDefaultMode, Unit> $onSelected;
    public final /* synthetic */ String $permissionKey;
    public final /* synthetic */ PermissionDefaultMode $selected;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        Ey9<PermissionDefaultMode> entries = PermissionDefaultMode.getEntries();
        PermissionDefaultSurfaceContent permissionDefaultSurfaceContent = this.$content;
        PermissionDefaultMode permissionDefaultMode = this.$selected;
        String str = this.$permissionKey;
        boolean z = this.$enabled;
        G0U<PermissionDefaultMode, Unit> g0u = this.$onSelected;
        Iterator<PermissionDefaultMode> it = entries.iterator();
        while (it.hasNext()) {
            AnonymousClass006.A1E(hatchSectionScope, new HatchPermissionsSettingsScreenKt$PermissionDefaultsSection$2$1$1$1(permissionDefaultSurfaceContent, it.next(), permissionDefaultMode, str, z, g0u), 1613623599);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchPermissionsSettingsScreenKt$PermissionDefaultsSection$2$1(PermissionDefaultSurfaceContent permissionDefaultSurfaceContent, PermissionDefaultMode permissionDefaultMode, String str, boolean z, G0U<? super PermissionDefaultMode, Unit> g0u) {
        super(1);
        this.$content = permissionDefaultSurfaceContent;
        this.$selected = permissionDefaultMode;
        this.$permissionKey = str;
        this.$enabled = z;
        this.$onSelected = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
