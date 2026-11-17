package X;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.GuV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10315GuV {
    public static Gt8 A00(String str) {
        C10316GuW c10316GuW = new C10316GuW(0);
        StringReader stringReader = new StringReader(str);
        GtC gtC = new GtC(c10316GuW);
        String str2 = Gt3.A03;
        Gt8 gt8 = new Gt8("http://www.w3.org/1999/xhtml", "", new GtC(new C10316GuW(0)));
        c10316GuW.A04 = gt8;
        gt8.A02 = gtC;
        c10316GuW.A0C = gtC;
        c10316GuW.A0B = gtC.A02;
        GtL gtL = new GtL(stringReader);
        c10316GuW.A07 = gtL;
        boolean z = gtC.A04;
        c10316GuW.A0M = z;
        Gu6 gu6 = gtC.A01;
        if (!AnonymousClass002.A1N(gu6.maxSize) && !z) {
            gtL.A06 = null;
        } else if (gtL.A06 == null) {
            gtL.A06 = new C10307GuI();
            GtL.A04(gtL);
        }
        c10316GuW.A03 = c10316GuW.A0M ? c10316GuW.A07.A06 : null;
        if (gu6.maxSize > 0) {
            gu6.clear();
        }
        c10316GuW.A0H = new C10318GuY(c10316GuW);
        ArrayList<Gt3> arrayList = c10316GuW.A0N;
        arrayList.clear();
        arrayList.ensureCapacity(32);
        c10316GuW.A0L = false;
        c10316GuW.A0D = GtC.A00(gtC);
        C10313GuT c10313GuT = new C10313GuT(C79.A01, c10316GuW);
        c10316GuW.A0F = c10313GuT;
        c10316GuW.A0G = c10313GuT;
        c10316GuW.A0T(c10316GuW.A04, true);
        c10316GuW.A0A = EnumC10321Gub.A0M;
        c10316GuW.A09 = null;
        c10316GuW.A0I = false;
        c10316GuW.A05 = null;
        c10316GuW.A06 = null;
        c10316GuW.A00 = C3cG.A0h();
        c10316GuW.A01 = C3cG.A0h();
        c10316GuW.A08 = null;
        c10316GuW.A02 = C3cG.A0h();
        c10316GuW.A0E = new C10314GuU(C79.A0C, c10316GuW);
        c10316GuW.A0K = true;
        c10316GuW.A0J = false;
        while (!c10316GuW.A0L) {
            if (c10316GuW.A0G.A02 != C79.A0W) {
                C10318GuY c10318GuY = c10316GuW.A0H;
                while (!c10318GuY.A04) {
                    c10318GuY.A03.A04(c10318GuY.A07, c10318GuY);
                }
                C10325Guf c10325Guf = c10318GuY.A0A;
                C10312GuO c10312GuO = c10325Guf.A00;
                AbstractC10326Gug abstractC10326Gug = c10325Guf;
                if (c10312GuO.A01 == null) {
                    abstractC10326Gug = c10325Guf;
                    if (c10312GuO.A00 == null) {
                        c10318GuY.A04 = false;
                        abstractC10326Gug = c10318GuY.A02;
                    }
                }
                c10316GuW.A0G = abstractC10326Gug;
                c10316GuW.A0d(abstractC10326Gug);
                abstractC10326Gug.A03();
            } else if (arrayList.isEmpty()) {
                c10316GuW.A0T(c10316GuW.A04, false);
                c10316GuW.A0L = true;
            } else {
                c10316GuW.A0A();
            }
        }
        if (c10316GuW.A07 != null) {
            C10307GuI c10307GuI = c10316GuW.A03;
            if (c10307GuI != null) {
                int[] iArr = c10307GuI.A01;
                int length = iArr.length;
                int i = c10307GuI.A00;
                if (length != i) {
                    c10307GuI.A01 = i == 0 ? C10307GuI.A02 : Arrays.copyOf(iArr, i);
                }
            }
            c10316GuW.A07.close();
            c10316GuW.A07 = null;
            c10316GuW.A03 = null;
            c10316GuW.A0H = null;
            arrayList.clear();
            arrayList.trimToSize();
        }
        return c10316GuW.A04;
    }
}
