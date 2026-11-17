package X;

import java.util.Map;

/* loaded from: classes5.dex */
public final class DEJ extends DEH {
    public static final long serialVersionUID = 3619168717515612218L;
    public final String hitCache;
    public final int latencyMs;

    /* JADX WARN: Incorrect types in method signature: (LX/DEG;IJILjava/lang/String;ILjava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)V */
    public DEJ(DEG deg, String str, String str2, Map map, int i, int i2, int i3, long j) {
        super(deg, DER.A0J, DEG.A09.A02, deg.A02, str, map, i, i3, j, deg.A00, false);
        this.latencyMs = i2;
        this.hitCache = str2;
    }
}
