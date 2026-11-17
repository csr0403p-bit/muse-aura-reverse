package X;

import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.3av, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3av<T> implements C3b6<T> {
    public final /* synthetic */ Object[] A00;

    public C3av(Object[] objArr) {
        this.A00 = objArr;
    }

    @Override // X.C3b6
    public final Iterator<T> iterator() {
        return new F3E(this.A00);
    }
}
