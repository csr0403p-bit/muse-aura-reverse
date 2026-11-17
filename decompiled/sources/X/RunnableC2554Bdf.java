package X;

import java.util.concurrent.Executor;

/* renamed from: X.Bdf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class RunnableC2554Bdf implements Runnable {
    public static final String __redex_internal_original_name = "Camera2CameraControlImpl$$ExternalSyntheticLambda3";
    public final /* synthetic */ Bj5 A00;
    public final /* synthetic */ BeX A01;
    public final /* synthetic */ Executor A02;

    @Override // java.lang.Runnable
    public final void run() {
        Bj5 bj5 = this.A00;
        Executor executor = this.A02;
        BeX beX = this.A01;
        BeT beT = bj5.A05;
        beT.A01.add(beX);
        beT.A00.put(beX, executor);
    }

    public /* synthetic */ RunnableC2554Bdf(Bj5 bj5, BeX beX, Executor executor) {
        this.A00 = bj5;
        this.A02 = executor;
        this.A01 = beX;
    }
}
