package X;

import java.util.Comparator;

/* loaded from: classes5.dex */
public final class C0L<T> implements Comparator {
    public static final C0L<T> A00 = new C0L<>();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C0J c0j = (C0J) obj;
        C0J c0j2 = (C0J) obj2;
        long j = c0j.A02;
        long j2 = c0j2.A02;
        return j - j2 == 0 ? c0j.compareTo(c0j2) : j < j2 ? -1 : 1;
    }
}
