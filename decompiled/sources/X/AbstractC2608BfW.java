package X;

import android.graphics.Rect;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;

/* renamed from: X.BfW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2608BfW implements BfV {
    public final BfV A00;

    @Override // X.BfV
    public final void A3c(InterfaceC2585Beh interfaceC2585Beh) {
        this.A00.A3c(interfaceC2585Beh);
    }

    @Override // X.BfV
    public final void A43(BgX bgX) {
        this.A00.A43(bgX);
    }

    @Override // X.BfV
    public final void A6J() {
        this.A00.A6J();
    }

    @Override // X.BfV
    public final void A8h() {
        this.A00.A8h();
    }

    @Override // X.BfV
    public final ListenableFuture<Bg2> ADE(int i, int i2) {
        return this.A00.ADE(i, i2);
    }

    @Override // X.BfV
    public final InterfaceC2585Beh AGf() {
        return this.A00.AGf();
    }

    @Override // X.BfV
    public final Rect AKM() {
        return this.A00.AKM();
    }

    @Override // X.BfV
    public final void ANU() {
        this.A00.ANU();
    }

    @Override // X.BfV
    public final void AdR(int i) {
        this.A00.AdR(i);
    }

    @Override // X.BfV
    public final void AeZ(InterfaceC2787BlA interfaceC2787BlA) {
        this.A00.AeZ(interfaceC2787BlA);
    }

    @Override // X.InterfaceC2622Bfo
    public final ListenableFuture<Void> AfI(float f) {
        return (this instanceof C2612Bfd ? ((C2612Bfd) this).A00 : this.A00).AfI(f);
    }

    @Override // X.InterfaceC2622Bfo
    public final ListenableFuture<C2675BhP> Ag2(BkB bkB) {
        BfV bfV;
        if (this instanceof C2612Bfd) {
            C2612Bfd c2612Bfd = (C2612Bfd) this;
            if (bkB == null) {
                return new C2938BpP(C3cG.A0Q("FocusMetering is not supported"));
            }
            bfV = c2612Bfd.A00;
        } else {
            bfV = this.A00;
        }
        return bfV.Ag2(bkB);
    }

    @Override // X.BfV
    public final ListenableFuture<List<Void>> Agb(List<C2646Bgd> list, int i, int i2) {
        if (!(this instanceof C2614Bff)) {
            return this.A00.Agb(list, i, i2);
        }
        BeS.A06(BV7.A1Q(list.size()), "Only support one capture config.");
        ListenableFuture<Bg2> listenableFutureADE = this.A00.ADE(i, i2);
        return AbstractC2942BpW.A00(Collections.singletonList(Bpe.A01(new F4M(listenableFutureADE, 9), Bpe.A01(new F4N(3, this, list), Bpe.A01(new F4M(listenableFutureADE, 8), C2945Bpd.A00(listenableFutureADE), ExecutorC2446BbZ.A00()), ExecutorC2446BbZ.A00()), ExecutorC2446BbZ.A00())));
    }

    public AbstractC2608BfW(BfV bfV) {
        this.A00 = bfV;
    }
}
