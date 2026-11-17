package X;

import android.content.Context;
import androidx.glance.appwidget.AppWidgetSession;
import androidx.glance.session.Session;
import kotlin.Unit;

/* renamed from: X.8iY, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C8iY extends AbstractC07127nr implements G0V {
    public final int $t = 1;
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final Object A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/F2N;LX/Huf;LX/3UX;LX/G0V<-LX/3UX;-LX/HtJ<-Lkotlin/Unit;>;+Ljava/lang/Object;>;LX/HtJ<-LX/8iY;>;)V */
    public C8iY(EnumC10573Huf enumC10573Huf, F2N f2n, HtJ htJ, G0V g0v, C3UX c3ux) {
        super(2, htJ);
        this.A0A = f2n;
        this.A09 = enumC10573Huf;
        this.A07 = c3ux;
        this.A08 = g0v;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        if (this.$t != 0) {
            F2N f2n = (F2N) this.A0A;
            return new C8iY((EnumC10573Huf) this.A09, f2n, htJ, (G0V) this.A08, (C3UX) this.A07);
        }
        Session session = (Session) this.A02;
        BBH bbh = (BBH) this.A0A;
        BO7 bo7 = (BO7) this.A09;
        BLG blg = (BLG) this.A05;
        C8iY c8iY = new C8iY((Context) this.A08, bbh, (AnonymousClass738) this.A01, session, (C066277e) this.A04, (C77Q) this.A03, htJ, bo7, (C3UX) this.A07, blg);
        c8iY.A06 = obj;
        return c8iY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00a7: IGET (r1 I:T) = (r1 I:X.Hqv) (LINE:167) X.Hqv.element java.lang.Object, block:B:37:0x00a7 */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x009e: IGET (r0 I:T) = (r10 I:X.Hqv) (LINE:158) X.Hqv.element java.lang.Object, block:B:34:0x009e */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.Hqv] */
    /* JADX WARN: Type inference failed for: r1v8, types: [X.Hqv] */
    /* JADX WARN: Type inference failed for: r6v3, types: [T, X.2Kw, X.79Q] */
    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r10;
        ?? r1;
        final C10543Hqv c10543HqvA0z;
        C10543Hqv c10543HqvA0z2;
        if (this.$t != 0) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.A00;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    F2N f2n = (F2N) this.A0A;
                    if (((C5303Dfm) f2n).A01 != EnumC10573Huf.A03) {
                        c10543HqvA0z = C3cG.A0z();
                        c10543HqvA0z2 = C3cG.A0z();
                        EnumC10573Huf enumC10573Huf = (EnumC10573Huf) this.A09;
                        final C3UX c3ux = (C3UX) this.A07;
                        final G0V g0v = (G0V) this.A08;
                        this.A01 = c10543HqvA0z;
                        this.A02 = c10543HqvA0z2;
                        this.A03 = enumC10573Huf;
                        this.A04 = f2n;
                        this.A05 = c3ux;
                        this.A06 = g0v;
                        this.A00 = 1;
                        final GBL gblA04 = C7Bm.A04(this);
                        int iA0L = AnonymousClass003.A0L(enumC10573Huf);
                        final EnumC3085Bxl enumC3085Bxl = iA0L != 2 ? iA0L != 3 ? iA0L != 4 ? null : EnumC3085Bxl.ON_RESUME : EnumC3085Bxl.ON_START : EnumC3085Bxl.ON_CREATE;
                        final EnumC3085Bxl enumC3085BxlA00 = EnumC3085Bxl.A00(enumC10573Huf);
                        final C9258GBl c9258GBl = new C9258GBl();
                        ?? r6 = new Dg3() { // from class: X.79Q
                            /* JADX WARN: Type inference failed for: r0v9, types: [T, X.Hqc] */
                            @Override // X.Dg3
                            public final void onStateChanged(C1HY c1hy, EnumC3085Bxl enumC3085Bxl2) {
                                C7384Etj.A0Y(enumC3085Bxl2, 1);
                                if (enumC3085Bxl2 == enumC3085Bxl) {
                                    C10543Hqv<HoC> c10543Hqv = c10543HqvA0z;
                                    C3UX c3ux2 = c3ux;
                                    C07298ii c07298ii = new C07298ii(null, g0v, c9258GBl);
                                    c10543Hqv.element = GAo.A02(C79.A00, C6ys.A00, c07298ii, c3ux2);
                                    return;
                                }
                                if (enumC3085Bxl2 == enumC3085BxlA00) {
                                    C10543Hqv<HoC> c10543Hqv2 = c10543HqvA0z;
                                    HoC hoC = c10543Hqv2.element;
                                    if (hoC != null) {
                                        hoC.A5w(null);
                                    }
                                    c10543Hqv2.element = null;
                                }
                                if (enumC3085Bxl2 == EnumC3085Bxl.ON_DESTROY) {
                                    gblA04.resumeWith(Unit.INSTANCE);
                                }
                            }
                        };
                        c10543HqvA0z2.element = r6;
                        f2n.A04(r6);
                        if (gblA04.A0F() == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    c10543HqvA0z2 = (C10543Hqv) this.A02;
                    c10543HqvA0z = (C10543Hqv) this.A01;
                    Hwg.A00(obj);
                }
                HoC hoC = (HoC) c10543HqvA0z.element;
                if (hoC != null) {
                    hoC.A5w(null);
                }
                C2Kw c2Kw = (C2Kw) c10543HqvA0z2.element;
                if (c2Kw != null) {
                    ((F2N) this.A0A).A05(c2Kw);
                }
            } catch (Throwable th) {
                HoC hoC2 = (HoC) r10.element;
                if (hoC2 != null) {
                    hoC2.A5w(null);
                }
                C2Kw c2Kw2 = (C2Kw) r1.element;
                if (c2Kw2 != null) {
                    ((F2N) this.A0A).A05(c2Kw2);
                }
                throw th;
            }
        } else {
            EnumC10460Hji enumC10460Hji2 = EnumC10460Hji.A02;
            int i2 = this.A00;
            if (i2 == 0) {
                Hwg.A00(obj);
                int iOrdinal = ((BFw) this.A06).ordinal();
                if (iOrdinal == 4) {
                    if (((BBH) this.A0A).A00 > ((BO7) this.A09).element || !AnonymousClass003.A1Z((BLG) this.A05)) {
                        Session session = (Session) this.A02;
                        Context context = (Context) this.A08;
                        C73D c73dA7J = ((AnonymousClass738) this.A01).A7J();
                        C7384Etj.A0Z(c73dA7J, "null cannot be cast to non-null type androidx.glance.EmittableWithChildren");
                        this.A00 = 1;
                        obj = AppWidgetSession.A00(context, (AnonymousClass738) c73dA7J, (AppWidgetSession) session, this);
                        if (obj == enumC10460Hji2) {
                            return enumC10460Hji2;
                        }
                    }
                    ((BO7) this.A09).element = ((BBH) this.A0A).A00;
                } else if (iOrdinal == 0) {
                    Hxb.A03(null, (C3UX) this.A07);
                }
            } else if (i2 != 1) {
                Hwg.A00(obj);
                ((C77Q) this.A03).AgM(((C066277e) this.A04).A02);
                ((BO7) this.A09).element = ((BBH) this.A0A).A00;
            } else {
                Hwg.A00(obj);
            }
            boolean zA1X = AnonymousClass001.A1X(obj);
            if (!AnonymousClass003.A1Z((BLG) this.A05) && zA1X) {
                C3Em c3Em = (C3Em) this.A05;
                this.A00 = 2;
                if (c3Em.emit(true, this) == enumC10460Hji2) {
                    return enumC10460Hji2;
                }
                ((C77Q) this.A03).AgM(((C066277e) this.A04).A02);
            }
            ((BO7) this.A09).element = ((BBH) this.A0A).A00;
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C8iY) AbstractC07127nr.A09(obj2, obj, this)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Landroidx/glance/session/Session;LX/BBH;LX/BO7;LX/BLG<Ljava/lang/Boolean;>;Landroid/content/Context;LX/738;LX/77Q;LX/77e;LX/3UX;LX/HtJ<-LX/8iY;>;)V */
    public C8iY(Context context, BBH bbh, AnonymousClass738 anonymousClass738, Session session, C066277e c066277e, C77Q c77q, HtJ htJ, BO7 bo7, C3UX c3ux, BLG blg) {
        super(2, htJ);
        this.A02 = session;
        this.A0A = bbh;
        this.A09 = bo7;
        this.A05 = blg;
        this.A08 = context;
        this.A01 = anonymousClass738;
        this.A03 = c77q;
        this.A04 = c066277e;
        this.A07 = c3ux;
    }
}
