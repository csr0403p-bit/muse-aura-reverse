package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Choreographer;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.FiK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8659FiK extends Drawable implements Animatable, Drawable.Callback {
    public int A00;
    public Bitmap A01;
    public Canvas A02;
    public Matrix A03;
    public Matrix A04;
    public Paint A05;
    public Rect A06;
    public Rect A07;
    public Rect A08;
    public RectF A09;
    public RectF A0A;
    public RectF A0B;
    public C6837Eap A0C;
    public B3A A0D;
    public C8668FiU A0E;
    public HxK A0F;
    public C8670FiW A0G;
    public Integer A0H;
    public Map<String, Typeface> A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public final Matrix A0Q;
    public final ChoreographerFrameCallbackC8658FiI A0R;
    public final Runnable A0S;
    public final ArrayList<FiT> A0T;
    public final Semaphore A0U;
    public final ValueAnimator.AnimatorUpdateListener A0V;
    public static final List<String> A0X = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
    public static final Executor A0W = new ThreadPoolExecutor(0, 2, 35, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new CVK());

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(android.graphics.Canvas r9, X.C8659FiK r10, X.C8670FiW r11) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8659FiK.A00(android.graphics.Canvas, X.FiK, X.FiW):void");
    }

    public static void A01(C8659FiK c8659FiK) {
        C6837Eap c6837Eap = c8659FiK.A0C;
        if (c6837Eap != null) {
            C6823Eab c6823Eab = AbstractC8749Fjo.A00;
            Rect rect = c6837Eap.A05;
            List list = Collections.EMPTY_LIST;
            Integer num = C79.A00;
            C8670FiW c8670FiW = new C8670FiW(c6837Eap, c8659FiK, new C8675Fib(c6837Eap, null, null, null, new C8728FjT(), null, null, num, num, num, "__container", null, list, list, list, 0.0f, 0.0f, rect.width(), rect.height(), 0, 0, 0, -1L, -1L, false), c6837Eap.A08);
            c8659FiK.A0G = c8670FiW;
            if (c8659FiK.A0O) {
                c8670FiW.A09(true);
            }
            c8659FiK.A0G.A00 = c8659FiK.A0J;
        }
    }

    public static void A02(C8659FiK c8659FiK) {
        C6837Eap c6837Eap = c8659FiK.A0C;
        if (c6837Eap != null) {
            B3A b3a = c8659FiK.A0D;
            int i = c6837Eap.A04;
            int iOrdinal = b3a.ordinal();
            c8659FiK.A0P = iOrdinal != 1 && (iOrdinal == 2 || i > 4);
        }
    }

    public static final void A03(C8659FiK c8659FiK) {
        Integer num;
        if (c8659FiK.A0G == null) {
            c8659FiK.A0T.add(new I0Z(c8659FiK, 1));
            return;
        }
        A02(c8659FiK);
        if (c8659FiK.isVisible()) {
            ChoreographerFrameCallbackC8658FiI choreographerFrameCallbackC8658FiI = c8659FiK.A0R;
            choreographerFrameCallbackC8658FiI.A08 = true;
            boolean zA1R = C8j3.A1R((choreographerFrameCallbackC8658FiI.A04 > 0.0f ? 1 : (choreographerFrameCallbackC8658FiI.A04 == 0.0f ? 0 : -1)));
            Iterator<Animator.AnimatorListener> it = choreographerFrameCallbackC8658FiI.A0A.iterator();
            while (it.hasNext()) {
                it.next().onAnimationStart(choreographerFrameCallbackC8658FiI, zA1R);
            }
            choreographerFrameCallbackC8658FiI.A05((int) (choreographerFrameCallbackC8658FiI.A04 < 0.0f ? choreographerFrameCallbackC8658FiI.A02() : choreographerFrameCallbackC8658FiI.A03()));
            choreographerFrameCallbackC8658FiI.A06 = 0L;
            choreographerFrameCallbackC8658FiI.A05 = 0;
            ChoreographerFrameCallbackC8658FiI.A00(choreographerFrameCallbackC8658FiI);
            num = C79.A00;
        } else {
            num = C79.A01;
        }
        c8659FiK.A0H = num;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[LOOP:0: B:15:0x0043->B:17:0x0049, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(X.C8659FiK r3) {
        /*
            X.FiW r0 = r3.A0G
            if (r0 != 0) goto L10
            java.util.ArrayList<X.FiT> r2 = r3.A0T
            r1 = 0
            X.I0Z r0 = new X.I0Z
            r0.<init>(r3, r1)
            r2.add(r0)
            return
        L10:
            A02(r3)
            boolean r0 = r3.isVisible()
            if (r0 == 0) goto L63
            X.FiI r2 = r3.A0R
            r0 = 1
            r2.A08 = r0
            X.ChoreographerFrameCallbackC8658FiI.A00(r2)
            r0 = 0
            r2.A06 = r0
            float r1 = r2.A04
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            float r1 = r2.A00
            if (r0 >= 0) goto L53
            float r0 = r2.A03()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L3d
            float r0 = r2.A02()
        L3a:
            r2.A05(r0)
        L3d:
            java.util.Set<android.animation.Animator$AnimatorPauseListener> r0 = r2.A0B
            java.util.Iterator r1 = r0.iterator()
        L43:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L60
            java.lang.Object r0 = r1.next()
            android.animation.Animator$AnimatorPauseListener r0 = (android.animation.Animator.AnimatorPauseListener) r0
            r0.onAnimationResume(r2)
            goto L43
        L53:
            float r0 = r2.A02()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L3d
            float r0 = r2.A03()
            goto L3a
        L60:
            java.lang.Integer r0 = X.C79.A00
            goto L65
        L63:
            java.lang.Integer r0 = X.C79.A0C
        L65:
            r3.A0H = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8659FiK.A04(X.FiK):void");
    }

    public final void A05(final float f) {
        C6837Eap c6837Eap = this.A0C;
        if (c6837Eap == null) {
            this.A0T.add(new FiT() { // from class: X.FiS
                @Override // X.FiT
                public final void Abt() {
                    this.A01.A05(f);
                }
            });
            return;
        }
        ChoreographerFrameCallbackC8658FiI choreographerFrameCallbackC8658FiI = this.A0R;
        float f2 = c6837Eap.A03;
        float f3 = c6837Eap.A00;
        PointF pointF = AbstractC8699Fiz.A00;
        choreographerFrameCallbackC8658FiI.A05(AbstractC7607F5u.A01(f3, f2, f));
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/FiV;TT;LX/Fii<TT;>;)V */
    public final void A06(final C8669FiV c8669FiV, final C8682Fii c8682Fii, final Object obj) {
        C8670FiW c8670FiW = this.A0G;
        if (c8670FiW == null) {
            this.A0T.add(new FiT() { // from class: X.FiR
                @Override // X.FiT
                public final void Abt() {
                    this.A00.A06(c8669FiV, c8682Fii, obj);
                }
            });
            return;
        }
        if (c8669FiV == C8669FiV.A02) {
            c8670FiW.A41(c8682Fii, obj);
        } else {
            InterfaceC8663FiO interfaceC8663FiO = c8669FiV.A00;
            if (interfaceC8663FiO != null) {
                interfaceC8663FiO.A41(c8682Fii, obj);
            } else {
                ArrayList arrayListA0h = C3cG.A0h();
                c8670FiW.AbZ(c8669FiV, new C8669FiV(new String[0]), arrayListA0h, 0);
                for (int i = 0; i < arrayListA0h.size(); i++) {
                    ((C8669FiV) arrayListA0h.get(i)).A00.A41(c8682Fii, obj);
                }
                if (!(!arrayListA0h.isEmpty())) {
                    return;
                }
            }
        }
        invalidateSelf();
        if (obj == InterfaceC8702Fj2.A0S) {
            A05(this.A0R.A01());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C8670FiW c8670FiW = this.A0G;
        if (c8670FiW != null) {
            try {
                if (this.A0P) {
                    A00(canvas, this, c8670FiW);
                } else {
                    if (this.A0C != null) {
                        Matrix matrix = this.A0Q;
                        matrix.reset();
                        if (!getBounds().isEmpty()) {
                            matrix.preScale(r5.width() / r6.A05.width(), r5.height() / r6.A05.height());
                            matrix.preTranslate(r5.left, r5.top);
                        }
                        c8670FiW.A9E(canvas, matrix, this.A00);
                    }
                }
                this.A0M = false;
            } catch (InterruptedException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        C6837Eap c6837Eap = this.A0C;
        if (c6837Eap == null) {
            return -1;
        }
        return c6837Eap.A05.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        C6837Eap c6837Eap = this.A0C;
        if (c6837Eap == null) {
            return -1;
        }
        return c6837Eap.A05.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.A0M) {
            return;
        }
        this.A0M = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ChoreographerFrameCallbackC8658FiI choreographerFrameCallbackC8658FiI = this.A0R;
        if (choreographerFrameCallbackC8658FiI == null) {
            return false;
        }
        return choreographerFrameCallbackC8658FiI.A08;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A00 = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        BXP.A00("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.A0T.clear();
        ChoreographerFrameCallbackC8658FiI choreographerFrameCallbackC8658FiI = this.A0R;
        Choreographer.getInstance().removeFrameCallback(choreographerFrameCallbackC8658FiI);
        choreographerFrameCallbackC8658FiI.A08 = false;
        choreographerFrameCallbackC8658FiI.A06(choreographerFrameCallbackC8658FiI.A04 < 0.0f);
        if (isVisible()) {
            return;
        }
        this.A0H = C79.A00;
    }

    public C8659FiK() {
        ChoreographerFrameCallbackC8658FiI choreographerFrameCallbackC8658FiI = new ChoreographerFrameCallbackC8658FiI();
        this.A0R = choreographerFrameCallbackC8658FiI;
        this.A0H = C79.A00;
        this.A0T = C3cG.A0h();
        this.A0N = false;
        this.A0J = true;
        this.A00 = 255;
        this.A0D = B3A.AUTOMATIC;
        this.A0P = false;
        this.A0Q = BV4.A08();
        this.A0M = false;
        C8919Ftb c8919Ftb = new C8919Ftb(this, 1);
        this.A0V = c8919Ftb;
        this.A0U = new Semaphore(1);
        this.A0S = new Runnable() { // from class: X.FiN
            public static final String __redex_internal_original_name = "LottieDrawable$$ExternalSyntheticLambda6";

            @Override // java.lang.Runnable
            public final void run() {
                C8659FiK c8659FiK = this.A00;
                C8670FiW c8670FiW = c8659FiK.A0G;
                if (c8670FiW != null) {
                    try {
                        c8659FiK.A0U.acquire();
                        c8670FiW.A06(c8659FiK.A0R.A01());
                    } catch (InterruptedException unused) {
                    } catch (Throwable th) {
                        c8659FiK.A0U.release();
                        throw th;
                    }
                    c8659FiK.A0U.release();
                }
            }
        };
        choreographerFrameCallbackC8658FiI.addUpdateListener(c8919Ftb);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Integer num;
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        if (!z) {
            ChoreographerFrameCallbackC8658FiI choreographerFrameCallbackC8658FiI = this.A0R;
            if (choreographerFrameCallbackC8658FiI.A08) {
                this.A0T.clear();
                Choreographer.getInstance().removeFrameCallback(choreographerFrameCallbackC8658FiI);
                choreographerFrameCallbackC8658FiI.A08 = false;
                Iterator<Animator.AnimatorPauseListener> it = choreographerFrameCallbackC8658FiI.A0B.iterator();
                while (it.hasNext()) {
                    it.next().onAnimationPause(choreographerFrameCallbackC8658FiI);
                }
                if (!isVisible()) {
                    this.A0H = C79.A00;
                }
                num = C79.A0C;
            } else if (zIsVisible) {
                num = C79.A00;
            }
            this.A0H = num;
            return visible;
        }
        Integer num2 = this.A0H;
        if (num2 == C79.A01) {
            A03(this);
        } else if (num2 == C79.A0C) {
            A04(this);
            return visible;
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        A03(this);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
