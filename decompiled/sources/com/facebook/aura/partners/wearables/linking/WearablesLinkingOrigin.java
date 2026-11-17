package com.facebook.aura.partners.wearables.linking;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class WearablesLinkingOrigin {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ WearablesLinkingOrigin[] $VALUES;
    public static final WearablesLinkingOrigin DEEP_LINK;
    public static final WearablesLinkingOrigin ONBOARDING;
    public final HatchOrigin origin;
    public final HatchSubsurface subsurface;
    public final HatchSurface surface;

    static {
        WearablesLinkingOrigin wearablesLinkingOrigin = new WearablesLinkingOrigin("ONBOARDING", 0, HatchOrigin.ONBOARDING, HatchSurface.ONBOARDING, HatchSubsurface.ONBOARDING_POST_AUTH);
        ONBOARDING = wearablesLinkingOrigin;
        WearablesLinkingOrigin wearablesLinkingOrigin2 = new WearablesLinkingOrigin("DEEP_LINK", 1, HatchOrigin.WEARABLES, HatchSurface.WEARABLES, HatchSubsurface.WEARABLES_LINKING);
        DEEP_LINK = wearablesLinkingOrigin2;
        WearablesLinkingOrigin[] wearablesLinkingOriginArr = {wearablesLinkingOrigin, wearablesLinkingOrigin2};
        $VALUES = wearablesLinkingOriginArr;
        $ENTRIES = C3cG.A0w(wearablesLinkingOriginArr);
    }

    public static Ey9<WearablesLinkingOrigin> getEntries() {
        return $ENTRIES;
    }

    public static WearablesLinkingOrigin valueOf(String str) {
        return (WearablesLinkingOrigin) Enum.valueOf(WearablesLinkingOrigin.class, str);
    }

    public static WearablesLinkingOrigin[] values() {
        return (WearablesLinkingOrigin[]) $VALUES.clone();
    }

    public final HatchOrigin getOrigin() {
        return this.origin;
    }

    public final HatchSubsurface getSubsurface() {
        return this.subsurface;
    }

    public final HatchSurface getSurface() {
        return this.surface;
    }

    public WearablesLinkingOrigin(String str, int i, HatchOrigin hatchOrigin, HatchSurface hatchSurface, HatchSubsurface hatchSubsurface) {
        this.origin = hatchOrigin;
        this.surface = hatchSurface;
        this.subsurface = hatchSubsurface;
    }
}
