package X;

/* renamed from: X.FBn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC7713FBn implements Runnable {
    public static final String __redex_internal_original_name = "ComponentQuerySnapshotSubscriptionManager$addSubscriberUnderSnapshotLock$2";
    public final /* synthetic */ C7714FBo<TSnapshot> A00;

    public RunnableC7713FBn(C7714FBo<TSnapshot> c7714FBo) {
        this.A00 = c7714FBo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7714FBo<TSnapshot> c7714FBo = this.A00;
        c7714FBo.A00.invoke(c7714FBo);
        c7714FBo.A01 = null;
    }
}
