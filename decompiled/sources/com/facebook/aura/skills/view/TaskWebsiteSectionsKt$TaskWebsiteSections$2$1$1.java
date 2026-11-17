package com.facebook.aura.skills.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.skills.repo.TaskWebsitePermission;
import com.facebook.aura.skills.viewmodel.TaskPermissionsUiState;
import com.facebook.aura.ui.HatchSectionScope;
import java.util.Iterator;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class TaskWebsiteSectionsKt$TaskWebsiteSections$2$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ G0U<String, Unit> $onRevoke;
    public final /* synthetic */ TaskPermissionsUiState $state;
    public final /* synthetic */ AHD<TaskWebsitePermission> $websites;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AHD<TaskWebsitePermission> ahd = this.$websites;
        TaskPermissionsUiState taskPermissionsUiState = this.$state;
        G0U<String, Unit> g0u = this.$onRevoke;
        Iterator it = ahd.iterator();
        while (it.hasNext()) {
            AnonymousClass006.A1E(hatchSectionScope, new TaskWebsiteSectionsKt$TaskWebsiteSections$2$1$1$1$1((TaskWebsitePermission) it.next(), taskPermissionsUiState, g0u), 1549761635);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TaskWebsiteSectionsKt$TaskWebsiteSections$2$1$1(AHD<TaskWebsitePermission> ahd, TaskPermissionsUiState taskPermissionsUiState, G0U<? super String, Unit> g0u) {
        super(1);
        this.$websites = ahd;
        this.$state = taskPermissionsUiState;
        this.$onRevoke = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
