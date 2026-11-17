package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.shopping.model.PdpActionIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ShoppingProductDetailsBodyKt$ShoppingProductDetailsBody$1$4$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<PdpActionIntent, Unit> $onAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShoppingProductDetailsBodyKt$ShoppingProductDetailsBody$1$4$1(G0U<? super PdpActionIntent, Unit> g0u) {
        super(0);
        this.$onAction = g0u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onAction.invoke(new PdpActionIntent.OpenUrl(ShoppingProductDetailsBodyKt.BUY_RESPONSIBLY_URL));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
