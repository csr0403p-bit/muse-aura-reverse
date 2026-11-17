package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.C7BY;
import com.facebook.aura.utils.navigation.SecureUri;
import com.facebook.aura.utils.navigation.SecureUriKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class AuraExternalUriRegistry$smsNotificationsUri$2 extends AbstractC7559F3s implements Function0<SecureUri> {
    public static final AuraExternalUriRegistry$smsNotificationsUri$2 INSTANCE = new AuraExternalUriRegistry$smsNotificationsUri$2();

    public AuraExternalUriRegistry$smsNotificationsUri$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final SecureUri invoke() {
        String smsNotificationsUrl = AuraExternalUriRegistry.INSTANCE.getSmsNotificationsUrl();
        if (C7BY.A0j(smsNotificationsUrl)) {
            smsNotificationsUrl = AuraExternalUriRegistryKt.SMS_NOTIFICATIONS_URL;
        }
        return SecureUriKt.asSecureUri(smsNotificationsUrl);
    }
}
