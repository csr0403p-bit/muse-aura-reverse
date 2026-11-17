package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.DDe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4890DDe {
    public C4893DDm A00;
    public Long A01;
    public Long A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final long A0F;
    public final long A0G;
    public final long A0H;
    public final long A0I;
    public final long A0J;
    public final long A0K;
    public final long A0L;
    public final DE7 A0M;
    public final DE6 A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final String A0R;
    public final String A0S;
    public final String A0T;
    public final String A0U;
    public final Map<String, String> A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;

    public C4890DDe() {
        this(DE7.A02, new DE6(), "", null, "", "", "", null, null, null, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1L, -1L, -1L, -1L, -1L, -1L, -1L, false, false, false, false, false, false);
    }

    public static C4890DDe A00(C1O c1o) {
        if (c1o != null) {
            Object obj = c1o.A07;
            if (obj instanceof C4890DDe) {
                return (C4890DDe) obj;
            }
        }
        return new C4890DDe();
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(this.A0Q);
        sbA0w.append(", ");
        sbA0w.append(this.A0F);
        sbA0w.append(", ");
        sbA0w.append(this.A0Z);
        sbA0w.append(", ");
        sbA0w.append(this.A0D);
        sbA0w.append(", ");
        sbA0w.append(this.A0C);
        sbA0w.append(", ");
        sbA0w.append(this.A06);
        sbA0w.append(", ");
        sbA0w.append(this.A0E);
        sbA0w.append(", ");
        sbA0w.append(this.A0b);
        sbA0w.append(", ");
        sbA0w.append(this.A0X);
        sbA0w.append(", ");
        sbA0w.append(this.A0A);
        sbA0w.append(", ");
        sbA0w.append(this.A0K);
        sbA0w.append(", ");
        sbA0w.append(this.A0G);
        sbA0w.append(", ");
        sbA0w.append(this.A07);
        sbA0w.append(", ");
        sbA0w.append(this.A09);
        sbA0w.append(", ");
        sbA0w.append(this.A0B);
        sbA0w.append(", ");
        sbA0w.append(this.A0I);
        sbA0w.append(", ");
        sbA0w.append(this.A08);
        sbA0w.append(", ");
        sbA0w.append(this.A0W);
        sbA0w.append(", ");
        return AnonymousClass001.A0v(this.A0T, sbA0w);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;JZIIIIZZIJLX/DE6;ZIJJJILjava/util/Map<Ljava/lang/String;Ljava/lang/String;>;ILjava/lang/String;LX/DE7;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZLjava/lang/String;)V */
    public C4890DDe(DE7 de7, DE6 de6, String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        HashMap mapA0u = BV4.A0u();
        this.A0V = mapA0u;
        this.A0Q = str;
        this.A0F = j;
        this.A0Z = z;
        this.A0D = i;
        this.A0C = i2;
        this.A06 = i3;
        this.A0E = i4;
        this.A0b = z2;
        this.A0X = z3;
        this.A0A = i5;
        this.A0H = j2;
        this.A0N = de6;
        this.A0a = z4;
        this.A0B = i6;
        this.A0I = j3;
        this.A0K = j4;
        this.A0G = j5;
        this.A07 = i7;
        this.A09 = i8;
        this.A0O = str2;
        if (map != null) {
            mapA0u.putAll(map);
        }
        this.A0M = de7;
        this.A08 = i9;
        this.A0W = z5;
        this.A0T = str3;
        this.A0P = str4;
        this.A0U = str5;
        this.A0S = str6;
        this.A0L = j6;
        this.A0J = j7;
        this.A0Y = z6;
        this.A0R = str7;
        this.A00 = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C4890DDe(DE7 de7, DE6 de6, C4890DDe c4890DDe, String str, int i, int i2, boolean z) {
        String str2 = c4890DDe.A0Q;
        long j = c4890DDe.A0F;
        boolean z2 = c4890DDe.A0Z;
        int i3 = c4890DDe.A0D;
        int i4 = c4890DDe.A0C;
        int i5 = c4890DDe.A06;
        int i6 = c4890DDe.A0E;
        boolean z3 = c4890DDe.A0b;
        boolean z4 = c4890DDe.A0X;
        long j2 = c4890DDe.A0H;
        boolean z5 = c4890DDe.A0a;
        int i7 = c4890DDe.A0B;
        long j3 = c4890DDe.A0I;
        long j4 = c4890DDe.A0K;
        long j5 = c4890DDe.A0G;
        int i8 = c4890DDe.A07;
        Map<String, String> map = c4890DDe.A0V;
        int i9 = c4890DDe.A09;
        this(de7, de6, str2, c4890DDe.A0O, str, c4890DDe.A0P, c4890DDe.A0U, c4890DDe.A0S, c4890DDe.A0R, map, i3, i4, i5, i6, i, i7, i8, i9, i2, j, j2, j3, j4, j5, -1L, -1L, z2, z3, z4, z5, z, c4890DDe.A0Y);
        this.A00 = c4890DDe.A00;
        this.A01 = c4890DDe.A01;
        this.A02 = c4890DDe.A02;
        this.A03 = c4890DDe.A03;
        this.A04 = c4890DDe.A04;
        this.A05 = c4890DDe.A05;
    }
}
