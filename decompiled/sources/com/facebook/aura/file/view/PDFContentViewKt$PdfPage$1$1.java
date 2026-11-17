package com.facebook.aura.file.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3UX;
import X.C78T;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import android.graphics.Bitmap;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.file.view.PDFContentViewKt$PdfPage$1$1", f = "PDFContentView.kt", l = {156}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class PDFContentViewKt$PdfPage$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<Bitmap> $bitmap$delegate;
    public final /* synthetic */ int $index;
    public final /* synthetic */ Function0<Unit> $onPageError;
    public final /* synthetic */ int $renderWidth;
    public final /* synthetic */ PdfRendererHolder $renderer;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.file.view.PDFContentViewKt$PdfPage$1$1$1", f = "PDFContentView.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.view.PDFContentViewKt$PdfPage$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ MutableState<Bitmap> $bitmap$delegate;
        public final /* synthetic */ int $index;
        public final /* synthetic */ Function0<Unit> $onPageError;
        public final /* synthetic */ int $renderWidth;
        public final /* synthetic */ PdfRendererHolder $renderer;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PdfRendererHolder pdfRendererHolder, int i, int i2, Function0<Unit> function0, MutableState<Bitmap> mutableState, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$renderer = pdfRendererHolder;
            this.$index = i;
            this.$renderWidth = i2;
            this.$onPageError = function0;
            this.$bitmap$delegate = mutableState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$renderer, this.$index, this.$renderWidth, this.$onPageError, this.$bitmap$delegate, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            try {
                Bitmap bitmapRenderPage = this.$renderer.renderPage(this.$index, this.$renderWidth);
                if (bitmapRenderPage != null) {
                    this.$bitmap$delegate.Af8(bitmapRenderPage);
                }
            } catch (Exception e) {
                CFK.A08(PDFContentViewKt.TAG, FGI.A0W("Failed to render PDF page ", ": ", e.getMessage(), this.$index), e);
                this.$onPageError.invoke();
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PDFContentViewKt$PdfPage$1$1(PdfRendererHolder pdfRendererHolder, int i, int i2, Function0<Unit> function0, MutableState<Bitmap> mutableState, HtJ<? super PDFContentViewKt$PdfPage$1$1> htJ) {
        super(2, htJ);
        this.$renderer = pdfRendererHolder;
        this.$index = i;
        this.$renderWidth = i2;
        this.$onPageError = function0;
        this.$bitmap$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new PDFContentViewKt$PdfPage$1$1(this.$renderer, this.$index, this.$renderWidth, this.$onPageError, this.$bitmap$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            C78T c78tA0s = AnonymousClass002.A0s(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$renderer, this.$index, this.$renderWidth, this.$onPageError, this.$bitmap$delegate, null);
            this.label = 1;
            if (GAo.A00(this, c78tA0s, anonymousClass1) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((PDFContentViewKt$PdfPage$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
