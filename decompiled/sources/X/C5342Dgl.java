package X;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.Executors;

/* renamed from: X.Dgl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5342Dgl implements DhA {
    public static final C5230Ddo A03 = new C5230Ddo(2, -9223372036854775807L);
    public static final C5230Ddo A04 = new C5230Ddo(3, -9223372036854775807L);
    public HandlerC5228Ddm<? extends InterfaceC5231Ddp> A00;
    public IOException A01;
    public final InterfaceExecutorC5232Ddq A02;

    public C5342Dgl(String str) {
        this(new C5343Dgm(new C7575F4o(2), Executors.newSingleThreadExecutor(new Ev6(FGI.A0M("ExoPlayer:Loader:", str), 1))));
    }

    public final void A01(InterfaceC5346Dgp interfaceC5346Dgp) {
        HandlerC5228Ddm<? extends InterfaceC5231Ddp> handlerC5228Ddm = this.A00;
        if (handlerC5228Ddm != null) {
            handlerC5228Ddm.A01(true);
        }
        if (interfaceC5346Dgp != null) {
            this.A02.execute(new RunnableC5345Dgo(interfaceC5346Dgp));
        }
        C5343Dgm c5343Dgm = (C5343Dgm) this.A02;
        c5343Dgm.A00.accept(c5343Dgm.A01);
    }

    @Override // X.DhA
    public final void AQQ() {
        IOException iOException = this.A01;
        if (iOException != null) {
            throw iOException;
        }
        HandlerC5228Ddm<? extends InterfaceC5231Ddp> handlerC5228Ddm = this.A00;
        if (handlerC5228Ddm != null) {
            int i = handlerC5228Ddm.A05;
            IOException iOException2 = handlerC5228Ddm.A01;
            if (iOException2 != null && handlerC5228Ddm.A00 > i) {
                throw iOException2;
            }
        }
    }

    /* JADX WARN: Incorrect types in method signature: <T::LX/Ddp;>(TT;LX/Ddn<TT;>;I)J */
    public final long A00(InterfaceC5229Ddn interfaceC5229Ddn, InterfaceC5231Ddp interfaceC5231Ddp, int i) {
        Looper looperMyLooper = Looper.myLooper();
        C1G.A05(looperMyLooper);
        this.A01 = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HandlerC5228Ddm<? extends InterfaceC5231Ddp> handlerC5228Ddm = new HandlerC5228Ddm<>(looperMyLooper, interfaceC5229Ddn, interfaceC5231Ddp, this, i, jElapsedRealtime);
        C5342Dgl c5342Dgl = handlerC5228Ddm.A09;
        C1G.A08(AnonymousClass002.A1Y(c5342Dgl.A00));
        c5342Dgl.A00 = handlerC5228Ddm;
        HandlerC5228Ddm.A00(handlerC5228Ddm);
        return jElapsedRealtime;
    }

    public C5342Dgl(InterfaceExecutorC5232Ddq interfaceExecutorC5232Ddq) {
        this.A02 = interfaceExecutorC5232Ddq;
    }
}
