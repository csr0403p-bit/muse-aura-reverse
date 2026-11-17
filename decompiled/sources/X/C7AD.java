package X;

import java.util.Iterator;

/* renamed from: X.7AD, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7AD implements C3b6<ADq> {
    public final int A00;
    public final CharSequence A01;
    public final G0V<CharSequence, Integer, HxE<Integer, Integer>> A02;

    @Override // X.C3b6
    public final Iterator<ADq> iterator() {
        return new C7AC(this);
    }

    public C7AD(CharSequence charSequence, G0V g0v, int i) {
        this.A01 = charSequence;
        this.A00 = i;
        this.A02 = g0v;
    }
}
