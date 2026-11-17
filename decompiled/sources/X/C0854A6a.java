package X;

import androidx.savedstate.SavedStateRegistry;
import java.util.Map;

/* renamed from: X.A6a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0854A6a {
    public final InterfaceC08439ui A00;
    public final BJt A01;
    public final A6J A02;
    public final C0860A6h A03 = new C0860A6h();

    /* JADX WARN: Incorrect types in method signature: <T:LX/AEs;>(LX/9uG<TT;>;Ljava/lang/String;)TT; */
    public final AEs A00(String str, C9uG c9uG) {
        AEs aEsCreate;
        C7384Etj.A0Y(str, 1);
        synchronized (this.A03) {
            Map<String, AEs> map = this.A01.A00;
            aEsCreate = map.get(str);
            if (c9uG.AOZ(aEsCreate)) {
                Object obj = this.A00;
                if (obj instanceof AbstractC0859A6g) {
                    C7384Etj.A0X(aEsCreate);
                    A6X a6x = (A6X) ((AbstractC0859A6g) obj);
                    F2N f2n = a6x.A00;
                    if (f2n != null) {
                        SavedStateRegistry savedStateRegistry = a6x.A01;
                        C7384Etj.A0X(savedStateRegistry);
                        A6L a6l = (A6L) aEsCreate.getCloseable("androidx.lifecycle.savedstate.vm.tag");
                        if (a6l != null && !a6l.A00) {
                            a6l.A00(f2n, savedStateRegistry);
                            A6W.A00(f2n, savedStateRegistry);
                        }
                    }
                }
                C7384Etj.A0Z(aEsCreate, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.internal.ViewModelProviderImpl.getViewModel");
            } else {
                C0856A6d c0856A6d = new C0856A6d(this.A02);
                c0856A6d.A01(BON.A01, str);
                InterfaceC08439ui interfaceC08439ui = this.A00;
                try {
                    try {
                        aEsCreate = interfaceC08439ui.create((C9uG<AEs>) c9uG, c0856A6d);
                    } catch (AbstractMethodError unused) {
                        aEsCreate = interfaceC08439ui.create(C9uT.A01(c9uG), c0856A6d);
                    }
                } catch (AbstractMethodError unused2) {
                    aEsCreate = interfaceC08439ui.create(C9uT.A01(c9uG));
                }
                C7384Etj.A0Y(aEsCreate, 1);
                AEs aEsPut = map.put(str, aEsCreate);
                if (aEsPut != null) {
                    aEsPut.clear$lifecycle_viewmodel();
                }
            }
        }
        return aEsCreate;
    }

    public C0854A6a(InterfaceC08439ui interfaceC08439ui, BJt bJt, A6J a6j) {
        this.A01 = bJt;
        this.A00 = interfaceC08439ui;
        this.A02 = a6j;
    }
}
