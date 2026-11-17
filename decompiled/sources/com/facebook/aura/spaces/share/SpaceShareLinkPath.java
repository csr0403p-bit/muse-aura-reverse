package com.facebook.aura.spaces.share;

import X.AnonymousClass003;
import X.FGI;
import android.net.Uri;
import com.facebook.aura.network.api.JarvisPath;

/* loaded from: classes3.dex */
public final class SpaceShareLinkPath implements JarvisPath.Extension {
    public final String value;

    @Override // com.facebook.aura.network.api.JarvisPath
    public String getValue() {
        return this.value;
    }

    public SpaceShareLinkPath(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.value = FGI.A0U("spaces/share/", Uri.encode(str), str2);
    }
}
