package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.library.repo.WorkspaceEntry;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class WorkspaceEntryActionsHostKt$WorkspaceEntryActionsHost$onDeleteClick$1$1 extends AbstractC7559F3s implements G0U<WorkspaceEntry, Unit> {
    public final /* synthetic */ MutableState<WorkspaceEntry> $entryToDelete$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(WorkspaceEntry workspaceEntry) {
        C7384Etj.A0Y(workspaceEntry, 0);
        WorkspaceEntryActionsHostKt.logWorkspaceClick(HatchComponent.DELETE_BUTTON, workspaceEntry);
        this.$entryToDelete$delegate.Af8(workspaceEntry);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkspaceEntryActionsHostKt$WorkspaceEntryActionsHost$onDeleteClick$1$1(MutableState<WorkspaceEntry> mutableState) {
        super(1);
        this.$entryToDelete$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(WorkspaceEntry workspaceEntry) {
        invoke2(workspaceEntry);
        return Unit.INSTANCE;
    }
}
