package X;

import android.util.SparseArray;

/* renamed from: X.EgZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7119EgZ<T> {
    public C7124Ege<T> A00;
    public C7124Ege<T> A01;
    public final SparseArray<C7124Ege<T>> A02 = BV4.A0B();

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (r4v0 X.EgZ) */
    public static synchronized void A00(C7124Ege c7124Ege, C7119EgZ c7119EgZ) {
        synchronized (c7119EgZ) {
            C7124Ege c7124Ege2 = (C7124Ege<T>) c7124Ege.A02;
            C7124Ege c7124Ege3 = (C7124Ege<T>) c7124Ege.A01;
            if (c7124Ege2 != null) {
                c7124Ege2.A01 = c7124Ege3;
            }
            if (c7124Ege3 != null) {
                c7124Ege3.A02 = c7124Ege2;
            }
            c7124Ege.A02 = null;
            c7124Ege.A01 = null;
            if (c7124Ege == c7119EgZ.A00) {
                c7119EgZ.A00 = c7124Ege3;
            }
            if (c7124Ege == c7119EgZ.A01) {
                c7119EgZ.A01 = c7124Ege2;
            }
        }
    }
}
