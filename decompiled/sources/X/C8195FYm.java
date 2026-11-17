package X;

import java.util.ArrayList;
import kotlin.Unit;

/* renamed from: X.FYm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8195FYm extends AbstractC7559F3s implements G0W {
    public final int $t;
    public final Object A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8195FYm(int i, Object obj, Object obj2) {
        super(3);
        this.$t = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    @Override // X.G0W
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                ((Number) obj2).intValue();
                C7384Etj.A0Y(obj, 0);
                boolean z = false;
                if (obj instanceof FL4) {
                    FBB fbb = (FBB) this.A00;
                    C7384Etj.A0Y(fbb, 1);
                    C9115Fyg c9115FygA00 = C9115Fyg.A00();
                    FDW fdw = (FDW) this.A01;
                    c9115FygA00.A06(fdw, 0);
                    Hj6 hj6A03 = C9115Fyg.A03(c9115FygA00, fbb, 1);
                    C7384Etj.A0Y(fdw, 0);
                    F6D.A03(fbb, fdw, hj6A03, fdw.A0D(46));
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                BFM bfm = (BFM) obj2;
                int iA0F = AnonymousClass001.A0F(obj3);
                C7384Etj.A0Y(obj, 0);
                if ((iA0F & 6) == 0) {
                    iA0F |= bfm.A65(obj) ? 4 : 2;
                }
                if (bfm.AfS(iA0F & 1, AnonymousClass002.A1P(iA0F & 19, 18))) {
                    ((G2j) this.A00).invoke(obj, this.A01, bfm, Integer.valueOf(iA0F & 14));
                } else {
                    bfm.Afo();
                }
                return Unit.INSTANCE;
            default:
                C7384Etj.A0Y(obj, 0);
                GRU gru = (GRU) ((G0W) this.A01).invoke(obj, obj2, obj3);
                G0U<Object, Object> g0uAEo = gru.AEo();
                gru.AdI(C8631Fhi.A00(39));
                G0U[] g0uArr = (G0U[]) this.A00;
                ArrayList arrayListA11 = C60O.A11(g0uArr.length);
                for (G0U g0u : g0uArr) {
                    arrayListA11.add(g0u.invoke(gru));
                }
                gru.AdI((G0U) new EQe(arrayListA11, 22).invoke(g0uAEo));
                return gru;
        }
    }
}
