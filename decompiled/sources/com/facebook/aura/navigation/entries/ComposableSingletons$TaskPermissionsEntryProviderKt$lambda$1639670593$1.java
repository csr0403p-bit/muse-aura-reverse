package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.navigation.key.TaskConnectorPermissionsScreenKey;
import com.facebook.aura.skills.view.HatchTaskConnectorPermissionsScreenKt;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ComposableSingletons$TaskPermissionsEntryProviderKt$lambda$1639670593$1 extends AbstractC7559F3s implements G0W<TaskConnectorPermissionsScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$TaskPermissionsEntryProviderKt$lambda$1639670593$1 INSTANCE = new ComposableSingletons$TaskPermissionsEntryProviderKt$lambda$1639670593$1();

    public ComposableSingletons$TaskPermissionsEntryProviderKt$lambda$1639670593$1() {
        super(3);
    }

    public final void invoke(TaskConnectorPermissionsScreenKey taskConnectorPermissionsScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(taskConnectorPermissionsScreenKey, 0);
        HatchTaskConnectorPermissionsScreenKt.HatchTaskConnectorPermissionsScreen(taskConnectorPermissionsScreenKey.taskId, taskConnectorPermissionsScreenKey.taskName, taskConnectorPermissionsScreenKey.connectorId, taskConnectorPermissionsScreenKey.connectorName, null, bfm, 0, 16);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(TaskConnectorPermissionsScreenKey taskConnectorPermissionsScreenKey, BFM bfm, Integer num) {
        invoke(taskConnectorPermissionsScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
