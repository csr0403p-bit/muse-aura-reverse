package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0V;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.WhatsAppSettingsScreenKey;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$ChannelsSettingsEntryProviderKt$lambda$-846782561$1$3$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$ChannelsSettingsEntryProviderKt$lambda$846782561$1$3$1 extends AbstractC7559F3s implements G0V<Boolean, Boolean, Unit> {
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$ChannelsSettingsEntryProviderKt$lambda$846782561$1$3$1(AuraNavigator auraNavigator) {
        super(2);
        this.$navigator = auraNavigator;
    }

    public final void invoke(boolean z, boolean z2) {
        this.$navigator.navigate((AuraNavKey) new WhatsAppSettingsScreenKey(z, z2), false);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Boolean bool2) {
        invoke(AnonymousClass001.A1X(bool), AnonymousClass001.A1X(bool2));
        return Unit.INSTANCE;
    }
}
