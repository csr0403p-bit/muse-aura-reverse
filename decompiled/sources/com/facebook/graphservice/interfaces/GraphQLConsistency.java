package com.facebook.graphservice.interfaces;

import X.AbstractC3616CYi;
import X.InterfaceC3617CYk;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes5.dex */
public interface GraphQLConsistency extends GraphQLBaseConsistency {
    ListenableFuture applyOptimistic(Tree tree, Tree tree2, AbstractC3616CYi abstractC3616CYi);

    ListenableFuture applyOptimisticBuilder(InterfaceC3617CYk interfaceC3617CYk, Tree tree, AbstractC3616CYi abstractC3616CYi);

    void publish(Tree tree);

    @Override // com.facebook.graphservice.interfaces.GraphQLBaseConsistency
    void publishBuilder(InterfaceC3617CYk interfaceC3617CYk);

    @Override // com.facebook.graphservice.interfaces.GraphQLBaseConsistency
    void publishBuilderWithFullConsistency(InterfaceC3617CYk interfaceC3617CYk);

    void publishWithFullConsistency(Tree tree);
}
