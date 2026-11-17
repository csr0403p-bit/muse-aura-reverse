package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.C7BY;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.TaskConnectorPermissionsScreenKey;
import com.facebook.aura.skills.model.Skill;
import com.facebook.aura.skills.repo.TaskConnectorPermissions;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchTaskPermissionsScreenKt$TaskConnectorRow$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ TaskConnectorPermissions $permission;
    public final /* synthetic */ Skill $skill;
    public final /* synthetic */ String $taskId;
    public final /* synthetic */ String $taskName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchTaskPermissionsScreenKt$TaskConnectorRow$1$1(TaskConnectorPermissions taskConnectorPermissions, AuraNavigator auraNavigator, String str, String str2, Skill skill) {
        super(0);
        this.$permission = taskConnectorPermissions;
        this.$navigator = auraNavigator;
        this.$taskId = str;
        this.$taskName = str2;
        this.$skill = skill;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchTaskPermissionsScreenKt.logTaskConnectorRowClick(this.$permission.id);
        AuraNavigator auraNavigator = this.$navigator;
        String str = this.$taskId;
        String str2 = this.$taskName;
        TaskConnectorPermissions taskConnectorPermissions = this.$permission;
        String str3 = taskConnectorPermissions.id;
        String str4 = this.$skill.displayName;
        if (C7BY.A0j(str4)) {
            str4 = taskConnectorPermissions.displayName;
        }
        auraNavigator.navigate((AuraNavKey) new TaskConnectorPermissionsScreenKey(str, str2, str3, str4), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
