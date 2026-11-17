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
public final class HatchTwoFactorSourceApp {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchTwoFactorSourceApp[] $VALUES;
    public static final Companion Companion;
    public static final HatchTwoFactorSourceApp Facebook;
    public static final HatchTwoFactorSourceApp Instagram;
    public static final HatchTwoFactorSourceApp Meta;
    public final String wireValue;

    static {
        HatchTwoFactorSourceApp hatchTwoFactorSourceApp = new HatchTwoFactorSourceApp("Facebook", 0, MAHatchNativeAuthAppStartLoggerKt.SOURCE_APP_FACEBOOK);
        Facebook = hatchTwoFactorSourceApp;
        HatchTwoFactorSourceApp hatchTwoFactorSourceApp2 = new HatchTwoFactorSourceApp("Instagram", 1, MAHatchNativeAuthAppStartLoggerKt.SOURCE_APP_INSTAGRAM);
        Instagram = hatchTwoFactorSourceApp2;
        HatchTwoFactorSourceApp hatchTwoFactorSourceApp3 = new HatchTwoFactorSourceApp("Meta", 2, "meta");
        Meta = hatchTwoFactorSourceApp3;
        HatchTwoFactorSourceApp[] hatchTwoFactorSourceAppArr = {hatchTwoFactorSourceApp, hatchTwoFactorSourceApp2, hatchTwoFactorSourceApp3};
        $VALUES = hatchTwoFactorSourceAppArr;
        $ENTRIES = C3cG.A0w(hatchTwoFactorSourceAppArr);
        Companion = new Companion();
    }

    public final class Companion {
        public final HatchTwoFactorSourceApp fromWire(String str) {
            HatchTwoFactorSourceApp next;
            Iterator<HatchTwoFactorSourceApp> it = HatchTwoFactorSourceApp.getEntries().iterator();
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

    public static Ey9<HatchTwoFactorSourceApp> getEntries() {
        return $ENTRIES;
    }

    public static HatchTwoFactorSourceApp valueOf(String str) {
        return (HatchTwoFactorSourceApp) Enum.valueOf(HatchTwoFactorSourceApp.class, str);
    }

    public static HatchTwoFactorSourceApp[] values() {
        return (HatchTwoFactorSourceApp[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public HatchTwoFactorSourceApp(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
