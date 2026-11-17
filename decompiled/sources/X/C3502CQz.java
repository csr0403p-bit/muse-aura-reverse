package X;

/* renamed from: X.CQz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3502CQz {
    public static final C3502CQz A00 = new C3502CQz();
    public volatile Thread a;
    public volatile C3502CQz b;

    public C3502CQz() {
        CR0 cr0 = AbstractC3496CQt.A00;
        Thread threadCurrentThread = Thread.currentThread();
        if (cr0 instanceof C3501CQy) {
            this.a = threadCurrentThread;
        } else {
            ((C3500CQx) cr0).A00.lazySet(this, threadCurrentThread);
        }
    }
}
