package com.facebook.aura.network.transport.tigon;

import X.AbstractC7559F3s;
import X.BV5;
import X.G0U;
import com.facebook.tigon.TigonRequestToken;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class TigonHatchHttpClient$executeStreaming$2$1 extends AbstractC7559F3s implements G0U<Throwable, Unit> {
    public final /* synthetic */ AtomicReference<TigonRequestToken> $requestToken;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TigonHatchHttpClient$executeStreaming$2$1(AtomicReference<TigonRequestToken> atomicReference) {
        super(1);
        this.$requestToken = atomicReference;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        BV5.A1L(this.$requestToken);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        BV5.A1L(this.$requestToken);
    }
}
