package com.facebook.aura.watchhandoff;

import X.AbstractC7559F3s;
import X.G0U;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class WatchAppPromoNudge$startRemoteActivity$2$1 extends AbstractC7559F3s implements G0U<Throwable, Unit> {
    public final /* synthetic */ ListenableFuture<Void> $future;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchAppPromoNudge$startRemoteActivity$2$1(ListenableFuture<Void> listenableFuture) {
        super(1);
        this.$future = listenableFuture;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        this.$future.cancel(true);
    }
}
