package X;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class HHM {
    public static final Map<String, HHN> A00;

    static {
        HashMap mapA0v = BV4.A0v(10);
        A00 = mapA0v;
        mapA0v.put("none", HHN.none);
        mapA0v.put("xMinYMin", HHN.xMinYMin);
        mapA0v.put("xMidYMin", HHN.xMidYMin);
        mapA0v.put("xMaxYMin", HHN.xMaxYMin);
        mapA0v.put("xMinYMid", HHN.xMinYMid);
        mapA0v.put("xMidYMid", HHN.xMidYMid);
        mapA0v.put("xMaxYMid", HHN.xMaxYMid);
        mapA0v.put("xMinYMax", HHN.xMinYMax);
        mapA0v.put("xMidYMax", HHN.xMidYMax);
        mapA0v.put("xMaxYMax", HHN.xMaxYMax);
    }
}
