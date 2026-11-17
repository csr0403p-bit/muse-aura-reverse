package X;

import java.util.AbstractList;
import java.util.ArrayList;

/* renamed from: X.Gty, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10294Gty extends ArrayList<Gt4> {
    public boolean validChildren;

    public final int A00() {
        return ((AbstractList) this).modCount;
    }

    public final void A01() {
        ((AbstractList) this).modCount++;
    }
}
