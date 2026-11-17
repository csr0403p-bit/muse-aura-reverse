package com.facebook.aura.skills.repo;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C9hr;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class TaskPermissionsResponseJson$Companion$$childSerializers$2 extends AbstractC7559F3s implements Function0<C9hr<List<? extends TaskWebsitePermissionJson>>> {
    public static final TaskPermissionsResponseJson$Companion$$childSerializers$2 INSTANCE = new TaskPermissionsResponseJson$Companion$$childSerializers$2();

    public TaskPermissionsResponseJson$Companion$$childSerializers$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<List<? extends TaskWebsitePermissionJson>> invoke() {
        return C3cG.A19(TaskWebsitePermissionJson$$serializer.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<List<? extends TaskWebsitePermissionJson>> invoke() {
        return C3cG.A19(TaskWebsitePermissionJson$$serializer.INSTANCE);
    }
}
