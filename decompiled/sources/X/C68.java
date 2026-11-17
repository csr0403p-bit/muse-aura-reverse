package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C68 {
    public static final /* synthetic */ C68[] A00;
    public static final C68 A01;
    public static final C68 A02;
    public static final C68 A03;
    public static final C68 A04;
    public static final C68 A05;
    public static final C68 A06;
    public static final C68 A07;
    public static final C68 A08;
    public static final C68 A09;
    public static final C68 A0A;
    public static final C68 A0B;
    public static final C68 A0C;
    public static final C68 A0D;
    public static final C68 A0E;
    public EnumC3254C5u mCrashType;
    public final String mStringValue;
    public final char mSymbol;

    static {
        EnumC3254C5u enumC3254C5u = EnumC3254C5u.NONE;
        C68 c68A00 = A00(enumC3254C5u, "NO_STATUS", "No status", '0', 0);
        A0D = c68A00;
        C68 c68A002 = A00(enumC3254C5u, "INITIAL", "Initial", 'i', 1);
        A09 = c68A002;
        EnumC3254C5u enumC3254C5u2 = EnumC3254C5u.JAVA;
        C68 c68A003 = A00(enumC3254C5u2, "JAVA_CRASH", "JavaCrash", 'j', 2);
        A0A = c68A003;
        EnumC3254C5u enumC3254C5u3 = EnumC3254C5u.NATIVE;
        C68 c68A004 = A00(enumC3254C5u3, "NATIVE_CRASH_SIGSEGV", "NativeCrash_SIGSEGV", 's', 3);
        C68 c68A005 = A00(enumC3254C5u3, "NATIVE_CRASH_SIGABRT", "NativeCrash_SIGABRT", 'a', 4);
        C68 c68A006 = A00(enumC3254C5u3, "NATIVE_CRASH_SIGFPE", "NativeCrash_SIGFPE", 'f', 5);
        C68 c68A007 = A00(enumC3254C5u3, "NATIVE_CRASH_SIGILL", "NativeCrash_SIGILL", 'l', 6);
        C68 c68A008 = A00(enumC3254C5u3, "NATIVE_CRASH_SIGBUS", "NativeCrash_SIGBUS", 'b', 7);
        C68 c68A009 = A00(enumC3254C5u3, "NATIVE_CRASH_SIGTRAP", "NativeCrash_SIGTRAP", 'T', 8);
        C68 c68A0010 = A00(enumC3254C5u3, "NATIVE_CRASH_SIGXFSZ", "NativeCrash_SIGXFSZ", 'z', 9);
        C68 c68A0011 = A00(enumC3254C5u3, "NATIVE_CRASH_SIGXCPU", "NativeCrash_SIGXCPU", 'p', 10);
        C68 c68A0012 = A00(enumC3254C5u3, "NATIVE_CRASH_SIGSYS", "NativeCrash_SIGSYS", 'y', 11);
        C68 c68A0013 = A00(enumC3254C5u3, "NATIVE_CRASH_SIGSTKFLT", "NativeCrash_SIGSTKFLT", 'S', 12);
        C68 c68A0014 = A00(enumC3254C5u3, "NATIVE_CRASH_SIGHUP", "NativeCrash_SIGHUP", 'h', 13);
        C68 c68A0015 = A00(enumC3254C5u3, "NATIVE_CRASH_SIGINT", "NativeCrash_SIGINT", 'I', 14);
        C68 c68A0016 = A00(enumC3254C5u3, "NATIVE_CRASH_SIGUSR2", "NativeCrash_SIGUSR2", '2', 15);
        C68 c68A0017 = A00(enumC3254C5u3, "NATIVE_CRASH_SIGALRM", "NativeCrash_SIGALRM", 'L', 16);
        C68 c68A0018 = A00(enumC3254C5u3, "NATIVE_CRASH_SIGTERM", "NativeCrash_SIGTERM", 'e', 17);
        C68 c68A0019 = A00(enumC3254C5u3, "NATIVE_CRASH_SIGVTALRM", "NativeCrash_SIGVTALRM", 'v', 18);
        C68 c68A0020 = A00(enumC3254C5u3, "NATIVE_CRASH_SIGPROF", "NativeCrash_SIGPROF", 'P', 19);
        C68 c68A0021 = A00(enumC3254C5u3, "NATIVE_CRASH_SIGIO", "NativeCrash_SIGIO", 'o', 20);
        C68 c68A0022 = A00(enumC3254C5u3, "NATIVE_CRASH_SIGPWR", "NativeCrash_SIGPWR", 'W', 21);
        C68 c68A0023 = A00(enumC3254C5u3, "NATIVE_CRASH_OTHER", "NativeCrash_Other", 'n', 22);
        C68 c68A0024 = A00(enumC3254C5u2, "JAVA_EXIT", "JavaExit", 'x', 23);
        A0B = c68A0024;
        C68 c68A0025 = A00(enumC3254C5u2, "JAVA_EXIT_WITH_USER_KNOWLEDGE_AND_CONSENT_NOT_A_FAD", "JavaExitNotAFad", 'N', 24);
        A0C = c68A0025;
        C68 c68A0026 = A00(enumC3254C5u3, "NATIVE_EXIT", "NativeExit", 'X', 25);
        C68 c68A0027 = A00(enumC3254C5u3, "SELF_SIGKILL", "SelfSigKill", '9', 26);
        A0E = c68A0027;
        C68 c68A0028 = A00(enumC3254C5u3, "SELF_SIGSTOP", "SelfSigStop", 't', 27);
        EnumC3254C5u enumC3254C5u4 = EnumC3254C5u.ANR;
        C68 c68 = new C68(enumC3254C5u4, "ANR", "ANR", 'r', 28);
        A01 = c68;
        C68 c68A0029 = A00(enumC3254C5u4, "ANR_RECOVERED", "ANRRecovered", 'c', 29);
        A06 = c68A0029;
        C68 c68A0030 = A00(enumC3254C5u4, "ANR_SIGQUIT_NATIVE", "ANR_SIGQUIT", 'Q', 30);
        A08 = c68A0030;
        C68 c68A0031 = A00(enumC3254C5u4, "ANR_SIGQUIT", "AnrSigquit", 'q', 31);
        A07 = c68A0031;
        C68 c68A0032 = A00(enumC3254C5u4, "ANR_MT_UNBLOCKED", "AnrMtUnblocked", 'u', 32);
        A05 = c68A0032;
        C68 c68A0033 = A00(enumC3254C5u4, "ANR_AM_CONFIRMED", "AnrAmConfirmed", 'R', 33);
        A02 = c68A0033;
        C68 c68A0034 = A00(enumC3254C5u4, "ANR_AM_CONFIRMED_MT_UNBLOCKED", "AnrAmConfirmedMtUnblocked", 'U', 34);
        A03 = c68A0034;
        C68 c68A0035 = A00(enumC3254C5u4, "ANR_AM_EXPIRED", "AnrAmExpired", 'm', 35);
        A04 = c68A0035;
        C68 c68A0036 = A00(enumC3254C5u2, "APPSTATELOGGER_CRASH", "AppStateLoggerCrash", 'C', 36);
        C68 c68A0037 = A00(enumC3254C5u3, "PREALLOCATED_OOME", "PreallocatedOOME", 'O', 37);
        C68[] c68Arr = new C68[38];
        System.arraycopy(new C68[]{c68A0028, c68, c68A0029, c68A0030, c68A0031, c68A0032, c68A0033, c68A0034, c68A0035, c68A0036, c68A0037}, BV5.A1U(new C68[]{c68A00, c68A002, c68A003, c68A004, c68A005, c68A006, c68A007, c68A008, c68A009, c68A0010, c68A0011, c68A0012, c68A0013, c68A0014, c68A0015, c68A0016, c68A0017, c68A0018, c68A0019, c68A0020, c68A0021, c68A0022, c68A0023, c68A0024, c68A0025, c68A0026, c68A0027}, c68Arr) ? 1 : 0, c68Arr, 27, 11);
        A00 = c68Arr;
    }

    public static C68 A00(EnumC3254C5u enumC3254C5u, String str, String str2, char c, int i) {
        return new C68(enumC3254C5u, str, str2, c, i);
    }

    public static C68[] values() {
        return (C68[]) A00.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.mStringValue;
    }

    public C68(EnumC3254C5u enumC3254C5u, String str, String str2, char c, int i) {
        this.mSymbol = c;
        this.mStringValue = str2;
        this.mCrashType = enumC3254C5u;
    }
}
