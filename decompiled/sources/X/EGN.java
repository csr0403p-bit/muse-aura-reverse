package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RenderNode;
import android.graphics.RuntimeShader;

/* loaded from: classes5.dex */
public final class EGN {
    public Bitmap A00;
    public BitmapShader A01;
    public RenderNode A02;
    public RuntimeShader A03;
    public final Paint A05;
    public final Matrix A04 = BV4.A08();
    public final Paint A06 = new Paint();

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(android.graphics.Bitmap r13, android.graphics.Canvas r14, android.graphics.RenderEffect r15, X.C5220Ddc r16, int r17, int r18) {
        /*
            r12 = this;
            r8 = 0
            r9 = 0
            if (r15 != 0) goto La
            android.graphics.Paint r0 = r12.A05
            r14.drawBitmap(r13, r9, r9, r0)
            return
        La:
            r0 = r16
            int r7 = r0.A01
            float r2 = (float) r7
            int r3 = r0.A03
            float r4 = (float) r3
            int r6 = r17 + r7
            int r1 = r0.A02
            int r6 = r6 + r1
            int r5 = r18 + r3
            int r0 = r0.A00
            int r5 = r5 + r0
            if (r7 != 0) goto L25
            if (r3 != 0) goto L25
            if (r1 != 0) goto L25
            r7 = 1
            if (r0 == 0) goto L26
        L25:
            r7 = 0
        L26:
            android.graphics.RenderNode r3 = r12.A02
            if (r3 != 0) goto L33
            java.lang.String r0 = "bk_shader_effect_host"
            android.graphics.RenderNode r3 = new android.graphics.RenderNode
            r3.<init>(r0)
            r12.A02 = r3
        L33:
            r3.setPosition(r8, r8, r6, r5)
            r3.setRenderEffect(r15)
            android.graphics.RecordingCanvas r8 = r3.beginRecording()
            X.C7384Etj.A0U(r8)
            if (r7 != 0) goto L74
            android.graphics.BitmapShader r1 = r12.A01     // Catch: java.lang.Throwable -> L97
            if (r1 == 0) goto L58
            android.graphics.Bitmap r0 = r12.A00     // Catch: java.lang.Throwable -> L97
            if (r13 != r0) goto L58
        L4a:
            android.graphics.Matrix r0 = r12.A04     // Catch: java.lang.Throwable -> L97
            r0.setTranslate(r2, r4)     // Catch: java.lang.Throwable -> L97
            r1.setLocalMatrix(r0)     // Catch: java.lang.Throwable -> L97
            android.graphics.Paint r13 = r12.A06     // Catch: java.lang.Throwable -> L97
            r13.setShader(r1)     // Catch: java.lang.Throwable -> L97
            goto L64
        L58:
            android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.CLAMP     // Catch: java.lang.Throwable -> L97
            android.graphics.BitmapShader r1 = new android.graphics.BitmapShader     // Catch: java.lang.Throwable -> L97
            r1.<init>(r13, r0, r0)     // Catch: java.lang.Throwable -> L97
            r12.A00 = r13     // Catch: java.lang.Throwable -> L97
            r12.A01 = r1     // Catch: java.lang.Throwable -> L97
            goto L4a
        L64:
            float r11 = (float) r6     // Catch: java.lang.Throwable -> L97
            float r12 = (float) r5     // Catch: java.lang.Throwable -> L97
            r1 = 0
            r10 = r9
            r8.drawRect(r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L6f
            r13.setShader(r1)     // Catch: java.lang.Throwable -> L97
            goto L79
        L6f:
            r0 = move-exception
            r13.setShader(r1)     // Catch: java.lang.Throwable -> L97
            throw r0     // Catch: java.lang.Throwable -> L97
        L74:
            android.graphics.Paint r0 = r12.A05     // Catch: java.lang.Throwable -> L97
            r8.drawBitmap(r13, r9, r9, r0)     // Catch: java.lang.Throwable -> L97
        L79:
            r3.endRecording()
            if (r7 != 0) goto L93
            float r2 = -r2
            float r0 = -r4
            int r1 = r14.save()
            r14.translate(r2, r0)
            r14.drawRenderNode(r3)     // Catch: java.lang.Throwable -> L8e
            r14.restoreToCount(r1)
            return
        L8e:
            r0 = move-exception
            r14.restoreToCount(r1)
            throw r0
        L93:
            r14.drawRenderNode(r3)
            return
        L97:
            r0 = move-exception
            r3.endRecording()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EGN.A01(android.graphics.Bitmap, android.graphics.Canvas, android.graphics.RenderEffect, X.Ddc, int, int):void");
    }

    public final void A00() {
        RenderNode renderNode = this.A02;
        if (renderNode != null) {
            renderNode.discardDisplayList();
        }
        this.A02 = null;
        this.A00 = null;
        this.A01 = null;
        this.A03 = null;
    }

    /* JADX WARN: Incorrect types in method signature: (Landroid/graphics/Canvas;Landroid/graphics/RenderEffect;IILX/Ddc;LX/G0U<-Landroid/graphics/Canvas;Lkotlin/Unit;>;)V */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(android.graphics.Canvas r16, android.graphics.RenderEffect r17, X.C5220Ddc r18, X.G0U r19, int r20, int r21) {
        /*
            r15 = this;
            r10 = r17
            r9 = 0
            r0 = 5
            r8 = r19
            X.C7384Etj.A0Y(r8, r0)
            r0 = r18
            int r3 = r0.A01
            float r7 = (float) r3
            int r2 = r0.A03
            float r6 = (float) r2
            r13 = r20
            int r5 = r3 + r20
            int r1 = r0.A02
            int r5 = r5 + r1
            r12 = r21
            int r4 = r2 + r21
            int r0 = r0.A00
            int r4 = r4 + r0
            if (r3 != 0) goto L28
            if (r2 != 0) goto L28
            if (r1 != 0) goto L28
            r14 = 1
            if (r0 == 0) goto L5a
        L28:
            r14 = 0
            android.graphics.RuntimeShader r3 = r15.A03
            if (r3 != 0) goto L37
            java.lang.String r0 = "uniform shader inputImage;\nuniform float2 bkClampMin;\nuniform float2 bkClampMax;\nhalf4 main(float2 coord) {\n  return inputImage.eval(clamp(coord, bkClampMin, bkClampMax));\n}\n"
            android.graphics.RuntimeShader r3 = new android.graphics.RuntimeShader
            r3.<init>(r0)
            r15.A03 = r3
        L37:
            r11 = 1056964608(0x3f000000, float:0.5)
            float r2 = r7 + r11
            float r1 = r6 + r11
            java.lang.String r0 = "bkClampMin"
            r3.setFloatUniform(r0, r2, r1)
            float r2 = (float) r13
            float r2 = r2 + r7
            float r2 = r2 - r11
            float r1 = (float) r12
            float r1 = r1 + r6
            float r1 = r1 - r11
            java.lang.String r0 = "bkClampMax"
            r3.setFloatUniform(r0, r2, r1)
            java.lang.String r0 = "inputImage"
            android.graphics.RenderEffect r0 = android.graphics.RenderEffect.createRuntimeShaderEffect(r3, r0)
            X.C7384Etj.A0U(r0)
            android.graphics.RenderEffect r10 = android.graphics.RenderEffect.createChainEffect(r10, r0)
        L5a:
            X.C7384Etj.A0X(r10)
            android.graphics.RenderNode r3 = r15.A02
            if (r3 != 0) goto L6a
            java.lang.String r0 = "bk_shader_effect_host"
            android.graphics.RenderNode r3 = new android.graphics.RenderNode
            r3.<init>(r0)
            r15.A02 = r3
        L6a:
            r3.setPosition(r9, r9, r5, r4)
            r3.setRenderEffect(r10)
            android.graphics.RecordingCanvas r1 = r3.beginRecording()
            X.C7384Etj.A0U(r1)
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1.drawColor(r0)     // Catch: java.lang.Throwable -> La4
            if (r14 != 0) goto L81
            r1.translate(r7, r6)     // Catch: java.lang.Throwable -> La4
        L81:
            r8.invoke(r1)     // Catch: java.lang.Throwable -> La4
            r3.endRecording()
            r4 = r16
            if (r14 != 0) goto La0
            float r2 = -r7
            float r0 = -r6
            int r1 = r4.save()
            r4.translate(r2, r0)
            r4.drawRenderNode(r3)     // Catch: java.lang.Throwable -> L9b
            r4.restoreToCount(r1)
            return
        L9b:
            r0 = move-exception
            r4.restoreToCount(r1)
            throw r0
        La0:
            r4.drawRenderNode(r3)
            return
        La4:
            r0 = move-exception
            r3.endRecording()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EGN.A02(android.graphics.Canvas, android.graphics.RenderEffect, X.Ddc, X.G0U, int, int):void");
    }

    public EGN() {
        Paint paint = new Paint();
        paint.setFilterBitmap(true);
        this.A05 = paint;
    }
}
