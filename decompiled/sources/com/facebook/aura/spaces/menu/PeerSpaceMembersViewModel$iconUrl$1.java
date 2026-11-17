package com.facebook.aura.spaces.menu;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.G0W;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.library.repo.ArtifactItem;
import com.facebook.aura.library.repo.UnifiedArtifact;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.spaces.menu.PeerSpaceMembersViewModel$iconUrl$1", f = "PeerSpaceMembersViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class PeerSpaceMembersViewModel$iconUrl$1 extends AbstractC07127nr implements G0W<UnifiedArtifact, ArtifactItem, HtJ<? super String>, Object> {
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeerSpaceMembersViewModel$iconUrl$1(AbstractC3358CGz abstractC3358CGz, HtJ<? super PeerSpaceMembersViewModel$iconUrl$1> htJ) {
        super(3, htJ);
        this.$userSession = abstractC3358CGz;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        String str;
        UnifiedArtifact unifiedArtifact = (UnifiedArtifact) this.L$0;
        ArtifactItem artifactItem = (ArtifactItem) this.L$1;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        if ((unifiedArtifact == null || (str = unifiedArtifact.iconUrl) == null) && (artifactItem == null || (str = artifactItem.icon) == null)) {
            return null;
        }
        return PeerSpaceMembersViewModelKt.resolveIconUrl(str, this.$userSession);
    }

    @Override // X.G0W
    public final Object invoke(UnifiedArtifact unifiedArtifact, ArtifactItem artifactItem, HtJ<? super String> htJ) {
        PeerSpaceMembersViewModel$iconUrl$1 peerSpaceMembersViewModel$iconUrl$1 = new PeerSpaceMembersViewModel$iconUrl$1(this.$userSession, htJ);
        peerSpaceMembersViewModel$iconUrl$1.L$0 = unifiedArtifact;
        peerSpaceMembersViewModel$iconUrl$1.L$1 = artifactItem;
        return peerSpaceMembersViewModel$iconUrl$1.invokeSuspend(Unit.INSTANCE);
    }
}
