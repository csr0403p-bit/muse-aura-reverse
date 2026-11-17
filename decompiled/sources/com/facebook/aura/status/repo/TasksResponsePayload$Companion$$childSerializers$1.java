package com.facebook.aura.status.repo;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C9hr;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class TasksResponsePayload$Companion$$childSerializers$1 extends AbstractC7559F3s implements Function0<C9hr<List<? extends TaskResponseEntry>>> {
    public static final TasksResponsePayload$Companion$$childSerializers$1 INSTANCE = new TasksResponsePayload$Companion$$childSerializers$1();

    public TasksResponsePayload$Companion$$childSerializers$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<List<? extends TaskResponseEntry>> invoke() {
        return C3cG.A19(TaskResponseEntry$$serializer.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<List<? extends TaskResponseEntry>> invoke() {
        return C3cG.A19(TaskResponseEntry$$serializer.INSTANCE);
    }
}
