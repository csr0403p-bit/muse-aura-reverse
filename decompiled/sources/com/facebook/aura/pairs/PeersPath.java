package com.facebook.aura.pairs;

import X.C7384Etj;
import com.facebook.aura.network.api.JarvisPath;

/* loaded from: classes3.dex */
public final class PeersPath implements JarvisPath.Extension {
    public final String value;

    public PeersPath(String str) {
        C7384Etj.A0Y(str, 0);
        this.value = str;
    }

    @Override // com.facebook.aura.network.api.JarvisPath
    public String getValue() {
        return this.value;
    }
}
