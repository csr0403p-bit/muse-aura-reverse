package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.PermissionDestination;
import com.facebook.aura.navigation.key.PermissionDetailScreenKey;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$DeviceDetailsEntryProviderKt$lambda$12780946$1$2$1 extends AbstractC7559F3s implements G0U<PermissionDestination, Unit> {
    public final /* synthetic */ AuraNavigator $navigator;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PermissionDestination permissionDestination) {
        C7384Etj.A0Y(permissionDestination, 0);
        this.$navigator.navigate((AuraNavKey) new PermissionDetailScreenKey(permissionDestination), false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$DeviceDetailsEntryProviderKt$lambda$12780946$1$2$1(AuraNavigator auraNavigator) {
        super(1);
        this.$navigator = auraNavigator;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(PermissionDestination permissionDestination) {
        invoke2(permissionDestination);
        return Unit.INSTANCE;
    }
}
