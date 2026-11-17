package com.facebook.aura.library.repo;

import X.AbstractC7559F3s;
import X.C9hr;
import X.F0C;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.library.repo.HatchGoalsTabDataSource$fetchGoalsPage$$inlined$executeJarvisRequest-1iavgos$default$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class HatchGoalsTabDataSource$fetchGoalsPage$$inlined$executeJarvisRequest1iavgos$default$1 extends AbstractC7559F3s implements Function0<C9hr<GoalsListPayloadJson>> {
    public static final HatchGoalsTabDataSource$fetchGoalsPage$$inlined$executeJarvisRequest1iavgos$default$1 INSTANCE = new HatchGoalsTabDataSource$fetchGoalsPage$$inlined$executeJarvisRequest1iavgos$default$1();

    public HatchGoalsTabDataSource$fetchGoalsPage$$inlined$executeJarvisRequest1iavgos$default$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<GoalsListPayloadJson> invoke() {
        F0C<C9hr<Object>>[] f0cArr = GoalsListPayloadJson.$childSerializers;
        return GoalsListPayloadJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<GoalsListPayloadJson> invoke() {
        F0C<C9hr<Object>>[] f0cArr = GoalsListPayloadJson.$childSerializers;
        return GoalsListPayloadJson$$serializer.INSTANCE;
    }
}
