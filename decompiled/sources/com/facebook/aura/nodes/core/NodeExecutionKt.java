package com.facebook.aura.nodes.core;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C2nw;
import X.C3cH;
import X.C3cJ;
import X.C60O;
import X.C7qW;
import X.HtJ;
import X.HzP;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.model.ReplyAttributionSerializer;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.facebook.aura.pairs.PairsInviteMailboxKt;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public abstract class NodeExecutionKt {

    @DebugMetadata(c = "com.facebook.aura.nodes.core.NodeExecutionKt", f = "NodeExecution.kt", l = {103, 104, 105}, m = "deliver", v = 2)
    /* renamed from: com.facebook.aura.nodes.core.NodeExecutionKt$deliver$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NodeExecutionKt.deliver(null, null, this);
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object deliver(com.facebook.aura.nodes.core.NodeExecutionContext r9, com.facebook.aura.nodes.core.NodeCommandResponse r10, X.HtJ<? super com.facebook.aura.nodes.core.NodeCommandResponse> r11) {
        /*
            boolean r0 = r11 instanceof com.facebook.aura.nodes.core.NodeExecutionKt.AnonymousClass1
            if (r0 == 0) goto L28
            r6 = r11
            com.facebook.aura.nodes.core.NodeExecutionKt$deliver$1 r6 = (com.facebook.aura.nodes.core.NodeExecutionKt.AnonymousClass1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r8 = 3
            r7 = 2
            r4 = 1
            if (r0 == 0) goto L2e
            if (r0 == r4) goto L7e
            if (r0 == r7) goto L7e
            if (r0 == r8) goto L7e
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L28:
            com.facebook.aura.nodes.core.NodeExecutionKt$deliver$1 r6 = new com.facebook.aura.nodes.core.NodeExecutionKt$deliver$1
            r6.<init>(r11)
            goto L12
        L2e:
            X.Hwg.A00(r1)
            java.lang.String r3 = r10.description
            r2 = r3
            if (r3 != 0) goto L38
            java.lang.String r3 = r9.resultDescription
        L38:
            boolean r0 = r10.ok
            if (r0 != 0) goto L52
            java.lang.String r1 = r10.errorMessage
            if (r1 != 0) goto L42
            java.lang.String r1 = "Unknown error"
        L42:
            r0 = 0
            r6.L$0 = r0
            r6.L$1 = r10
            r6.L$2 = r0
            r6.label = r4
            java.lang.Object r0 = X.C60Q.A0Y(r9, r1, r0, r2, r6)
        L4f:
            if (r0 != r5) goto L83
            return r5
        L52:
            java.lang.String r1 = r10.cardEnvelopeJson
            if (r1 == 0) goto L64
            r0 = 0
            r6.L$0 = r0
            r6.L$1 = r10
            r6.L$2 = r0
            r6.label = r7
            java.lang.Object r0 = sendCard(r9, r1, r3, r6)
            goto L4f
        L64:
            kotlinx.serialization.json.JsonElement r1 = r10.payload
            if (r1 != 0) goto L70
            X.2nw r0 = X.C60O.A1K()
            kotlinx.serialization.json.JsonObject r1 = r0.A00()
        L70:
            r0 = 0
            r6.L$0 = r0
            r6.L$1 = r10
            r6.L$2 = r0
            r6.label = r8
            java.lang.Object r0 = sendSuccess(r9, r1, r3, r6)
            goto L4f
        L7e:
            java.lang.Object r10 = r6.L$1
            X.Hwg.A00(r1)
        L83:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.core.NodeExecutionKt.deliver(com.facebook.aura.nodes.core.NodeExecutionContext, com.facebook.aura.nodes.core.NodeCommandResponse, X.HtJ):java.lang.Object");
    }

    public static /* synthetic */ Object sendError$default(NodeExecutionContext nodeExecutionContext, String str, String str2, Map map, String str3, HtJ htJ, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        Map mapA0o = C3cH.A0o(map, i & 4);
        if ((i & 8) != 0) {
            str3 = null;
        }
        return sendError(nodeExecutionContext, str, str2, mapA0o, str3, htJ);
    }

    public static final Object sendCard(NodeExecutionContext nodeExecutionContext, String str, String str2, HtJ<? super Boolean> htJ) {
        C2nw c2nwA1K = C60O.A1K();
        Boolean boolA0i = AnonymousClass001.A0i();
        C7qW.A04(boolA0i, PairsInviteMailboxKt.OUTCOME_OK, c2nwA1K);
        C2nw c2nwA1K2 = C60O.A1K();
        C7qW.A04(boolA0i, PairsInviteMailboxKt.OUTCOME_OK, c2nwA1K2);
        C7qW.A06("payload_json", C60O.A0v(c2nwA1K2), c2nwA1K);
        C7qW.A06("card_json", str, c2nwA1K);
        if (str2 != null) {
            C7qW.A06(HatchWebPageParserKt.DESCRIPTION, str2, c2nwA1K);
        }
        return nodeExecutionContext.sender.sendInvokeResult(nodeExecutionContext.nodeId, nodeExecutionContext.requestId, c2nwA1K.A00(), htJ);
    }

    public static final Object sendError(NodeExecutionContext nodeExecutionContext, String str, String str2, Map<String, ? extends JsonElement> map, String str3, HtJ<? super Boolean> htJ) {
        C2nw c2nwA1K = C60O.A1K();
        C7qW.A06(AuraDeeplinkRouteMapper.STATUS_ROUTE, "error", c2nwA1K);
        if (str2 != null) {
            C7qW.A06("error_code", str2, c2nwA1K);
        }
        C7qW.A06(ReplyAttributionSerializer.TYPE_MESSAGE, str, c2nwA1K);
        C7qW.A06("platform", "android", c2nwA1K);
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            C3cJ.A0v(itA0n, c2nwA1K);
        }
        JsonObject jsonObjectA00 = c2nwA1K.A00();
        C2nw c2nwA1K2 = C60O.A1K();
        C7qW.A03(AnonymousClass001.A0i(), jsonObjectA00, str3, c2nwA1K2);
        return nodeExecutionContext.sender.sendInvokeResult(nodeExecutionContext.nodeId, nodeExecutionContext.requestId, c2nwA1K2.A00(), htJ);
    }

    public static final Object sendSuccess(NodeExecutionContext nodeExecutionContext, JsonElement jsonElement, String str, HtJ<? super Boolean> htJ) {
        C2nw c2nwA1K = C60O.A1K();
        C7qW.A03(AnonymousClass001.A0i(), jsonElement, str, c2nwA1K);
        return nodeExecutionContext.sender.sendInvokeResult(nodeExecutionContext.nodeId, nodeExecutionContext.requestId, c2nwA1K.A00(), htJ);
    }
}
