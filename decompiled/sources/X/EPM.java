package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class EPM {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EPM[] A01;
    public static final EPM A02;
    public static final EPM A03;
    public static final EPM A04;
    public static final EPM A05;
    public static final EPM A06;
    public static final EPM A07;
    public static final EPM A08;
    public static final EPM A09;
    public static final EPM A0A;
    public static final EPM A0B;
    public static final EPM A0C;
    public static final EPM A0D;
    public static final EPM A0E;
    public static final EPM A0F;
    public static final EPM A0G;
    public static final EPM A0H;
    public static final EPM A0I;
    public static final EPM A0J;
    public static final EPM A0K;
    public static final EPM A0L;
    public static final EPM A0M;
    public static final EPM A0N;
    public static final EPM A0O;
    public static final EPM A0P;
    public static final EPM A0Q;
    public final String accountManagerType;
    public final String packageName;
    public final String prefPrefix;

    static {
        EPM epm = new EPM("FACEBOOK", 0, "facebook/", "com.facebook.auth.login", "com.facebook.katana");
        A05 = epm;
        EPM epm2 = new EPM("FACEBOOK_DEBUG", 1, "facebook/", "com.facebook.auth.login", "com.facebook.wakizashi");
        A06 = epm2;
        EPM epm3 = new EPM("FACEBOOK_LITE", 2, "fblite/", "com.facebook.lite", "com.facebook.lite");
        A08 = epm3;
        EPM epm4 = new EPM("FACEBOOK_WITH_V2_PROVIDER", 3, "facebook/", "com.facebook.auth.login", "com.facebook.katana");
        A09 = epm4;
        EPM epm5 = new EPM("FACEBOOK_DEBUG_WITH_V2_PROVIDER", 4, "facebook/", "com.facebook.auth.login", "com.facebook.wakizashi");
        A07 = epm5;
        EPM epm6 = new EPM("INSTAGRAM", 5, "instagram/", "www.instagram.com", "com.instagram.android");
        A0D = epm6;
        EPM epm7 = new EPM("INSTAGRAM_WITH_LITE_PROVIDER", 6, "instagram/", "www.instagram.com", "com.instagram.android");
        A0F = epm7;
        EPM epm8 = new EPM("INSTAGRAM_LITE", 7, "iglite/", "www.instagram.lite", "com.instagram.lite");
        A0E = epm8;
        EPM epm9 = new EPM("THREADS", 8, "barcelona/", "www.instagram.barcelona", "com.instagram.barcelona");
        A0M = epm9;
        EPM epm10 = new EPM("MLITE", 9, "mlite/", "com.facebook.mlite", "com.facebook.mlite");
        A0I = epm10;
        EPM epm11 = new EPM("MESSENGER", 10, "messenger/", "com.facebook.messenger", "com.facebook.orca");
        A0G = epm11;
        EPM epm12 = new EPM("MESSENGER_WITH_LITE_PROVIDER", 11, "messenger/", "com.facebook.messenger", "com.facebook.orca");
        A0H = epm12;
        EPM epm13 = new EPM("OCULUS", 12, "oculus/", "com.oculus.twilight", "com.oculus.twilight");
        A0L = epm13;
        EPM epm14 = new EPM("MWA", 13, "stella/", "com.facebook.stella", "com.facebook.stella");
        A0J = epm14;
        EPM epm15 = new EPM("MWA_DEBUG", 14, "stella/", "com.facebook.stella_debug", "com.facebook.stella_debug");
        A0K = epm15;
        EPM epm16 = new EPM("VIBES", 15, "vibes/", "com.facebook.vibes", "com.facebook.vibes");
        A0O = epm16;
        EPM epm17 = new EPM("VIBES_DEBUG", 16, "vibes/", "com.facebook.vibes_debug", "com.facebook.vibes_debug");
        A0P = epm17;
        EPM epm18 = new EPM("AURA", 17, "aura/", "com.facebook.aura", "com.facebook.aura");
        A02 = epm18;
        EPM epm19 = new EPM("AURA_DEBUG", 18, "aura/", "com.facebook.aura_debug", "com.facebook.aura_debug");
        A03 = epm19;
        EPM epm20 = new EPM("GIZMO", 19, "gizmo/", "com.facebook.gizmo", "com.facebook.gizmo");
        A0A = epm20;
        EPM epm21 = new EPM("GIZMO_DEBUG", 20, "gizmo/", "com.facebook.gizmo_debug", "com.facebook.gizmo_debug");
        A0B = epm21;
        EPM epm22 = new EPM("GIZMO_INTERNAL", 21, "gizmo/", "com.facebook.gizmo_internal", "com.facebook.gizmo_internal");
        A0C = epm22;
        EPM epm23 = new EPM("ECLIPSE", 22, "eclipse/", "com.meta.eclipse", "com.meta.eclipse");
        A04 = epm23;
        EPM epm24 = new EPM("WHATSAPP", 23, "whatsapp/", "com.whatsapp", "com.whatsapp");
        A0Q = epm24;
        EPM epm25 = new EPM("UNKNOWN", 24, "unknown/", "unknown", "unknown");
        A0N = epm25;
        EPM[] epmArr = {epm, epm2, epm3, epm4, epm5, epm6, epm7, epm8, epm9, epm10, epm11, epm12, epm13, epm14, epm15, epm16, epm17, epm18, epm19, epm20, epm21, epm22, epm23, epm24, epm25};
        A01 = epmArr;
        A00 = C3cG.A0w(epmArr);
    }

    public static EPM valueOf(String str) {
        return (EPM) Enum.valueOf(EPM.class, str);
    }

    public static EPM[] values() {
        return (EPM[]) A01.clone();
    }

    public EPM(String str, int i, String str2, String str3, String str4) {
        this.prefPrefix = str2;
        this.accountManagerType = str3;
        this.packageName = str4;
    }
}
