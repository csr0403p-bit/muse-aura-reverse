package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.library.repo.WorkspaceEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FolderViewerScreenKt$FolderViewerScreen$5$2$1$1$4$2$1$5$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ WorkspaceEntry $entry;
    public final /* synthetic */ G0U<WorkspaceEntry, Unit> $onDownloadClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FolderViewerScreenKt$FolderViewerScreen$5$2$1$1$4$2$1$5$1(G0U<? super WorkspaceEntry, Unit> g0u, WorkspaceEntry workspaceEntry) {
        super(0);
        this.$onDownloadClick = g0u;
        this.$entry = workspaceEntry;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onDownloadClick.invoke(this.$entry);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
