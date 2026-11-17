package X;

import com.instagram.common.bloks.payload.BloksComponentQueryResources;
import com.instagram.common.bloks.payload.RawComponentPayload;
import java.util.Map;

/* loaded from: classes6.dex */
public final class FBY {
    public final C7631F7o A00;
    public final BloksComponentQueryResources A01;
    public final RawComponentPayload A02;
    public final String A03;
    public final Map<String, String> A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FBY) {
                FBY fby = (FBY) obj;
                if (!this.A00.equals(fby.A00) || !this.A03.equals(fby.A03) || !this.A04.equals(fby.A04) || !this.A02.equals(fby.A02) || !C7384Etj.areEqual(this.A01, fby.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0F(this.A02, AnonymousClass005.A0F(this.A04, AnonymousClass005.A0I(this.A03, AnonymousClass005.A0E(this.A00))) * 31) + C3cH.A02(this.A01);
    }

    public final String toString() {
        C7631F7o c7631F7o = this.A00;
        String str = this.A03;
        Map<String, String> map = this.A04;
        RawComponentPayload rawComponentPayload = this.A02;
        BloksComponentQueryResources bloksComponentQueryResources = this.A01;
        StringBuilder sbA0f = C3cG.A0f(c7631F7o, "BloksBatchedComponentQueryParseResult(componentParseResult=");
        sbA0f.append(", appId=");
        sbA0f.append(str);
        sbA0f.append(", consumedParams=");
        sbA0f.append(map);
        sbA0f.append(", serverParams=");
        sbA0f.append((Object) null);
        sbA0f.append(", rawComponentPayload=");
        sbA0f.append(rawComponentPayload);
        return C3cJ.A0L(bloksComponentQueryResources, ", resources=", sbA0f);
    }

    public FBY(C7631F7o c7631F7o, BloksComponentQueryResources bloksComponentQueryResources, RawComponentPayload rawComponentPayload, String str, Map map) {
        this.A00 = c7631F7o;
        this.A03 = str;
        this.A04 = map;
        this.A02 = rawComponentPayload;
        this.A01 = bloksComponentQueryResources;
    }
}
