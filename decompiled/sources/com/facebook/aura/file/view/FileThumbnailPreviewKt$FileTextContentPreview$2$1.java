package com.facebook.aura.file.view;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C3UX;
import X.C78T;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.file.view.FileThumbnailPreviewKt$FileTextContentPreview$2$1", f = "FileThumbnailPreview.kt", l = {404}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class FileThumbnailPreviewKt$FileTextContentPreview$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $relativePath;
    public final /* synthetic */ MutableState<String> $snippet$delegate;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileThumbnailPreviewKt$FileTextContentPreview$2$1(String str, AbstractC3358CGz abstractC3358CGz, MutableState<String> mutableState, HtJ<? super FileThumbnailPreviewKt$FileTextContentPreview$2$1> htJ) {
        super(2, htJ);
        this.$relativePath = str;
        this.$userSession = abstractC3358CGz;
        this.$snippet$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new FileThumbnailPreviewKt$FileTextContentPreview$2$1(this.$relativePath, this.$userSession, this.$snippet$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        String str;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            CFK.A06(FileThumbnailPreviewKt.TAG, FGI.A0d("Text preview read failed for ", this.$relativePath, ": ", e2.getMessage()));
            str = null;
        }
        if (i == 0) {
            Hwg.A00(obj);
            if (!ThumbnailTextCache.INSTANCE.hasAttempted(this.$relativePath)) {
                C78T c78tA0y = AnonymousClass001.A0y();
                FileThumbnailPreviewKt$FileTextContentPreview$2$1$content$1 fileThumbnailPreviewKt$FileTextContentPreview$2$1$content$1 = new FileThumbnailPreviewKt$FileTextContentPreview$2$1$content$1(this.$relativePath, this.$userSession, null);
                this.label = 1;
                obj = GAo.A00(this, c78tA0y, fileThumbnailPreviewKt$FileTextContentPreview$2$1$content$1);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        str = (String) obj;
        String strExtractSnippet = str != null ? FileThumbnailPreviewKt.extractSnippet(str) : null;
        if (strExtractSnippet == null) {
            strExtractSnippet = "";
        }
        ThumbnailTextCache.INSTANCE.record(this.$relativePath, strExtractSnippet);
        MutableState<String> mutableState = this.$snippet$delegate;
        float f = FileThumbnailPreviewKt.MARKDOWN_PREVIEW_VIRTUAL_WIDTH;
        mutableState.Af8(strExtractSnippet);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((FileThumbnailPreviewKt$FileTextContentPreview$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
