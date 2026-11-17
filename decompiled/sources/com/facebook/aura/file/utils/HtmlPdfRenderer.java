package com.facebook.aura.file.utils;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C7438Evz;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.content.Context;
import android.graphics.pdf.PdfDocument;
import android.net.Uri;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class HtmlPdfRenderer {
    public static final int $stable = 0;
    public static final HtmlPdfRenderer INSTANCE = new HtmlPdfRenderer();
    public static final float MARGIN = 36.0f;
    public static final int PAGE_HEIGHT = 842;
    public static final int PAGE_WIDTH = 595;
    public static final long POST_LOAD_DELAY_MS = 300;
    public static final String TAG = "HtmlPdfRenderer";

    @DebugMetadata(c = "com.facebook.aura.file.utils.HtmlPdfRenderer", f = "HtmlPdfRenderer.kt", l = {214, 140, 147}, m = "drawOnMainThread", v = 2)
    /* renamed from: com.facebook.aura.file.utils.HtmlPdfRenderer$drawOnMainThread$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public float F$0;
        public float F$1;
        public float F$2;
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HtmlPdfRenderer.this.drawOnMainThread(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.utils.HtmlPdfRenderer", f = "HtmlPdfRenderer.kt", l = {196}, m = "drawWebViewToPdf", v = 2)
    /* renamed from: com.facebook.aura.file.utils.HtmlPdfRenderer$drawWebViewToPdf$1, reason: invalid class name and case insensitive filesystem */
    public final class C119281 extends HzP {
        public float F$0;
        public float F$1;
        public float F$2;
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public C119281(HtJ<? super C119281> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HtmlPdfRenderer.this.drawWebViewToPdf(null, null, 0, 0.0f, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.utils.HtmlPdfRenderer", f = "HtmlPdfRenderer.kt", l = {61, 63}, m = "renderToDownloads", v = 2)
    /* renamed from: com.facebook.aura.file.utils.HtmlPdfRenderer$renderToDownloads$1, reason: invalid class name and case insensitive filesystem */
    public final class C119291 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C119291(HtJ<? super C119291> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HtmlPdfRenderer.this.renderToDownloads(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.utils.HtmlPdfRenderer$renderToDownloads$2", f = "HtmlPdfRenderer.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.utils.HtmlPdfRenderer$renderToDownloads$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Uri>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ PdfDocument $document;
        public final /* synthetic */ String $pdfFileName;
        public int label;

        /* renamed from: com.facebook.aura.file.utils.HtmlPdfRenderer$renderToDownloads$2$1, reason: invalid class name */
        public final /* synthetic */ class AnonymousClass1 extends C7438Evz implements G0U<OutputStream, Unit> {
            public AnonymousClass1(Object obj) {
                super(1, obj, PdfDocument.class, "writeTo", "writeTo(Ljava/io/OutputStream;)V", 0);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(OutputStream outputStream) throws IOException {
                invoke2(outputStream);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(OutputStream outputStream) throws IOException {
                ((PdfDocument) this.receiver).writeTo(outputStream);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, String str, PdfDocument pdfDocument, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$pdfFileName = str;
            this.$document = pdfDocument;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$context, this.$pdfFileName, this.$document, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return HatchDownloadsWriterKt.writeToDownloads(this.$context, this.$pdfFileName, "application/pdf", new AnonymousClass1(this.$document));
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Uri> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0162: INVOKE (r5 I:android.webkit.WebView) VIRTUAL call: android.webkit.WebView.destroy():void A[MD:():void (c)] (LINE:354), block:B:38:0x0162 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015b A[RETURN] */
    /* JADX WARN: Type inference failed for: r5v10, types: [android.webkit.WebView] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object drawOnMainThread(android.content.Context r17, java.lang.String r18, android.graphics.pdf.PdfDocument r19, X.HtJ<? super java.lang.Boolean> r20) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.utils.HtmlPdfRenderer.drawOnMainThread(android.content.Context, java.lang.String, android.graphics.pdf.PdfDocument, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070 A[Catch: Exception -> 0x00f5, CancellationException -> 0x010a, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x010a, Exception -> 0x00f5, blocks: (B:12:0x0047, B:23:0x00e7, B:18:0x0070, B:20:0x00be, B:26:0x00ec, B:27:0x00ef, B:28:0x00f0, B:16:0x005d), top: B:37:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f0 A[Catch: Exception -> 0x00f5, CancellationException -> 0x010a, TryCatch #3 {CancellationException -> 0x010a, Exception -> 0x00f5, blocks: (B:12:0x0047, B:23:0x00e7, B:18:0x0070, B:20:0x00be, B:26:0x00ec, B:27:0x00ef, B:28:0x00f0, B:16:0x005d), top: B:37:0x0024 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00e4 -> B:23:0x00e7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object drawWebViewToPdf(android.webkit.WebView r15, android.graphics.pdf.PdfDocument r16, int r17, float r18, X.HtJ<? super java.lang.Boolean> r19) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.utils.HtmlPdfRenderer.drawWebViewToPdf(android.webkit.WebView, android.graphics.pdf.PdfDocument, int, float, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object renderToDownloads(android.content.Context r8, java.lang.String r9, java.lang.String r10, X.HtJ<? super android.net.Uri> r11) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r11 instanceof com.facebook.aura.file.utils.HtmlPdfRenderer.C119291
            if (r0 == 0) goto L26
            r6 = r11
            com.facebook.aura.file.utils.HtmlPdfRenderer$renderToDownloads$1 r6 = (com.facebook.aura.file.utils.HtmlPdfRenderer.C119291) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r0 = r6.result
            X.Hji r7 = X.EnumC10460Hji.A02
            int r1 = r6.label
            r5 = 2
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L3e
            if (r1 == r2) goto L31
            if (r1 != r5) goto L2c
            java.lang.Object r4 = r6.L$3
            android.graphics.pdf.PdfDocument r4 = (android.graphics.pdf.PdfDocument) r4
            goto L83
        L26:
            com.facebook.aura.file.utils.HtmlPdfRenderer$renderToDownloads$1 r6 = new com.facebook.aura.file.utils.HtmlPdfRenderer$renderToDownloads$1
            r6.<init>(r11)
            goto L12
        L2c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L31:
            java.lang.Object r4 = r6.L$3
            android.graphics.pdf.PdfDocument r4 = (android.graphics.pdf.PdfDocument) r4
            java.lang.Object r10 = r6.L$2
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r8 = r6.L$0
            android.content.Context r8 = (android.content.Context) r8
            goto L5e
        L3e:
            X.Hwg.A00(r0)
            android.graphics.pdf.PdfDocument r4 = new android.graphics.pdf.PdfDocument     // Catch: java.lang.Exception -> L96 java.util.concurrent.CancellationException -> La7
            r4.<init>()     // Catch: java.lang.Exception -> L96 java.util.concurrent.CancellationException -> La7
            X.GB9 r1 = com.facebook.aura.executors.AuraDispatchers.main     // Catch: java.lang.Throwable -> L91
            com.facebook.aura.file.utils.HtmlPdfRenderer$renderToDownloads$drawn$1 r0 = new com.facebook.aura.file.utils.HtmlPdfRenderer$renderToDownloads$drawn$1     // Catch: java.lang.Throwable -> L91
            r0.<init>(r8, r9, r4, r3)     // Catch: java.lang.Throwable -> L91
            r6.L$0 = r8     // Catch: java.lang.Throwable -> L91
            r6.L$1 = r3     // Catch: java.lang.Throwable -> L91
            r6.L$2 = r10     // Catch: java.lang.Throwable -> L91
            r6.L$3 = r4     // Catch: java.lang.Throwable -> L91
            r6.label = r2     // Catch: java.lang.Throwable -> L91
            java.lang.Object r0 = X.GAo.A00(r6, r1, r0)     // Catch: java.lang.Throwable -> L91
            if (r0 != r7) goto L61
            return r7
        L5e:
            X.Hwg.A00(r0)     // Catch: java.lang.Throwable -> L8f
        L61:
            boolean r2 = X.AnonymousClass001.A1X(r0)     // Catch: java.lang.Throwable -> L8f
            if (r2 == 0) goto L8a
            X.78T r1 = X.AnonymousClass001.A0y()     // Catch: java.lang.Throwable -> L8f
            com.facebook.aura.file.utils.HtmlPdfRenderer$renderToDownloads$2 r0 = new com.facebook.aura.file.utils.HtmlPdfRenderer$renderToDownloads$2     // Catch: java.lang.Throwable -> L8f
            r0.<init>(r8, r10, r4, r3)     // Catch: java.lang.Throwable -> L8f
            r6.L$0 = r3     // Catch: java.lang.Throwable -> L8f
            r6.L$1 = r3     // Catch: java.lang.Throwable -> L8f
            r6.L$2 = r3     // Catch: java.lang.Throwable -> L8f
            r6.L$3 = r4     // Catch: java.lang.Throwable -> L8f
            r6.Z$0 = r2     // Catch: java.lang.Throwable -> L8f
            r6.label = r5     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r0 = X.GAo.A00(r6, r1, r0)     // Catch: java.lang.Throwable -> L8f
            if (r0 != r7) goto L86
            return r7
        L83:
            X.Hwg.A00(r0)     // Catch: java.lang.Throwable -> L8f
        L86:
            r7 = r0
            android.net.Uri r7 = (android.net.Uri) r7     // Catch: java.lang.Throwable -> L8f
            goto L8b
        L8a:
            r7 = r3
        L8b:
            r4.close()     // Catch: java.lang.Exception -> L96 java.util.concurrent.CancellationException -> La7
            return r7
        L8f:
            r0 = move-exception
            goto L92
        L91:
            r0 = move-exception
        L92:
            r4.close()     // Catch: java.lang.Exception -> L96 java.util.concurrent.CancellationException -> La7
            throw r0     // Catch: java.lang.Exception -> L96 java.util.concurrent.CancellationException -> La7
        L96:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "Failed to render HTML to PDF: "
            java.lang.String r1 = X.FGI.A0M(r0, r1)
            java.lang.String r0 = "HtmlPdfRenderer"
            X.AbstractC3422CMk.A05(r0, r1, r2)
            return r3
        La7:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.utils.HtmlPdfRenderer.renderToDownloads(android.content.Context, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }
}
