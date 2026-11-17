package X;

import java.util.Comparator;

/* renamed from: X.Ali, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1568Ali implements Comparator<C1562Alc> {
    public static final C1568Ali A00 = new C1568Ali();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(C1562Alc c1562Alc, C1562Alc c1562Alc2) {
        AaC aaCA06 = c1562Alc.A06();
        AaC aaCA062 = c1562Alc2.A06();
        int iCompare = Float.compare(aaCA062.A02, aaCA06.A02);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Float.compare(aaCA06.A03, aaCA062.A03);
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = Float.compare(aaCA06.A00, aaCA062.A00);
        return iCompare3 == 0 ? Float.compare(aaCA062.A01, aaCA06.A01) : iCompare3;
    }
}
