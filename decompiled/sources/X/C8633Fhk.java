package X;

import com.facebook.rendercore.text.RCTextView;

/* renamed from: X.Fhk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8633Fhk extends AbstractC7559F3s implements G0W {
    public final int $t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8633Fhk(int i) {
        super(3);
        this.$t = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.G0W
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        FK0 fk0;
        switch (this.$t) {
            case 0:
                FK0 fk02 = (FK0) obj2;
                EtN etN = (EtN) obj3;
                AnonymousClass005.A0x(obj, fk02, etN);
                fk02.setCanvasModel(etN);
                i = 24;
                fk0 = fk02;
                break;
            case 1:
                RCTextView rCTextView = (RCTextView) obj2;
                FJL fjl = (FJL) obj3;
                AnonymousClass005.A0x(obj, rCTextView, fjl);
                rCTextView.A06(fjl.A01);
                i = 32;
                fk0 = rCTextView;
                break;
            case 2:
                C7384Etj.A0Y(obj3, 2);
                return obj3;
            case 3:
                G0V g0v = (G0V) obj;
                C7384Etj.A0Y(g0v, 0);
                return GRO.A00(obj2, null, g0v);
            default:
                return null;
        }
        return new FK1(FZO.A02(fk0, i));
    }
}
