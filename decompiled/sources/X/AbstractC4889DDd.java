package X;

import android.net.Uri;
import java.util.Map;

/* renamed from: X.DDd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4889DDd {
    public static final C1O A00;

    static {
        C1O c1o = C1O.$redex_init_class;
        A00 = new C1O(Uri.parse("www.facebook.com"), null, 0L, -1L);
    }

    public static C1O A00(C1O c1o, boolean z) {
        if (!(c1o.A07 instanceof C4890DDe)) {
            return c1o;
        }
        C4890DDe c4890DDeA00 = C4890DDe.A00(c1o);
        if (c4890DDeA00.A0Y == z) {
            return c1o;
        }
        String str = c4890DDeA00.A0Q;
        long j = c4890DDeA00.A0F;
        boolean z2 = c4890DDeA00.A0Z;
        int i = c4890DDeA00.A0D;
        int i2 = c4890DDeA00.A0C;
        int i3 = c4890DDeA00.A06;
        int i4 = c4890DDeA00.A0E;
        boolean z3 = c4890DDeA00.A0b;
        boolean z4 = c4890DDeA00.A0X;
        int i5 = c4890DDeA00.A0A;
        long j2 = c4890DDeA00.A0H;
        DE6 de6 = c4890DDeA00.A0N;
        boolean z5 = c4890DDeA00.A0a;
        int i6 = c4890DDeA00.A0B;
        long j3 = c4890DDeA00.A0I;
        long j4 = c4890DDeA00.A0K;
        long j5 = c4890DDeA00.A0G;
        int i7 = c4890DDeA00.A07;
        Map<String, String> map = c4890DDeA00.A0V;
        int i8 = c4890DDeA00.A09;
        String str2 = c4890DDeA00.A0O;
        DE7 de7 = c4890DDeA00.A0M;
        int i9 = c4890DDeA00.A08;
        boolean z6 = c4890DDeA00.A0W;
        String str3 = c4890DDeA00.A0T;
        String str4 = c4890DDeA00.A0P;
        String str5 = c4890DDeA00.A0U;
        String str6 = c4890DDeA00.A0S;
        long j6 = c4890DDeA00.A0L;
        long j7 = c4890DDeA00.A0J;
        String str7 = c4890DDeA00.A0R;
        C4893DDm c4893DDm = c4890DDeA00.A00;
        Long l = c4890DDeA00.A01;
        Long l2 = c4890DDeA00.A02;
        boolean z7 = c4890DDeA00.A03;
        boolean z8 = c4890DDeA00.A05;
        Uri uri = c1o.A06;
        long j8 = c1o.A05;
        int i10 = c1o.A01;
        byte[] bArr = c1o.A0A;
        Map<String, String> map2 = c1o.A09;
        long j9 = c1o.A04;
        long j10 = c1o.A03;
        String str8 = c1o.A08;
        int i11 = c1o.A00;
        C4890DDe c4890DDe = new C4890DDe(de7, de6, str, str2, str3, str4, str5, str6, str7, map, i, i2, i3, i4, i5, i6, i7, i8, i9, j, j2, j3, j4, j5, j6, j7, z2, z3, z4, z5, z6, z);
        c4890DDe.A00 = c4893DDm;
        c4890DDe.A01 = l;
        c4890DDe.A02 = l2;
        c4890DDe.A03 = z7;
        c4890DDe.A05 = z8;
        C1G.A04(uri);
        return new C1O(uri, c4890DDe, str8, map2, bArr, i10, i11, j8, j9, j10);
    }

    public static void A01(C1O c1o, String str, String str2) {
        if (str == null || str2 == null || !(c1o.A07 instanceof C4890DDe)) {
            return;
        }
        C4890DDe.A00(c1o).A0V.put(str, str2);
    }
}
