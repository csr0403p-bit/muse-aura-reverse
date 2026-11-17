package com.facebook.aura.nodes.transport;

import X.C1BN;
import X.G0U;
import X.HtJ;
import com.facebook.aura.network.api.RpcMethod;
import kotlin.Unit;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes3.dex */
public interface HatchNodeTransport {

    /* renamed from: com.facebook.aura.nodes.transport.HatchNodeTransport$-CC, reason: invalid class name */
    /* loaded from: classes2.dex */
    public abstract /* synthetic */ class CC {
        public static /* synthetic */ Object sendRequestAndWait$default(HatchNodeTransport hatchNodeTransport, RpcMethod rpcMethod, JsonElement jsonElement, HtJ htJ, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendRequestAndWait");
            }
            if ((i & 2) != 0) {
                jsonElement = null;
            }
            return hatchNodeTransport.sendRequestAndWait(rpcMethod, jsonElement, htJ);
        }
    }

    C1BN<NodeConnectionState> getConnectionState();

    G0U<JsonElement, Unit> getOnClientInvokeRequest();

    Object sendRequestAndWait(RpcMethod rpcMethod, JsonElement jsonElement, HtJ<? super JsonElement> htJ);

    Object sendRequestAndWaitDeferred(RpcMethod rpcMethod, G0U<? super HtJ<? super JsonElement>, ? extends Object> g0u, HtJ<? super JsonElement> htJ);

    void setOnClientInvokeRequest(G0U<? super JsonElement, Unit> g0u);

    /* loaded from: classes2.dex */
    public abstract class DefaultImpls {
    }
}
