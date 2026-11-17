package com.facebook.aura.subscription.repo;

import X.AGI;
import X.AHD;
import X.AbstractC5321DgF;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C60O;
import X.C7384Etj;
import X.C79;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class DisclaimerJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final List<DisclaimerRunJson> clause;
    public final List<DisclaimerLinkJson> links;

    public final class Companion {
        public final C9hr<DisclaimerJson> serializer() {
            return DisclaimerJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DisclaimerJson) {
                DisclaimerJson disclaimerJson = (DisclaimerJson) obj;
                if (!C7384Etj.areEqual(this.clause, disclaimerJson.clause) || !C7384Etj.areEqual(this.links, disclaimerJson.links)) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        Integer num = C79.A01;
        $childSerializers = C3cG.A1W(num, AbstractC5321DgF.A02(num, DisclaimerJson$Companion$$childSerializers$1.INSTANCE), DisclaimerJson$Companion$$childSerializers$2.INSTANCE);
    }

    public static /* synthetic */ DisclaimerJson copy$default(DisclaimerJson disclaimerJson, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = disclaimerJson.clause;
        }
        if ((i & 2) != 0) {
            list2 = disclaimerJson.links;
        }
        AnonymousClass003.A0u(list, list2);
        return new DisclaimerJson(list, list2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_subscription_repo_repo(DisclaimerJson disclaimerJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cG.A1L(disclaimerJson.clause)) {
            c9j5.AAQ(disclaimerJson.clause, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || !C3cG.A1L(disclaimerJson.links)) {
            c9j5.AAQ(disclaimerJson.links, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
    }

    public final List<DisclaimerRunJson> component1() {
        return this.clause;
    }

    public final List<DisclaimerLinkJson> component2() {
        return this.links;
    }

    public final List<DisclaimerRunJson> getClause() {
        return this.clause;
    }

    public final List<DisclaimerLinkJson> getLinks() {
        return this.links;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.links, AnonymousClass005.A0E(this.clause));
    }

    public final Disclaimer toDomain() {
        List<DisclaimerLinkJson> list = this.links;
        ArrayList<DisclaimerLinkJson> arrayListA0h = C3cG.A0h();
        for (DisclaimerLinkJson disclaimerLinkJson : list) {
            DisclaimerLinkJson disclaimerLinkJson2 = disclaimerLinkJson;
            if (!C7BY.A0j(disclaimerLinkJson2.token)) {
                AnonymousClass006.A1F(disclaimerLinkJson2.url, disclaimerLinkJson, arrayListA0h);
            }
        }
        LinkedHashMap linkedHashMapA15 = C60O.A15(AnonymousClass005.A0C(arrayListA0h));
        for (DisclaimerLinkJson disclaimerLinkJson3 : arrayListA0h) {
            linkedHashMapA15.put(disclaimerLinkJson3.token, disclaimerLinkJson3.url);
        }
        List<DisclaimerRunJson> list2 = this.clause;
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (DisclaimerRunJson disclaimerRunJson : list2) {
            if (disclaimerRunJson.text.length() > 0) {
                arrayListA0h2.add(disclaimerRunJson);
            }
        }
        ArrayList arrayListA0m = AnonymousClass002.A0m(arrayListA0h2);
        Iterator it = arrayListA0h2.iterator();
        while (true) {
            String str = null;
            if (!it.hasNext()) {
                break;
            }
            DisclaimerRunJson disclaimerRunJson2 = (DisclaimerRunJson) it.next();
            String str2 = disclaimerRunJson2.text;
            String str3 = disclaimerRunJson2.token;
            if (str3 != null && linkedHashMapA15.containsKey(str3)) {
                str = str3;
            }
            arrayListA0m.add(new DisclaimerRun(str2, str));
        }
        if (arrayListA0m.isEmpty()) {
            return null;
        }
        AHD ahdA07 = AGI.A07(arrayListA0m);
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        Iterator itA0i = C3cG.A0i(linkedHashMapA15);
        while (itA0i.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0i);
            Object key = entryA0l.getKey();
            if (!(arrayListA0m instanceof Collection) || !arrayListA0m.isEmpty()) {
                Iterator it2 = arrayListA0m.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (C7384Etj.areEqual(((DisclaimerRun) it2.next()).token, key)) {
                        AnonymousClass006.A1R(linkedHashMapA0j, entryA0l);
                        break;
                    }
                }
            }
        }
        return new Disclaimer(ahdA07, AGI.A08(linkedHashMapA0j));
    }

    public DisclaimerJson(List<DisclaimerRunJson> list, List<DisclaimerLinkJson> list2) {
        AnonymousClass003.A0u(list, list2);
        this.clause = list;
        this.links = list2;
    }

    public final DisclaimerJson copy(List<DisclaimerRunJson> list, List<DisclaimerLinkJson> list2) {
        AnonymousClass003.A0u(list, list2);
        return new DisclaimerJson(list, list2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ DisclaimerJson(int i, List list, List list2, C2hx c2hx) {
        this.clause = (i & 1) == 0 ? C0881AGi.A00 : list;
        if ((i & 2) == 0) {
            this.links = C0881AGi.A00;
        } else {
            this.links = list2;
        }
    }

    public /* synthetic */ DisclaimerJson(List list, List list2, int i, C06H c06h) {
        this(C3cI.A10(list, i), C3cI.A11(list2, i));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DisclaimerJson() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this(c0881AGi, c0881AGi);
    }
}
