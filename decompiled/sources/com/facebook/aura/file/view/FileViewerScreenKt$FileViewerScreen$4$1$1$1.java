package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.library.repo.WorkspaceEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FileViewerScreenKt$FileViewerScreen$4$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ WorkspaceEntry $entry;
    public final /* synthetic */ boolean $hasChanges;
    public final /* synthetic */ MutableState<Boolean> $isEditing$delegate;
    public final /* synthetic */ MutableState<Boolean> $showReviewSheet$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileViewerScreenKt$FileViewerScreen$4$1$1$1(WorkspaceEntry workspaceEntry, boolean z, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2) {
        super(0);
        this.$entry = workspaceEntry;
        this.$hasChanges = z;
        this.$showReviewSheet$delegate = mutableState;
        this.$isEditing$delegate = mutableState2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        FileViewerScreenKt.logFileEditorClick(HatchComponent.FILE_EDITOR_EDIT, this.$entry.getFileExtension(), null);
        if (this.$hasChanges) {
            MutableState.A09(true, this.$showReviewSheet$delegate);
        } else {
            MutableState.A09(false, this.$isEditing$delegate);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
