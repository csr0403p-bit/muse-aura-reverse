package X;

import java.util.Map;

/* renamed from: X.GeN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9709GeN extends AbstractC7559F3s implements G0U {
    public final /* synthetic */ String $apiName;
    public final /* synthetic */ String $externalProductId;
    public final /* synthetic */ Map<String, String> $extraData;
    public final /* synthetic */ String $productType;
    public final /* synthetic */ Long $startTime;
    public final /* synthetic */ C9699Ge6 $this_executeDcpIapApiSuccessImpl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/Ge6;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V */
    public C9709GeN(C9699Ge6 c9699Ge6, Long l, String str, String str2, String str3, Map map) {
        super(1);
        this.$this_executeDcpIapApiSuccessImpl = c9699Ge6;
        this.$productType = str;
        this.$apiName = str2;
        this.$externalProductId = str3;
        this.$startTime = l;
        this.$extraData = map;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        EVS evs = (EVS) obj;
        AbstractC7607F5u.A1L(evs, this.$this_executeDcpIapApiSuccessImpl.A0B);
        HVr.A01(evs, this.$productType);
        C9699Ge6 c9699Ge6 = this.$this_executeDcpIapApiSuccessImpl;
        String str = this.$apiName;
        String str2 = this.$externalProductId;
        Long l = this.$startTime;
        String str3 = this.$productType;
        if (str3.length() == 0) {
            str3 = null;
        }
        evs.A01(c9699Ge6.A0F(l, str, str2, str3), "event_payload");
        Map map = this.$extraData;
        if (map == null) {
            map = C9jH.A00;
        }
        C9699Ge6.A0B(evs, this.$this_executeDcpIapApiSuccessImpl, map);
        return evs;
    }
}
