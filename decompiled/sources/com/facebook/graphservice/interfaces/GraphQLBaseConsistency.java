package com.facebook.graphservice.interfaces;

import X.InterfaceC3617CYk;
import com.facebook.graphservice.interfaces.GraphQLService;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public interface GraphQLBaseConsistency {
    <T> ListenableFuture<T> lookup(T t);

    void publishBuilder(InterfaceC3617CYk interfaceC3617CYk);

    void publishBuilderWithFullConsistency(InterfaceC3617CYk interfaceC3617CYk);

    <T> GraphQLService.Token subscribe(T t, GraphQLService.DataCallbacks dataCallbacks, Executor executor);

    <T> GraphQLService.Token subscribeWithFullConsistency(T t, GraphQLService.DataCallbacks dataCallbacks, Executor executor);
}
