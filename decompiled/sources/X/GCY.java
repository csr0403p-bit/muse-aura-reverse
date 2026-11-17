package X;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes6.dex */
public final class GCY<E> extends GCK<GCY<E>> {
    public final GCV<E> A00;
    public final /* synthetic */ AtomicReferenceArray A01;

    public final void A09(int i, boolean z) {
        if (z) {
            GCV<E> gcv = this.A00;
            C7384Etj.A0X(gcv);
            gcv.A0K((super.A00 * AbstractC9276GCd.A01) + i);
        }
        A05();
    }

    public final boolean A0A(int i, Object obj, Object obj2) {
        return AbstractC10556Hsj.A00(obj, obj2, this.A01, (i * 2) + 1);
    }

    /* JADX WARN: Incorrect types in method signature: (JLX/GCY<TE;>;LX/GCV<TE;>;I)V */
    public GCY(GCV gcv, GCY gcy, int i, long j) {
        super(gcy, i, j);
        this.A00 = gcv;
        this.A01 = new AtomicReferenceArray(AbstractC9276GCd.A01 * 2);
    }
}
