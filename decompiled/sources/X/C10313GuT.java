package X;

import com.facebook.aura.activation.view.InviteCodeScratcherKt;

/* renamed from: X.GuT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10313GuT extends GuS {
    @Override // X.GuS
    public final String toString() {
        StringBuilder sbA0x;
        String strA01;
        String str = this.A09 ? "/>" : ">";
        Gt7 gt7 = this.A06;
        if (!AnonymousClass002.A1X(gt7) || gt7.A05() <= 0) {
            sbA0x = C60O.A0x("<");
            strA01 = GuS.A01(this);
        } else {
            sbA0x = C60O.A0x("<");
            sbA0x.append(GuS.A01(this));
            sbA0x.append(InviteCodeScratcherKt.CODE_SEPARATOR);
            strA01 = this.A06.toString();
        }
        return C60P.A1M(strA01, str, sbA0x);
    }

    @Override // X.GuS
    /* renamed from: A05 */
    public final void A03() {
        super.A03();
        this.A06 = null;
    }
}
