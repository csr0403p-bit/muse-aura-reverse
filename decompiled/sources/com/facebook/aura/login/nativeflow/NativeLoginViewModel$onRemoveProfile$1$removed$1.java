package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.C10543Hqv;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class NativeLoginViewModel$onRemoveProfile$1$removed$1 extends AbstractC7559F3s implements G0U<Throwable, Unit> {
    public final /* synthetic */ C10543Hqv<Throwable> $requestFailure;

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        C7384Etj.A0Y(th, 0);
        this.$requestFailure.element = th;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginViewModel$onRemoveProfile$1$removed$1(C10543Hqv<Throwable> c10543Hqv) {
        super(1);
        this.$requestFailure = c10543Hqv;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }
}
