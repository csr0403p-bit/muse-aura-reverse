package X;

import kotlinx.serialization.json.JsonLiteral;

/* renamed from: X.9sn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C08049sn extends C9jJ {
    public final C07959pz A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ C9sN A02;

    public static final void A03(String str, C08049sn c08049sn) {
        C7384Etj.A0Y(str, 0);
        c08049sn.A02.A07(c08049sn.A01, new JsonLiteral(str, null, false));
    }

    public C08049sn(String str, C9sN c9sN) {
        this.A02 = c9sN;
        this.A01 = str;
        this.A00 = c9sN.A03.A02;
    }

    @Override // X.InterfaceC07789is
    public final C07959pz AKT() {
        return this.A00;
    }
}
