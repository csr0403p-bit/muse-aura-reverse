package com.facebook.aura.email;

import X.AbstractC3358CGz;
import X.AnonymousClass003;
import com.facebook.aura.email.keys.EmailSettingsKey;
import com.facebook.aura.email.repo.EmailRepository;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.skills.api.ConnectorDestinationProvider;
import com.facebook.aura.utils.HatchUtils;

/* loaded from: classes.dex */
public final class EmailConnectorDestinationProvider implements ConnectorDestinationProvider {
    public static final int $stable = 0;
    public static final EmailConnectorDestinationProvider INSTANCE = new EmailConnectorDestinationProvider();

    @Override // com.facebook.aura.skills.api.ConnectorDestinationProvider
    public AuraNavKey destination(AbstractC3358CGz abstractC3358CGz, String str) {
        String hatcheryVMId;
        AnonymousClass003.A0u(abstractC3358CGz, str);
        if (str.equals(EmailRepository.MUSE_MAIL_CONNECTOR) && HatchUtils.INSTANCE.isEmailEnabled(abstractC3358CGz) && (hatcheryVMId = EmailRepository.Companion.getInstance(abstractC3358CGz).prefs.getHatcheryVMId()) != null) {
            return new EmailSettingsKey(hatcheryVMId);
        }
        return null;
    }
}
