package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.G0W;
import com.facebook.aura.library.view.GoalsCompletedScreenKt;
import com.facebook.aura.navigation.key.GoalsCompletedScreenKey;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class ComposableSingletons$GoalsCompletedEntryProviderKt$lambda$308679015$1 extends AbstractC7559F3s implements G0W<GoalsCompletedScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$GoalsCompletedEntryProviderKt$lambda$308679015$1 INSTANCE = new ComposableSingletons$GoalsCompletedEntryProviderKt$lambda$308679015$1();

    public ComposableSingletons$GoalsCompletedEntryProviderKt$lambda$308679015$1() {
        super(3);
    }

    public final void invoke(GoalsCompletedScreenKey goalsCompletedScreenKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            GoalsCompletedScreenKt.GoalsCompletedScreen(null, null, bfm, 0, 3);
        } else {
            bfm.Afo();
        }
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(GoalsCompletedScreenKey goalsCompletedScreenKey, BFM bfm, Integer num) {
        invoke(goalsCompletedScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
