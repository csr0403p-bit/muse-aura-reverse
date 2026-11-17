package X;

import com.facebook.aura.activation.view.InviteCodeScratcherKt;

/* renamed from: X.Gui, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10328Gui extends GuS {
    public boolean A00;

    @Override // X.GuS
    public final String toString() {
        String str;
        String str2;
        StringBuilder sbA0g;
        String strA01;
        if (this.A00) {
            str = "<!";
            str2 = ">";
        } else {
            str = "<?";
            str2 = "?>";
        }
        Gt7 gt7 = this.A06;
        if (gt7 == null || gt7.A05() <= 0) {
            sbA0g = C3cG.A0g(str);
            strA01 = GuS.A01(this);
        } else {
            sbA0g = C3cG.A0g(str);
            sbA0g.append(GuS.A01(this));
            sbA0g.append(InviteCodeScratcherKt.CODE_SEPARATOR);
            strA01 = this.A06.toString();
        }
        return C60P.A1M(strA01, str2, sbA0g);
    }

    @Override // X.GuS
    /* renamed from: A0E, reason: merged with bridge method [inline-methods] */
    public final void A03() {
        super.A03();
        this.A00 = true;
    }
}
