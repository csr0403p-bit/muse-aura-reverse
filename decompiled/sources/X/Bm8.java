package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class Bm8 implements AutoCloseable {
    public final long A00;
    public final AbstractC2841Bmk A01;
    public final C2836Bmf A02;
    public final C2823Bm4 A03;
    public final AtomicBoolean A04;

    @Override // java.lang.AutoCloseable
    public final void close() {
        A00(0, null);
    }

    private void A00(final int i, final Throwable th) {
        Bm5 bm5;
        this.A02.A00.close();
        if (this.A04.getAndSet(true)) {
            return;
        }
        final C2823Bm4 c2823Bm4 = this.A03;
        synchronized (c2823Bm4.A0g) {
            Bm5 bm52 = c2823Bm4.A0K;
            boolean z = false;
            if (bm52 != null && this.A00 == ((BmG) bm52).A00) {
                z = true;
            }
            if (!z && ((bm5 = c2823Bm4.A0I) == null || this.A00 != ((BmG) bm5).A00)) {
                AbstractC2875Bni.A01("Recorder", C8j3.A14(this.A01, C60O.A0x("stop() called on a recording that is no longer active: ")));
                return;
            }
            Bm5 bm53 = null;
            switch (c2823Bm4.A0M) {
                case CONFIGURING:
                case IDLING:
                    throw C3cG.A0Q("Calling stop() while idling or initializing is invalid.");
                case PENDING_RECORDING:
                case PENDING_PAUSED:
                    BeS.A07(z, null);
                    c2823Bm4.A0K = null;
                    C2823Bm4.A0E(c2823Bm4);
                    bm53 = bm52;
                    break;
                case RECORDING:
                case PAUSED:
                    C2823Bm4.A0D(BmF.STOPPING, c2823Bm4);
                    final long jA0G = BV8.A0G();
                    final Bm5 bm54 = c2823Bm4.A0I;
                    c2823Bm4.A0j.execute(new Runnable() { // from class: X.BmY
                        public static final String __redex_internal_original_name = "Recorder$$ExternalSyntheticLambda9";

                        @Override // java.lang.Runnable
                        public final void run() {
                            C2823Bm4 c2823Bm42 = c2823Bm4;
                            Bm5 bm55 = bm54;
                            long j = jA0G;
                            C2823Bm4.A09(bm55, c2823Bm42, th, i, j);
                        }
                    });
                    break;
                case STOPPING:
                case RESETTING:
                    Bm5 bm55 = c2823Bm4.A0I;
                    boolean z2 = false;
                    if (bm55 != null && this.A00 == ((BmG) bm55).A00) {
                        z2 = true;
                    }
                    BeS.A07(z2, null);
                    break;
            }
            if (bm53 != null) {
                if (i == 10) {
                    AbstractC2875Bni.A02("Recorder", "Recording was stopped due to recording being garbage collected before any valid data has been produced.");
                }
                C2823Bm4.A0B(bm53, BV4.A0d("Recording was stopped before any data could be produced.", th), 8);
            }
        }
    }

    public final void finalize() {
        this.A02.A00.AiO();
        A00(10, BV4.A0c("Recording stopped due to being garbage collected."));
    }

    public Bm8(AbstractC2841Bmk abstractC2841Bmk, C2823Bm4 c2823Bm4, long j, boolean z) {
        AtomicBoolean atomicBooleanA1E = C60O.A1E();
        this.A04 = atomicBooleanA1E;
        C2836Bmf c2836BmfA00 = C2836Bmf.A00();
        this.A02 = c2836BmfA00;
        this.A03 = c2823Bm4;
        this.A00 = j;
        this.A01 = abstractC2841Bmk;
        if (z) {
            atomicBooleanA1E.set(true);
        } else {
            c2836BmfA00.A00.AXU("stop");
        }
    }
}
