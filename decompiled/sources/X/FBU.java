package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public final class FBU extends AbstractC7712FBk {
    public final HlX A00;
    public final C7711FBj A01;
    public final String A02;
    public final Map<String, Object> A03;
    public final Map<String, Object> A04;
    public final Map<String, Object> A05;
    public final Set<String> A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;+Ljava/lang/Object;>;Ljava/util/Set<Ljava/lang/String;>;LX/FBj;LX/HlX;)V */
    public FBU(HlX hlX, C7711FBj c7711FBj, String str, Map map, Set set) {
        super(hlX, c7711FBj, str);
        C7384Etj.A0Y(set, 2);
        this.A02 = str;
        this.A03 = map;
        this.A06 = set;
        this.A01 = c7711FBj;
        this.A00 = hlX;
        this.A05 = map;
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            if (this.A06.contains(entryA0l.getKey())) {
                AnonymousClass006.A1R(linkedHashMapA0j, entryA0l);
            }
        }
        this.A04 = linkedHashMapA0j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FBU) {
                FBU fbu = (FBU) obj;
                if (!this.A02.equals(fbu.A02) || !this.A03.equals(fbu.A03) || !this.A06.equals(fbu.A06) || !this.A01.equals(fbu.A01) || this.A00 != fbu.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, AnonymousClass005.A0F(this.A01, AnonymousClass005.A0F(this.A06, AnonymousClass005.A0F(this.A03, AnonymousClass001.A0G(this.A02)))));
    }

    public final String toString() {
        String str = this.A02;
        Map<String, Object> map = this.A03;
        Set<String> set = this.A06;
        C7711FBj c7711FBj = this.A01;
        HlX hlX = this.A00;
        StringBuilder sbA0x = C3cI.A0x("Batched(_appId=", str);
        sbA0x.append(", params=");
        sbA0x.append(map);
        sbA0x.append(", _rootParams=");
        sbA0x.append(set);
        sbA0x.append(", _cacheTtl=");
        sbA0x.append(c7711FBj);
        return C3cJ.A0L(hlX, ", _queryPurpose=", sbA0x);
    }
}
