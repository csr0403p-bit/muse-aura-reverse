package com.facebook.aura.skills.repo;

import X.A64;
import X.AbstractC7559F3s;
import X.C9hr;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SkillPermissionSectionJson$Companion$$childSerializers$1 extends AbstractC7559F3s implements Function0<C9hr<List<? extends SkillPermissionGroupJson>>> {
    public static final SkillPermissionSectionJson$Companion$$childSerializers$1 INSTANCE = new SkillPermissionSectionJson$Companion$$childSerializers$1();

    public SkillPermissionSectionJson$Companion$$childSerializers$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<List<? extends SkillPermissionGroupJson>> invoke() {
        return new A64(SkillPermissionGroupJson$$serializer.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<List<? extends SkillPermissionGroupJson>> invoke() {
        return new A64(SkillPermissionGroupJson$$serializer.INSTANCE);
    }
}
