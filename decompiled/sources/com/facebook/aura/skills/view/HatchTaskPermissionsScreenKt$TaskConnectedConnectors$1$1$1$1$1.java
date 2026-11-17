package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C07C;
import X.G0W;
import com.facebook.aura.skills.model.Skill;
import com.facebook.aura.skills.repo.TaskConnectorPermissions;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchTaskPermissionsScreenKt$TaskConnectedConnectors$1$1$1$1$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ TaskConnectorPermissions $permission;
    public final /* synthetic */ Skill $skill;
    public final /* synthetic */ String $taskId;
    public final /* synthetic */ String $taskName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchTaskPermissionsScreenKt$TaskConnectedConnectors$1$1$1$1$1(String str, String str2, Skill skill, TaskConnectorPermissions taskConnectorPermissions) {
        super(3);
        this.$taskId = str;
        this.$taskName = str2;
        this.$skill = skill;
        this.$permission = taskConnectorPermissions;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            HatchTaskPermissionsScreenKt.TaskConnectorRow(this.$taskId, this.$taskName, this.$skill, this.$permission, null, bfm, 0, 16);
        } else {
            bfm.Afo();
        }
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
