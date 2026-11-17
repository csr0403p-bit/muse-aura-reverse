package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes6.dex */
public abstract class GCM {
    public static final HrH A00 = HrH.A00("CLOSED");

    /* JADX WARN: Incorrect types in method signature: <S:LX/GCK<TS;>;>(TS;JLX/G0V<-Ljava/lang/Long;-TS;+TS;>;)Ljava/lang/Object; */
    public static final Object A00(G0V g0v, GCK gck, long j) {
        while (true) {
            if (gck.A00 >= j && !gck.A03()) {
                return gck;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = GCL.A00;
            Object obj = atomicReferenceFieldUpdater.get(gck);
            HrH hrH = A00;
            if (obj == hrH) {
                return hrH;
            }
            GCK gck2 = (GCK) ((GCL) obj);
            if (gck2 == null) {
                gck2 = (GCK) g0v.invoke(Long.valueOf(gck.A00 + 1), gck);
                if (AbstractC5217DdT.A00(gck, null, gck2, atomicReferenceFieldUpdater)) {
                    if (gck.A03()) {
                        gck.A02();
                    }
                }
            }
            gck = gck2;
        }
    }
}
