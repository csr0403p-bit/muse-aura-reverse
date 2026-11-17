package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: Add missing generic type declarations: [E] */
/* renamed from: X.GCg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C9279GCg<E> extends C7438Evz implements G0V<Long, GCY<E>, GCY<E>> {
    public static final C9279GCg A00 = new C9279GCg();

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Long l, Object obj) {
        long jA05 = C3cG.A05(l);
        GCY gcy = (GCY) obj;
        int i = AbstractC9276GCd.A01;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = GCK.A01;
        GCV<E> gcv = gcy.A00;
        C7384Etj.A0X(gcv);
        return new GCY(gcv, gcy, 0, jA05);
    }

    public C9279GCg() {
        super(2, AbstractC9276GCd.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
    }
}
