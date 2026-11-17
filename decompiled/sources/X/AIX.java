package X;

import java.util.Set;

/* loaded from: classes4.dex */
public abstract class AIX {
    public static final <E> Set<E> A00(Set<E> set) {
        AIY aiy = (AIY) set;
        C0924AIa<E, ?> c0924AIa = aiy.backing;
        c0924AIa.A06();
        c0924AIa.isReadOnly = true;
        return aiy.size() <= 0 ? AIY.A00 : aiy;
    }
}
