package com.facebook.aura.spaces.view;

import X.C78g;
import android.webkit.WebStorage;
import com.facebook.aura.navigation.key.PeerSpaceScreenKey;
import com.facebook.aura.spaces.repo.SpacesWebViewSessionKt;

/* loaded from: classes.dex */
public final class PeerSpaceScreenKt$PeerSpaceScreen$1$1$invoke$$inlined$onDispose$1 implements C78g {
    public final /* synthetic */ PeerSpaceScreenKey $key$inlined;

    public PeerSpaceScreenKt$PeerSpaceScreen$1$1$invoke$$inlined$onDispose$1(PeerSpaceScreenKey peerSpaceScreenKey) {
        this.$key$inlined = peerSpaceScreenKey;
    }

    @Override // X.C78g
    public void dispose() {
        WebStorage.getInstance().deleteOrigin(SpacesWebViewSessionKt.peerSpaceOrigin(this.$key$inlined.spaceId));
    }
}
