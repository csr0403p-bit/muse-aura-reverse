package X;

import java.util.LinkedHashMap;

/* renamed from: X.DJq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4975DJq implements DJL {
    public final InterfaceC4978DJv<DK0> A00;

    @Override // X.DJL
    public final int ABS(int i, String str) {
        LinkedHashMap<String, Integer> linkedHashMap;
        Integer num;
        DK0 dk0 = this.A00.get(i);
        if (dk0 == null || (linkedHashMap = dk0.A00) == null || (num = linkedHashMap.get(str)) == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // X.DJL
    public final int ABT(int i, String str) {
        LinkedHashMap<String, Integer> linkedHashMap;
        Integer num;
        DK0 dk0 = this.A00.get(i);
        if (dk0 == null || (linkedHashMap = dk0.A01) == null || (num = linkedHashMap.get(str)) == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // X.DJL
    public final boolean AOj(int i) {
        return this.A00.get(i) != null;
    }

    public C4975DJq(InterfaceC4978DJv<DK0> interfaceC4978DJv) {
        this.A00 = interfaceC4978DJv;
    }
}
