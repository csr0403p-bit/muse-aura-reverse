package com.facebook.aura.file.view;

import X.C0881AGi;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.Hsg;
import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class PdfRendererHolder {
    public static final int $stable = 8;
    public final Object lock = C3cG.A0T();
    public ParcelFileDescriptor pfd;
    public PdfRenderer renderer;

    private final List<PageSize> pageSizesLocked() {
        PdfRenderer pdfRenderer = this.renderer;
        if (pdfRenderer == null) {
            return C0881AGi.A00;
        }
        int pageCount = pdfRenderer.getPageCount();
        ArrayList arrayListA11 = C60O.A11(pageCount);
        for (int i = 0; i < pageCount; i++) {
            PdfRenderer.Page pageOpenPage = pdfRenderer.openPage(i);
            try {
                float width = pageOpenPage.getWidth();
                float height = pageOpenPage.getHeight();
                if (height < 1.0f) {
                    height = 1.0f;
                }
                float f = width / height;
                if (f < 0.1f) {
                    f = 0.1f;
                }
                arrayListA11.add(new PageSize(i, f));
                pageOpenPage.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    Hsg.A00(pageOpenPage, th);
                    throw th2;
                }
            }
        }
        return arrayListA11;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0022 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r6 = this;
            java.lang.String r5 = "Error closing ParcelFileDescriptor: "
            java.lang.String r4 = "Error closing PdfRenderer: "
            java.lang.Object r3 = r6.lock
            monitor-enter(r3)
            android.graphics.pdf.PdfRenderer r1 = r6.renderer     // Catch: java.lang.Throwable -> L32
            android.os.ParcelFileDescriptor r2 = r6.pfd     // Catch: java.lang.Throwable -> L32
            r0 = 0
            r6.renderer = r0     // Catch: java.lang.Throwable -> L32
            r6.pfd = r0     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L20
            r1.close()     // Catch: java.lang.Exception -> L16 java.lang.Throwable -> L32
            goto L20
        L16:
            r0 = move-exception
            java.lang.String r1 = "PdfRendererHolder"
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L32
            X.C3cG.A1G(r4, r0, r1)     // Catch: java.lang.Throwable -> L32
        L20:
            if (r2 == 0) goto L30
            r2.close()     // Catch: java.lang.Exception -> L26 java.lang.Throwable -> L32
            goto L30
        L26:
            r0 = move-exception
            java.lang.String r1 = "PdfRendererHolder"
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L32
            X.C3cG.A1G(r5, r0, r1)     // Catch: java.lang.Throwable -> L32
        L30:
            monitor-exit(r3)
            return
        L32:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.PdfRendererHolder.close():void");
    }

    public final List<PageSize> open(File file) {
        List<PageSize> listPageSizesLocked;
        C7384Etj.A0Y(file, 0);
        synchronized (this.lock) {
            if (this.renderer != null) {
                listPageSizesLocked = pageSizesLocked();
            } else {
                listPageSizesLocked = null;
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(file, 268435456);
                    try {
                        PdfRenderer pdfRenderer = new PdfRenderer(parcelFileDescriptorOpen);
                        this.pfd = parcelFileDescriptorOpen;
                        this.renderer = pdfRenderer;
                        listPageSizesLocked = pageSizesLocked();
                    } catch (Exception e) {
                        C3cH.A1B("Failed to open PdfRenderer: ", e.getMessage(), PdfRendererHolderKt.TAG, e);
                        parcelFileDescriptorOpen.close();
                    }
                } catch (Exception e2) {
                    C3cH.A1B("Failed to open PDF descriptor: ", e2.getMessage(), PdfRendererHolderKt.TAG, e2);
                }
            }
        }
        return listPageSizesLocked;
    }

    public final Bitmap renderPage(int i, int i2) {
        Bitmap bitmap;
        synchronized (this.lock) {
            PdfRenderer pdfRenderer = this.renderer;
            bitmap = null;
            if (pdfRenderer != null && i >= 0 && i < pdfRenderer.getPageCount()) {
                PdfRenderer.Page pageOpenPage = pdfRenderer.openPage(i);
                if (i2 < 1) {
                    i2 = 1;
                }
                try {
                    int height = (int) ((pageOpenPage.getHeight() / pageOpenPage.getWidth()) * i2);
                    if (height < 1) {
                        height = 1;
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, height, Bitmap.Config.ARGB_8888);
                    bitmapCreateBitmap.eraseColor(-1);
                    pageOpenPage.render(bitmapCreateBitmap, null, null, 1);
                    pageOpenPage.close();
                    bitmap = bitmapCreateBitmap;
                } finally {
                }
            }
        }
        return bitmap;
    }
}
