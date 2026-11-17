package X;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: Add missing generic type declarations: [P] */
/* renamed from: X.ElB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7333ElB<P> implements Iterable<P> {
    public final /* synthetic */ C7334ElC A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ List A02;

    public C7333ElB(final C7334ElC this$0, final List val$fiveByteEntriesOrNull, final List val$zeroByteEntriesOrNull) {
        this.A00 = this$0;
        this.A01 = val$fiveByteEntriesOrNull;
        this.A02 = val$zeroByteEntriesOrNull;
    }

    @Override // java.lang.Iterable
    public final Iterator<P> iterator() {
        return new C7332ElA(this.A01.iterator(), this.A02.iterator());
    }
}
