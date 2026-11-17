package X;

import kotlin.Unit;

/* loaded from: classes6.dex */
public final class FYI extends AbstractC7559F3s implements G0U {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FYI(Object obj, Object obj2, String str, int i) {
        super(1);
        this.$t = i;
        this.A02 = str;
        this.A00 = obj;
        this.A01 = obj2;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C7708FBg c7708FBg;
        if (this.$t == 0) {
            EVS evs = (EVS) obj;
            AbstractC7607F5u.A1L(evs, this.A02);
            evs.A00(HVq.A02, "product_type");
            AbstractC7607F5u.A1K(evs, this.A00);
            evs.A04(((C9699Ge6) this.A01).A0J(null).A01);
            return evs;
        }
        HoL hoL = (HoL) obj;
        C7384Etj.A0Y(hoL, 0);
        FB4 fb4 = (FB4) this.A00;
        C7659F9c c7659F9c = (C7659F9c) this.A01;
        FBN fbn = c7659F9c.A01;
        synchronized (fbn.A07) {
            c7708FBg = fbn.A00;
        }
        fb4.AAj(new C7687FAg(c7708FBg), C7659F9c.A00(hoL, c7659F9c, hoL.A00() ? C79.A01 : C79.A0K), "acq", this.A02);
        return Unit.INSTANCE;
    }
}
