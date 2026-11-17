package X;

import kotlin.Unit;

/* renamed from: X.8ip, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C07368ip extends AbstractC7559F3s implements G0U {
    public final int $t;
    public final Object A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C07368ip(int i, InterfaceC10560Hsz<G0U<HtJ<? super T>, Object>> interfaceC10560Hsz, G0U<? super InterfaceC10512HoG, ? extends T> g0u) {
        super(1);
        this.$t = i;
        this.A00 = g0u;
        this.A01 = interfaceC10560Hsz;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i = this.$t;
        C7384Etj.A0Y(obj, 0);
        C78T c78t = (InterfaceC10560Hsz) this.A00;
        Object obj2 = this.A01;
        ((GBM) c78t).A0R(i != 0 ? new C07238ic(obj2, obj, null, 2) : new C07238ic(obj, obj2, null, 1));
        return Unit.INSTANCE;
    }
}
