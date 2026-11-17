package com.facebook.common.dextricks;

import X.AnonymousClass007;
import X.BV4;
import X.BV5;
import X.BV7;
import X.C3cG;
import X.C60O;
import X.CFK;
import X.FGI;
import android.content.Context;
import android.util.Pair;
import com.facebook.common.dextricks.classifier.NameClassifier;
import com.facebook.common.dextricks.halfnosis.Halfnosis;
import com.facebook.common.dextricks.stats.ClassLoadingStats;
import dalvik.system.DexFile;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class MultiDexClassLoaderJava extends MultiDexClassLoader implements ClassLoadsLoggingProvider {
    public static final byte API_FALLBACK = 3;
    public static final byte API_NEW_WORKS = 1;
    public static final byte API_OLD_WORKS = 2;
    public static final byte API_UNTESTED = 0;
    public static byte sApiDetectionState;
    public static String sEncodedLongtailUnrenamedTypes;
    public final DexFile[] mAuxiliaryDexes;
    public int mDexLoadFailurePosition;
    public final DexFile[] mPrimaryDexes;
    public final ClassLoadsNotifier mClassLoadsNotifier = new ClassLoadsNotifier();
    public final ClassLoadingStats mClassLoadingStats = ClassLoadingStatsHolder.sClassLoadingStats;
    public final LoadApi loadApi = new LoadApi();
    public Pair<DexFile, Boolean>[] mDexFiles = new Pair[0];
    public final AtomicInteger mLastLoadedDexIndex = BV5.A18();
    public final String[] mDexLoadFailureHistory = new String[4];

    public class LoadApi {
        /* JADX WARN: Removed duplicated region for block: B:19:0x0045 A[Catch: all -> 0x005e, TryCatch #1 {all -> 0x005e, blocks: (B:15:0x0035, B:17:0x003f, B:24:0x005b, B:19:0x0045, B:22:0x0051, B:23:0x0056), top: B:34:0x0035 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Class<?> loadInnerNewApiClass(java.lang.String r8, android.util.Pair<dalvik.system.DexFile, java.lang.Boolean>[] r9, int r10) throws java.lang.Throwable {
            /*
                r7 = this;
                r3 = 1
                com.facebook.common.dextricks.MultiDexClassLoaderJava r2 = com.facebook.common.dextricks.MultiDexClassLoaderJava.this     // Catch: java.lang.Throwable -> L69
                java.lang.ClassLoader r6 = r2.mPutativeLoader     // Catch: java.lang.Throwable -> L69
                r0 = 0
                r1 = r9[r0]     // Catch: java.lang.Throwable -> L69
                if (r1 == 0) goto L2c
                java.lang.Object r0 = r1.second     // Catch: java.lang.Throwable -> L69
                boolean r0 = X.AnonymousClass001.A1X(r0)     // Catch: java.lang.Throwable -> L69
                if (r0 == 0) goto L18
                boolean r0 = com.facebook.common.dextricks.MultiDexClassLoaderJava.mayBeRedexRenamedOrStoreCanary(r8)     // Catch: java.lang.Throwable -> L69
                if (r0 == 0) goto L2f
            L18:
                java.lang.Object r2 = r1.first     // Catch: java.lang.Throwable -> L69
                dalvik.system.DexFile r2 = (dalvik.system.DexFile) r2     // Catch: java.lang.Throwable -> L69
                java.lang.Class r1 = com.facebook.common.dextricks.DexFileLoadNew.loadClassBinaryName(r2, r8, r6)     // Catch: java.lang.Throwable -> L69
                com.facebook.common.dextricks.MultiDexClassLoaderJava r0 = com.facebook.common.dextricks.MultiDexClassLoaderJava.this     // Catch: java.lang.Throwable -> L69
                r0.observeDexFileLoad(r2, r1)     // Catch: java.lang.Throwable -> L69
            L25:
                int r0 = r9.length     // Catch: java.lang.Throwable -> L69
                int r5 = java.lang.Math.min(r10, r0)     // Catch: java.lang.Throwable -> L69
                r4 = 1
                goto L31
            L2c:
                com.facebook.common.dextricks.MultiDexClassLoaderJava.access$000(r2)     // Catch: java.lang.Throwable -> L69
            L2f:
                r1 = 0
                goto L25
            L31:
                if (r1 != 0) goto L61
                if (r4 >= r5) goto L61
                r2 = r9[r4]     // Catch: java.lang.Throwable -> L5e
                java.lang.Object r0 = r2.second     // Catch: java.lang.Throwable -> L5e
                boolean r0 = X.AnonymousClass001.A1X(r0)     // Catch: java.lang.Throwable -> L5e
                if (r0 == 0) goto L45
                boolean r0 = com.facebook.common.dextricks.MultiDexClassLoaderJava.mayBeRedexRenamedOrStoreCanary(r8)     // Catch: java.lang.Throwable -> L5e
                if (r0 == 0) goto L5b
            L45:
                java.lang.Object r2 = r2.first     // Catch: java.lang.Throwable -> L5e
                dalvik.system.DexFile r2 = (dalvik.system.DexFile) r2     // Catch: java.lang.Throwable -> L5e
                java.lang.Class r1 = com.facebook.common.dextricks.DexFileLoadNew.loadClassBinaryName(r2, r8, r6)     // Catch: java.lang.Throwable -> L5e
                if (r1 == 0) goto L56
                if (r4 <= r3) goto L56
                com.facebook.common.dextricks.MultiDexClassLoaderJava r0 = com.facebook.common.dextricks.MultiDexClassLoaderJava.this     // Catch: java.lang.Throwable -> L5e
                com.facebook.common.dextricks.MultiDexClassLoaderJava.access$100(r0, r2, r4)     // Catch: java.lang.Throwable -> L5e
            L56:
                com.facebook.common.dextricks.MultiDexClassLoaderJava r0 = com.facebook.common.dextricks.MultiDexClassLoaderJava.this     // Catch: java.lang.Throwable -> L5e
                r0.observeDexFileLoad(r2, r1)     // Catch: java.lang.Throwable -> L5e
            L5b:
                int r4 = r4 + 1
                goto L31
            L5e:
                r2 = move-exception
                r3 = r4
                goto L6a
            L61:
                com.facebook.common.dextricks.MultiDexClassLoaderJava r0 = com.facebook.common.dextricks.MultiDexClassLoaderJava.this
                com.facebook.common.dextricks.stats.ClassLoadingStats r0 = r0.mClassLoadingStats
                r0.incrementDexFileQueries(r4)
                return r1
            L69:
                r2 = move-exception
            L6a:
                com.facebook.common.dextricks.MultiDexClassLoaderJava r1 = com.facebook.common.dextricks.MultiDexClassLoaderJava.this
                boolean r0 = com.facebook.common.dextricks.MultiDexClassLoader.sHadFancyLoaderFailure
                com.facebook.common.dextricks.stats.ClassLoadingStats r0 = r1.mClassLoadingStats
                r0.incrementDexFileQueries(r3)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.MultiDexClassLoaderJava.LoadApi.loadInnerNewApiClass(java.lang.String, android.util.Pair[], int):java.lang.Class");
        }

        public LoadApi() {
        }
    }

    public static int getDexLength(Pair<DexFile, Boolean>[] pairArr) {
        return (pairArr.length - 1) / 2;
    }

    public static int getFirstIndexOfFixedDexes(Pair<DexFile, Boolean>[] pairArr) {
        return (pairArr.length + 1) / 2;
    }

    public static int getFixedDexIndex(int i, int i2) {
        return i2 + i + 1;
    }

    private Class<?> loadInnerFallbackApiClass(String str, Pair<DexFile, Boolean>[] pairArr, int i) throws Throwable {
        Class<?> clsLoadClass;
        int i2 = 1;
        try {
            ClassLoader classLoader = this.mPutativeLoader;
            Pair<DexFile, Boolean> pair = pairArr[0];
            if (pair != null) {
                DexFile dexFile = (DexFile) pair.first;
                clsLoadClass = dexFile.loadClass(str, classLoader);
                observeDexFileLoad(dexFile, clsLoadClass);
            } else {
                onNoDexInThePromotedFrontDexSpot();
                clsLoadClass = null;
            }
            int i3 = 1;
            while (clsLoadClass == null && i3 < i) {
                try {
                    DexFile dexFile2 = (DexFile) pairArr[i3].first;
                    clsLoadClass = dexFile2.loadClass(str, classLoader);
                    if (clsLoadClass != null && i3 > 1) {
                        promoteDexFile(dexFile2, i3);
                    }
                    observeDexFileLoad(dexFile2, clsLoadClass);
                    i3++;
                } catch (Throwable th) {
                    th = th;
                    i2 = i3;
                    this.mClassLoadingStats.incrementDexFileQueries(i2);
                    throw th;
                }
            }
            this.mClassLoadingStats.incrementDexFileQueries(i3);
            return clsLoadClass;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private Class<?> loadInnerOldApiClass(String str, Pair<DexFile, Boolean>[] pairArr, int i) throws Throwable {
        Class<?> clsLoadClassBinaryName;
        int i2 = 1;
        try {
            ClassLoader classLoader = this.mPutativeLoader;
            Pair<DexFile, Boolean> pair = pairArr[0];
            if (pair != null) {
                DexFile dexFile = (DexFile) pair.first;
                clsLoadClassBinaryName = DexFileLoadOld.loadClassBinaryName(dexFile, str, classLoader);
                observeDexFileLoad(dexFile, clsLoadClassBinaryName);
            } else {
                onNoDexInThePromotedFrontDexSpot();
                clsLoadClassBinaryName = null;
            }
            int i3 = 1;
            while (clsLoadClassBinaryName == null && i3 < i) {
                try {
                    DexFile dexFile2 = (DexFile) pairArr[i3].first;
                    clsLoadClassBinaryName = DexFileLoadOld.loadClassBinaryName(dexFile2, str, classLoader);
                    if (clsLoadClassBinaryName != null && i3 > 1) {
                        promoteDexFile(dexFile2, i3);
                    }
                    observeDexFileLoad(dexFile2, clsLoadClassBinaryName);
                    i3++;
                } catch (Throwable th) {
                    th = th;
                    i2 = i3;
                    this.mClassLoadingStats.incrementDexFileQueries(i2);
                    throw th;
                }
            }
            this.mClassLoadingStats.incrementDexFileQueries(i3);
            return clsLoadClassBinaryName;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private boolean canPromoteDexesAndUpdateState(int i, int i2) {
        int i3;
        if (i2 <= i) {
            return false;
        }
        do {
            i3 = this.mLastLoadedDexIndex.get();
            if (i3 >= i) {
                return true;
            }
        } while (!this.mLastLoadedDexIndex.compareAndSet(i3, i));
        return true;
    }

    public static boolean classInLongtailModule(String str) {
        return NameClassifier.A01(sEncodedLongtailUnrenamedTypes, str);
    }

    private Class<?> findClassSlowPath(String str) {
        Pair<DexFile, Boolean>[] pairArr = this.mDexFiles;
        int length = pairArr.length;
        Class clsLoadClass = null;
        if (length != 0) {
            ClassLoader classLoader = this.mPutativeLoader;
            int i = 1;
            try {
                try {
                    Pair<DexFile, Boolean> pair = pairArr[0];
                    if (pair != null) {
                        clsLoadClass = DexFileLoadNew.loadClassBinaryName((DexFile) pair.first, str, classLoader);
                    } else {
                        onNoDexInThePromotedFrontDexSpot();
                    }
                    int i2 = 1;
                    while (clsLoadClass == null && i2 < length) {
                        clsLoadClass = DexFileLoadNew.loadClassBinaryName((DexFile) pairArr[i2].first, str, classLoader);
                        i2++;
                    }
                    if (length > 1) {
                        sApiDetectionState = (byte) 1;
                    }
                    this.mClassLoadingStats.incrementDexFileQueries(i2);
                    return clsLoadClass;
                } catch (NoSuchMethodError unused) {
                    sApiDetectionState = (byte) 3;
                    Pair<DexFile, Boolean> pair2 = pairArr[0];
                    if (pair2 != null) {
                        clsLoadClass = ((DexFile) pair2.first).loadClass(str, classLoader);
                    } else {
                        onNoDexInThePromotedFrontDexSpot();
                    }
                    while (clsLoadClass == null && i < length) {
                        clsLoadClass = ((DexFile) pairArr[i].first).loadClass(str, classLoader);
                        i++;
                    }
                    this.mClassLoadingStats.incrementDexFileQueries(i);
                }
            } catch (NoSuchMethodError unused2) {
                Pair<DexFile, Boolean> pair3 = pairArr[0];
                if (pair3 != null) {
                    clsLoadClass = DexFileLoadOld.loadClassBinaryName((DexFile) pair3.first, str, classLoader);
                } else {
                    onNoDexInThePromotedFrontDexSpot();
                }
                int i3 = 1;
                while (clsLoadClass == null && i3 < length) {
                    clsLoadClass = DexFileLoadOld.loadClassBinaryName((DexFile) pairArr[i3].first, str, classLoader);
                    i3++;
                }
                sApiDetectionState = (byte) 2;
                this.mClassLoadingStats.incrementDexFileQueries(i3);
                return clsLoadClass;
            }
        }
        return clsLoadClass;
    }

    private Class<?> loadInnerNewApiClass(String str, Pair<DexFile, Boolean>[] pairArr, int i) {
        return this.loadApi.loadInnerNewApiClass(str, pairArr, i);
    }

    public static boolean mayBeRedexRenamedOrStoreCanary(String str) {
        String str2 = sEncodedLongtailUnrenamedTypes;
        int length = str.length();
        if (length <= 6) {
            if (length > 2 && str.charAt(0) == 'X' && str.charAt(1) == '.') {
                return true;
            }
        } else if (length == 22 && str.charAt(0) == 's' && str.charAt(1) == 't' && str.charAt(9) == '.' && str.charAt(10) == 'd' && str.charAt(15) == '.' && str.charAt(16) == 'C' && str.charAt(21) == 'y') {
            return true;
        }
        return NameClassifier.A01(str2, str);
    }

    private void noteClassLoadFailure(String str) {
        String[] strArr = this.mDexLoadFailureHistory;
        synchronized (strArr) {
            int i = this.mDexLoadFailurePosition;
            this.mDexLoadFailurePosition = i + 1;
            strArr[i % strArr.length] = str;
        }
    }

    private boolean oldShouldAskBootClassLoader(String str) {
        return !str.startsWith("com.facebook.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onNoDexInThePromotedFrontDexSpot() {
        this.mClassLoadingStats.decrementDexFileQueries();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void promoteDexFile(DexFile dexFile, int i) {
        Pair<DexFile, Boolean>[] pairArr = this.mDexFiles;
        if (canPromoteDexesAndUpdateState(i, (pairArr.length + 1) / 2)) {
            synchronized (pairArr) {
                if (pairArr[1].first != dexFile) {
                    Pair<DexFile, Boolean> pair = pairArr[i];
                    if (pair.first == dexFile) {
                        pairArr[0] = pair;
                        while (i >= 1) {
                            pairArr[i] = pairArr[i - 1];
                            i--;
                        }
                        pairArr[0] = null;
                    }
                }
            }
        }
    }

    @Override // com.facebook.common.dextricks.ClassLoadsLoggingProvider
    public void addListener(ClassLoadsListener classLoadsListener) {
        this.mClassLoadsNotifier.addListener(classLoadsListener);
    }

    @Override // com.facebook.common.dextricks.MultiDexClassLoader
    public void configure(ClassLoaderConfiguration classLoaderConfiguration) {
        this.mConfig = classLoaderConfiguration;
        int length = this.mPrimaryDexes.length;
        int size = classLoaderConfiguration.mDexFiles.size();
        int length2 = this.mAuxiliaryDexes.length;
        int i = length + size + length2;
        Pair<DexFile, Boolean>[] pairArr = new Pair[(i * 2) + 1];
        int i2 = 0;
        pairArr[0] = null;
        int i3 = 0;
        int i4 = 1;
        while (i3 < length) {
            Pair<DexFile, Boolean> pairCreate = Pair.create(this.mPrimaryDexes[i3], Boolean.FALSE);
            pairArr[i4] = pairCreate;
            pairArr[i4 + i] = pairCreate;
            i3++;
            i4++;
        }
        int i5 = 0;
        while (i5 < size) {
            Pair<DexFile, Boolean> pairCreatePair = createPair(classLoaderConfiguration.mDexFiles.get(i5));
            pairArr[i4] = pairCreatePair;
            pairArr[i4 + i] = pairCreatePair;
            i5++;
            i4++;
        }
        while (i2 < length2) {
            Pair<DexFile, Boolean> pairCreatePair2 = createPair(this.mAuxiliaryDexes[i2]);
            pairArr[i4] = pairCreatePair2;
            pairArr[i4 + i] = pairCreatePair2;
            i2++;
            i4++;
        }
        this.mDexFiles = pairArr;
        configureArtHacks(classLoaderConfiguration);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.common.dextricks.MultiDexClassLoader
    public DexFile[] doGetConfiguredDexFiles() {
        Pair<DexFile, Boolean>[] pairArr = this.mDexFiles;
        int length = (pairArr.length - 1) / 2;
        DexFile[] dexFileArr = new DexFile[length];
        for (int i = 0; i < length; i++) {
            dexFileArr[i] = pairArr[length + i + 1].first;
        }
        return dexFileArr;
    }

    @Override // java.lang.ClassLoader
    public Class<?> findClass(String str) throws ClassNotFoundException {
        ClassLoadsNotifier classLoadsNotifier;
        Pair<DexFile, Boolean>[] pairArr = this.mDexFiles;
        int length = pairArr.length;
        if (length == 0) {
            throw new ClassNotFoundException(str);
        }
        this.mClassLoadsNotifier.notifyClassLoadBegin(str);
        Class<?> clsFindClassSlowPath = null;
        try {
            try {
                byte b = sApiDetectionState;
                if (b == 0) {
                    clsFindClassSlowPath = findClassSlowPath(str);
                } else if (b == 1) {
                    clsFindClassSlowPath = loadInnerNewApiClass(str, pairArr, this.mLastLoadedDexIndex.get());
                    if (clsFindClassSlowPath == null) {
                        clsFindClassSlowPath = loadInnerNewApiClass(str, pairArr, length);
                    }
                } else if (b == 2) {
                    clsFindClassSlowPath = loadInnerOldApiClass(str, pairArr, this.mLastLoadedDexIndex.get());
                    if (clsFindClassSlowPath == null) {
                        clsFindClassSlowPath = loadInnerOldApiClass(str, pairArr, length);
                    }
                } else if (b == 3 && (clsFindClassSlowPath = loadInnerFallbackApiClass(str, pairArr, this.mLastLoadedDexIndex.get())) == null) {
                    clsFindClassSlowPath = loadInnerFallbackApiClass(str, pairArr, length);
                }
                classLoadsNotifier = this.mClassLoadsNotifier;
            } catch (ClassCircularityError e) {
                CFK.A06(MultiDexClassLoader.TAG, FGI.A0d("ClassCircularityError loading ", str, ": ", e.getMessage()));
                classLoadsNotifier = this.mClassLoadsNotifier;
            }
            if (clsFindClassSlowPath != null) {
                classLoadsNotifier.notifyClassLoaded(clsFindClassSlowPath);
            } else {
                classLoadsNotifier.notifyClassNotFound(str);
            }
            if (clsFindClassSlowPath != null) {
                return clsFindClassSlowPath;
            }
            throw new ClassNotFoundException(str);
        } catch (Throwable th) {
            this.mClassLoadsNotifier.notifyClassNotFound(str);
            throw th;
        }
    }

    public DexFile getPrimaryDex() {
        DexFile[] dexFileArr = this.mPrimaryDexes;
        if (dexFileArr.length == 0) {
            return null;
        }
        return dexFileArr[0];
    }

    @Override // com.facebook.common.dextricks.MultiDexClassLoader
    public String[] getRecentFailedClasses() {
        String[] strArr = this.mDexLoadFailureHistory;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        synchronized (strArr) {
            int i = this.mDexLoadFailurePosition;
            if (i < length) {
                i += length;
            }
            int i2 = 0;
            while (i2 < length) {
                int i3 = i2 + 1;
                strArr2[i2] = strArr[(i - i3) % length];
                i2 = i3;
            }
        }
        return strArr2;
    }

    public String toString() {
        return "MultiDexClassLoaderJava";
    }

    public MultiDexClassLoaderJava(Context context, ArrayList<DexFile> arrayList, ArrayList<DexFile> arrayList2) {
        this.mPrimaryDexes = (DexFile[]) arrayList.toArray(new DexFile[arrayList.size()]);
        this.mAuxiliaryDexes = (DexFile[]) arrayList2.toArray(new DexFile[arrayList2.size()]);
        CFK.A05(MultiDexClassLoader.TAG, "using java MDCL");
    }

    private void appendLine(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(System.lineSeparator());
    }

    public static boolean containsOnlyRenamedClasses(DexFile dexFile) {
        String string = dexFile.toString();
        return string != null && string.contains(FGI.A0M("modules/", Halfnosis.A00()));
    }

    public static Pair<DexFile, Boolean> createPair(DexFile dexFile) {
        return Pair.create(dexFile, Boolean.valueOf(containsOnlyRenamedClasses(dexFile)));
    }

    private Class<?> loadParentBootLoaderClass(String str) {
        if (getParent() == null) {
            return null;
        }
        try {
            return getParent().loadClass(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static boolean shouldAskParent(String str) {
        return NameClassifier.A00(str);
    }

    @Override // java.lang.ClassLoader
    public Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
        boolean z2;
        if (NameClassifier.A00(str)) {
            Class<?> clsLoadParentBootLoaderClass = loadParentBootLoaderClass(str);
            z2 = clsLoadParentBootLoaderClass == null;
            return clsLoadParentBootLoaderClass;
        }
        try {
            return findClass(str);
        } catch (ClassNotFoundException e) {
            if (z2 || !(!str.startsWith("com.facebook.")) || (clsLoadParentBootLoaderClass = loadParentBootLoaderClass(str)) == null) {
                noteClassLoadFailure(str);
                throw e;
            }
            this.mClassLoadingStats.incrementIncorrectDfaGuesses();
            CFK.A06(MultiDexClassLoader.TAG, FGI.A0U("Class ", str, " was loaded on fallback. This should be fixed and added to the shouldAskParent method."));
        }
    }

    @Override // com.facebook.common.dextricks.MultiDexClassLoader
    public String verboseDescription() {
        StringBuilder sbA0w = C60O.A0w();
        Pair<DexFile, Boolean>[] pairArr = this.mDexFiles;
        int length = (pairArr.length - 1) / 2;
        appendLine(sbA0w, FGI.A0H("Number of dex files ", length));
        for (int i = 0; i < length; i++) {
            Pair<DexFile, Boolean> pair = pairArr[length + i + 1];
            String name = ((DexFile) pair.first).getName();
            if (name != null) {
                long length2 = BV4.A0G(name).length();
                StringBuilder sbA0g = C3cG.A0g(name);
                sbA0g.append("|renamed_only=");
                sbA0g.append(pair.second);
                appendLine(sbA0w, BV7.A0z("|file_size=", sbA0g, length2));
                if (name.contains(Halfnosis.A00())) {
                    try {
                        appendLine(sbA0w, FGI.A0M("longtail dex sha1: ", DexStoreUtils.sha1ForFile(name)));
                    } catch (IOException | NoSuchAlgorithmException e) {
                        appendLine(sbA0w, AnonymousClass007.A0a("Could not compute sha1 for longtail dex! ", e));
                    }
                    Enumeration<String> enumerationEntries = ((DexFile) pair.first).entries();
                    int i2 = 0;
                    while (enumerationEntries.hasMoreElements()) {
                        String strNextElement = enumerationEntries.nextElement();
                        if (i2 <= 50) {
                            appendLine(sbA0w, FGI.A0M("longtail entry: ", strNextElement));
                        }
                        i2++;
                    }
                    appendLine(sbA0w, FGI.A0H("total entries count ", i2));
                    if (i2 >= 50) {
                        appendLine(sbA0w, "more entries truncated.");
                    }
                }
            }
        }
        return sbA0w.toString();
    }
}
