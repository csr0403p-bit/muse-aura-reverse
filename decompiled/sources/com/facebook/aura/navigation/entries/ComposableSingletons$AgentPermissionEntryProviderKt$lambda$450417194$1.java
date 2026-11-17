package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.agentpermission.AgentPermissionHistoryDetailsSheetKt;
import com.facebook.aura.navigation.key.AgentPermissionHistoryDetailsSheetKey;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$AgentPermissionEntryProviderKt$lambda$-450417194$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class ComposableSingletons$AgentPermissionEntryProviderKt$lambda$450417194$1 extends AbstractC7559F3s implements G0W<AgentPermissionHistoryDetailsSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$AgentPermissionEntryProviderKt$lambda$450417194$1 INSTANCE = new ComposableSingletons$AgentPermissionEntryProviderKt$lambda$450417194$1();

    public ComposableSingletons$AgentPermissionEntryProviderKt$lambda$450417194$1() {
        super(3);
    }

    public final void invoke(AgentPermissionHistoryDetailsSheetKey agentPermissionHistoryDetailsSheetKey, BFM bfm, int i) {
        C7384Etj.A0Y(agentPermissionHistoryDetailsSheetKey, 0);
        AgentPermissionHistoryDetailsSheetKt.AgentPermissionHistoryDetailsSheet(agentPermissionHistoryDetailsSheetKey.approvalId, agentPermissionHistoryDetailsSheetKey.sessionId, null, bfm, 0, 4);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(AgentPermissionHistoryDetailsSheetKey agentPermissionHistoryDetailsSheetKey, BFM bfm, Integer num) {
        invoke(agentPermissionHistoryDetailsSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
