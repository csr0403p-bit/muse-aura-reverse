package X;

import com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLoggerKt;
import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class EP1 {
    public static final Set<EP1> A00;
    public static final /* synthetic */ Ey9 A01;
    public static final /* synthetic */ EP1[] A02;
    public static final EP1 A03;
    public static final EP1 A04;
    public static final EP1 A05;
    public final String accountSourceString;

    static {
        EP1 ep1 = new EP1("ACTIVE_ACCOUNT", 0, MAHatchNativeAuthAppStartLoggerKt.ACTIVE_ACCOUNT);
        A03 = ep1;
        EP1 ep12 = new EP1("INACTIVE_LOGGED_IN_ACCOUNTS", 1, MAHatchNativeAuthAppStartLoggerKt.INACTIVE_LOGGED_IN_ACCOUNTS);
        A04 = ep12;
        EP1 ep13 = new EP1("SAVED_ACCOUNTS", 2, MAHatchNativeAuthAppStartLoggerKt.SAVED_ACCOUNTS);
        A05 = ep13;
        EP1[] ep1Arr = {ep1, ep12, ep13};
        A02 = ep1Arr;
        A01 = C3cG.A0w(ep1Arr);
        A00 = BFI.A0H(values());
    }

    public static EP1 valueOf(String str) {
        return (EP1) Enum.valueOf(EP1.class, str);
    }

    public static EP1[] values() {
        return (EP1[]) A02.clone();
    }

    public EP1(String str, int i, String str2) {
        this.accountSourceString = str2;
    }
}
