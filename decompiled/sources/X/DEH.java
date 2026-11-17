package X;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class DEH extends BYP {
    public final long creationTime;
    public final long eventId;
    public final boolean isLocallyCached;
    public final String loapStreamId;
    public final int loapStreamType;
    public final Map<String, Object> metadata;
    public final String parentSource;
    public final String severity;
    public final String source;
    public final long traceId;
    public final String videoId;

    /* JADX WARN: Incorrect types in method signature: (LX/DER;LX/DEG;Ljava/lang/String;Ljava/lang/String;IJLjava/lang/String;IJZLjava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public DEH(DEG deg, DER der, String str, String str2, String str3, Map map, int i, int i2, long j, long j2, boolean z) {
        Map map2;
        super(der);
        this.videoId = deg.A05;
        this.traceId = deg.A07[i].A01;
        this.source = str;
        this.parentSource = str2;
        this.severity = deg.A03;
        this.eventId = j;
        this.loapStreamId = str3;
        this.loapStreamType = i2;
        this.creationTime = j2;
        if (map == null) {
            map2 = deg.A06;
        } else {
            HashMap mapA0u = BV4.A0u();
            Map<String, Object> map3 = deg.A06;
            if (map3 != null) {
                mapA0u.putAll(map3);
            }
            mapA0u.putAll(map);
            map2 = mapA0u;
        }
        this.metadata = map2;
        this.isLocallyCached = z;
    }
}
