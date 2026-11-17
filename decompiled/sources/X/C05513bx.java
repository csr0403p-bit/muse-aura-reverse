package X;

import androidx.compose.runtime.MutableState;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.3bx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05513bx extends AbstractC7559F3s implements G0U {
    public final int $t;
    public final Object A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05513bx(int i, C1Pn c1Pn, AT5<Float, AOW> at5) {
        super(1);
        this.$t = i;
        this.A01 = at5;
        this.A00 = c1Pn;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                List list = (List) obj;
                Long l = (Long) list.get(0);
                Long l2 = (Long) list.get(1);
                Object obj2 = list.get(2);
                C7384Etj.A0Z(obj2, "null cannot be cast to non-null type kotlin.Int");
                int iA0F = AnonymousClass001.A0F(obj2);
                Object obj3 = list.get(3);
                C7384Etj.A0Z(obj3, "null cannot be cast to non-null type kotlin.Int");
                ADq aDq = new ADq(iA0F, AnonymousClass001.A0F(obj3));
                Object obj4 = list.get(4);
                C7384Etj.A0Z(obj4, "null cannot be cast to non-null type kotlin.Int");
                return new C1XE((InterfaceC04801Xj) this.A01, l, l2, (Locale) this.A00, aDq, AnonymousClass001.A0F(obj4));
            case 1:
            case 2:
            default:
                if (!((C1Pn) this.A01).A02()) {
                    ((Function0) this.A00).invoke();
                    break;
                }
                break;
            case 3:
                C2av c2av = (C2av) obj;
                float fAFn = ((C1Pn) this.A01).A00.A05.AFn();
                float fA00 = AWA.A00(((C1390AiL) c2av).A0D);
                if (!Float.isNaN(fAFn) && !Float.isNaN(fA00) && fA00 != 0.0f) {
                    float fA002 = MutableState.A00((AT5) this.A00);
                    c2av.AeX(C1Co.A00(c2av, fA002));
                    c2av.AeY(C1Co.A01(c2av, fA002));
                    long jA0J = AnonymousClass005.A0J(0.5f, (fAFn + fA00) / fA00);
                    long j = C15k.A01;
                    c2av.Af4(jA0J);
                    break;
                }
                break;
            case 4:
                AW3.A00((AbstractC1555AlK) this.A01, (AT3) obj, ((C1DN) this.A00).AO0());
                break;
            case 5:
                AST ast = (AST) obj;
                return ast.A00(new C05513bx(4, this.A00, ((C1DM) this.A01).mo2createOutlinePq9zytI(ast.A00.AKb(), ast.A00.getLayoutDirection(), ast)));
        }
        return Unit.INSTANCE;
    }
}
