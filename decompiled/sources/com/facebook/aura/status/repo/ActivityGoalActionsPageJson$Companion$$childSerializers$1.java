package com.facebook.aura.status.repo;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C9hr;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class ActivityGoalActionsPageJson$Companion$$childSerializers$1 extends AbstractC7559F3s implements Function0<C9hr<List<? extends ActivityGoalActionJson>>> {
    public static final ActivityGoalActionsPageJson$Companion$$childSerializers$1 INSTANCE = new ActivityGoalActionsPageJson$Companion$$childSerializers$1();

    public ActivityGoalActionsPageJson$Companion$$childSerializers$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<List<? extends ActivityGoalActionJson>> invoke() {
        return C3cG.A19(ActivityGoalActionJson$$serializer.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<List<? extends ActivityGoalActionJson>> invoke() {
        return C3cG.A19(ActivityGoalActionJson$$serializer.INSTANCE);
    }
}
