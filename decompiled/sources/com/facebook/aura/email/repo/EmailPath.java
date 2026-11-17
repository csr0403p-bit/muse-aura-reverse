package com.facebook.aura.email.repo;

import X.C7384Etj;
import com.facebook.aura.network.api.StefiHatchPath;

/* loaded from: classes.dex */
public final class EmailPath implements StefiHatchPath.Extension {
    public final String value;

    public EmailPath(EmailEndpoint emailEndpoint) {
        C7384Etj.A0Y(emailEndpoint, 0);
        this.value = emailEndpoint.getPath();
    }

    @Override // com.facebook.aura.network.api.StefiPath
    public String getValue() {
        return this.value;
    }
}
