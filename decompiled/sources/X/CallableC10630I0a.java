package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.android.billingclient.api.q;
import com.android.billingclient.r1;
import com.android.billingclient.t5;
import java.util.concurrent.Callable;

/* renamed from: X.I0a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class CallableC10630I0a implements Callable {
    public final int $t;
    public final Object A00;

    public CallableC10630I0a(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws InterruptedException {
        Bundle bundleA0N;
        t5 t5Var;
        boolean z;
        int iA00;
        int iA002;
        if (this.$t != 0) {
            ((C10443Hhq) this.A00).A00();
            throw new NullPointerException("secondPassRenderResult");
        }
        ServiceConnectionC9532GNj serviceConnectionC9532GNj = (ServiceConnectionC9532GNj) this.A00;
        C9530GNh c9530GNh = serviceConnectionC9532GNj.A03;
        Object obj = c9530GNh.A0O;
        synchronized (obj) {
            if (c9530GNh.A0R == 3) {
                return null;
            }
            int i = 0;
            boolean zA1Q = AnonymousClass002.A1Q(c9530GNh.A0R, 1);
            if (TextUtils.isEmpty(null)) {
                bundleA0N = null;
            } else {
                bundleA0N = BV6.A0N();
                bundleA0N.putString("accountName", null);
                GNN.A04(bundleA0N, c9530GNh.A0P, c9530GNh.A0Q, c9530GNh.A0N.longValue());
            }
            EnumC9535GNn enumC9535GNn = EnumC9535GNn.A1A;
            synchronized (obj) {
                t5Var = c9530GNh.A0U;
            }
            if (t5Var == null) {
                C9530GNh.A09(c9530GNh, 0);
                EnumC9535GNn enumC9535GNn2 = EnumC9535GNn.A1I;
                GNM gnm = GO0.A0M;
                C9530GNh.A0D(c9530GNh, gnm, enumC9535GNn2);
                serviceConnectionC9532GNj.A07(gnm);
                return null;
            }
            Context context = c9530GNh.A01;
            context.getPackageName();
            try {
                Parcel parcelObtain = Parcel.obtain();
                String str = t5Var.A01;
                parcelObtain.writeInterfaceToken(str);
                AbstractC7609F5w.A18(parcelObtain, "inapp", 25);
                if (r1.A00(parcelObtain, t5Var, 1) == 0) {
                    synchronized (GPE.class) {
                    }
                    synchronized (GPE.class) {
                    }
                    long jMin = 100;
                    synchronized (GPE.class) {
                    }
                    synchronized (GPE.class) {
                    }
                    Exception e = null;
                    while (true) {
                        long j = i;
                        if (j > 3) {
                            break;
                        }
                        try {
                            Boolean boolValueOf = Boolean.valueOf(zA1Q);
                            Bundle bundleA0N2 = BV6.A0N();
                            bundleA0N2.putString("callingPackage", context.getPackageName());
                            GNN.A04(bundleA0N2, c9530GNh.A0P, c9530GNh.A0Q, c9530GNh.A0N.longValue());
                            if (c9530GNh.A02 != null) {
                                bundleA0N2.putBoolean("enablePendingPurchases", true);
                            }
                            String packageName = context.getPackageName();
                            q qVar = new q(c9530GNh, serviceConnectionC9532GNj, boolValueOf, i);
                            Parcel parcelObtain2 = Parcel.obtain();
                            parcelObtain2.writeInterfaceToken(str);
                            parcelObtain2.writeInt(25);
                            parcelObtain2.writeString(packageName);
                            parcelObtain2.writeInt(1);
                            bundleA0N2.writeToParcel(parcelObtain2, 0);
                            parcelObtain2.writeStrongBinder(qVar.asBinder());
                            t5Var.A03(parcelObtain2, 2101);
                            return null;
                        } catch (SecurityException e2) {
                            ServiceConnectionC9532GNj.A02(serviceConnectionC9532GNj, e2, i, zA1Q);
                            return null;
                        } catch (Exception e3) {
                            e = e3;
                            if (j == 3) {
                                break;
                            }
                            GNN.A07("BillingClient", FGI.A0J("Transient error during initialize(), retrying in ", jMin, "ms"), e);
                            try {
                                Thread.sleep(jMin);
                                jMin = (long) Math.min(jMin * 2.0d, 60000.0d);
                                i++;
                            } catch (InterruptedException e4) {
                                BV4.A1A();
                                ServiceConnectionC9532GNj.A02(serviceConnectionC9532GNj, e4, i, zA1Q);
                                return null;
                            }
                        }
                    }
                    ServiceConnectionC9532GNj.A02(serviceConnectionC9532GNj, e, i, zA1Q);
                    return null;
                }
                int i2 = 29;
                int i3 = 29;
                while (true) {
                    if (i3 < 3) {
                        i3 = 0;
                        z = false;
                        break;
                    }
                    try {
                        GNN.A05("BillingClient", FGI.A0H("trying subs apiVersion: ", i3));
                        if (bundleA0N == null) {
                            Parcel parcelObtain3 = Parcel.obtain();
                            parcelObtain3.writeInterfaceToken(str);
                            AbstractC7609F5w.A18(parcelObtain3, "subs", i3);
                            iA002 = r1.A00(parcelObtain3, t5Var, 1);
                        } else {
                            Parcel parcelObtain4 = Parcel.obtain();
                            parcelObtain4.writeInterfaceToken(str);
                            AbstractC7609F5w.A18(parcelObtain4, "subs", i3);
                            parcelObtain4.writeInt(1);
                            bundleA0N.writeToParcel(parcelObtain4, 0);
                            iA002 = r1.A00(parcelObtain4, t5Var, 10);
                        }
                        if (iA002 == 0) {
                            GNN.A05("BillingClient", FGI.A0H("highestLevelSupportedForSubs: ", i3));
                            z = true;
                            break;
                        }
                        i3--;
                    } catch (Exception e5) {
                        ServiceConnectionC9532GNj.A03(serviceConnectionC9532GNj, e5, zA1Q);
                        return null;
                    }
                }
                c9530GNh.A09 = z;
                if (i3 < 3) {
                    enumC9535GNn = EnumC9535GNn.A1Y;
                    GNN.A05("BillingClient", "In-app billing API does not support subscription on this device.");
                }
                while (true) {
                    GNN.A05("BillingClient", FGI.A0H("trying inapp apiVersion: ", i2));
                    if (bundleA0N == null) {
                        Parcel parcelObtain5 = Parcel.obtain();
                        parcelObtain5.writeInterfaceToken(str);
                        AbstractC7609F5w.A18(parcelObtain5, "inapp", i2);
                        iA00 = r1.A00(parcelObtain5, t5Var, 1);
                    } else {
                        Parcel parcelObtain6 = Parcel.obtain();
                        parcelObtain6.writeInterfaceToken(str);
                        AbstractC7609F5w.A18(parcelObtain6, "inapp", i2);
                        parcelObtain6.writeInt(1);
                        bundleA0N.writeToParcel(parcelObtain6, 0);
                        iA00 = r1.A00(parcelObtain6, t5Var, 10);
                    }
                    if (iA00 != 0) {
                        i2--;
                        if (i2 < 3) {
                            break;
                        }
                    } else {
                        c9530GNh.A00 = i2;
                        GNN.A05("BillingClient", FGI.A0H("mHighestLevelSupportedForInApp: ", i2));
                        break;
                    }
                }
                C9530GNh.A07(c9530GNh, c9530GNh.A00);
                if (c9530GNh.A00 < 3) {
                    enumC9535GNn = EnumC9535GNn.A0V;
                    GNN.A06("BillingClient", "In-app billing API version 3 is not supported on this device.");
                }
                C9530GNh.A08(c9530GNh, iA00);
                if (iA00 == 0) {
                    serviceConnectionC9532GNj.A06(0, zA1Q);
                    serviceConnectionC9532GNj.A07(GO0.A0L);
                    return null;
                }
                GNM gnm2 = GO0.A0E;
                serviceConnectionC9532GNj.A08(gnm2, enumC9535GNn, null, 0, zA1Q);
                serviceConnectionC9532GNj.A07(gnm2);
                return null;
            } catch (Exception e6) {
                ServiceConnectionC9532GNj.A03(serviceConnectionC9532GNj, e6, zA1Q);
                return null;
            }
        }
    }
}
