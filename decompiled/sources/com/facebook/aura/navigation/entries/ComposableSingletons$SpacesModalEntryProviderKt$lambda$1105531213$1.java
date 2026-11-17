package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C10G;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.navigation.key.PeerSpaceScreenKey;
import com.facebook.aura.spaces.view.PeerSpaceScreenKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$SpacesModalEntryProviderKt$lambda$-1105531213$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$SpacesModalEntryProviderKt$lambda$1105531213$1 extends AbstractC7559F3s implements G0W<PeerSpaceScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$SpacesModalEntryProviderKt$lambda$1105531213$1 INSTANCE = new ComposableSingletons$SpacesModalEntryProviderKt$lambda$1105531213$1();

    public ComposableSingletons$SpacesModalEntryProviderKt$lambda$1105531213$1() {
        super(3);
    }

    public final void invoke(PeerSpaceScreenKey peerSpaceScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(peerSpaceScreenKey, 0);
        PeerSpaceScreenKt.PeerSpaceScreen(peerSpaceScreenKey, C10G.A01, bfm, (i & 14) | 48, 0);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(PeerSpaceScreenKey peerSpaceScreenKey, BFM bfm, Integer num) {
        invoke(peerSpaceScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
