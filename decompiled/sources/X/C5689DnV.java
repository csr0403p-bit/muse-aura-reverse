package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.DnV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5689DnV {
    public float A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public C6154Dwx A05;
    public InbandTelemetryBweEstimate A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0F;
    public final int A0G;
    public final long A0H;
    public final long A0I;
    public final long A0J;
    public final long A0K;
    public final C6154Dwx A0L;
    public final C6154Dwx A0M;
    public final C6154Dwx A0N;
    public final String A0O;
    public final String A0P;
    public final boolean A0X;
    public final C6154Dwx[] A0Y;
    public final List<EnumC5613Dls> A0Z;
    public final ArrayList<EnumC5684DnO> A0S = C3cG.A0h();
    public final StringBuilder A0Q = C60O.A0w();
    public final StringBuilder A0R = C60O.A0w();
    public final AtomicReference<String> A0V = BV4.A15();
    public final AtomicReference<AbstractC6071DvB> A0W = BV4.A15();
    public final Map<String, C5901Drk> A0U = BV4.A0u();
    public final Map<String, C5901Drk> A0T = BV4.A0u();

    public static final void A00(C5901Drk c5901Drk, String str, StringBuilder sb) {
        long j = c5901Drk.A01;
        long j2 = c5901Drk.A02;
        long j3 = c5901Drk.A04;
        long j4 = c5901Drk.A03;
        StringBuilder sbA0g = C3cG.A0g(str);
        sbA0g.append(":[");
        sbA0g.append(j);
        BV7.A1H("-", sbA0g, j2);
        sbA0g.append(j3);
        sbA0g.append("-");
        sbA0g.append(j4);
        sbA0g.append("];");
        BV4.A1O(sb, sbA0g);
    }

    /* JADX WARN: Incorrect types in method signature: (JJJJLX/Dwx;[LX/Dwx;LX/Dwx;LX/Dwx;ILjava/util/List<+LX/Dls;>;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;F)V */
    public C5689DnV(C6154Dwx c6154Dwx, C6154Dwx c6154Dwx2, C6154Dwx c6154Dwx3, String str, String str2, String str3, String str4, String str5, String str6, List list, C6154Dwx[] c6154DwxArr, float f, int i, long j, long j2, long j3, long j4, boolean z) {
        this.A0L = c6154Dwx;
        this.A0Y = c6154DwxArr;
        this.A0M = c6154Dwx2;
        this.A0N = c6154Dwx3;
        this.A0G = i;
        this.A0Z = list;
        this.A0P = str;
        this.A0O = str2;
        this.A0X = z;
        this.A0A = str3;
        this.A08 = str4;
        this.A09 = str5;
        this.A0D = str6;
        this.A00 = f;
        this.A0K = j3 / 1000;
        this.A0J = j4 / 1000;
        this.A0H = j2 / 1000;
        this.A0I = j / 1000;
    }

    public final String A01() {
        StringBuilder sbA0w = C60O.A0w();
        for (EnumC5613Dls enumC5613Dls : this.A0Z) {
            if (sbA0w.length() > 0) {
                sbA0w.append(";");
            }
            sbA0w.append(enumC5613Dls.shortName);
        }
        return sbA0w.toString();
    }

    public final String A02() {
        StringBuilder sbA0w = C60O.A0w();
        Iterator itA0N = C7384Etj.A0N(this.A0S);
        while (itA0N.hasNext()) {
            String str = ((EnumC5684DnO) C7384Etj.A0F(itA0N)).shortName;
            if (sbA0w.length() > 0) {
                sbA0w.append(";");
            }
            sbA0w.append(str);
        }
        return sbA0w.toString();
    }
}
