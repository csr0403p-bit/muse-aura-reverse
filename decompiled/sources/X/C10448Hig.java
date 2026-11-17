package X;

import java.io.Serializable;
import java.lang.reflect.Field;

/* renamed from: X.Hig, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10448Hig implements Serializable {
    public static final long serialVersionUID = 2;
    public final String lowerBoundType;
    public final String lowerEndpoint;
    public final String upperBoundType;
    public final String upperEndpoint;

    public C10448Hig() {
        this("lowerEndpoint", "upperEndpoint", "lowerBoundType", "upperBoundType");
    }

    public static Field A00(C10448Hig c10448Hig, String str) {
        try {
            return c10448Hig.getClass().getField(str);
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public C10448Hig(String str, String str2, String str3, String str4) {
        this.lowerEndpoint = str;
        this.upperEndpoint = str2;
        this.lowerBoundType = str3;
        this.upperBoundType = str4;
    }
}
