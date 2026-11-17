package com.facebook.aura.composer.util;

import X.C7384Etj;
import X.HtJ;
import X.HzP;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.LruCache;
import android.util.Size;
import java.io.IOException;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes3.dex */
public final class FileThumbnailCache {
    public static final FileThumbnailCache INSTANCE = new FileThumbnailCache();
    public static final LruCache<String, ThumbnailResult> cache = new LruCache<>(20);

    @DebugMetadata(c = "com.facebook.aura.composer.util.FileThumbnailCache", f = "FileThumbnailCache.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft}, m = "getOrLoad", v = 2)
    /* renamed from: com.facebook.aura.composer.util.FileThumbnailCache$getOrLoad$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileThumbnailCache.this.getOrLoad(null, null, 0, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap loadThumbnailFromProvider(Context context, Uri uri, int i) {
        try {
            return context.getContentResolver().loadThumbnail(uri, new Size(i, i), null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getOrLoad(android.content.Context r7, android.net.Uri r8, int r9, X.HtJ<? super com.facebook.aura.composer.util.ThumbnailResult> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.facebook.aura.composer.util.FileThumbnailCache.AnonymousClass1
            if (r0 == 0) goto L5d
            r5 = r10
            com.facebook.aura.composer.util.FileThumbnailCache$getOrLoad$1 r5 = (com.facebook.aura.composer.util.FileThumbnailCache.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5d
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r0 = r5.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r1 = r5.label
            r4 = 1
            if (r1 == 0) goto L2a
            if (r1 != r4) goto L63
            java.lang.Object r3 = r5.L$2
            X.Hwg.A00(r0)
        L22:
            if (r0 == 0) goto L29
            android.util.LruCache<java.lang.String, com.facebook.aura.composer.util.ThumbnailResult> r1 = com.facebook.aura.composer.util.FileThumbnailCache.cache
            r1.put(r3, r0)
        L29:
            return r0
        L2a:
            X.Hwg.A00(r0)
            java.lang.StringBuilder r1 = X.C60O.A0w()
            r1.append(r8)
            java.lang.String r0 = "-"
            java.lang.String r3 = X.C60P.A1O(r0, r1, r9)
            android.util.LruCache<java.lang.String, com.facebook.aura.composer.util.ThumbnailResult> r0 = com.facebook.aura.composer.util.FileThumbnailCache.cache
            java.lang.Object r0 = r0.get(r3)
            if (r0 != 0) goto L29
            X.78T r2 = X.AnonymousClass001.A0y()
            r1 = 0
            com.facebook.aura.composer.util.FileThumbnailCache$getOrLoad$result$1 r0 = new com.facebook.aura.composer.util.FileThumbnailCache$getOrLoad$result$1
            r0.<init>(r7, r8, r9, r1)
            r5.L$0 = r1
            r5.L$1 = r1
            r5.L$2 = r3
            r5.I$0 = r9
            r5.label = r4
            java.lang.Object r0 = X.GAo.A00(r5, r2, r0)
            if (r0 != r6) goto L22
            return r6
        L5d:
            com.facebook.aura.composer.util.FileThumbnailCache$getOrLoad$1 r5 = new com.facebook.aura.composer.util.FileThumbnailCache$getOrLoad$1
            r5.<init>(r10)
            goto L12
        L63:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.composer.util.FileThumbnailCache.getOrLoad(android.content.Context, android.net.Uri, int, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap loadPdfThumbnail(Context context, Uri uri, int i) throws IOException {
        String type = context.getContentResolver().getType(uri);
        if (type != null && type.equals("application/pdf")) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        PdfRenderer pdfRenderer = new PdfRenderer(parcelFileDescriptorOpenFileDescriptor);
                        try {
                            PdfRenderer.Page pageOpenPage = pdfRenderer.openPage(0);
                            try {
                                float fMax = i / Math.max(pageOpenPage.getWidth(), pageOpenPage.getHeight());
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (pageOpenPage.getWidth() * fMax), (int) (pageOpenPage.getHeight() * fMax), Bitmap.Config.ARGB_8888);
                                C7384Etj.A0U(bitmapCreateBitmap);
                                bitmapCreateBitmap.eraseColor(-1);
                                pageOpenPage.render(bitmapCreateBitmap, null, null, 1);
                                pageOpenPage.close();
                                pdfRenderer.close();
                                parcelFileDescriptorOpenFileDescriptor.close();
                                return bitmapCreateBitmap;
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                }
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }
}
