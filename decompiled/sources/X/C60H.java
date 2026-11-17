package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;

/* renamed from: X.60H, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C60H extends AbstractC07127nr implements G0V {
    public final int $t;
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C60H(Object obj, C3UY c3uy, C5WW c5ww, G0U<? super HtJ<? super R>, ? extends Object> g0u, HtJ<? super C60H> htJ) {
        super(2, g0u);
        this.$t = htJ;
        this.A06 = obj;
        this.A07 = c3uy;
        this.A05 = c5ww;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        C60H c60h = new C60H(this.A06, this.A07, this.A05, htJ, this.$t != 0 ? 1 : 0);
        c60h.A01 = obj;
        return c60h;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C60H) create(obj, (HtJ) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x00b2: INVOKE (r2 I:X.BLa), (r4 I:java.lang.Object) INTERFACE call: X.BLa.Ahe(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:178), block:B:36:0x00b2 */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x013c: INVOKE (r4 I:X.BLa), (r5 I:java.lang.Object) INTERFACE call: X.BLa.Ahe(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:316), block:B:59:0x013c */
    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        InterfaceC2261BLa interfaceC2261BLaAhe;
        C5WW c5ww;
        InterfaceC2261BLa interfaceC2261BLa;
        G0U g0u;
        Object obj2;
        Object obj3;
        InterfaceC2261BLa interfaceC2261BLaAhe2;
        C3St c3St;
        AtomicReference<C5Tc> atomicReference;
        C5Tc c5Tc;
        InterfaceC2261BLa interfaceC2261BLa2;
        G0U g0u2;
        Object obj4;
        Object obj5;
        if (this.$t == 0) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.A00;
            try {
                try {
                    if (i == 0) {
                        Hwg.A00(obj);
                        C3UX c3ux = (C3UX) this.A01;
                        C3UY c3uy = (C3UY) this.A06;
                        C78X c78xA0t = C3cH.A0t(c3ux);
                        C7384Etj.A0X(c78xA0t);
                        C5WX c5wx = new C5WX(c3uy, (HoC) c78xA0t);
                        c5ww = (C5WW) this.A07;
                        C5WW.A00(c5wx, c5ww);
                        interfaceC2261BLa = c5ww.A01;
                        g0u = (G0U) this.A05;
                        this.A01 = c5wx;
                        this.A02 = interfaceC2261BLa;
                        this.A03 = g0u;
                        this.A04 = c5ww;
                        this.A00 = 1;
                        obj2 = c5wx;
                        if (interfaceC2261BLa.APs(null, this) == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    } else {
                        if (i != 1) {
                            c5ww = (C5WW) this.A03;
                            interfaceC2261BLa = (InterfaceC2261BLa) this.A02;
                            obj2 = this.A01;
                            try {
                                Hwg.A00(obj);
                                obj3 = obj2;
                                Bs8.A00(obj3, null, c5ww.A00);
                                interfaceC2261BLa.Ahe(null);
                                return obj;
                            } catch (Throwable th) {
                                th = th;
                                Bs8.A00(obj2, null, c5ww.A00);
                                throw th;
                            }
                        }
                        c5ww = (C5WW) this.A04;
                        g0u = (G0U) this.A03;
                        interfaceC2261BLa = (InterfaceC2261BLa) this.A02;
                        Object obj6 = this.A01;
                        Hwg.A00(obj);
                        obj2 = obj6;
                    }
                    this.A01 = obj2;
                    this.A02 = interfaceC2261BLa;
                    this.A03 = c5ww;
                    this.A04 = null;
                    this.A00 = 2;
                    obj = g0u.invoke(this);
                    obj3 = obj2;
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                    Bs8.A00(obj3, null, c5ww.A00);
                    interfaceC2261BLa.Ahe(null);
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    Bs8.A00(obj2, null, c5ww.A00);
                    throw th;
                }
            } catch (Throwable th3) {
                interfaceC2261BLaAhe.Ahe(null);
                throw th3;
            }
        }
        EnumC10460Hji enumC10460Hji2 = EnumC10460Hji.A02;
        int i2 = this.A00;
        try {
            try {
                if (i2 == 0) {
                    Hwg.A00(obj);
                    C3UX c3ux2 = (C3UX) this.A01;
                    C3UY c3uy2 = (C3UY) this.A06;
                    C78X c78xA0t2 = C3cH.A0t(c3ux2);
                    C7384Etj.A0X(c78xA0t2);
                    C5Tc c5Tc2 = new C5Tc(c3uy2, (HoC) c78xA0t2);
                    c3St = (C3St) this.A07;
                    do {
                        atomicReference = c3St.A00;
                        c5Tc = atomicReference.get();
                        if (c5Tc != null && c5Tc2.A00.compareTo(c5Tc.A00) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                    } while (!Bs8.A00(c5Tc, c5Tc2, atomicReference));
                    if (c5Tc != null) {
                        c5Tc.A01.A5w(null);
                    }
                    interfaceC2261BLa2 = c3St.A01;
                    g0u2 = (G0U) this.A05;
                    this.A01 = c5Tc2;
                    this.A02 = interfaceC2261BLa2;
                    this.A03 = g0u2;
                    this.A04 = c3St;
                    this.A00 = 1;
                    obj4 = c5Tc2;
                    if (interfaceC2261BLa2.APs(null, this) == enumC10460Hji2) {
                        return enumC10460Hji2;
                    }
                } else {
                    if (i2 != 1) {
                        c3St = (C3St) this.A03;
                        interfaceC2261BLa2 = (InterfaceC2261BLa) this.A02;
                        obj4 = this.A01;
                        try {
                            Hwg.A00(obj);
                            obj5 = obj4;
                            Bs8.A00(obj5, null, c3St.A00);
                            interfaceC2261BLa2.Ahe(null);
                            return obj;
                        } catch (Throwable th4) {
                            th = th4;
                            Bs8.A00(obj4, null, c3St.A00);
                            throw th;
                        }
                    }
                    c3St = (C3St) this.A04;
                    g0u2 = (G0U) this.A03;
                    interfaceC2261BLa2 = (InterfaceC2261BLa) this.A02;
                    Object obj7 = this.A01;
                    Hwg.A00(obj);
                    obj4 = obj7;
                }
                this.A01 = obj4;
                this.A02 = interfaceC2261BLa2;
                this.A03 = c3St;
                this.A04 = null;
                this.A00 = 2;
                obj = g0u2.invoke(this);
                obj5 = obj4;
                if (obj == enumC10460Hji2) {
                    return enumC10460Hji2;
                }
                Bs8.A00(obj5, null, c3St.A00);
                interfaceC2261BLa2.Ahe(null);
                return obj;
            } catch (Throwable th5) {
                th = th5;
                Bs8.A00(obj4, null, c3St.A00);
                throw th;
            }
        } catch (Throwable th6) {
            interfaceC2261BLaAhe2.Ahe(null);
            throw th6;
        }
    }
}
