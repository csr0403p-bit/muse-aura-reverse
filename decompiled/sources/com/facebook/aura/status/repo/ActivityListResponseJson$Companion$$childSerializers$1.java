package com.facebook.aura.status.repo;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C9hr;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class ActivityListResponseJson$Companion$$childSerializers$1 extends AbstractC7559F3s implements Function0<C9hr<List<? extends ActivityDayResponseJson>>> {
    public static final ActivityListResponseJson$Companion$$childSerializers$1 INSTANCE = new ActivityListResponseJson$Companion$$childSerializers$1();

    public ActivityListResponseJson$Companion$$childSerializers$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<List<? extends ActivityDayResponseJson>> invoke() {
        return C3cG.A19(ActivityDayResponseJson$$serializer.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<List<? extends ActivityDayResponseJson>> invoke() {
        return C3cG.A19(ActivityDayResponseJson$$serializer.INSTANCE);
    }
}
