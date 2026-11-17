package X;

import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import java.io.IOException;
import java.util.List;

/* renamed from: X.DgK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5326DgK implements DDj {
    public C5425DiL A00;
    public C1O A01;
    public final C5327DgL A02;
    public final DEY A03;

    public C5326DgK(C5327DgL c5327DgL, DEY dey) {
        C7384Etj.A0Y(dey, 1);
        this.A02 = c5327DgL;
        this.A03 = dey;
    }

    @Override // X.CXB
    public final void AS2(C1J c1j, C1O c1o, int i, boolean z) {
    }

    @Override // X.DDj
    public final void ATL(DEK dek, long j, long j2, long j3) {
    }

    @Override // X.DDj
    public final /* synthetic */ void AVB() {
    }

    @Override // X.DDj
    public final void AWg() {
        this.A01 = null;
    }

    @Override // X.CXB
    public final void AWh(C1J c1j, C1O c1o, boolean z) {
        C7384Etj.A0Y(c1o, 1);
        C5425DiL c5425DiL = this.A00;
        if (c5425DiL != null) {
            CXB cxb = c5425DiL.A0c;
            if (cxb != null && c5425DiL.A0a == 2) {
                cxb.AWh(null, null, true);
            }
            if (c1o.A07 != null) {
                C4890DDe c4890DDeA00 = C4890DDe.A00(c1o);
                String str = c4890DDeA00 != null ? c4890DDeA00.A0S : null;
                C5328DgM c5328DgM = c5425DiL.A0E.A07;
                if (c5328DgM != null) {
                    C7384Etj.A0Y(str, 0);
                    C5619Dm2 c5619Dm2 = c5328DgM.A00.A0a;
                    String str2 = c5619Dm2.A09;
                    if (str2 == null || !str.equals(str2)) {
                        c5619Dm2.A09 = str;
                        c5619Dm2.A09();
                    }
                }
            }
        }
    }

    @Override // X.DDj
    public final void AWi(IOException iOException) throws NumberFormatException {
        C1O c1o;
        List listA0z;
        C7384Etj.A0Y(iOException, 0);
        if (this.A02.A02 && this.A00 != null && (iOException instanceof HttpDataSource$InvalidResponseCodeException) && (c1o = this.A01) != null) {
            try {
                C4890DDe c4890DDeA00 = C4890DDe.A00(c1o);
                if (c4890DDeA00 != null && c4890DDeA00.A0I > 0 && (listA0z = BV4.A0z("x-fb-next-valid-segment-id", ((HttpDataSource$InvalidResponseCodeException) iOException).headerFields)) != null && listA0z.size() > 0) {
                    Object obj = listA0z.get(0);
                    C7384Etj.A0U(obj);
                    long j = Long.parseLong((String) obj);
                    C4890DDe c4890DDeA002 = C4890DDe.A00(this.A01);
                    A00(c4890DDeA002 != null ? c4890DDeA002.A0I : 0L, j);
                }
            } catch (NumberFormatException e) {
                CFK.A0A("DynamicVideoInfoTracker", "Malformed next-available-predicted-number header", e);
            }
        }
        this.A01 = null;
    }

    @Override // X.DDj
    public final void AWl(C1O c1o, DEK dek) {
        C7384Etj.A0Y(c1o, 0);
        this.A01 = c1o;
    }

    private final void A00(long j, long j2) {
        for (int i = this.A02.A00; j2 > j && i > 0; i--) {
            C5425DiL c5425DiL = this.A00;
            if (c5425DiL != null && j2 > j) {
                BV4.A1F(Long.valueOf(j), c5425DiL.A0I, j2);
            }
            j++;
        }
    }

    @Override // X.InterfaceC4897DDq
    public final void AWj(String str, Object obj) throws NumberFormatException {
        C1O c1o;
        C4890DDe c4890DDeA00;
        AnonymousClass003.A0u(str, obj);
        if (this.A02.A01 && str.equals("x-fb-next-valid-segment-id") && (c1o = this.A01) != null) {
            try {
                long j = Long.parseLong((String) obj);
                if (c1o.A07 == null || (c4890DDeA00 = C4890DDe.A00(c1o)) == null) {
                    return;
                }
                long j2 = c4890DDeA00.A0I;
                if (j2 > 0) {
                    A00(j2, j);
                }
            } catch (NumberFormatException e) {
                CFK.A0A("DynamicVideoInfoTracker", "Malformed predicted-number CDN header", e);
            }
        }
    }

    @Override // X.DDj
    public final void AdA(long j) {
    }

    @Override // X.DDj
    public final void AdN(String str) {
    }

    @Override // X.DDj
    public final /* synthetic */ void AdZ(boolean z) {
    }

    @Override // X.DDj
    public final void ATM(long j, long j2) {
    }

    @Override // X.CXB
    public final void AWk(C1J c1j, C1O c1o, boolean z) {
    }

    @Override // X.CXB
    public final void AWm(C1J c1j, C1O c1o, boolean z) {
    }
}
