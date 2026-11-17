package com.facebook.aura.library.repo;

import X.AbstractC7559F3s;
import X.C9hr;
import X.F0C;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.library.repo.HatchGoalsTabDataSource$fetchGoalDetail$2$invokeSuspend$$inlined$executeJarvisRequest-1iavgos$default$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class HatchGoalsTabDataSource$fetchGoalDetail$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 extends AbstractC7559F3s implements Function0<C9hr<GoalDetailPayloadJson>> {
    public static final HatchGoalsTabDataSource$fetchGoalDetail$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 INSTANCE = new HatchGoalsTabDataSource$fetchGoalDetail$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1();

    public HatchGoalsTabDataSource$fetchGoalDetail$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<GoalDetailPayloadJson> invoke() {
        F0C<C9hr<Object>>[] f0cArr = GoalDetailPayloadJson.$childSerializers;
        return GoalDetailPayloadJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<GoalDetailPayloadJson> invoke() {
        F0C<C9hr<Object>>[] f0cArr = GoalDetailPayloadJson.$childSerializers;
        return GoalDetailPayloadJson$$serializer.INSTANCE;
    }
}
