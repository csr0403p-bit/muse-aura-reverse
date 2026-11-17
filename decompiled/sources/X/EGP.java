package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.HardwareRenderer;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.RuntimeShader;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.view.Choreographer;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class EGP extends FHQ {
    public long A00;
    public EGN A01;
    public C5219Ddb A02;
    public List<? extends RuntimeShader> A03;
    public List<C5193Dd4> A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public EGQ A08;
    public EGS A09;
    public Etx A0A;
    public final Choreographer.FrameCallback A0B;
    public final G0U<Canvas, Unit> A0C;
    public final G0U<Canvas, Unit> A0D;

    public EGP(Context context) {
        super(context);
        this.A04 = C0881AGi.A00;
        this.A0D = new EQe(this, 4);
        this.A0C = new EQe(this, 3);
        this.A0B = new EGR(this);
        setWillNotDraw(false);
    }

    private final boolean A05(Canvas canvas, C5220Ddc c5220Ddc, C5219Ddb c5219Ddb, int i, int i2) {
        HardwareRenderer hardwareRenderer;
        RenderNode renderNode;
        EGQ egq = this.A08;
        if (egq == null) {
            egq = new EGQ();
            this.A08 = egq;
        }
        G0U<Canvas, Unit> g0u = this.A0C;
        C7384Etj.A0Y(g0u, 2);
        if (egq.A09) {
            return false;
        }
        ImageReader imageReaderNewInstance = egq.A08;
        if (imageReaderNewInstance == null || (hardwareRenderer = egq.A02) == null || (renderNode = egq.A03) == null || egq.A01 != i || egq.A00 != i2) {
            egq.A00();
            try {
                imageReaderNewInstance = ImageReader.newInstance(i, i2, 1, 3, 768L);
                C7384Etj.A0X(imageReaderNewInstance);
                try {
                    hardwareRenderer = new HardwareRenderer();
                    hardwareRenderer.setSurface(imageReaderNewInstance.getSurface());
                    renderNode = new RenderNode("bk_shader_effect_gpu_capture");
                    renderNode.setPosition(0, 0, i, i2);
                    RenderNode renderNode2 = new RenderNode("bk_shader_effect_gpu_capture_root");
                    renderNode2.setPosition(0, 0, i, i2);
                    RecordingCanvas recordingCanvasBeginRecording = renderNode2.beginRecording();
                    C7384Etj.A0U(recordingCanvasBeginRecording);
                    try {
                        recordingCanvasBeginRecording.drawRenderNode(renderNode);
                        renderNode2.endRecording();
                        hardwareRenderer.setContentRoot(renderNode2);
                        egq.A08 = imageReaderNewInstance;
                        egq.A02 = hardwareRenderer;
                        egq.A03 = renderNode;
                        egq.A04 = renderNode2;
                        egq.A01 = i;
                        egq.A00 = i2;
                    } catch (Throwable th) {
                        renderNode2.endRecording();
                        throw th;
                    }
                } catch (Exception unused) {
                    imageReaderNewInstance.close();
                    egq.A09 = true;
                    return false;
                }
            } catch (Exception unused2) {
                egq.A09 = true;
                return false;
            }
        }
        if (imageReaderNewInstance == null || hardwareRenderer == null || renderNode == null) {
            return false;
        }
        RecordingCanvas recordingCanvasBeginRecording2 = renderNode.beginRecording();
        C7384Etj.A0U(recordingCanvasBeginRecording2);
        try {
            recordingCanvasBeginRecording2.drawColor(-16777216);
            g0u.invoke(recordingCanvasBeginRecording2);
            renderNode.endRecording();
            hardwareRenderer.createRenderRequest().setWaitForPresent(true).syncAndDraw();
            Image image = egq.A06;
            if (image != null) {
                image.close();
            }
            egq.A06 = egq.A07;
            egq.A07 = egq.A05;
            egq.A05 = null;
            Image imageAcquireLatestImage = imageReaderNewInstance.acquireLatestImage();
            if (imageAcquireLatestImage == null) {
                return false;
            }
            HardwareBuffer hardwareBuffer = imageAcquireLatestImage.getHardwareBuffer();
            if (hardwareBuffer != null) {
                Bitmap bitmapWrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, ColorSpace.get(ColorSpace.Named.SRGB));
                hardwareBuffer.close();
                if (bitmapWrapHardwareBuffer != null) {
                    egq.A05 = imageAcquireLatestImage;
                    RenderEffect renderEffectA01 = C5218Dda.A00.A01(c5220Ddc, c5219Ddb, this.A03, this.A04, i, i2, 0);
                    EGN egn = this.A01;
                    if (egn == null) {
                        egn = new EGN();
                        this.A01 = egn;
                    }
                    egn.A01(bitmapWrapHardwareBuffer, canvas, renderEffectA01, c5220Ddc, i, i2);
                    return true;
                }
            }
            imageAcquireLatestImage.close();
            return false;
        } catch (Throwable th2) {
            renderNode.endRecording();
            throw th2;
        }
    }

    public final void A0D() {
        this.A02 = null;
        this.A03 = null;
        if (Build.VERSION.SDK_INT >= 33) {
            EGQ egq = this.A08;
            if (egq != null) {
                egq.A00();
            }
            EGS egs = this.A09;
            if (egs != null) {
                egs.A00();
            }
            EGN egn = this.A01;
            if (egn != null) {
                egn.A00();
            }
            Etx etx = this.A0A;
            if (etx != null) {
                etx.A01();
            }
        }
        this.A08 = null;
        this.A09 = null;
        this.A01 = null;
        this.A0A = null;
        this.A07 = false;
    }

    @Override // X.FHQ, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C7384Etj.A0Y(canvas, 0);
        C5219Ddb c5219Ddb = this.A02;
        int width = getWidth();
        int height = getHeight();
        if (c5219Ddb == null || width <= 0 || height <= 0 || Build.VERSION.SDK_INT < 33 || !canvas.isHardwareAccelerated()) {
            super.dispatchDraw(canvas);
            return;
        }
        C5220Ddc c5220Ddc = c5219Ddb.A02;
        boolean zA06 = A06(this);
        this.A07 = zA06;
        if (!zA06) {
            A02(canvas, c5220Ddc, c5219Ddb, width, height);
        } else {
            if (A05(canvas, c5220Ddc, c5219Ddb, width, height)) {
                return;
            }
            A03(canvas, c5220Ddc, c5219Ddb, width, height);
        }
    }

    public final void setDynamicUniformValues(List<C5193Dd4> list) {
        C7384Etj.A0Y(list, 0);
        this.A04 = list;
    }

    public static final void A00(Canvas canvas, EGP egp) {
        Etx etx = egp.A0A;
        if (etx == null) {
            etx = new Etx();
            egp.A0A = etx;
        }
        int[] iArr = etx.A01;
        egp.getLocationInWindow(iArr);
        Etx.A00(canvas, egp, etx, iArr[0], iArr[1]);
    }

    private final void A02(Canvas canvas, C5220Ddc c5220Ddc, C5219Ddb c5219Ddb, int i, int i2) {
        RenderEffect renderEffectA01 = C5218Dda.A00.A01(c5220Ddc, c5219Ddb, this.A03, this.A04, i, i2, 0);
        if (renderEffectA01 == null) {
            super.dispatchDraw(canvas);
            return;
        }
        EGN egn = this.A01;
        if (egn == null) {
            egn = new EGN();
            this.A01 = egn;
        }
        egn.A02(canvas, renderEffectA01, c5220Ddc, this.A0D, i, i2);
    }

    private final void A03(Canvas canvas, C5220Ddc c5220Ddc, C5219Ddb c5219Ddb, int i, int i2) {
        EGS egs = this.A09;
        if (egs == null) {
            egs = new EGS();
            this.A09 = egs;
        }
        G0U<Canvas, Unit> g0u = this.A0C;
        C7384Etj.A0Y(g0u, 2);
        RenderNode renderNode = egs.A01;
        if (renderNode == null) {
            renderNode = new RenderNode("bk_shader_effect_host_lifecycle");
            egs.A01 = renderNode;
        }
        renderNode.setPosition(0, 0, i, i2);
        RecordingCanvas recordingCanvasBeginRecording = renderNode.beginRecording();
        C7384Etj.A0U(recordingCanvasBeginRecording);
        try {
            g0u.invoke(recordingCanvasBeginRecording);
            renderNode.endRecording();
            Bitmap bitmapCreateBitmap = egs.A00;
            if (bitmapCreateBitmap == null) {
                bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            } else if (bitmapCreateBitmap.getWidth() != i || bitmapCreateBitmap.getHeight() != i2 || bitmapCreateBitmap.isRecycled()) {
                bitmapCreateBitmap.recycle();
                bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            }
            egs.A00 = bitmapCreateBitmap;
            bitmapCreateBitmap.eraseColor(-16777216);
            Canvas canvas2 = egs.A02;
            canvas2.setBitmap(bitmapCreateBitmap);
            g0u.invoke(canvas2);
            canvas2.setBitmap(null);
            RenderEffect renderEffectA01 = C5218Dda.A00.A01(c5220Ddc, c5219Ddb, this.A03, this.A04, i, i2, 0);
            EGN egn = this.A01;
            if (egn == null) {
                egn = new EGN();
                this.A01 = egn;
            }
            egn.A01(bitmapCreateBitmap, canvas, renderEffectA01, c5220Ddc, i, i2);
        } catch (Throwable th) {
            renderNode.endRecording();
            throw th;
        }
    }

    public static final void A04(EGP egp) {
        if (egp.A06) {
            return;
        }
        egp.A06 = true;
        Choreographer.getInstance().postFrameCallback(egp.A0B);
    }

    private final boolean A06(View view) {
        if (!(view instanceof TextureView)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    C7384Etj.A0U(childAt);
                    if (!A06(childAt)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void setContinuousRender(boolean z) {
        if (this.A05 != z) {
            this.A05 = z;
            if (!z) {
                Choreographer.getInstance().removeFrameCallback(this.A0B);
                this.A06 = false;
            } else if (isAttachedToWindow()) {
                this.A00 = 0L;
                A04(this);
            }
        }
    }

    public final void setShaderConfig(C5219Ddb c5219Ddb, List<? extends RuntimeShader> list) {
        this.A02 = c5219Ddb;
        this.A03 = list;
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.A05) {
            A04(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Choreographer.getInstance().removeFrameCallback(this.A0B);
        this.A06 = false;
    }
}
