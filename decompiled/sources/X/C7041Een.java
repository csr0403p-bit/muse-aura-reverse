package X;

import android.net.Uri;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: X.Een, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7041Een implements InterfaceC7015EeM<EfF<InterfaceC7064EfB>> {
    public final InterfaceC7005EeA<Boolean> A00;
    public final C7069EfP A01;
    public final BXh A02;
    public final InterfaceC7068EfO A03;
    public final Eh5 A04;
    public final Executor A05;
    public final boolean A06;
    public final C6524EBy A07;
    public final InterfaceC7015EeM<C6988Edo> A08;

    @Override // X.InterfaceC7015EeM
    public final void AYc(InterfaceC7028EeZ<EfF<InterfaceC7064EfB>> interfaceC7028EeZ, InterfaceC7029Eea interfaceC7029Eea) {
        InterfaceC7028EeZ<C6988Edo> c7038Eek;
        AnonymousClass003.A0u(interfaceC7028EeZ, interfaceC7029Eea);
        C7267Ejs.A00();
        Uri uri = ((C7185Ehv) interfaceC7029Eea).A07.A04;
        if (AbstractC7465Eww.A01(uri)) {
            c7038Eek = new C7038Eek(new C7040Eem(this.A07), this.A04, interfaceC7028EeZ, this, interfaceC7029Eea);
            break;
        }
        Set<String> set = C7184Ehu.A0M;
        if (uri != null) {
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                if (AnonymousClass005.A0j(it).equals(uri.getScheme())) {
                    c7038Eek = new C7038Eek(new C7040Eem(this.A07), this.A04, interfaceC7028EeZ, this, interfaceC7029Eea);
                    break;
                }
            }
        }
        c7038Eek = new C7039Eel(interfaceC7028EeZ, this, interfaceC7029Eea);
        this.A08.AYc(c7038Eek, interfaceC7029Eea);
    }

    public C7041Een(InterfaceC7005EeA interfaceC7005EeA, C7069EfP c7069EfP, BXh bXh, InterfaceC7068EfO interfaceC7068EfO, Eh5 eh5, C6524EBy c6524EBy, InterfaceC7015EeM interfaceC7015EeM, Executor executor, boolean z) {
        this.A07 = c6524EBy;
        this.A05 = executor;
        this.A03 = interfaceC7068EfO;
        this.A04 = eh5;
        this.A02 = bXh;
        this.A06 = z;
        this.A08 = interfaceC7015EeM;
        this.A01 = c7069EfP;
        this.A00 = interfaceC7005EeA;
    }
}
