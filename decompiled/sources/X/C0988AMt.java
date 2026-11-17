package X;

import java.util.Iterator;

/* renamed from: X.AMt, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0988AMt extends AbstractC0985AMq implements Iterator, BOA {
    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        A00();
        if (this.A01 != null) {
            return new C0986AMr(this);
        }
        throw new IllegalStateException();
    }
}
