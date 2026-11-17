package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC1497Ak4;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchImageOptionsWidgetKt$imageOptionTileGestures$tile$1$1 extends AbstractC7559F3s implements G0U<InterfaceC1497Ak4, Unit> {
    public final /* synthetic */ ImageOptionTileAnchor $anchor;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC1497Ak4 interfaceC1497Ak4) {
        C7384Etj.A0Y(interfaceC1497Ak4, 0);
        this.$anchor.coordinates = interfaceC1497Ak4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchImageOptionsWidgetKt$imageOptionTileGestures$tile$1$1(ImageOptionTileAnchor imageOptionTileAnchor) {
        super(1);
        this.$anchor = imageOptionTileAnchor;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC1497Ak4 interfaceC1497Ak4) {
        invoke2(interfaceC1497Ak4);
        return Unit.INSTANCE;
    }
}
