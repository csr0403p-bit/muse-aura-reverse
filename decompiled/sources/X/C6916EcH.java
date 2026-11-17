package X;

import java.util.Comparator;

/* renamed from: X.EcH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6916EcH implements Comparator<Comparable<? super Object>> {
    public static final C6916EcH A00 = new C6916EcH();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Comparable<? super Object> comparable, Comparable<? super Object> comparable2) {
        Comparable<? super Object> comparable3 = comparable;
        AnonymousClass003.A0u(comparable3, comparable2);
        return comparable3.compareTo(comparable2);
    }

    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return C6915EcG.A00;
    }
}
