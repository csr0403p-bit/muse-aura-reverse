package androidx.health.platform.client.impl.sdkservice;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.health.platform.client.impl.sdkservice.HealthDataSdkServiceStubImpl;
import androidx.health.platform.client.impl.sdkservice.IGetPermissionTokenCallback;
import androidx.health.platform.client.impl.sdkservice.IGetPermissionTokenCallback$Stub$Proxy;
import androidx.health.platform.client.impl.sdkservice.ISetPermissionTokenCallback;
import androidx.health.platform.client.impl.sdkservice.ISetPermissionTokenCallback$Stub$Proxy;
import com.facebook.aura.health.HealthConnectPermissionUtils;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.function.Predicate;

/* loaded from: classes5.dex */
public final class HealthDataSdkServiceStubImpl extends Binder implements IHealthDataSdkService {
    public final Context A00;
    public final Executor A01;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    private void A00(final String str) {
        String[] packagesForUid = this.A00.getPackageManager().getPackagesForUid(Binder.getCallingUid());
        if (str == null || packagesForUid == null || Arrays.stream(packagesForUid).noneMatch(new Predicate() { // from class: X.DfN
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return str.equals(obj);
            }
        })) {
            throw new SecurityException("Invalid package name!");
        }
        if (!HealthConnectPermissionUtils.PROVIDER_PACKAGE.equals(str)) {
            throw new SecurityException("Not allowed!");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [androidx.health.platform.client.impl.sdkservice.IGetIsInForegroundCallback] */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.health.platform.client.impl.sdkservice.ISetPermissionTokenCallback] */
    /* JADX WARN: Type inference failed for: r1v8, types: [androidx.health.platform.client.impl.sdkservice.IGetPermissionTokenCallback] */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        final ISetPermissionTokenCallback$Stub$Proxy iSetPermissionTokenCallback$Stub$Proxy;
        Executor executor;
        Runnable runnable;
        final IGetPermissionTokenCallback$Stub$Proxy iGetPermissionTokenCallback$Stub$Proxy;
        final IGetIsInForegroundCallback$Stub$Proxy iGetIsInForegroundCallback$Stub$Proxy;
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("androidx.health.platform.client.impl.sdkservice.IHealthDataSdkService");
                if (i == 1) {
                    String string = parcel.readString();
                    final String string2 = parcel.readString();
                    IBinder strongBinder = parcel.readStrongBinder();
                    if (strongBinder == null) {
                        iSetPermissionTokenCallback$Stub$Proxy = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("androidx.health.platform.client.impl.sdkservice.ISetPermissionTokenCallback");
                        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ISetPermissionTokenCallback)) {
                            ISetPermissionTokenCallback$Stub$Proxy iSetPermissionTokenCallback$Stub$Proxy2 = new ISetPermissionTokenCallback$Stub$Proxy();
                            iSetPermissionTokenCallback$Stub$Proxy2.A00 = strongBinder;
                            iSetPermissionTokenCallback$Stub$Proxy = iSetPermissionTokenCallback$Stub$Proxy2;
                        } else {
                            iSetPermissionTokenCallback$Stub$Proxy = (ISetPermissionTokenCallback) iInterfaceQueryLocalInterface;
                        }
                    }
                    A00(string);
                    executor = this.A01;
                    runnable = new Runnable() { // from class: X.DfL
                        public static final String __redex_internal_original_name = "HealthDataSdkServiceStubImpl$$ExternalSyntheticLambda0";

                        @Override // java.lang.Runnable
                        public final void run() {
                            HealthDataSdkServiceStubImpl healthDataSdkServiceStubImpl = this.A00;
                            String str = string2;
                            ISetPermissionTokenCallback iSetPermissionTokenCallback = iSetPermissionTokenCallback$Stub$Proxy;
                            BV4.A07(healthDataSdkServiceStubImpl.A00, "PermissionTokenManager.healthdata").edit().putString("token", str).commit();
                            try {
                                ISetPermissionTokenCallback$Stub$Proxy iSetPermissionTokenCallback$Stub$Proxy3 = (ISetPermissionTokenCallback$Stub$Proxy) iSetPermissionTokenCallback;
                                Parcel parcelObtain = Parcel.obtain();
                                try {
                                    parcelObtain.writeInterfaceToken("androidx.health.platform.client.impl.sdkservice.ISetPermissionTokenCallback");
                                    iSetPermissionTokenCallback$Stub$Proxy3.A00.transact(1, parcelObtain, null, 1);
                                } finally {
                                    parcelObtain.recycle();
                                }
                            } catch (RemoteException e) {
                                Log.e("HealthDataSdkServiceStubImpl", String.format("HealthDataSdkService#setPermissionToken failed: %s", BV7.A1b(e)));
                            }
                        }
                    };
                } else if (i == 2) {
                    String string3 = parcel.readString();
                    IBinder strongBinder2 = parcel.readStrongBinder();
                    if (strongBinder2 == null) {
                        iGetPermissionTokenCallback$Stub$Proxy = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("androidx.health.platform.client.impl.sdkservice.IGetPermissionTokenCallback");
                        if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof IGetPermissionTokenCallback)) {
                            IGetPermissionTokenCallback$Stub$Proxy iGetPermissionTokenCallback$Stub$Proxy2 = new IGetPermissionTokenCallback$Stub$Proxy();
                            iGetPermissionTokenCallback$Stub$Proxy2.A00 = strongBinder2;
                            iGetPermissionTokenCallback$Stub$Proxy = iGetPermissionTokenCallback$Stub$Proxy2;
                        } else {
                            iGetPermissionTokenCallback$Stub$Proxy = (IGetPermissionTokenCallback) iInterfaceQueryLocalInterface2;
                        }
                    }
                    A00(string3);
                    executor = this.A01;
                    runnable = new Runnable() { // from class: X.DfM
                        public static final String __redex_internal_original_name = "HealthDataSdkServiceStubImpl$$ExternalSyntheticLambda2";

                        @Override // java.lang.Runnable
                        public final void run() {
                            HealthDataSdkServiceStubImpl healthDataSdkServiceStubImpl = this.A00;
                            IGetPermissionTokenCallback iGetPermissionTokenCallback = iGetPermissionTokenCallback$Stub$Proxy;
                            try {
                                String string4 = BV4.A07(healthDataSdkServiceStubImpl.A00, "PermissionTokenManager.healthdata").getString("token", null);
                                if (string4 == null) {
                                    string4 = "";
                                }
                                IGetPermissionTokenCallback$Stub$Proxy iGetPermissionTokenCallback$Stub$Proxy3 = (IGetPermissionTokenCallback$Stub$Proxy) iGetPermissionTokenCallback;
                                Parcel parcelObtain = Parcel.obtain();
                                try {
                                    parcelObtain.writeInterfaceToken("androidx.health.platform.client.impl.sdkservice.IGetPermissionTokenCallback");
                                    parcelObtain.writeString(string4);
                                    iGetPermissionTokenCallback$Stub$Proxy3.A00.transact(1, parcelObtain, null, 1);
                                } finally {
                                    parcelObtain.recycle();
                                }
                            } catch (RemoteException e) {
                                Log.e("HealthDataSdkServiceStubImpl", String.format("HealthDataSdkService#getPermissionToken failed: %s", BV7.A1b(e)));
                            }
                        }
                    };
                } else if (i == 3) {
                    String string4 = parcel.readString();
                    IBinder strongBinder3 = parcel.readStrongBinder();
                    if (strongBinder3 == null) {
                        iGetIsInForegroundCallback$Stub$Proxy = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("androidx.health.platform.client.impl.sdkservice.IGetIsInForegroundCallback");
                        if (iInterfaceQueryLocalInterface3 == null || !(iInterfaceQueryLocalInterface3 instanceof IGetIsInForegroundCallback)) {
                            IGetIsInForegroundCallback$Stub$Proxy iGetIsInForegroundCallback$Stub$Proxy2 = new IGetIsInForegroundCallback$Stub$Proxy();
                            iGetIsInForegroundCallback$Stub$Proxy2.A00 = strongBinder3;
                            iGetIsInForegroundCallback$Stub$Proxy = iGetIsInForegroundCallback$Stub$Proxy2;
                        } else {
                            iGetIsInForegroundCallback$Stub$Proxy = (IGetIsInForegroundCallback) iInterfaceQueryLocalInterface3;
                        }
                    }
                    A00(string4);
                    executor = this.A01;
                    runnable = new Runnable() { // from class: X.DfH
                        public static final String __redex_internal_original_name = "HealthDataSdkServiceStubImpl$$ExternalSyntheticLambda1";

                        /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void run() {
                            /*
                                r4 = this;
                                androidx.health.platform.client.impl.sdkservice.IGetIsInForegroundCallback r4 = r1
                                android.app.ActivityManager$RunningAppProcessInfo r0 = new android.app.ActivityManager$RunningAppProcessInfo     // Catch: android.os.RemoteException -> L38
                                r0.<init>()     // Catch: android.os.RemoteException -> L38
                                android.app.ActivityManager.getMyMemoryState(r0)     // Catch: android.os.RemoteException -> L38
                                int r3 = r0.importance     // Catch: android.os.RemoteException -> L38
                                r2 = 200(0xc8, float:2.8E-43)
                                r0 = 100
                                if (r3 == r0) goto L19
                                r0 = 125(0x7d, float:1.75E-43)
                                if (r3 == r0) goto L19
                                r1 = 0
                                if (r3 != r2) goto L1a
                            L19:
                                r1 = 1
                            L1a:
                                androidx.health.platform.client.impl.sdkservice.IGetIsInForegroundCallback$Stub$Proxy r4 = (androidx.health.platform.client.impl.sdkservice.IGetIsInForegroundCallback$Stub$Proxy) r4     // Catch: android.os.RemoteException -> L38
                                android.os.Parcel r3 = android.os.Parcel.obtain()     // Catch: android.os.RemoteException -> L38
                                java.lang.String r0 = "androidx.health.platform.client.impl.sdkservice.IGetIsInForegroundCallback"
                                r3.writeInterfaceToken(r0)     // Catch: java.lang.Throwable -> L33
                                r3.writeInt(r1)     // Catch: java.lang.Throwable -> L33
                                android.os.IBinder r2 = r4.A00     // Catch: java.lang.Throwable -> L33
                                r1 = 0
                                r0 = 1
                                r2.transact(r0, r3, r1, r0)     // Catch: java.lang.Throwable -> L33
                                r3.recycle()     // Catch: android.os.RemoteException -> L38
                                return
                            L33:
                                r0 = move-exception
                                r3.recycle()     // Catch: android.os.RemoteException -> L38
                                throw r0     // Catch: android.os.RemoteException -> L38
                            L38:
                                r0 = move-exception
                                java.lang.String r2 = "HealthDataSdkServiceStubImpl"
                                java.lang.Object[] r1 = X.BV7.A1b(r0)
                                java.lang.String r0 = "HealthDataSdkService#getIsInForeground failed: %s"
                                java.lang.String r0 = java.lang.String.format(r0, r1)
                                android.util.Log.e(r2, r0)
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.RunnableC5290DfH.run():void");
                        }
                    };
                }
                executor.execute(runnable);
                return true;
            }
            if (i == 1598968902) {
                parcel2.writeString("androidx.health.platform.client.impl.sdkservice.IHealthDataSdkService");
                return true;
            }
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }

    public HealthDataSdkServiceStubImpl() {
        attachInterface(this, "androidx.health.platform.client.impl.sdkservice.IHealthDataSdkService");
    }

    public HealthDataSdkServiceStubImpl(Context context, Executor executor) {
        this();
        this.A00 = context;
        this.A01 = executor;
    }
}
