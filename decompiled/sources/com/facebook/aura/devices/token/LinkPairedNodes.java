package com.facebook.aura.devices.token;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C3cG;
import X.C3cI;
import X.C7384Etj;
import X.HtJ;
import X.HzP;
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import com.facebook.aura.nodes.json.NodeListEntry;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class LinkPairedNodes {
    public static final String GADGET_FAMILY = "gadget";
    public static final long GATEWAY_WAIT_MS = 15000;
    public static final String HOME_LINK_FAMILY = "link";
    public static final LinkPairedNodes INSTANCE = new LinkPairedNodes();

    @DebugMetadata(c = "com.facebook.aura.devices.token.LinkPairedNodes", f = "LinkPairedNodes.kt", l = {19, 20}, m = BrowserOperationCatalogKt.READ, v = 2)
    /* renamed from: com.facebook.aura.devices.token.LinkPairedNodes$read$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkPairedNodes.this.read(null, this);
        }
    }

    public final String familyOf(NodeListEntry nodeListEntry) {
        String strA0l;
        C7384Etj.A0Y(nodeListEntry, 0);
        String str = nodeListEntry.deviceFamily;
        return (str == null || (strA0l = AnonymousClass002.A0l(str)) == null) ? "" : AnonymousClass001.A0u(strA0l);
    }

    public final boolean isHomeLink(NodeListEntry nodeListEntry) {
        C7384Etj.A0Y(nodeListEntry, 0);
        String strFamilyOf = familyOf(nodeListEntry);
        return "link".equals(strFamilyOf) || (strFamilyOf.length() == 0 && nodeListEntry.isHatchLinkDevice());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object read(X.AbstractC3358CGz r8, X.HtJ<? super java.util.List<com.facebook.aura.nodes.json.NodeListEntry>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.devices.token.LinkPairedNodes.AnonymousClass1
            if (r0 == 0) goto L61
            r6 = r9
            com.facebook.aura.devices.token.LinkPairedNodes$read$1 r6 = (com.facebook.aura.devices.token.LinkPairedNodes.AnonymousClass1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L61
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r2 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 2
            r1 = 1
            if (r0 == 0) goto L31
            if (r0 == r1) goto L48
            if (r0 != r4) goto L67
            X.Hwg.A00(r2)
        L23:
            boolean r0 = r2 instanceof kotlinx.serialization.json.JsonObject
            r5 = 0
            if (r0 == 0) goto L30
            kotlinx.serialization.json.JsonObject r2 = (kotlinx.serialization.json.JsonObject) r2
            if (r2 == 0) goto L30
            java.util.List r5 = com.facebook.aura.nodes.json.NodeListEntryJsonKt.parseNodeListEntriesOrNull(r2)
        L30:
            return r5
        L31:
            X.Hwg.A00(r2)
            com.facebook.aura.gateway.HatchGatewayConnection r3 = X.C60O.A05(r8)
            r0 = 0
            r6.L$0 = r0
            r6.L$1 = r3
            r6.label = r1
            r0 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r0 = r3.awaitConnected(r0, r6)
            if (r0 != r5) goto L4f
            return r5
        L48:
            java.lang.Object r3 = r6.L$1
            com.facebook.aura.gateway.HatchGatewayConnection r3 = (com.facebook.aura.gateway.HatchGatewayConnection) r3
            X.Hwg.A00(r2)
        L4f:
            com.facebook.aura.network.api.RpcMethod$NodeList r2 = com.facebook.aura.network.api.RpcMethod.NodeList.INSTANCE
            r0 = 0
            r6.L$0 = r0
            r6.L$1 = r0
            r6.label = r4
            r0 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r2 = r3.sendRequestAndWait(r2, r0, r6)
            if (r2 != r5) goto L23
            return r5
        L61:
            com.facebook.aura.devices.token.LinkPairedNodes$read$1 r6 = new com.facebook.aura.devices.token.LinkPairedNodes$read$1
            r6.<init>(r9)
            goto L12
        L67:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.token.LinkPairedNodes.read(X.CGz, X.HtJ):java.lang.Object");
    }

    public final List<NodeListEntry> matching(List<NodeListEntry> list, String str) {
        AnonymousClass003.A0u(list, str);
        String strNormalizeHatchDeviceNodeId = HatchDeviceNodeIdKt.normalizeHatchDeviceNodeId(str);
        if (strNormalizeHatchDeviceNodeId != null) {
            str = strNormalizeHatchDeviceNodeId;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        for (NodeListEntry nodeListEntry : list) {
            C3cI.A1J(HatchDeviceNodeIdKt.normalizeHatchDeviceNodeId(nodeListEntry.nodeId), nodeListEntry, str, arrayListA0h);
        }
        return arrayListA0h;
    }
}
