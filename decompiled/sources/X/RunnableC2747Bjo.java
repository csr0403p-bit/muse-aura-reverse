package X;

import java.util.concurrent.Executor;

/* renamed from: X.Bjo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC2747Bjo implements Runnable {
    public static final String __redex_internal_original_name = "Camera2CameraImpl$StateCallback$ScheduledReopen";
    public boolean A00 = false;
    public Executor A01;
    public final /* synthetic */ Bj8 A02;

    public RunnableC2747Bjo(Bj8 bj8, Executor executor) {
        this.A02 = bj8;
        this.A01 = executor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.execute(new Runnable() { // from class: X.Bjd
            public static final String __redex_internal_original_name = "Camera2CameraImpl$StateCallback$ScheduledReopen$$ExternalSyntheticLambda0";

            /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() throws android.hardware.camera2.CameraAccessException {
                /*
                    r4 = this;
                    X.Bjo r1 = r4.A00
                    boolean r0 = r1.A00
                    if (r0 != 0) goto L2b
                    X.Bj8 r0 = r1.A02
                    X.Bj4 r4 = r0.A05
                    java.lang.Integer r1 = r4.A0a
                    java.lang.Integer r0 = X.C79.A0W
                    r3 = 1
                    if (r1 == r0) goto L18
                    java.lang.Integer r2 = r4.A0a
                    java.lang.Integer r0 = X.C79.A0T
                    r1 = 0
                    if (r2 != r0) goto L19
                L18:
                    r1 = 1
                L19:
                    r0 = 0
                    X.BeS.A07(r1, r0)
                    boolean r0 = r4.A05
                    if (r0 == 0) goto L2c
                    int r1 = r4.A00
                    if (r1 == r3) goto L28
                    r0 = 2
                    if (r1 != r0) goto L2c
                L28:
                    r4.A0I(r3)
                L2b:
                    return
                L2c:
                    r4.A0J(r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RunnableC2736Bjd.run():void");
            }
        });
    }
}
