package X;

import java.util.Map;

/* loaded from: classes6.dex */
public final class FAG implements F6v {
    public final Map<String, Object> A00;

    @Override // X.F6v
    public final Object ABz(String str) {
        C7384Etj.A0Y(str, 0);
        return this.A00.get(str);
    }

    @Override // X.F6v
    public final boolean AN6(String str) {
        C7384Etj.A0Y(str, 0);
        return this.A00.containsKey(str);
    }

    public FAG(Map<String, ? extends Object> map) {
        this.A00 = map;
    }
}
