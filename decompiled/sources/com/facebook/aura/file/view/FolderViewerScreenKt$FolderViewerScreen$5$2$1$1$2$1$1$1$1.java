package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.library.repo.FilesSortMode;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class FolderViewerScreenKt$FolderViewerScreen$5$2$1$1$2$1$1$1$1 extends AbstractC7559F3s implements G0U<FilesSortMode, Unit> {
    public final /* synthetic */ MutableState<FilesSortMode> $sortMode$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FilesSortMode filesSortMode) {
        C7384Etj.A0Y(filesSortMode, 0);
        this.$sortMode$delegate.Af8(filesSortMode);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderViewerScreenKt$FolderViewerScreen$5$2$1$1$2$1$1$1$1(MutableState<FilesSortMode> mutableState) {
        super(1);
        this.$sortMode$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(FilesSortMode filesSortMode) {
        invoke2(filesSortMode);
        return Unit.INSTANCE;
    }
}
