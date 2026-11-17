package com.facebook.aura.ccv.nativeflow;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLoggerKt;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HatchLinkableAccountType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchLinkableAccountType[] $VALUES;
    public static final Companion Companion;
    public static final HatchLinkableAccountType FACEBOOK;
    public static final HatchLinkableAccountType INSTAGRAM;
    public final String wireValue;

    static {
        HatchLinkableAccountType hatchLinkableAccountType = new HatchLinkableAccountType("INSTAGRAM", 0, MAHatchNativeAuthAppStartLoggerKt.SOURCE_APP_INSTAGRAM);
        INSTAGRAM = hatchLinkableAccountType;
        HatchLinkableAccountType hatchLinkableAccountType2 = new HatchLinkableAccountType("FACEBOOK", 1, MAHatchNativeAuthAppStartLoggerKt.SOURCE_APP_FACEBOOK);
        FACEBOOK = hatchLinkableAccountType2;
        HatchLinkableAccountType[] hatchLinkableAccountTypeArr = {hatchLinkableAccountType, hatchLinkableAccountType2};
        $VALUES = hatchLinkableAccountTypeArr;
        $ENTRIES = C3cG.A0w(hatchLinkableAccountTypeArr);
        Companion = new Companion();
    }

    public static Ey9<HatchLinkableAccountType> getEntries() {
        return $ENTRIES;
    }

    public static HatchLinkableAccountType valueOf(String str) {
        return (HatchLinkableAccountType) Enum.valueOf(HatchLinkableAccountType.class, str);
    }

    public static HatchLinkableAccountType[] values() {
        return (HatchLinkableAccountType[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public final class Companion {
        public final HatchLinkableAccountType fromWire(String str) {
            HatchLinkableAccountType next;
            C7384Etj.A0Y(str, 0);
            Iterator<HatchLinkableAccountType> it = HatchLinkableAccountType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (str.equals(next.getWireValue())) {
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

    public HatchLinkableAccountType(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
