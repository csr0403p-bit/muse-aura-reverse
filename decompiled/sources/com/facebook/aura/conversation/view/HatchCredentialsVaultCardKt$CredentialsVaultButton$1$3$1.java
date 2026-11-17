package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.SecureStorageCredentialDetailsScreenKey;
import com.facebook.aura.settings.CredentialCandidate;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchCredentialsVaultCardKt$CredentialsVaultButton$1$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ CredentialCandidate $settledCandidate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCredentialsVaultCardKt$CredentialsVaultButton$1$3$1(AuraNavigator auraNavigator, CredentialCandidate credentialCandidate) {
        super(0);
        this.$navigator = auraNavigator;
        this.$settledCandidate = credentialCandidate;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AuraNavigator auraNavigator = this.$navigator;
        CredentialCandidate credentialCandidate = this.$settledCandidate;
        auraNavigator.navigate((AuraNavKey) new SecureStorageCredentialDetailsScreenKey(credentialCandidate.id, credentialCandidate.displayName, true), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
