package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BFM;
import X.C07C;
import X.G0U;
import X.G0W;
import com.facebook.aura.permissions.defaults.PermissionDefaultMode;
import com.facebook.aura.permissions.defaults.PermissionDefaultOptionContent;
import com.facebook.aura.permissions.defaults.PermissionDefaultSurfaceContent;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchPermissionsSettingsScreenKt$PermissionDefaultsSection$2$1$1$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ PermissionDefaultSurfaceContent $content;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ PermissionDefaultMode $mode;
    public final /* synthetic */ G0U<PermissionDefaultMode, Unit> $onSelected;
    public final /* synthetic */ String $permissionKey;
    public final /* synthetic */ PermissionDefaultMode $selected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchPermissionsSettingsScreenKt$PermissionDefaultsSection$2$1$1$1(PermissionDefaultSurfaceContent permissionDefaultSurfaceContent, PermissionDefaultMode permissionDefaultMode, PermissionDefaultMode permissionDefaultMode2, String str, boolean z, G0U<? super PermissionDefaultMode, Unit> g0u) {
        super(3);
        this.$content = permissionDefaultSurfaceContent;
        this.$mode = permissionDefaultMode;
        this.$selected = permissionDefaultMode2;
        this.$permissionKey = str;
        this.$enabled = z;
        this.$onSelected = g0u;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            bfm.Afo();
            return;
        }
        PermissionDefaultOptionContent permissionDefaultOptionContentOptionFor = this.$content.optionFor(this.$mode);
        String str = permissionDefaultOptionContentOptionFor.title;
        String str2 = permissionDefaultOptionContentOptionFor.description;
        PermissionDefaultMode permissionDefaultMode = this.$selected;
        PermissionDefaultMode permissionDefaultMode2 = this.$mode;
        HatchPermissionsSettingsScreenKt.PermissionDefaultOptionCard(str, str2, AnonymousClass002.A1Z(permissionDefaultMode, permissionDefaultMode2), this.$permissionKey, permissionDefaultMode2, this.$enabled, this.$onSelected, null, bfm, 0, 128);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
