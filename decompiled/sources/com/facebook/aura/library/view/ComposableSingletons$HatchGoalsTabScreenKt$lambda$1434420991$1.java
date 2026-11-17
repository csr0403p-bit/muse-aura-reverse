package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass037;
import X.BFM;
import X.G0W;
import com.facebook.aura.R;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class ComposableSingletons$HatchGoalsTabScreenKt$lambda$1434420991$1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchGoalsTabScreenKt$lambda$1434420991$1 INSTANCE = new ComposableSingletons$HatchGoalsTabScreenKt$lambda$1434420991$1();

    public ComposableSingletons$HatchGoalsTabScreenKt$lambda$1434420991$1() {
        super(3);
    }

    public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            HatchGoalsTabScreenKt.GoalsLoadingMoreFooter(R.string._name_removed__res_0x7f120a86, null, bfm, 0, 2);
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
