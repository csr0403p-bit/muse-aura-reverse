package X;

/* renamed from: X.609, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass609 extends HzP {
    public final int $t;
    public int A00;
    public Object A01;
    public Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass609(Object obj, HtJ htJ, int i) {
        super(htJ);
        this.$t = i;
        this.A03 = obj;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        int i = this.$t;
        this.A02 = obj;
        this.A00 |= Integer.MIN_VALUE;
        Object obj2 = this.A03;
        switch (i) {
            case 1:
                return ((AbstractC05583ub) obj2).A00(null, this);
            case 2:
                return ((C4o6) obj2).emit(null, this);
            case 3:
            default:
                return ((AnonymousClass601) obj2).emit(null, this);
            case 4:
                return ((C4vr) obj2).emit(null, this);
        }
    }
}
