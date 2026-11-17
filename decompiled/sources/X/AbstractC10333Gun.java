package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Gun, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10333Gun {
    public static final Map<String, HBD> A00;

    static {
        HashMap mapA0v = BV4.A0v(9);
        A00 = mapA0v;
        Integer num = C79.A0W;
        mapA0v.put("xx-small", new HBD(num, 0.694f));
        mapA0v.put("x-small", new HBD(num, 0.833f));
        mapA0v.put("small", new HBD(num, 10.0f));
        mapA0v.put("medium", new HBD(num, 12.0f));
        mapA0v.put("large", new HBD(num, 14.4f));
        mapA0v.put("x-large", new HBD(num, 17.3f));
        mapA0v.put("xx-large", new HBD(num, 20.7f));
        Integer num2 = C79.A0Z;
        mapA0v.put("smaller", new HBD(num2, 83.33f));
        mapA0v.put("larger", new HBD(num2, 120.0f));
    }
}
