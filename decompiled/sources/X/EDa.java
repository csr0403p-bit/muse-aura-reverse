package X;

import android.content.Context;

/* loaded from: classes5.dex */
public class EDa extends EDU implements InterfaceC6539EDu {
    public C6529EDb _legacyCask;

    public EDa(Context context) {
        C7384Etj.A0Y(context, 0);
        init(context);
    }

    public void init(Context context) {
        C7384Etj.A0Y(context, 0);
        init(context, new C6541EDw());
    }

    public C6529EDb getLegacyCask() {
        C6529EDb c6529EDb = this._legacyCask;
        if (c6529EDb != null) {
            return c6529EDb;
        }
        C7384Etj.A0b("_legacyCask");
        throw F60.createAndThrow();
    }

    @Override // X.InterfaceC6539EDu
    public InterfaceC6536EDr<EE9> controllerForPlugin(EE9 ee9) {
        return null;
    }

    public final String getFeatureName(int i) {
        return AbstractC6540EDv.A01(i);
    }

    @Override // X.InterfaceC6539EDu
    public void onUnhandledPlugin(EDW edw, EE9 ee9) {
    }

    public EDa() {
    }

    public final void init(Context context, InterfaceC6544EDz interfaceC6544EDz) {
        AnonymousClass003.A0u(context, interfaceC6544EDz);
        init(context, this, interfaceC6544EDz);
        C6529EDb c6529EDb = new C6529EDb();
        c6529EDb.A01 = this;
        c6529EDb.A00 = new C3419CMh(context);
        c6529EDb.A02 = C7454EwX.A00;
        this._legacyCask = c6529EDb;
    }
}
