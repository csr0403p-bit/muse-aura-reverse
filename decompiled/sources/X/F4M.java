package X;

import android.hardware.camera2.TotalCaptureResult;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Future;

/* loaded from: classes5.dex */
public final class F4M implements InterfaceC2939BpT {
    public final int $t;
    public final Object A00;

    public F4M(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // X.InterfaceC2939BpT
    public final ListenableFuture<O> A4O(I i) {
        switch (this.$t) {
            case 0:
                BkR bkR = (BkR) this.A00;
                if (Boolean.TRUE.equals(i)) {
                    long j = bkR.A00;
                    return C2762BkQ.A01(bkR.A02, new InterfaceC2790BlI() { // from class: X.Bkr
                        @Override // X.InterfaceC2790BlI
                        public final boolean A69(TotalCaptureResult totalCaptureResult) {
                            return C2762BkQ.A03(totalCaptureResult, false);
                        }
                    }, bkR.A07, j);
                }
                break;
            case 1:
                C2764Bka c2764Bka = (C2764Bka) this.A00;
                return C2762BkQ.A01(c2764Bka.A00, new InterfaceC2790BlI() { // from class: X.Bks
                    @Override // X.InterfaceC2790BlI
                    public final boolean A69(TotalCaptureResult totalCaptureResult) {
                        return C2762BkQ.A03(totalCaptureResult, false);
                    }
                }, c2764Bka.A03, 2000000000L);
            case 2:
                return ((C2764Bka) this.A00).A00.A09.A02(true);
            case 3:
                return AbstractC2947Bpi.A01(this.A00, 6);
            case 4:
                return AbstractC2947Bpi.A01(((C2764Bka) this.A00).A00.A09, 10);
            case 5:
                BkU bkU = (BkU) this.A00;
                if (bkU.A03) {
                    return AbstractC2947Bpi.A01(bkU.A01.A09, 10);
                }
                break;
            case 6:
                BkU bkU2 = (BkU) this.A00;
                return C2762BkQ.A01(bkU2.A01, new InterfaceC2790BlI() { // from class: X.Bku
                    @Override // X.InterfaceC2790BlI
                    public final boolean A69(TotalCaptureResult totalCaptureResult) {
                        return C2762BkQ.A03(totalCaptureResult, true);
                    }
                }, bkU2.A02, 2000000000L);
            case 7:
                Object objApply = ((BpS) this.A00).apply(i);
                if (objApply != null) {
                    return new BpQ(objApply);
                }
                break;
            case 8:
                return ((Bg2) ((Future) this.A00).get()).AO9();
            case 9:
                return ((Bg2) ((Future) this.A00).get()).AO8();
            case 10:
                G0U g0u = (G0U) this.A00;
                C2678Bha c2678Bha = C2678Bha.A07;
                return (ListenableFuture) g0u.invoke(i);
            default:
                AbstractC2908BoZ abstractC2908BoZ = ((C2820Blx) this.A00).A04;
                if (abstractC2908BoZ instanceof C2910Bob) {
                    return AbstractC2947Bpi.A01(abstractC2908BoZ, 30);
                }
                break;
        }
        return BpQ.A01;
    }
}
