package X;

import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.3bs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05463bs extends AbstractC7559F3s implements G0U {
    public final int $t;
    public final Object A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05463bs(Object obj, AT5<Float, AOW> at5) {
        super(1);
        this.$t = at5;
        this.A00 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long jA0F;
        MutableState mutableState;
        C04811Xk c04811Xk;
        switch (this.$t) {
            case 0:
                AYU ayu = (AYU) obj;
                List list = (List) this.A00;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ayu.A0A((AZE) list.get(i), 0.0f, 0, 0);
                }
                return Unit.INSTANCE;
            case 1:
                ((AYU) obj).A0A((AZE) this.A00, 0.0f, 0, 0);
                return Unit.INSTANCE;
            case 2:
                return Boolean.valueOf(!MutableState.A0B(((AOP) this.A00).A07, obj));
            case 3:
            case 19:
            case 20:
            case 21:
            default:
                ((C2av) obj).Acj(C1BO.A01((C1BO) this.A00));
                return Unit.INSTANCE;
            case 4:
            case 5:
                long j = ((BL4) obj).A00;
                return new BL4((((int) (j & 4294967295L)) & 4294967295L) | (AnonymousClass001.A0F(((G0U) this.A00).invoke(Integer.valueOf((int) (j >> 32)))) << 32));
            case 6:
            case 8:
                jA0F = AnonymousClass001.A0F(((G0U) this.A00).invoke(Integer.valueOf((int) (((BL4) obj).A00 >> 32)))) << 32;
                return new C2ae(jA0F);
            case 7:
            case 9:
                jA0F = (AnonymousClass001.A0F(((G0U) this.A00).invoke(Integer.valueOf((int) (((BL4) obj).A00 & 4294967295L)))) & 4294967295L) | (0 << 32);
                return new C2ae(jA0F);
            case 10:
                InterfaceC0857A6e interfaceC0857A6e = (InterfaceC0857A6e) obj;
                MutableState mutableState2 = (MutableState) this.A00;
                if (!C7BY.A0j((CharSequence) mutableState2.getValue())) {
                    interfaceC0857A6e.Aca(AbstractC1671Anw.A07, mutableState2.getValue());
                }
                return Unit.INSTANCE;
            case 11:
                int i2 = ((C04811Xk) obj).A00;
                C1XE c1xe = (C1XE) ((C0z3) this.A00);
                Long lAKE = c1xe.AKE();
                if (lAKE != null) {
                    c1xe.AdK(c1xe.A03.A04(lAKE.longValue()).A04);
                }
                mutableState = c1xe.A00;
                c04811Xk = new C04811Xk(i2);
                mutableState.Af8(c04811Xk);
                return Unit.INSTANCE;
            case 12:
                Number number = (Number) obj;
                C1XE c1xe2 = (C1XE) ((C0z3) this.A00);
                if (number == null) {
                    mutableState = c1xe2.A02;
                    c04811Xk = null;
                    mutableState.Af8(c04811Xk);
                    return Unit.INSTANCE;
                }
                C1XX c1xxA03 = c1xe2.A03.A03(number.longValue());
                ADq aDq = c1xe2.A05;
                int i3 = c1xxA03.A02;
                if (!aDq.A00(i3)) {
                    throw AnonymousClass007.A0Q(aDq, "The provided date's year (", i3);
                }
                c1xe2.A02.Af8(c1xxA03);
                return Unit.INSTANCE;
            case 13:
                ((C0z3) this.A00).AdK(((Number) obj).longValue());
                return Unit.INSTANCE;
            case 14:
                AbstractC1564Ale.A08((InterfaceC0857A6e) obj, (String) ((HxE) this.A00).first);
                return Unit.INSTANCE;
            case 15:
            case 17:
                ((Function0) this.A00).invoke();
                return Unit.INSTANCE;
            case 16:
                C2av c2av = (C2av) obj;
                float fA00 = MutableState.A00((AT5) this.A00);
                float fA002 = C1Co.A00(c2av, fA00);
                float fA01 = C1Co.A01(c2av, fA00);
                c2av.AeY(fA01 == 0.0f ? 1.0f : fA002 / fA01);
                c2av.Af4(C1Co.A00);
                return Unit.INSTANCE;
            case 18:
                ((Number) obj).floatValue();
                return Float.valueOf(((AXN) this.A00).Ah4(56.0f));
            case 22:
                AYU ayu2 = (AYU) obj;
                List list2 = (List) this.A00;
                int size2 = list2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    AYU.A04(ayu2, (AZE) list2.get(i4), 0, 0);
                }
                return Unit.INSTANCE;
        }
    }
}
