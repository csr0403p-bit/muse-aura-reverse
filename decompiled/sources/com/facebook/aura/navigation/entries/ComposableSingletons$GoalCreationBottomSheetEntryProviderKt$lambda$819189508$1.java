package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.library.view.GoalCreationBottomSheetKt;
import com.facebook.aura.navigation.key.GoalCreationBottomSheetKey;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$GoalCreationBottomSheetEntryProviderKt$lambda$-819189508$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$GoalCreationBottomSheetEntryProviderKt$lambda$819189508$1 extends AbstractC7559F3s implements G0W<GoalCreationBottomSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$GoalCreationBottomSheetEntryProviderKt$lambda$819189508$1 INSTANCE = new ComposableSingletons$GoalCreationBottomSheetEntryProviderKt$lambda$819189508$1();

    public ComposableSingletons$GoalCreationBottomSheetEntryProviderKt$lambda$819189508$1() {
        super(3);
    }

    public final void invoke(GoalCreationBottomSheetKey goalCreationBottomSheetKey, BFM bfm, int i) {
        C7384Etj.A0Y(goalCreationBottomSheetKey, 0);
        GoalCreationBottomSheetKt.GoalCreationBottomSheet(goalCreationBottomSheetKey.category, null, bfm, 0, 2);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(GoalCreationBottomSheetKey goalCreationBottomSheetKey, BFM bfm, Integer num) {
        invoke(goalCreationBottomSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
