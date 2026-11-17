package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.MessengerSettingsScreenKey;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$ChannelsSettingsEntryProviderKt$lambda$-846782561$1$4$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$ChannelsSettingsEntryProviderKt$lambda$846782561$1$4$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$ChannelsSettingsEntryProviderKt$lambda$846782561$1$4$1(AuraNavigator auraNavigator) {
        super(1);
        this.$navigator = auraNavigator;
    }

    public final void invoke(boolean z) {
        this.$navigator.navigate((AuraNavKey) new MessengerSettingsScreenKey(z), false);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
