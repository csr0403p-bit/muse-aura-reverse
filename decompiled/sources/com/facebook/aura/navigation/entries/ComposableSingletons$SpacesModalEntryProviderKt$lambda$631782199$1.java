package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.BFM;
import X.G0W;
import com.facebook.aura.navigation.key.PeerSpaceCollaboratorsSheetKey;
import com.facebook.aura.spaces.menu.PeerSpaceCollaboratorsSheetKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$SpacesModalEntryProviderKt$lambda$631782199$1 extends AbstractC7559F3s implements G0W<PeerSpaceCollaboratorsSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$SpacesModalEntryProviderKt$lambda$631782199$1 INSTANCE = new ComposableSingletons$SpacesModalEntryProviderKt$lambda$631782199$1();

    public ComposableSingletons$SpacesModalEntryProviderKt$lambda$631782199$1() {
        super(3);
    }

    public final void invoke(PeerSpaceCollaboratorsSheetKey peerSpaceCollaboratorsSheetKey, BFM bfm, int i) {
        PeerSpaceCollaboratorsSheetKt.PeerSpaceCollaboratorsSheet(peerSpaceCollaboratorsSheetKey, null, bfm, AnonymousClass006.A0E(peerSpaceCollaboratorsSheetKey, i), 2);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(PeerSpaceCollaboratorsSheetKey peerSpaceCollaboratorsSheetKey, BFM bfm, Integer num) {
        invoke(peerSpaceCollaboratorsSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
