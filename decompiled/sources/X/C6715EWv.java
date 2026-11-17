package X;

import kotlin.Unit;

/* renamed from: X.EWv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6715EWv extends AbstractC7559F3s implements G0U {
    public final int $t;
    public final long A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6715EWv(long j, int i) {
        super(1);
        this.$t = i;
        this.A00 = j;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.$t != 0) {
            return Boolean.valueOf(C8j3.A1R((C3cG.A05(obj) > this.A00 ? 1 : (C3cG.A05(obj) == this.A00 ? 0 : -1))));
        }
        C5700Dnh c5700Dnh = (C5700Dnh) obj;
        C7384Etj.A0Y(c5700Dnh, 0);
        c5700Dnh.A01(this.A00);
        return Unit.INSTANCE;
    }
}
