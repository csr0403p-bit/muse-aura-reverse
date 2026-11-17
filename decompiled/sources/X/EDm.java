package X;

import java.util.HashMap;
import java.util.List;

/* loaded from: classes5.dex */
public final class EDm extends EDa {
    public final C6542EDx A00;
    public final C6535EDq A01;

    /* JADX INFO: Incorrect field signature: TT; */
    public final EDC A02;

    @Override // X.EDa, X.InterfaceC6539EDu
    public final InterfaceC6536EDr<EE9> controllerForPlugin(EE9 ee9) {
        F0C f0c;
        C7384Etj.A0Y(ee9, 0);
        String identifier = ee9.getIdentifier();
        switch (identifier.hashCode()) {
            case 101264299:
                if (!identifier.equals("eviction.v2")) {
                    return null;
                }
                f0c = this.A01.A00;
                break;
            case 351608024:
                if (!identifier.equals("version")) {
                    return null;
                }
                f0c = this.A01.A03;
                break;
            case 408072700:
                if (!identifier.equals("max_size")) {
                    return null;
                }
                f0c = this.A01.A01;
                break;
            case 1738660166:
                if (!identifier.equals("stale_removal")) {
                    return null;
                }
                f0c = this.A01.A02;
                break;
            default:
                return null;
        }
        InterfaceC6536EDr<EE9> interfaceC6536EDr = (InterfaceC6536EDr) f0c.getValue();
        C7384Etj.A0Z(interfaceC6536EDr, "null cannot be cast to non-null type com.facebook.storage.cask.core.ICaskPluginController<com.facebook.storage.config.cask.CaskPluginData>");
        return interfaceC6536EDr;
    }

    public /* synthetic */ EDm(EDC edc) {
        C6542EDx c6542EDx;
        C6535EDq c6535EDq = new C6535EDq(edc);
        super(((ED9) edc).A03);
        this.A02 = edc;
        this.A01 = c6535EDq;
        synchronized (C6542EDx.A02) {
            c6542EDx = C6542EDx.A01;
            if (c6542EDx == null) {
                c6542EDx = new C6542EDx();
                C6542EDx.A01 = c6542EDx;
            }
        }
        this.A00 = c6542EDx;
        EE0 ee0 = new EE0(this);
        HashMap map = c6542EDx.A00;
        List listA0v = BV6.A0v(0, map);
        listA0v = listA0v == null ? C3cG.A0h() : listA0v;
        listA0v.add(ee0);
        map.put(0, listA0v);
    }
}
