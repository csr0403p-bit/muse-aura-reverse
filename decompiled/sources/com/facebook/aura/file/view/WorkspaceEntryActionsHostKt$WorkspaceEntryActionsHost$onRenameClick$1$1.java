package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.library.repo.WorkspaceEntry;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class WorkspaceEntryActionsHostKt$WorkspaceEntryActionsHost$onRenameClick$1$1 extends AbstractC7559F3s implements G0U<WorkspaceEntry, Unit> {
    public final /* synthetic */ MutableState<WorkspaceEntry> $entryToRename$delegate;
    public final /* synthetic */ MutableState<String> $renameText$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(WorkspaceEntry workspaceEntry) {
        C7384Etj.A0Y(workspaceEntry, 0);
        WorkspaceEntryActionsHostKt.logWorkspaceClick(HatchComponent.RENAME_BUTTON, workspaceEntry);
        this.$entryToRename$delegate.Af8(workspaceEntry);
        this.$renameText$delegate.Af8(workspaceEntry.name);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkspaceEntryActionsHostKt$WorkspaceEntryActionsHost$onRenameClick$1$1(MutableState<WorkspaceEntry> mutableState, MutableState<String> mutableState2) {
        super(1);
        this.$entryToRename$delegate = mutableState;
        this.$renameText$delegate = mutableState2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(WorkspaceEntry workspaceEntry) {
        invoke2(workspaceEntry);
        return Unit.INSTANCE;
    }
}
