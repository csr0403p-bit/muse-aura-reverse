package X;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class EP0 {
    public static final Set<EP0> A00;
    public static final Set<EP0> A01;
    public static final Set<EP0> A02;
    public static final Set<EP0> A03;
    public static final Set<EP0> A04;
    public static final /* synthetic */ Ey9 A05;
    public static final /* synthetic */ EP0[] A06;
    public static final EP0 A07;
    public static final EP0 A08;
    public static final EP0 A09;
    public static final EP0 A0A;
    public static final EP0 A0B;
    public static final EP0 A0C;
    public static final EP0 A0D;
    public static final EP0 A0E;
    public static final EP0 A0F;
    public static final EP0 A0G;
    public final String accountManagerType;
    public final String appSourceString;
    public final Map<EP1, String> credentialKeys;

    static {
        Map<EP1, String> map = EP2.A01;
        EP0 ep0 = new EP0("FACEBOOK", "Facebook", "com.facebook.auth.login", map, 0);
        A07 = ep0;
        Map<EP1, String> map2 = EP2.A00;
        EP0 ep02 = new EP0("INSTAGRAM", "Instagram", "www.instagram.com", map2, 1);
        A0B = ep02;
        EP0 ep03 = new EP0("MESSENGER", "Messenger", "com.facebook.messenger", map, 2);
        A0C = ep03;
        EP0 ep04 = new EP0("THREADS", "Barcelona", "www.instagram.barcelona", map2, 3);
        A0F = ep04;
        EP0 ep05 = new EP0("OCULUS", "Oculus", "com.oculus.twilight.accesslibrary", map2, 4);
        A0E = ep05;
        EP0 ep06 = new EP0("VIBES", "Vibes", "com.facebook.vibes.accesslibrary", map2, 5);
        A0G = ep06;
        EP0 ep07 = new EP0("MWA", "Wearables", "com.facebook.stella.accesslibrary", map2, 6);
        A0D = ep07;
        EP0 ep08 = new EP0("HATCH", "Hatch", "com.facebook.aura.accesslibrary", map2, 7);
        A09 = ep08;
        EP0 ep09 = new EP0("FBLITE", "Facebook Lite", null, map2, 8);
        A08 = ep09;
        EP0 ep010 = new EP0("IGLITE", "Instagram Lite", null, map2, 9);
        A0A = ep010;
        EP0[] ep0Arr = {ep0, ep02, ep03, ep04, ep05, ep06, ep07, ep08, ep09, ep010};
        A06 = ep0Arr;
        A05 = C3cG.A0w(ep0Arr);
        A01 = BFI.A0H(new EP0[]{ep0, ep03, ep09});
        A03 = BFI.A0H(new EP0[]{ep02, ep010});
        A04 = Collections.singleton(ep04);
        A02 = BFI.A0H(new EP0[]{ep05, ep06, ep07, ep08});
        A00 = BFI.A0H(values());
    }

    public static EP0 valueOf(String str) {
        return (EP0) Enum.valueOf(EP0.class, str);
    }

    public static EP0[] values() {
        return (EP0[]) A06.clone();
    }

    public EP0(String str, String str2, String str3, Map map, int i) {
        this.appSourceString = str2;
        this.accountManagerType = str3;
        this.credentialKeys = map;
    }
}
