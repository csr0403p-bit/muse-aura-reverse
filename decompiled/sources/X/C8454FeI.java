package X;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.SystemClock;
import java.util.ArrayList;

/* renamed from: X.FeI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8454FeI {
    public static final ThreadLocal<C8454FeI> A08 = new ThreadLocal<>();
    public InterfaceC8465FeT A01;
    public InterfaceC8469FeY A02;
    public final DQZ<InterfaceC8470FeZ, Long> A04 = new DQZ<>(0);
    public final ArrayList<InterfaceC8470FeZ> A07 = C3cG.A0h();
    public final C8460FeO A05 = new C8460FeO(this);
    public final Runnable A06 = new Runnable() { // from class: X.FeJ
        public static final String __redex_internal_original_name = "AnimationHandler$$ExternalSyntheticLambda0";

        @Override // java.lang.Runnable
        public final void run() {
            C8454FeI c8454FeI = this.A00.A05.A00;
            c8454FeI.A01(SystemClock.uptimeMillis());
            if (c8454FeI.A07.size() > 0) {
                ((C8458FeM) c8454FeI.A02).A01.postFrameCallback(new ChoreographerFrameCallbackC10645I0p(c8454FeI.A06, 1));
            }
        }
    };
    public boolean A03 = false;
    public float A00 = 1.0f;

    public static C8454FeI A00() {
        ThreadLocal<C8454FeI> threadLocal = A08;
        if (threadLocal.get() == null) {
            threadLocal.set(new C8454FeI(new C8458FeM()));
        }
        return threadLocal.get();
    }

    public final void A02(InterfaceC8470FeZ interfaceC8470FeZ) {
        ArrayList<InterfaceC8470FeZ> arrayList = this.A07;
        if (arrayList.size() == 0) {
            ((C8458FeM) this.A02).A01.postFrameCallback(new ChoreographerFrameCallbackC10645I0p(this.A06, 1));
            if (Build.VERSION.SDK_INT >= 33) {
                this.A00 = ValueAnimator.getDurationScale();
                InterfaceC8465FeT c8457FeL = this.A01;
                if (c8457FeL == null) {
                    c8457FeL = new C8457FeL(this);
                    this.A01 = c8457FeL;
                }
                c8457FeL.AZy();
            }
        }
        BV7.A1D(interfaceC8470FeZ, arrayList);
    }

    public C8454FeI(InterfaceC8469FeY interfaceC8469FeY) {
        this.A02 = interfaceC8469FeY;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(long r28) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8454FeI.A01(long):void");
    }
}
