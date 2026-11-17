package com.facebook.aura.file.utils;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import android.graphics.pdf.PdfDocument;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.file.utils.HtmlPdfRenderer$renderToDownloads$drawn$1", f = "HtmlPdfRenderer.kt", l = {61}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HtmlPdfRenderer$renderToDownloads$drawn$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ PdfDocument $document;
    public final /* synthetic */ String $htmlContent;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HtmlPdfRenderer$renderToDownloads$drawn$1(Context context, String str, PdfDocument pdfDocument, HtJ<? super HtmlPdfRenderer$renderToDownloads$drawn$1> htJ) {
        super(2, htJ);
        this.$context = context;
        this.$htmlContent = str;
        this.$document = pdfDocument;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HtmlPdfRenderer$renderToDownloads$drawn$1(this.$context, this.$htmlContent, this.$document, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HtmlPdfRenderer htmlPdfRenderer = HtmlPdfRenderer.INSTANCE;
            Context context = this.$context;
            String str = this.$htmlContent;
            PdfDocument pdfDocument = this.$document;
            this.label = 1;
            obj = htmlPdfRenderer.drawOnMainThread(context, str, pdfDocument, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
        return ((HtmlPdfRenderer$renderToDownloads$drawn$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
