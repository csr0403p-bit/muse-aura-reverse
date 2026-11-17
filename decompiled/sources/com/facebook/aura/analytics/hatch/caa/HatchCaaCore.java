package com.facebook.aura.analytics.hatch.caa;

import X.AGH;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.C06G;
import X.C06H;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import com.facebook.aura.gateway.JarvisProtocolKt;
import java.util.Map;

/* loaded from: classes2.dex */
public final class HatchCaaCore extends C06G {
    public static final Companion Companion = new Companion();
    public final String event;
    public final String eventCategory;
    public final String eventFlow;
    public final String eventStep;
    public final Map<String, String> extraClientData;
    public final String waterfallId;

    public final class Companion {
        public final HatchCaaCore create(String str, String str2, String str3, String str4, Map<String, String> map, HatchCaaAccountErrorType hatchCaaAccountErrorType) {
            AnonymousClass005.A17(str, str2, str3, str4, map);
            return new HatchCaaCore(str, str2, str3, str4, C3cG.A0Y(), AGH.A02(AnonymousClass006.A11("is_native", "1", map), hatchCaaAccountErrorType != null ? AnonymousClass007.A0d(HatchCaaEnumsKt.ERROR_TYPE_SOURCE_KEY, HatchCaaEnumsKt.ERROR_TYPE_SOURCE_CLIENT, C3cG.A0r("error_type", hatchCaaAccountErrorType.getValue())) : AGH.A0E()));
        }

        public static /* synthetic */ HatchCaaCore create$default(Companion companion, String str, String str2, String str3, String str4, Map map, HatchCaaAccountErrorType hatchCaaAccountErrorType, int i, Object obj) {
            Map<String, String> mapA0o = C3cH.A0o(map, i & 16);
            if ((i & 32) != 0) {
                hatchCaaAccountErrorType = null;
            }
            return companion.create(str, str2, str3, str4, mapA0o, hatchCaaAccountErrorType);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchCaaCore) {
                HatchCaaCore hatchCaaCore = (HatchCaaCore) obj;
                if (!C7384Etj.areEqual(this.event, hatchCaaCore.event) || !C7384Etj.areEqual(this.eventCategory, hatchCaaCore.eventCategory) || !C7384Etj.areEqual(this.eventFlow, hatchCaaCore.eventFlow) || !C7384Etj.areEqual(this.eventStep, hatchCaaCore.eventStep) || !C7384Etj.areEqual(this.waterfallId, hatchCaaCore.waterfallId) || !C7384Etj.areEqual(this.extraClientData, hatchCaaCore.extraClientData)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchCaaCore copy$default(HatchCaaCore hatchCaaCore, String str, String str2, String str3, String str4, String str5, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchCaaCore.event;
        }
        if ((i & 2) != 0) {
            str2 = hatchCaaCore.eventCategory;
        }
        if ((i & 4) != 0) {
            str3 = hatchCaaCore.eventFlow;
        }
        if ((i & 8) != 0) {
            str4 = hatchCaaCore.eventStep;
        }
        if ((i & 16) != 0) {
            str5 = hatchCaaCore.waterfallId;
        }
        if ((i & 32) != 0) {
            map = hatchCaaCore.extraClientData;
        }
        return hatchCaaCore.copy(str, str2, str3, str4, str5, map);
    }

    public final String component1() {
        return this.event;
    }

    public final String component2() {
        return this.eventCategory;
    }

    public final String component3() {
        return this.eventFlow;
    }

    public final String component4() {
        return this.eventStep;
    }

    public final String component5() {
        return this.waterfallId;
    }

    public final Map<String, String> component6() {
        return this.extraClientData;
    }

    public final String describe() {
        String str = this.event;
        String str2 = this.eventFlow;
        String str3 = this.eventStep;
        String str4 = this.eventCategory;
        String str5 = this.waterfallId;
        if (str5 == null) {
            str5 = JarvisProtocolKt.NONE_LOG_VALUE;
        }
        StringBuilder sbA0x = C3cI.A0x("event=", str);
        sbA0x.append(" flow=");
        sbA0x.append(str2);
        sbA0x.append(" step=");
        sbA0x.append(str3);
        sbA0x.append(" category=");
        sbA0x.append(str4);
        sbA0x.append(" waterfall=");
        return AnonymousClass001.A0v(str5, sbA0x);
    }

    public final String getEvent() {
        return this.event;
    }

    public final String getEventCategory() {
        return this.eventCategory;
    }

    public final String getEventFlow() {
        return this.eventFlow;
    }

    public final String getEventStep() {
        return this.eventStep;
    }

    public final Map<String, String> getExtraClientData() {
        return this.extraClientData;
    }

    public final String getWaterfallId() {
        return this.waterfallId;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.extraClientData, (AnonymousClass005.A0I(this.eventStep, AnonymousClass005.A0I(this.eventFlow, AnonymousClass005.A0I(this.eventCategory, AnonymousClass001.A0G(this.event)))) + AnonymousClass006.A0G(this.waterfallId)) * 31);
    }

    public HatchCaaCore(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        AnonymousClass005.A14(str, str2, str3, str4);
        C7384Etj.A0Y(map, 5);
        this.event = str;
        this.eventCategory = str2;
        this.eventFlow = str3;
        this.eventStep = str4;
        this.waterfallId = str5;
        this.extraClientData = map;
    }

    public final HatchCaaCore copy(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        AnonymousClass005.A14(str, str2, str3, str4);
        C7384Etj.A0Y(map, 5);
        return new HatchCaaCore(str, str2, str3, str4, str5, map);
    }

    public String toString() {
        return super.toString();
    }
}
