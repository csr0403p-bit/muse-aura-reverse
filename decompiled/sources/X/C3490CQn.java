package X;

/* renamed from: X.CQn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3490CQn {
    public static final C3490CQn A00 = new C3490CQn();
    public volatile C3490CQn next;
    public volatile Thread thread;

    public C3490CQn() {
        CQf cQf = AbstractC3485CQd.A00;
        Thread threadCurrentThread = Thread.currentThread();
        if (cQf instanceof C3486CQe) {
            this.thread = threadCurrentThread;
        } else {
            ((C3484CQc) cQf).A03.lazySet(this, threadCurrentThread);
        }
    }
}
