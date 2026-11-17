package X;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageItemInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Parcel;
import com.android.billingclient.d2;
import com.android.billingclient.h5;
import com.android.billingclient.r1;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.GNi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9531GNi extends C9530GNh {
    public final Context A00;
    public volatile int A01;
    public volatile GO8 A02;
    public volatile h5 A03;
    public volatile ScheduledExecutorService A04;

    private final synchronized boolean A0H() {
        if (this.A01 == 2 && this.A03 != null) {
            if (this.A02 != null) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C9530GNh, X.GOL
    public final void A0N() {
        synchronized (this) {
            A0X(EnumC9540GNw.A0D);
            try {
                if (this.A02 != null && this.A03 != null) {
                    GNN.A05("BillingClientTesting", "Unbinding from Billing Override Service.");
                    this.A00.unbindService(this.A02);
                    this.A02 = new GO8(this);
                }
                this.A03 = null;
                if (this.A04 != null) {
                    this.A04.shutdownNow();
                    this.A04 = null;
                }
            } catch (RuntimeException e) {
                GNN.A07("BillingClientTesting", "There was an exception while ending Billing Override Service connection!", e);
            } finally {
                this.A01 = 3;
            }
        }
        super.A0N();
    }

    @Override // X.C9530GNh, X.GOL
    public final void A0R(C9559GOq c9559GOq) {
        int i;
        EnumC9535GNn enumC9535GNn;
        String str;
        EnumC9540GNw enumC9540GNw;
        GNM gnm;
        synchronized (this) {
            if (A0H()) {
                GNN.A05("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                A0X(EnumC9540GNw.A0C);
            } else if (this.A01 == 1) {
                GNN.A06("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
            } else {
                if (this.A01 == 3) {
                    GNN.A06("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
                    enumC9535GNn = EnumC9535GNn.A0b;
                    enumC9540GNw = EnumC9540GNw.A0C;
                    str = "Billing Override Service connection is disconnected.";
                    GNM gnm2 = GO0.A00;
                    gnm = new GNM();
                    gnm.A00 = -1;
                    i = 0;
                } else {
                    this.A01 = 1;
                    GNN.A05("BillingClientTesting", "Starting Billing Override Service setup.");
                    this.A02 = new GO8(this);
                    Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
                    intent.setPackage("com.google.android.apps.play.billingtestcompanion");
                    Context context = this.A00;
                    i = 0;
                    List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
                    enumC9535GNn = EnumC9535GNn.A1A;
                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                        enumC9535GNn = EnumC9535GNn.A0k;
                    } else {
                        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                        if (serviceInfo != null) {
                            String str2 = ((PackageItemInfo) serviceInfo).packageName;
                            String str3 = ((PackageItemInfo) serviceInfo).name;
                            if (!C6xC.A00(str2, "com.google.android.apps.play.billingtestcompanion") || str3 == null) {
                                enumC9535GNn = EnumC9535GNn.A0e;
                                GNN.A06("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                            } else {
                                ComponentName componentName = new ComponentName(str2, str3);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                if (context.bindService(intent2, this.A02, 1)) {
                                    GNN.A05("BillingClientTesting", "Billing Override Service was bonded successfully.");
                                } else {
                                    enumC9535GNn = EnumC9535GNn.A0e;
                                    GNN.A06("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                                }
                            }
                        }
                    }
                    this.A01 = 0;
                    str = "Billing Override Service unavailable on device.";
                    GNN.A05("BillingClientTesting", "Billing Override Service unavailable on device.");
                    enumC9540GNw = EnumC9540GNw.A0C;
                    GNM gnm3 = GO0.A00;
                    gnm = new GNM();
                    gnm.A00 = 2;
                }
                gnm.A01 = i;
                gnm.A02 = str;
                A0U(gnm, enumC9540GNw, enumC9535GNn);
            }
        }
        super.A0R(c9559GOq);
    }

    @Override // X.C9530GNh, X.GOL
    public final GNM A0M(Activity activity, C9545GOb c9545GOb) {
        EnumC9540GNw enumC9540GNw = EnumC9540GNw.A03;
        try {
            int iA07 = BV6.A07(A00(enumC9540GNw).get(28500L, TimeUnit.MILLISECONDS));
            if (iA07 > 0) {
                GNM gnm = GO0.A00;
                GNM gnmA00 = AbstractC9548GOe.A00("Billing override value was set by a license tester.", iA07);
                A0U(gnmA00, enumC9540GNw, EnumC9535GNn.A0l);
                C9530GNh.A0A(this, gnmA00);
                return gnmA00;
            }
        } catch (TimeoutException e) {
            EnumC9535GNn enumC9535GNn = EnumC9535GNn.A15;
            A0U(GO0.A06, EnumC9540GNw.A0E, enumC9535GNn);
            GNN.A07("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e);
        } catch (Exception e2) {
            if (e2 instanceof InterruptedException) {
                BV4.A1A();
            }
            EnumC9535GNn enumC9535GNn2 = EnumC9535GNn.A0r;
            A0U(GO0.A06, EnumC9540GNw.A0E, enumC9535GNn2);
            GNN.A07("BillingClientTesting", "An error occurred while retrieving billing override.", e2);
        }
        try {
            return super.A0M(activity, c9545GOb);
        } catch (Exception e3) {
            EnumC9535GNn enumC9535GNn3 = EnumC9535GNn.A17;
            GNM gnm2 = GO0.A0K;
            A0U(gnm2, enumC9540GNw, enumC9535GNn3);
            GNN.A07("BillingClientTesting", "An internal error occurred.", e3);
            return gnm2;
        }
    }

    @Override // X.C9530GNh, X.GOL
    public final void A0O(final GPB gpb, final GOY goy) {
        A0G(new C10637I0h(goy, 9), EnumC9540GNw.A04, new Runnable() { // from class: X.GOg
            public static final String __redex_internal_original_name = "u$$ExternalSyntheticLambda6";

            @Override // java.lang.Runnable
            public final void run() {
                this.A0T(gpb, goy);
            }
        });
    }

    @Override // X.C9530GNh, X.GOL
    public final void A0P(final GPC gpc, final GOX gox) {
        A0G(new C7578F4r(3, gpc, gox), EnumC9540GNw.A05, new Runnable() { // from class: X.GOf
            public static final String __redex_internal_original_name = "u$$ExternalSyntheticLambda3";

            @Override // java.lang.Runnable
            public final void run() {
                this.A0V(gpc, gox);
            }
        });
    }

    @Override // X.C9530GNh, X.GOL
    public final void A0Q(final GP2 gp2, final GO3 go3) {
        A0G(new C10637I0h(go3, 10), EnumC9540GNw.A08, new Runnable() { // from class: X.GOh
            public static final String __redex_internal_original_name = "u$$ExternalSyntheticLambda8";

            @Override // java.lang.Runnable
            public final void run() {
                this.A0W(gp2, go3);
            }
        });
    }

    public final void A0U(GNM gnm, EnumC9540GNw enumC9540GNw, EnumC9535GNn enumC9535GNn) {
        C9541GNx c9541GNxA00 = GNr.A00(gnm, enumC9540GNw, enumC9535GNn, G4i.A01, null);
        Hqg.A00(c9541GNxA00, "ApiFailure should not be null");
        ((GNT) super.A04).A03(c9541GNxA00);
    }

    public final void A0X(EnumC9540GNw enumC9540GNw) {
        C9542GNy c9542GNyA01 = GNr.A01(enumC9540GNw, G4i.A01);
        Hqg.A00(c9542GNyA01, "ApiSuccess should not be null");
        GNT gnt = (GNT) super.A04;
        gnt.getClass();
        try {
            gnt.A08(c9542GNyA01, gnt.A00);
        } catch (Throwable th) {
            AbstractC7608F5v.A1U(th);
        }
    }

    public C9531GNi(Context context, GPA gpa, Hxa hxa) {
        super(context, gpa, hxa);
        this.A01 = 0;
        this.A00 = context;
    }

    private final ListenableFuture A00(EnumC9540GNw enumC9540GNw) {
        if (!A0H()) {
            GNN.A06("BillingClientTesting", "Billing Override Service is not ready.");
            EnumC9535GNn enumC9535GNn = EnumC9535GNn.A0o;
            EnumC9540GNw enumC9540GNw2 = EnumC9540GNw.A0E;
            GNM gnm = GO0.A00;
            GNM gnm2 = new GNM();
            gnm2.A00 = -1;
            gnm2.A01 = 0;
            gnm2.A02 = "Billing Override Service connection is disconnected.";
            A0U(gnm2, enumC9540GNw2, enumC9535GNn);
            return new C3473CPb(0);
        }
        C9561GOs c9561GOs = new C9561GOs(this, enumC9540GNw);
        C3498CQv c3498CQv = new C3498CQv();
        C3497CQu c3497CQu = new C3497CQu(c3498CQv);
        c3498CQv.A01 = c3497CQu;
        c3498CQv.A02 = c9561GOs.getClass();
        try {
            C9531GNi c9531GNi = c9561GOs.A00;
            EnumC9540GNw enumC9540GNw3 = c9561GOs.A01;
            try {
                c9531GNi.A03.getClass();
                h5 h5Var = c9531GNi.A03;
                String packageName = c9531GNi.A00.getPackageName();
                String strName = enumC9540GNw3.name();
                d2 d2Var = new d2(c3498CQv);
                h5Var.getClass();
                Parcel parcelA01 = r1.A01(h5Var);
                parcelA01.writeString(packageName);
                parcelA01.writeString(strName);
                parcelA01.writeStrongBinder(d2Var.asBinder());
                h5Var.A03(parcelA01, 1);
            } catch (Exception e) {
                EnumC9535GNn enumC9535GNn2 = EnumC9535GNn.A0r;
                c9531GNi.A0U(GO0.A06, EnumC9540GNw.A0E, enumC9535GNn2);
                GNN.A07("BillingClientTesting", "An error occurred while retrieving billing override.", e);
                c3498CQv.A00(BV4.A0V());
            }
            c3498CQv.A02 = "billingOverrideService.getBillingOverride";
            return c3497CQu;
        } catch (Exception e2) {
            c3497CQu.A00.A03(e2);
            return c3497CQu;
        }
    }

    private final void A0G(BeM beM, EnumC9540GNw enumC9540GNw, Runnable runnable) {
        ScheduledExecutorService scheduledExecutorService;
        ListenableFuture listenableFutureA00 = A00(enumC9540GNw);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            if (this.A04 == null) {
                this.A04 = Executors.newSingleThreadScheduledExecutor();
            }
            scheduledExecutorService = this.A04;
        }
        if (!listenableFutureA00.isDone()) {
            CRM crm = new CRM();
            crm.A00 = listenableFutureA00;
            CRB crb = new CRB();
            crb.A00 = crm;
            crm.A01 = scheduledExecutorService.schedule(crb, 28500L, timeUnit);
            listenableFutureA00.addListener(crb, EnumC3452CNy.A01);
            listenableFutureA00 = crm;
        }
        HtW htW = new HtW(beM, this, enumC9540GNw, runnable);
        listenableFutureA00.addListener(new Hjk(htW, listenableFutureA00), A0S());
    }

    public final /* synthetic */ void A0T(GPB gpb, GOY goy) {
        super.A0O(gpb, goy);
    }

    public final /* synthetic */ void A0V(GPC gpc, GOX gox) {
        super.A0P(gpc, gox);
    }

    public final /* synthetic */ void A0W(GP2 gp2, GO3 go3) {
        super.A0Q(gp2, go3);
    }
}
