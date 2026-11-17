package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C10543Hqv;
import X.C3380CIk;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C78T;
import X.CFK;
import X.EDZ;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.HzP;
import X.InterfaceC10560Hsz;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PrintDocumentAdapter;
import android.webkit.WebView;
import com.facebook.aura.network.api.HttpResponseBytesKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.hatch.browser.core.NativeException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes6.dex */
public final class LocalBrowserPdfPrinter {
    public static final int $stable = 0;
    public static final LocalBrowserPdfPrinter INSTANCE = new LocalBrowserPdfPrinter();
    public static final long MAX_PDF_BYTES = 49283072;

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserPdfPrinter", f = "LocalBrowserPdfPrinter.kt", l = {33, HatchMessageShareDocumentRenderer.TABLE_MIN_ROW_HEIGHT_PX, HatchMessageShareDocumentRenderer.APP_ICON_SIZE_PX, 79, 84, 84}, m = "print", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserPdfPrinter$print$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserPdfPrinter.this.print(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserPdfPrinter$print$2", f = "LocalBrowserPdfPrinter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserPdfPrinter$print$2, reason: invalid class name */
    /* loaded from: classes5.dex */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ C10543Hqv<ParcelFileDescriptor> $destination;
        public final /* synthetic */ C10543Hqv<File> $file;
        public final /* synthetic */ WebView $webView;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(WebView webView, C10543Hqv<File> c10543Hqv, C10543Hqv<ParcelFileDescriptor> c10543Hqv2, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$webView = webView;
            this.$file = c10543Hqv;
            this.$destination = c10543Hqv2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$webView, this.$file, this.$destination, htJ);
        }

        /* JADX WARN: Type inference failed for: r0v10, types: [T, android.os.ParcelFileDescriptor] */
        /* JADX WARN: Type inference failed for: r2v2, types: [T, java.io.File] */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws IOException {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            EDZ edzA01 = EDZ.A01(AnonymousClass001.A0I(this.$webView.getContext()));
            C3380CIk c3380CIk = SC.android_ras_blobs;
            C7384Etj.A0V(c3380CIk);
            ?? CreateTempFile = File.createTempFile("browser-pdf-", ".part", edzA01.getAppNonScoped_DO_NOT_USE_WITH_USER_DATA_OR_YOU_MAY_CAUSE_A_PRIVACY_SEV(c3380CIk.A00, null));
            this.$file.element = CreateTempFile;
            this.$destination.element = ParcelFileDescriptor.open(CreateTempFile, 805306368);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserPdfPrinter$print$7", f = "LocalBrowserPdfPrinter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserPdfPrinter$print$7, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass7 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super byte[]>, Object> {
        public final /* synthetic */ C10543Hqv<File> $file;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(C10543Hqv<File> c10543Hqv, HtJ<? super AnonymousClass7> htJ) {
            super(2, htJ);
            this.$file = c10543Hqv;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass7(this.$file, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super byte[]> htJ) {
            return new AnonymousClass7(this.$file, htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws NativeException.Unavailable, IOException {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            File file = this.$file.element;
            if (file == null) {
                throw new NativeException.Unavailable();
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] boundedBytes = HttpResponseBytesKt.readBoundedBytes(fileInputStream, LocalBrowserPdfPrinter.MAX_PDF_BYTES, -1L);
                fileInputStream.close();
                return boundedBytes;
            } finally {
            }
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserPdfPrinter$print$8", f = "LocalBrowserPdfPrinter.kt", l = {89, 89}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserPdfPrinter$print$8, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass8 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ C10543Hqv<PrintDocumentAdapter> $adapter;
        public final /* synthetic */ CancellationSignal $cancellation;
        public final /* synthetic */ C10543Hqv<ParcelFileDescriptor> $destination;
        public final /* synthetic */ C10543Hqv<File> $file;
        public Object L$0;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserPdfPrinter$print$8$1", f = "LocalBrowserPdfPrinter.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.localbrowser.LocalBrowserPdfPrinter$print$8$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ C10543Hqv<ParcelFileDescriptor> $destination;
            public final /* synthetic */ C10543Hqv<File> $file;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C10543Hqv<ParcelFileDescriptor> c10543Hqv, C10543Hqv<File> c10543Hqv2, HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
                this.$destination = c10543Hqv;
                this.$file = c10543Hqv2;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass1(this.$destination, this.$file, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                Unit unit;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                try {
                    ParcelFileDescriptor parcelFileDescriptor = this.$destination.element;
                    if (parcelFileDescriptor != null) {
                        parcelFileDescriptor.close();
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    File file = this.$file.element;
                    if (file != null) {
                        file.delete();
                    }
                    return unit;
                } finally {
                }
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(CancellationSignal cancellationSignal, C10543Hqv<PrintDocumentAdapter> c10543Hqv, C10543Hqv<ParcelFileDescriptor> c10543Hqv2, C10543Hqv<File> c10543Hqv3, HtJ<? super AnonymousClass8> htJ) {
            super(2, htJ);
            this.$cancellation = cancellationSignal;
            this.$adapter = c10543Hqv;
            this.$destination = c10543Hqv2;
            this.$file = c10543Hqv3;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass8(this.$cancellation, this.$adapter, this.$destination, this.$file, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws Throwable {
            Unit unit;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    Object obj2 = this.L$0;
                    Hwg.A00(obj);
                    return obj2;
                }
                if (i != 2) {
                    throw AnonymousClass001.A0n();
                }
                Throwable th = (Throwable) this.L$0;
                Hwg.A00(obj);
                throw th;
            }
            Hwg.A00(obj);
            try {
                this.$cancellation.cancel();
                PrintDocumentAdapter printDocumentAdapter = this.$adapter.element;
                if (printDocumentAdapter != null) {
                    printDocumentAdapter.onFinish();
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                C78T c78tA0y = AnonymousClass001.A0y();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$destination, this.$file, null);
                this.L$0 = unit;
                this.label = 1;
                return GAo.A00(this, c78tA0y, anonymousClass1) != enumC10460Hji ? unit : enumC10460Hji;
            } catch (Throwable th2) {
                C78T c78tA0y2 = AnonymousClass001.A0y();
                AnonymousClass1 anonymousClass12 = new AnonymousClass1(this.$destination, this.$file, null);
                this.L$0 = th2;
                this.label = 2;
                if (GAo.A00(this, c78tA0y2, anonymousClass12) == enumC10460Hji) {
                    return enumC10460Hji;
                }
                throw th2;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass8) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final Unit print$lambda$0(InterfaceC10560Hsz interfaceC10560Hsz) {
        Unit unit = Unit.INSTANCE;
        C3cG.A1F(interfaceC10560Hsz, unit);
        return unit;
    }

    public static final Unit print$lambda$1(InterfaceC10560Hsz interfaceC10560Hsz, boolean z) {
        CFK.A06("LocalBrowserPdfPrinter", FGI.A0r("PDF layout failed: cancelled=", z));
        interfaceC10560Hsz.A6f(new NativeException.Unavailable());
        return Unit.INSTANCE;
    }

    public static final Unit print$lambda$2(InterfaceC10560Hsz interfaceC10560Hsz) {
        Unit unit = Unit.INSTANCE;
        C3cG.A1F(interfaceC10560Hsz, unit);
        return unit;
    }

    public static final Unit print$lambda$3(InterfaceC10560Hsz interfaceC10560Hsz, boolean z) {
        CFK.A06("LocalBrowserPdfPrinter", FGI.A0r("PDF write failed: cancelled=", z));
        interfaceC10560Hsz.A6f(new NativeException.Unavailable());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079 A[Catch: all -> 0x00e9, TRY_LEAVE, TryCatch #1 {all -> 0x00e9, blocks: (B:17:0x0073, B:19:0x0079), top: B:68:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e3 A[Catch: all -> 0x00ec, TryCatch #2 {all -> 0x00ec, blocks: (B:12:0x0039, B:20:0x00c8, B:23:0x00e3, B:24:0x00e8, B:16:0x0070), top: B:67:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0110 A[Catch: all -> 0x01e7, TryCatch #0 {all -> 0x01e7, blocks: (B:31:0x010a, B:33:0x0110, B:35:0x0121, B:42:0x0173, B:44:0x0179, B:47:0x019f, B:48:0x01a4, B:38:0x0150, B:39:0x0156, B:30:0x0107, B:41:0x0170, B:50:0x01b5), top: B:67:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0156 A[Catch: all -> 0x01e7, TRY_LEAVE, TryCatch #0 {all -> 0x01e7, blocks: (B:31:0x010a, B:33:0x0110, B:35:0x0121, B:42:0x0173, B:44:0x0179, B:47:0x019f, B:48:0x01a4, B:38:0x0150, B:39:0x0156, B:30:0x0107, B:41:0x0170, B:50:0x01b5), top: B:67:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0179 A[Catch: all -> 0x01e7, TryCatch #0 {all -> 0x01e7, blocks: (B:31:0x010a, B:33:0x0110, B:35:0x0121, B:42:0x0173, B:44:0x0179, B:47:0x019f, B:48:0x01a4, B:38:0x0150, B:39:0x0156, B:30:0x0107, B:41:0x0170, B:50:0x01b5), top: B:67:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x019f A[Catch: all -> 0x01e7, TryCatch #0 {all -> 0x01e7, blocks: (B:31:0x010a, B:33:0x0110, B:35:0x0121, B:42:0x0173, B:44:0x0179, B:47:0x019f, B:48:0x01a4, B:38:0x0150, B:39:0x0156, B:30:0x0107, B:41:0x0170, B:50:0x01b5), top: B:67:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0218 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0219  */
    /* JADX WARN: Type inference failed for: r12v4, types: [T, android.print.PrintDocumentAdapter, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r17v1, types: [X.Hqv] */
    /* JADX WARN: Type inference failed for: r2v16, types: [int] */
    /* JADX WARN: Type inference failed for: r2v17, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12, types: [X.Hqv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [X.Hqv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v9, types: [X.Hqv] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object print(android.webkit.WebView r17, kotlin.jvm.functions.Function0<java.lang.Boolean> r18, X.HtJ<? super byte[]> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserPdfPrinter.print(android.webkit.WebView, kotlin.jvm.functions.Function0, X.HtJ):java.lang.Object");
    }
}
