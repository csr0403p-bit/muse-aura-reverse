package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class FAE<CommitData> {
    public volatile int A00;
    public volatile FAV A01;
    public volatile List<CommitData> A02;

    public final void A00() {
        AbstractC8162FXe.A02("Handler's commit hook can only be changed on the main thread");
        if (this.A00 != 2) {
            this.A00 = 2;
            this.A01 = null;
            synchronized (this) {
                this.A02 = null;
            }
        }
    }
}
