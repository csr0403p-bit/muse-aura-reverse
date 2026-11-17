package X;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class BiU implements InterfaceC2969BqO {
    public C3010Brs<Void> A00;
    public BeM<AbstractC2470Bbx> A01;
    public Executor A02;
    public Matrix A04;
    public final int A06;
    public final Size A07;
    public final Surface A08;
    public final ListenableFuture<Void> A09;
    public final float[] A0B;
    public final float[] A0C;
    public final BhN A0D;
    public final float[] A0E;
    public final Object A0A = C3cG.A0T();
    public final float[] A0F = new float[16];
    public boolean A03 = false;
    public boolean A05 = false;

    public BiU(Matrix matrix, Size size, Surface surface, BhN bhN, int i) {
        float[] fArr = new float[16];
        this.A0B = fArr;
        float[] fArr2 = new float[16];
        this.A0C = fArr2;
        float[] fArr3 = new float[16];
        this.A0E = fArr3;
        this.A08 = surface;
        this.A06 = i;
        this.A07 = size;
        this.A0D = bhN;
        this.A04 = matrix;
        android.opengl.Matrix.setIdentityM(fArr, 0);
        if (bhN != null) {
            BiV.A00(fArr);
            BiT biT = (BiT) bhN;
            int i2 = biT.A00;
            BiV.A01(fArr, i2);
            boolean z = biT.A04;
            if (z) {
                android.opengl.Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
                android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
            }
            Size size2 = biT.A02;
            Matrix matrixA00 = BfO.A00(BV8.A0Q(size2), BV8.A0Q(BfO.A01(size2, i2)), i2, z);
            RectF rectF = new RectF(biT.A01);
            matrixA00.mapRect(rectF);
            float width = rectF.left / r10.getWidth();
            float height = ((r10.getHeight() - rectF.height()) - rectF.top) / r10.getHeight();
            float fWidth = rectF.width() / r10.getWidth();
            float fHeight = rectF.height() / r10.getHeight();
            android.opengl.Matrix.translateM(fArr, 0, width, height, 0.0f);
            android.opengl.Matrix.scaleM(fArr, 0, fWidth, fHeight, 1.0f);
            InterfaceC2610Bfb interfaceC2610Bfb = biT.A03;
            android.opengl.Matrix.setIdentityM(fArr3, 0);
            BiV.A00(fArr3);
            if (interfaceC2610Bfb != null) {
                BeS.A07(interfaceC2610Bfb.AG8(), "Camera has no transform.");
                InterfaceC2544BdV interfaceC2544BdVADJ = interfaceC2610Bfb.ADJ();
                BiV.A01(fArr3, interfaceC2544BdVADJ.AKN());
                if (interfaceC2544BdVADJ.AH3() == 0) {
                    android.opengl.Matrix.translateM(fArr3, 0, 1.0f, 0.0f, 0.0f);
                    android.opengl.Matrix.scaleM(fArr3, 0, -1.0f, 1.0f, 1.0f);
                }
            }
            android.opengl.Matrix.invertM(fArr3, 0, fArr3, 0);
            android.opengl.Matrix.multiplyMM(fArr, 0, fArr3, 0, fArr, 0);
        }
        android.opengl.Matrix.setIdentityM(fArr2, 0);
        this.A09 = AbstractC2947Bpi.A01(this, 24);
    }

    @Override // X.InterfaceC2969BqO, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.A0A) {
            if (!this.A05) {
                this.A05 = true;
            }
        }
        this.A00.A03(null);
    }

    public final void A00() {
        Executor executor;
        BeM<AbstractC2470Bbx> beM;
        final AtomicReference atomicReferenceA15 = BV4.A15();
        synchronized (this.A0A) {
            if (this.A02 == null || (beM = this.A01) == null) {
                this.A03 = true;
            } else if (!this.A05) {
                atomicReferenceA15.set(beM);
                executor = this.A02;
                this.A03 = false;
            }
            executor = null;
        }
        if (executor != null) {
            try {
                executor.execute(new Runnable() { // from class: X.Bby
                    public static final String __redex_internal_original_name = "SurfaceOutputImpl$$ExternalSyntheticLambda1";

                    @Override // java.lang.Runnable
                    public final void run() {
                        ((BeM) atomicReferenceA15.get()).accept(new C2469Bbw(this.A00));
                    }
                });
            } catch (RejectedExecutionException e) {
                if (AbstractC2875Bni.A08("SurfaceOutputImpl", 3)) {
                    Log.d("SurfaceOutputImpl", "Processor executor closed. Close request not posted.", e);
                }
            }
        }
    }
}
