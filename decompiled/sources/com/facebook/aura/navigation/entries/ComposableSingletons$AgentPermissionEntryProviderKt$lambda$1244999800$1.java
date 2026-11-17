package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.agentpermission.AgentPermissionTaskDetailsSheetKt;
import com.facebook.aura.navigation.key.AgentPermissionTaskDetailsSheetKey;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class ComposableSingletons$AgentPermissionEntryProviderKt$lambda$1244999800$1 extends AbstractC7559F3s implements G0W<AgentPermissionTaskDetailsSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$AgentPermissionEntryProviderKt$lambda$1244999800$1 INSTANCE = new ComposableSingletons$AgentPermissionEntryProviderKt$lambda$1244999800$1();

    public ComposableSingletons$AgentPermissionEntryProviderKt$lambda$1244999800$1() {
        super(3);
    }

    public final void invoke(AgentPermissionTaskDetailsSheetKey agentPermissionTaskDetailsSheetKey, BFM bfm, int i) {
        C7384Etj.A0Y(agentPermissionTaskDetailsSheetKey, 0);
        AgentPermissionTaskDetailsSheetKt.AgentPermissionTaskDetailsSheet(agentPermissionTaskDetailsSheetKey.approvalId, agentPermissionTaskDetailsSheetKey.openerScreen, null, bfm, 0, 4);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(AgentPermissionTaskDetailsSheetKey agentPermissionTaskDetailsSheetKey, BFM bfm, Integer num) {
        invoke(agentPermissionTaskDetailsSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
