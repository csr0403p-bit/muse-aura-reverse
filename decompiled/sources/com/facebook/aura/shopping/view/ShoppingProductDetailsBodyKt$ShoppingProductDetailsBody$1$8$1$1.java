package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.shopping.model.PdpActionIntent;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ShoppingProductDetailsBodyKt$ShoppingProductDetailsBody$1$8$1$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ G0U<PdpActionIntent, Unit> $onAction;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        this.$onAction.invoke(new PdpActionIntent.OpenUrl(str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShoppingProductDetailsBodyKt$ShoppingProductDetailsBody$1$8$1$1(G0U<? super PdpActionIntent, Unit> g0u) {
        super(1);
        this.$onAction = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
