package com.facebook.aura.pairs;

import X.AGH;
import X.AbstractC5321DgF;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;

@Serializable
/* loaded from: classes2.dex */
public final class ConnectionResourcesJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final Map<String, Integer> counts;
    public final String next;
    public final List<JsonElement> participants;
    public final List<JsonElement> resources;
    public final List<String> unavailable_hosts;

    public final class Companion {
        public final C9hr<ConnectionResourcesJson> serializer() {
            return ConnectionResourcesJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{AbstractC5321DgF.A02(num, ConnectionResourcesJson$Companion$$childSerializers$1.INSTANCE), AbstractC5321DgF.A02(num, ConnectionResourcesJson$Companion$$childSerializers$2.INSTANCE), AbstractC5321DgF.A02(num, ConnectionResourcesJson$Companion$$childSerializers$3.INSTANCE), null, AbstractC5321DgF.A02(num, ConnectionResourcesJson$Companion$$childSerializers$4.INSTANCE)};
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectionResourcesJson) {
                ConnectionResourcesJson connectionResourcesJson = (ConnectionResourcesJson) obj;
                if (!C7384Etj.areEqual(this.resources, connectionResourcesJson.resources) || !C7384Etj.areEqual(this.participants, connectionResourcesJson.participants) || !C7384Etj.areEqual(this.counts, connectionResourcesJson.counts) || !C7384Etj.areEqual(this.next, connectionResourcesJson.next) || !C7384Etj.areEqual(this.unavailable_hosts, connectionResourcesJson.unavailable_hosts)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConnectionResourcesJson copy$default(ConnectionResourcesJson connectionResourcesJson, List list, List list2, Map map, String str, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = connectionResourcesJson.resources;
        }
        if ((i & 2) != 0) {
            list2 = connectionResourcesJson.participants;
        }
        if ((i & 4) != 0) {
            map = connectionResourcesJson.counts;
        }
        if ((i & 8) != 0) {
            str = connectionResourcesJson.next;
        }
        if ((i & 16) != 0) {
            list3 = connectionResourcesJson.unavailable_hosts;
        }
        return connectionResourcesJson.copy(list, list2, map, str, list3);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(ConnectionResourcesJson connectionResourcesJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cG.A1L(connectionResourcesJson.resources)) {
            c9j5.AAQ(connectionResourcesJson.resources, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || !C3cG.A1L(connectionResourcesJson.participants)) {
            c9j5.AAQ(connectionResourcesJson.participants, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
        if (zAfR || !C3cG.A1M(connectionResourcesJson.counts)) {
            c9j5.AAQ(connectionResourcesJson.counts, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
        if (zAfR || connectionResourcesJson.next != null) {
            c9j5.AAP(connectionResourcesJson.next, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || !C3cG.A1L(connectionResourcesJson.unavailable_hosts)) {
            c9j5.AAQ(connectionResourcesJson.unavailable_hosts, C3cH.A15(f0cArr, 4), c9iZ, 4);
        }
    }

    public final List<JsonElement> component1() {
        return this.resources;
    }

    public final List<JsonElement> component2() {
        return this.participants;
    }

    public final Map<String, Integer> component3() {
        return this.counts;
    }

    public final String component4() {
        return this.next;
    }

    public final List<String> component5() {
        return this.unavailable_hosts;
    }

    public final Map<String, Integer> getCounts() {
        return this.counts;
    }

    public final String getNext() {
        return this.next;
    }

    public final List<JsonElement> getParticipants() {
        return this.participants;
    }

    public final List<JsonElement> getResources() {
        return this.resources;
    }

    public final List<String> getUnavailable_hosts() {
        return this.unavailable_hosts;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.unavailable_hosts, (AnonymousClass005.A0F(this.counts, AnonymousClass005.A0F(this.participants, AnonymousClass005.A0E(this.resources))) + AnonymousClass006.A0G(this.next)) * 31);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConnectionResourcesJson(List<? extends JsonElement> list, List<? extends JsonElement> list2, Map<String, Integer> map, String str, List<String> list3) {
        AnonymousClass005.A0x(list, list2, map);
        C7384Etj.A0Y(list3, 4);
        this.resources = list;
        this.participants = list2;
        this.counts = map;
        this.next = str;
        this.unavailable_hosts = list3;
    }

    public final ConnectionResourcesJson copy(List<? extends JsonElement> list, List<? extends JsonElement> list2, Map<String, Integer> map, String str, List<String> list3) {
        AnonymousClass005.A0x(list, list2, map);
        C7384Etj.A0Y(list3, 4);
        return new ConnectionResourcesJson(list, list2, map, str, list3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ConnectionResourcesJson(List list, List list2, Map map, String str, List list3, int i, C06H c06h) {
        this(C3cI.A10(list, i), C3cI.A11(list2, i), C3cH.A0o(map, i & 4), AnonymousClass006.A0u(i, str), (i & 16) != 0 ? C0881AGi.A00 : list3);
    }

    public /* synthetic */ ConnectionResourcesJson(int i, List list, List list2, Map map, String str, List list3, C2hx c2hx) {
        this.resources = (i & 1) == 0 ? C0881AGi.A00 : list;
        if ((i & 2) == 0) {
            this.participants = C0881AGi.A00;
        } else {
            this.participants = list2;
        }
        if ((i & 4) == 0) {
            this.counts = AGH.A0E();
        } else {
            this.counts = map;
        }
        if ((i & 8) == 0) {
            this.next = null;
        } else {
            this.next = str;
        }
        if ((i & 16) == 0) {
            this.unavailable_hosts = C0881AGi.A00;
        } else {
            this.unavailable_hosts = list3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConnectionResourcesJson() {
        this((List) null, (List) (0 == true ? 1 : 0), (Map) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), 31, (C06H) (0 == true ? 1 : 0));
    }
}
