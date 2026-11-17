package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ConnectedDevicesScreenKey;
import com.facebook.aura.navigation.key.DeviceDetailsScreenKey;
import com.facebook.aura.settings.HatchPendingPairAgain;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ComposableSingletons$DeviceDetailsEntryProviderKt$lambda$12780946$1$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ DeviceDetailsScreenKey $key;
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$DeviceDetailsEntryProviderKt$lambda$12780946$1$3$1(DeviceDetailsScreenKey deviceDetailsScreenKey, AuraNavigator auraNavigator) {
        super(0);
        this.$key = deviceDetailsScreenKey;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchPendingPairAgain.INSTANCE.set(this.$key.displayName);
        this.$navigator.navigate((AuraNavKey) new ConnectedDevicesScreenKey(false), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
