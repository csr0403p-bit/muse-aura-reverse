package com.facebook.aura.library.repo;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C9hr;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class GoalsListPayloadJson$Companion$$childSerializers$1 extends AbstractC7559F3s implements Function0<C9hr<List<? extends GoalJson>>> {
    public static final GoalsListPayloadJson$Companion$$childSerializers$1 INSTANCE = new GoalsListPayloadJson$Companion$$childSerializers$1();

    public GoalsListPayloadJson$Companion$$childSerializers$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<List<? extends GoalJson>> invoke() {
        return C3cG.A19(GoalJson$$serializer.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<List<? extends GoalJson>> invoke() {
        return C3cG.A19(GoalJson$$serializer.INSTANCE);
    }
}
