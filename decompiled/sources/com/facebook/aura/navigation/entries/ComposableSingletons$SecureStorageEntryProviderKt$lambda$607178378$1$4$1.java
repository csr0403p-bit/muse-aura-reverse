package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.SecureStorageCustomConnectorDetailsScreenKey;
import com.facebook.aura.settings.CustomConnectorCandidate;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$SecureStorageEntryProviderKt$lambda$607178378$1$4$1 extends AbstractC7559F3s implements G0U<CustomConnectorCandidate, Unit> {
    public final /* synthetic */ AuraNavigator $navigator;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CustomConnectorCandidate customConnectorCandidate) {
        C7384Etj.A0Y(customConnectorCandidate, 0);
        this.$navigator.navigate((AuraNavKey) new SecureStorageCustomConnectorDetailsScreenKey(customConnectorCandidate.name, customConnectorCandidate.host), false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$SecureStorageEntryProviderKt$lambda$607178378$1$4$1(AuraNavigator auraNavigator) {
        super(1);
        this.$navigator = auraNavigator;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(CustomConnectorCandidate customConnectorCandidate) {
        invoke2(customConnectorCandidate);
        return Unit.INSTANCE;
    }
}
