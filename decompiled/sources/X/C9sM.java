package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* renamed from: X.9sM, reason: invalid class name */
/* loaded from: classes4.dex */
public class C9sM extends C9sN {
    public final Map<String, JsonElement> A00;

    @Override // X.C9sN
    public void A07(String str, JsonElement jsonElement) {
        C7384Etj.A0Y(str, 0);
        C7384Etj.A0Y(jsonElement, 1);
        this.A00.put(str, jsonElement);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/9iZ;ILX/9hv<-TT;>;TT;)V */
    @Override // X.C9sL, X.C9j5
    public final void AAP(Object obj, C9hv c9hv, C9iZ c9iZ, int i) {
        C7384Etj.A0Y(c9iZ, 0);
        C7384Etj.A0Y(c9hv, 2);
        if (obj != null || this.A04.A0A) {
            super.AAP(obj, c9hv, c9iZ, i);
        }
    }

    @Override // X.C9sN
    public final JsonElement A06() {
        return new JsonObject(this.A00);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/9sU;LX/G0U<-Lkotlinx/serialization/json/JsonElement;Lkotlin/Unit;>;)V */
    public C9sM(G0U g0u, C9sU c9sU) {
        super(g0u, c9sU);
        this.A00 = new LinkedHashMap();
    }
}
