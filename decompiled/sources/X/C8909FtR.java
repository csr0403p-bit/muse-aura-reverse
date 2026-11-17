package X;

import com.facebook.payments.dcp.xapp.controller.productinfo.DcpProductDetailsLoader;

/* renamed from: X.FtR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8909FtR extends HzP {
    public final int $t = 1;
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public boolean A06;

    public C8909FtR(HtJ<? super C8909FtR> htJ) {
        super(htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.$t != 0) {
            this.A05 = obj;
            this.A00 |= Integer.MIN_VALUE;
            return Hu1.A00(this, null, null, false);
        }
        this.A04 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return ((DcpProductDetailsLoader) this.A05).A03(null, null, null, this, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8909FtR(DcpProductDetailsLoader dcpProductDetailsLoader, HtJ<? super C8909FtR> htJ) {
        super(htJ);
        this.A05 = dcpProductDetailsLoader;
    }
}
