package com.facebook.aura.ageverification;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.user.provider.AgeCheckMethod;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AgeMethodListScreenKt$AgeMethodTiles$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AgeCheckMethod $method;
    public final /* synthetic */ G0U<AgeCheckMethod, Unit> $onPick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AgeMethodListScreenKt$AgeMethodTiles$1$1$1$1(G0U<? super AgeCheckMethod, Unit> g0u, AgeCheckMethod ageCheckMethod) {
        super(0);
        this.$onPick = g0u;
        this.$method = ageCheckMethod;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onPick.invoke(this.$method);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
