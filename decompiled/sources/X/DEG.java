package X;

import android.util.LruCache;
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import java.util.AbstractMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes5.dex */
public final class DEG {
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final Map<String, Object> A06;
    public final DED[] A07;
    public static final String A0A = FGI.A0U("ABCDEFGHIJKLMNOPQRSTUVWXYZ", "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toLowerCase(Locale.ROOT), "0123456789");
    public static final CLe A09 = new CLe();
    public static final AbstractMap.SimpleEntry<String, String>[] A0B = {new AbstractMap.SimpleEntry("x-fb-fna-hit", "fna"), new AbstractMap.SimpleEntry("x-fb-edge-hit", BrowserOperationCatalogKt.EDGE), new AbstractMap.SimpleEntry("x-fb-origin-hit", "origin")};
    public static final LruCache<String, String> A08 = new LruCache<>(50);

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Ljava/lang/String;[LX/DED;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)V */
    public DEG(String str, String str2, String str3, String str4, String str5, Map map, DED[] dedArr, long j) {
        this.A04 = str;
        this.A05 = str2;
        this.A07 = dedArr;
        this.A02 = str3;
        this.A03 = str5;
        this.A01 = str4;
        this.A00 = j;
        this.A06 = map;
    }
}
