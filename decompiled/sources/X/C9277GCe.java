package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.GCe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C9277GCe extends C7438Evz implements G0W<GCV<?>, Object, Object, Object> {
    public static final C9277GCe A00 = new C9277GCe();

    public C9277GCe() {
        super(3, GCV.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // X.G0W
    public final /* bridge */ /* synthetic */ Object invoke(GCV<?> gcv, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = GCV.A07;
        if (obj2 == AbstractC9276GCd.A04) {
            obj2 = new Ho5((Throwable) GCV.A07.get(gcv));
        }
        return new HoI(obj2);
    }
}
