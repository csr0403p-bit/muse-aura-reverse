package X;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.8d6, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C8d6<T> implements C3b6<T> {
    public final /* synthetic */ Comparator<? super T> A00;
    public final /* synthetic */ C3b6<T> A01;

    /* JADX WARN: Incorrect types in method signature: (LX/3b6<+TT;>;Ljava/util/Comparator<-TT;>;)V */
    public C8d6(Comparator comparator, C3b6 c3b6) {
        this.A01 = c3b6;
        this.A00 = comparator;
    }

    @Override // X.C3b6
    public final Iterator<T> iterator() {
        C3b6<T> c3b6 = this.A01;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<T> it = c3b6.iterator();
        while (it.hasNext()) {
            arrayListA0h.add(it.next());
        }
        AbstractC06907md.A04(arrayListA0h, this.A00);
        return arrayListA0h.iterator();
    }
}
