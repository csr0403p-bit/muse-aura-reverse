package com.facebook.aura.email.repo;

import X.C7384Etj;
import X.FGI;
import android.net.Uri;
import com.facebook.aura.network.api.JarvisPath;

/* loaded from: classes.dex */
public final class EmailOwnerCodePath implements JarvisPath.Extension {
    public final String value;

    public EmailOwnerCodePath(String str) {
        C7384Etj.A0Y(str, 0);
        this.value = FGI.A0U("api/email/owners/challenges/", Uri.encode(str), "/verify");
    }

    @Override // com.facebook.aura.network.api.JarvisPath
    public String getValue() {
        return this.value;
    }
}
