package com.sun.jna;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BV4;
import X.BV5;
import X.BV7;
import X.C3cG;
import X.C60O;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class Platform {
    public static final int AIX = 7;
    public static final int ANDROID = 8;
    public static final String ARCH;
    public static final String C_LIBRARY_NAME;
    public static final int DRAGONFLYBSD = 12;
    public static final int FREEBSD = 4;
    public static final int GNU = 9;
    public static final boolean HAS_AWT;
    public static final boolean HAS_BUFFERS;
    public static final boolean HAS_DLL_CALLBACKS;
    public static final boolean HAS_JAWT;
    public static final int KFREEBSD = 10;
    public static final int LINUX = 1;
    public static final int MAC = 0;
    public static final String MATH_LIBRARY_NAME;
    public static final int NETBSD = 11;
    public static final int OPENBSD = 5;
    public static final String RESOURCE_PREFIX;
    public static final boolean RO_FIELDS;
    public static final int SOLARIS = 3;
    public static final int UNSPECIFIED = -1;
    public static final int WINDOWS = 2;
    public static final int WINDOWSCE = 6;
    public static final int osType;

    /* JADX WARN: Removed duplicated region for block: B:51:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d2  */
    static {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.jna.Platform.<clinit>():void");
    }

    public static String getNativeLibraryResourcePrefix() {
        String property = System.getProperty("jna.prefix");
        return property == null ? getNativeLibraryResourcePrefix(osType, System.getProperty("os.arch"), System.getProperty("os.name")) : property;
    }

    public static final int getOSType() {
        return osType;
    }

    public static final boolean hasRuntimeExec() {
        return (AnonymousClass002.A1Q(osType, 6) && "J9".equals(System.getProperty("java.vm.name"))) ? false : true;
    }

    public static final boolean is64Bit() {
        String property = System.getProperty("sun.arch.data.model", System.getProperty("com.ibm.vm.bitmode"));
        if (property != null) {
            return "64".equals(property);
        }
        String str = ARCH;
        return "x86-64".equals(str) || "ia64".equals(str) || "ppc64".equals(str) || "ppc64le".equals(str) || "sparcv9".equals(str) || "mips64".equals(str) || "mips64el".equals(str) || "loongarch64".equals(str) || "amd64".equals(str) || "aarch64".equals(str) || Native.POINTER_SIZE == 8;
    }

    public static final boolean isAIX() {
        return AnonymousClass002.A1Q(osType, 7);
    }

    public static final boolean isARM() {
        String str = ARCH;
        return str.startsWith("arm") || str.startsWith("aarch");
    }

    public static final boolean isAndroid() {
        return AnonymousClass002.A1Q(osType, 8);
    }

    public static final boolean isDragonFlyBSD() {
        return AnonymousClass002.A1Q(osType, 12);
    }

    public static final boolean isFreeBSD() {
        return AnonymousClass003.A17(osType);
    }

    public static final boolean isGNU() {
        return AnonymousClass002.A1Q(osType, 9);
    }

    public static final boolean isIntel() {
        return AnonymousClass002.A1L(ARCH.startsWith("x86") ? 1 : 0);
    }

    public static final boolean isLinux() {
        return BV7.A1Q(osType);
    }

    public static final boolean isLoongArch() {
        return ARCH.startsWith("loongarch");
    }

    public static final boolean isMIPS() {
        String str = ARCH;
        return str.equals("mips") || str.equals("mips64") || str.equals("mipsel") || str.equals("mips64el");
    }

    public static final boolean isMac() {
        return AnonymousClass002.A1M(osType);
    }

    public static final boolean isNetBSD() {
        return AnonymousClass002.A1Q(osType, 11);
    }

    public static final boolean isOpenBSD() {
        return AnonymousClass002.A1Q(osType, 5);
    }

    public static final boolean isPPC() {
        return AnonymousClass002.A1L(ARCH.startsWith("ppc") ? 1 : 0);
    }

    public static final boolean isRISCV() {
        return ARCH.startsWith("riscv");
    }

    public static final boolean isSPARC() {
        return ARCH.startsWith("sparc");
    }

    public static boolean isSoftFloat() {
        Logger loggerA1B;
        Level level;
        String str;
        try {
            if (BV4.A0G("/proc/self/exe").exists()) {
                return !ELFAnalyser.analyse(r1.getCanonicalPath()).isArmHardFloat();
            }
            return false;
        } catch (IOException e) {
            e = e;
            loggerA1B = BV5.A1B(Platform.class);
            level = Level.INFO;
            str = "Failed to read '/proc/self/exe' or the target binary.";
            loggerA1B.log(level, str, e);
            return false;
        } catch (SecurityException e2) {
            e = e2;
            loggerA1B = BV5.A1B(Platform.class);
            level = Level.INFO;
            str = "SecurityException while analysing '/proc/self/exe' or the target binary.";
            loggerA1B.log(level, str, e);
            return false;
        }
    }

    public static final boolean isSolaris() {
        return AnonymousClass002.A1Q(osType, 3);
    }

    public static final boolean isWindows() {
        int i = osType;
        return i == 2 || i == 6;
    }

    public static final boolean isWindowsCE() {
        return AnonymousClass002.A1Q(osType, 6);
    }

    public static final boolean iskFreeBSD() {
        return AnonymousClass002.A1Q(osType, 10);
    }

    public static String getCanonicalArchitecture(String str, int i) {
        String strTrim = str.toLowerCase().trim();
        if ("powerpc".equals(strTrim)) {
            strTrim = "ppc";
        } else if ("powerpc64".equals(strTrim)) {
            strTrim = "ppc64";
        } else if ("i386".equals(strTrim) || "i686".equals(strTrim)) {
            strTrim = "x86";
        } else if ("x86_64".equals(strTrim) || "amd64".equals(strTrim)) {
            strTrim = "x86-64";
        } else if ("zarch_64".equals(strTrim)) {
            strTrim = "s390x";
        }
        if ("ppc64".equals(strTrim) && "little".equals(System.getProperty("sun.cpu.endian"))) {
            strTrim = "ppc64le";
        }
        return ("arm".equals(strTrim) && i == 1 && isSoftFloat()) ? "armel" : strTrim;
    }

    public static final boolean isX11() {
        return (isWindows() || AnonymousClass002.A1M(osType)) ? false : true;
    }

    public static String getNativeLibraryResourcePrefix(int i, String str, String str2) {
        String str3;
        StringBuilder sbA0x;
        String canonicalArchitecture = getCanonicalArchitecture(str, i);
        switch (i) {
            case 0:
                str3 = "darwin-";
                sbA0x = C60O.A0x(str3);
                break;
            case 1:
                str3 = "linux-";
                sbA0x = C60O.A0x(str3);
                break;
            case 2:
                str3 = "win32-";
                sbA0x = C60O.A0x(str3);
                break;
            case 3:
                str3 = "sunos-";
                sbA0x = C60O.A0x(str3);
                break;
            case 4:
                str3 = "freebsd-";
                sbA0x = C60O.A0x(str3);
                break;
            case 5:
                str3 = "openbsd-";
                sbA0x = C60O.A0x(str3);
                break;
            case 6:
                str3 = "w32ce-";
                sbA0x = C60O.A0x(str3);
                break;
            case 7:
            case 9:
            default:
                String lowerCase = str2.toLowerCase();
                int iIndexOf = lowerCase.indexOf(InviteCodeScratcherKt.CODE_SEPARATOR);
                if (iIndexOf != -1) {
                    lowerCase = BV4.A0j(lowerCase, iIndexOf);
                }
                sbA0x = C3cG.A0g(lowerCase);
                sbA0x.append("-");
                break;
            case 8:
                if (canonicalArchitecture.startsWith("arm")) {
                    canonicalArchitecture = "arm";
                }
                str3 = "android-";
                sbA0x = C60O.A0x(str3);
                break;
            case 10:
                str3 = "kfreebsd-";
                sbA0x = C60O.A0x(str3);
                break;
            case 11:
                str3 = "netbsd-";
                sbA0x = C60O.A0x(str3);
                break;
            case 12:
                str3 = "dragonflybsd-";
                sbA0x = C60O.A0x(str3);
                break;
        }
        return AnonymousClass001.A0v(canonicalArchitecture, sbA0x);
    }
}
