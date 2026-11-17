package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.BLU;
import X.C2LD;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConversationPresentationsKt$WidgetPresentations$2$1$1 extends AbstractC7559F3s implements G0U<C2LD, Unit> {
    public final /* synthetic */ G0U<BLU, Unit> $onBoundsChanged;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2LD c2ld) {
        C7384Etj.A0Y(c2ld, 0);
        this.$onBoundsChanged.invoke(c2ld.A03());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationPresentationsKt$WidgetPresentations$2$1$1(G0U<? super BLU, Unit> g0u) {
        super(1);
        this.$onBoundsChanged = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2LD c2ld) {
        invoke2(c2ld);
        return Unit.INSTANCE;
    }
}
