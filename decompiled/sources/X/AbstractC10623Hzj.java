package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.Hzj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10623Hzj {
    public static final GCV A00(Integer num, int i) {
        int i2;
        if (i == -2) {
            if (num == C79.A00) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = GCV.A07;
                C10625Hzm c10625Hzm = HzR.A00;
                i2 = C10625Hzm.A00;
                return new GCV(i2, null);
            }
            return new GCX(1, num);
        }
        if (i == -1) {
            if (num == C79.A00) {
                return new GCX(1, C79.A01);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i == 0) {
            if (num == C79.A00) {
                i2 = 0;
            }
            return new GCX(1, num);
        }
        i2 = Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return num == C79.A00 ? new GCV(i, null) : new GCX(i, num);
        }
        return new GCV(i2, null);
    }
}
