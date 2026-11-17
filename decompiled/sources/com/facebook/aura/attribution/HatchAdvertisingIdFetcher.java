package com.facebook.aura.attribution;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BV4;
import X.C06H;
import X.C3cG;
import X.C4001CjU;
import X.C60P;
import X.C60Q;
import X.C7384Etj;
import X.C81;
import X.CFK;
import X.CRy;
import X.CUD;
import X.CZI;
import X.CZd;
import X.CaK;
import X.G0V;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.facebook.aura.analytics.hatch.HatchInstallReferrerLogger;
import com.facebook.aura.analytics.waterfall.HatchPriceImpressionEventDataKt;
import com.facebook.aura.auth.credentialmanager.AuraCredentialManagerFetchHelper;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesManifestException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.internal.ads_identifier.zzd;
import com.google.android.gms.internal.ads_identifier.zzf;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class HatchAdvertisingIdFetcher {
    public static final Companion Companion = new Companion();
    public static final String TAG = "HatchAdvertisingIdFetcher";
    public final Context context;
    public final CZI debugLogger;
    public final Executor executor;

    public final void fetchAdvertisingIdInfo(final G0V<? super Boolean, ? super String, Unit> g0v) {
        C7384Etj.A0Y(g0v, 0);
        this.executor.execute(new Runnable() { // from class: com.facebook.aura.attribution.HatchAdvertisingIdFetcher.fetchAdvertisingIdInfo.1
            @Override // java.lang.Runnable
            public final void run() throws GooglePlayServicesNotAvailableException, TimeoutException, IOException {
                G0V<Boolean, String, Unit> g0v2;
                Boolean boolA0h;
                String str;
                AdvertisingIdClient.Info infoFetchAdvertisingIdInfoSync = HatchAdvertisingIdFetcher.this.fetchAdvertisingIdInfoSync();
                if (infoFetchAdvertisingIdInfoSync == null || infoFetchAdvertisingIdInfoSync.A01) {
                    g0v2 = g0v;
                    boolA0h = AnonymousClass001.A0h();
                    str = null;
                } else {
                    g0v2 = g0v;
                    boolA0h = AnonymousClass001.A0i();
                    str = infoFetchAdvertisingIdInfoSync.A00;
                }
                g0v2.invoke(boolA0h, str);
            }
        });
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdvertisingIdClient.Info fetchAdvertisingIdInfoSync() throws GooglePlayServicesNotAvailableException, TimeoutException, IOException {
        AdvertisingIdClient.Info info;
        try {
            if (C4001CjU.A00.A01(this.context, 12451000) != 0) {
                return null;
            }
            try {
                AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(this.context);
                try {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    CRy.A06("Calling this from your main thread can lead to deadlock");
                    synchronized (advertisingIdClient) {
                        try {
                            if (advertisingIdClient.A02) {
                            }
                            Context context = advertisingIdClient.A03;
                            try {
                                context.getPackageManager().getPackageInfo(HatchInstallReferrerLogger.PLAY_STORE_PACKAGE, 0);
                                int iA01 = CaK.A00.A01(context, 12451000);
                                if (iA01 != 0 && iA01 != 2) {
                                    throw BV4.A0K("Google Play services not available");
                                }
                                CZd cZd = new CZd();
                                Intent intentA03 = C60P.A03("com.google.android.gms.ads.identifier.service.START");
                                intentA03.setPackage(AuraCredentialManagerFetchHelper.PROVIDER_PACKAGE);
                                try {
                                    if (!CUD.A01(context, intentA03, cZd, CUD.A00(), C60Q.A0e(context), 1)) {
                                        throw BV4.A0K("Connection failure");
                                    }
                                    advertisingIdClient.A00 = cZd;
                                    try {
                                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                        CRy.A06("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
                                        if (cZd.A00) {
                                            throw C3cG.A0Q("Cannot call get on this connection more than once");
                                        }
                                        cZd.A00 = true;
                                        IBinder iBinder = (IBinder) cZd.A01.poll(10000L, timeUnit);
                                        if (iBinder == null) {
                                            throw new TimeoutException("Timed out waiting for the service connection");
                                        }
                                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                                        advertisingIdClient.A01 = iInterfaceQueryLocalInterface instanceof zzf ? (zzf) iInterfaceQueryLocalInterface : new zzd(iBinder);
                                        advertisingIdClient.A02 = true;
                                    } catch (InterruptedException unused) {
                                        throw BV4.A0K("Interrupted exception");
                                    } catch (Throwable th) {
                                        throw new IOException(th);
                                    }
                                } catch (Throwable th2) {
                                    throw new IOException(th2);
                                }
                            } catch (PackageManager.NameNotFoundException unused2) {
                                throw new GooglePlayServicesNotAvailableException();
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    CRy.A06("Calling this from your main thread can lead to deadlock");
                    synchronized (advertisingIdClient) {
                        try {
                            if (!advertisingIdClient.A02) {
                                synchronized (advertisingIdClient.A04) {
                                    try {
                                        throw BV4.A0K("AdvertisingIdClient is not connected.");
                                    } catch (Throwable th4) {
                                        throw th4;
                                    }
                                }
                            }
                            CRy.A03(advertisingIdClient.A00);
                            zzf zzfVar = advertisingIdClient.A01;
                            CRy.A03(zzfVar);
                            try {
                                Parcel parcelObtain = Parcel.obtain();
                                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                                Parcel parcelA00 = ((zzd) zzfVar).A00(parcelObtain, 1);
                                String string = parcelA00.readString();
                                parcelA00.recycle();
                                zzd zzdVar = (zzd) advertisingIdClient.A01;
                                Parcel parcelObtain2 = Parcel.obtain();
                                parcelObtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                                parcelObtain2.writeInt(1);
                                Parcel parcelA002 = zzdVar.A00(parcelObtain2, 2);
                                boolean zA1L = AnonymousClass002.A1L(parcelA002.readInt());
                                parcelA002.recycle();
                                info = new AdvertisingIdClient.Info(string, zA1L);
                            } catch (RemoteException e) {
                                Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                                throw BV4.A0K("Remote exception");
                            }
                        } finally {
                        }
                    }
                    synchronized (advertisingIdClient.A04) {
                        try {
                        } finally {
                        }
                    }
                    long jA04 = C3cG.A04(jElapsedRealtime);
                    if (Math.random() <= 0.0d) {
                        HashMap mapA0u = BV4.A0u();
                        mapA0u.put("app_context", "1");
                        mapA0u.put("limit_ad_tracking", true != info.A01 ? HatchPriceImpressionEventDataKt.NO_DISCOUNT : "1");
                        String str = info.A00;
                        if (str != null) {
                            mapA0u.put("ad_id_size", Integer.toString(str.length()));
                        }
                        mapA0u.put("tag", "AdvertisingIdClient");
                        mapA0u.put("time_spent", Long.toString(jA04));
                        new C81(mapA0u).start();
                    }
                    return info;
                } finally {
                }
            } catch (Exception e2) {
                CZI.A01(CZI.A00("advertising_id_failure", "Failed to fetch advertising id info", e2, null), "error", this.debugLogger);
                CFK.A0J(TAG, e2, "Failed to fetch advertising id info");
                return null;
            }
        } catch (GooglePlayServicesManifestException e3) {
            CZI.A01(CZI.A00("advertising_id_failure", "Invalid Play services manifest version", e3, null), "error", this.debugLogger);
            return null;
        }
    }

    public HatchAdvertisingIdFetcher(Context context, Executor executor, CZI czi) {
        AnonymousClass005.A0x(context, executor, czi);
        this.context = context;
        this.executor = executor;
        this.debugLogger = czi;
    }
}
