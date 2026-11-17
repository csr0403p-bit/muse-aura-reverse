package X;

import androidx.compose.runtime.PausableMonotonicFrameClock;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BRt implements Dg3 {
    public final /* synthetic */ PausableMonotonicFrameClock A00;
    public final /* synthetic */ BBH A01;
    public final /* synthetic */ C10543Hqv<BOg> A02;
    public final /* synthetic */ C3UX A03;

    /* JADX WARN: Incorrect types in method signature: (LX/3UX;Landroidx/compose/runtime/PausableMonotonicFrameClock;LX/BBH;LX/Hqv<LX/BOg;>;)V */
    public BRt(PausableMonotonicFrameClock pausableMonotonicFrameClock, BBH bbh, C10543Hqv c10543Hqv, C3UX c3ux) {
        this.A03 = c3ux;
        this.A00 = pausableMonotonicFrameClock;
        this.A01 = bbh;
        this.A02 = c10543Hqv;
    }

    @Override // X.Dg3
    public final void onStateChanged(C1HY c1hy, EnumC3085Bxl enumC3085Bxl) {
        Hm1 hm1A03;
        boolean z;
        switch (enumC3085Bxl.ordinal()) {
            case 0:
                C3UX c3ux = this.A03;
                C8j3.A1I(C79.A0K, new BUF(this.A01, c1hy, this.A02, this, null, 9), c3ux);
                return;
            case 1:
                PausableMonotonicFrameClock pausableMonotonicFrameClock = this.A00;
                if (pausableMonotonicFrameClock != null) {
                    C7Hd c7Hd = pausableMonotonicFrameClock.A00;
                    Object obj = c7Hd.A03;
                    synchronized (obj) {
                        synchronized (obj) {
                            z = c7Hd.A02;
                        }
                    }
                    if (!z) {
                        List<HtJ<Unit>> list = c7Hd.A00;
                        c7Hd.A00 = c7Hd.A01;
                        c7Hd.A01 = list;
                        c7Hd.A02 = true;
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            list.get(i).resumeWith(Unit.INSTANCE);
                        }
                        list.clear();
                    }
                }
                BBH bbh = this.A01;
                synchronized (bbh.A0K) {
                    if (bbh.A07) {
                        bbh.A07 = false;
                        hm1A03 = BBH.A03(bbh);
                    } else {
                        hm1A03 = null;
                    }
                }
                if (hm1A03 != null) {
                    hm1A03.resumeWith(Unit.INSTANCE);
                    return;
                }
                return;
            case 2:
            case 3:
            case 6:
                return;
            case 4:
                BBH bbh2 = this.A01;
                synchronized (bbh2.A0K) {
                    bbh2.A07 = true;
                }
                return;
            case 5:
                this.A01.A0b();
                return;
            default:
                throw C3cG.A0q();
        }
    }
}
