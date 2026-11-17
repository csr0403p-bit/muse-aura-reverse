package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.navigation.key.TaskPermissionsScreenKey;
import com.facebook.aura.skills.view.HatchTaskPermissionsScreenKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$TaskPermissionsEntryProviderKt$lambda$-1733021147$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$TaskPermissionsEntryProviderKt$lambda$1733021147$1 extends AbstractC7559F3s implements G0W<TaskPermissionsScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$TaskPermissionsEntryProviderKt$lambda$1733021147$1 INSTANCE = new ComposableSingletons$TaskPermissionsEntryProviderKt$lambda$1733021147$1();

    public ComposableSingletons$TaskPermissionsEntryProviderKt$lambda$1733021147$1() {
        super(3);
    }

    public final void invoke(TaskPermissionsScreenKey taskPermissionsScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(taskPermissionsScreenKey, 0);
        HatchTaskPermissionsScreenKt.HatchTaskPermissionsScreen(taskPermissionsScreenKey.taskId, taskPermissionsScreenKey.taskName, null, bfm, 0, 4);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(TaskPermissionsScreenKey taskPermissionsScreenKey, BFM bfm, Integer num) {
        invoke(taskPermissionsScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
