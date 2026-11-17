package X;

import com.google.common.base.Supplier;

/* renamed from: X.Cqy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4237Cqy implements Supplier {
    public final int $t;
    public final long A00;

    public C4237Cqy(long j, int i) {
        this.$t = i;
        if (i != 0) {
            this.A00 = j;
        } else {
            this.A00 = j;
        }
    }

    @Override // com.google.common.base.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return Long.valueOf(this.A00);
    }
}
