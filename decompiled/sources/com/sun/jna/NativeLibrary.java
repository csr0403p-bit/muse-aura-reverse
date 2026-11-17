package com.sun.jna;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV4;
import X.BV5;
import X.BV7;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C60P;
import X.C8j4;
import X.FGI;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import com.sun.jna.internal.Cleaner;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public class NativeLibrary implements Closeable {
    public static final Level DEBUG_LOAD_LEVEL;
    public static final int DEFAULT_OPEN_OPTIONS = -1;
    public static final Logger LOG;
    public static final SymbolProvider NATIVE_SYMBOL_PROVIDER;
    public static Method addSuppressedMethod;

    /* renamed from: libraries, reason: collision with root package name */
    public static final Map<String, Reference<NativeLibrary>> f317libraries;
    public static final LinkedHashSet<String> librarySearchPath;
    public static final Map<String, List<String>> searchPaths;
    public final int callFlags;
    public final Cleaner.Cleanable cleanable;
    public final String encoding;
    public final Map<String, Function> functions;
    public volatile long handle;
    public final String libraryName;
    public final String libraryPath;
    public final Map<String, ?> options;
    public final SymbolProvider symbolProvider;

    public final class NativeLibraryDisposer implements Runnable {
        public long handle;

        @Override // java.lang.Runnable
        public synchronized void run() {
            long j = this.handle;
            if (j != 0) {
                try {
                    Native.close(j);
                    this.handle = 0L;
                } catch (Throwable th) {
                    this.handle = 0L;
                    throw th;
                }
            }
        }

        public NativeLibraryDisposer(long j) {
            this.handle = j;
        }
    }

    static {
        String name = NativeLibrary.class.getName();
        LOG = Logger.getLogger(name);
        DEBUG_LOAD_LEVEL = Native.DEBUG_LOAD ? Level.INFO : Level.FINE;
        NATIVE_SYMBOL_PROVIDER = new SymbolProvider() { // from class: com.sun.jna.NativeLibrary.1
            @Override // com.sun.jna.SymbolProvider
            public long getSymbolAddress(long j, String str, SymbolProvider symbolProvider) {
                return Native.findSymbol(j, str);
            }
        };
        f317libraries = BV4.A0u();
        searchPaths = C60O.A1C();
        librarySearchPath = C3cG.A0k();
        if (Native.POINTER_SIZE == 0) {
            throw new Error("Native library not initialized");
        }
        try {
            addSuppressedMethod = Throwable.class.getMethod("addSuppressed", Throwable.class);
        } catch (NoSuchMethodException unused) {
        } catch (SecurityException e) {
            Logger.getLogger(name).log(Level.SEVERE, "Failed to initialize 'addSuppressed' method", (Throwable) e);
        }
        String webStartLibraryPath = Native.getWebStartLibraryPath("jnidispatch");
        if (webStartLibraryPath != null) {
            librarySearchPath.add(webStartLibraryPath);
        }
        if (System.getProperty("jna.platform.library.path") == null && !Platform.isWindows()) {
            int i = Platform.osType;
            String strA0H = (BV7.A1Q(i) || AnonymousClass002.A1Q(i, 3) || AnonymousClass003.A17(i) || Platform.isDragonFlyBSD() || Platform.iskFreeBSD()) ? FGI.A0H(AnonymousClass002.A1Q(i, 3) ? CustomConnectorRegisterRepositoryKt.ROOT_PATH : "", Native.POINTER_SIZE * 8) : "";
            String[] strArr = {FGI.A0M("/usr/lib", strA0H), FGI.A0M("/lib", strA0H), "/usr/lib", "/lib"};
            if (BV7.A1Q(i) || Platform.iskFreeBSD() || Platform.isGNU()) {
                String multiArchPath = getMultiArchPath();
                strArr = new String[]{FGI.A0M("/usr/lib/", multiArchPath), FGI.A0M("/lib/", multiArchPath), FGI.A0M("/usr/lib", strA0H), FGI.A0M("/lib", strA0H), "/usr/lib", "/lib"};
            }
            if (BV7.A1Q(i)) {
                ArrayList<String> linuxLdPaths = getLinuxLdPaths();
                for (int length = strArr.length - 1; length >= 0; length--) {
                    int iIndexOf = linuxLdPaths.indexOf(strArr[length]);
                    if (iIndexOf != -1) {
                        linuxLdPaths.remove(iIndexOf);
                    }
                    linuxLdPaths.add(0, strArr[length]);
                }
                strArr = (String[]) linuxLdPaths.toArray(new String[0]);
            }
            String strA0U = "";
            String str = "";
            for (int i2 = 0; i2 < strArr.length; i2++) {
                File fileA0G = BV4.A0G(strArr[i2]);
                if (fileA0G.exists() && fileA0G.isDirectory()) {
                    strA0U = FGI.A0U(strA0U, str, strArr[i2]);
                    str = File.pathSeparator;
                }
            }
            if (!"".equals(strA0U)) {
                System.setProperty("jna.platform.library.path", strA0U);
            }
        }
        librarySearchPath.addAll(initPaths("jna.platform.library.path"));
    }

    public static final void addSearchPath(String str, String str2) {
        Map<String, List<String>> map = searchPaths;
        List<String> listA0z = BV4.A0z(str, map);
        if (listA0z == null) {
            listA0z = Collections.synchronizedList(C3cG.A0h());
            map.put(str, listA0z);
        }
        listA0z.add(str2);
    }

    public static void addSuppressedReflected(Throwable th, Throwable th2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = addSuppressedMethod;
        if (method != null) {
            try {
                method.invoke(th, th2);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                throw BV4.A0d("Failed to call addSuppressedMethod", e);
            }
        }
    }

    public static void disposeAll() {
        LinkedHashSet linkedHashSet;
        Map<String, Reference<NativeLibrary>> map = f317libraries;
        synchronized (map) {
            linkedHashSet = new LinkedHashSet(map.values());
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            NativeLibrary nativeLibrary = (NativeLibrary) ((Reference) it.next()).get();
            if (nativeLibrary != null) {
                nativeLibrary.close();
            }
        }
    }

    public static final NativeLibrary getInstance(String str) {
        return getInstance(str, (Map<String, ?>) Collections.EMPTY_MAP);
    }

    private String getLibraryName(String str) {
        String strMapSharedLibraryName = mapSharedLibraryName("---");
        int iIndexOf = strMapSharedLibraryName.indexOf("---");
        if (iIndexOf > 0 && str.startsWith(strMapSharedLibraryName.substring(0, iIndexOf))) {
            str = str.substring(iIndexOf);
        }
        int iIndexOf2 = str.indexOf(strMapSharedLibraryName.substring(iIndexOf + 3));
        return iIndexOf2 != -1 ? str.substring(0, iIndexOf2) : str;
    }

    public static String getMultiArchPath() {
        String str = Platform.ARCH;
        String str2 = Platform.iskFreeBSD() ? "-kfreebsd" : Platform.isGNU() ? "" : "-linux";
        String str3 = "-gnu";
        if (Platform.isIntel()) {
            str = Platform.is64Bit() ? "x86_64" : "i386";
        } else if (Platform.isPPC()) {
            str = Platform.is64Bit() ? "powerpc64" : "powerpc";
        } else if (Platform.isARM()) {
            str = "arm";
            str3 = "-gnueabi";
        } else if (str.equals("mips64el")) {
            str3 = "-gnuabi64";
        }
        return FGI.A0U(str, str2, str3);
    }

    public static final synchronized NativeLibrary getProcess(Map<String, ?> map) {
        return getInstance((String) null, map);
    }

    public static List<String> initPaths(String str) {
        String property = System.getProperty(str, "");
        if ("".equals(property)) {
            return Collections.EMPTY_LIST;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(property, File.pathSeparator);
        ArrayList arrayListA0h = C3cG.A0h();
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            if (!"".equals(strNextToken)) {
                arrayListA0h.add(strNextToken);
            }
        }
        return arrayListA0h;
    }

    public static boolean isVersionedName(String str) {
        int iLastIndexOf;
        int i;
        int length;
        if (str.startsWith("lib") && (iLastIndexOf = str.lastIndexOf(".so.")) != -1 && (i = iLastIndexOf + 4) < (length = str.length())) {
            for (i = iLastIndexOf + 4; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (Character.isDigit(cCharAt) || cCharAt == '.') {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x017c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.sun.jna.NativeLibrary loadLibrary(java.lang.String r19, java.util.Map<java.lang.String, ?> r20) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.jna.NativeLibrary.loadLibrary(java.lang.String, java.util.Map):com.sun.jna.NativeLibrary");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String mapSharedLibraryName(java.lang.String r5) {
        /*
            int r3 = com.sun.jna.Platform.osType
            boolean r0 = X.AnonymousClass002.A1M(r3)
            java.lang.String r4 = "lib"
            if (r0 == 0) goto L39
            boolean r0 = r5.startsWith(r4)
            java.lang.String r3 = ".dylib"
            java.lang.String r2 = ".jnilib"
            if (r0 == 0) goto L21
            boolean r0 = r5.endsWith(r3)
            if (r0 != 0) goto L20
            boolean r0 = r5.endsWith(r2)
            if (r0 == 0) goto L21
        L20:
            return r5
        L21:
            java.lang.String r5 = java.lang.System.mapLibraryName(r5)
            boolean r0 = r5.endsWith(r2)
            if (r0 == 0) goto L20
            r1 = 0
            int r0 = r5.lastIndexOf(r2)
            java.lang.String r0 = r5.substring(r1, r0)
            java.lang.String r5 = X.FGI.A0M(r0, r3)
            return r5
        L39:
            boolean r0 = X.BV7.A1Q(r3)
            java.lang.String r1 = ".a"
            java.lang.String r2 = ".so"
            if (r0 != 0) goto L8c
            boolean r0 = X.AnonymousClass003.A17(r3)
            if (r0 != 0) goto L8c
            boolean r0 = com.sun.jna.Platform.isDragonFlyBSD()
            if (r0 != 0) goto L8c
            r0 = 7
            boolean r0 = X.AnonymousClass002.A1Q(r3, r0)
            if (r0 == 0) goto L6f
            boolean r0 = isVersionedName(r5)
            if (r0 != 0) goto L20
            boolean r0 = r5.endsWith(r2)
            if (r0 != 0) goto L20
            boolean r0 = r5.startsWith(r4)
            if (r0 != 0) goto L20
            boolean r0 = r5.endsWith(r1)
        L6c:
            if (r0 == 0) goto L97
            return r5
        L6f:
            boolean r0 = com.sun.jna.Platform.isWindows()
            if (r0 == 0) goto L97
            java.lang.String r0 = ".drv"
            boolean r0 = r5.endsWith(r0)
            if (r0 != 0) goto L20
            java.lang.String r0 = ".dll"
            boolean r0 = r5.endsWith(r0)
            if (r0 != 0) goto L20
            java.lang.String r0 = ".ocx"
            boolean r0 = r5.endsWith(r0)
            goto L6c
        L8c:
            boolean r0 = isVersionedName(r5)
            if (r0 != 0) goto L20
            boolean r0 = r5.endsWith(r2)
            goto L6c
        L97:
            java.lang.String r5 = java.lang.System.mapLibraryName(r5)
            r0 = 7
            boolean r0 = X.AnonymousClass002.A1Q(r3, r0)
            if (r0 == 0) goto L20
            boolean r0 = r5.endsWith(r2)
            if (r0 == 0) goto L20
            java.lang.String r0 = ".so$"
            java.lang.String r5 = r5.replaceAll(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.jna.NativeLibrary.mapSharedLibraryName(java.lang.String):java.lang.String");
    }

    public static int openFlags(Map<String, ?> map) {
        Object obj = map.get(Library.OPTION_OPEN_FLAGS);
        if (obj instanceof Number) {
            return AnonymousClass001.A0F(obj);
        }
        return -1;
    }

    public static double parseVersion(String str) {
        String strA0g;
        int iIndexOf = str.indexOf(".");
        double d = 1.0d;
        double d2 = 0.0d;
        do {
            if (iIndexOf != -1) {
                String strA0j = BV4.A0j(str, iIndexOf);
                strA0g = BV4.A0g(iIndexOf, str);
                iIndexOf = strA0g.indexOf(".");
                str = strA0j;
            } else {
                strA0g = null;
            }
            try {
                d2 += Integer.parseInt(str) / d;
                d *= 100.0d;
                str = strA0g;
            } catch (NumberFormatException unused) {
                return 0.0d;
            }
        } while (strA0g != null);
        return d2;
    }

    public File getFile() {
        String str = this.libraryPath;
        if (str == null) {
            return null;
        }
        return BV4.A0G(str);
    }

    public Function getFunction(String str) {
        return getFunction(str, this.callFlags);
    }

    public String getName() {
        return this.libraryName;
    }

    public Map<String, ?> getOptions() {
        return this.options;
    }

    public long getSymbolAddress(String str) {
        if (this.handle != 0) {
            return this.symbolProvider.getSymbolAddress(this.handle, str, NATIVE_SYMBOL_PROVIDER);
        }
        throw new UnsatisfiedLinkError("Library has been unloaded");
    }

    public String toString() {
        return FGI.A0g("Native Library <", this.libraryPath, "@", ">", this.handle);
    }

    public NativeLibrary(String str, String str2, long j, Map<String, ?> map) {
        HashMap mapA0u = BV4.A0u();
        this.functions = mapA0u;
        String libraryName = getLibraryName(str);
        this.libraryName = libraryName;
        this.libraryPath = str2;
        this.handle = j;
        this.cleanable = Cleaner.INSTANCE.register(this, new NativeLibraryDisposer(j));
        Object obj = map.get(Library.OPTION_CALLING_CONVENTION);
        int iA0F = obj instanceof Number ? AnonymousClass001.A0F(obj) : 0;
        this.callFlags = iA0F;
        this.options = map;
        SymbolProvider symbolProvider = (SymbolProvider) map.get(Library.OPTION_SYMBOL_PROVIDER);
        this.symbolProvider = symbolProvider == null ? NATIVE_SYMBOL_PROVIDER : symbolProvider;
        String strA0p = C60O.A0p(Library.OPTION_STRING_ENCODING, map);
        strA0p = strA0p == null ? Native.getDefaultStringEncoding() : strA0p;
        this.encoding = strA0p;
        if (Platform.isWindows() && "kernel32".equals(libraryName.toLowerCase())) {
            synchronized (mapA0u) {
                mapA0u.put(functionKey("GetLastError", iA0F, strA0p), new Function(this, "GetLastError", 63, strA0p) { // from class: com.sun.jna.NativeLibrary.2
                    @Override // com.sun.jna.Function
                    public Object invoke(Method method, Class<?>[] clsArr, Class<?> cls, Object[] objArr, Map<String, ?> map2) {
                        return Integer.valueOf(Native.getLastError());
                    }

                    @Override // com.sun.jna.Function
                    public Object invoke(Object[] objArr, Class<?> cls, boolean z, int i) {
                        return Integer.valueOf(Native.getLastError());
                    }
                });
            }
        }
    }

    public static String findLibraryPath(String str, Collection<String> collection) {
        if (BV4.A0G(str).isAbsolute()) {
            return str;
        }
        String strMapSharedLibraryName = mapSharedLibraryName(str);
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it);
            File file = new File(strA0j, strMapSharedLibraryName);
            if (!file.exists()) {
                if (AnonymousClass002.A1M(Platform.osType) && strMapSharedLibraryName.endsWith(".dylib")) {
                    file = new File(strA0j, FGI.A0M(strMapSharedLibraryName.substring(0, strMapSharedLibraryName.lastIndexOf(".dylib")), ".jnilib"));
                    if (file.exists()) {
                    }
                }
            }
            return file.getAbsolutePath();
        }
        return strMapSharedLibraryName;
    }

    public static String functionKey(String str, int i, String str2) {
        StringBuilder sbA0g = C3cG.A0g(str);
        sbA0g.append("|");
        sbA0g.append(i);
        return C60P.A1M("|", str2, sbA0g);
    }

    public static ArrayList<String> getLinuxLdPaths() throws Throwable {
        Process processExec;
        ArrayList<String> arrayListA0h = C3cG.A0h();
        BufferedReader bufferedReaderA0J = null;
        try {
            processExec = Runtime.getRuntime().exec("/sbin/ldconfig -p");
            try {
                bufferedReaderA0J = BV5.A0J(processExec.getInputStream());
                while (true) {
                    String line = bufferedReaderA0J.readLine();
                    if (line != null) {
                        int iIndexOf = line.indexOf(" => ");
                        int iLastIndexOf = line.lastIndexOf(47);
                        if (iIndexOf != -1 && iLastIndexOf != -1 && iIndexOf < iLastIndexOf) {
                            BV7.A1D(line.substring(iIndexOf + 4, iLastIndexOf), arrayListA0h);
                        }
                    } else {
                        try {
                            break;
                        } catch (IOException unused) {
                        }
                    }
                }
                bufferedReaderA0J.close();
            } catch (Exception unused2) {
                if (bufferedReaderA0J != null) {
                    try {
                        bufferedReaderA0J.close();
                    } catch (IOException unused3) {
                    }
                }
                if (processExec != null) {
                    processExec.waitFor();
                }
                return arrayListA0h;
            } catch (Throwable th) {
                th = th;
                if (bufferedReaderA0J != null) {
                    try {
                        bufferedReaderA0J.close();
                    } catch (IOException unused4) {
                    }
                }
                if (processExec == null) {
                    throw th;
                }
                try {
                    processExec.waitFor();
                    throw th;
                } catch (InterruptedException unused5) {
                    throw th;
                }
            }
        } catch (Exception unused6) {
            processExec = null;
        } catch (Throwable th2) {
            th = th2;
            processExec = null;
        }
        try {
            processExec.waitFor();
        } catch (InterruptedException unused7) {
        }
        return arrayListA0h;
    }

    public static String[] matchFramework(String str) {
        String absolutePath;
        boolean zExists;
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        File fileA0G = BV4.A0G(str);
        if (fileA0G.isAbsolute()) {
            if (str.contains(".framework")) {
                zExists = fileA0G.exists();
                absolutePath = fileA0G.getAbsolutePath();
            } else {
                File fileA0O = C3cG.A0O(BV5.A0L(fileA0G.getName(), ".framework", fileA0G.getParentFile()), fileA0G.getName());
                zExists = fileA0O.exists();
                absolutePath = fileA0O.getAbsolutePath();
            }
            if (!zExists) {
                linkedHashSetA0k.add(absolutePath);
                return (String[]) linkedHashSetA0k.toArray(new String[0]);
            }
            return new String[]{absolutePath};
        }
        String[] strArr = {System.getProperty("user.home"), "", "/System"};
        if (!str.contains(".framework")) {
            str = FGI.A0U(str, ".framework/", str);
        }
        int i = 0;
        do {
            File fileA0G2 = BV4.A0G(FGI.A0U(strArr[i], "/Library/Frameworks/", str));
            if (fileA0G2.exists()) {
                absolutePath = fileA0G2.getAbsolutePath();
                return new String[]{absolutePath};
            }
            linkedHashSetA0k.add(fileA0G2.getAbsolutePath());
            i++;
        } while (i < 3);
        return (String[]) linkedHashSetA0k.toArray(new String[0]);
    }

    public static String matchLibrary(final String str, Collection<String> collection) {
        File fileA0G = BV4.A0G(str);
        if (fileA0G.isAbsolute()) {
            collection = Arrays.asList(fileA0G.getParent());
        }
        FilenameFilter filenameFilter = new FilenameFilter() { // from class: com.sun.jna.NativeLibrary.3
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str2) {
                String str3 = str;
                return (str2.startsWith(FGI.A0U("lib", str3, ".so")) || (str2.startsWith(FGI.A0M(str3, ".so")) && str3.startsWith("lib"))) && NativeLibrary.isVersionedName(str2);
            }
        };
        LinkedList linkedListA0y = BV4.A0y();
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            File[] fileArrListFiles = BV4.A0G(AnonymousClass005.A0j(it)).listFiles(filenameFilter);
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                linkedListA0y.addAll(Arrays.asList(fileArrListFiles));
            }
        }
        Iterator it2 = linkedListA0y.iterator();
        double d = -1.0d;
        String str2 = null;
        while (it2.hasNext()) {
            String absolutePath = ((File) it2.next()).getAbsolutePath();
            double version = parseVersion(absolutePath.substring(absolutePath.lastIndexOf(".so.") + 4));
            if (version > d) {
                str2 = absolutePath;
                d = version;
            }
        }
        return str2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        HashSet hashSetA13 = C60O.A13();
        Map<String, Reference<NativeLibrary>> map = f317libraries;
        synchronized (map) {
            Iterator itA0n = AnonymousClass002.A0n(map);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                if (((Reference) entryA0l.getValue()).get() == this) {
                    hashSetA13.add(C60O.A0t(entryA0l));
                }
            }
            Iterator it = hashSetA13.iterator();
            while (it.hasNext()) {
                map.remove(AnonymousClass005.A0j(it));
            }
        }
        synchronized (this) {
            if (this.handle != 0) {
                this.handle = 0L;
                this.cleanable.clean();
            }
        }
    }

    @Deprecated
    public void dispose() {
        close();
    }

    public Pointer getGlobalVariableAddress(String str) {
        try {
            return new Pointer(getSymbolAddress(str));
        } catch (UnsatisfiedLinkError e) {
            throw new UnsatisfiedLinkError(FGI.A0d("Error looking up '", str, "': ", e.getMessage()));
        }
    }

    public static final NativeLibrary getInstance(String str, Map<String, ?> map) {
        NativeLibrary nativeLibraryLoadLibrary;
        HashMap mapA0w = BV4.A0w(map);
        if (mapA0w.get(Library.OPTION_CALLING_CONVENTION) == null) {
            C8j4.A1O(Library.OPTION_CALLING_CONVENTION, mapA0w, 0);
        }
        int i = Platform.osType;
        if ((BV7.A1Q(i) || AnonymousClass003.A17(i) || Platform.isDragonFlyBSD() || AnonymousClass002.A1Q(i, 7)) && Platform.C_LIBRARY_NAME.equals(str)) {
            str = null;
        }
        Map<String, Reference<NativeLibrary>> map2 = f317libraries;
        synchronized (map2) {
            Reference<NativeLibrary> reference = map2.get(AnonymousClass006.A0y(mapA0w, str, C60O.A0w()));
            if (reference == null || (nativeLibraryLoadLibrary = reference.get()) == null) {
                if (str == null) {
                    nativeLibraryLoadLibrary = new NativeLibrary("<process>", null, Native.open(null, openFlags(mapA0w)), mapA0w);
                } else {
                    nativeLibraryLoadLibrary = loadLibrary(str, mapA0w);
                }
                WeakReference weakReferenceA0q = BV4.A0q(nativeLibraryLoadLibrary);
                map2.put(AnonymousClass006.A0y(mapA0w, nativeLibraryLoadLibrary.libraryName, C60O.A0w()), weakReferenceA0q);
                File file = nativeLibraryLoadLibrary.getFile();
                if (file != null) {
                    map2.put(AnonymousClass006.A0y(mapA0w, file.getAbsolutePath(), C60O.A0w()), weakReferenceA0q);
                    map2.put(AnonymousClass006.A0y(mapA0w, file.getName(), C60O.A0w()), weakReferenceA0q);
                }
            }
        }
        return nativeLibraryLoadLibrary;
    }

    public static final synchronized NativeLibrary getProcess() {
        return getInstance((String) null, (Map<String, ?>) Collections.EMPTY_MAP);
    }

    public Function getFunction(String str, int i, String str2) {
        Function function;
        if (str != null) {
            synchronized (this.functions) {
                String strFunctionKey = functionKey(str, i, str2);
                function = this.functions.get(strFunctionKey);
                if (function == null) {
                    function = new Function(this, str, i, str2);
                    this.functions.put(strFunctionKey, function);
                }
            }
            return function;
        }
        throw BV4.A0a("Function name may not be null");
    }

    public static final NativeLibrary getInstance(String str, ClassLoader classLoader) {
        return getInstance(str, (Map<String, ?>) Collections.singletonMap(Library.OPTION_CLASSLOADER, classLoader));
    }

    public Function getFunction(String str, Method method) {
        FunctionMapper functionMapper = (FunctionMapper) this.options.get(Library.OPTION_FUNCTION_MAPPER);
        if (functionMapper != null) {
            str = functionMapper.getFunctionName(this, method);
        }
        String property = System.getProperty("jna.profiler.prefix", "$$YJP$$");
        if (str.startsWith(property)) {
            str = str.substring(property.length());
        }
        int i = this.callFlags;
        for (Class<?> cls : method.getExceptionTypes()) {
            if (LastErrorException.class.isAssignableFrom(cls)) {
                i |= 64;
            }
        }
        return getFunction(str, i);
    }

    public Function getFunction(String str, int i) {
        return getFunction(str, i, this.encoding);
    }
}
