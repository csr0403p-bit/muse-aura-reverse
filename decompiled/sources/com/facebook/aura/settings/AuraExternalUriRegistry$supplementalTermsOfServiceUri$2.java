package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import com.facebook.aura.utils.navigation.SecureUri;
import com.facebook.aura.utils.navigation.SecureUriKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class AuraExternalUriRegistry$supplementalTermsOfServiceUri$2 extends AbstractC7559F3s implements Function0<SecureUri> {
    public static final AuraExternalUriRegistry$supplementalTermsOfServiceUri$2 INSTANCE = new AuraExternalUriRegistry$supplementalTermsOfServiceUri$2();

    public AuraExternalUriRegistry$supplementalTermsOfServiceUri$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final SecureUri invoke() {
        return SecureUriKt.asSecureUri(AuraExternalUriRegistry.INSTANCE.getSupplementalTermsOfServiceUrl());
    }
}
