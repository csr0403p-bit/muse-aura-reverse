package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.G0V;
import kotlin.Unit;

/* renamed from: com.facebook.aura.pairs.ComposableSingletons$ConnectionsTabScreenKt$lambda$-377387563$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$ConnectionsTabScreenKt$lambda$377387563$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public static final ComposableSingletons$ConnectionsTabScreenKt$lambda$377387563$1 INSTANCE = new ComposableSingletons$ConnectionsTabScreenKt$lambda$377387563$1();

    public ComposableSingletons$ConnectionsTabScreenKt$lambda$377387563$1() {
        super(2);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            ConnectionsComponentsKt.m1649ConnectionsGroupAvatarDt02yhY(ConnectionsTabScreenKt.AVATAR_SIZE, null, 0L, bfm, 6, 6);
        } else {
            bfm.Afo();
        }
    }
}
