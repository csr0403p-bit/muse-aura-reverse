package com.facebook.aura.pairs;

import X.C7384Etj;
import X.FGI;
import android.net.Uri;
import com.facebook.aura.network.api.JarvisPath;

/* loaded from: classes3.dex */
public final class SpaceCollaboratorsPath implements JarvisPath.Extension {
    public final String value;

    public SpaceCollaboratorsPath(String str) {
        C7384Etj.A0Y(str, 0);
        this.value = FGI.A0M("api/peer-spaces/collaborators/", Uri.encode(str));
    }

    @Override // com.facebook.aura.network.api.JarvisPath
    public String getValue() {
        return this.value;
    }
}
