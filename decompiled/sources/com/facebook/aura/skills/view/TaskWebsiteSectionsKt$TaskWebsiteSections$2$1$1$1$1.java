package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C07C;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import com.facebook.aura.skills.repo.TaskWebsitePermission;
import com.facebook.aura.skills.viewmodel.TaskPermissionsUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class TaskWebsiteSectionsKt$TaskWebsiteSections$2$1$1$1$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ G0U<String, Unit> $onRevoke;
    public final /* synthetic */ TaskPermissionsUiState $state;
    public final /* synthetic */ TaskWebsitePermission $website;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TaskWebsiteSectionsKt$TaskWebsiteSections$2$1$1$1$1(TaskWebsitePermission taskWebsitePermission, TaskPermissionsUiState taskPermissionsUiState, G0U<? super String, Unit> g0u) {
        super(3);
        this.$website = taskWebsitePermission;
        this.$state = taskPermissionsUiState;
        this.$onRevoke = g0u;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            bfm.Afo();
            return;
        }
        TaskWebsitePermission taskWebsitePermission = this.$website;
        TaskPermissionsUiState taskPermissionsUiState = this.$state;
        boolean z = !taskPermissionsUiState.isBusy();
        boolean zAreEqual = C7384Etj.areEqual(taskPermissionsUiState.revokingWebsiteId, taskWebsitePermission.id);
        boolean zA1T = AnonymousClass001.A1T(bfm, this.$website, bfm.A65(this.$onRevoke));
        G0U<String, Unit> g0u = this.$onRevoke;
        TaskWebsitePermission taskWebsitePermission2 = this.$website;
        Object objAaT = bfm.AaT();
        if (zA1T || objAaT == C78N.A00) {
            objAaT = new TaskWebsiteSectionsKt$TaskWebsiteSections$2$1$1$1$1$1$1(g0u, taskWebsitePermission2);
            bfm.Ai0(objAaT);
        }
        TaskWebsiteSectionsKt.TaskWebsiteRow(taskWebsitePermission, z, zAreEqual, (Function0) objAaT, null, bfm, 0, 16);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
