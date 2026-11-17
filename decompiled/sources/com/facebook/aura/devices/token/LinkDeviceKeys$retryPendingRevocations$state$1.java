package com.facebook.aura.devices.token;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C3UX;
import X.C3cG;
import X.G0V;
import X.HtJ;
import X.Hwg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.devices.token.LinkDeviceKeys$retryPendingRevocations$state$1", f = "LinkDeviceKeys.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class LinkDeviceKeys$retryPendingRevocations$state$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super LinkDeviceKeyOwnerState>, Object> {
    public final /* synthetic */ Set<String> $removedNodeIds;
    public final /* synthetic */ Set<String> $unqueued;
    public int label;
    public final /* synthetic */ LinkDeviceKeys this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkDeviceKeys$retryPendingRevocations$state$1(LinkDeviceKeys linkDeviceKeys, Set<String> set, Set<String> set2, HtJ<? super LinkDeviceKeys$retryPendingRevocations$state$1> htJ) {
        super(2, htJ);
        this.this$0 = linkDeviceKeys;
        this.$removedNodeIds = set;
        this.$unqueued = set2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new LinkDeviceKeys$retryPendingRevocations$state$1(this.this$0, this.$removedNodeIds, this.$unqueued, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        LinkDeviceKeyOwnerState linkDeviceKeyOwnerStateOwnerState = this.this$0.environment.ownerState();
        Set<String> set = this.$removedNodeIds;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String strNormalizeHatchDeviceNodeId = HatchDeviceNodeIdKt.normalizeHatchDeviceNodeId(AnonymousClass005.A0j(it));
            if (strNormalizeHatchDeviceNodeId != null) {
                arrayListA0h.add(strNormalizeHatchDeviceNodeId);
            }
        }
        LinkDeviceKeys linkDeviceKeys = this.this$0;
        Set<String> set2 = this.$unqueued;
        Iterator it2 = arrayListA0h.iterator();
        while (it2.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it2);
            LinkDeviceKeyPendingRevokeJson linkDeviceKeyPendingRevokeJsonNodeRevoke = LinkDeviceKeysKt.nodeRevoke(strA0j, linkDeviceKeyOwnerStateOwnerState);
            if (linkDeviceKeyPendingRevokeJsonNodeRevoke != null) {
                linkDeviceKeys.enqueueRevoke(linkDeviceKeyPendingRevokeJsonNodeRevoke);
            } else {
                set2.add(strA0j);
            }
        }
        return linkDeviceKeyOwnerStateOwnerState;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super LinkDeviceKeyOwnerState> htJ) {
        return ((LinkDeviceKeys$retryPendingRevocations$state$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
