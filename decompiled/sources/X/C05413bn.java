package X;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* renamed from: X.3bn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05413bn extends AbstractC07127nr implements G0V {
    public final int $t;
    public int A00;
    public Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05413bn(Object obj, F2N f2n, EnumC10573Huf enumC10573Huf, C78T c78t, C20Q<? extends T> c20q, HtJ<? super C05413bn> htJ) {
        super(2, c20q);
        this.$t = htJ;
        this.A03 = f2n;
        this.A04 = obj;
        this.A02 = enumC10573Huf;
        this.A05 = c78t;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i;
        if (this.$t != 0) {
            obj5 = this.A05;
            obj2 = this.A03;
            obj4 = this.A02;
            obj3 = this.A04;
            i = 1;
        } else {
            obj2 = this.A03;
            obj3 = this.A04;
            obj4 = this.A02;
            obj5 = this.A05;
            i = 0;
        }
        C05413bn c05413bn = new C05413bn(obj3, obj2, obj4, obj5, htJ, i);
        c05413bn.A01 = obj;
        return c05413bn;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C05413bn) create(obj, (HtJ) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.$t != 0) {
            C3UX c3ux = (C3UX) this.A01;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            try {
                if (this.A00 != 0) {
                    Hwg.A00(obj);
                } else {
                    Hwg.A00(obj);
                    ((AtomicBoolean) this.A05).set(true);
                    G0V g0v = (G0V) this.A03;
                    this.A01 = c3ux;
                    this.A00 = 1;
                    if (g0v.invoke(c3ux, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
                ((AtomicBoolean) this.A02).set(true);
            } catch (Throwable th) {
                HzS.A05(c3ux.AEA());
                ((AtomicBoolean) this.A02).set(true);
                ((G0U) this.A04).invoke(th);
            }
        } else {
            EnumC10460Hji enumC10460Hji2 = EnumC10460Hji.A02;
            if (this.A00 != 0) {
                Hwg.A00(obj);
            } else {
                Hwg.A00(obj);
                InterfaceC05161qu interfaceC05161qu = (InterfaceC05161qu) this.A01;
                F2N f2n = (F2N) this.A03;
                EnumC10573Huf enumC10573Huf = (EnumC10573Huf) this.A04;
                C05393bl c05393bl = new C05393bl(interfaceC05161qu, (HtJ) null, (C78T) this.A02, (C20Q) this.A05);
                this.A00 = 1;
                if (Awn.A00(enumC10573Huf, f2n, this, c05393bl) == enumC10460Hji2) {
                    return enumC10460Hji2;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
