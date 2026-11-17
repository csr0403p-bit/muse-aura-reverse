package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.agentpermission.AgentPermissionMessageEditorScreenKt;
import com.facebook.aura.navigation.key.AgentPermissionMessageEditorScreenKey;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class ComposableSingletons$AgentPermissionEntryProviderKt$lambda$1009565916$1 extends AbstractC7559F3s implements G0W<AgentPermissionMessageEditorScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$AgentPermissionEntryProviderKt$lambda$1009565916$1 INSTANCE = new ComposableSingletons$AgentPermissionEntryProviderKt$lambda$1009565916$1();

    public ComposableSingletons$AgentPermissionEntryProviderKt$lambda$1009565916$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(AgentPermissionMessageEditorScreenKey agentPermissionMessageEditorScreenKey, BFM bfm, Integer num) {
        invoke(agentPermissionMessageEditorScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(AgentPermissionMessageEditorScreenKey agentPermissionMessageEditorScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(agentPermissionMessageEditorScreenKey, 0);
        AgentPermissionMessageEditorScreenKt.AgentPermissionMessageEditorScreen(agentPermissionMessageEditorScreenKey.approvalId, null, bfm, 0, 2);
    }
}
