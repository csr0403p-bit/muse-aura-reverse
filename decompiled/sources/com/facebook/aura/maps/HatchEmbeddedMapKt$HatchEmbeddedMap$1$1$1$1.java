package com.facebook.aura.maps;

import X.AbstractC7559F3s;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchEmbeddedMapKt$HatchEmbeddedMap$1$1$1$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ Function0<Unit> $expand;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchEmbeddedMapKt$HatchEmbeddedMap$1$1$1$1(Function0<Unit> function0) {
        super(1);
        this.$expand = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        this.$expand.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        this.$expand.invoke();
    }
}
