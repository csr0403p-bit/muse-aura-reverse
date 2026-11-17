package com.facebook.aura.file.view;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.library.repo.WorkspaceEntry;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FileViewerScreenKt$FileViewerScreen$6$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ MutableState<String> $currentContent$delegate;
    public final /* synthetic */ WorkspaceEntry $entry;
    public final /* synthetic */ MutableState<Boolean> $isEditing$delegate;
    public final /* synthetic */ MutableState<Boolean> $isSaving$delegate;
    public final /* synthetic */ boolean $isSlides;
    public final /* synthetic */ MutableState<String> $originalContent$delegate;
    public final /* synthetic */ String $relativePath;
    public final /* synthetic */ MutableState<Boolean> $showReviewSheet$delegate;
    public final /* synthetic */ MutableState<SlideState> $slideState$delegate;
    public final /* synthetic */ List<SlideInfo> $slidesInfo;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    @DebugMetadata(c = "com.facebook.aura.file.view.FileViewerScreenKt$FileViewerScreen$6$1$1", f = "FileViewerScreen.kt", l = {462}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.view.FileViewerScreenKt$FileViewerScreen$6$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ MutableState<String> $currentContent$delegate;
        public final /* synthetic */ MutableState<Boolean> $isEditing$delegate;
        public final /* synthetic */ MutableState<Boolean> $isSaving$delegate;
        public final /* synthetic */ boolean $isSlides;
        public final /* synthetic */ MutableState<String> $originalContent$delegate;
        public final /* synthetic */ String $relativePath;
        public final /* synthetic */ MutableState<Boolean> $showReviewSheet$delegate;
        public final /* synthetic */ MutableState<SlideState> $slideState$delegate;
        public final /* synthetic */ List<SlideInfo> $slidesInfo;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, List<SlideInfo> list, String str, AbstractC3358CGz abstractC3358CGz, MutableState<Boolean> mutableState, MutableState<SlideState> mutableState2, MutableState<String> mutableState3, MutableState<String> mutableState4, MutableState<Boolean> mutableState5, MutableState<Boolean> mutableState6, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$isSlides = z;
            this.$slidesInfo = list;
            this.$relativePath = str;
            this.$userSession = abstractC3358CGz;
            this.$isSaving$delegate = mutableState;
            this.$slideState$delegate = mutableState2;
            this.$currentContent$delegate = mutableState3;
            this.$originalContent$delegate = mutableState4;
            this.$showReviewSheet$delegate = mutableState5;
            this.$isEditing$delegate = mutableState6;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$isSlides, this.$slidesInfo, this.$relativePath, this.$userSession, this.$isSaving$delegate, this.$slideState$delegate, this.$currentContent$delegate, this.$originalContent$delegate, this.$showReviewSheet$delegate, this.$isEditing$delegate, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            String str;
            List<SlideInfo> list;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                MutableState.A09(true, this.$isSaving$delegate);
                str = (!this.$isSlides || (list = this.$slidesInfo) == null) ? this.$relativePath : list.get(this.$slideState$delegate.getValue().editingIndex).absolutePath;
                String strA05 = MutableState.A05(this.$currentContent$delegate);
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
                this.L$0 = str;
                this.label = 1;
                obj = FileViewerContentKt.saveFileContent(str, strA05, abstractC3358CGz, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                str = (String) this.L$0;
                Hwg.A00(obj);
            }
            boolean zA1X = AnonymousClass001.A1X(obj);
            MutableState.A09(false, this.$isSaving$delegate);
            if (zA1X) {
                ThumbnailTextCache.INSTANCE.recordContent(str, MutableState.A05(this.$currentContent$delegate));
                if (this.$isSlides) {
                    MutableState<SlideState> mutableState = this.$slideState$delegate;
                    SlideState value = mutableState.getValue();
                    mutableState.Af8(value.copy(this.$slideState$delegate.getValue().htmlCache.AYj(new Integer(this.$slideState$delegate.getValue().editingIndex), this.$currentContent$delegate.getValue()), value.isLoading, value.editingIndex));
                }
                this.$originalContent$delegate.Af8(this.$currentContent$delegate.getValue());
                MutableState.A09(false, this.$showReviewSheet$delegate);
                MutableState.A09(false, this.$isEditing$delegate);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileViewerScreenKt$FileViewerScreen$6$1(WorkspaceEntry workspaceEntry, C3UX c3ux, boolean z, List<SlideInfo> list, String str, AbstractC3358CGz abstractC3358CGz, MutableState<Boolean> mutableState, MutableState<SlideState> mutableState2, MutableState<String> mutableState3, MutableState<String> mutableState4, MutableState<Boolean> mutableState5, MutableState<Boolean> mutableState6) {
        super(0);
        this.$entry = workspaceEntry;
        this.$coroutineScope = c3ux;
        this.$isSlides = z;
        this.$slidesInfo = list;
        this.$relativePath = str;
        this.$userSession = abstractC3358CGz;
        this.$isSaving$delegate = mutableState;
        this.$slideState$delegate = mutableState2;
        this.$currentContent$delegate = mutableState3;
        this.$originalContent$delegate = mutableState4;
        this.$showReviewSheet$delegate = mutableState5;
        this.$isEditing$delegate = mutableState6;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        FileViewerScreenKt.logFileEditorClick(HatchComponent.FILE_EDITOR_SAVE, this.$entry.getFileExtension(), null);
        AnonymousClass001.A1J(new AnonymousClass1(this.$isSlides, this.$slidesInfo, this.$relativePath, this.$userSession, this.$isSaving$delegate, this.$slideState$delegate, this.$currentContent$delegate, this.$originalContent$delegate, this.$showReviewSheet$delegate, this.$isEditing$delegate, null), this.$coroutineScope);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
