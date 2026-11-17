package X;

import java.util.Map;

/* renamed from: X.GeP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9711GeP extends AbstractC7559F3s implements G0U {
    public final /* synthetic */ String $apiName;
    public final /* synthetic */ String $externalProductId;
    public final /* synthetic */ Map<String, String> $extraData;
    public final /* synthetic */ String $productType;
    public final /* synthetic */ C9699Ge6 $this_executeDcpIapApiInitImpl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9711GeP(C9699Ge6 c9699Ge6, String str, String str2, String str3, Map<String, String> map) {
        super(1);
        this.$this_executeDcpIapApiInitImpl = c9699Ge6;
        this.$productType = str;
        this.$apiName = str2;
        this.$externalProductId = str3;
        this.$extraData = map;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        EVS evs = (EVS) obj;
        AbstractC7607F5u.A1L(evs, this.$this_executeDcpIapApiInitImpl.A0B);
        HVr.A01(evs, this.$productType);
        C9699Ge6 c9699Ge6 = this.$this_executeDcpIapApiInitImpl;
        String str = this.$apiName;
        String str2 = this.$externalProductId;
        String str3 = this.$productType;
        if (str3.length() == 0) {
            str3 = null;
        }
        evs.A01(c9699Ge6.A0F(null, str, str2, str3), "event_payload");
        Map map = this.$extraData;
        if (map == null) {
            map = C9jH.A00;
        }
        C9699Ge6.A0B(evs, this.$this_executeDcpIapApiInitImpl, map);
        return evs;
    }
}
