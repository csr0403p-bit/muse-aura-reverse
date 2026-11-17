package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.agentpermission.AgentPermissionDecisionSheetKt;
import com.facebook.aura.navigation.key.AgentPermissionDecisionSheetKey;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$AgentPermissionEntryProviderKt$lambda$-778296250$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class ComposableSingletons$AgentPermissionEntryProviderKt$lambda$778296250$1 extends AbstractC7559F3s implements G0W<AgentPermissionDecisionSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$AgentPermissionEntryProviderKt$lambda$778296250$1 INSTANCE = new ComposableSingletons$AgentPermissionEntryProviderKt$lambda$778296250$1();

    public ComposableSingletons$AgentPermissionEntryProviderKt$lambda$778296250$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(AgentPermissionDecisionSheetKey agentPermissionDecisionSheetKey, BFM bfm, Integer num) {
        invoke(agentPermissionDecisionSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(AgentPermissionDecisionSheetKey agentPermissionDecisionSheetKey, BFM bfm, int i) {
        C7384Etj.A0Y(agentPermissionDecisionSheetKey, 0);
        AgentPermissionDecisionSheetKt.AgentPermissionDecisionSheet(agentPermissionDecisionSheetKey.approvalId, null, bfm, 0, 2);
    }
}
