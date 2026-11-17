package com.facebook.aura.composer.util;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.aura.utils.ImageBrightnessAnalyzer;
import java.io.IOException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.composer.util.FileThumbnailCache$getOrLoad$result$1", f = "FileThumbnailCache.kt", l = {53}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class FileThumbnailCache$getOrLoad$result$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super ThumbnailResult>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ int $sizePx;
    public final /* synthetic */ Uri $uri;
    public Object L$0;
    public Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileThumbnailCache$getOrLoad$result$1(Context context, Uri uri, int i, HtJ<? super FileThumbnailCache$getOrLoad$result$1> htJ) {
        super(2, htJ);
        this.$context = context;
        this.$uri = uri;
        this.$sizePx = i;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new FileThumbnailCache$getOrLoad$result$1(this.$context, this.$uri, this.$sizePx, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) throws IOException {
        Bitmap bitmapLoadPdfThumbnail;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            FileThumbnailCache fileThumbnailCache = FileThumbnailCache.INSTANCE;
            bitmapLoadPdfThumbnail = fileThumbnailCache.loadPdfThumbnail(this.$context, this.$uri, this.$sizePx);
            if (bitmapLoadPdfThumbnail == null && (bitmapLoadPdfThumbnail = fileThumbnailCache.loadThumbnailFromProvider(this.$context, this.$uri, this.$sizePx)) == null) {
                return null;
            }
            ImageBrightnessAnalyzer imageBrightnessAnalyzer = ImageBrightnessAnalyzer.INSTANCE;
            this.L$0 = null;
            this.L$1 = bitmapLoadPdfThumbnail;
            this.label = 1;
            obj = imageBrightnessAnalyzer.isLight(bitmapLoadPdfThumbnail, 10, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            bitmapLoadPdfThumbnail = (Bitmap) this.L$1;
            Hwg.A00(obj);
        }
        return new ThumbnailResult(bitmapLoadPdfThumbnail, AnonymousClass001.A1X(obj));
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super ThumbnailResult> htJ) {
        return ((FileThumbnailCache$getOrLoad$result$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
