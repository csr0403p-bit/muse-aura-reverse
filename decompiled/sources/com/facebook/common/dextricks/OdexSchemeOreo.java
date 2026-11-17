package com.facebook.common.dextricks;

import X.AnonymousClass001;
import X.AnonymousClass007;
import X.BV4;
import X.BV5;
import X.BV6;
import X.C3cG;
import X.C5J;
import X.C60O;
import X.C8j4;
import X.CB7;
import X.CB8;
import X.CBf;
import X.CBk;
import X.CBo;
import X.CFK;
import X.FGI;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.common.dextricks.OdexScheme;
import com.facebook.common.dextricks.achilles.Achilles;
import com.facebook.common.dextricks.classid.ClassId;
import com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger;
import com.facebook.common.dextricks.storer.Storer;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.systrace.Systrace;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.DelegateLastClassLoader;
import dalvik.system.VMRuntime;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

/* loaded from: classes5.dex */
public class OdexSchemeOreo extends OdexScheme {
    public static final Set<String> sForceUnpackSet = C60O.A13();
    public static final Map<String, Object> sOurAddedDexElements = BV4.A0u();
    public static final Object sPathListLock = C3cG.A0T();
    public static CBo sRegisteredClassLoaderCallback;
    public Context mContext;
    public HashMap<String, String> mDexNameMap;
    public int mNumDexes;
    public LightweightQuickPerformanceLogger mQplCollector;
    public long mStorer;
    public IOException[] mSuppressedExceptions;
    public File mZipFile;

    public final class OreoCompiler extends OdexScheme.Compiler {
        public HashMap<String, String> mDexNameMap;
        public long mStorer;

        @Override // com.facebook.common.dextricks.OdexScheme.Compiler
        public void compile(InputDex inputDex) {
            Systrace.A04(32L, "OdexSchemeOreo.compile");
            try {
                String strA0h = BV4.A0h(inputDex.dex.hash, this.mDexNameMap);
                if (strA0h == null) {
                    throw BV4.A0c("Unexpected input dex!");
                }
                Storer.start(this.mStorer, strA0h, 4);
                long j = this.mStorer;
                InputStream dexContents = inputDex.getDexContents();
                byte[] bArr = new byte[32768];
                while (true) {
                    int i = dexContents.read(bArr);
                    if (i < 0) {
                        Storer.finish(this.mStorer);
                        return;
                    }
                    Storer.write(j, bArr, i);
                }
            } finally {
                Systrace.A03(32L);
            }
        }

        public OreoCompiler(long j, HashMap<String, String> map) {
            this.mStorer = j;
            this.mDexNameMap = map;
        }
    }

    public static HashMap<String, String> makeNameMap(DexManifest.Dex[] dexArr) {
        int length = dexArr.length;
        HashMap<String, String> mapA0v = BV4.A0v(length);
        int i = 0;
        while (i < length) {
            mapA0v.put(dexArr[i].hash, i != 0 ? FGI.A0I("classes", i + 1, DexManifest.DEX_EXT) : "classes.dex");
            i++;
        }
        return mapA0v;
    }

    public void serializeDex2ChecksumMap(File file) throws IOException {
        Object[] objArr;
        String str;
        HashMap mapA0u;
        try {
            ZipFile zipFile = new ZipFile(this.mZipFile);
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            mapA0u = BV4.A0u();
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                if (zipEntryNextElement != null) {
                    C8j4.A1O(zipEntryNextElement.getName(), mapA0u, (int) zipEntryNextElement.getCrc());
                }
            }
            zipFile.close();
        } catch (ZipException e) {
            objArr = new Object[]{e};
            str = "Megazip file cannot be opened as a ZipFile, exception %s";
        } catch (IOException e2) {
            objArr = new Object[]{e2};
            str = "Megazip file io failed in serializeDex2ChecksumMap %s";
        }
        if (mapA0u.isEmpty()) {
            str = "dexname2ChecksumMap has nothing";
            objArr = new Object[0];
            Mlog.w(str, objArr);
            return;
        }
        try {
            FileOutputStream fileOutputStreamA0I = BV4.A0I(BV5.A0L(this.mZipFile.getName(), ".checksum", file.getParentFile()));
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStreamA0I);
            objectOutputStream.writeObject(mapA0u);
            objectOutputStream.close();
            fileOutputStreamA0I.close();
        } catch (IOException unused) {
            BV6.A1F("fail to write checksum file ");
        }
    }

    private String buildPrimaryDexDecoyFilename() {
        return FGI.A0U("p-", getPrimaryDexIdentifierString(this.mContext), ".zip");
    }

    public static void enableTracingIfNeeded() {
        CB8 cb8;
        Boolean boolA0h;
        if (ClassTracingLogger.A01) {
            synchronized (CB8.class) {
                if (CB8.A07 == null) {
                    try {
                        ClassLoader classLoader = CB8.class.getClassLoader();
                        CB8.A07 = CBf.class.getClassLoader() instanceof DelegateLastClassLoader ? new CB7(classLoader) : new CB8(classLoader);
                    } catch (Exception e) {
                        CFK.A0A("PluginClassLoader", "PluginClassLoader.get: failed to create instance", e);
                    }
                    cb8 = CB8.A07;
                } else {
                    cb8 = CB8.A07;
                }
            }
            if (cb8 == null || sRegisteredClassLoaderCallback != null) {
                return;
            }
            CBk cBk = new CBk();
            sRegisteredClassLoaderCallback = cBk;
            synchronized (cb8) {
                try {
                    try {
                        Class.forName(ClassId.class.getName());
                        boolA0h = AnonymousClass001.A0i();
                    } catch (ClassNotFoundException unused) {
                        boolA0h = AnonymousClass001.A0h();
                    }
                    if (boolA0h.booleanValue()) {
                        AtomicReference<ArrayList<CBo>> atomicReference = cb8.A00;
                        ArrayList<CBo> arrayListA11 = C60O.A11(atomicReference.get().size() + 1);
                        arrayListA11.addAll(atomicReference.get());
                        arrayListA11.add(cBk);
                        atomicReference.set(arrayListA11);
                        if (atomicReference.get().size() == 1) {
                            cb8.A01(true);
                        }
                    } else {
                        CFK.A06("PluginClassLoader", "PluginClassLoader: forceClassPreload() failed, skipping callback");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private File getProfileFileAndInfo(boolean z) throws IOException {
        File parentFile = this.mZipFile.getParentFile();
        if (parentFile == null) {
            return null;
        }
        File profileFile = getProfileFile(parentFile);
        if (profileFile != null && z && Build.VERSION.SDK_INT <= 30) {
            serializeDex2ChecksumMap(profileFile);
        }
        return profileFile;
    }

    public static boolean isUnpackRequested(String str) {
        Set<String> set = sForceUnpackSet;
        if (!set.contains(str)) {
            return false;
        }
        set.remove(str);
        return true;
    }

    private void registerCodeAndProfileBgDexopt() throws IllegalAccessException, InterruptedException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT == 29) {
            registerCodeAndProfileBgDexoptWithPrimary();
            return;
        }
        BaseDexClassLoader baseDexClassLoader = (BaseDexClassLoader) OdexSchemeOreo.class.getClassLoader();
        boolean zIsXiaomiDevice = isXiaomiDevice();
        if (zIsXiaomiDevice) {
            Achilles.simulateReportClassLoaderChainR(baseDexClassLoader, this.mContext.getPackageName(), VMRuntime.getRuntime().vmInstructionSet(), this.mContext.getPackageManager(), zIsXiaomiDevice);
        } else {
            Achilles.reportClassLoaderChain(baseDexClassLoader);
        }
    }

    private void registerCodeAndProfileBgDexoptWithPrimary() throws IllegalAccessException, InterruptedException, IllegalArgumentException, InvocationTargetException {
        BaseDexClassLoader baseDexClassLoader = (BaseDexClassLoader) OdexSchemeOreo.class.getClassLoader();
        File fileA0O = C3cG.A0O(getMainDexStoreLocation(), buildPrimaryDexDecoyFilename());
        if (!fileA0O.exists()) {
            try {
                createDecoy(fileA0O, this.mContext.getApplicationInfo().publicSourceDir);
            } catch (IOException e) {
                Mlog.w(e, "Unable to unpack decoy, continuing without!!!!", new Object[0]);
            }
        }
        String strA0U = FGI.A0U(fileA0O.getAbsolutePath(), File.pathSeparator, this.mZipFile.getAbsolutePath());
        Achilles.simulateReportClassLoaderChainQ(new String[]{this.mZipFile.getAbsolutePath()}, baseDexClassLoader, BV5.A0u(baseDexClassLoader), BV5.A0u(strA0U), this.mContext.getPackageName(), VMRuntime.getRuntime().vmInstructionSet(), this.mContext.getPackageManager(), isXiaomiDevice());
    }

    public static Object[] removeFromOldElements(Class<?> cls, Object[] objArr, Object obj) {
        int length;
        if (obj != null && objArr != null && (length = objArr.length) != 0) {
            int i = 0;
            int i2 = 0;
            while (obj != objArr[i2]) {
                i2++;
                if (i2 < length) {
                }
            }
            Object[] objArr2 = (Object[]) Array.newInstance(cls, length - 1);
            int i3 = 0;
            do {
                Object obj2 = objArr[i];
                if (obj != obj2) {
                    objArr2[i3] = obj2;
                    i3++;
                }
                i++;
            } while (i < length);
            return objArr2;
        }
        return objArr;
    }

    public static void requestUnpack(String str) {
        sForceUnpackSet.add(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void setupErrorReportingFields() {
        /*
            X.C4k r2 = X.AbstractC3277C7e.A00
            if (r2 == 0) goto L49
            com.facebook.errorreporting.field.ReportFieldString r1 = X.C6B.A98
            com.facebook.common.dextricks.OdexSchemeOreo$1 r0 = new com.facebook.common.dextricks.OdexSchemeOreo$1
            r0.<init>()
            r2.A00(r1, r0)
            X.CB8 r2 = X.CB8.A07
            if (r2 == 0) goto L1d
            r1 = r2
            monitor-enter(r1)
            boolean r0 = r2.A01     // Catch: java.lang.Throwable -> L17
            goto L1a
        L17:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r0
        L1a:
            monitor-exit(r1)
            if (r0 != 0) goto L23
        L1d:
            java.lang.Class<com.facebook.common.dextricks.OdexSchemeOreo> r0 = com.facebook.common.dextricks.OdexSchemeOreo.class
            java.lang.ClassLoader r2 = r0.getClassLoader()
        L23:
            com.facebook.errorreporting.field.ReportFieldString r0 = X.C6B.A9R
            if (r2 != 0) goto L2f
            java.lang.String r3 = ""
        L29:
            java.lang.Class<X.C4j> r2 = X.C3226C4j.class
            monitor-enter(r2)
            monitor-exit(r2)
            monitor-enter(r2)
            goto L34
        L2f:
            java.lang.String r3 = r2.toString()
            goto L29
        L34:
            X.C4j r1 = X.C3226C4j.A03     // Catch: java.lang.Throwable -> L46
            if (r1 != 0) goto L3f
            X.C4j r1 = new X.C4j     // Catch: java.lang.Throwable -> L46
            r1.<init>()     // Catch: java.lang.Throwable -> L46
            X.C3226C4j.A03 = r1     // Catch: java.lang.Throwable -> L46
        L3f:
            monitor-exit(r2)
            java.lang.String r0 = r0.name
            r1.A01(r0, r3)
            return
        L46:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L46
            throw r0
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeOreo.setupErrorReportingFields():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static IOException[] threadSafeAddDexPath(BaseDexClassLoader baseDexClassLoader, File file) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, NegativeArraySizeException {
        int length;
        int length2;
        int length3;
        if (Build.VERSION.SDK_INT >= 33) {
            file.setWritable(false);
        }
        Class<?> cls = Class.forName("dalvik.system.DexPathList");
        Class<?> cls2 = Class.forName("dalvik.system.DexPathList$Element");
        Method declaredMethod = cls.getDeclaredMethod("makeDexElements", List.class, File.class, List.class, ClassLoader.class);
        declaredMethod.setAccessible(true);
        ArrayList arrayListA0h = C3cG.A0h();
        ArrayList arrayListA11 = C60O.A11(1);
        arrayListA11.add(file);
        Object[] objArr = (Object[]) declaredMethod.invoke(null, arrayListA11, null, arrayListA0h, baseDexClassLoader);
        if (objArr == null || (length = objArr.length) != 1) {
            throw C3cG.A0Q("got null or too large array");
        }
        Object objRecordAddedDexElement = recordAddedDexElement(file, objArr[0]);
        Object objA0c = BV5.A0c(baseDexClassLoader, BaseDexClassLoader.class, "pathList");
        Field fieldA0r = BV4.A0r(cls, "dexElements");
        Object[] objArrRemoveFromOldElements = (Object[]) fieldA0r.get(objA0c);
        if (objArrRemoveFromOldElements != null && ((objArrRemoveFromOldElements.length <= 0 || (objArrRemoveFromOldElements = removeFromOldElements(cls2, objArrRemoveFromOldElements, objRecordAddedDexElement)) != null) && (length3 = objArrRemoveFromOldElements.length) > 0)) {
            Object objNewInstance = Array.newInstance(cls2, length3 + 1);
            System.arraycopy(objArrRemoveFromOldElements, 0, objNewInstance, 0, length3);
            System.arraycopy(objArr, 0, objNewInstance, length3, length);
            objArr = objNewInstance;
        }
        fieldA0r.set(objA0c, objArr);
        Field fieldA0r2 = BV4.A0r(cls, "dexElementsSuppressedExceptions");
        int size = arrayListA0h.size();
        if (size <= 0) {
            return (IOException[]) fieldA0r2.get(objA0c);
        }
        IOException[] iOExceptionArr = (IOException[]) arrayListA0h.toArray(new IOException[size]);
        IOException[] iOExceptionArr2 = (IOException[]) fieldA0r2.get(objA0c);
        if (iOExceptionArr2 != null && (length2 = iOExceptionArr2.length) > 0) {
            IOException[] iOExceptionArr3 = new IOException[length2 + size];
            System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, 0, length2);
            System.arraycopy(iOExceptionArr, 0, iOExceptionArr3, length2, size);
            iOExceptionArr = iOExceptionArr3;
        }
        fieldA0r2.set(objA0c, iOExceptionArr);
        return iOExceptionArr;
    }

    public static IOException[] threadSafeAddDexPathSynchronized(BaseDexClassLoader baseDexClassLoader, List<File> list) throws NoSuchFieldException, NoSuchMethodException, ClassNotFoundException, SecurityException {
        IOException[] iOExceptionArr;
        int length;
        int length2;
        if (Build.VERSION.SDK_INT >= 33) {
            Iterator<File> it = list.iterator();
            while (it.hasNext()) {
                it.next().setWritable(false);
            }
        }
        Class<?> cls = Class.forName("dalvik.system.DexPathList");
        Class<?> cls2 = Class.forName("dalvik.system.DexPathList$Element");
        Method declaredMethod = cls.getDeclaredMethod("makeDexElements", List.class, File.class, List.class, ClassLoader.class);
        declaredMethod.setAccessible(true);
        ArrayList arrayListA0h = C3cG.A0h();
        Object[] objArrFilterDexElements = (Object[]) declaredMethod.invoke(null, list, null, arrayListA0h, baseDexClassLoader);
        if (objArrFilterDexElements == null || objArrFilterDexElements.length != list.size()) {
            throw C3cG.A0Q("got null or wrong size array");
        }
        Object objA0c = BV5.A0c(baseDexClassLoader, BaseDexClassLoader.class, "pathList");
        if (objA0c == null) {
            throw C3cG.A0Q("pathList is null");
        }
        Field fieldA0r = BV4.A0r(cls, "dexElements");
        synchronized (sPathListLock) {
            Object[] objArr = (Object[]) fieldA0r.get(objA0c);
            if (objArr != null) {
                objArrFilterDexElements = filterDexElements(objArr, objArrFilterDexElements);
            }
            int length3 = objArrFilterDexElements.length;
            if (length3 < 1) {
                BV6.A1F("No new dex elements to add, as they may already be present in the pathlist.");
                iOExceptionArr = new IOException[0];
            } else {
                if (objArr != null && (length2 = objArr.length) > 0) {
                    Object[] objArr2 = (Object[]) Array.newInstance(cls2, length3 + length2);
                    System.arraycopy(objArr, 0, objArr2, 0, length2);
                    System.arraycopy(objArrFilterDexElements, 0, objArr2, length2, length3);
                    objArrFilterDexElements = objArr2;
                }
                fieldA0r.set(objA0c, objArrFilterDexElements.clone());
                Field fieldA0r2 = BV4.A0r(cls, "dexElementsSuppressedExceptions");
                int size = arrayListA0h.size();
                if (size > 0) {
                    iOExceptionArr = (IOException[]) arrayListA0h.toArray(new IOException[size]);
                    IOException[] iOExceptionArr2 = (IOException[]) fieldA0r2.get(objA0c);
                    if (iOExceptionArr2 != null && (length = iOExceptionArr2.length) > 0) {
                        IOException[] iOExceptionArr3 = new IOException[length + size];
                        System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, 0, length);
                        System.arraycopy(iOExceptionArr, 0, iOExceptionArr3, length, size);
                        iOExceptionArr = iOExceptionArr3;
                    }
                    fieldA0r2.set(objA0c, iOExceptionArr);
                } else {
                    iOExceptionArr = (IOException[]) fieldA0r2.get(objA0c);
                }
            }
        }
        return iOExceptionArr;
    }

    public void finalizeZip() {
        long j = this.mStorer;
        if (j != 0) {
            Storer.cleanup(j);
            this.mStorer = 0L;
        }
    }

    public File getMainDexStoreLocation() {
        try {
            return DexStoreUtils.getMainDexStoreLocation(this.mContext);
        } catch (IOException e) {
            throw BV4.A0e(e);
        }
    }

    public File getProfileFile(File file) {
        File fileA0O = C3cG.A0O(file, OdexSchemeArtTurbo.OREO_ODEX_DIR);
        if (!fileA0O.exists() && !fileA0O.mkdir()) {
            C5J.A00("RegisterProf", AnonymousClass007.A0a("Failed to mkdir for prof dir: ", fileA0O), null);
            return null;
        }
        File fileA0L = BV5.A0L(this.mZipFile.getName(), ".cur.prof", fileA0O);
        try {
            if (fileA0L.createNewFile()) {
                Mlog.w("Created new profile file: %s", fileA0L);
            }
            return fileA0L;
        } catch (IOException e) {
            C5J.A00("RegisterProf", "Failed to touch new profile file", e);
            return null;
        }
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public String getSchemeName() {
        return "OdexSchemeOreo";
    }

    public IOException[] getSuppressedExceptions() {
        return this.mSuppressedExceptions;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0064 A[Catch: ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x006d, IllegalAccessException -> 0x006f, InvocationTargetException -> 0x0071, NoSuchMethodException -> 0x0073, NoSuchFieldException -> 0x0075, ClassNotFoundException -> 0x0077, all -> 0x007e, TryCatch #7 {all -> 0x007e, blocks: (B:8:0x001c, B:10:0x0023, B:11:0x0026, B:18:0x0043, B:20:0x0047, B:22:0x004c, B:29:0x0060, B:31:0x0064, B:33:0x0069, B:34:0x006c, B:46:0x0078), top: B:60:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0069 A[Catch: ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x006d, IllegalAccessException -> 0x006f, InvocationTargetException -> 0x0071, NoSuchMethodException -> 0x0073, NoSuchFieldException -> 0x0075, ClassNotFoundException -> 0x0077, all -> 0x007e, TryCatch #7 {all -> 0x007e, blocks: (B:8:0x001c, B:10:0x0023, B:11:0x0026, B:18:0x0043, B:20:0x0047, B:22:0x004c, B:29:0x0060, B:31:0x0064, B:33:0x0069, B:34:0x006c, B:46:0x0078), top: B:60:0x001c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initializeClassLoader() {
        /*
            r10 = this;
            java.lang.String r5 = "Failed to unblock dex2oat"
            java.lang.Class<com.facebook.common.dextricks.OdexSchemeOreo> r0 = com.facebook.common.dextricks.OdexSchemeOreo.class
            java.lang.ClassLoader r1 = r0.getClassLoader()
            boolean r0 = r1 instanceof dalvik.system.BaseDexClassLoader
            java.lang.String r3 = "FBDex101"
            r2 = 0
            if (r0 == 0) goto L89
            r0 = 1
            boolean r0 = com.facebook.common.dextricks.RuntimeInternals.toggleBlockDex2Oat(r0)
            if (r0 != 0) goto L1b
            java.lang.String r0 = "Failed to block dex2oat"
            X.C5J.A00(r3, r0, r2)
        L1b:
            r9 = 0
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = r10.mQplCollector     // Catch: java.lang.IllegalArgumentException -> L6d java.lang.IllegalAccessException -> L6f java.lang.reflect.InvocationTargetException -> L71 java.lang.NoSuchMethodException -> L73 java.lang.NoSuchFieldException -> L75 java.lang.ClassNotFoundException -> L77 java.lang.Throwable -> L7e
            r8 = 8914508(0x88064c, float:1.2491886E-38)
            if (r0 == 0) goto L26
            r0.markerStart(r8)     // Catch: java.lang.IllegalArgumentException -> L6d java.lang.IllegalAccessException -> L6f java.lang.reflect.InvocationTargetException -> L71 java.lang.NoSuchMethodException -> L73 java.lang.NoSuchFieldException -> L75 java.lang.ClassNotFoundException -> L77 java.lang.Throwable -> L7e
        L26:
            boolean r7 = r10.isXiaomiDevice()     // Catch: java.lang.IllegalArgumentException -> L6d java.lang.IllegalAccessException -> L6f java.lang.reflect.InvocationTargetException -> L71 java.lang.NoSuchMethodException -> L73 java.lang.NoSuchFieldException -> L75 java.lang.ClassNotFoundException -> L77 java.lang.Throwable -> L7e
            r6 = 2
            if (r7 == 0) goto L38
            java.lang.Object r4 = com.facebook.common.dextricks.achilles.Achilles.getDexLoadReporter()     // Catch: java.lang.Throwable -> L35
            com.facebook.common.dextricks.achilles.Achilles.setDexLoadReporter(r2)     // Catch: java.lang.Throwable -> L35
            goto L39
        L35:
            r1 = move-exception
            r4 = r2
            goto L60
        L38:
            r4 = r2
        L39:
            dalvik.system.BaseDexClassLoader r1 = (dalvik.system.BaseDexClassLoader) r1     // Catch: java.lang.Throwable -> L5f
            java.io.File r0 = r10.mZipFile     // Catch: java.lang.Throwable -> L5f
            java.io.IOException[] r0 = threadSafeAddDexPath(r1, r0)     // Catch: java.lang.Throwable -> L5f
            r10.mSuppressedExceptions = r0     // Catch: java.lang.Throwable -> L5f
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = r10.mQplCollector     // Catch: java.lang.IllegalArgumentException -> L6d java.lang.IllegalAccessException -> L6f java.lang.reflect.InvocationTargetException -> L71 java.lang.NoSuchMethodException -> L73 java.lang.NoSuchFieldException -> L75 java.lang.ClassNotFoundException -> L77 java.lang.Throwable -> L7e
            if (r0 == 0) goto L4a
            r0.markerEnd(r8, r6)     // Catch: java.lang.IllegalArgumentException -> L6d java.lang.IllegalAccessException -> L6f java.lang.reflect.InvocationTargetException -> L71 java.lang.NoSuchMethodException -> L73 java.lang.NoSuchFieldException -> L75 java.lang.ClassNotFoundException -> L77 java.lang.Throwable -> L7e
        L4a:
            if (r7 == 0) goto L4f
            com.facebook.common.dextricks.achilles.Achilles.setDexLoadReporter(r4)     // Catch: java.lang.IllegalArgumentException -> L6d java.lang.IllegalAccessException -> L6f java.lang.reflect.InvocationTargetException -> L71 java.lang.NoSuchMethodException -> L73 java.lang.NoSuchFieldException -> L75 java.lang.ClassNotFoundException -> L77 java.lang.Throwable -> L7e
        L4f:
            boolean r0 = com.facebook.common.dextricks.RuntimeInternals.toggleBlockDex2Oat(r9)
            if (r0 != 0) goto L58
            X.C5J.A00(r3, r5, r2)
        L58:
            enableTracingIfNeeded()
            setupErrorReportingFields()
            return
        L5f:
            r1 = move-exception
        L60:
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = r10.mQplCollector     // Catch: java.lang.IllegalArgumentException -> L6d java.lang.IllegalAccessException -> L6f java.lang.reflect.InvocationTargetException -> L71 java.lang.NoSuchMethodException -> L73 java.lang.NoSuchFieldException -> L75 java.lang.ClassNotFoundException -> L77 java.lang.Throwable -> L7e
            if (r0 == 0) goto L67
            r0.markerEnd(r8, r6)     // Catch: java.lang.IllegalArgumentException -> L6d java.lang.IllegalAccessException -> L6f java.lang.reflect.InvocationTargetException -> L71 java.lang.NoSuchMethodException -> L73 java.lang.NoSuchFieldException -> L75 java.lang.ClassNotFoundException -> L77 java.lang.Throwable -> L7e
        L67:
            if (r7 == 0) goto L6c
            com.facebook.common.dextricks.achilles.Achilles.setDexLoadReporter(r4)     // Catch: java.lang.IllegalArgumentException -> L6d java.lang.IllegalAccessException -> L6f java.lang.reflect.InvocationTargetException -> L71 java.lang.NoSuchMethodException -> L73 java.lang.NoSuchFieldException -> L75 java.lang.ClassNotFoundException -> L77 java.lang.Throwable -> L7e
        L6c:
            throw r1     // Catch: java.lang.IllegalArgumentException -> L6d java.lang.IllegalAccessException -> L6f java.lang.reflect.InvocationTargetException -> L71 java.lang.NoSuchMethodException -> L73 java.lang.NoSuchFieldException -> L75 java.lang.ClassNotFoundException -> L77 java.lang.Throwable -> L7e
        L6d:
            r1 = move-exception
            goto L78
        L6f:
            r1 = move-exception
            goto L78
        L71:
            r1 = move-exception
            goto L78
        L73:
            r1 = move-exception
            goto L78
        L75:
            r1 = move-exception
            goto L78
        L77:
            r1 = move-exception
        L78:
            java.lang.String r0 = "Failed to merge dex elements"
            X.C5J.A00(r3, r0, r1)     // Catch: java.lang.Throwable -> L7e
            goto L97
        L7e:
            r1 = move-exception
            boolean r0 = com.facebook.common.dextricks.RuntimeInternals.toggleBlockDex2Oat(r9)
            if (r0 != 0) goto La6
            X.C5J.A00(r3, r5, r2)
            throw r1
        L89:
            java.lang.String r0 = "Unknown Application ClassLoader: "
            java.lang.String r0 = X.BV4.A0k(r0, r1)
            X.C5J.A00(r3, r0, r2)
            java.lang.RuntimeException r1 = X.BV4.A0c(r0)
            goto La0
        L97:
            boolean r0 = com.facebook.common.dextricks.RuntimeInternals.toggleBlockDex2Oat(r9)
            if (r0 != 0) goto La0
            X.C5J.A00(r3, r5, r2)
        La0:
            java.lang.String r0 = "[FBDex101] Unknown Application ClassLoader or failed to merge dex, app bound to crash with NoClassDef"
            java.lang.RuntimeException r1 = X.BV4.A0d(r0, r1)
        La6:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeOreo.initializeClassLoader():void");
    }

    public boolean isXiaomiDevice() {
        if (Build.VERSION.SDK_INT > 30) {
            return false;
        }
        return Achilles.existsNotifyDexLoadWithStatus();
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public OdexScheme.Compiler makeCompiler(DexStore dexStore, int i) {
        long jOpen = Storer.open(this.mZipFile.getPath(), 420);
        this.mStorer = jOpen;
        return new OreoCompiler(jOpen, this.mDexNameMap);
    }

    public int markLoadResult(int i, boolean z) {
        int i2 = i | 8;
        if (OreoFileUtils.hasVdexOdex(this.mZipFile)) {
            i2 = i | 524800;
        }
        File file = this.mZipFile;
        if (z) {
            if (OreoFileUtils.getOdex(file).length() < 4194304) {
                return i2;
            }
        } else if (!OreoFileUtils.getReferenceProfile(file).exists()) {
            return i2;
        }
        return i2 | 32768;
    }

    public boolean needsUnpack() {
        if (isUnpackRequested(this.mZipFile.getAbsolutePath()) || !this.mZipFile.exists()) {
            return true;
        }
        if (OreoFileUtils.isTruncated(this.mZipFile)) {
            return !OreoFileUtils.hasVdexOdex(this.mZipFile);
        }
        return false;
    }

    public void requestDexUnpack() {
        requestUnpack(this.mZipFile.getAbsolutePath());
    }

    public OdexSchemeOreo(DexManifest.Dex[] dexArr, File file, Context context, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        super(1, new String[]{file.getName()});
        this.mContext = context;
        this.mZipFile = file;
        this.mQplCollector = lightweightQuickPerformanceLogger;
        this.mDexNameMap = makeNameMap(dexArr);
        this.mNumDexes = dexArr.length;
    }

    public static void createDecoy(File file, String str) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        long jOpen = Storer.open(file.getPath(), 420);
        Storer.start(jOpen, "classes.dex", 4);
        ZipFile zipFile = new ZipFile(str);
        try {
            InputStream inputStream = zipFile.getInputStream(new ZipEntry("classes.dex"));
            try {
                if (inputStream == null) {
                    throw BV4.A0K("Failed to get InputStream for classes.dex from base APK");
                }
                byte[] bArr = new byte[32768];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i < 0) {
                        inputStream.close();
                        zipFile.close();
                        Storer.finish(jOpen);
                        Storer.cleanup(jOpen);
                        return;
                    }
                    Storer.write(jOpen, bArr, i);
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                zipFile.close();
                throw th;
            } finally {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th);
            }
        }
    }

    private Object disableReporter() throws InterruptedException {
        Object dexLoadReporter = Achilles.getDexLoadReporter();
        Achilles.setDexLoadReporter(null);
        return dexLoadReporter;
    }

    private void enableReporter(Object obj) throws InterruptedException {
        Achilles.setDexLoadReporter(obj);
    }

    public static Object[] filterDexElements(Object[] objArr, Object[] objArr2) {
        int i;
        ArrayList arrayListA0h = C3cG.A0h();
        for (Object obj : objArr2) {
            int length = objArr.length;
            while (true) {
                if (i >= length) {
                    arrayListA0h.add(obj);
                    break;
                }
                i = obj.toString().equals(objArr[i].toString()) ? 0 : i + 1;
            }
        }
        return arrayListA0h.toArray();
    }

    public static String getPrimaryDexIdentifierString(Context context) {
        return String.valueOf(DexStore.getApkIdentifier(BV4.A0G(context.getApplicationInfo().publicSourceDir), false));
    }

    public static Object recordAddedDexElement(File file, Object obj) {
        return sOurAddedDexElements.put(file.getAbsolutePath(), obj);
    }

    public void addEmptyDex(Context context) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        AssetManager assets = context.getAssets();
        String strA0I = FGI.A0I("classes", this.mNumDexes + 1, DexManifest.DEX_EXT);
        InputStream inputStreamOpen = assets.open("secondary-program-dex-jars/empty.dex");
        try {
            Storer.start_unaligned(this.mStorer, strA0I, 4);
            long j = this.mStorer;
            byte[] bArr = new byte[32768];
            while (true) {
                int i = inputStreamOpen.read(bArr);
                if (i < 0) {
                    Storer.finish(this.mStorer);
                    inputStreamOpen.close();
                    return;
                }
                Storer.write(j, bArr, i);
            }
        } catch (Throwable th) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                    throw th;
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    public void registerCodeAndProfile(boolean z, boolean z2) throws IllegalAccessException, InterruptedException, NoSuchMethodException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        File profileFileAndInfo = getProfileFileAndInfo(z2);
        if (z) {
            registerCodeAndProfileBgDexopt();
            return;
        }
        if (profileFileAndInfo != null) {
            String path = profileFileAndInfo.getPath();
            String[] strArr = {this.mZipFile.getPath()};
            try {
                Method declaredMethod = VMRuntime.class.getDeclaredMethod("registerAppInfo", String.class, String[].class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, path, strArr);
            } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
                Achilles.registerAppInfo(path, strArr);
            }
        }
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public void configureClassLoader(File file, ClassLoaderConfiguration classLoaderConfiguration) {
    }
}
