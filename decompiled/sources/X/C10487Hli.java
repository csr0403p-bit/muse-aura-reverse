package X;

import java.util.Map;

/* renamed from: X.Hli, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10487Hli implements FAL {
    public Map<String, ? extends Object> A00;

    @Override // X.FAI
    public final boolean A76(String str) {
        C7384Etj.A0Y(str, 0);
        return this.A00.containsKey(str);
    }

    @Override // X.FAI
    public final Object AMX(String str) {
        C7384Etj.A0Y(str, 0);
        return this.A00.get(str);
    }

    @Override // X.FAI
    public final Map<String, Object> ACM() {
        return this.A00;
    }

    @Override // X.FAL
    public final void Agi(Map<String, ? extends Object> map) {
        this.A00 = AbstractC7609F5w.A0z(this.A00, map);
    }
}
