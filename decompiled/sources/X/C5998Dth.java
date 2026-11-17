package X;

import android.net.Uri;

/* renamed from: X.Dth, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5998Dth {
    public static final Object A0G = C3cG.A0T();
    public static final C5704Dnm A0H;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public C5777DpJ A08;
    public Object A0A;

    @Deprecated
    public Object A0B;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public Object A0C = A0G;
    public C5704Dnm A09 = A0H;

    public final void A00(C5777DpJ c5777DpJ, C5704Dnm c5704Dnm, Object obj, Object obj2, int i, long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2) {
        C5568Dkm c5568Dkm;
        this.A0C = obj;
        this.A09 = c5704Dnm != null ? c5704Dnm : A0H;
        this.A0B = (c5704Dnm == null || (c5568Dkm = c5704Dnm.A03) == null) ? null : c5568Dkm.A04;
        this.A0A = obj2;
        this.A06 = j;
        this.A07 = j2;
        this.A04 = j3;
        this.A0F = z;
        this.A0D = z2;
        this.A08 = c5777DpJ;
        this.A02 = j4;
        this.A03 = j5;
        this.A00 = 0;
        this.A01 = i;
        this.A05 = j6;
        this.A0E = false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && BV5.A1T(this, obj)) {
                C5998Dth c5998Dth = (C5998Dth) obj;
                if (!C6xC.A00(this.A0C, c5998Dth.A0C) || !C6xC.A00(this.A09, c5998Dth.A09) || !C6xC.A00(this.A0A, c5998Dth.A0A) || !C6xC.A00(this.A08, c5998Dth.A08) || this.A06 != c5998Dth.A06 || this.A07 != c5998Dth.A07 || this.A04 != c5998Dth.A04 || this.A0F != c5998Dth.A0F || this.A0D != c5998Dth.A0D || this.A0E != c5998Dth.A0E || this.A02 != c5998Dth.A02 || this.A03 != c5998Dth.A03 || this.A00 != c5998Dth.A00 || this.A01 != c5998Dth.A01 || this.A05 != c5998Dth.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C8j4.A0B(this.A05, (((AnonymousClass006.A06(this.A03, AnonymousClass006.A06(this.A02, (((((AnonymousClass006.A06(this.A04, AnonymousClass006.A06(this.A07, AnonymousClass006.A06(this.A06, (((AnonymousClass005.A0F(this.A09, (217 + this.A0C.hashCode()) * 31) + AnonymousClass006.A0D(this.A0A)) * 31) + C3cH.A02(this.A08)) * 31))) + (this.A0F ? 1 : 0)) * 31) + (this.A0D ? 1 : 0)) * 31) + (this.A0E ? 1 : 0)) * 31)) + this.A00) * 31) + this.A01) * 31);
    }

    static {
        C5608Dln c5608Dln = new C5608Dln();
        c5608Dln.A05 = "androidx.media3.common.Timeline";
        c5608Dln.A00 = Uri.EMPTY;
        A0H = c5608Dln.A00();
    }
}
