package com.facebook.aura.conversation.view;

import X.AnonymousClass001;
import X.C7438Evz;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class HatchImageOptionsWidgetKt$ImageOptionTile$3$1$1$1 extends C7438Evz implements G0V<Integer, Integer, Unit> {
    public HatchImageOptionsWidgetKt$ImageOptionTile$3$1$1$1(Object obj) {
        super(2, obj, ImageOptionTileAnchor.class, "onImageSizeDecoded", "onImageSizeDecoded(II)V", 0);
    }

    public final void invoke(int i, int i2) {
        ((ImageOptionTileAnchor) this.receiver).onImageSizeDecoded(i, i2);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
        invoke(AnonymousClass001.A0F(num), AnonymousClass001.A0F(num2));
        return Unit.INSTANCE;
    }
}
