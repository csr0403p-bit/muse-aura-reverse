package X;

import com.facebook.common.time.RealtimeSinceBootClock;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.FutureTask;

/* loaded from: classes6.dex */
public final class FBL {
    public final EEO A00;
    public final FBS A01;
    public final DK9 A02;
    public final HsW A03;

    public FBL(EEO eeo, FBS fbs, HsW hsW) {
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.A00;
        this.A01 = fbs;
        this.A00 = eeo;
        this.A03 = hsW;
        this.A02 = realtimeSinceBootClock;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.HxE A00(X.C7403Euh r23, X.HlX r24, X.Hkm r25, X.FBL r26, X.C7711FBj r27, X.Hly r28, long r29, long r31) throws java.security.NoSuchAlgorithmException {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FBL.A00(X.Euh, X.HlX, X.Hkm, X.FBL, X.FBj, X.Hly, long, long):X.HxE");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final FBJ<C7705FBd> A01(FC0<C7705FBd> fc0) {
        FBJ fbj;
        FBS fbs = this.A01;
        C8937Ftt c8937Ftt = new C8937Ftt(fc0, 1);
        synchronized (fbs.A04) {
            fbj = new FBJ(new C7704FBc(fbs.A00), fbs.A03.A00(c8937Ftt));
        }
        return new FBJ<>(new C7705FBd(((C7704FBc) fbj.A00).A00), fbj.A01);
    }

    public final void A02(Integer num) {
        EEO eeo;
        FBS fbs = this.A01;
        synchronized (fbs.A04) {
            FCQ<String, FBm> fcq = fbs.A02;
            synchronized (fcq) {
                try {
                    if (fcq.A02 > -1) {
                        while (true) {
                            synchronized (fcq) {
                                try {
                                    int i = fcq.A02;
                                    if (i < 0) {
                                        break;
                                    }
                                    LinkedHashMap<String, FBm> linkedHashMap = fcq.A07;
                                    if (linkedHashMap.isEmpty() && i != 0) {
                                        break;
                                    }
                                    if (!linkedHashMap.isEmpty()) {
                                        Map.Entry entryA0l = C3cH.A0l(C3cG.A0i(linkedHashMap));
                                        Object key = entryA0l.getKey();
                                        entryA0l.getValue();
                                        linkedHashMap.remove(key);
                                        fcq.A02--;
                                        fcq.A00++;
                                    }
                                } finally {
                                }
                            }
                        }
                        throw BV5.A0U(C60Q.A0e(fcq), ".sizeOf() is reporting inconsistent results!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Map<String, FBm> mapA01 = fcq.A01();
            fbs.A00 = mapA01;
            fbs.A03.A01(new C7704FBc(mapA01));
        }
        if (num.intValue() == 0 || (eeo = this.A00) == null) {
            return;
        }
        eeo.A05.execute(new FutureTask(new CallableC7564F4d(eeo, 3)));
    }
}
