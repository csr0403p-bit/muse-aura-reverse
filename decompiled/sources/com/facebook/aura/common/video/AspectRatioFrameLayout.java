package com.facebook.aura.common.video;

import X.C06H;
import X.C7384Etj;
import X.Fc8;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes6.dex */
public final class AspectRatioFrameLayout extends FrameLayout {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final float MAX_ASPECT_RATIO_DEFORMATION_FRACTION = 0.01f;
    public static final int RESIZE_MODE_FILL = 3;
    public static final int RESIZE_MODE_FIT = 0;
    public static final int RESIZE_MODE_FIXED_HEIGHT = 2;
    public static final int RESIZE_MODE_FIXED_WIDTH = 1;
    public static final int RESIZE_MODE_ZOOM = 4;
    public AspectRatioListener aspectRatioListener;
    public final AspectRatioUpdateDispatcher aspectRatioUpdateDispatcher;
    public int resizeMode;
    public float videoAspectRatio;

    public interface AspectRatioListener {
        void onAspectRatioUpdated(float f, float f2, boolean z);
    }

    public final class AspectRatioUpdateDispatcher implements Runnable {
        public boolean aspectRatioMismatch;
        public boolean isScheduled;
        public float naturalAspectRatio;
        public float targetAspectRatio;

        @Override // java.lang.Runnable
        public void run() {
            this.isScheduled = false;
            AspectRatioListener aspectRatioListener = AspectRatioFrameLayout.this.aspectRatioListener;
            if (aspectRatioListener != null) {
                aspectRatioListener.onAspectRatioUpdated(this.targetAspectRatio, this.naturalAspectRatio, this.aspectRatioMismatch);
            }
        }

        public AspectRatioUpdateDispatcher() {
        }

        public final void scheduleUpdate(float f, float f2, boolean z) {
            this.targetAspectRatio = f;
            this.naturalAspectRatio = f2;
            this.aspectRatioMismatch = z;
            if (this.isScheduled) {
                return;
            }
            this.isScheduled = true;
            AspectRatioFrameLayout.this.post(this);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AspectRatioFrameLayout(Context context) {
        this(context, null);
        C7384Etj.A0Y(context, 0);
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public static /* synthetic */ void getResizeMode$annotations() {
    }

    public final int getResizeMode() {
        return this.resizeMode;
    }

    public final void setAspectRatio(float f) {
        if (this.videoAspectRatio != f) {
            this.videoAspectRatio = f;
            requestLayout();
        }
    }

    public final void setAspectRatioListener(AspectRatioListener aspectRatioListener) {
        this.aspectRatioListener = aspectRatioListener;
    }

    public final void setResizeMode(int i) {
        if (this.resizeMode != i) {
            this.resizeMode = i;
            requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005e A[PHI: r3
  0x005e: PHI (r3v2 float) = (r3v0 float), (r3v0 float), (r3v5 float) binds: [B:33:0x0078, B:20:0x004d, B:27:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a A[PHI: r3
  0x007a: PHI (r3v1 float) = (r3v0 float), (r3v0 float), (r3v4 float) binds: [B:33:0x0078, B:18:0x004a, B:31:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r12, int r13) {
        /*
            r11 = this;
            super.onMeasure(r12, r13)
            float r0 = r11.videoAspectRatio
            r10 = 0
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 <= 0) goto L3b
            int r0 = android.view.View.MeasureSpec.getMode(r12)
            if (r0 != 0) goto L41
            int r6 = android.view.View.MeasureSpec.getSize(r12)
        L14:
            int r0 = android.view.View.MeasureSpec.getMode(r13)
            if (r0 != 0) goto L3c
            int r5 = android.view.View.MeasureSpec.getSize(r13)
        L1e:
            float r8 = (float) r6
            float r7 = (float) r5
            float r4 = r8 / r7
            float r3 = r11.videoAspectRatio
            float r9 = r3 / r4
            r2 = 1
            r0 = 1065353216(0x3f800000, float:1.0)
            float r9 = r9 - r0
            float r1 = java.lang.Math.abs(r9)
            r0 = 1008981770(0x3c23d70a, float:0.01)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L46
            com.facebook.aura.common.video.AspectRatioFrameLayout$AspectRatioUpdateDispatcher r1 = r11.aspectRatioUpdateDispatcher
            r0 = 0
            r1.scheduleUpdate(r3, r4, r0)
        L3b:
            return
        L3c:
            int r5 = r11.getMeasuredHeight()
            goto L1e
        L41:
            int r6 = r11.getMeasuredWidth()
            goto L14
        L46:
            int r1 = r11.resizeMode
            if (r1 == 0) goto L76
            if (r1 == r2) goto L7a
            r0 = 2
            if (r1 == r0) goto L5e
            r0 = 4
            if (r1 != r0) goto L60
            int r0 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r0 <= 0) goto L73
            int r0 = android.view.View.MeasureSpec.getMode(r13)
            if (r0 == 0) goto L73
            float r3 = r11.videoAspectRatio
        L5e:
            float r7 = r7 * r3
            int r6 = (int) r7
        L60:
            com.facebook.aura.common.video.AspectRatioFrameLayout$AspectRatioUpdateDispatcher r0 = r11.aspectRatioUpdateDispatcher
            r0.scheduleUpdate(r3, r4, r2)
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r0)
            super.onMeasure(r1, r0)
            return
        L73:
            float r3 = r11.videoAspectRatio
            goto L7a
        L76:
            int r0 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r0 <= 0) goto L5e
        L7a:
            float r8 = r8 / r3
            int r5 = (int) r8
            goto L60
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.common.video.AspectRatioFrameLayout.onMeasure(int, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C7384Etj.A0Y(context, 0);
        this.aspectRatioUpdateDispatcher = new AspectRatioUpdateDispatcher();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, Fc8.A00, 0, 0);
            C7384Etj.A0U(typedArrayObtainStyledAttributes);
            try {
                this.resizeMode = typedArrayObtainStyledAttributes.getInt(0, 0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
    }

    public /* synthetic */ AspectRatioFrameLayout(Context context, AttributeSet attributeSet, int i, C06H c06h) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
