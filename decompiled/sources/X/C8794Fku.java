package X;

import com.facebook.aura.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* renamed from: X.Fku, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8794Fku extends AbstractC7559F3s implements G0W<C08R, BFM, Integer, Unit> {
    public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
    public final /* synthetic */ boolean $expanded;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8794Fku(G0V<? super BFM, ? super Integer, Unit> g0v, boolean z) {
        super(3);
        this.$content = g0v;
        this.$expanded = z;
    }

    @Override // X.G0W
    public final /* bridge */ /* synthetic */ Unit invoke(C08R c08r, BFM bfm, Integer num) {
        int i;
        BFM bfm2 = bfm;
        if ((AnonymousClass001.A0F(num) & 17) == 16 && bfm2.AKh()) {
            bfm2.Afo();
        } else {
            this.$content.invoke(bfm2, 0);
            BS0 bs0 = BRg.A00;
            C01N.A07(bfm2, C10G.A07(bs0, 8.0f));
            B0q b0q = AbstractC8797Fkx.A00;
            if (b0q == null) {
                long j = B6A.A07;
                ArrayList arrayListA0h = C3cG.A0h();
                C8801Fl1 c8801Fl1 = new C8801Fl1(null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1023);
                arrayListA0h.add(c8801Fl1);
                C1326AhD c1326AhD = new C1326AhD(B6A.A01);
                ArrayList arrayListA11 = C60O.A11(32);
                C8815FlT.A00(arrayListA11, 7.0f, 10.0f);
                C8817FlV.A00(arrayListA11, 5.0f);
                C8817FlV.A01(arrayListA11, 5.0f, -5.0f);
                arrayListA11.add(C8824Flc.A00);
                List listA00 = C8801Fl1.A00(arrayListA0h);
                Object b0p = new B0p(c1326AhD, null, "", arrayListA11, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2);
                while (true) {
                    listA00.add(b0p);
                    if (arrayListA0h.size() <= 1) {
                        break;
                    }
                    C8801Fl1 c8801Fl12 = (C8801Fl1) arrayListA0h.remove(C8j3.A0K(arrayListA0h));
                    listA00 = C8801Fl1.A00(arrayListA0h);
                    b0p = AbstractC8800Fl0.A00(c8801Fl12);
                }
                b0q = new B0q(AbstractC8800Fl0.A00(c8801Fl1), "Filled.ArrowDropDown", 24.0f, 24.0f, 24.0f, 24.0f, 5, j, false);
                AbstractC8797Fkx.A00 = b0q;
            }
            if (this.$expanded) {
                bfm2.AgE(-1360040181);
                i = R.string._name_removed__res_0x7f120cc5;
            } else {
                bfm2.AgE(-1359945910);
                i = R.string._name_removed__res_0x7f120cc9;
            }
            String strA00 = C1EO.A00(bfm2, i);
            BBI.A0R((BBI) bfm2, false);
            C10F.A01(bfm2, C11T.A00(bs0, this.$expanded ? 180.0f : 0.0f), b0q, strA00, 0, 8, 0L);
        }
        return Unit.INSTANCE;
    }
}
