package X;

/* renamed from: X.CQo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3491CQo {
    public static final C3491CQo A00 = new C3491CQo();
    public volatile C3491CQo next;
    public volatile Thread thread;

    public C3491CQo() {
        CQU.ATOMIC_HELPER.A03(this, Thread.currentThread());
    }
}
