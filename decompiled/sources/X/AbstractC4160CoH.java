package X;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.facebook.aura.auth.credentialmanager.AuraCredentialManagerFetchHelper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import com.google.android.gms.common.internal.zzad;
import com.google.android.gms.common.internal.zzd;
import com.google.android.gms.common.internal.zzk;
import com.google.android.gms.internal.common.zzb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.CoH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4160CoH<T extends IInterface> {
    public static final Feature[] A0O = new Feature[0];
    public InterfaceC4395Cv0 A02;
    public IGmsServiceBroker A03;
    public C4376CuW A04;
    public IInterface A07;
    public ServiceConnectionC4171Coa A08;
    public final int A09;
    public final Context A0A;
    public final Handler A0B;
    public final InterfaceC4458Cwa A0C;
    public final InterfaceC4459Cwb A0D;
    public final String A0G;
    public final Looper A0I;
    public final CaK A0J;
    public final C3649Cbe A0K;
    public volatile String A0M;
    public volatile String A0N = null;
    public final Object A0E = C3cG.A0T();
    public final Object A0F = C3cG.A0T();
    public final ArrayList A0H = C3cG.A0h();
    public int A00 = 1;
    public ConnectionResult A01 = null;
    public boolean A06 = false;
    public volatile zzk A0L = null;
    public AtomicInteger A05 = BV4.A13(0);

    public abstract int AHi();

    public static /* bridge */ /* synthetic */ boolean A01(IInterface iInterface, AbstractC4160CoH abstractC4160CoH, int i, int i2) {
        synchronized (abstractC4160CoH.A0E) {
            if (abstractC4160CoH.A00 != i) {
                return false;
            }
            A00(iInterface, abstractC4160CoH, i2);
            return true;
        }
    }

    public final T A03() {
        T t;
        synchronized (this.A0E) {
            if (this.A00 == 5) {
                throw new DeadObjectException();
            }
            if (!isConnected()) {
                throw C3cG.A0Q("Not connected. Call connect() and wait for onConnected() to be called.");
            }
            t = (T) this.A07;
            CRy.A04(t, "Client is connected but service is null");
        }
        return t;
    }

    public final String A04() {
        return this instanceof C4133Cna ? "com.google.android.gms.wearable.internal.IWearableService" : this instanceof C4145Cnp ? "com.google.android.gms.signin.internal.ISignInService" : this instanceof C4196CpV ? "com.google.android.gms.location.internal.IGoogleLocationManagerService" : this instanceof C4174Coe ? "com.google.android.gms.auth.api.internal.IAuthService" : this instanceof C4258Crf ? "com.google.android.gms.auth.api.credentials.internal.ICredentialsService" : this instanceof C4259Crg ? "com.google.android.gms.auth.api.identity.internal.ISignInService" : this instanceof C4121CnK ? "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService" : this instanceof C4257Cre ? "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService" : this instanceof C4113Cmw ? "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService" : this instanceof C4129CnV ? "com.google.android.gms.common.internal.service.IClientTelemetryService" : "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    public void A05(Bundle bundle, IBinder iBinder, int i, int i2) {
        C4167CoT c4167CoT = new C4167CoT(bundle, iBinder, this, i);
        Handler handler = this.A0B;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, c4167CoT));
    }

    public final boolean A06() {
        return (this instanceof C4133Cna) || (this instanceof C4196CpV) || (this instanceof C4174Coe) || (this instanceof C4259Crg) || (this instanceof C4121CnK) || (this instanceof C4257Cre) || (this instanceof C4113Cmw);
    }

    public void A6s(InterfaceC4395Cv0 interfaceC4395Cv0) {
        CRy.A04(interfaceC4395Cv0, "Connection progress callbacks cannot be null.");
        this.A02 = interfaceC4395Cv0;
        A00(null, this, 2);
    }

    public final void A96() {
        this.A05.incrementAndGet();
        ArrayList arrayList = this.A0H;
        synchronized (arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                AbstractC4269Crs abstractC4269Crs = (AbstractC4269Crs) arrayList.get(i);
                synchronized (abstractC4269Crs) {
                    abstractC4269Crs.A00 = null;
                }
            }
            arrayList.clear();
        }
        synchronized (this.A0F) {
            this.A03 = null;
        }
        A00(null, this, 1);
    }

    public final void AJV(IAccountAccessor iAccountAccessor, Set<Scope> set) {
        Bundle bundleA0N;
        if (this instanceof C4145Cnp) {
            C4145Cnp c4145Cnp = (C4145Cnp) this;
            c4145Cnp.A0A.getPackageName();
            bundleA0N = c4145Cnp.A00;
        } else if (this instanceof C4174Coe) {
            bundleA0N = ((C4174Coe) this).A00;
        } else if (this instanceof C4258Crf) {
            C4260Crh c4260Crh = ((C4258Crf) this).A00;
            bundleA0N = BV6.A0N();
            bundleA0N.putString("consumer_package", null);
            bundleA0N.putBoolean("force_save_dialog", c4260Crh.A01);
            bundleA0N.putString("log_session_id", c4260Crh.A00);
        } else if (this instanceof C4259Crg) {
            bundleA0N = ((C4259Crg) this).A00;
        } else if (this instanceof C4129CnV) {
            C3784CeS c3784CeS = ((C4129CnV) this).A00;
            bundleA0N = BV6.A0N();
            String str = c3784CeS.A00;
            if (str != null) {
                bundleA0N.putString("api", str);
            }
        } else {
            bundleA0N = BV6.A0N();
        }
        String str2 = this.A0M;
        int i = this.A09;
        Scope[] scopeArr = GetServiceRequest.A0F;
        Bundle bundleA0N2 = BV6.A0N();
        Feature[] featureArr = GetServiceRequest.A0E;
        GetServiceRequest getServiceRequest = new GetServiceRequest(null, bundleA0N2, null, null, str2, featureArr, featureArr, scopeArr, 6, i, 12451000, 0, true, false);
        getServiceRequest.A03 = this.A0A.getPackageName();
        getServiceRequest.A01 = bundleA0N;
        if (set != null) {
            getServiceRequest.A07 = (Scope[]) set.toArray(new Scope[0]);
        }
        if (AbJ()) {
            getServiceRequest.A00 = new Account("<<default account>>", "com.google");
            if (iAccountAccessor != null) {
                getServiceRequest.A02 = iAccountAccessor.asBinder();
            }
        }
        getServiceRequest.A05 = A0O;
        getServiceRequest.A06 = this instanceof C4133Cna ? AbstractC4136Cnd.A0N : this instanceof C4196CpV ? AbstractC4281CsC.A0F : this instanceof C4259Crg ? AbstractC4328CtQ.A08 : this instanceof C4121CnK ? AbstractC4122CnL.A06 : this instanceof C4257Cre ? AbstractC4335Cta.A0E : this instanceof C4113Cmw ? AbstractC3785CeT.A01 : this instanceof C4129CnV ? AbstractC4108Cmp.A01 : A0O;
        if (A06()) {
            getServiceRequest.A04 = true;
        }
        try {
            synchronized (this.A0F) {
                IGmsServiceBroker iGmsServiceBroker = this.A03;
                if (iGmsServiceBroker != null) {
                    zzd zzdVar = new zzd(this, this.A05.get());
                    zzad zzadVar = (zzad) iGmsServiceBroker;
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        zzb.A01(parcelObtain, zzdVar, "com.google.android.gms.common.internal.IGmsServiceBroker");
                        parcelObtain.writeInt(1);
                        C4158CoD.A05(parcelObtain, getServiceRequest, 0);
                        zzadVar.A00.transact(46, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    } catch (Throwable th) {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        throw th;
                    }
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i2 = this.A05.get();
            Handler handler = this.A0B;
            handler.sendMessage(handler.obtainMessage(6, i2, 3));
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            A05(null, null, 8, this.A05.get());
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            A05(null, null, 8, this.A05.get());
        }
    }

    public final boolean AOH() {
        boolean z;
        synchronized (this.A0E) {
            int i = this.A00;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public boolean AbG() {
        return true;
    }

    public boolean AbJ() {
        return false;
    }

    public final boolean isConnected() {
        boolean zA17;
        synchronized (this.A0E) {
            zA17 = AnonymousClass003.A17(this.A00);
        }
        return zA17;
    }

    public AbstractC4160CoH(Context context, Looper looper, CaK caK, InterfaceC4458Cwa interfaceC4458Cwa, InterfaceC4459Cwb interfaceC4459Cwb, C3649Cbe c3649Cbe, String str, int i) {
        CRy.A04(context, "Context must not be null");
        this.A0A = context;
        CRy.A04(looper, "Looper must not be null");
        this.A0I = looper;
        CRy.A04(c3649Cbe, "Supervisor must not be null");
        this.A0K = c3649Cbe;
        CRy.A04(caK, "API availability must not be null");
        this.A0J = caK;
        this.A0B = new HandlerC4161CoI(looper, this);
        this.A09 = i;
        this.A0C = interfaceC4458Cwa;
        this.A0D = interfaceC4459Cwb;
        this.A0G = str;
    }

    public static final void A00(IInterface iInterface, AbstractC4160CoH abstractC4160CoH, int i) {
        ConnectionResult connectionResultA00;
        C4376CuW c4376CuW;
        if (BV7.A1T(i, 4) != (iInterface != null)) {
            throw BV4.A0P();
        }
        synchronized (abstractC4160CoH.A0E) {
            abstractC4160CoH.A00 = i;
            abstractC4160CoH.A07 = iInterface;
            Bundle bundleA0N = null;
            if (i == 1) {
                ServiceConnectionC4171Coa serviceConnectionC4171Coa = abstractC4160CoH.A08;
                if (serviceConnectionC4171Coa != null) {
                    C3649Cbe c3649Cbe = abstractC4160CoH.A0K;
                    C4376CuW c4376CuW2 = abstractC4160CoH.A04;
                    String str = c4376CuW2.A00;
                    CRy.A03(str);
                    c3649Cbe.A00(serviceConnectionC4171Coa, str, c4376CuW2.A01, c4376CuW2.A02);
                    abstractC4160CoH.A08 = null;
                }
            } else if (i == 2 || i == 3) {
                ServiceConnectionC4171Coa serviceConnectionC4171Coa2 = abstractC4160CoH.A08;
                if (serviceConnectionC4171Coa2 != null && (c4376CuW = abstractC4160CoH.A04) != null) {
                    Log.e("GmsClient", FGI.A0d("Calling connect() while still connected, missing disconnect() for ", c4376CuW.A00, " on ", c4376CuW.A01));
                    C3649Cbe c3649Cbe2 = abstractC4160CoH.A0K;
                    C4376CuW c4376CuW3 = abstractC4160CoH.A04;
                    String str2 = c4376CuW3.A00;
                    CRy.A03(str2);
                    c3649Cbe2.A00(serviceConnectionC4171Coa2, str2, c4376CuW3.A01, c4376CuW3.A02);
                    abstractC4160CoH.A05.incrementAndGet();
                }
                AtomicInteger atomicInteger = abstractC4160CoH.A05;
                ServiceConnectionC4171Coa serviceConnectionC4171Coa3 = new ServiceConnectionC4171Coa(abstractC4160CoH, atomicInteger.get());
                abstractC4160CoH.A08 = serviceConnectionC4171Coa3;
                boolean z = abstractC4160CoH instanceof C4133Cna;
                C4376CuW c4376CuW4 = new C4376CuW((z && ((C4133Cna) abstractC4160CoH).A00.A01()) ? "com.google.android.wearable.app.cn" : AuraCredentialManagerFetchHelper.PROVIDER_PACKAGE, ((abstractC4160CoH instanceof C4259Crg) || (abstractC4160CoH instanceof C4257Cre) || (abstractC4160CoH instanceof C4113Cmw) || (abstractC4160CoH instanceof C4129CnV)) ? true : BV5.A1P(abstractC4160CoH.AHi(), 211700000), z ? "com.google.android.gms.wearable.BIND" : abstractC4160CoH instanceof C4145Cnp ? "com.google.android.gms.signin.service.START" : abstractC4160CoH instanceof C4196CpV ? "com.google.android.location.internal.GoogleLocationManagerService.START" : abstractC4160CoH instanceof C4174Coe ? "com.google.android.gms.auth.service.START" : abstractC4160CoH instanceof C4258Crf ? "com.google.android.gms.auth.api.credentials.service.START" : abstractC4160CoH instanceof C4259Crg ? "com.google.android.gms.auth.api.identity.service.signin.START" : abstractC4160CoH instanceof C4121CnK ? "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START" : abstractC4160CoH instanceof C4257Cre ? "com.google.android.gms.identitycredentials.service.START" : abstractC4160CoH instanceof C4113Cmw ? "com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START" : abstractC4160CoH instanceof C4129CnV ? "com.google.android.gms.common.telemetry.service.START" : "com.google.android.gms.auth.api.signin.service.START");
                abstractC4160CoH.A04 = c4376CuW4;
                boolean z2 = c4376CuW4.A02;
                if (z2 && abstractC4160CoH.AHi() < 17895000) {
                    throw C3cG.A0Q("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(c4376CuW4.A00)));
                }
                C3649Cbe c3649Cbe3 = abstractC4160CoH.A0K;
                String str3 = c4376CuW4.A00;
                CRy.A03(str3);
                String str4 = c4376CuW4.A01;
                String strA0e = abstractC4160CoH.A0G;
                if (strA0e == null) {
                    strA0e = C60Q.A0e(abstractC4160CoH.A0A);
                }
                Cbb cbb = new Cbb(str3, str4, z2);
                HashMap map = c3649Cbe3.A02;
                synchronized (map) {
                    try {
                        Cbc cbc = (Cbc) map.get(cbb);
                        if (cbc == null) {
                            cbc = new Cbc(cbb, c3649Cbe3);
                            cbc.A05.put(serviceConnectionC4171Coa3, serviceConnectionC4171Coa3);
                            connectionResultA00 = Cbc.A00(cbc, strA0e);
                            map.put(cbb, cbc);
                        } else {
                            c3649Cbe3.A04.removeMessages(0, cbb);
                            Map map2 = cbc.A05;
                            if (map2.containsKey(serviceConnectionC4171Coa3)) {
                                throw BV5.A0U("Trying to bind a GmsServiceConnection that was already connected before.  config=", cbb.toString());
                            }
                            map2.put(serviceConnectionC4171Coa3, serviceConnectionC4171Coa3);
                            int i2 = cbc.A00;
                            if (i2 == 1) {
                                serviceConnectionC4171Coa3.onServiceConnected(cbc.A01, cbc.A02);
                            } else if (i2 == 2) {
                                connectionResultA00 = Cbc.A00(cbc, strA0e);
                            }
                            connectionResultA00 = null;
                        }
                        if (cbc.A03) {
                            connectionResultA00 = ConnectionResult.A04;
                        } else if (connectionResultA00 == null) {
                            connectionResultA00 = new ConnectionResult(-1);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                int i3 = connectionResultA00.A01;
                if (i3 != 0) {
                    C4376CuW c4376CuW5 = abstractC4160CoH.A04;
                    BV4.A1L("unable to connect to service: ", c4376CuW5.A00, " on ", c4376CuW5.A01, "GmsClient");
                    if (i3 == -1) {
                        i3 = 16;
                    }
                    PendingIntent pendingIntent = connectionResultA00.A02;
                    if (pendingIntent != null) {
                        bundleA0N = BV6.A0N();
                        bundleA0N.putParcelable("pendingIntent", pendingIntent);
                    }
                    int i4 = atomicInteger.get();
                    C4238Cr2 c4238Cr2 = new C4238Cr2(bundleA0N, abstractC4160CoH, i3);
                    Handler handler = abstractC4160CoH.A0B;
                    handler.sendMessage(handler.obtainMessage(7, i4, -1, c4238Cr2));
                }
            } else if (i == 4) {
                CRy.A03(iInterface);
                System.currentTimeMillis();
            }
        }
    }
}
