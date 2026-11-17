package X;

import com.facebook.aura.sharesheet.HatchVideoAudioStripperKt;

/* renamed from: X.962, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass962 extends C06G {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final float A09;
    public final float A0A;
    public final float A0B;
    public final float A0C;
    public final float A0D;
    public final float A0E;
    public final float A0F;
    public final long A0G;
    public final long A0H;
    public final long A0I;
    public final long A0J;
    public final long A0K;
    public final long A0L;
    public final long A0M;
    public final C1824Aro A0N;
    public final C1822Arm A0O;
    public final C1822Arm A0P;
    public final C1822Arm A0Q;
    public final C1822Arm A0R;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass962) {
                AnonymousClass962 anonymousClass962 = (AnonymousClass962) obj;
                if (C1DG.A08(this.A0E, anonymousClass962.A0E) && C1DG.A08(this.A0F, anonymousClass962.A0F) && C1DG.A08(this.A01, anonymousClass962.A01) && C1DG.A08(this.A0C, anonymousClass962.A0C) && C1DG.A08(this.A0A, anonymousClass962.A0A) && C1DG.A08(this.A0D, anonymousClass962.A0D) && C1DG.A08(this.A0B, anonymousClass962.A0B)) {
                    long j = this.A0M;
                    long j2 = anonymousClass962.A0M;
                    long j3 = B6A.A01;
                    if (j != j2 || !C7384Etj.areEqual(this.A0R, anonymousClass962.A0R) || !C7384Etj.areEqual(this.A0O, anonymousClass962.A0O) || !C7384Etj.areEqual(this.A0Q, anonymousClass962.A0Q) || this.A0I != anonymousClass962.A0I || !C1DG.A08(this.A09, anonymousClass962.A09) || !C1DG.A08(this.A06, anonymousClass962.A06) || !C1DG.A08(this.A00, anonymousClass962.A00) || !C1DG.A08(this.A08, anonymousClass962.A08) || !C1DG.A08(this.A03, anonymousClass962.A03) || !C1DG.A08(this.A02, anonymousClass962.A02) || !C1DG.A08(this.A04, anonymousClass962.A04) || this.A0G != anonymousClass962.A0G || this.A0H != anonymousClass962.A0H || this.A0J != anonymousClass962.A0J || !C1DG.A08(this.A07, anonymousClass962.A07) || !C1DG.A08(this.A05, anonymousClass962.A05) || this.A0L != anonymousClass962.A0L || this.A0K != anonymousClass962.A0K || !C7384Etj.areEqual(this.A0P, anonymousClass962.A0P) || !C7384Etj.areEqual(this.A0N, anonymousClass962.A0N)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ AnonymousClass962(C1824Aro c1824Aro, C1822Arm c1822Arm, C1822Arm c1822Arm2, C1822Arm c1822Arm3, C1822Arm c1822Arm4, float f, float f2, float f3, float f4, float f5, float f6, int i, long j, long j2, long j3, long j4, long j5, long j6) {
        C1824Aro c1824Aro2 = c1824Aro;
        C1822Arm c1822Arm5 = c1822Arm;
        C1822Arm c1822Arm6 = c1822Arm2;
        C1822Arm c1822Arm7 = c1822Arm3;
        C1822Arm c1822Arm8 = c1822Arm4;
        float f7 = f2;
        float f8 = f3;
        float f9 = f4;
        float f10 = f5;
        float f11 = f6;
        long jA0U = j;
        long j7 = j2;
        long j8 = j3;
        long j9 = j4;
        long j10 = j5;
        long j11 = j6;
        float f12 = (i & 4) != 0 ? Float.NaN : f;
        f7 = (i & 8) != 0 ? 80.0f : f7;
        f8 = (i & 16) != 0 ? 16.0f : f8;
        jA0U = (i & 128) != 0 ? C8j3.A0U(4294967295L) : jA0U;
        if ((i & 256) != 0) {
            long jA03 = C19U.A03(14);
            C1736ApY c1736ApY = C1736ApY.A05;
            long jA0U2 = C8j3.A0U(4280036147L);
            C1822Arm c1822Arm9 = C1822Arm.A03;
            long j12 = C1809ArT.A01;
            c1822Arm5 = new C1822Arm(null, null, c1736ApY, 0, 0, jA0U2, jA03, j12, B6A.A07, j12);
        }
        if ((i & 512) != 0) {
            long jA032 = C19U.A03(12);
            C1736ApY c1736ApY2 = C1736ApY.A04;
            long jA0U3 = C8j3.A0U(4282800745L);
            C1822Arm c1822Arm10 = C1822Arm.A03;
            long j13 = C1809ArT.A01;
            c1822Arm6 = new C1822Arm(null, null, c1736ApY2, 0, 0, jA0U3, jA032, j13, B6A.A07, j13);
        }
        c1822Arm7 = (i & 1024) != 0 ? null : c1822Arm7;
        long j14 = B6A.A07;
        f9 = (i & 8192) != 0 ? 96.0f : f9;
        f10 = (i & 65536) != 0 ? 56.0f : f10;
        f11 = (i & 131072) != 0 ? 8.0f : f11;
        j7 = (i & 524288) != 0 ? 4292927712L << 32 : j7;
        j8 = (i & 1048576) != 0 ? 4287137928L << 32 : j8;
        j9 = (i & 2097152) != 0 ? 4278215889L << 32 : j9;
        j10 = (i & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES) != 0 ? 4282170402L << 32 : j10;
        j11 = (i & 33554432) != 0 ? 4293211197L << 32 : j11;
        if ((i & 67108864) != 0) {
            C1822Arm c1822Arm11 = C1822Arm.A03;
            long jA033 = C19U.A03(16);
            C1736ApY c1736ApY3 = C1736ApY.A01;
            long j15 = C1809ArT.A01;
            c1822Arm8 = new C1822Arm(null, null, c1736ApY3, 0, 0, j14, jA033, j15, j14, j15);
        }
        if ((i & 134217728) != 0) {
            C1736ApY c1736ApY4 = C1736ApY.A05;
            long j16 = C1809ArT.A01;
            c1824Aro2 = new C1824Aro(null, null, null, null, null, c1736ApY4, null, null, null, null, null, j14, j16, j16, j14);
        }
        AnonymousClass002.A1F(c1822Arm5, 8, c1822Arm6);
        C7384Etj.A0Y(c1822Arm8, 26);
        C7384Etj.A0Y(c1824Aro2, 27);
        this.A0E = Float.NaN;
        this.A0F = 41.0f;
        this.A01 = f12;
        this.A0C = f7;
        this.A0A = f8;
        this.A0D = 12.0f;
        this.A0B = 2.0f;
        this.A0M = jA0U;
        this.A0R = c1822Arm5;
        this.A0O = c1822Arm6;
        this.A0Q = c1822Arm7;
        this.A0I = j14;
        this.A09 = 8.0f;
        this.A06 = f9;
        this.A00 = 12.0f;
        this.A08 = 4.0f;
        this.A03 = f10;
        this.A02 = f11;
        this.A04 = 12.0f;
        this.A0G = j7;
        this.A0H = j8;
        this.A0J = j9;
        this.A07 = 2.0f;
        this.A05 = 2.0f;
        this.A0L = j10;
        this.A0K = j11;
        this.A0P = c1822Arm8;
        this.A0N = c1824Aro2;
        if (C1DG.A01(f9, f7 + 12.0f + 4.0f) < 0) {
            throw C60O.A0i(FGI.A0m("sectionHeight (", C1DG.A05(f9), ") must be >= tileHeight (", C1DG.A05(f7), ") + bottomPadding (", C1DG.A05(12.0f), ") + shadowPadding (", C1DG.A05(4.0f), "); otherwise the pager clamps the tile and the card renders squashed"));
        }
    }

    public final int hashCode() {
        int iA02 = AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(C8j4.A04(this.A0E), this.A0F), this.A01), this.A0C), this.A0A), this.A0D), this.A0B);
        long j = this.A0M;
        long j2 = B6A.A01;
        return AnonymousClass005.A0G(this.A0N, AnonymousClass005.A0F(this.A0P, AnonymousClass006.A06(this.A0K, AnonymousClass006.A06(this.A0L, AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass006.A06(this.A0J, AnonymousClass006.A06(this.A0H, AnonymousClass006.A06(this.A0G, AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass006.A06(this.A0I, (AnonymousClass005.A0F(this.A0O, AnonymousClass005.A0F(this.A0R, AnonymousClass006.A06(j, iA02))) + AnonymousClass006.A0D(this.A0Q)) * 31), this.A09), this.A06), this.A00), this.A08), this.A03), this.A02), this.A04)))), this.A07), this.A05)))));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public AnonymousClass962() {
        float f = 0.0f;
        long j = 0;
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, f, f, f, f, f, f, 268435455, j, j, j, j, j, j);
    }
}
