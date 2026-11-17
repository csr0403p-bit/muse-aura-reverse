package com.facebook.aura.conversation.view;

import X.AaC;
import X.AbstractC1496Ak3;
import X.AbstractC7559F3s;
import X.G0V;
import X.InterfaceC1497Ak4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchImageOptionsWidgetKt$imageOptionTileGestures$preview$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ImageOptionTileAnchor $anchor;
    public final /* synthetic */ G0V<AaC, Float, Unit> $onPreview;
    public final /* synthetic */ float $ratio;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchImageOptionsWidgetKt$imageOptionTileGestures$preview$1$1$1(ImageOptionTileAnchor imageOptionTileAnchor, G0V<? super AaC, ? super Float, Unit> g0v, float f) {
        super(0);
        this.$anchor = imageOptionTileAnchor;
        this.$onPreview = g0v;
        this.$ratio = f;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        InterfaceC1497Ak4 interfaceC1497Ak4 = this.$anchor.coordinates;
        if (interfaceC1497Ak4 == null || !interfaceC1497Ak4.isAttached()) {
            return;
        }
        this.$onPreview.invoke(AbstractC1496Ak3.A00(interfaceC1497Ak4, true), Float.valueOf(this.$ratio));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
