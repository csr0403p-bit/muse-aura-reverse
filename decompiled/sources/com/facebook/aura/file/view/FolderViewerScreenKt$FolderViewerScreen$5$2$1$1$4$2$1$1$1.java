package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.library.repo.WorkspaceEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FolderViewerScreenKt$FolderViewerScreen$5$2$1$1$4$2$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ WorkspaceEntry $entry;
    public final /* synthetic */ G0U<WorkspaceEntry, Unit> $onEntryClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FolderViewerScreenKt$FolderViewerScreen$5$2$1$1$4$2$1$1$1(WorkspaceEntry workspaceEntry, G0U<? super WorkspaceEntry, Unit> g0u) {
        super(0);
        this.$entry = workspaceEntry;
        this.$onEntryClick = g0u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        FolderViewerScreenKt.logWorkspaceEntryClick(HatchComponent.WORKSPACE_ENTRY, this.$entry);
        this.$onEntryClick.invoke(this.$entry);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
