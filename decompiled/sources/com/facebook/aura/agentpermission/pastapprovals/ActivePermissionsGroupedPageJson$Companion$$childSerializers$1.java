package com.facebook.aura.agentpermission.pastapprovals;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C9hr;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ActivePermissionsGroupedPageJson$Companion$$childSerializers$1 extends AbstractC7559F3s implements Function0<C9hr<List<? extends ActivePermissionGroupJson>>> {
    public static final ActivePermissionsGroupedPageJson$Companion$$childSerializers$1 INSTANCE = new ActivePermissionsGroupedPageJson$Companion$$childSerializers$1();

    public ActivePermissionsGroupedPageJson$Companion$$childSerializers$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<List<? extends ActivePermissionGroupJson>> invoke() {
        return C3cG.A19(ActivePermissionGroupJson$$serializer.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<List<? extends ActivePermissionGroupJson>> invoke() {
        return C3cG.A19(ActivePermissionGroupJson$$serializer.INSTANCE);
    }
}
