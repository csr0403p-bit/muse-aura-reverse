package X;

import androidx.glance.appwidget.AppWidgetSession;
import androidx.glance.session.Session;
import kotlin.Unit;

/* renamed from: X.8ia, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C07218ia extends AbstractC07127nr implements G2j {
    public final int $t;
    public int A00;
    public Object A01;
    public boolean A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C07218ia(int i, HtJ<? super C07218ia> htJ) {
        super(4, htJ);
        this.$t = i;
    }

    @Override // X.G2j
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.$t;
        boolean zA1X = AnonymousClass001.A1X(obj3);
        C07218ia c07218ia = new C07218ia(i != 0 ? 1 : 0, (HtJ) obj4);
        c07218ia.A01 = obj2;
        c07218ia.A02 = zA1X;
        return c07218ia.invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.$t == 0) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            if (this.A00 != 0) {
                Hwg.A00(obj);
            } else {
                Hwg.A00(obj);
                Session session = (Session) this.A01;
                if (this.A02) {
                    this.A00 = 1;
                    if (session.A03.AcU(AnonymousClass778.A00, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
            }
            return Unit.INSTANCE;
        }
        EnumC10460Hji enumC10460Hji2 = EnumC10460Hji.A02;
        if (this.A00 != 0) {
            Hwg.A00(obj);
        } else {
            Hwg.A00(obj);
            AppWidgetSession appWidgetSession = (AppWidgetSession) this.A01;
            if (this.A02) {
                return null;
            }
            this.A00 = 1;
            obj = appWidgetSession.A06(this);
            if (obj == enumC10460Hji2) {
                return enumC10460Hji2;
            }
        }
        return obj;
    }
}
