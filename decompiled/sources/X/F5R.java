package X;

import java.lang.reflect.Method;

/* loaded from: classes5.dex */
public final class F5R implements DWj {
    public final int $t;
    public final Object A00;
    public final Object A01;

    public F5R(Object obj, Method method, int i) {
        this.$t = i;
        if (i != 0) {
            this.A01 = method;
            this.A00 = obj;
        } else {
            this.A00 = method;
            this.A01 = obj;
        }
    }
}
