package com.facebook.aura.confidentialvm.network;

import X.ADl;
import X.AbstractC7559F3s;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AuraVestaStefiTransport$post$1$body$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ADl $callback;
    public final /* synthetic */ IOException $e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraVestaStefiTransport$post$1$body$1(ADl aDl, IOException iOException) {
        super(0);
        this.$callback = aDl;
        this.$e = iOException;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$callback.onFailure(this.$e);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
