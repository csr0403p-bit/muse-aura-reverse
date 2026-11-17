package com.facebook.aura.email.repo;

import X.C7384Etj;
import X.FGI;
import android.net.Uri;
import com.facebook.aura.network.api.JarvisPath;

/* loaded from: classes.dex */
public final class EmailDaemonOwnerPath implements JarvisPath.Extension {
    public final String value;

    public EmailDaemonOwnerPath(String str) {
        C7384Etj.A0Y(str, 0);
        this.value = FGI.A0M("api/email/owners/", Uri.encode(str));
    }

    @Override // com.facebook.aura.network.api.JarvisPath
    public String getValue() {
        return this.value;
    }
}
