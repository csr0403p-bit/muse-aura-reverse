package X;

import android.content.Context;

/* loaded from: classes6.dex */
public final class GNT implements GNK {
    public C9523GNa A00;
    public final C3848Cfd A01;

    public static C9541GNx A00(GIG gig, GI0 gi0, boolean z) {
        GJ0 gj0 = (GJ0) gi0.A0D();
        gj0.A04();
        C9435GIz c9435GIz = (C9435GIz) gj0.A00;
        int i = C9435GIz.c;
        c9435GIz.bitField0_ |= 2;
        c9435GIz.wasServiceAutoReconnected_ = z;
        gig.A04();
        C9541GNx c9541GNx = (C9541GNx) gig.A00;
        C9435GIz c9435GIz2 = (C9435GIz) gj0.A03();
        c9541GNx.getClass();
        c9541GNx.apiDetails_ = c9435GIz2;
        c9541GNx.apiDetailsCase_ = 7;
        return (C9541GNx) gig.A03();
    }

    public final void A05(C9541GNx c9541GNx, int i, long j) {
        try {
            this.A00 = GIF.A04(this, i);
            C9541GNx c9541GNxA00 = A00((GOC) c9541GNx.A0D(), c9541GNx.apiDetailsCase_ == 7 ? (C9435GIz) c9541GNx.apiDetails_ : C9435GIz.DEFAULT_INSTANCE, false);
            C9523GNa c9523GNa = this.A00;
            if (j != 0) {
                C9524GNb c9524GNb = (C9524GNb) c9523GNa.A0D();
                C9523GNa c9523GNaA01 = GIG.A01(c9524GNb);
                c9523GNaA01.bitField0_ |= 32;
                c9523GNaA01.billingClientTransactionId_ = j;
                c9523GNa = (C9523GNa) c9524GNb.A03();
            }
            A01(c9541GNxA00, this, c9523GNa);
        } catch (Throwable th) {
            AbstractC7608F5v.A1U(th);
        }
    }

    public GNT(Context context, C9523GNa c9523GNa) {
        this.A01 = new C3848Cfd(context);
        this.A00 = c9523GNa;
    }

    public static final void A01(C9541GNx c9541GNx, GNT gnt, C9523GNa c9523GNa) {
        if (c9541GNx != null) {
            try {
                int i = GNU.c;
                GNX gnx = new GNX();
                GNU gnuA03 = GIF.A03(c9523GNa, gnx);
                gnuA03.event_ = c9541GNx;
                GIF.A07(gnuA03, gnt, gnx, 2);
            } catch (Throwable th) {
                AbstractC7608F5v.A1U(th);
            }
        }
    }

    public final void A02(GNM gnm, long j) {
        try {
            int i = C9423GIm.c;
            C9424GIn c9424GIn = new C9424GIn();
            GIF.A09(c9424GIn, EnumC8948FuN.A02);
            C9423GIm.A0A((C9423GIm) GIG.A02(c9424GIn), G4i.A05);
            if (gnm != null) {
                int i2 = C9543GNz.c;
                C9528GNf c9528GNf = new C9528GNf();
                GIF.A06(gnm, GIG.A00(c9528GNf), c9528GNf, gnm.A00);
                C9423GIm c9423GIm = (C9423GIm) GIG.A02(c9424GIn);
                C9543GNz c9543GNz = (C9543GNz) c9528GNf.A03();
                c9423GIm.getClass();
                c9423GIm.billingResultDetails_ = c9543GNz;
                c9423GIm.bitField0_ |= 4;
            }
            int i3 = GNU.c;
            GNX gnx = new GNX();
            C9523GNa c9523GNa = this.A00;
            if (j != 0) {
                c9523GNa = (C9523GNa) GIF.A05(c9523GNa, j);
            }
            GNU gnu = (GNU) GIG.A02(gnx);
            gnu.getClass();
            c9523GNa.getClass();
            gnu.clientMetaInfo_ = c9523GNa;
            gnu.bitField0_ |= 1;
            GNU gnu2 = (GNU) GIG.A02(gnx);
            C9423GIm c9423GIm2 = (C9423GIm) c9424GIn.A03();
            gnu2.getClass();
            gnu2.event_ = c9423GIm2;
            GIF.A07(gnu2, this, gnx, 5);
        } catch (Throwable th) {
            AbstractC7608F5v.A1U(th);
        }
    }

    public final void A03(C9541GNx c9541GNx) {
        try {
            A01(c9541GNx, this, this.A00);
        } catch (Throwable th) {
            AbstractC7608F5v.A1U(th);
        }
    }

    public final void A07(GO5 go5) {
        try {
            C3848Cfd c3848Cfd = this.A01;
            int i = GNU.c;
            GNX gnx = new GNX();
            GNU gnuA03 = GIF.A03(this.A00, gnx);
            gnuA03.event_ = go5;
            gnuA03.eventCase_ = 8;
            c3848Cfd.A00((GNU) gnx.A03());
        } catch (Throwable th) {
            AbstractC7608F5v.A1U(th);
        }
    }

    public final void A08(C9542GNy c9542GNy, C9523GNa c9523GNa) {
        if (c9542GNy != null) {
            try {
                int i = GNU.c;
                GNX gnx = new GNX();
                GNU gnuA03 = GIF.A03(c9523GNa, gnx);
                gnuA03.event_ = c9542GNy;
                gnuA03.eventCase_ = 3;
                this.A01.A00((GNU) gnx.A03());
            } catch (Throwable th) {
                AbstractC7608F5v.A1U(th);
            }
        }
    }

    public final void A09(GNV gnv) {
        try {
            int i = GNU.c;
            GNX gnx = new GNX();
            C9523GNa c9523GNa = this.A00;
            GNU gnu = (GNU) GIG.A02(gnx);
            gnu.getClass();
            c9523GNa.getClass();
            gnu.clientMetaInfo_ = c9523GNa;
            gnu.bitField0_ |= 1;
            int i2 = C9423GIm.c;
            C9424GIn c9424GIn = new C9424GIn();
            C9423GIm c9423GIm = (C9423GIm) GIG.A02(c9424GIn);
            c9423GIm.getClass();
            c9423GIm.bitField0_ |= 1;
            c9423GIm.details_ = "ProxyBillingBroadcastReceiver";
            GIF.A09(c9424GIn, EnumC8948FuN.A01);
            C9423GIm c9423GIm2 = (C9423GIm) GIG.A02(c9424GIn);
            c9423GIm2.getClass();
            c9423GIm2.registerFailure_ = gnv;
            c9423GIm2.bitField0_ |= 32;
            GNU gnu2 = (GNU) GIG.A02(gnx);
            C9423GIm c9423GIm3 = (C9423GIm) c9424GIn.A03();
            gnu2.getClass();
            gnu2.event_ = c9423GIm3;
            GIF.A07(gnu2, this, gnx, 5);
        } catch (Throwable th) {
            AbstractC7608F5v.A1U(th);
        }
    }

    public final void A04(C9541GNx c9541GNx, int i) {
        try {
            this.A00 = GIF.A04(this, i);
            A03(c9541GNx);
        } catch (Throwable th) {
            AbstractC7608F5v.A1U(th);
        }
    }

    public final void A06(C9541GNx c9541GNx, long j, boolean z) {
        try {
            C9541GNx c9541GNxA00 = A00((GOC) c9541GNx.A0D(), c9541GNx.apiDetailsCase_ == 7 ? (C9435GIz) c9541GNx.apiDetails_ : C9435GIz.DEFAULT_INSTANCE, z);
            C9523GNa c9523GNa = this.A00;
            if (j != 0) {
                c9523GNa = (C9523GNa) GIF.A05(c9523GNa, j);
            }
            A01(c9541GNxA00, this, c9523GNa);
        } catch (Throwable th) {
            AbstractC7608F5v.A1U(th);
        }
    }
}
