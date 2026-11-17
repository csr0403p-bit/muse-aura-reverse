package com.facebook.aura.nodes.core;

import X.HtJ;
import com.facebook.aura.nodes.core.NodeHitlResult;

/* loaded from: classes3.dex */
public interface NodeHitlGate {
    Object check(NodeHitlSpec nodeHitlSpec, NodeHitlRequest nodeHitlRequest, HtJ<? super NodeHitlResult> htJ);

    public final class AllowAll implements NodeHitlGate {
        public static final AllowAll INSTANCE = new AllowAll();

        @Override // com.facebook.aura.nodes.core.NodeHitlGate
        public Object check(NodeHitlSpec nodeHitlSpec, NodeHitlRequest nodeHitlRequest, HtJ<? super NodeHitlResult> htJ) {
            return NodeHitlResult.Allowed.INSTANCE;
        }
    }
}
