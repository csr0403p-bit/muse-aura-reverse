package X;

import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class HwK extends HqU implements HoC {
    public static final HwK A00 = new HwK();

    public HwK() {
        super(HoC.A00);
    }

    @Override // X.HoC
    @Deprecated(level = Hs1.A04, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public final InterfaceC10488Hlm A4q(GBM gbm) {
        return HsE.A00;
    }

    @Override // X.HoC
    @Deprecated(level = Hs1.A04, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public final void A5w(CancellationException cancellationException) {
    }

    @Override // X.HoC
    @Deprecated(level = Hs1.A04, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public final CancellationException ADQ() {
        throw C3cG.A0Q("This job is always active");
    }

    @Override // X.HoC
    public final C3b6<HoC> ADc() {
        return A3o.A00;
    }

    @Override // X.HoC
    public final C9283GCk AIE() {
        throw C8j3.A18("This job is always active");
    }

    @Override // X.HoC
    @Deprecated(level = Hs1.A04, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public final HsS AO5(G0U<? super Throwable, Unit> g0u) {
        return HsE.A00;
    }

    @Override // X.HoC
    public final boolean AOG() {
        return false;
    }

    @Override // X.HoC
    @Deprecated(level = Hs1.A04, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public final Object APQ(HtJ<? super Unit> htJ) {
        throw C8j3.A18("This job is always active");
    }

    @Override // X.HoC
    @Deprecated(level = Hs1.A04, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public final void Afv() {
    }

    @Override // X.HoC
    public final boolean isActive() {
        return true;
    }

    @Override // X.HoC
    public final boolean isCancelled() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    /* JADX WARN: Incorrect types in method signature: (ZZLX/G0U<-Ljava/lang/Throwable;Lkotlin/Unit;>;)LX/HsS; */
    @Override // X.HoC
    @Deprecated(level = Hs1.A04, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public final HsS AO6(G0U g0u, boolean z, boolean z2) {
        return HsE.A00;
    }
}
