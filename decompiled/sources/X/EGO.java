package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.RuntimeShader;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
import java.util.List;
import kotlin.Deprecated;

/* loaded from: classes5.dex */
public final class EGO extends Drawable {
    public List<C5193Dd4> A00;
    public boolean A01;
    public int A02;
    public Path A03;
    public float[] A04;
    public final RenderNode A05;
    public final RenderNode A06;
    public final C5219Ddb A07;
    public final List<RuntimeShader> A08;
    public final LinearGradient A09;
    public final Paint A0A;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EGO(X.C5219Ddb r14, java.util.List<? extends android.graphics.RuntimeShader> r15) {
        /*
            r13 = this;
            r10 = 0
            r13.<init>()
            r13.A07 = r14
            r4 = 0
            if (r15 == 0) goto L52
            int r1 = r15.size()
            int r0 = r14.A01
            if (r1 != r0) goto L52
        L11:
            r13.A08 = r15
            r3 = 1
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r3)
            r13.A0A = r0
            android.graphics.Shader$TileMode r12 = android.graphics.Shader.TileMode.CLAMP
            r6 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            android.graphics.LinearGradient r5 = new android.graphics.LinearGradient
            r7 = r6
            r9 = r8
            r11 = r10
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r13.A09 = r5
            int r2 = r14.A01
            if (r2 <= r3) goto L50
            java.lang.String r1 = "bk_shader_drawable_generator"
            android.graphics.RenderNode r0 = new android.graphics.RenderNode
            r0.<init>(r1)
        L35:
            r13.A05 = r0
            if (r2 <= r3) goto L40
            java.lang.String r0 = "bk_shader_drawable_post_processing"
            android.graphics.RenderNode r4 = new android.graphics.RenderNode
            r4.<init>(r0)
        L40:
            r13.A06 = r4
            X.AGi r0 = X.C0881AGi.A00
            r13.A00 = r0
            if (r2 > r3) goto L49
            r3 = 0
        L49:
            r13.A01 = r3
            r0 = 255(0xff, float:3.57E-43)
            r13.A02 = r0
            return
        L50:
            r0 = r4
            goto L35
        L52:
            r15 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EGO.<init>(X.Ddb, java.util.List):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        List<RuntimeShader> list;
        RenderNode renderNode;
        C7384Etj.A0Y(canvas, 0);
        if (this.A02 == 0 || !canvas.isHardwareAccelerated() || getBounds().isEmpty() || (list = this.A08) == null) {
            return;
        }
        float f = getBounds().left;
        float f2 = getBounds().top;
        int iSave = canvas.save();
        canvas.translate(f, f2);
        try {
            Path path = this.A03;
            if (path != null) {
                canvas.clipPath(path);
            }
            Integer numValueOf = this.A02 < 255 ? Integer.valueOf(canvas.saveLayerAlpha(0.0f, 0.0f, getBounds().width(), getBounds().height(), this.A02)) : null;
            try {
                C5219Ddb c5219Ddb = this.A07;
                if (c5219Ddb.A01 != 1) {
                    RenderNode renderNode2 = this.A05;
                    if (renderNode2 != null && (renderNode = this.A06) != null) {
                        boolean z = this.A01;
                        boolean zHasDisplayList = renderNode.hasDisplayList();
                        if (z || !zHasDisplayList) {
                            int iWidth = getBounds().width();
                            int iHeight = getBounds().height();
                            renderNode2.setPosition(0, 0, iWidth, iHeight);
                            RecordingCanvas recordingCanvasBeginRecording = renderNode2.beginRecording();
                            C7384Etj.A0U(recordingCanvasBeginRecording);
                            try {
                                A00(recordingCanvasBeginRecording, list.get(0), c5219Ddb);
                                renderNode2.endRecording();
                                RenderEffect renderEffectA01 = C5218Dda.A00.A01(C5220Ddc.A04, c5219Ddb, list, this.A00, iWidth, iHeight, 1);
                                if (renderEffectA01 == null) {
                                    throw C3cG.A0Q("Required value was null.");
                                }
                                renderNode.setPosition(0, 0, iWidth, iHeight);
                                renderNode.setRenderEffect(renderEffectA01);
                                RecordingCanvas recordingCanvasBeginRecording2 = renderNode.beginRecording();
                                C7384Etj.A0U(recordingCanvasBeginRecording2);
                                try {
                                    recordingCanvasBeginRecording2.drawRenderNode(renderNode2);
                                    renderNode.endRecording();
                                    this.A01 = false;
                                } catch (Throwable th) {
                                    renderNode.endRecording();
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                renderNode2.endRecording();
                                throw th2;
                            }
                        }
                        canvas.drawRenderNode(renderNode);
                    }
                    throw C3cG.A0Q("Required value was null.");
                }
                A00(canvas, list.get(0), c5219Ddb);
            } finally {
                if (numValueOf != null) {
                    canvas.restoreToCount(numValueOf.intValue());
                }
            }
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C7384Etj.A0Y(rect, 0);
        A01(rect);
        if (this.A07.A01 > 1) {
            this.A01 = true;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i < 0) {
            i = 0;
        } else if (i > 255) {
            i = 255;
        }
        if (this.A02 != i) {
            this.A02 = i;
            invalidateSelf();
        }
    }

    private final void A01(Rect rect) {
        Path path;
        float[] fArr = this.A04;
        if (fArr == null || rect.isEmpty()) {
            path = null;
        } else {
            path = new Path();
            path.addRoundRect(new RectF(0.0f, 0.0f, rect.width(), rect.height()), fArr, Path.Direction.CW);
        }
        this.A03 = path;
    }

    private final void A02(RuntimeShader runtimeShader, C5219Ddb c5219Ddb) {
        runtimeShader.setInputShader("inputImage", this.A09);
        C5218Dda.A00.A02(runtimeShader, C5220Ddc.A04, c5219Ddb, this.A00, 0, getBounds().width(), getBounds().height());
    }

    public final void A03(List<C5193Dd4> list, float[] fArr) {
        this.A00 = list;
        List<RuntimeShader> list2 = this.A08;
        if (list2 != null && !getBounds().isEmpty()) {
            RuntimeShader runtimeShader = (RuntimeShader) C8j4.A0p(list2);
            C5219Ddb c5219Ddb = this.A07;
            A02(runtimeShader, c5219Ddb);
            int i = c5219Ddb.A01;
            for (int i2 = 1; i2 < i; i2++) {
                C5218Dda.A00.A02(list2.get(i2), C5220Ddc.A04, c5219Ddb, this.A00, i2, getBounds().width(), getBounds().height());
            }
        }
        float[] fArr2 = this.A04;
        if (fArr2 != fArr && (fArr2 == null || fArr == null || !Arrays.equals(fArr2, fArr))) {
            this.A04 = fArr;
            Rect bounds = getBounds();
            C7384Etj.A0U(bounds);
            A01(bounds);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.A02;
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated(message = "Deprecated in Java")
    public final int getOpacity() {
        return -3;
    }

    private final void A00(Canvas canvas, RuntimeShader runtimeShader, C5219Ddb c5219Ddb) {
        A02(runtimeShader, c5219Ddb);
        Paint paint = this.A0A;
        paint.setShader(runtimeShader);
        try {
            canvas.drawRect(0.0f, 0.0f, getBounds().width(), getBounds().height(), paint);
        } finally {
            paint.setShader(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
