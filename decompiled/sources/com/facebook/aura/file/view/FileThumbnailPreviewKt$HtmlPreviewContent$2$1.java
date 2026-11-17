package com.facebook.aura.file.view;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.file.view.FileThumbnailPreviewKt$HtmlPreviewContent$2$1", f = "FileThumbnailPreview.kt", l = {352}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class FileThumbnailPreviewKt$HtmlPreviewContent$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<Bitmap> $bitmap$delegate;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ MutableState<Boolean> $failed$delegate;
    public final /* synthetic */ String $relativePath;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileThumbnailPreviewKt$HtmlPreviewContent$2$1(Context context, String str, AbstractC3358CGz abstractC3358CGz, MutableState<Bitmap> mutableState, MutableState<Boolean> mutableState2, HtJ<? super FileThumbnailPreviewKt$HtmlPreviewContent$2$1> htJ) {
        super(2, htJ);
        this.$context = context;
        this.$relativePath = str;
        this.$userSession = abstractC3358CGz;
        this.$bitmap$delegate = mutableState;
        this.$failed$delegate = mutableState2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new FileThumbnailPreviewKt$HtmlPreviewContent$2$1(this.$context, this.$relativePath, this.$userSession, this.$bitmap$delegate, this.$failed$delegate, htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            MutableState<Bitmap> mutableState = this.$bitmap$delegate;
            float f = FileThumbnailPreviewKt.MARKDOWN_PREVIEW_VIRTUAL_WIDTH;
            if (mutableState.getValue() == null && !MutableState.A0A((MutableState) this.$failed$delegate)) {
                HtmlPreviewRenderer htmlPreviewRenderer = HtmlPreviewRenderer.INSTANCE;
                Context context = this.$context;
                String str = this.$relativePath;
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
                this.label = 1;
                obj = htmlPreviewRenderer.render(context, str, abstractC3358CGz, this);
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
        if (obj != null) {
            MutableState<Bitmap> mutableState2 = this.$bitmap$delegate;
            float f2 = FileThumbnailPreviewKt.MARKDOWN_PREVIEW_VIRTUAL_WIDTH;
            mutableState2.Af8(obj);
        } else {
            MutableState<Boolean> mutableState3 = this.$failed$delegate;
            float f3 = FileThumbnailPreviewKt.MARKDOWN_PREVIEW_VIRTUAL_WIDTH;
            MutableState.A09(true, mutableState3);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((FileThumbnailPreviewKt$HtmlPreviewContent$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
