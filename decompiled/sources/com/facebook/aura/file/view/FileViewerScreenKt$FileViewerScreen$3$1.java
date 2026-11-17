package com.facebook.aura.file.view;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.file.view.FileContentType;
import com.facebook.aura.file.view.FileLoadingState;
import com.facebook.aura.library.repo.WorkspaceEntry;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.file.view.FileViewerScreenKt$FileViewerScreen$3$1", f = "FileViewerScreen.kt", l = {236}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class FileViewerScreenKt$FileViewerScreen$3$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $authToken;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ MutableState<String> $currentContent$delegate;
    public final /* synthetic */ WorkspaceEntry $entry;
    public final /* synthetic */ MutableState<FileLoadingState> $loadingState$delegate;
    public final /* synthetic */ MutableState<String> $originalContent$delegate;
    public final /* synthetic */ String $relativePath;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileViewerScreenKt$FileViewerScreen$3$1(WorkspaceEntry workspaceEntry, String str, String str2, Context context, AbstractC3358CGz abstractC3358CGz, MutableState<FileLoadingState> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3, HtJ<? super FileViewerScreenKt$FileViewerScreen$3$1> htJ) {
        super(2, htJ);
        this.$entry = workspaceEntry;
        this.$relativePath = str;
        this.$authToken = str2;
        this.$context = context;
        this.$userSession = abstractC3358CGz;
        this.$loadingState$delegate = mutableState;
        this.$originalContent$delegate = mutableState2;
        this.$currentContent$delegate = mutableState3;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new FileViewerScreenKt$FileViewerScreen$3$1(this.$entry, this.$relativePath, this.$authToken, this.$context, this.$userSession, this.$loadingState$delegate, this.$originalContent$delegate, this.$currentContent$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        MutableState mutableState;
        ThumbnailTextCache thumbnailTextCache;
        String str;
        String str2;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            mutableState = this.$loadingState$delegate;
            WorkspaceEntry workspaceEntry = this.$entry;
            String str3 = this.$relativePath;
            String str4 = this.$authToken;
            Context context = this.$context;
            AbstractC3358CGz abstractC3358CGz = this.$userSession;
            this.L$0 = mutableState;
            this.label = 1;
            obj = FileViewerContentKt.loadFileContent(workspaceEntry, str3, str4, context, abstractC3358CGz, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            mutableState = (MutableState) this.L$0;
            Hwg.A00(obj);
        }
        mutableState.Af8(obj);
        if (this.$loadingState$delegate.getValue() instanceof FileLoadingState.Success) {
            FileLoadingState value = this.$loadingState$delegate.getValue();
            C7384Etj.A0Z(value, "null cannot be cast to non-null type com.facebook.aura.file.view.FileLoadingState.Success");
            FileContentType fileContentType = ((FileLoadingState.Success) value).contentType;
            if (fileContentType instanceof FileContentType.Text) {
                FileContentType.Text text = (FileContentType.Text) fileContentType;
                this.$originalContent$delegate.Af8(text.content);
                this.$currentContent$delegate.Af8(text.content);
                thumbnailTextCache = ThumbnailTextCache.INSTANCE;
                str = this.$relativePath;
                str2 = text.content;
            } else if (fileContentType instanceof FileContentType.Code) {
                FileContentType.Code code = (FileContentType.Code) fileContentType;
                this.$originalContent$delegate.Af8(code.content);
                this.$currentContent$delegate.Af8(code.content);
                thumbnailTextCache = ThumbnailTextCache.INSTANCE;
                str = this.$relativePath;
                str2 = code.content;
            } else if (fileContentType instanceof FileContentType.Html) {
                FileContentType.Html html = (FileContentType.Html) fileContentType;
                this.$originalContent$delegate.Af8(html.content);
                this.$currentContent$delegate.Af8(html.content);
            }
            thumbnailTextCache.recordContent(str, str2);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((FileViewerScreenKt$FileViewerScreen$3$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
