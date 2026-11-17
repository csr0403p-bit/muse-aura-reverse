package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.library.repo.WorkspaceEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FileViewerScreenKt$FileViewerScreen$4$1$3$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ WorkspaceEntry $entry;
    public final /* synthetic */ MutableState<Boolean> $showContextMenu$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileViewerScreenKt$FileViewerScreen$4$1$3$1$1(WorkspaceEntry workspaceEntry, MutableState<Boolean> mutableState) {
        super(0);
        this.$entry = workspaceEntry;
        this.$showContextMenu$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        FileViewerScreenKt.logFileEditorClick(HatchComponent.THREE_DOTS_MENU, this.$entry.getFileExtension(), HatchSubsurface.DOT_MENU);
        MutableState.A09(true, this.$showContextMenu$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
