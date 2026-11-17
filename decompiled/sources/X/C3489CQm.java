package X;

/* renamed from: X.CQm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3489CQm {
    public static final C3489CQm A00 = new C3489CQm();
    public volatile C3489CQm next;
    public volatile Thread thread;

    public C3489CQm() {
        CQh cQh = CQV.A00;
        Thread threadCurrentThread = Thread.currentThread();
        if (cQh instanceof C3487CQg) {
            this.thread = threadCurrentThread;
        } else {
            ((C3483CQb) cQh).A03.lazySet(this, threadCurrentThread);
        }
    }
}
