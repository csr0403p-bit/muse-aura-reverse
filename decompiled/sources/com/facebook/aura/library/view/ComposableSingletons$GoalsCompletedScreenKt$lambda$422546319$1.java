package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass037;
import X.BFM;
import X.G0W;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class ComposableSingletons$GoalsCompletedScreenKt$lambda$422546319$1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
    public static final ComposableSingletons$GoalsCompletedScreenKt$lambda$422546319$1 INSTANCE = new ComposableSingletons$GoalsCompletedScreenKt$lambda$422546319$1();

    public ComposableSingletons$GoalsCompletedScreenKt$lambda$422546319$1() {
        super(3);
    }

    public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            GoalsCompletedScreenKt.CompletedGoalsTitle(null, bfm, 0, 1);
        } else {
            bfm.Afo();
        }
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
        invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
