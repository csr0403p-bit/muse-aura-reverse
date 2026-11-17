package com.facebook.aura.email;

import X.AbstractC3358CGz;
import X.C0881AGi;
import X.C7384Etj;
import com.facebook.aura.R;
import com.facebook.aura.email.keys.EmailDeleteMailboxKey;
import com.facebook.aura.email.repo.EmailRepository;
import com.facebook.aura.settings.internal.api.InternalSettingsDataResetContributor;
import com.facebook.aura.settings.internal.api.InternalSettingsDataResetEntry;
import com.facebook.aura.utils.HatchUtils;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class EmailDataResetContributor implements InternalSettingsDataResetContributor {
    public static final int $stable = 0;
    public static final EmailDataResetContributor INSTANCE = new EmailDataResetContributor();

    @Override // com.facebook.aura.settings.internal.api.InternalSettingsDataResetContributor
    public List<InternalSettingsDataResetEntry> entries(AbstractC3358CGz abstractC3358CGz) {
        String environmentId;
        C7384Etj.A0Y(abstractC3358CGz, 0);
        return (!HatchUtils.INSTANCE.isEmailEnabled(abstractC3358CGz) || (environmentId = EmailRepository.Companion.getInstance(abstractC3358CGz).getEnvironmentId()) == null) ? C0881AGi.A00 : Collections.singletonList(new InternalSettingsDataResetEntry("email:delete_mailbox", R.string._name_removed__res_0x7f120950, new EmailDeleteMailboxKey(environmentId), Integer.valueOf(R.string._name_removed__res_0x7f120954)));
    }
}
