package X;

import android.net.Uri;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class DlY {
    public HeroPlayerSetting A00;
    public C5580Dky A01;

    public static int A00(C5580Dky c5580Dky, AbstractC5553DkW abstractC5553DkW, long j) {
        DhD dhDA03;
        if (abstractC5553DkW == null || (dhDA03 = abstractC5553DkW.A03()) == null) {
            return 0;
        }
        long jA01 = C5580Dky.A01(c5580Dky, 0);
        long jAFg = dhDA03.AFg();
        long jMax = Math.max(0L, BV7.A0S(jAFg, dhDA03.AK9(jA01)));
        int iAKA = (int) dhDA03.AKA(Math.max(dhDA03.ALf(jAFg), (dhDA03.ALf(jMax) + dhDA03.AEz(jMax, jA01)) - j), jA01);
        AbstractC3426CMt.A03("Exo2DashManifestWrapper", "prefetch: lastSegNum:%d first:%d prefetchStart:%d edgeLatencyMs:%d", Long.valueOf(jMax), Long.valueOf(jAFg), Integer.valueOf(iAKA), Long.valueOf(BV4.A04(j)));
        return iAKA;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C4924DEu A01(X.C5594DlX r36, X.DlY r37, java.lang.String r38, java.util.List r39) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DlY.A01(X.DlX, X.DlY, java.lang.String, java.util.List):X.DEu");
    }

    public static AbstractC5553DkW A02(C6154Dwx c6154Dwx, List<AbstractC5553DkW> list) {
        if (c6154Dwx == null || list == null) {
            return null;
        }
        Iterator<AbstractC5553DkW> it = list.iterator();
        while (it.hasNext()) {
            AbstractC5553DkW abstractC5553DkWA0d = BV6.A0d(it);
            String str = abstractC5553DkWA0d.A03.A0Y;
            if (str != null && str.equals(c6154Dwx.A0Y)) {
                return abstractC5553DkWA0d;
            }
        }
        return null;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/DkW;Ljava/lang/String;Ljava/util/List<LX/DEv;>;LX/DEF;LX/DE9;)V */
    public static void A03(DE9 de9, DEF def, AbstractC5553DkW abstractC5553DkW, String str, List list) {
        C5325DgJ c5325DgJ;
        if (abstractC5553DkW == null || (c5325DgJ = abstractC5553DkW.A04) == null) {
            return;
        }
        Uri uriA00 = C0F.A00(c5325DgJ, abstractC5553DkW);
        if (de9.A01(uriA00, str) == null) {
            AbstractC3426CMt.A03("Exo2DashManifestWrapper", "Enqueue dash live init segment uri: %s", uriA00);
            String strA04 = abstractC5553DkW.A04();
            C6154Dwx c6154Dwx = abstractC5553DkW.A03;
            C7384Etj.A0Y(uriA00, 0);
            list.add(new C4925DEv(uriA00, c6154Dwx, def, strA04, 0, 0, -1, true, false));
        }
    }

    public static final boolean A04(DE9 de9, DEF def, DlY dlY, AbstractC5553DkW abstractC5553DkW, String str, List list, int i, int i2) {
        Uri uri;
        long jALf;
        int iAK9 = i;
        int i3 = i2;
        if (abstractC5553DkW != null) {
            if (!abstractC5553DkW.A07() || !dlY.A01.A0S || !dlY.A00.allowOutOfBoundsAccessForPDash) {
                i3 = 0;
            }
            DhD dhDA03 = abstractC5553DkW.A03();
            if (dhDA03 != null && i >= 0) {
                long j = iAK9;
                long jAFg = dhDA03.AFg();
                if (j >= jAFg) {
                    long jAK9 = (jAFg + dhDA03.AK9(0L)) - 1;
                    if (j <= jAK9 || (i3 > 0 && j <= jAK9 + i3)) {
                        boolean zA1N = AnonymousClass002.A1N((j > ((jAFg + dhDA03.AK9(0L)) - 1) ? 1 : (j == ((jAFg + dhDA03.AK9(0L)) - 1) ? 0 : -1)));
                        String strA05 = abstractC5553DkW.A05();
                        C5325DgJ c5325DgJAKC = dhDA03.AKC(j);
                        if (c5325DgJAKC != null && (uri = Uri.parse(C0F.A01(strA05, c5325DgJAKC.A03))) != null && de9.A01(uri, str) == null) {
                            AbstractC3426CMt.A03("Exo2DashManifestWrapper", "Enqueue dash live init segment uri: %s", uri);
                            int iA00 = abstractC5553DkW instanceof C5582Dl1 ? ((C5582Dl1) abstractC5553DkW).A00.A00(j) : -1;
                            String strA04 = abstractC5553DkW.A04();
                            C5580Dky c5580Dky = dlY.A01;
                            if (zA1N) {
                                long jAK92 = (jAFg + dhDA03.AK9(0L)) - 1;
                                jALf = dhDA03.ALf(jAK92) + ((j - jAK92) * dhDA03.AEz(jAK92, C5580Dky.A01(c5580Dky, 0)));
                            } else {
                                jALf = dhDA03.ALf(j);
                            }
                            int i4 = (int) (jALf / 1000);
                            if (zA1N) {
                                iAK9 = (int) ((jAFg + dhDA03.AK9(0L)) - 1);
                            }
                            list.add(new C4925DEv(uri, abstractC5553DkW.A03, def, strA04, i4, (int) (dhDA03.AEz(iAK9, C5580Dky.A01(c5580Dky, 0)) / 1000), iA00, false, zA1N));
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
