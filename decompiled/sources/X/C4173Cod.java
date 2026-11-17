package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Cod, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4173Cod {
    public Integer A00;
    public final C4279Cs9 A01;
    public final String A02;
    public final Map A03;
    public final Set A04;
    public final Set A05;

    public C4173Cod(C4279Cs9 c4279Cs9, String str, Set set) {
        Set setUnmodifiableSet = Collections.unmodifiableSet(set);
        this.A04 = setUnmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.A03 = map;
        this.A02 = str;
        this.A01 = c4279Cs9;
        HashSet hashSetA0x = BV4.A0x(setUnmodifiableSet);
        Iterator itA10 = BV5.A10(map);
        if (itA10.hasNext()) {
            itA10.next();
            throw BV4.A0a("zaa");
        }
        this.A05 = Collections.unmodifiableSet(hashSetA0x);
    }
}
