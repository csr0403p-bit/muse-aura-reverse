package X;

import com.facebook.aura.browsertask.control.BrowserTaskStopKt;

/* renamed from: X.9G2, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9G2 extends C06G {
    public final float A00;
    public final float A01;
    public final BMk A02;
    public final C07509Wi A03;
    public final C9WY A04;
    public final C8sO A05;
    public final C9WH A06;
    public final C9WB A07;
    public final C9W7 A08;
    public final C9WN A09;
    public final C7cR A0A;
    public final C07429Vx A0B;
    public final C1hd A0C;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9G2) {
                C9G2 c9g2 = (C9G2) obj;
                if (!C1DG.A08(this.A00, c9g2.A00) || !C1DG.A08(this.A01, c9g2.A01) || !C7384Etj.areEqual(this.A08, c9g2.A08) || !C7384Etj.areEqual(this.A03, c9g2.A03) || !C7384Etj.areEqual(this.A0C, c9g2.A0C) || !C7384Etj.areEqual(this.A07, c9g2.A07) || !C7384Etj.areEqual(this.A0B, c9g2.A0B) || !C7384Etj.areEqual(this.A04, c9g2.A04) || !C7384Etj.areEqual(this.A09, c9g2.A09) || !C7384Etj.areEqual(this.A06, c9g2.A06) || !C7384Etj.areEqual(this.A0A, c9g2.A0A) || !C7384Etj.areEqual(this.A05, c9g2.A05) || !C7384Etj.areEqual(this.A02, c9g2.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ C9G2(BMk bMk, C07509Wi c07509Wi, C9WY c9wy, C8sO c8sO, C9WH c9wh, C9WB c9wb, C9W7 c9w7, C9WN c9wn, C7cR c7cR, C07429Vx c07429Vx, C1hd c1hd, int i) {
        BMk bMk2 = bMk;
        C07509Wi c07509Wi2 = c07509Wi;
        C9WY c9wy2 = c9wy;
        C8sO c8sO2 = c8sO;
        C9WH c9wh2 = c9wh;
        C9WB c9wb2 = c9wb;
        C9WN c9wn2 = c9wn;
        C7cR c7cR2 = c7cR;
        C07429Vx c07429Vx2 = c07429Vx;
        C1hd c1hd2 = c1hd;
        C9W7 c9w72 = (i & 4) != 0 ? new C9W7(null, null, 0.0f, 0.0f, 8191, 0L, 0L, 0L, 0L) : c9w7;
        c07509Wi2 = (i & 8) != 0 ? new C07509Wi(null, null, 1023, 0L, 0L, 0L) : c07509Wi2;
        c1hd2 = (i & 16) != 0 ? new C1hd(null, null, null, 0.0f, 0.0f, 0, 31) : c1hd2;
        c9wb2 = (i & 32) != 0 ? new C9WB(16383, 0L) : c9wb2;
        c07429Vx2 = (i & 64) != 0 ? new C07429Vx(null, null, null, 0.0f, 0.0f, 0.0f, 134217727, 0L, 0L, 0L, 0L) : c07429Vx2;
        c9wy2 = (i & 128) != 0 ? new C9WY(null, null, 0.0f, 0.0f, 0.0f, 16383, 0L) : c9wy2;
        c9wn2 = (i & 256) != 0 ? new C9WN(null, null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 131071, 0L) : c9wn2;
        c9wh2 = (i & 512) != 0 ? new C9WH(null, null, null, 0.0f, 0.0f, 0.0f, 32767, 0L) : c9wh2;
        c7cR2 = (i & 1024) != 0 ? new C7cR(null, null, 7) : c7cR2;
        c8sO2 = (i & 2048) != 0 ? new C8sO(null, null, null, 16383) : c8sO2;
        bMk2 = (i & 4096) != 0 ? new BMk(null, 0.0f, BrowserTaskStopKt.HTTP_SERVICE_UNAVAILABLE, 0L) : bMk2;
        AnonymousClass005.A16(c9w72, c07509Wi2, c1hd2, c9wb2, 2);
        AnonymousClass005.A13(c07429Vx2, c9wy2, c9wn2, 6);
        C3cH.A18(c9wh2, c7cR2);
        C7384Etj.A0Y(c8sO2, 11);
        C7384Etj.A0Y(bMk2, 12);
        this.A00 = 16.0f;
        this.A01 = 16.0f;
        this.A08 = c9w72;
        this.A03 = c07509Wi2;
        this.A0C = c1hd2;
        this.A07 = c9wb2;
        this.A0B = c07429Vx2;
        this.A04 = c9wy2;
        this.A09 = c9wn2;
        this.A06 = c9wh2;
        this.A0A = c7cR2;
        this.A05 = c8sO2;
        this.A02 = bMk2;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A02, AnonymousClass005.A0F(this.A05, AnonymousClass005.A0F(this.A0A, AnonymousClass005.A0F(this.A06, AnonymousClass005.A0F(this.A09, AnonymousClass005.A0F(this.A04, AnonymousClass005.A0F(this.A0B, AnonymousClass005.A0F(this.A07, AnonymousClass005.A0F(this.A0C, AnonymousClass005.A0F(this.A03, AnonymousClass005.A0F(this.A08, AnonymousClass005.A02(C8j4.A04(this.A00), this.A01))))))))))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9G2() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 8191);
    }
}
