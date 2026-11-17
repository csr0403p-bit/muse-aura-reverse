package com.facebook.aura.header.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.BRg;
import X.C01N;
import X.G0V;
import kotlin.Unit;

/* renamed from: com.facebook.aura.header.view.ComposableSingletons$HatchTabScreenKt$lambda$-1296961461$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$HatchTabScreenKt$lambda$1296961461$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchTabScreenKt$lambda$1296961461$1 INSTANCE = new ComposableSingletons$HatchTabScreenKt$lambda$1296961461$1();

    public ComposableSingletons$HatchTabScreenKt$lambda$1296961461$1() {
        super(2);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            C01N.A0A(bfm, BRg.A00, HeaderButtonKt.PillIconTouchTarget);
        } else {
            bfm.Afo();
        }
    }
}
