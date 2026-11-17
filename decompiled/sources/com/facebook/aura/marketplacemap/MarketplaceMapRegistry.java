package com.facebook.aura.marketplacemap;

import X.AbstractC3358CGz;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06H;
import X.C7384Etj;
import X.C8j4;
import X.FGI;
import X.InterfaceC7549F2g;
import com.facebook.aura.model.MarketplaceMapWidgetData;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class MarketplaceMapRegistry implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final int MAX_ENTRY_COUNT = 8;
    public final Map<String, MarketplaceMapWidgetData> entries;

    private final String key(String str, String str2) {
        return FGI.A0U(str, ":", str2);
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.entries.clear();
    }

    public final class Companion {
        public final MarketplaceMapRegistry getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (MarketplaceMapRegistry) abstractC3358CGz.A03(MarketplaceMapRegistry.class, MarketplaceMapRegistry$Companion$getInstance$1.INSTANCE);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final MarketplaceMapWidgetData data(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return this.entries.get(FGI.A0U(str, ":", str2));
    }

    public final void publish(String str, String str2, MarketplaceMapWidgetData marketplaceMapWidgetData) {
        AnonymousClass005.A0x(str, str2, marketplaceMapWidgetData);
        Map<String, MarketplaceMapWidgetData> map = this.entries;
        C7384Etj.A0T(map);
        map.put(FGI.A0U(str, ":", str2), marketplaceMapWidgetData);
    }

    public /* synthetic */ MarketplaceMapRegistry(C06H c06h) {
        this();
    }

    public MarketplaceMapRegistry() {
        this.entries = Collections.synchronizedMap(new LinkedHashMap<String, MarketplaceMapWidgetData>() { // from class: com.facebook.aura.marketplacemap.MarketplaceMapRegistry$entries$1
            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsKey(Object obj) {
                if (obj instanceof String) {
                    return super.containsKey(obj);
                }
                return false;
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsValue(Object obj) {
                if (obj instanceof MarketplaceMapWidgetData) {
                    return super.containsValue(obj);
                }
                return false;
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ MarketplaceMapWidgetData get(Object obj) {
                if (obj instanceof String) {
                    return (MarketplaceMapWidgetData) super.get(obj);
                }
                return null;
            }

            public final /* bridge */ MarketplaceMapWidgetData getOrDefault(Object obj, MarketplaceMapWidgetData marketplaceMapWidgetData) {
                return !(obj instanceof String) ? marketplaceMapWidgetData : (MarketplaceMapWidgetData) super.getOrDefault(obj, (Object) marketplaceMapWidgetData);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ MarketplaceMapWidgetData remove(Object obj) {
                if (obj instanceof String) {
                    return (MarketplaceMapWidgetData) super.remove(obj);
                }
                return null;
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<Map.Entry<String, MarketplaceMapWidgetData>> entrySet() {
                return super.entrySet();
            }

            public /* bridge */ Set<Map.Entry<String, MarketplaceMapWidgetData>> getEntries() {
                return super.entrySet();
            }

            public /* bridge */ Set<String> getKeys() {
                return super.keySet();
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            public /* bridge */ Collection<MarketplaceMapWidgetData> getValues() {
                return super.values();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<String> keySet() {
                return super.keySet();
            }

            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(Map.Entry<String, MarketplaceMapWidgetData> entry) {
                return C8j4.A1V(size(), 8);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ int size() {
                return super.size();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Collection<MarketplaceMapWidgetData> values() {
                return super.values();
            }

            public /* bridge */ boolean containsKey(String str) {
                return super.containsKey((Object) str);
            }

            public /* bridge */ boolean containsValue(MarketplaceMapWidgetData marketplaceMapWidgetData) {
                return super.containsValue((Object) marketplaceMapWidgetData);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object get(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return super.get(obj);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
                if (!(obj instanceof String)) {
                    return obj2;
                }
                return super.getOrDefault(obj, obj2);
            }

            @Override // java.util.HashMap, java.util.Map
            public final /* bridge */ boolean remove(Object obj, Object obj2) {
                if (!(obj instanceof String) || !(obj2 instanceof MarketplaceMapWidgetData)) {
                    return false;
                }
                return super.remove(obj, obj2);
            }

            public /* bridge */ MarketplaceMapWidgetData get(String str) {
                return (MarketplaceMapWidgetData) super.get((Object) str);
            }

            public /* bridge */ MarketplaceMapWidgetData getOrDefault(String str, MarketplaceMapWidgetData marketplaceMapWidgetData) {
                return (MarketplaceMapWidgetData) super.getOrDefault((Object) str, (String) marketplaceMapWidgetData);
            }

            public /* bridge */ boolean remove(String str, MarketplaceMapWidgetData marketplaceMapWidgetData) {
                return super.remove((Object) str, (Object) marketplaceMapWidgetData);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object remove(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return super.remove(obj);
            }

            public /* bridge */ MarketplaceMapWidgetData remove(String str) {
                return (MarketplaceMapWidgetData) super.remove((Object) str);
            }
        });
    }
}
