package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.android.billingclient.t5;

/* renamed from: X.GNj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ServiceConnectionC9532GNj implements ServiceConnection {
    public final Hl7 A00;
    public final Hl7 A01;
    public final C9559GOq A02;
    public final /* synthetic */ C9530GNh A03;

    public ServiceConnectionC9532GNj(C9530GNh c9530GNh, C9559GOq c9559GOq) {
        this.A03 = c9530GNh;
        Hs5 hs5 = c9530GNh.A0L;
        this.A00 = new Hl7(hs5);
        this.A01 = new Hl7(hs5);
        this.A02 = c9559GOq;
    }

    private final Long A01(boolean z) {
        C9530GNh c9530GNh = this.A03;
        try {
            if (z) {
                synchronized (c9530GNh.A0O) {
                    try {
                        Hl7 hl7 = this.A00;
                        if (!hl7.A02) {
                            return null;
                        }
                        long jA00 = hl7.A03.A00();
                        if (!hl7.A02) {
                            throw C3cG.A0Q("This stopwatch is already stopped.");
                        }
                        hl7.A02 = false;
                        long j = (jA00 - hl7.A01) + hl7.A00;
                        hl7.A00 = j;
                        return Long.valueOf(j / 1000000);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            synchronized (c9530GNh.A0O) {
                try {
                    Hl7 hl72 = this.A01;
                    if (!hl72.A02) {
                        return null;
                    }
                    long jA002 = hl72.A03.A00();
                    if (!hl72.A02) {
                        throw C3cG.A0Q("This stopwatch is already stopped.");
                    }
                    hl72.A02 = false;
                    long j2 = (jA002 - hl72.A01) + hl72.A00;
                    hl72.A00 = j2;
                    return Long.valueOf(j2 / 1000000);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            GNN.A07("BillingClient", "Exception getting connection establishment duration.", th3);
            return null;
        }
    }

    public static final void A02(ServiceConnectionC9532GNj serviceConnectionC9532GNj, Exception exc, int i, boolean z) {
        GNN.A07("BillingClient", "Exception while invoking initialize AIDL method", exc);
        boolean z2 = exc instanceof DeadObjectException;
        EnumC9535GNn enumC9535GNn = z2 ? EnumC9535GNn.A09 : exc instanceof RemoteException ? EnumC9535GNn.A0F : exc instanceof SecurityException ? EnumC9535GNn.A0C : EnumC9535GNn.A06;
        String strA02 = GNr.A02(exc);
        C9530GNh.A09(serviceConnectionC9532GNj.A03, 0);
        serviceConnectionC9532GNj.A08(z2 ? GO0.A0M : GO0.A0K, enumC9535GNn, strA02, i, z);
        serviceConnectionC9532GNj.A07(z2 ? GO0.A0M : GO0.A0K);
    }

    public static final void A03(ServiceConnectionC9532GNj serviceConnectionC9532GNj, Exception exc, boolean z) {
        GNN.A07("BillingClient", "Exception while checking if billing is supported; try to reconnect", exc);
        boolean z2 = exc instanceof DeadObjectException;
        EnumC9535GNn enumC9535GNn = z2 ? EnumC9535GNn.A0f : exc instanceof RemoteException ? EnumC9535GNn.A0c : exc instanceof SecurityException ? EnumC9535GNn.A0i : EnumC9535GNn.A0n;
        String strA02 = enumC9535GNn.equals(EnumC9535GNn.A0n) ? GNr.A02(exc) : null;
        C9530GNh.A09(serviceConnectionC9532GNj.A03, 0);
        serviceConnectionC9532GNj.A08(z2 ? GO0.A0M : GO0.A0K, enumC9535GNn, strA02, 0, z);
        serviceConnectionC9532GNj.A07(z2 ? GO0.A0M : GO0.A0K);
    }

    public final void A07(GNM gnm) {
        C9530GNh c9530GNh = this.A03;
        synchronized (c9530GNh.A0O) {
            if (c9530GNh.A0R == 3) {
                return;
            }
            try {
                C9559GOq c9559GOq = this.A02;
                C7384Etj.A0Y(gnm, 0);
                c9559GOq.A00.A01.invoke(new GOD(gnm));
            } catch (Throwable th) {
                GNN.A07("BillingClient", "Exception while calling onBillingSetupFinished.", th);
            }
        }
    }

    public final void A08(GNM gnm, EnumC9535GNn enumC9535GNn, String str, int i, boolean z) {
        try {
            int i2 = C9543GNz.c;
            C9528GNf c9528GNf = new C9528GNf();
            GIF.A06(gnm, GIG.A00(c9528GNf), c9528GNf, gnm.A00);
            C9543GNz.A0A(enumC9535GNn, GIG.A00(c9528GNf));
            C9543GNz c9543GNzA00 = GIG.A00(c9528GNf);
            c9543GNzA00.bitField0_ |= 32;
            c9543GNzA00.initializeRetryAttemptCount_ = i;
            if (str != null) {
                C9543GNz c9543GNzA002 = GIG.A00(c9528GNf);
                c9543GNzA002.getClass();
                c9543GNzA002.bitField0_ |= 8;
                c9543GNzA002.additionalDetails_ = str;
            }
            Long lA01 = A01(z);
            if (!z) {
                int i3 = GO5.c;
                GOi gOi = new GOi();
                A04(gOi, c9528GNf, lA01);
                ((GNT) this.A03.A04).A07((GO5) gOi.A03());
                return;
            }
            int i4 = GO4.c;
            C9556GOn c9556GOn = new C9556GOn();
            GIF.A08(c9556GOn);
            A05(c9556GOn, lA01, i);
            C9530GNh c9530GNh = this.A03;
            int i5 = C9541GNx.c;
            GOC goc = new GOC();
            goc.A05(c9528GNf);
            C9541GNx.A0A((C9541GNx) GIG.A02(goc), EnumC9540GNw.A07);
            C9530GNh.A0E(c9530GNh, A00(goc, c9556GOn));
        } catch (Throwable th) {
            GNN.A07("BillingClient", "Unable to log.", th);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        boolean zA1Q;
        GNN.A06("BillingClient", "Billing service died.");
        try {
            C9530GNh c9530GNh = this.A03;
            synchronized (c9530GNh.A0O) {
                zA1Q = BV7.A1Q(c9530GNh.A0R);
            }
            if (zA1Q) {
                GNK gnk = c9530GNh.A04;
                int i = C9541GNx.c;
                GOC goc = new GOC();
                C9541GNx.A0A((C9541GNx) GIG.A02(goc), EnumC9540GNw.A07);
                int i2 = C9543GNz.c;
                C9528GNf c9528GNf = new C9528GNf();
                C9543GNz.A0A(EnumC9535GNn.A1R, GIG.A00(c9528GNf));
                goc.A05(c9528GNf);
                int i3 = GO4.c;
                C9556GOn c9556GOn = new C9556GOn();
                GIF.A08(c9556GOn);
                ((GNT) gnk).A03(A00(goc, c9556GOn));
            } else {
                GNK gnk2 = c9530GNh.A04;
                GJS gjs = GJS.DEFAULT_INSTANCE;
                GNT gnt = (GNT) gnk2;
                try {
                    int i4 = GNU.c;
                    GNX gnx = new GNX();
                    GNU gnuA03 = GIF.A03(gnt.A00, gnx);
                    gjs.getClass();
                    gnuA03.event_ = gjs;
                    GIF.A07(gnuA03, gnt, gnx, 7);
                } catch (Throwable th) {
                    AbstractC7608F5v.A1U(th);
                }
            }
        } catch (Throwable th2) {
            GNN.A07("BillingClient", "Unable to log.", th2);
        }
        C9530GNh c9530GNh2 = this.A03;
        synchronized (c9530GNh2.A0O) {
            if (c9530GNh2.A0R != 3 && c9530GNh2.A0R != 0) {
                C9530GNh.A09(c9530GNh2, 0);
                C9530GNh.A06(c9530GNh2);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        t5 t5Var;
        GNN.A05("BillingClient", "Billing service connected.");
        C9530GNh c9530GNh = this.A03;
        synchronized (c9530GNh.A0O) {
            if (c9530GNh.A0R == 3) {
                return;
            }
            if (iBinder == null) {
                t5Var = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
                t5Var = iInterfaceQueryLocalInterface instanceof t5 ? (t5) iInterfaceQueryLocalInterface : new t5("com.android.vending.billing.IInAppBillingService", iBinder);
            }
            c9530GNh.A0U = t5Var;
            if (C9530GNh.A05(c9530GNh, new Runnable() { // from class: X.GOK
                public static final String __redex_internal_original_name = "j$$ExternalSyntheticLambda1";

                @Override // java.lang.Runnable
                public final void run() {
                    ServiceConnectionC9532GNj serviceConnectionC9532GNj = this.A00;
                    C9530GNh c9530GNh2 = serviceConnectionC9532GNj.A03;
                    C9530GNh.A09(c9530GNh2, 0);
                    EnumC9535GNn enumC9535GNn = EnumC9535GNn.A2H;
                    GNM gnm = GO0.A0N;
                    C9530GNh.A0D(c9530GNh2, gnm, enumC9535GNn);
                    serviceConnectionC9532GNj.A07(gnm);
                }
            }, new CallableC10630I0a(this, 0)) == null) {
                GNM gnmA01 = C9530GNh.A01(c9530GNh);
                C9530GNh.A0D(c9530GNh, gnmA01, EnumC9535GNn.A2K);
                A07(gnmA01);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        boolean zA1O;
        GNN.A06("BillingClient", "Billing service disconnected.");
        try {
            C9530GNh c9530GNh = this.A03;
            synchronized (c9530GNh.A0O) {
                zA1O = BV5.A1O(c9530GNh.A0R, 1);
            }
            if (zA1O) {
                GNK gnk = c9530GNh.A04;
                int i = C9541GNx.c;
                GOC goc = new GOC();
                C9541GNx.A0A((C9541GNx) GIG.A02(goc), EnumC9540GNw.A07);
                int i2 = C9543GNz.c;
                C9528GNf c9528GNf = new C9528GNf();
                C9543GNz.A0A(EnumC9535GNn.A1O, GIG.A00(c9528GNf));
                goc.A05(c9528GNf);
                int i3 = GO4.c;
                C9556GOn c9556GOn = new C9556GOn();
                GIF.A08(c9556GOn);
                ((GNT) gnk).A03(A00(goc, c9556GOn));
            } else {
                GNK gnk2 = c9530GNh.A04;
                GO9 go9 = GO9.DEFAULT_INSTANCE;
                GNT gnt = (GNT) gnk2;
                if (go9 != null) {
                    try {
                        int i4 = GNU.c;
                        GNX gnx = new GNX();
                        GNU gnuA03 = GIF.A03(gnt.A00, gnx);
                        gnuA03.event_ = go9;
                        gnuA03.eventCase_ = 4;
                        gnt.A01.A00((GNU) gnx.A03());
                    } catch (Throwable th) {
                        AbstractC7608F5v.A1U(th);
                    }
                }
            }
        } catch (Throwable th2) {
            GNN.A07("BillingClient", "Unable to log.", th2);
        }
        C9530GNh c9530GNh2 = this.A03;
        synchronized (c9530GNh2.A0O) {
            if (!AbstractC9566GOx.A03) {
                Hl7 hl7 = this.A01;
                hl7.A00 = 0L;
                hl7.A02 = false;
                hl7.A02 = true;
                hl7.A01 = hl7.A03.A00();
                if (c9530GNh2.A0R != 3) {
                    C9530GNh.A09(c9530GNh2, 0);
                }
            } else if (c9530GNh2.A0R != 3 && c9530GNh2.A0R != 0) {
                Hl7 hl72 = this.A01;
                hl72.A00 = 0L;
                hl72.A02 = false;
                hl72.A02 = true;
                hl72.A01 = hl72.A03.A00();
                C9530GNh.A09(c9530GNh2, 0);
            }
        }
    }

    public static C9541GNx A00(GIG gig, GIG gig2) {
        gig.A04();
        C9541GNx c9541GNx = (C9541GNx) gig.A00;
        GO4 go4 = (GO4) gig2.A03();
        c9541GNx.getClass();
        c9541GNx.apiDetails_ = go4;
        c9541GNx.apiDetailsCase_ = 6;
        return (C9541GNx) gig.A03();
    }

    public static void A04(GIG gig, GIG gig2, Number number) {
        gig.A04();
        GO5 go5 = (GO5) gig.A00;
        C9543GNz c9543GNz = (C9543GNz) gig2.A03();
        go5.getClass();
        go5.billingResultDetails_ = c9543GNz;
        go5.bitField0_ |= 1;
        if (number != null) {
            long jLongValue = number.longValue();
            gig.A04();
            GO5 go52 = (GO5) gig.A00;
            go52.bitField0_ |= 2;
            go52.connectionEstablishmentDurationMs_ = jLongValue;
        }
    }

    public static void A05(GIG gig, Number number, int i) {
        gig.A04();
        GO4 go4 = (GO4) gig.A00;
        go4.bitField0_ |= 32;
        go4.initializeRetryAttemptCount_ = i;
        if (number != null) {
            long jLongValue = number.longValue();
            gig.A04();
            GO4 go42 = (GO4) gig.A00;
            go42.bitField0_ |= 4;
            go42.connectionEstablishmentDurationMs_ = jLongValue;
        }
    }

    public final void A06(int i, boolean z) {
        try {
            Long lA01 = A01(z);
            if (z) {
                int i2 = C9542GNy.c;
                C9529GNg c9529GNg = new C9529GNg();
                C9542GNy.A0A(EnumC9540GNw.A07, (C9542GNy) GIG.A02(c9529GNg));
                int i3 = GO4.c;
                C9556GOn c9556GOn = new C9556GOn();
                GIF.A08(c9556GOn);
                A05(c9556GOn, lA01, i);
                C9530GNh c9530GNh = this.A03;
                C9542GNy c9542GNy = (C9542GNy) GIG.A02(c9529GNg);
                GO4 go4 = (GO4) c9556GOn.A03();
                c9542GNy.getClass();
                c9542GNy.apiDetails_ = go4;
                c9542GNy.apiDetailsCase_ = 3;
                C9530GNh.A0F(c9530GNh, (C9542GNy) c9529GNg.A03());
                return;
            }
            int i4 = GO5.c;
            GOi gOi = new GOi();
            int i5 = C9543GNz.c;
            C9528GNf c9528GNf = new C9528GNf();
            C9543GNz c9543GNzA00 = GIG.A00(c9528GNf);
            c9543GNzA00.bitField0_ |= 1;
            c9543GNzA00.responseCode_ = 0;
            C9543GNz c9543GNzA002 = GIG.A00(c9528GNf);
            c9543GNzA002.bitField0_ |= 32;
            c9543GNzA002.initializeRetryAttemptCount_ = i;
            A04(gOi, c9528GNf, lA01);
            ((GNT) this.A03.A04).A07((GO5) gOi.A03());
        } catch (Throwable th) {
            GNN.A07("BillingClient", "Unable to log.", th);
        }
    }
}
