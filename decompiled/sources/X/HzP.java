package X;

/* loaded from: classes6.dex */
public abstract class HzP extends AbstractC8884Fsp {
    public final C78T _context;
    public transient HtJ<Object> intercepted;

    public HzP(HtJ<Object> htJ) {
        this(htJ, htJ != null ? htJ.getContext() : null);
    }

    @Override // X.HtJ
    public C78T getContext() {
        C78T c78t = this._context;
        C7384Etj.A0X(c78t);
        return c78t;
    }

    public final HtJ<Object> intercepted() {
        HtJ<Object> gbj = this.intercepted;
        if (gbj == null) {
            InterfaceC10590Hxd interfaceC10590Hxd = (InterfaceC10590Hxd) getContext().get(InterfaceC10590Hxd.A00);
            gbj = interfaceC10590Hxd != null ? new GBJ<>(this, (GBK) interfaceC10590Hxd) : this;
            this.intercepted = gbj;
        }
        return gbj;
    }

    @Override // X.AbstractC8884Fsp
    public void releaseIntercepted() {
        HtJ<?> htJ = this.intercepted;
        if (htJ != null && htJ != this) {
            C78X c78x = getContext().get(InterfaceC10590Hxd.A00);
            C7384Etj.A0X(c78x);
            ((InterfaceC10590Hxd) c78x).releaseInterceptedContinuation(htJ);
        }
        this.intercepted = Hzb.A00;
    }

    public HzP(HtJ<Object> htJ, C78T c78t) {
        super(htJ);
        this._context = c78t;
    }
}
