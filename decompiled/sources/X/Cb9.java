package X;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.ProviderInfo;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.facebook.aura.auth.credentialmanager.AuraCredentialManagerFetchHelper;
import com.facebook.aura.installsource.AuraInstallSourceDetector;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.dynamite.zzp;
import com.google.android.gms.dynamite.zzq;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzb;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes5.dex */
public final class Cb9 {
    public static int A01 = -1;
    public static zzp A02;
    public static zzq A03;
    public static Boolean A04;
    public static Boolean A05;
    public static String A06;
    public static boolean A07;
    public final Context A00;
    public static final ThreadLocal A0A = new ThreadLocal();
    public static final ThreadLocal A0C = new Bq1();
    public static final CbJ A0B = new C3645CbF();
    public static final CbG A09 = new CbD();
    public static final CbG A08 = new CbE();

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0166: IF  (r3 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:94:0x016b (LINE:358), block:B:92:0x0166 */
    public static int A02(Context context, String str, boolean z, boolean z2) throws DynamiteModule$LoadingException {
        AbstractCursor abstractCursor;
        try {
            try {
                Uri uriBuild = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(BV4.A06(A0C.get()))).build();
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                boolean z3 = false;
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    try {
                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, null, null, null, null);
                        if (cursorQuery != null) {
                            try {
                                int count = cursorQuery.getCount();
                                int columnCount = cursorQuery.getColumnCount();
                                MatrixCursor matrixCursor = new MatrixCursor(cursorQuery.getColumnNames(), count);
                                for (int i = 0; i < count; i++) {
                                    if (!cursorQuery.moveToPosition(i)) {
                                        throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                    }
                                    Object[] objArr = new Object[columnCount];
                                    for (int i2 = 0; i2 < columnCount; i2++) {
                                        int type = cursorQuery.getType(i2);
                                        if (type == 0) {
                                            objArr[i2] = null;
                                        } else if (type == 1) {
                                            objArr[i2] = Long.valueOf(cursorQuery.getLong(i2));
                                        } else if (type == 2) {
                                            objArr[i2] = Double.valueOf(cursorQuery.getDouble(i2));
                                        } else if (type == 3) {
                                            objArr[i2] = cursorQuery.getString(i2);
                                        } else {
                                            if (type != 4) {
                                                throw new RemoteException("Unknown column type");
                                            }
                                            objArr[i2] = cursorQuery.getBlob(i2);
                                        }
                                    }
                                    matrixCursor.addRow(objArr);
                                }
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                                try {
                                    if (matrixCursor.moveToFirst()) {
                                        int i3 = matrixCursor.getInt(0);
                                        if (i3 > 0) {
                                            synchronized (Cb9.class) {
                                                try {
                                                    A06 = matrixCursor.getString(2);
                                                    int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                                    if (columnIndex >= 0) {
                                                        A01 = matrixCursor.getInt(columnIndex);
                                                    }
                                                    int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                                    if (columnIndex2 >= 0) {
                                                        boolean z4 = matrixCursor.getInt(columnIndex2) != 0;
                                                        A07 = z4;
                                                        z3 = z4;
                                                    }
                                                } catch (Throwable th) {
                                                    throw th;
                                                }
                                            }
                                            C3647CbO c3647CbO = (C3647CbO) A0A.get();
                                            if (c3647CbO != null && c3647CbO.A00 == null) {
                                                c3647CbO.A00 = matrixCursor;
                                                matrixCursor = null;
                                            }
                                        }
                                        if (z2 && z3) {
                                            throw new DynamiteModule$LoadingException("forcing fallback to container DynamiteLoader impl");
                                        }
                                        if (matrixCursor != null) {
                                            matrixCursor.close();
                                        }
                                        return i3;
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    if (e instanceof DynamiteModule$LoadingException) {
                                        throw e;
                                    }
                                    throw new DynamiteModule$LoadingException(FGI.A0M("V2 version check failed: ", e.getMessage()), e);
                                }
                            } finally {
                            }
                        }
                    } catch (RemoteException unused) {
                    } catch (Throwable th2) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th2;
                    }
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new DynamiteModule$LoadingException("Failed to connect to dynamite module ContentResolver.");
            } catch (Throwable th3) {
                if (abstractCursor != null) {
                    abstractCursor.close();
                }
                throw th3;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static void A07(ClassLoader classLoader) throws DynamiteModule$LoadingException {
        zzq zzqVar = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                zzqVar = iInterfaceQueryLocalInterface instanceof zzq ? (zzq) iInterfaceQueryLocalInterface : new zzq("com.google.android.gms.dynamite.IDynamiteLoaderV2", iBinder);
            }
            A03 = zzqVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new DynamiteModule$LoadingException("Failed to instantiate dynamite loader", e);
        }
    }

    public static int A00(Context context, String str) throws NoSuchFieldException, ClassNotFoundException {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass(FGI.A0U("com.google.android.gms.dynamite.descriptors.", str, ".ModuleDescriptor"));
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (CS7.A01(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", FGI.A0h("Module descriptor id '", String.valueOf(declaredField.get(null)), "' didn't match expected id '", str, "'"));
            return 0;
        } catch (ClassNotFoundException unused) {
            BV4.A1K("Local module descriptor class for ", str, " not found.", "DynamiteModule");
            return 0;
        } catch (Exception e) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c5, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c6, code lost:
    
        r1 = new X.C06(r12, "GmsDynamite");
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00cd, code lost:
    
        r1.setContextClassLoader(null);
        r1.start();
        r11 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d5, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d6, code lost:
    
        r11 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d8, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00dc, code lost:
    
        X.BV4.A1J("Failed to enumerate thread/threadgroup ", r0.getMessage(), "DynamiteLoaderV2CL");
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f0 A[Catch: all -> 0x0125, PHI: r11
  0x00f0: PHI (r11v1 java.lang.Thread) = (r11v0 java.lang.Thread), (r11v10 java.lang.Thread) binds: [B:34:0x0073, B:63:0x00ea] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #2 {, blocks: (B:31:0x006c, B:33:0x0070, B:35:0x0075, B:62:0x00e8, B:73:0x0105, B:39:0x0083, B:76:0x010a, B:68:0x00f0), top: B:172:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010e A[Catch: DynamiteModule$LoadingException -> 0x0128, all -> 0x0145, TryCatch #20 {DynamiteModule$LoadingException -> 0x0128, blocks: (B:25:0x005b, B:27:0x0063, B:30:0x006b, B:77:0x010b, B:79:0x010e, B:80:0x011c, B:83:0x0127), top: B:193:0x005b, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0133 A[Catch: all -> 0x0145, TRY_LEAVE, TryCatch #4 {, blocks: (B:8:0x002c, B:10:0x0038, B:11:0x003a, B:14:0x003f, B:16:0x0045, B:18:0x004b, B:20:0x004e, B:22:0x0052, B:25:0x005b, B:27:0x0063, B:30:0x006b, B:77:0x010b, B:79:0x010e, B:80:0x011c, B:88:0x0140, B:83:0x0127, B:90:0x0142, B:84:0x0128, B:85:0x0133, B:15:0x0042), top: B:175:0x002c, inners: #20 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A01(android.content.Context r20, java.lang.String r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cb9.A01(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x024a A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0251 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x025a A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.Cb9 A04(android.content.Context r23, X.CbG r24, java.lang.String r25) throws com.google.android.gms.dynamite.DynamiteModule$LoadingException {
        /*
            Method dump skipped, instructions count: 683
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cb9.A04(android.content.Context, X.CbG, java.lang.String):X.Cb9");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v6 com.google.android.gms.dynamite.zzp, still in use, count: 2, list:
          (r1v6 com.google.android.gms.dynamite.zzp) from 0x002f: IF  (r1v6 com.google.android.gms.dynamite.zzp) != (null com.google.android.gms.dynamite.zzp)  -> B:13:0x0031 A[HIDDEN] (LINE:47)
          (r1v6 com.google.android.gms.dynamite.zzp) from 0x0031: PHI (r1v5 com.google.android.gms.dynamite.zzp) = (r1v4 com.google.android.gms.dynamite.zzp), (r1v6 com.google.android.gms.dynamite.zzp) binds: [B:14:0x0034, B:12:0x002f] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static com.google.android.gms.dynamite.zzp A05(android.content.Context r7) {
        /*
            java.lang.String r6 = "Failed to load IDynamiteLoader from GmsCore: "
            java.lang.Class<X.Cb9> r5 = X.Cb9.class
            monitor-enter(r5)
            com.google.android.gms.dynamite.zzp r4 = X.Cb9.A02     // Catch: java.lang.Throwable -> L48
            if (r4 != 0) goto L46
            r4 = 0
            java.lang.String r1 = "com.google.android.gms"
            r0 = 3
            android.content.Context r0 = r7.createPackageContext(r1, r0)     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L48
            java.lang.ClassLoader r1 = r0.getClassLoader()     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L48
            java.lang.String r0 = "com.google.android.gms.chimera.container.DynamiteLoaderImpl"
            java.lang.Class r0 = r1.loadClass(r0)     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L48
            java.lang.Object r3 = r0.newInstance()     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L48
            android.os.IBinder r3 = (android.os.IBinder) r3     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L48
            if (r3 == 0) goto L46
            java.lang.String r2 = "com.google.android.gms.dynamite.IDynamiteLoader"
            android.os.IInterface r1 = r3.queryLocalInterface(r2)     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L48
            boolean r0 = r1 instanceof com.google.android.gms.dynamite.zzp     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L48
            if (r0 == 0) goto L34
            com.google.android.gms.dynamite.zzp r1 = (com.google.android.gms.dynamite.zzp) r1     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L48
            if (r1 == 0) goto L46
        L31:
            X.Cb9.A02 = r1     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L48
            goto L3a
        L34:
            com.google.android.gms.dynamite.zzp r1 = new com.google.android.gms.dynamite.zzp     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L48
            r1.<init>(r2, r3)     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L48
            goto L31
        L3a:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L48
            return r1
        L3c:
            r0 = move-exception
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r0 = X.BV5.A0n(r6, r0)     // Catch: java.lang.Throwable -> L48
            android.util.Log.e(r1, r0)     // Catch: java.lang.Throwable -> L48
        L46:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L48
            return r4
        L48:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L48
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cb9.A05(android.content.Context):com.google.android.gms.dynamite.zzp");
    }

    public static boolean A08(Context context) {
        Boolean bool = Boolean.TRUE;
        if (!bool.equals(null)) {
            Boolean bool2 = A05;
            if (!bool.equals(bool2)) {
                boolean z = false;
                if (bool2 == null) {
                    ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 268435456);
                    if (CaK.A00.A01(context, 10000000) == 0 && providerInfoResolveContentProvider != null && AuraCredentialManagerFetchHelper.PROVIDER_PACKAGE.equals(((PackageItemInfo) providerInfoResolveContentProvider).packageName)) {
                        z = true;
                    }
                    A05 = Boolean.valueOf(z);
                    if (z) {
                        ApplicationInfo applicationInfo = ((ComponentInfo) providerInfoResolveContentProvider).applicationInfo;
                        if (applicationInfo != null && (applicationInfo.flags & AuraInstallSourceDetector.SYSTEM_IMAGE_FLAGS) == 0) {
                            Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                            A07 = true;
                        }
                        return z;
                    }
                }
                Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
                return z;
            }
        }
        return true;
    }

    public final IBinder A09(String str) throws DynamiteModule$LoadingException {
        try {
            return (IBinder) this.A00.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new DynamiteModule$LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e);
        }
    }

    public Cb9(Context context) {
        CRy.A03(context);
        this.A00 = context;
    }

    public static IObjectWrapper A03(Parcel parcel, zza zzaVar, int i) {
        Parcel parcelA00 = zzaVar.A00(parcel, i);
        IObjectWrapper iObjectWrapperA02 = IObjectWrapper.Stub.A02(parcelA00.readStrongBinder());
        parcelA00.recycle();
        return iObjectWrapperA02;
    }

    public static void A06(Parcel parcel, zzb zzbVar, String str, String str2, int i) {
        parcel.writeInterfaceToken(str);
        parcel.writeStrongBinder(zzbVar.asBinder());
        parcel.writeString(str2);
        parcel.writeInt(i);
    }
}
