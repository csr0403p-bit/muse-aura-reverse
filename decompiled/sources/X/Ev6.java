package X;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes5.dex */
public final class Ev6 implements ThreadFactory {
    public final int $t;
    public final String A00;

    public Ev6(String str, int i) {
        this.$t = i;
        switch (i) {
            case 0:
            case 1:
                this.A00 = str;
                break;
            default:
                this.A00 = str;
                break;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.$t) {
            case 0:
                Thread thread = new Thread(runnable, this.A00);
                thread.setPriority(10);
                return thread;
            case 1:
                return new Thread(runnable, this.A00);
            default:
                return new C2941BpV(runnable, this.A00, Integer.MIN_VALUE);
        }
    }
}
