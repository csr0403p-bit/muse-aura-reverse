package X;

import com.facebook.exoplayer.monitor.VpsEventCallback;
import com.facebook.video.heroplayer.common.MosScoreCalculation;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.DnT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5687DnT {
    public static final void A00(C6154Dwx c6154Dwx, C5689DnV c5689DnV, VpsEventCallback vpsEventCallback, String str, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        long j2;
        long j3;
        int i;
        int i2;
        int i3;
        String strA0o;
        int i4;
        String strA0o2;
        int i5;
        String strA0o3;
        c5689DnV.A05 = c6154Dwx;
        String strA0o4 = BV6.A0o(c6154Dwx);
        String str2 = strA0o4;
        if (strA0o4 == null || strA0o4.length() == 0) {
            str2 = "default";
        }
        Map<String, C5901Drk> map = c5689DnV.A0U;
        C5901Drk c5901Drk = map.containsKey(str2) ? map.get(str2) : null;
        if (strA0o4 == null || strA0o4.length() == 0) {
            strA0o4 = "default";
        }
        Map<String, C5901Drk> map2 = c5689DnV.A0T;
        C5901Drk c5901Drk2 = map2.containsKey(strA0o4) ? map2.get(strA0o4) : null;
        int i6 = c5901Drk != null ? c5901Drk.A00 : -1;
        if (c5901Drk != null) {
            j2 = c5901Drk.A01;
            j3 = c5901Drk.A02;
        } else {
            j2 = -1;
            j3 = -1;
        }
        long j4 = c5901Drk2 != null ? c5901Drk2.A02 : -1L;
        C6154Dwx c6154Dwx2 = c5689DnV.A05;
        if (c6154Dwx2 != null) {
            i = c6154Dwx2.A05;
            Dl5 dl5A00 = Dl5.A00(c6154Dwx2);
            i3 = dl5A00.A02;
            C5901Drk c5901Drk3 = map.get(dl5A00.A0A);
            if (c5901Drk3 == null || (i2 = (int) c5901Drk3.A04) <= 0) {
                i2 = i;
            }
            strA0o = BV6.A0o(c6154Dwx2);
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            strA0o = null;
        }
        C6154Dwx c6154Dwx3 = c5689DnV.A05;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j5 = c5689DnV.A0I;
        long j6 = c5689DnV.A0H;
        long j7 = c5689DnV.A0K;
        long j8 = c5689DnV.A0J;
        long j9 = c5689DnV.A03;
        long j10 = c5689DnV.A04;
        long j11 = c5689DnV.A02;
        C6154Dwx c6154Dwx4 = c5689DnV.A0L;
        if (c6154Dwx4 == null) {
            i4 = 0;
            strA0o2 = null;
        } else {
            i4 = c6154Dwx4.A05;
            strA0o2 = BV6.A0o(c6154Dwx4);
        }
        C6154Dwx c6154Dwx5 = c5689DnV.A0M;
        String strA0o5 = c6154Dwx5 == null ? null : BV6.A0o(c6154Dwx5);
        C6154Dwx c6154Dwx6 = c5689DnV.A0N;
        if (c6154Dwx6 == null) {
            i5 = 0;
            strA0o3 = null;
        } else {
            i5 = c6154Dwx6.A05;
            strA0o3 = BV6.A0o(c6154Dwx6);
        }
        C6154Dwx[] c6154DwxArr = c5689DnV.A0Y;
        int length = c6154DwxArr.length;
        C5723DoI[] c5723DoIArr = new C5723DoI[length];
        for (int i7 = 0; i7 < length; i7++) {
            Dl5 dl5A002 = Dl5.A00(c6154DwxArr[i7]);
            C7384Etj.A0U(dl5A002);
            C6154Dwx c6154Dwx7 = c6154DwxArr[i7];
            if (c6154Dwx7 != null) {
                String str3 = c6154Dwx7.A0Y;
                String str4 = c6154Dwx7.A0X;
                c5723DoIArr[i7] = new C5723DoI(str3, str4, c6154Dwx7.A0a, c6154Dwx7.A0W, dl5A002.A0A, dl5A002.A08, dl5A002.A09, dl5A002.A07, dl5A002.A0B, dl5A002.A05, str4, dl5A002.A0C, c6154Dwx7.A01, c6154Dwx7.A0Q, c6154Dwx7.A0D, c6154Dwx7.A06, c6154Dwx7.A0L, c6154Dwx7.A05, dl5A002.A02, c6154Dwx7.A0J, dl5A002.A0M, dl5A002.A0N, dl5A002.A0J, dl5A002.A0I, dl5A002.A0H, dl5A002.A0G, dl5A002.A0F, dl5A002.A0E, dl5A002.A0O, dl5A002.A0L);
            }
        }
        String strA02 = c5689DnV.A02();
        String string = c5689DnV.A0Q.toString();
        int i8 = c6154Dwx6 == null ? 0 : c6154Dwx6.A0Q;
        String strA01 = c5689DnV.A01();
        StringBuilder sbA0w = C60O.A0w();
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            C5689DnV.A00((C5901Drk) entryA0l.getValue(), C60O.A0t(entryA0l), sbA0w);
        }
        String string2 = sbA0w.toString();
        int i9 = c6154Dwx4 == null ? 0 : c6154Dwx4.A0Q;
        int i10 = c6154Dwx3 != null ? c6154Dwx3.A0Q : 0;
        String str5 = c6154Dwx4 != null ? c6154Dwx4.A0Y : null;
        C6154Dwx c6154Dwx8 = c5689DnV.A05;
        String str6 = c6154Dwx8 != null ? c6154Dwx8.A0Y : null;
        int i11 = c5689DnV.A0G;
        float fA00 = MosScoreCalculation.A00(c6154Dwx, i11, z5);
        String str7 = c5689DnV.A0P;
        String str8 = c5689DnV.A0O;
        boolean z6 = c5689DnV.A0X;
        C6154Dwx c6154Dwx9 = c5689DnV.A05;
        C5795Dpf c5795Dpf = new C5795Dpf(str, strA0o2, strA0o, strA0o5, strA0o3, strA02, string, strA01, string2, str5, str6, str7, str8, c6154Dwx9 == null ? null : Dl5.A00(c6154Dwx9).A05, c5689DnV.A0A, c5689DnV.A08, c5689DnV.A09, c5689DnV.A0D, c5723DoIArr, fA00, c5689DnV.A00, i4, i, i2, i3, i5, i8, i9, i10, i6, i11, jCurrentTimeMillis, j, j5, j6, j7, j8, j2, j9, j10, j11, j4, j3, c5689DnV.A01, z, z2, z3, z4, z6, c5689DnV.A0F, c5689DnV.A0E);
        c5795Dpf.tasosSconeSignalState = null;
        c5795Dpf.tasosSconeRateCapBps = null;
        c5795Dpf.tasosSconeRateCapApplied = null;
        c5795Dpf.tasosSconeRateCapAgeMs = null;
        vpsEventCallback.A5s(c5795Dpf);
    }
}
