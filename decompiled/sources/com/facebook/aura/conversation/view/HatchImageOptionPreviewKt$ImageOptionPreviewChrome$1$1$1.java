package com.facebook.aura.conversation.view;

import X.AaC;
import X.AbstractC1496Ak3;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC1497Ak4;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchImageOptionPreviewKt$ImageOptionPreviewChrome$1$1$1 extends AbstractC7559F3s implements G0U<InterfaceC1497Ak4, Unit> {
    public final /* synthetic */ float $aspectRatio;
    public final /* synthetic */ G0U<AaC, Unit> $onTargetBoundsChanged;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC1497Ak4 interfaceC1497Ak4) {
        C7384Etj.A0Y(interfaceC1497Ak4, 0);
        this.$onTargetBoundsChanged.invoke(HatchImageOptionPreviewKt.fitted(AbstractC1496Ak3.A00(interfaceC1497Ak4, true), this.$aspectRatio));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchImageOptionPreviewKt$ImageOptionPreviewChrome$1$1$1(G0U<? super AaC, Unit> g0u, float f) {
        super(1);
        this.$onTargetBoundsChanged = g0u;
        this.$aspectRatio = f;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC1497Ak4 interfaceC1497Ak4) {
        invoke2(interfaceC1497Ak4);
        return Unit.INSTANCE;
    }
}
