package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.C7BY;
import com.facebook.aura.utils.navigation.SecureUri;
import com.facebook.aura.utils.navigation.SecureUriKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class AuraExternalUriRegistry$preloadsTosLearnMoreUri$2 extends AbstractC7559F3s implements Function0<SecureUri> {
    public static final AuraExternalUriRegistry$preloadsTosLearnMoreUri$2 INSTANCE = new AuraExternalUriRegistry$preloadsTosLearnMoreUri$2();

    public AuraExternalUriRegistry$preloadsTosLearnMoreUri$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final SecureUri invoke() {
        String preloadsTosLearnMoreUrl = AuraExternalUriRegistry.INSTANCE.getPreloadsTosLearnMoreUrl();
        if (C7BY.A0j(preloadsTosLearnMoreUrl)) {
            preloadsTosLearnMoreUrl = AuraExternalUriRegistryKt.PRELOADS_TOS_LEARN_MORE_URL;
        }
        return SecureUriKt.asSecureUri(preloadsTosLearnMoreUrl);
    }
}
