package X;

import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class BmG extends Bm5 {
    public final long A00;
    public final AbstractC2841Bmk A01;
    public final BeM<AbstractC2832Bmb> A02;
    public final Executor A03;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Bm5) {
                BmG bmG = (BmG) ((Bm5) obj);
                if (this.A01.equals(bmG.A01)) {
                    Executor executor = this.A03;
                    Executor executor2 = bmG.A03;
                    if (executor != null ? executor.equals(executor2) : executor2 == null) {
                        if (!this.A02.equals(bmG.A02) || this.A00 != bmG.A00) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.A01.hashCode() ^ 1000003) * 1000003) ^ AnonymousClass006.A0D(this.A03)) * 1000003) ^ C3cH.A02(this.A02)) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ AnonymousClass002.A0A(this.A00);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("RecordingRecord{getOutputOptions=");
        sbA0x.append(this.A01);
        sbA0x.append(", getCallbackExecutor=");
        sbA0x.append(this.A03);
        sbA0x.append(", getEventListener=");
        sbA0x.append(this.A02);
        sbA0x.append(", hasAudioEnabled=");
        sbA0x.append(false);
        sbA0x.append(", isPersistent=");
        sbA0x.append(false);
        sbA0x.append(", getRecordingId=");
        sbA0x.append(this.A00);
        return BV7.A11(sbA0x);
    }

    public BmG(AbstractC2841Bmk abstractC2841Bmk, BeM beM, Executor executor, long j) {
        this.A01 = abstractC2841Bmk;
        this.A03 = executor;
        this.A02 = beM;
        this.A00 = j;
    }
}
