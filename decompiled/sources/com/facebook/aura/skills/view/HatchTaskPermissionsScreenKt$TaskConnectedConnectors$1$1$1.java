package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.C3cH;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.skills.model.Skill;
import com.facebook.aura.skills.repo.TaskConnectorPermissions;
import com.facebook.aura.ui.HatchSectionScope;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchTaskPermissionsScreenKt$TaskConnectedConnectors$1$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ Map<Skill, TaskConnectorPermissions> $matched;
    public final /* synthetic */ String $taskId;
    public final /* synthetic */ String $taskName;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        Map<Skill, TaskConnectorPermissions> map = this.$matched;
        String str = this.$taskId;
        String str2 = this.$taskName;
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            AnonymousClass006.A1E(hatchSectionScope, new HatchTaskPermissionsScreenKt$TaskConnectedConnectors$1$1$1$1$1(str, str2, (Skill) entryA0l.getKey(), (TaskConnectorPermissions) entryA0l.getValue()), -400598720);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchTaskPermissionsScreenKt$TaskConnectedConnectors$1$1$1(Map<Skill, TaskConnectorPermissions> map, String str, String str2) {
        super(1);
        this.$matched = map;
        this.$taskId = str;
        this.$taskName = str2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
