package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;

/* renamed from: X.Blx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2820Blx implements InterfaceC2655Bgn<EnumC2819Blw> {
    public ListenableFuture<Void> A00;
    public boolean A01 = false;
    public EvM A02;
    public final InterfaceC2544BdV A03;
    public final AbstractC2908BoZ A04;
    public final C2934BpC<EvM> A05;

    public final void A00(EvM evM) {
        synchronized (this) {
            if (this.A02.equals(evM)) {
                return;
            }
            this.A02 = evM;
            AbstractC2875Bni.A00(evM, "Update Preview stream state to ", "StreamStateObserver");
            this.A05.A09(evM);
        }
    }

    @Override // X.InterfaceC2655Bgn
    public final /* bridge */ /* synthetic */ void AUJ(EnumC2819Blw enumC2819Blw) {
        if (enumC2819Blw == EnumC2819Blw.CLOSING || enumC2819Blw == EnumC2819Blw.CLOSED || enumC2819Blw == EnumC2819Blw.RELEASING || enumC2819Blw == EnumC2819Blw.RELEASED) {
            A00(EvM.IDLE);
            if (this.A01) {
                this.A01 = false;
                ListenableFuture<Void> listenableFuture = this.A00;
                if (listenableFuture != null) {
                    listenableFuture.cancel(false);
                    this.A00 = null;
                    return;
                }
                return;
            }
            return;
        }
        if ((enumC2819Blw == EnumC2819Blw.OPENING || enumC2819Blw == EnumC2819Blw.OPEN || enumC2819Blw == EnumC2819Blw.PENDING_OPEN) && !this.A01) {
            InterfaceC2544BdV interfaceC2544BdV = this.A03;
            A00(EvM.IDLE);
            ArrayList arrayListA0h = C3cG.A0h();
            Bpe bpeA01 = Bpe.A01(new F4M(this, 11), C2945Bpd.A00(AbstractC2947Bpi.A03(interfaceC2544BdV, this, arrayListA0h, 4)), ExecutorC2446BbZ.A00());
            F5M f5m = new F5M(this, 1);
            ExecutorC2446BbZ executorC2446BbZA00 = ExecutorC2446BbZ.A00();
            Bpe bpe = new Bpe(new F4M(f5m, 7), bpeA01);
            bpeA01.addListener(bpe, executorC2446BbZA00);
            this.A00 = bpe;
            AbstractC2942BpW.A03(new F59(interfaceC2544BdV, arrayListA0h, this, 3), bpe, ExecutorC2446BbZ.A00());
            this.A01 = true;
        }
    }

    @Override // X.InterfaceC2655Bgn
    public final void onError(Throwable th) {
        ListenableFuture<Void> listenableFuture = this.A00;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
            this.A00 = null;
        }
        A00(EvM.IDLE);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/BdV;LX/BpC<LX/EvM;>;LX/BoZ;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public C2820Blx(InterfaceC2544BdV interfaceC2544BdV, AbstractC2908BoZ abstractC2908BoZ, C2934BpC c2934BpC) {
        this.A03 = interfaceC2544BdV;
        this.A05 = c2934BpC;
        this.A04 = abstractC2908BoZ;
        synchronized (this) {
            this.A02 = (EvM) c2934BpC.A02();
        }
    }
}
