package X;

import java.io.Serializable;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.Gp3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10082Gp3 extends AbstractC9845Gin implements Serializable {
    public static final C10082Gp3 A01 = new C10082Gp3(Collections.EMPTY_MAP);
    public static final Object A02 = C3cG.A0T();
    public static final long serialVersionUID = 1;
    public transient Map<Object, Object> A00;
    public final Map<?, ?> _shared;

    public C10082Gp3(Map<?, ?> map) {
        this._shared = map;
        this.A00 = null;
    }

    public C10082Gp3(Map<?, ?> map, Map<Object, Object> map2) {
        this._shared = map;
        this.A00 = map2;
    }
}
