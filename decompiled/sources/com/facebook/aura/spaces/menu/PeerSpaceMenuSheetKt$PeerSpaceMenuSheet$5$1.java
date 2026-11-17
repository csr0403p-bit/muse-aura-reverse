package com.facebook.aura.spaces.menu;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import com.facebook.aura.spaces.menu.PeerSpaceMembersState;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class PeerSpaceMenuSheetKt$PeerSpaceMenuSheet$5$1 extends AbstractC7559F3s implements G0U<AuraContextMenuItem, G0V<? super BFM, ? super Integer, ? extends Unit>> {
    public final /* synthetic */ PeerSpaceMembersState.Loaded $loaded;

    @Override // X.G0U
    public final G0V<BFM, Integer, Unit> invoke(AuraContextMenuItem auraContextMenuItem) {
        AHD<PeerSpaceMember> ahd;
        C7384Etj.A0Y(auraContextMenuItem, 0);
        PeerSpaceMembersState.Loaded loaded = this.$loaded;
        if (loaded == null || auraContextMenuItem.id != 0 || (ahd = loaded.members) == null) {
            return null;
        }
        return AnonymousClass001.A0M(new PeerSpaceMenuSheetKt$PeerSpaceMenuSheet$5$1$2$1(ahd.size()), -682021916);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeerSpaceMenuSheetKt$PeerSpaceMenuSheet$5$1(PeerSpaceMembersState.Loaded loaded) {
        super(1);
        this.$loaded = loaded;
    }
}
