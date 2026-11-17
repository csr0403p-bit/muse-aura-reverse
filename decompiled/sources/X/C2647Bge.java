package X;

import android.os.Handler;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: X.Bge, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2647Bge implements BdG<C2679Bhc> {
    public final C2584Beg A00;
    public static final AbstractC2531BdI<Bh4> A03 = AbstractC2531BdI.A00(Bh4.class, "camerax.core.appConfig.cameraFactoryProvider");
    public static final AbstractC2531BdI<Bh5> A06 = AbstractC2531BdI.A00(Bh5.class, "camerax.core.appConfig.deviceSurfaceManagerProvider");
    public static final AbstractC2531BdI<InterfaceC2673BhJ> A0A = AbstractC2531BdI.A00(InterfaceC2673BhJ.class, "camerax.core.appConfig.useCaseConfigFactoryProvider");
    public static final AbstractC2531BdI<Executor> A02 = AbstractC2531BdI.A00(Executor.class, "camerax.core.appConfig.cameraExecutor");
    public static final AbstractC2531BdI<Handler> A09 = AbstractC2531BdI.A00(Handler.class, "camerax.core.appConfig.schedulerHandler");
    public static final AbstractC2531BdI<Integer> A07 = AbstractC2531BdI.A00(Integer.TYPE, "camerax.core.appConfig.minimumLoggingLevel");
    public static final AbstractC2531BdI<C2565Bdt> A01 = AbstractC2531BdI.A00(C2565Bdt.class, "camerax.core.appConfig.availableCamerasLimiter");
    public static final AbstractC2531BdI<Long> A04 = AbstractC2531BdI.A00(Long.TYPE, "camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming");
    public static final AbstractC2531BdI<InterfaceC2670BhE> A05 = AbstractC2531BdI.A00(InterfaceC2670BhE.class, "camerax.core.appConfig.cameraProviderInitRetryPolicy");
    public static final AbstractC2531BdI<C7383Eth> A08 = AbstractC2531BdI.A00(C7383Eth.class, "camerax.core.appConfig.quirksSettings");

    @Override // X.InterfaceC2586Bei, X.InterfaceC2585Beh
    public final /* synthetic */ boolean A74(AbstractC2531BdI abstractC2531BdI) {
        return this.A00.A74(abstractC2531BdI);
    }

    @Override // X.InterfaceC2586Bei
    public final InterfaceC2585Beh ADr() {
        return this.A00;
    }

    @Override // X.InterfaceC2585Beh
    public final /* synthetic */ BY1 AIG(AbstractC2531BdI abstractC2531BdI) {
        return this.A00.AIG(abstractC2531BdI);
    }

    @Override // X.InterfaceC2585Beh
    public final /* synthetic */ Set AJ7(AbstractC2531BdI abstractC2531BdI) {
        return this.A00.AJ7(abstractC2531BdI);
    }

    @Override // X.InterfaceC2586Bei, X.InterfaceC2585Beh
    public final /* synthetic */ Set APd() {
        return this.A00.APd();
    }

    @Override // X.InterfaceC2586Bei, X.InterfaceC2585Beh
    public final /* synthetic */ Object Abk(AbstractC2531BdI abstractC2531BdI) {
        return this.A00.Abk(abstractC2531BdI);
    }

    @Override // X.InterfaceC2586Bei, X.InterfaceC2585Beh
    public final /* synthetic */ Object Abl(AbstractC2531BdI abstractC2531BdI, Object obj) {
        return this.A00.Abl(abstractC2531BdI, obj);
    }

    @Override // X.InterfaceC2585Beh
    public final /* synthetic */ Object Abm(AbstractC2531BdI abstractC2531BdI, BY1 by1) {
        return this.A00.Abm(abstractC2531BdI, by1);
    }

    public C2647Bge(C2584Beg c2584Beg) {
        this.A00 = c2584Beg;
    }

    @Override // X.InterfaceC2585Beh
    public final /* synthetic */ void ABW(InterfaceC2588Bek interfaceC2588Bek, String str) {
        InterfaceC2585Beh.A01(interfaceC2588Bek, this, str);
    }
}
