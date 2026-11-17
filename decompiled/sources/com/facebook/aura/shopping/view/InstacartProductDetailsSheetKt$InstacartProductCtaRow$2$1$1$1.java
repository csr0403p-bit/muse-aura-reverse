package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.shopping.viewmodel.InstacartProductAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class InstacartProductDetailsSheetKt$InstacartProductCtaRow$2$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ InstacartProductAction.OpenLink $arrow;
    public final /* synthetic */ G0U<InstacartProductAction.OpenLink, Unit> $openLink;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InstacartProductDetailsSheetKt$InstacartProductCtaRow$2$1$1$1(G0U<? super InstacartProductAction.OpenLink, Unit> g0u, InstacartProductAction.OpenLink openLink) {
        super(0);
        this.$openLink = g0u;
        this.$arrow = openLink;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$openLink.invoke(this.$arrow);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
