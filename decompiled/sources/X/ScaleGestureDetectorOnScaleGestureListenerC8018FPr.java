package X;

import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import com.facebook.aura.R;
import java.util.Map;

/* renamed from: X.FPr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ScaleGestureDetectorOnScaleGestureListenerC8018FPr extends GestureDetector.SimpleOnGestureListener implements ScaleGestureDetector.OnScaleGestureListener {
    public float A00;
    public float A01;
    public float A02;
    public PointF A03;
    public View A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public final int A0D;
    public final FBB A0E;
    public final FDW A0F;
    public final FDW A0G;
    public final boolean A0H;
    public final Map<Integer, HsM> A0I = new DQd(2);

    public static C9115Fyg A01(ScaleGestureDetectorOnScaleGestureListenerC8018FPr scaleGestureDetectorOnScaleGestureListenerC8018FPr) {
        C9115Fyg c9115Fyg = new C9115Fyg();
        c9115Fyg.A06(scaleGestureDetectorOnScaleGestureListenerC8018FPr.A0F, 0);
        return c9115Fyg;
    }

    public static Float A05(ScaleGestureDetectorOnScaleGestureListenerC8018FPr scaleGestureDetectorOnScaleGestureListenerC8018FPr, float f, float f2) {
        C7384Etj.A0X(scaleGestureDetectorOnScaleGestureListenerC8018FPr.A04);
        return Float.valueOf((f * f2) / r0.getHeight());
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        boolean z;
        C7384Etj.A0Y(motionEvent, 0);
        this.A08 = false;
        if (this.A04 == null) {
            return false;
        }
        HsM hsMA08 = A08(36);
        HsM hsMA082 = A08(45);
        HsM hsMA083 = A08(65);
        PointF pointFA00 = A00(motionEvent, this);
        if (hsMA08 != null) {
            F9J.A03(this.A0E, this.A0G, A01(this), hsMA08, 1);
            z = true;
        } else {
            z = false;
        }
        if (hsMA082 != null) {
            FDW fdw = this.A0G;
            C9115Fyg c9115FygA01 = A01(this);
            FBB fbb = this.A0E;
            c9115FygA01.A06(fbb, 1);
            c9115FygA01.A06(A04(this, pointFA00.x), 2);
            c9115FygA01.A06(A05(this, 100.0f, pointFA00.y), 3);
            F9J.A02(fbb, fdw, c9115FygA01, hsMA082);
            z = true;
        }
        if (hsMA083 == null) {
            return z;
        }
        FDW fdw2 = this.A0G;
        C9115Fyg c9115FygA012 = A01(this);
        FBB fbb2 = this.A0E;
        c9115FygA012.A06(fbb2, 1);
        c9115FygA012.A06(fdw2, 2);
        c9115FygA012.A06(Float.valueOf(pointFA00.x), 3);
        c9115FygA012.A06(Float.valueOf(pointFA00.y), 4);
        F9J.A02(fbb2, fdw2, c9115FygA012, hsMA083);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        boolean z = false;
        C7384Etj.A0Y(motionEvent, 0);
        if (this.A04 != null) {
            this.A0B = motionEvent.getX();
            this.A0C = motionEvent.getY();
            this.A0A = 0.0f;
            HsM hsMA08 = A08(49);
            z = true;
            if (hsMA08 != null) {
                PointF pointFA00 = A00(motionEvent, this);
                FDW fdw = this.A0G;
                C9115Fyg c9115FygA01 = A01(this);
                FBB fbb = this.A0E;
                c9115FygA01.A06(fbb, 1);
                c9115FygA01.A06(A04(this, pointFA00.x), 2);
                c9115FygA01.A06(A05(this, 100.0f, pointFA00.y), 3);
                F9J.A02(fbb, fdw, c9115FygA01, hsMA08);
            }
        }
        return z;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int i;
        C7384Etj.A0Y(motionEvent2, 1);
        if (motionEvent != null) {
            float x = motionEvent2.getX() - motionEvent.getX();
            float y = motionEvent2.getY() - motionEvent.getY();
            if (Math.abs(y) > Math.abs(x)) {
                i = 42;
                if (y > 0.0f) {
                    i = 38;
                }
            } else {
                i = 40;
                if (x > 0.0f) {
                    i = 41;
                }
            }
            HsM hsMA08 = A08(i);
            if (hsMA08 != null) {
                this.A08 = false;
                F9J.A03(this.A0E, this.A0G, A01(this), hsMA08, 1);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        C7384Etj.A0Y(motionEvent, 0);
        this.A08 = false;
        this.A05 = true;
        HsM hsMA08 = A08(35);
        HsM hsMA082 = A08(61);
        if (hsMA08 != null) {
            F9J.A03(this.A0E, this.A0G, A01(this), hsMA08, 1);
        }
        if (this.A04 == null || hsMA082 == null) {
            return;
        }
        FDW fdw = this.A0G;
        C9115Fyg c9115FygA01 = A01(this);
        FBB fbb = this.A0E;
        c9115FygA01.A06(fbb, 1);
        c9115FygA01.A06(fdw, 2);
        c9115FygA01.A06(A03(motionEvent, this, c9115FygA01, A02(motionEvent, this, c9115FygA01, "detected", 3), 4), 5);
        F9J.A02(fbb, fdw, c9115FygA01, hsMA082);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        HsM hsMA08;
        C7384Etj.A0Y(scaleGestureDetector, 0);
        if (this.A03 == null || this.A04 == null || (hsMA08 = A08(44)) == null) {
            return false;
        }
        FDW fdw = this.A0G;
        C9115Fyg c9115FygA01 = A01(this);
        FBB fbb = this.A0E;
        c9115FygA01.A06(fbb, 1);
        c9115FygA01.A06(Float.valueOf(scaleGestureDetector.getScaleFactor()), 2);
        PointF pointF = this.A03;
        C7384Etj.A0X(pointF);
        c9115FygA01.A06(A04(this, pointF.x), 3);
        PointF pointF2 = this.A03;
        C7384Etj.A0X(pointF2);
        c9115FygA01.A06(A05(this, 100.0f, pointF2.y), 4);
        F9J.A02(fbb, fdw, c9115FygA01, hsMA08);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        C7384Etj.A0Y(scaleGestureDetector, 0);
        this.A08 = false;
        float focusX = scaleGestureDetector.getFocusX();
        float focusY = scaleGestureDetector.getFocusY();
        if (this.A04 == null) {
            return true;
        }
        PointF pointF = new PointF(focusX, focusY);
        View view = this.A04;
        C7384Etj.A0X(view);
        this.A03 = HlH.A00(pointF, view);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.A03 = null;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C7384Etj.A0Y(motionEvent2, 1);
        boolean zA1X = false;
        if (this.A04 != null) {
            float x = motionEvent2.getX() - this.A0B;
            float y = motionEvent2.getY() - this.A0C;
            float f3 = (x * x) + (y * y);
            if (f3 > this.A0A) {
                this.A0A = f3;
            }
            this.A06 = true;
            this.A09 = true;
            HsM hsMA08 = A08(48);
            if (hsMA08 != null) {
                FDW fdw = this.A0G;
                C9115Fyg c9115FygA01 = A01(this);
                FBB fbb = this.A0E;
                c9115FygA01.A06(fbb, 1);
                c9115FygA01.A06(A04(this, f), 2);
                Object objA03 = F6D.A03(fbb, fdw, C9115Fyg.A03(c9115FygA01, A05(this, f2, 100.0f), 3), hsMA08);
                if (objA03 instanceof Boolean) {
                    zA1X = AnonymousClass001.A1X(objA03);
                    if (zA1X) {
                        this.A07 = true;
                        return zA1X;
                    }
                } else {
                    FFI.A01(null, "onScroll return value should return boolean (true if handled)", null);
                }
            }
        }
        return zA1X;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C7384Etj.A0Y(motionEvent, 0);
        return A07(this) && A06(motionEvent, this);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        C7384Etj.A0Y(motionEvent, 0);
        return !A07(this) && A06(motionEvent, this);
    }

    public static Float A04(ScaleGestureDetectorOnScaleGestureListenerC8018FPr scaleGestureDetectorOnScaleGestureListenerC8018FPr, float f) {
        C7384Etj.A0X(scaleGestureDetectorOnScaleGestureListenerC8018FPr.A04);
        return Float.valueOf((f * 100.0f) / r0.getWidth());
    }

    public static final boolean A06(MotionEvent motionEvent, ScaleGestureDetectorOnScaleGestureListenerC8018FPr scaleGestureDetectorOnScaleGestureListenerC8018FPr) {
        boolean z = false;
        if (scaleGestureDetectorOnScaleGestureListenerC8018FPr.A04 != null) {
            scaleGestureDetectorOnScaleGestureListenerC8018FPr.A08 = false;
            HsM hsMA08 = scaleGestureDetectorOnScaleGestureListenerC8018FPr.A08(43);
            HsM hsMA082 = scaleGestureDetectorOnScaleGestureListenerC8018FPr.A08(54);
            HsM hsMA083 = scaleGestureDetectorOnScaleGestureListenerC8018FPr.A08(62);
            if (hsMA08 != null) {
                F9J.A03(scaleGestureDetectorOnScaleGestureListenerC8018FPr.A0E, scaleGestureDetectorOnScaleGestureListenerC8018FPr.A0G, A01(scaleGestureDetectorOnScaleGestureListenerC8018FPr), hsMA08, 1);
                z = true;
            } else {
                z = false;
            }
            if (hsMA082 != null) {
                FDW fdw = scaleGestureDetectorOnScaleGestureListenerC8018FPr.A0G;
                C9115Fyg c9115FygA01 = A01(scaleGestureDetectorOnScaleGestureListenerC8018FPr);
                FBB fbb = scaleGestureDetectorOnScaleGestureListenerC8018FPr.A0E;
                c9115FygA01.A06(A03(motionEvent, scaleGestureDetectorOnScaleGestureListenerC8018FPr, c9115FygA01, A02(motionEvent, scaleGestureDetectorOnScaleGestureListenerC8018FPr, c9115FygA01, fbb, 1), 2), 3);
                F9J.A02(fbb, fdw, c9115FygA01, hsMA082);
                z = true;
            }
            if (hsMA083 != null) {
                FDW fdw2 = scaleGestureDetectorOnScaleGestureListenerC8018FPr.A0G;
                C9115Fyg c9115FygA012 = A01(scaleGestureDetectorOnScaleGestureListenerC8018FPr);
                FBB fbb2 = scaleGestureDetectorOnScaleGestureListenerC8018FPr.A0E;
                c9115FygA012.A06(fbb2, 1);
                c9115FygA012.A06(A03(motionEvent, scaleGestureDetectorOnScaleGestureListenerC8018FPr, c9115FygA012, A02(motionEvent, scaleGestureDetectorOnScaleGestureListenerC8018FPr, c9115FygA012, fdw2, 2), 3), 4);
                F9J.A02(fbb2, fdw2, c9115FygA012, hsMA083);
                return true;
            }
        }
        return z;
    }

    public static final boolean A07(ScaleGestureDetectorOnScaleGestureListenerC8018FPr scaleGestureDetectorOnScaleGestureListenerC8018FPr) {
        return (scaleGestureDetectorOnScaleGestureListenerC8018FPr.A08(36) == null && scaleGestureDetectorOnScaleGestureListenerC8018FPr.A08(45) == null && scaleGestureDetectorOnScaleGestureListenerC8018FPr.A08(65) == null) ? false : true;
    }

    public final HsM A08(int i) {
        Map<Integer, HsM> map = this.A0I;
        Integer numValueOf = Integer.valueOf(i);
        if (map.containsKey(numValueOf)) {
            return map.get(numValueOf);
        }
        HsM hsMA0D = this.A0G.A0D(i);
        map.put(numValueOf, hsMA0D);
        return hsMA0D;
    }

    public ScaleGestureDetectorOnScaleGestureListenerC8018FPr(FBB fbb, FDW fdw, FDW fdw2) {
        this.A0E = fbb;
        this.A0G = fdw;
        this.A0F = fdw2;
        Object objA01 = FBB.A01(fbb, R.id.bk_context_key_native_tap_slop_recovery);
        this.A0H = AnonymousClass002.A1b(objA01 instanceof Boolean ? objA01 : null, true);
        int scaledTouchSlop = ViewConfiguration.get(fbb.A00).getScaledTouchSlop();
        this.A0D = scaledTouchSlop * scaledTouchSlop;
    }

    public static PointF A00(MotionEvent motionEvent, ScaleGestureDetectorOnScaleGestureListenerC8018FPr scaleGestureDetectorOnScaleGestureListenerC8018FPr) {
        PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
        View view = scaleGestureDetectorOnScaleGestureListenerC8018FPr.A04;
        C7384Etj.A0X(view);
        return HlH.A00(pointF, view);
    }

    public static Float A02(MotionEvent motionEvent, ScaleGestureDetectorOnScaleGestureListenerC8018FPr scaleGestureDetectorOnScaleGestureListenerC8018FPr, C9115Fyg c9115Fyg, Object obj, int i) {
        c9115Fyg.A06(obj, i);
        float x = motionEvent.getX();
        View view = scaleGestureDetectorOnScaleGestureListenerC8018FPr.A04;
        C7384Etj.A0X(view);
        return Float.valueOf(x - view.getX());
    }

    public static Float A03(MotionEvent motionEvent, ScaleGestureDetectorOnScaleGestureListenerC8018FPr scaleGestureDetectorOnScaleGestureListenerC8018FPr, C9115Fyg c9115Fyg, Object obj, int i) {
        c9115Fyg.A06(obj, i);
        float y = motionEvent.getY();
        View view = scaleGestureDetectorOnScaleGestureListenerC8018FPr.A04;
        C7384Etj.A0X(view);
        return Float.valueOf(y - view.getY());
    }
}
