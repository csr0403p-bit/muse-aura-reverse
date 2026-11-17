package X;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes5.dex */
public abstract class C9W extends CUB {
    @Override // X.CUB
    public final int A05(int i) {
        return A0A().nextInt(i);
    }

    public Random A0A() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        C7384Etj.A0U(threadLocalRandomCurrent);
        return threadLocalRandomCurrent;
    }
}
