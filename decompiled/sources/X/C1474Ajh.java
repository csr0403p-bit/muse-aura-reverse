package X;

import java.util.Comparator;

/* renamed from: X.Ajh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1474Ajh implements Comparator<C1453AjM> {
    public static final C1474Ajh A00 = new C1474Ajh();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(C1453AjM c1453AjM, C1453AjM c1453AjM2) {
        C1453AjM c1453AjM3 = c1453AjM;
        C1453AjM c1453AjM4 = c1453AjM2;
        int iA00 = C7384Etj.A00(c1453AjM4.A00, c1453AjM3.A00);
        return iA00 == 0 ? C7384Etj.A00(c1453AjM3.hashCode(), c1453AjM4.hashCode()) : iA00;
    }
}
