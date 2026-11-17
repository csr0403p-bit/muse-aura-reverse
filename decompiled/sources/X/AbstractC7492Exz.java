package X;

import java.util.Set;

/* renamed from: X.Exz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7492Exz {
    public static final int CONFIG_INIT_ERROR = -1;
    public static final String KEY_BLACKLIST = "__fs_policy_blacklisted_events__";
    public static final String KEY_CHECKSUM = "__fs_policy_config_checksum__";
    public static final int NON_EXISTENCE_FREQUENCY = -2;
    public static final String SEPARATOR = ":";

    public abstract String getCheckSum();

    public abstract int getInt(String str, int i);

    public final int getSamplingFrequency(String str, String str2, String str3, int i) {
        int i2;
        C7384Etj.A0Y(str, 0);
        if (!hasValidConfig()) {
            return -1;
        }
        if (getBlacklist().contains(str)) {
            return 0;
        }
        if (str2 != null) {
            if (str3 != null && (i2 = getInt(FGI.A0h(str, ":", str2, ":", str3), -2)) != -2) {
                return i2;
            }
            int i3 = getInt(FGI.A0U(str, ":", str2), -2);
            if (i3 != -2) {
                return i3;
            }
        }
        int i4 = ((F1N) this).lightSharedPreferences.getInt(str, -2);
        return i4 == -2 ? i : i4;
    }

    public abstract String getString(String str, String str2);

    public abstract Set<String> getStringSet(String str, Set<String> set);

    public final boolean isAlwaysReported(String str) {
        C7384Etj.A0Y(str, 0);
        return (getBlacklist().contains(str) || isProbSamplingEnabled(str)) ? false : true;
    }

    public final boolean isBlacklisted(String str) {
        C7384Etj.A0Y(str, 0);
        return getBlacklist().contains(str);
    }

    public final boolean isProbSamplingEnabled(String str) {
        C7384Etj.A0Y(str, 0);
        return (getBlacklist().contains(str) || ((F1N) this).lightSharedPreferences.getInt(str, -2) == -2) ? false : true;
    }

    public final Set<String> getBlacklist() {
        return getStringSet(KEY_BLACKLIST, A3q.A00);
    }

    public final boolean hasValidConfig() {
        return !AnonymousClass002.A1M(getCheckSum().length());
    }

    public final int getSamplingFrequency(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        return getSamplingFrequency(str, str2, str3, 1);
    }
}
