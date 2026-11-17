package com.facebook.aura.email;

import com.facebook.aura.status.api.StatusTab;
import com.facebook.aura.status.api.StatusTabProvider;

/* loaded from: classes.dex */
public final class EmailStatusTabProvider implements StatusTabProvider {
    public static final int $stable = 0;
    public static final EmailStatusTabProvider INSTANCE = new EmailStatusTabProvider();

    @Override // com.facebook.aura.status.api.StatusTabProvider
    public StatusTab tab() {
        return EmailStatusTab.INSTANCE;
    }
}
