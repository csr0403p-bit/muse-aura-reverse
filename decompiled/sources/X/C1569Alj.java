package X;

import java.util.Comparator;

/* renamed from: X.Alj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1569Alj<T> implements Comparator {
    public final /* synthetic */ Comparator A00;
    public final /* synthetic */ Comparator A01;

    public C1569Alj(Comparator comparator, Comparator comparator2) {
        this.A01 = comparator;
        this.A00 = comparator2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int iCompare = this.A01.compare(t, t2);
        return iCompare == 0 ? this.A00.compare(((C1562Alc) t).A03, ((C1562Alc) t2).A03) : iCompare;
    }
}
