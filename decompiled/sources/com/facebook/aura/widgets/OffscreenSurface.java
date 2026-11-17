package com.facebook.aura.widgets;

import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.HtJ;
import X.HzP;
import android.app.Presentation;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.media.Image;
import android.media.ImageReader;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.io.Closeable;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes5.dex */
public final class OffscreenSurface implements Closeable {
    public final int height;
    public Image latestFrame;
    public final Presentation presentation;
    public final ImageReader reader;
    public final VirtualDisplay virtualDisplay;
    public final int width;

    @DebugMetadata(c = "com.facebook.aura.widgets.OffscreenSurface", f = "SpaceSnapshotRenderer.kt", l = {195, 198}, m = "copyStableFrame", v = 2)
    /* renamed from: com.facebook.aura.widgets.OffscreenSurface$copyStableFrame$1, reason: invalid class name and case insensitive filesystem */
    public final class C143981 extends HzP {
        public int I$0;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C143981(HtJ<? super C143981> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OffscreenSurface.this.copyStableFrame(null, null, this);
        }
    }

    public OffscreenSurface(Context context, int i, int i2) {
        C7384Etj.A0Y(context, 0);
        this.width = i;
        this.height = i2;
        ImageReader imageReaderNewInstance = ImageReader.newInstance(i, i2, 1, 3);
        C7384Etj.A0U(imageReaderNewInstance);
        this.reader = imageReaderNewInstance;
        VirtualDisplay virtualDisplayCreateVirtualDisplay = ((DisplayManager) context.getSystemService(DisplayManager.class)).createVirtualDisplay(SpaceSnapshotRendererKt.VIRTUAL_DISPLAY_NAME, i, i2, C60Q.A0B(context).densityDpi, imageReaderNewInstance.getSurface(), 0);
        this.virtualDisplay = virtualDisplayCreateVirtualDisplay;
        Presentation presentation = new Presentation(context, virtualDisplayCreateVirtualDisplay.getDisplay());
        this.presentation = presentation;
        imageReaderNewInstance.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: com.facebook.aura.widgets.OffscreenSurface.1
            @Override // android.media.ImageReader.OnImageAvailableListener
            public final void onImageAvailable(ImageReader imageReader) {
                Image imageAcquireLatestImage = imageReader.acquireLatestImage();
                if (imageAcquireLatestImage != null) {
                    OffscreenSurface offscreenSurface = OffscreenSurface.this;
                    Image image = offscreenSurface.latestFrame;
                    if (image != null) {
                        image.close();
                    }
                    offscreenSurface.latestFrame = imageAcquireLatestImage;
                }
            }
        }, C60O.A02());
        Window window = presentation.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(SpaceSnapshotRendererKt.backgroundColor(context)));
        }
    }

    public final void show(View view) {
        C7384Etj.A0Y(view, 0);
        this.presentation.setContentView(view, new ViewGroup.LayoutParams(-1, -1));
        this.presentation.show();
    }

    private final Bitmap copyLatestFrame() {
        Image image = this.latestFrame;
        if (image == null) {
            return null;
        }
        Image.Plane plane = image.getPlanes()[0];
        int rowStride = plane.getRowStride() / plane.getPixelStride();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rowStride, this.height, Bitmap.Config.ARGB_8888);
        C7384Etj.A0U(bitmapCreateBitmap);
        bitmapCreateBitmap.copyPixelsFromBuffer(plane.getBuffer().rewind());
        int i = this.width;
        return rowStride == i ? bitmapCreateBitmap : Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, i, this.height);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.presentation.dismiss();
        this.virtualDisplay.release();
        Image image = this.latestFrame;
        if (image != null) {
            image.close();
        }
        this.reader.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b9, code lost:
    
        if (r5 == r12) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0047, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Path cross not found for [B:16:0x0049, B:37:0x00be], limit reached: 49 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a3 -> B:14:0x0046). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00b9 -> B:12:0x0040). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00bc -> B:40:0x00c2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object copyStableFrame(kotlin.jvm.functions.Function0<java.lang.Boolean> r16, X.G0U<? super X.HtJ<? super java.lang.Boolean>, ? extends java.lang.Object> r17, X.HtJ<? super android.graphics.Bitmap> r18) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.OffscreenSurface.copyStableFrame(kotlin.jvm.functions.Function0, X.G0U, X.HtJ):java.lang.Object");
    }

    public final Context getContext() {
        Context context = this.presentation.getContext();
        C7384Etj.A0U(context);
        return context;
    }
}
