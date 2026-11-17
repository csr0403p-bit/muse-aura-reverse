package com.facebook.aura.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass037;
import X.BFM;
import X.G0V;
import X.G0W;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchSectionKt$HatchSection$3 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
    public final /* synthetic */ G0V<BFM, Integer, Unit> $header;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchSectionKt$HatchSection$3(G0V<? super BFM, ? super Integer, Unit> g0v) {
        super(3);
        this.$header = g0v;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
        invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            AnonymousClass001.A1H(bfm, this.$header, 0);
        } else {
            bfm.Afo();
        }
    }
}
