package X;

import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes4.dex */
public final class BMt<T> implements Iterable<T>, BOA {
    public final /* synthetic */ Object[] A00;

    public BMt(Object[] objArr) {
        this.A00 = objArr;
    }

    @Override // java.lang.Iterable
    public final Iterator<T> iterator() {
        return new F3E(this.A00);
    }
}
