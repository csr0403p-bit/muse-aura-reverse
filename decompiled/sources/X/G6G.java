package X;

import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class G6G extends G6C {
    public final HoO A00;
    public final /* synthetic */ G6H A01;

    @Override // X.G6C
    public final void A00(G65 g65) {
        C7384Etj.A0Y(g65, 0);
        G6H g6h = this.A01;
        G6J g6j = g6h.A02.get(((G69) g65).A03);
        if (g6j != null) {
            g6j.AYa(g6h.A00, g65, this);
            return;
        }
        Iterator itA00 = G65.A00(g65);
        while (itA00.hasNext()) {
            G65 g65A1D = AbstractC7607F5u.A1D(itA00);
            C7384Etj.A0Y(g65A1D, 0);
            A00(g65A1D);
        }
    }

    public final void A01(CharSequence charSequence) {
        C7384Etj.A0Y(charSequence, 0);
        this.A01.A01.append(charSequence);
    }

    public final void A02(CharSequence charSequence) {
        C7384Etj.A0Y(charSequence, 0);
        this.A01.A01.append((CharSequence) C8j3.A16(C3cG.A0f(charSequence, "</"), '>'));
    }

    public final void A04(G65 g65) {
        C7384Etj.A0Y(g65, 0);
        G6H g6h = this.A01;
        G6J g6j = g6h.A02.get(((G69) g65).A03);
        if (g6j != null) {
            g6j.AYa(g6h.A00, g65, this);
        } else {
            A01(G6H.A01(g6h.A00, g65, true));
        }
    }

    public G6G(HoO hoO, G6H g6h) {
        this.A01 = g6h;
        this.A00 = hoO;
    }

    public final void A03(CharSequence charSequence, G65 g65, CharSequence[] charSequenceArr, boolean z) {
        AnonymousClass003.A0u(g65, charSequence);
        C7384Etj.A0Y(charSequenceArr, 2);
        StringBuilder sb = this.A01.A01;
        HoO hoO = this.A00;
        CharSequence[] charSequenceArr2 = (CharSequence[]) Arrays.copyOf(charSequenceArr, charSequenceArr.length);
        C7384Etj.A0Y(charSequenceArr2, 2);
        StringBuilder sbA0w = C60O.A0w();
        AbstractC7609F5w.A1I(charSequence, C60O.A0x("<"), sbA0w);
        for (CharSequence charSequence2 : hoO.A00.invoke(g65, charSequence, charSequenceArr2.length == 0 ? C0881AGi.A00 : new BMt<>(charSequenceArr2))) {
            if (charSequence2 != null) {
                AbstractC7609F5w.A1I(charSequence2, C60O.A0x(InviteCodeScratcherKt.CODE_SEPARATOR), sbA0w);
            }
        }
        sb.append((CharSequence) AnonymousClass001.A0v(z ? " />" : ">", sbA0w));
    }
}
