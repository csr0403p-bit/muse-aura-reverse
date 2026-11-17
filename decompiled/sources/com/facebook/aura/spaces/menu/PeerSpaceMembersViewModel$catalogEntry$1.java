package com.facebook.aura.spaces.menu;

import X.AHD;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G0W;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.library.repo.UnifiedArtifact;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.spaces.menu.PeerSpaceMembersViewModel$catalogEntry$1", f = "PeerSpaceMembersViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class PeerSpaceMembersViewModel$catalogEntry$1 extends AbstractC07127nr implements G0W<AHD<? extends UnifiedArtifact>, UnifiedArtifact, HtJ<? super UnifiedArtifact>, Object> {
    public final /* synthetic */ String $hostMuse;
    public final /* synthetic */ String $spaceId;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeerSpaceMembersViewModel$catalogEntry$1(String str, String str2, HtJ<? super PeerSpaceMembersViewModel$catalogEntry$1> htJ) {
        super(3, htJ);
        this.$hostMuse = str;
        this.$spaceId = str2;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Object invoke(AHD<? extends UnifiedArtifact> ahd, UnifiedArtifact unifiedArtifact, HtJ<? super UnifiedArtifact> htJ) {
        return invoke2((AHD<UnifiedArtifact>) ahd, unifiedArtifact, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        Object obj2 = this.L$1;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        String str = this.$hostMuse;
        String str2 = this.$spaceId;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (PeerSpaceMembersViewModelKt.isPeerSpace((UnifiedArtifact) next, str, str2)) {
                if (next != null) {
                    return next;
                }
            }
        }
        return obj2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(AHD<UnifiedArtifact> ahd, UnifiedArtifact unifiedArtifact, HtJ<? super UnifiedArtifact> htJ) {
        PeerSpaceMembersViewModel$catalogEntry$1 peerSpaceMembersViewModel$catalogEntry$1 = new PeerSpaceMembersViewModel$catalogEntry$1(this.$hostMuse, this.$spaceId, htJ);
        peerSpaceMembersViewModel$catalogEntry$1.L$0 = ahd;
        peerSpaceMembersViewModel$catalogEntry$1.L$1 = unifiedArtifact;
        return peerSpaceMembersViewModel$catalogEntry$1.invokeSuspend(Unit.INSTANCE);
    }
}
