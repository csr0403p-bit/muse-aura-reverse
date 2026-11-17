package X;

import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import java.util.concurrent.Executor;

/* renamed from: X.Bnr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2884Bnr implements InterfaceC2864BnO {
    public final ImageReader A02;
    public final Object A01 = C3cG.A0T();
    public boolean A00 = true;

    @Override // X.InterfaceC2864BnO
    public final InterfaceC2873Bng A30() {
        C2881Bno c2881Bno;
        synchronized (this.A01) {
            c2881Bno = null;
            try {
                Image imageAcquireLatestImage = this.A02.acquireLatestImage();
                if (imageAcquireLatestImage != null) {
                    c2881Bno = new C2881Bno(imageAcquireLatestImage);
                }
            } catch (RuntimeException e) {
                if (!"ImageReaderContext is not initialized".equals(e.getMessage())) {
                    throw e;
                }
            }
        }
        return c2881Bno;
    }

    @Override // X.InterfaceC2864BnO
    public final InterfaceC2873Bng A31() {
        C2881Bno c2881Bno;
        synchronized (this.A01) {
            c2881Bno = null;
            try {
                Image imageAcquireNextImage = this.A02.acquireNextImage();
                if (imageAcquireNextImage != null) {
                    c2881Bno = new C2881Bno(imageAcquireNextImage);
                }
            } catch (RuntimeException e) {
                if (!"ImageReaderContext is not initialized".equals(e.getMessage())) {
                    throw e;
                }
            }
        }
        return c2881Bno;
    }

    @Override // X.InterfaceC2864BnO
    public final void A6K() {
        synchronized (this.A01) {
            this.A00 = true;
            this.A02.setOnImageAvailableListener(null, null);
        }
    }

    @Override // X.InterfaceC2864BnO
    public final int AGJ() {
        int imageFormat;
        synchronized (this.A01) {
            imageFormat = this.A02.getImageFormat();
        }
        return imageFormat;
    }

    @Override // X.InterfaceC2864BnO
    public final int AHQ() {
        int maxImages;
        synchronized (this.A01) {
            maxImages = this.A02.getMaxImages();
        }
        return maxImages;
    }

    @Override // X.InterfaceC2864BnO
    public final void Adw(final InterfaceC2888Bnw interfaceC2888Bnw, final Executor executor) {
        synchronized (this.A01) {
            this.A00 = false;
            ImageReader.OnImageAvailableListener onImageAvailableListener = new ImageReader.OnImageAvailableListener() { // from class: X.Bnq
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    final C2884Bnr c2884Bnr = this.A00;
                    Executor executor2 = executor;
                    final InterfaceC2888Bnw interfaceC2888Bnw2 = interfaceC2888Bnw;
                    synchronized (c2884Bnr.A01) {
                        if (!c2884Bnr.A00) {
                            executor2.execute(new Runnable() { // from class: X.Bnp
                                public static final String __redex_internal_original_name = "AndroidImageReaderProxy$$ExternalSyntheticLambda0";

                                @Override // java.lang.Runnable
                                public final void run() {
                                    interfaceC2888Bnw2.ATX(c2884Bnr);
                                }
                            });
                        }
                    }
                }
            };
            ImageReader imageReader = this.A02;
            if (C2885Bns.A00 == null) {
                synchronized (C2885Bns.class) {
                    if (C2885Bns.A00 == null) {
                        C2885Bns.A00 = Handler.createAsync(Looper.getMainLooper());
                    }
                }
            }
            imageReader.setOnImageAvailableListener(onImageAvailableListener, C2885Bns.A00);
        }
    }

    @Override // X.InterfaceC2864BnO
    public final void close() {
        synchronized (this.A01) {
            this.A02.close();
        }
    }

    @Override // X.InterfaceC2864BnO
    public final int getHeight() {
        int height;
        synchronized (this.A01) {
            height = this.A02.getHeight();
        }
        return height;
    }

    @Override // X.InterfaceC2864BnO
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.A01) {
            surface = this.A02.getSurface();
        }
        return surface;
    }

    @Override // X.InterfaceC2864BnO
    public final int getWidth() {
        int width;
        synchronized (this.A01) {
            width = this.A02.getWidth();
        }
        return width;
    }

    public C2884Bnr(ImageReader imageReader) {
        this.A02 = imageReader;
    }
}
