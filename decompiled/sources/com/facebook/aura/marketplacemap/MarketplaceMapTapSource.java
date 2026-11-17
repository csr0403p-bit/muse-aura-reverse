package com.facebook.aura.marketplacemap;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class MarketplaceMapTapSource {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ MarketplaceMapTapSource[] $VALUES;
    public static final MarketplaceMapTapSource FULLSCREEN_PIN;
    public static final MarketplaceMapTapSource PIN;
    public static final MarketplaceMapTapSource ROW;

    static {
        MarketplaceMapTapSource marketplaceMapTapSource = new MarketplaceMapTapSource("PIN", 0);
        PIN = marketplaceMapTapSource;
        MarketplaceMapTapSource marketplaceMapTapSource2 = new MarketplaceMapTapSource("FULLSCREEN_PIN", 1);
        FULLSCREEN_PIN = marketplaceMapTapSource2;
        MarketplaceMapTapSource marketplaceMapTapSource3 = new MarketplaceMapTapSource("ROW", 2);
        ROW = marketplaceMapTapSource3;
        MarketplaceMapTapSource[] marketplaceMapTapSourceArr = {marketplaceMapTapSource, marketplaceMapTapSource2, marketplaceMapTapSource3};
        $VALUES = marketplaceMapTapSourceArr;
        $ENTRIES = C3cG.A0w(marketplaceMapTapSourceArr);
    }

    public static Ey9<MarketplaceMapTapSource> getEntries() {
        return $ENTRIES;
    }

    public static MarketplaceMapTapSource valueOf(String str) {
        return (MarketplaceMapTapSource) Enum.valueOf(MarketplaceMapTapSource.class, str);
    }

    public static MarketplaceMapTapSource[] values() {
        return (MarketplaceMapTapSource[]) $VALUES.clone();
    }

    public MarketplaceMapTapSource(String str, int i) {
    }
}
