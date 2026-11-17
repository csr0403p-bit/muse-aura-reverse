package X;

import java.util.Comparator;

/* renamed from: X.Ajr, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1484Ajr implements Comparator<C1506AkD> {
    public static final C1484Ajr A00 = new C1484Ajr();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(C1506AkD c1506AkD, C1506AkD c1506AkD2) {
        C1506AkD c1506AkD3 = c1506AkD;
        C1506AkD c1506AkD4 = c1506AkD2;
        boolean zA03 = AbstractC1485Ajs.A03(c1506AkD3);
        int i = 0;
        boolean zA032 = AbstractC1485Ajs.A03(c1506AkD4);
        if (!zA03) {
            return !zA032 ? 0 : 1;
        }
        if (!zA032) {
            return -1;
        }
        C1453AjM c1453AjMA04 = AbstractC1414Aij.A04(c1506AkD3);
        C1453AjM c1453AjMA042 = AbstractC1414Aij.A04(c1506AkD4);
        if (C7384Etj.areEqual(c1453AjMA04, c1453AjMA042)) {
            return 0;
        }
        C0910AHm c0910AHmA02 = C0910AHm.A02(new C1453AjM[16], 0);
        while (c1453AjMA04 != null) {
            c0910AHmA02.A0B(0, c1453AjMA04);
            c1453AjMA04 = c1453AjMA04.A0E();
        }
        C0910AHm c0910AHmA022 = C0910AHm.A02(new C1453AjM[16], 0);
        while (c1453AjMA042 != null) {
            c0910AHmA022.A0B(0, c1453AjMA042);
            c1453AjMA042 = c1453AjMA042.A0E();
        }
        int iA0F = C8j3.A0F(c0910AHmA022.A00, 1, c0910AHmA02.A00 - 1);
        if (iA0F >= 0) {
            while (C8j3.A1X(c0910AHmA02.A01[i], c0910AHmA022.A01, i)) {
                if (i != iA0F) {
                    i++;
                }
            }
            return C7384Etj.A00(((C1453AjM) c0910AHmA02.A01[i]).A0d.A0G.A03, ((C1453AjM) c0910AHmA022.A01[i]).A0d.A0G.A03);
        }
        throw C3cG.A0Q("Could not find a common ancestor between the two FocusModifiers.");
    }
}
