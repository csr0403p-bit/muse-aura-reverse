package com.facebook.aura.login.nativeflow;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLoggerKt;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class HatchNtpSourceApp {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchNtpSourceApp[] $VALUES;
    public static final Companion Companion;
    public static final HatchNtpSourceApp Facebook;
    public static final HatchNtpSourceApp Instagram;
    public final String wireValue;

    static {
        HatchNtpSourceApp hatchNtpSourceApp = new HatchNtpSourceApp("Facebook", 0, MAHatchNativeAuthAppStartLoggerKt.SOURCE_APP_FACEBOOK);
        Facebook = hatchNtpSourceApp;
        HatchNtpSourceApp hatchNtpSourceApp2 = new HatchNtpSourceApp("Instagram", 1, MAHatchNativeAuthAppStartLoggerKt.SOURCE_APP_INSTAGRAM);
        Instagram = hatchNtpSourceApp2;
        HatchNtpSourceApp[] hatchNtpSourceAppArr = {hatchNtpSourceApp, hatchNtpSourceApp2};
        $VALUES = hatchNtpSourceAppArr;
        $ENTRIES = C3cG.A0w(hatchNtpSourceAppArr);
        Companion = new Companion();
    }

    public final class Companion {
        public final HatchNtpSourceApp fromWire(String str) {
            HatchNtpSourceApp next;
            Iterator<HatchNtpSourceApp> it = HatchNtpSourceApp.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (C7384Etj.areEqual(next.getWireValue(), str)) {
                    break;
                }
            }
            return next;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static Ey9<HatchNtpSourceApp> getEntries() {
        return $ENTRIES;
    }

    public static HatchNtpSourceApp valueOf(String str) {
        return (HatchNtpSourceApp) Enum.valueOf(HatchNtpSourceApp.class, str);
    }

    public static HatchNtpSourceApp[] values() {
        return (HatchNtpSourceApp[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public HatchNtpSourceApp(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
