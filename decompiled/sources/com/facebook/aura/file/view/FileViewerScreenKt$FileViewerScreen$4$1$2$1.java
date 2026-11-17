package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.library.repo.WorkspaceEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FileViewerScreenKt$FileViewerScreen$4$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<String> $currentContent$delegate;
    public final /* synthetic */ WorkspaceEntry $entry;
    public final /* synthetic */ MutableState<Boolean> $isEditing$delegate;
    public final /* synthetic */ boolean $isSlides;
    public final /* synthetic */ MutableState<String> $originalContent$delegate;
    public final /* synthetic */ PagerState $pagerState;
    public final /* synthetic */ MutableState<SlideState> $slideState$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileViewerScreenKt$FileViewerScreen$4$1$2$1(WorkspaceEntry workspaceEntry, boolean z, PagerState pagerState, MutableState<SlideState> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3, MutableState<Boolean> mutableState4) {
        super(0);
        this.$entry = workspaceEntry;
        this.$isSlides = z;
        this.$pagerState = pagerState;
        this.$slideState$delegate = mutableState;
        this.$originalContent$delegate = mutableState2;
        this.$currentContent$delegate = mutableState3;
        this.$isEditing$delegate = mutableState4;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        PagerState pagerState;
        FileViewerScreenKt.logFileEditorClick(HatchComponent.FILE_EDITOR_EDIT, this.$entry.getFileExtension(), null);
        if (this.$isSlides && (pagerState = this.$pagerState) != null) {
            int iA07 = pagerState.A07();
            MutableState<SlideState> mutableState = this.$slideState$delegate;
            SlideState value = mutableState.getValue();
            mutableState.Af8(value.copy(value.htmlCache, value.isLoading, iA07));
            String str = this.$slideState$delegate.getValue().htmlCache.get(Integer.valueOf(iA07));
            if (str == null) {
                str = "";
            }
            this.$originalContent$delegate.Af8(str);
            this.$currentContent$delegate.Af8(str);
        }
        MutableState.A09(true, this.$isEditing$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
