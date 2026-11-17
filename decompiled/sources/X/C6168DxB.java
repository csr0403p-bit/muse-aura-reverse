package X;

import android.os.Handler;
import android.util.Pair;
import android.view.Surface;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.DxB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6168DxB {
    public Pair<Surface, C6226DyM> A00;
    public CopyOnWriteArrayList A01;
    public Handler A03;
    public final C6149Dwr A05;
    public final C6171DxE A08;
    public final ArrayDeque<Long> A07 = BV4.A0s();
    public final ArrayDeque<Pair<Long, C6154Dwx>> A06 = BV4.A0s();
    public boolean A02 = true;
    public C6232Dya A04 = C6232Dya.A03;

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049 A[Catch: Exception -> 0x00a4, TryCatch #0 {Exception -> 0x00a4, blocks: (B:15:0x003b, B:17:0x0041, B:19:0x0045, B:22:0x006a, B:24:0x006e, B:27:0x0084, B:28:0x00a3, B:26:0x0072, B:21:0x0049), top: B:32:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072 A[Catch: Exception -> 0x00a4, TryCatch #0 {Exception -> 0x00a4, blocks: (B:15:0x003b, B:17:0x0041, B:19:0x0045, B:22:0x006a, B:24:0x006e, B:27:0x0084, B:28:0x00a3, B:26:0x0072, B:21:0x0049), top: B:32:0x003b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(X.C6154Dwx r14) {
        /*
            r13 = this;
            boolean r0 = r13.A02
            r3 = 0
            if (r0 == 0) goto Lb
            java.util.concurrent.CopyOnWriteArrayList r0 = r13.A01
            if (r0 != 0) goto Lc
            r13.A02 = r3
        Lb:
            return
        Lc:
            r4 = 0
            android.os.Handler r0 = X.C1G.A02(r4)
            r13.A03 = r0
            X.Dwr r2 = r13.A05
            X.DxO r5 = r14.A0S
            boolean r0 = X.C6180DxO.A03(r5)
            if (r0 != 0) goto L23
            X.DxO r5 = X.C6180DxO.A07
        L1f:
            android.util.Pair.create(r5, r5)
            goto L3b
        L23:
            int r1 = r5.A04
            r0 = 7
            if (r1 != r0) goto L1f
            int r8 = r5.A03
            int r9 = r5.A02
            byte[] r7 = r5.A06
            int r11 = r5.A05
            int r12 = r5.A01
            r10 = 6
            X.DxO r6 = new X.DxO
            r6.<init>(r7, r8, r9, r10, r11, r12)
            android.util.Pair.create(r5, r6)
        L3b:
            java.lang.reflect.Constructor<?> r0 = X.AbstractC6209Dxu.A00     // Catch: java.lang.Exception -> La4
            java.lang.String r5 = "build"
            if (r0 == 0) goto L49
            java.lang.reflect.Method r0 = X.AbstractC6209Dxu.A04     // Catch: java.lang.Exception -> La4
            if (r0 == 0) goto L49
            java.lang.reflect.Method r0 = X.AbstractC6209Dxu.A02     // Catch: java.lang.Exception -> La4
            if (r0 != 0) goto L6a
        L49:
            java.lang.String r0 = "androidx.media3.exoplayer.effect.ScaleAndRotateTransformation$Builder"
            java.lang.Class r6 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> La4
            java.lang.reflect.Constructor r0 = r6.getConstructor(r4)     // Catch: java.lang.Exception -> La4
            X.AbstractC6209Dxu.A00 = r0     // Catch: java.lang.Exception -> La4
            java.lang.Class r0 = java.lang.Float.TYPE     // Catch: java.lang.Exception -> La4
            java.lang.Class[] r1 = new java.lang.Class[]{r0}     // Catch: java.lang.Exception -> La4
            java.lang.String r0 = "setRotationDegrees"
            java.lang.reflect.Method r0 = r6.getMethod(r0, r1)     // Catch: java.lang.Exception -> La4
            X.AbstractC6209Dxu.A04 = r0     // Catch: java.lang.Exception -> La4
            java.lang.reflect.Method r0 = r6.getMethod(r5, r4)     // Catch: java.lang.Exception -> La4
            X.AbstractC6209Dxu.A02 = r0     // Catch: java.lang.Exception -> La4
        L6a:
            java.lang.reflect.Constructor<?> r0 = X.AbstractC6209Dxu.A01     // Catch: java.lang.Exception -> La4
            if (r0 == 0) goto L72
            java.lang.reflect.Method r0 = X.AbstractC6209Dxu.A03     // Catch: java.lang.Exception -> La4
            if (r0 != 0) goto L84
        L72:
            java.lang.String r0 = "androidx.media3.exoplayer.effect.DefaultVideoFrameProcessor$Factory$Builder"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> La4
            java.lang.reflect.Constructor r0 = r1.getConstructor(r4)     // Catch: java.lang.Exception -> La4
            X.AbstractC6209Dxu.A01 = r0     // Catch: java.lang.Exception -> La4
            java.lang.reflect.Method r0 = r1.getMethod(r5, r4)     // Catch: java.lang.Exception -> La4
            X.AbstractC6209Dxu.A03 = r0     // Catch: java.lang.Exception -> La4
        L84:
            java.lang.reflect.Constructor<?> r0 = X.AbstractC6209Dxu.A01     // Catch: java.lang.Exception -> La4
            java.lang.Object r1 = r0.newInstance(r4)     // Catch: java.lang.Exception -> La4
            java.lang.reflect.Method r0 = X.AbstractC6209Dxu.A03     // Catch: java.lang.Exception -> La4
            java.lang.Object r0 = r0.invoke(r1, r4)     // Catch: java.lang.Exception -> La4
            r0.getClass()     // Catch: java.lang.Exception -> La4
            java.util.concurrent.CopyOnWriteArrayList r0 = r13.A01     // Catch: java.lang.Exception -> La4
            r0.getClass()     // Catch: java.lang.Exception -> La4
            android.os.Handler r0 = r13.A03     // Catch: java.lang.Exception -> La4
            r0.getClass()     // Catch: java.lang.Exception -> La4
            java.lang.String r0 = "create"
            java.lang.NullPointerException r0 = X.BV4.A0a(r0)     // Catch: java.lang.Exception -> La4
            throw r0     // Catch: java.lang.Exception -> La4
        La4:
            r1 = move-exception
            r0 = 7000(0x1b58, float:9.809E-42)
            androidx.media3.exoplayer.ExoPlaybackException r0 = r2.A0U(r14, r1, r0, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6168DxB.A00(X.Dwx):void");
    }

    public C6168DxB(C6149Dwr c6149Dwr, C6171DxE c6171DxE) {
        this.A08 = c6171DxE;
        this.A05 = c6149Dwr;
    }
}
