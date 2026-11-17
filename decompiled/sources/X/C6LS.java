package X;

import android.content.Context;
import androidx.datastore.preferences.core.Preferences;

/* renamed from: X.6LS, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6LS implements C31u<Context, C6JO<Preferences>> {
    public final Object A00 = C3cG.A0T();
    public final String A01;
    public final G0U A02;
    public final C3UX A03;
    public volatile C6JO<Preferences> A04;

    @Override // X.C31u
    public final /* bridge */ /* synthetic */ C6JO<Preferences> getValue(Context context, InterfaceC7359EnW interfaceC7359EnW) {
        Context context2 = context;
        C7384Etj.A0Y(context2, 0);
        C6JO<Preferences> c6jo = this.A04;
        if (c6jo == null) {
            synchronized (this.A00) {
                if (this.A04 == null) {
                    Context contextA0I = AnonymousClass001.A0I(context2);
                    this.A04 = C6PF.A00(C0881AGi.A00, new C6PC(contextA0I, this), this.A03);
                }
                c6jo = this.A04;
                C7384Etj.A0X(c6jo);
            }
        }
        return c6jo;
    }

    public C6LS(String str, G0U g0u, C3UX c3ux) {
        this.A01 = str;
        this.A02 = g0u;
        this.A03 = c3ux;
    }
}
