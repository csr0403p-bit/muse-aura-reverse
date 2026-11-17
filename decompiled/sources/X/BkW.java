package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class BkW implements Bg2 {
    public int A00;
    public final BkR A01;
    public final Executor A02;

    @Override // X.Bg2
    public final ListenableFuture<Void> AO8() {
        return AbstractC2947Bpi.A01(this, 4);
    }

    @Override // X.Bg2
    public final ListenableFuture<Void> AO9() {
        AbstractC2875Bni.A01("Camera2CapturePipeline", "invokePreCapture");
        C2945Bpd c2945BpdA00 = C2945Bpd.A00(this.A01.A00(this.A00));
        F5L f5l = new F5L(1);
        Executor executor = this.A02;
        Bpe bpe = new Bpe(new F4M(f5l, 7), c2945BpdA00);
        c2945BpdA00.addListener(bpe, executor);
        return bpe;
    }

    public BkW(BkR bkR, Executor executor, int i) {
        this.A01 = bkR;
        this.A02 = executor;
        this.A00 = i;
    }
}
