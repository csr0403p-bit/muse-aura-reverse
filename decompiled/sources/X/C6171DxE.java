package X;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Surface;
import android.view.WindowManager;
import androidx.media3.common.util.Util;
import meta.androidx.media3.exoplayer.video.PlaceholderSurface;

/* renamed from: X.DxE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6171DxE {
    public float A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public boolean A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public Surface A0D;
    public final C6229DyP A0E = new C6229DyP();
    public final InterfaceC6274DzR A0F;
    public final ChoreographerFrameCallbackC6184DxS A0G;

    public final void A04() {
        this.A09 = true;
        A01(this);
        InterfaceC6274DzR interfaceC6274DzR = this.A0F;
        if (interfaceC6274DzR != null) {
            ChoreographerFrameCallbackC6184DxS choreographerFrameCallbackC6184DxS = this.A0G;
            choreographerFrameCallbackC6184DxS.getClass();
            choreographerFrameCallbackC6184DxS.A02.sendEmptyMessage(1);
            interfaceC6274DzR.AZx(new C6214Dy2(this));
        }
        A03(this, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A00() {
        /*
            r10 = this;
            int r0 = androidx.media3.common.util.Util.A00
            r4 = 30
            if (r0 < r4) goto L57
            android.view.Surface r0 = r10.A0D
            if (r0 == 0) goto L57
            X.DyP r7 = r10.A0E
            X.Dy5 r8 = r7.A03
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
            float r6 = r10.A0B
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
            r10.A0B = r5
            r0 = 0
            A03(r10, r0)
        L57:
            return
        L58:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L51
            int r0 = r7.A00
            if (r0 < r4) goto L57
            goto L51
        L61:
            float r5 = r10.A0A
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6171DxE.A00():void");
    }

    public static void A01(C6171DxE c6171DxE) {
        c6171DxE.A02 = 0L;
        c6171DxE.A03 = -1L;
        c6171DxE.A05 = -1L;
    }

    public static void A02(C6171DxE c6171DxE) {
        Surface surface;
        if (Util.A00 < 30 || (surface = c6171DxE.A0D) == null || c6171DxE.A01 == Integer.MIN_VALUE || c6171DxE.A0C == 0.0f) {
            return;
        }
        c6171DxE.A0C = 0.0f;
        DyK.A00(surface, 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A03(X.C6171DxE r3, boolean r4) {
        /*
            int r1 = androidx.media3.common.util.Util.A00
            r0 = 30
            if (r1 < r0) goto L27
            android.view.Surface r2 = r3.A0D
            if (r2 == 0) goto L27
            int r1 = r3.A01
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r0) goto L27
            boolean r0 = r3.A09
            if (r0 == 0) goto L28
            float r1 = r3.A0B
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L28
            float r0 = r3.A00
            float r1 = r1 * r0
        L1f:
            if (r4 != 0) goto L2a
            float r0 = r3.A0C
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L2a
        L27:
            return
        L28:
            r1 = 0
            goto L1f
        L2a:
            r3.A0C = r1
            X.DyK.A00(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6171DxE.A03(X.DxE, boolean):void");
    }

    public final void A05(float f) {
        this.A0A = f;
        C6229DyP c6229DyP = this.A0E;
        c6229DyP.A03.A00();
        c6229DyP.A02.A00();
        c6229DyP.A04 = false;
        c6229DyP.A01 = -9223372036854775807L;
        c6229DyP.A00 = 0;
        A00();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06(long r12) {
        /*
            r11 = this;
            long r3 = r11.A05
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto Le
            r11.A03 = r3
            long r0 = r11.A06
            r11.A04 = r0
        Le:
            long r0 = r11.A02
            r9 = 1
            long r0 = r0 + r9
            r11.A02 = r0
            X.DyP r7 = r11.A0E
            r0 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 * r0
            X.Dy5 r0 = r7.A03
            r0.A01(r12)
            boolean r0 = r0.A02()
            r6 = 1
            r5 = 0
            if (r0 == 0) goto L51
            r7.A04 = r5
        L29:
            boolean r0 = r7.A04
            if (r0 == 0) goto L3d
            X.Dy5 r1 = r7.A02
            boolean r0 = r1.A02()
            if (r0 == 0) goto L3d
            X.Dy5 r0 = r7.A03
            r7.A03 = r1
            r7.A02 = r0
            r7.A04 = r5
        L3d:
            r7.A01 = r12
            X.Dy5 r0 = r7.A03
            boolean r0 = r0.A02()
            if (r0 != 0) goto L4b
            int r0 = r7.A00
            int r5 = r0 + 1
        L4b:
            r7.A00 = r5
            r11.A00()
            return
        L51:
            long r0 = r7.A01
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 == 0) goto L29
            boolean r0 = r7.A04
            if (r0 == 0) goto L75
            X.Dy5 r8 = r7.A02
            long r3 = r8.A00
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L81
            boolean[] r2 = r8.A07
            long r3 = r3 - r9
            r0 = 15
            long r3 = r3 % r0
            int r0 = (int) r3
            boolean r0 = r2[r0]
            if (r0 == 0) goto L81
        L75:
            X.Dy5 r0 = r7.A02
            r0.A00()
            X.Dy5 r8 = r7.A02
            long r0 = r7.A01
            r8.A01(r0)
        L81:
            r7.A04 = r6
            r8.A01(r12)
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6171DxE.A06(long):void");
    }

    public final void A07(Surface surface) {
        if (surface instanceof PlaceholderSurface) {
            surface = null;
        }
        if (this.A0D != surface) {
            A02(this);
            this.A0D = surface;
            A03(this, true);
        }
    }

    public C6171DxE(Context context) {
        InterfaceC6274DzR dyT = null;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            DisplayManager displayManager = (DisplayManager) applicationContext.getSystemService("display");
            if (displayManager != null) {
                dyT = new C6210Dxv(displayManager);
            } else {
                WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
                if (windowManager != null) {
                    dyT = new DyT(windowManager);
                }
            }
        }
        this.A0F = dyT;
        this.A0G = dyT != null ? ChoreographerFrameCallbackC6184DxS.A05 : null;
        this.A07 = -9223372036854775807L;
        this.A08 = -9223372036854775807L;
        this.A0A = -1.0f;
        this.A00 = 1.0f;
        this.A01 = 0;
    }
}
