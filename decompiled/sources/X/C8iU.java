package X;

import androidx.glance.appwidget.AppWidgetSession;
import androidx.glance.appwidget.AppWidgetUtilsKt$runGlance$1$receiver$1;
import androidx.glance.session.Session;
import androidx.glance.session.SessionManagerImpl;

/* renamed from: X.8iU, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C8iU extends HzP {
    public final int $t;
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8iU(Object obj, AppWidgetSession appWidgetSession, HtJ<? super C8iU> htJ) {
        super(appWidgetSession);
        this.$t = htJ;
        this.A05 = obj;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        int i = this.$t;
        this.A04 = obj;
        this.A00 |= Integer.MIN_VALUE;
        Object obj2 = this.A05;
        switch (i) {
            case 0:
                return AppWidgetSession.A00(null, null, (AppWidgetSession) obj2, this);
            case 1:
                return ((AppWidgetUtilsKt$runGlance$1$receiver$1) obj2).AYe(this, null);
            case 2:
                return ((Session) obj2).A05(null, null, this);
            default:
                return SessionManagerImpl.A00((SessionManagerImpl) obj2, this, null);
        }
    }
}
