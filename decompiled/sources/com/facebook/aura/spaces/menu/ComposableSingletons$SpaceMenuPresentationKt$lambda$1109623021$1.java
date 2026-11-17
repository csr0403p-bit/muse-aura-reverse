package com.facebook.aura.spaces.menu;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C08R;
import X.G0W;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$SpaceMenuPresentationKt$lambda$1109623021$1 extends AbstractC7559F3s implements G0W<C08R, BFM, Integer, Unit> {
    public static final ComposableSingletons$SpaceMenuPresentationKt$lambda$1109623021$1 INSTANCE = new ComposableSingletons$SpaceMenuPresentationKt$lambda$1109623021$1();

    public ComposableSingletons$SpaceMenuPresentationKt$lambda$1109623021$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C08R c08r, BFM bfm, Integer num) {
        invoke(c08r, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C08R c08r, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            SpaceMenuPresentationKt.SpaceMenuLoadingSpinner(null, bfm, 0, 1);
        } else {
            bfm.Afo();
        }
    }
}
