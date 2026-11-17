package com.facebook.aura.spaces.menu;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C08R;
import X.G0V;
import X.G0W;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class SpaceMenuPresentationKt$SpaceMenuCardAction$1$1 extends AbstractC7559F3s implements G0W<C08R, BFM, Integer, Unit> {
    public final /* synthetic */ G0V<BFM, Integer, Unit> $content;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SpaceMenuPresentationKt$SpaceMenuCardAction$1$1(G0V<? super BFM, ? super Integer, Unit> g0v) {
        super(3);
        this.$content = g0v;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C08R c08r, BFM bfm, Integer num) {
        invoke(c08r, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C08R c08r, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            AnonymousClass001.A1H(bfm, this.$content, 0);
        } else {
            bfm.Afo();
        }
    }
}
