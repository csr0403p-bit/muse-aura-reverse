package com.facebook.aura.analytics.hatch.caa;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class HatchCaaRegistrationFunnel {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchCaaRegistrationFunnel[] $VALUES;
    public static final HatchCaaRegistrationFunnel CONFIRMATION;
    public static final HatchCaaRegistrationFunnel REGISTRATION;
    public final HatchCaaRegistrationEventCategory category;
    public final String eventName;

    static {
        HatchCaaRegistrationFunnel hatchCaaRegistrationFunnel = new HatchCaaRegistrationFunnel("REGISTRATION", 0, "registration_flow_state", HatchCaaRegistrationEventCategory.REGISTRATION_FUNNEL);
        REGISTRATION = hatchCaaRegistrationFunnel;
        HatchCaaRegistrationFunnel hatchCaaRegistrationFunnel2 = new HatchCaaRegistrationFunnel("CONFIRMATION", 1, "confirmation_flow_state", HatchCaaRegistrationEventCategory.CONFIRMATION_FUNNEL);
        CONFIRMATION = hatchCaaRegistrationFunnel2;
        HatchCaaRegistrationFunnel[] hatchCaaRegistrationFunnelArr = {hatchCaaRegistrationFunnel, hatchCaaRegistrationFunnel2};
        $VALUES = hatchCaaRegistrationFunnelArr;
        $ENTRIES = C3cG.A0w(hatchCaaRegistrationFunnelArr);
    }

    public static Ey9<HatchCaaRegistrationFunnel> getEntries() {
        return $ENTRIES;
    }

    public static HatchCaaRegistrationFunnel valueOf(String str) {
        return (HatchCaaRegistrationFunnel) Enum.valueOf(HatchCaaRegistrationFunnel.class, str);
    }

    public static HatchCaaRegistrationFunnel[] values() {
        return (HatchCaaRegistrationFunnel[]) $VALUES.clone();
    }

    public final HatchCaaRegistrationEventCategory getCategory() {
        return this.category;
    }

    public final String getEventName() {
        return this.eventName;
    }

    public HatchCaaRegistrationFunnel(String str, int i, String str2, HatchCaaRegistrationEventCategory hatchCaaRegistrationEventCategory) {
        this.eventName = str2;
        this.category = hatchCaaRegistrationEventCategory;
    }
}
