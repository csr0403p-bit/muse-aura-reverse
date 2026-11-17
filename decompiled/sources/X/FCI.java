package X;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public final class FCI implements Runnable {
    public static final String __redex_internal_original_name = "SignalsInitialRenderWarmer$warmInitialRender$task$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ FDW A01;
    public final /* synthetic */ FCA A02;
    public final /* synthetic */ FCC A03;
    public final /* synthetic */ AtomicInteger A04;

    public FCI(FDW fdw, FCA fca, FCC fcc, AtomicInteger atomicInteger, int i) {
        this.A04 = atomicInteger;
        this.A00 = i;
        this.A02 = fca;
        this.A03 = fcc;
        this.A01 = fdw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicInteger atomicInteger = this.A04;
        if (atomicInteger.get() == this.A00) {
            C7769FDy<FCA> c7769FDy = AbstractC7752FDe.A00;
            c7769FDy.A02(this.A02);
            try {
                this.A03.A02(this.A01);
            } finally {
                c7769FDy.A02(null);
            }
        }
    }
}
