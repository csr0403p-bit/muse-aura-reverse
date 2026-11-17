package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.GCo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9287GCo extends AbstractC9293GCv<C9286GCn<?>> {
    public final AtomicReference<Object> A00 = new AtomicReference<>(null);

    @Override // X.AbstractC9293GCv
    public final /* bridge */ /* synthetic */ boolean A00(C9286GCn<?> c9286GCn) {
        AtomicReference<Object> atomicReference = this.A00;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(HnJ.A00);
        return true;
    }

    @Override // X.AbstractC9293GCv
    public final /* bridge */ /* synthetic */ HtJ[] A01(C9286GCn<?> c9286GCn) {
        this.A00.set(null);
        return AbstractC9288GCp.A00;
    }
}
