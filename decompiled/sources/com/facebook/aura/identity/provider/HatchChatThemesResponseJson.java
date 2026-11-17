package com.facebook.aura.identity.provider;

import X.AGH;
import X.AbstractC5321DgF;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C2hx;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class HatchChatThemesResponseJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final Map<String, HatchChatThemeOptionJson> options;
    public final List<String> order;
    public final String selected_theme_id;

    public final class Companion {
        public final C9hr<HatchChatThemesResponseJson> serializer() {
            return HatchChatThemesResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, AbstractC5321DgF.A02(num, HatchChatThemesResponseJson$Companion$$childSerializers$1.INSTANCE), AbstractC5321DgF.A02(num, HatchChatThemesResponseJson$Companion$$childSerializers$2.INSTANCE)};
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchChatThemesResponseJson) {
                HatchChatThemesResponseJson hatchChatThemesResponseJson = (HatchChatThemesResponseJson) obj;
                if (!C7384Etj.areEqual(this.selected_theme_id, hatchChatThemesResponseJson.selected_theme_id) || !C7384Etj.areEqual(this.order, hatchChatThemesResponseJson.order) || !C7384Etj.areEqual(this.options, hatchChatThemesResponseJson.options)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchChatThemesResponseJson copy$default(HatchChatThemesResponseJson hatchChatThemesResponseJson, String str, List list, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchChatThemesResponseJson.selected_theme_id;
        }
        if ((i & 2) != 0) {
            list = hatchChatThemesResponseJson.order;
        }
        if ((i & 4) != 0) {
            map = hatchChatThemesResponseJson.options;
        }
        return hatchChatThemesResponseJson.copy(str, list, map);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_identity_provider_provider(HatchChatThemesResponseJson hatchChatThemesResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || hatchChatThemesResponseJson.selected_theme_id != null) {
            c9j5.AAP(hatchChatThemesResponseJson.selected_theme_id, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || !C7384Etj.areEqual(hatchChatThemesResponseJson.order, C0881AGi.A00)) {
            c9j5.AAQ(hatchChatThemesResponseJson.order, C06G.A0e(f0cArr, 1), c9iZ, 1);
        }
        if (zAfR || !C7384Etj.areEqual(hatchChatThemesResponseJson.options, AGH.A0E())) {
            c9j5.AAQ(hatchChatThemesResponseJson.options, C06G.A0e(f0cArr, 2), c9iZ, 2);
        }
    }

    public final String component1() {
        return this.selected_theme_id;
    }

    public final List<String> component2() {
        return this.order;
    }

    public final Map<String, HatchChatThemeOptionJson> component3() {
        return this.options;
    }

    public final Map<String, HatchChatThemeOptionJson> getOptions() {
        return this.options;
    }

    public final List<String> getOrder() {
        return this.order;
    }

    public final String getSelected_theme_id() {
        return this.selected_theme_id;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.options, AnonymousClass005.A0F(this.order, AnonymousClass006.A0G(this.selected_theme_id) * 31));
    }

    public final HatchChatThemesPayload toDomain() {
        Set<Map.Entry<String, HatchChatThemeOptionJson>> setEntrySet = this.options.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, HatchChatThemeOptionJson> entry : setEntrySet) {
            HatchChatThemeOption domain = entry.getValue().toDomain(entry.getKey());
            if (domain != null) {
                arrayList.add(domain);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass005.A0C(arrayList));
        for (Object obj : arrayList) {
            linkedHashMap.put(((HatchChatThemeOption) obj).id, obj);
        }
        List<String> listSortedChatThemeIds = HatchChatThemeHelperKt.sortedChatThemeIds(linkedHashMap.keySet(), this.order);
        ArrayList arrayList2 = new ArrayList();
        Iterator<String> it = listSortedChatThemeIds.iterator();
        while (it.hasNext()) {
            Object obj2 = linkedHashMap.get(it.next());
            if (obj2 != null) {
                arrayList2.add(obj2);
            }
        }
        return new HatchChatThemesPayload(arrayList2, HatchChatThemeHelperKt.normalizedChatThemeId(this.selected_theme_id));
    }

    public HatchChatThemesResponseJson(String str, List<String> list, Map<String, HatchChatThemeOptionJson> map) {
        AnonymousClass003.A0x(list, map);
        this.selected_theme_id = str;
        this.order = list;
        this.options = map;
    }

    public final HatchChatThemesResponseJson copy(String str, List<String> list, Map<String, HatchChatThemeOptionJson> map) {
        AnonymousClass003.A0x(list, map);
        return new HatchChatThemesResponseJson(str, list, map);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchChatThemesResponseJson(String str, List list, Map map, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str), (i & 2) != 0 ? C0881AGi.A00 : list, (i & 4) != 0 ? AGH.A0E() : map);
    }

    public /* synthetic */ HatchChatThemesResponseJson(int i, String str, List list, Map map, C2hx c2hx) {
        this.selected_theme_id = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.order = C0881AGi.A00;
        } else {
            this.order = list;
        }
        if ((i & 4) == 0) {
            this.options = AGH.A0E();
        } else {
            this.options = map;
        }
    }

    public HatchChatThemesResponseJson() {
        this(null, C0881AGi.A00, AGH.A0E());
    }
}
