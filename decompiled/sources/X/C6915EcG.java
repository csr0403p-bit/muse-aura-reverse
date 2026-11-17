package X;

import java.util.Comparator;

/* renamed from: X.EcG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6915EcG implements Comparator<Comparable<? super Object>> {
    public static final C6915EcG A00 = new C6915EcG();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Comparable<? super Object> comparable, Comparable<? super Object> comparable2) {
        Comparable<? super Object> comparable3 = comparable2;
        AnonymousClass003.A0u(comparable, comparable3);
        return comparable3.compareTo(comparable);
    }

    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return C6916EcH.A00;
    }
}
