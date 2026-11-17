package X;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import android.view.Surface;

/* renamed from: X.DxC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6169DxC {
    public float A00;
    public float A01;
    public float A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public Surface A0A;
    public boolean A0B;
    public float A0C;
    public final C6227DyN A0D = new C6227DyN();
    public final Dy0 A0E;
    public final ChoreographerFrameCallbackC6183DxR A0F;

    public final void A03() {
        Surface surface;
        this.A0B = false;
        Dy0 dy0 = this.A0E;
        if (dy0 != null) {
            dy0.A00.unregisterDisplayListener(dy0);
            ChoreographerFrameCallbackC6183DxR choreographerFrameCallbackC6183DxR = this.A0F;
            choreographerFrameCallbackC6183DxR.getClass();
            choreographerFrameCallbackC6183DxR.A02.sendEmptyMessage(3);
        }
        if (Build.VERSION.SDK_INT < 30 || (surface = this.A0A) == null || this.A02 == 0.0f) {
            return;
        }
        this.A02 = 0.0f;
        DyJ.A00(surface, 0.0f);
    }

    public static void A00(Display display, C6169DxC c6169DxC) {
        long j;
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            c6169DxC.A08 = refreshRate;
            j = (refreshRate * 80) / 100;
        } else {
            CNC.A04("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j = -9223372036854775807L;
            c6169DxC.A08 = -9223372036854775807L;
        }
        c6169DxC.A09 = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(X.C6169DxC r10) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 30
            if (r0 < r4) goto L57
            android.view.Surface r0 = r10.A0A
            if (r0 == 0) goto L57
            X.DyN r7 = r10.A0D
            X.Dy4 r8 = r7.A03
            boolean r9 = r8.A02()
            if (r9 == 0) goto L61
            long r2 = r8.A01
            r0 = 0
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 == 0) goto L1f
            long r0 = r8.A02
            long r0 = r0 / r2
        L1f:
            double r2 = (double) r0
            r0 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r0 = r0 / r2
            float r5 = (float) r0
        L27:
            float r6 = r10.A0C
            int r0 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r0 == 0) goto L57
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L58
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 == 0) goto L58
            if (r9 == 0) goto L47
            long r3 = r8.A02
            r1 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 1017370378(0x3ca3d70a, float:0.02)
            if (r0 >= 0) goto L49
        L47:
            r1 = 1065353216(0x3f800000, float:1.0)
        L49:
            float r0 = X.C8j3.A01(r5, r6)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L57
        L51:
            r10.A0C = r5
            r0 = 0
            A02(r10, r0)
        L57:
            return
        L58:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L51
            int r0 = r7.A00
            if (r0 < r4) goto L57
            goto L51
        L61:
            float r5 = r10.A00
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6169DxC.A01(X.DxC):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(X.C6169DxC r3, boolean r4) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r1 < r0) goto L21
            android.view.Surface r2 = r3.A0A
            if (r2 == 0) goto L21
            boolean r0 = r3.A0B
            if (r0 == 0) goto L22
            float r1 = r3.A0C
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L22
            float r0 = r3.A01
            float r1 = r1 * r0
        L19:
            if (r4 != 0) goto L24
            float r0 = r3.A02
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L24
        L21:
            return
        L22:
            r1 = 0
            goto L19
        L24:
            r3.A02 = r1
            X.DyJ.A00(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6169DxC.A02(X.DxC, boolean):void");
    }

    public final void A04(Surface surface) {
        Surface surface2 = this.A0A;
        if (surface2 != surface) {
            if (Build.VERSION.SDK_INT >= 30 && surface2 != null && this.A02 != 0.0f) {
                this.A02 = 0.0f;
                DyJ.A00(surface2, 0.0f);
            }
            this.A0A = surface;
            A02(this, true);
        }
    }

    public C6169DxC(Context context) {
        DisplayManager displayManager;
        Dy0 dy0 = null;
        if (context != null && (displayManager = (DisplayManager) context.getSystemService("display")) != null) {
            dy0 = new Dy0(displayManager, this);
        }
        this.A0E = dy0;
        this.A0F = dy0 != null ? ChoreographerFrameCallbackC6183DxR.A05 : null;
        this.A08 = -9223372036854775807L;
        this.A09 = -9223372036854775807L;
        this.A00 = -1.0f;
        this.A01 = 1.0f;
    }
}
