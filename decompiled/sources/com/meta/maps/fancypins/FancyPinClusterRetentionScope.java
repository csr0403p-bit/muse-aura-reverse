package com.meta.maps.fancypins;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.model.ReplyAttributionSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class FancyPinClusterRetentionScope {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ FancyPinClusterRetentionScope[] $VALUES;
    public static final FancyPinClusterRetentionScope PRESENTATION;
    public final String jsonValue;

    static {
        FancyPinClusterRetentionScope fancyPinClusterRetentionScope = new FancyPinClusterRetentionScope("PRESENTATION", 0, ReplyAttributionSerializer.TYPE_PRESENTATION);
        PRESENTATION = fancyPinClusterRetentionScope;
        FancyPinClusterRetentionScope[] fancyPinClusterRetentionScopeArr = {fancyPinClusterRetentionScope};
        $VALUES = fancyPinClusterRetentionScopeArr;
        $ENTRIES = C3cG.A0w(fancyPinClusterRetentionScopeArr);
    }

    public static Ey9<FancyPinClusterRetentionScope> getEntries() {
        return $ENTRIES;
    }

    public static FancyPinClusterRetentionScope valueOf(String str) {
        return (FancyPinClusterRetentionScope) Enum.valueOf(FancyPinClusterRetentionScope.class, str);
    }

    public static FancyPinClusterRetentionScope[] values() {
        return (FancyPinClusterRetentionScope[]) $VALUES.clone();
    }

    public final String getJsonValue$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        return this.jsonValue;
    }

    public FancyPinClusterRetentionScope(String str, int i, String str2) {
        this.jsonValue = str2;
    }
}
