package com.facebook.aura.network.transport.tigon;

import X.AbstractC7559F3s;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class TigonHatchHttpClient$openResponseStream$2$1 extends AbstractC7559F3s implements G0U<Throwable, Unit> {
    public final /* synthetic */ Function0<Unit> $closeStream;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TigonHatchHttpClient$openResponseStream$2$1(Function0<Unit> function0) {
        super(1);
        this.$closeStream = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        this.$closeStream.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        this.$closeStream.invoke();
    }
}
