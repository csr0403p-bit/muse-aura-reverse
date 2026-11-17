package X;

import com.google.common.collect.TreeMultiset;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [E] */
/* renamed from: X.DPr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5032DPr<E> extends AbstractC5028DPf<E> {
    public final /* synthetic */ C5036DPy A00;

    public C5032DPr(final C5036DPy this$0) {
        this.A00 = this$0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new F5P((TreeMultiset) this.A00.A03, 3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A00.A03.entrySet().size();
    }
}
