package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.SecureStorageCredentialDetailsScreenKey;
import com.facebook.aura.settings.CredentialCandidate;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$SecureStorageEntryProviderKt$lambda$2120317729$1$2$1 extends AbstractC7559F3s implements G0U<CredentialCandidate, Unit> {
    public final /* synthetic */ AuraNavigator $navigator;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CredentialCandidate credentialCandidate) {
        C7384Etj.A0Y(credentialCandidate, 0);
        this.$navigator.navigate((AuraNavKey) new SecureStorageCredentialDetailsScreenKey(credentialCandidate.id, credentialCandidate.displayName, false), false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$SecureStorageEntryProviderKt$lambda$2120317729$1$2$1(AuraNavigator auraNavigator) {
        super(1);
        this.$navigator = auraNavigator;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(CredentialCandidate credentialCandidate) {
        invoke2(credentialCandidate);
        return Unit.INSTANCE;
    }
}
