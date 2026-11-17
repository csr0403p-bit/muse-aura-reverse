package com.facebook.aura.spaces.menu;

import X.AnonymousClass005;
import X.C60N;
import X.FGI;
import com.facebook.aura.network.api.JarvisPath;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;

/* loaded from: classes4.dex */
public final class PeerSpacePath implements JarvisPath.Extension {
    public final String value;

    public PeerSpacePath(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.value = FGI.A0j(C60N.A00(67), str, CustomConnectorRegisterRepositoryKt.ROOT_PATH, str2, CustomConnectorRegisterRepositoryKt.ROOT_PATH, str3);
    }

    @Override // com.facebook.aura.network.api.JarvisPath
    public String getValue() {
        return this.value;
    }
}
