package com.facebook.aura.maps;

import X.AbstractC3358CGz;
import X.AnonymousClass003;
import X.C06H;
import X.C7384Etj;
import X.C8j4;
import X.InterfaceC7549F2g;
import com.facebook.aura.maps.model.HatchMapScene;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class HatchMapSceneRegistry implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final int MAX_PRESENTATION_COUNT = 8;
    public final Map<String, HatchMapScene> scenes;

    public final HatchMapScene scene(String str) {
        C7384Etj.A0Y(str, 0);
        return this.scenes.get(str);
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.scenes.clear();
    }

    public final class Companion {
        public final HatchMapSceneRegistry getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchMapSceneRegistry) abstractC3358CGz.A03(HatchMapSceneRegistry.class, HatchMapSceneRegistry$Companion$getInstance$1.INSTANCE);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final void publish(String str, HatchMapScene hatchMapScene) {
        AnonymousClass003.A0u(str, hatchMapScene);
        if (str.length() != 0) {
            Map<String, HatchMapScene> map = this.scenes;
            C7384Etj.A0T(map);
            map.put(str, hatchMapScene);
        }
    }

    public /* synthetic */ HatchMapSceneRegistry(C06H c06h) {
        this();
    }

    public HatchMapSceneRegistry() {
        this.scenes = Collections.synchronizedMap(new LinkedHashMap<String, HatchMapScene>() { // from class: com.facebook.aura.maps.HatchMapSceneRegistry$scenes$1
            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsKey(Object obj) {
                if (obj instanceof String) {
                    return super.containsKey(obj);
                }
                return false;
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsValue(Object obj) {
                if (obj instanceof HatchMapScene) {
                    return super.containsValue(obj);
                }
                return false;
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ HatchMapScene get(Object obj) {
                if (obj instanceof String) {
                    return (HatchMapScene) super.get(obj);
                }
                return null;
            }

            public final /* bridge */ HatchMapScene getOrDefault(Object obj, HatchMapScene hatchMapScene) {
                return !(obj instanceof String) ? hatchMapScene : (HatchMapScene) super.getOrDefault(obj, (Object) hatchMapScene);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ HatchMapScene remove(Object obj) {
                if (obj instanceof String) {
                    return (HatchMapScene) super.remove(obj);
                }
                return null;
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<Map.Entry<String, HatchMapScene>> entrySet() {
                return super.entrySet();
            }

            public /* bridge */ Set<Map.Entry<String, HatchMapScene>> getEntries() {
                return super.entrySet();
            }

            public /* bridge */ Set<String> getKeys() {
                return super.keySet();
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            public /* bridge */ Collection<HatchMapScene> getValues() {
                return super.values();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<String> keySet() {
                return super.keySet();
            }

            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(Map.Entry<String, HatchMapScene> entry) {
                return C8j4.A1V(size(), 8);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ int size() {
                return super.size();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Collection<HatchMapScene> values() {
                return super.values();
            }

            public /* bridge */ boolean containsKey(String str) {
                return super.containsKey((Object) str);
            }

            public /* bridge */ boolean containsValue(HatchMapScene hatchMapScene) {
                return super.containsValue((Object) hatchMapScene);
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
                if (!(obj instanceof String) || !(obj2 instanceof HatchMapScene)) {
                    return false;
                }
                return super.remove(obj, obj2);
            }

            public /* bridge */ HatchMapScene get(String str) {
                return (HatchMapScene) super.get((Object) str);
            }

            public /* bridge */ HatchMapScene getOrDefault(String str, HatchMapScene hatchMapScene) {
                return (HatchMapScene) super.getOrDefault((Object) str, (String) hatchMapScene);
            }

            public /* bridge */ boolean remove(String str, HatchMapScene hatchMapScene) {
                return super.remove((Object) str, (Object) hatchMapScene);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object remove(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return super.remove(obj);
            }

            public /* bridge */ HatchMapScene remove(String str) {
                return (HatchMapScene) super.remove((Object) str);
            }
        });
    }
}
