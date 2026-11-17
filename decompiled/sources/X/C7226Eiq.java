package X;

import android.content.res.Resources;
import java.util.Map;

/* renamed from: X.Eiq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7226Eiq implements InterfaceC7060Ef7 {
    public final Resources A00;
    public final CCV A01;
    public final C7482Exf A02;
    public final C7197Ei9 A03;
    public final Ejq A04;
    public final C7183Eht A05;
    public final Map<String, Object> A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && BV5.A1T(this, obj)) {
                C7226Eiq c7226Eiq = (C7226Eiq) obj;
                if (this.A00 != c7226Eiq.A00 || !AbstractC7213Eib.A00(this.A04, c7226Eiq.A04) || !AbstractC7213Eib.A00(this.A03, c7226Eiq.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC7060Ef7
    public final void putExtras(Map map) {
        throw F60.createAndThrow();
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A03, AnonymousClass005.A0F(this.A04, AnonymousClass005.A0E(this.A00)));
    }

    public C7226Eiq(Resources resources, CCV ccv, C7482Exf c7482Exf, C7197Ei9 c7197Ei9, Ejq ejq, C7183Eht c7183Eht, Map map) {
        this.A00 = resources;
        this.A04 = ejq;
        this.A03 = c7197Ei9;
        this.A05 = c7183Eht;
        this.A01 = ccv;
        this.A06 = map;
        this.A02 = c7482Exf;
    }

    @Override // X.InterfaceC7060Ef7
    public final Object getExtra(String str) {
        throw F60.createAndThrow();
    }

    @Override // X.InterfaceC7060Ef7
    public final Map getExtras() {
        throw F60.createAndThrow();
    }

    @Override // X.InterfaceC7060Ef7
    public final void putExtra(String str, Object obj) {
        throw F60.createAndThrow();
    }
}
