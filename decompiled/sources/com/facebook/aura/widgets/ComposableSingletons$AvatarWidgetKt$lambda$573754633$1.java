package com.facebook.aura.widgets;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ComposableSingletons$AvatarWidgetKt$lambda$573754633$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public static final ComposableSingletons$AvatarWidgetKt$lambda$573754633$1 INSTANCE = new ComposableSingletons$AvatarWidgetKt$lambda$573754633$1();

    public ComposableSingletons$AvatarWidgetKt$lambda$573754633$1() {
        super(2);
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            AvatarWidgetKt.AvatarContent(null, bfm, 0, 1);
        } else {
            bfm.Afo();
        }
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
