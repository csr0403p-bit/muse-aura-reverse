package X;

import java.util.Map;

/* loaded from: classes5.dex */
public final class DEI extends DEH {
    public static final long serialVersionUID = -6619396001644225326L;
    public final String hitCache;
    public final int latencyMs;

    /* JADX WARN: Incorrect types in method signature: (LX/DEG;IJILjava/lang/String;ILjava/lang/String;ZLjava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)V */
    public DEI(DEG deg, String str, String str2, Map map, int i, int i2, int i3, long j, boolean z) {
        super(deg, DER.A09, DEG.A09.A02, deg.A02, str, map, i, i3, j, deg.A00, z);
        this.latencyMs = i2;
        this.hitCache = str2;
    }
}
