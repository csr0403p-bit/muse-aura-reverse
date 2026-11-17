package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.SparseArray;
import com.facebook.common.build.BuildConstants;
import com.facebook.common.jobscheduler.compat.ServiceInfoParser$NoJobMetaDataFoundException;
import com.facebook.pushlite.PushLiteGCMJobService;
import com.facebook.pushlite.PushLiteLollipopJobService;

/* loaded from: classes5.dex */
public final class CHZ<T> {
    public static CHZ<?> A05;
    public static CHZ<?> A06;
    public boolean A00;
    public final Context A01;
    public final SparseArray<Class<? extends T>> A02 = BV4.A0B();
    public final Class<?> A03;
    public final String A04;

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (wrap:java.lang.Class:0x0000: CONST_CLASS  A[WRAPPED] X.CHZ.class) */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.CHZ<T>] */
    public static synchronized <T> CHZ<T> A00(Context context, int i) {
        ?? r2;
        synchronized (CHZ.class) {
            if (i != 0) {
                boolean z = (CHZ<T>) A05;
                r2 = z;
                if (!z) {
                    CHZ<?> chz = (CHZ<T>) new CHZ(context.getApplicationContext(), 1);
                    A05 = chz;
                    r2 = chz;
                }
            } else {
                boolean z2 = (CHZ<T>) A06;
                r2 = z2;
                if (!z2) {
                    CHZ<?> chz2 = (CHZ<T>) new CHZ(context.getApplicationContext(), 0);
                    A06 = chz2;
                    r2 = chz2;
                }
            }
        }
        return (CHZ<T>) r2;
    }

    /* JADX WARN: Incorrect types in method signature: (ILjava/lang/Class<*>;)Z */
    public final boolean A01(Class cls, int i) {
        Class<? extends T> cls2 = this.A02.get(i);
        if (cls2 == null) {
            BV4.A1B(i, "ServiceInfoParser", "No class matching jobId: %s was found.");
            return false;
        }
        if (cls2.equals(cls)) {
            return true;
        }
        CFK.A01(Integer.valueOf(i), cls2.getName(), cls.getName(), "ServiceInfoParser", "jobId: %s is mapped to class: %s, but was routed to class: %s");
        return false;
    }

    public CHZ(Context context, int i) throws PackageManager.NameNotFoundException, ServiceInfoParser$NoJobMetaDataFoundException {
        String str;
        int i2;
        RuntimeException runtimeException;
        RuntimeException runtimeException2;
        this.A01 = context;
        if (i != 0) {
            this.A03 = PushLiteGCMJobService.class;
            str = "com.google.android.gms.permission.BIND_NETWORK_TASK_SERVICE";
        } else {
            this.A03 = PushLiteLollipopJobService.class;
            str = "android.permission.BIND_JOB_SERVICE";
        }
        this.A04 = str;
        try {
            PackageManager packageManager = context.getPackageManager();
            packageManager.getClass();
            PackageInfo packageInfo = packageManager.getPackageInfo(((PackageItemInfo) context.getApplicationInfo()).packageName, 4740);
            int i3 = packageInfo.versionCode;
            int iA00 = BuildConstants.A00();
            if (i3 != iA00) {
                PackageManager packageManager2 = context.createPackageContext(context.getPackageName(), 0).getPackageManager();
                packageManager2.getClass();
                CFK.A0I("ServiceInfoParser", "Version Codes do not match!packageManager: %d buildConstant: %d updatedPackageManager: %d", Integer.valueOf(i3), Integer.valueOf(iA00), Integer.valueOf(packageManager2.getPackageInfo(((PackageItemInfo) context.getApplicationInfo()).packageName, 4740).versionCode));
                this.A00 = true;
            } else {
                this.A00 = false;
            }
            ServiceInfo[] serviceInfoArr = packageInfo.services;
            if (serviceInfoArr != null) {
                for (ServiceInfo serviceInfo : serviceInfoArr) {
                    if (this.A04.equals(serviceInfo.permission)) {
                        try {
                            SparseArray<Class<? extends T>> sparseArray = this.A02;
                            Class<?> cls = this.A03;
                            synchronized (CHZ.class) {
                                Bundle bundle = ((PackageItemInfo) serviceInfo).metaData;
                                if (bundle == null || (i2 = bundle.getInt("com.facebook.common.jobscheduler.compat.jobIds")) == 0) {
                                    throw new ServiceInfoParser$NoJobMetaDataFoundException(FGI.A0U("Service ", ((PackageItemInfo) serviceInfo).name, " is missing meta key com.facebook.common.jobscheduler.compat.jobIds"));
                                }
                                try {
                                    TypedArray typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i2);
                                    for (int i4 = 0; i4 < typedArrayObtainTypedArray.length(); i4++) {
                                        try {
                                            int resourceId = typedArrayObtainTypedArray.getResourceId(i4, 0);
                                            if (resourceId != 0) {
                                                try {
                                                    if (sparseArray.get(resourceId) == null) {
                                                        Class<?> cls2 = Class.forName(((PackageItemInfo) serviceInfo).name);
                                                        if (cls.isAssignableFrom(cls2)) {
                                                            sparseArray.put(resourceId, cls2);
                                                        } else {
                                                            runtimeException2 = new RuntimeException(FGI.A0d("Service class of ", cls2.getName(), " is not assignable to:  ", cls.getName()));
                                                        }
                                                    } else {
                                                        StringBuilder sb = new StringBuilder();
                                                        sb.append("Duplicate jobId: ");
                                                        sb.append(String.valueOf(resourceId));
                                                        sb.append(" detected for class: ");
                                                        sb.append(sparseArray.get(resourceId));
                                                        sb.append(" and ");
                                                        sb.append(((PackageItemInfo) serviceInfo).name);
                                                        runtimeException2 = new RuntimeException(sb.toString());
                                                    }
                                                    throw runtimeException2;
                                                } catch (ClassNotFoundException e) {
                                                    StringBuilder sb2 = new StringBuilder();
                                                    sb2.append("Unable to resolve service class ");
                                                    sb2.append(((PackageItemInfo) serviceInfo).name);
                                                    sb2.append(" class_loader: ");
                                                    boolean z = true;
                                                    for (ClassLoader classLoader = CHZ.class.getClassLoader(); classLoader != null; classLoader = classLoader.getParent()) {
                                                        if (z) {
                                                            z = false;
                                                        } else {
                                                            sb2.append("->");
                                                        }
                                                        sb2.append(classLoader.getClass().getCanonicalName());
                                                    }
                                                    runtimeException = new RuntimeException(sb2.toString(), e);
                                                }
                                            } else {
                                                runtimeException = new RuntimeException("value not found");
                                            }
                                            throw runtimeException;
                                        } catch (Throwable th) {
                                            typedArrayObtainTypedArray.recycle();
                                            throw th;
                                        }
                                    }
                                    typedArrayObtainTypedArray.recycle();
                                } catch (Resources.NotFoundException e2) {
                                    throw new RuntimeException(e2);
                                }
                            }
                        } catch (ServiceInfoParser$NoJobMetaDataFoundException e3) {
                            CFK.A06("ServiceInfoParser", e3.toString());
                        }
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException e4) {
            throw BV4.A0e(e4);
        }
    }
}
