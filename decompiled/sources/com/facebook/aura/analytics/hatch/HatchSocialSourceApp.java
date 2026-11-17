package com.facebook.aura.analytics.hatch;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C06H;
import X.Ey9;
import X.F3w;
import com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLoggerKt;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class HatchSocialSourceApp {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchSocialSourceApp[] $VALUES;
    public static final Companion Companion;
    public static final HatchSocialSourceApp FACEBOOK;
    public static final HatchSocialSourceApp INSTAGRAM;
    public static final HatchSocialSourceApp THREADS;
    public final String value;

    static {
        HatchSocialSourceApp hatchSocialSourceApp = new HatchSocialSourceApp("FACEBOOK", 0, MAHatchNativeAuthAppStartLoggerKt.SOURCE_APP_FACEBOOK);
        FACEBOOK = hatchSocialSourceApp;
        HatchSocialSourceApp hatchSocialSourceApp2 = new HatchSocialSourceApp("INSTAGRAM", 1, MAHatchNativeAuthAppStartLoggerKt.SOURCE_APP_INSTAGRAM);
        INSTAGRAM = hatchSocialSourceApp2;
        HatchSocialSourceApp hatchSocialSourceApp3 = new HatchSocialSourceApp("THREADS", 2, MAHatchNativeAuthAppStartLoggerKt.SOURCE_APP_THREADS);
        THREADS = hatchSocialSourceApp3;
        HatchSocialSourceApp[] hatchSocialSourceAppArr = {hatchSocialSourceApp, hatchSocialSourceApp2, hatchSocialSourceApp3};
        $VALUES = hatchSocialSourceAppArr;
        $ENTRIES = new F3w(hatchSocialSourceAppArr);
        Companion = new Companion();
    }

    public static Ey9<HatchSocialSourceApp> getEntries() {
        return $ENTRIES;
    }

    public static HatchSocialSourceApp valueOf(String str) {
        return (HatchSocialSourceApp) Enum.valueOf(HatchSocialSourceApp.class, str);
    }

    public static HatchSocialSourceApp[] values() {
        return (HatchSocialSourceApp[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public final class Companion {
        public final HatchSocialSourceApp fromSourceName(String str) {
            String strA0l;
            HatchSocialSourceApp hatchSocialSourceApp = null;
            if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null) {
                return null;
            }
            String strA0u = AnonymousClass001.A0u(strA0l);
            Iterator<HatchSocialSourceApp> it = HatchSocialSourceApp.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                HatchSocialSourceApp next = it.next();
                if (strA0u.equals(next.getValue())) {
                    hatchSocialSourceApp = next;
                    break;
                }
            }
            return hatchSocialSourceApp;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchSocialSourceApp(String str, int i, String str2) {
        this.value = str2;
    }
}
