package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class EPL {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EPL[] A01;
    public static final EPL A02;
    public static final EPL A03;
    public static final EPL A04;
    public static final EPL A05;
    public static final EPL A06;
    public static final EPL A07;
    public static final EPL A08;
    public static final EPL A09;
    public static final EPL A0A;
    public static final EPL A0B;
    public static final EPL A0C;
    public static final EPL A0D;
    public static final EPL A0E;
    public static final EPL A0F;
    public static final EPL A0G;
    public static final EPL A0H;
    public static final EPL A0I;
    public static final EPL A0J;
    public static final EPL A0K;
    public static final EPL A0L;
    public static final EPL A0M;
    public static final EPL A0N;
    public static final EPL A0O;
    public static final EPL A0P;
    public final String accountManagerType;
    public final String packageName;

    static {
        EPL epl = new EPL("FACEBOOK", 0, "com.facebook.auth.login", "com.facebook.katana");
        A05 = epl;
        EPL epl2 = new EPL("FACEBOOK_DEBUG", 1, "com.facebook.auth.login", "com.facebook.wakizashi");
        A06 = epl2;
        EPL epl3 = new EPL("FACEBOOK_LITE", 2, "com.facebook.lite", "com.facebook.lite");
        A08 = epl3;
        EPL epl4 = new EPL("FACEBOOK_WITH_V2_PROVIDER", 3, "com.facebook.auth.login", "com.facebook.katana");
        A09 = epl4;
        EPL epl5 = new EPL("FACEBOOK_DEBUG_WITH_V2_PROVIDER", 4, "com.facebook.auth.login", "com.facebook.wakizashi");
        A07 = epl5;
        EPL epl6 = new EPL("INSTAGRAM", 5, "www.instagram.com", "com.instagram.android");
        A0D = epl6;
        EPL epl7 = new EPL("INSTAGRAM_LITE", 6, "www.instagram.lite", "com.instagram.lite");
        A0E = epl7;
        EPL epl8 = new EPL("INSTAGRAM_WITH_LITE_PROVIDER", 7, "www.instagram.com", "com.instagram.android");
        A0F = epl8;
        EPL epl9 = new EPL("THREADS", 8, "www.instagram.barcelona", "com.instagram.barcelona");
        A0M = epl9;
        EPL epl10 = new EPL("MLITE", 9, "com.facebook.mlite", "com.facebook.mlite");
        A0I = epl10;
        EPL epl11 = new EPL("MESSENGER", 10, "com.facebook.messenger", "com.facebook.orca");
        A0G = epl11;
        EPL epl12 = new EPL("MESSENGER_WITH_LITE_PROVIDER", 11, "com.facebook.messenger", "com.facebook.orca");
        A0H = epl12;
        EPL epl13 = new EPL("OCULUS", 12, "com.oculus.twilight", "com.oculus.twilight");
        A0L = epl13;
        EPL epl14 = new EPL("NO_SOURCE", 13, "", "");
        EPL epl15 = new EPL("MWA", 14, "com.facebook.stella", "com.facebook.stella");
        A0J = epl15;
        EPL epl16 = new EPL("MWA_DEBUG", 15, "com.facebook.stella_debug", "com.facebook.stella_debug");
        A0K = epl16;
        EPL epl17 = new EPL("VIBES", 16, "com.facebook.vibes", "com.facebook.vibes");
        A0N = epl17;
        EPL epl18 = new EPL("VIBES_DEBUG", 17, "com.facebook.vibes_debug", "com.facebook.vibes_debug");
        A0O = epl18;
        EPL epl19 = new EPL("AURA", 18, "com.facebook.aura", "com.facebook.aura");
        A02 = epl19;
        EPL epl20 = new EPL("AURA_DEBUG", 19, "com.facebook.aura_debug", "com.facebook.aura_debug");
        A03 = epl20;
        EPL epl21 = new EPL("GIZMO", 20, "com.facebook.gizmo", "com.facebook.gizmo");
        A0A = epl21;
        EPL epl22 = new EPL("GIZMO_DEBUG", 21, "com.facebook.gizmo_debug", "com.facebook.gizmo_debug");
        A0B = epl22;
        EPL epl23 = new EPL("GIZMO_INTERNAL", 22, "com.facebook.gizmo_internal", "com.facebook.gizmo_internal");
        A0C = epl23;
        EPL epl24 = new EPL("ECLIPSE", 23, "com.meta.eclipse", "com.meta.eclipse");
        A04 = epl24;
        EPL epl25 = new EPL("WHATSAPP", 24, "com.whatsapp", "com.whatsapp");
        A0P = epl25;
        EPL[] eplArr = {epl, epl2, epl3, epl4, epl5, epl6, epl7, epl8, epl9, epl10, epl11, epl12, epl13, epl14, epl15, epl16, epl17, epl18, epl19, epl20, epl21, epl22, epl23, epl24, epl25};
        A01 = eplArr;
        A00 = C3cG.A0w(eplArr);
    }

    public static EPL valueOf(String str) {
        return (EPL) Enum.valueOf(EPL.class, str);
    }

    public static EPL[] values() {
        return (EPL[]) A01.clone();
    }

    public EPL(String str, int i, String str2, String str3) {
        this.accountManagerType = str2;
        this.packageName = str3;
    }
}
