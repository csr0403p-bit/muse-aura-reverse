package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.library.view.GoalDetailScreenKt;
import com.facebook.aura.navigation.key.GoalDetailScreenKey;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class ComposableSingletons$GoalDetailEntryProviderKt$lambda$1078751922$1 extends AbstractC7559F3s implements G0W<GoalDetailScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$GoalDetailEntryProviderKt$lambda$1078751922$1 INSTANCE = new ComposableSingletons$GoalDetailEntryProviderKt$lambda$1078751922$1();

    public ComposableSingletons$GoalDetailEntryProviderKt$lambda$1078751922$1() {
        super(3);
    }

    public final void invoke(GoalDetailScreenKey goalDetailScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(goalDetailScreenKey, 0);
        GoalDetailScreenKt.GoalDetailScreen(goalDetailScreenKey.goalId, null, goalDetailScreenKey.goalTitle, goalDetailScreenKey.parentGoalTitle, bfm, 0, 2);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(GoalDetailScreenKey goalDetailScreenKey, BFM bfm, Integer num) {
        invoke(goalDetailScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
