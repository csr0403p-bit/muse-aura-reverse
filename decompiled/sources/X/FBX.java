package X;

import java.util.Map;

/* loaded from: classes6.dex */
public final class FBX extends AbstractC7712FBk {
    public final HlX A00;
    public final C7711FBj A01;
    public final String A02;
    public final Map<String, Object> A03;
    public final Map<String, Object> A04;
    public final Map<String, Object> A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FBX) {
                FBX fbx = (FBX) obj;
                if (!this.A02.equals(fbx.A02) || !this.A03.equals(fbx.A03) || !this.A01.equals(fbx.A01) || this.A00 != fbx.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, AnonymousClass005.A0F(this.A01, AnonymousClass005.A0F(this.A03, AnonymousClass001.A0G(this.A02))));
    }

    public final String toString() {
        String str = this.A02;
        Map<String, Object> map = this.A03;
        C7711FBj c7711FBj = this.A01;
        HlX hlX = this.A00;
        StringBuilder sbA0x = C3cI.A0x("Single(_appId=", str);
        sbA0x.append(", params=");
        sbA0x.append(map);
        sbA0x.append(", _cacheTtl=");
        sbA0x.append(c7711FBj);
        return C3cJ.A0L(hlX, ", _queryPurpose=", sbA0x);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;+Ljava/lang/Object;>;LX/FBj;LX/HlX;)V */
    public FBX(HlX hlX, C7711FBj c7711FBj, String str, Map map) {
        super(hlX, c7711FBj, str);
        this.A02 = str;
        this.A03 = map;
        this.A01 = c7711FBj;
        this.A00 = hlX;
        this.A04 = map;
        this.A05 = map;
    }
}
