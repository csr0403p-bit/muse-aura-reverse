package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.FBr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7716FBr extends Hr8 {
    public final Map<String, String> A00;
    public final Map<String, Long> A01;

    public static HxE A00(Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap.put(FGI.A0U("component_query_parser", "_", "parse_start"), 0L);
        linkedHashMap.put(FGI.A0U("component_query_parser", "_", "parse_end"), 0L);
        return new HxE(obj, new C7716FBr(AGH.A0A(linkedHashMap), AGH.A0A(linkedHashMap2)));
    }

    public C7716FBr(Map<String, Long> map, Map<String, String> map2) {
        super(map, map2);
        this.A01 = map;
        this.A00 = map2;
    }
}
