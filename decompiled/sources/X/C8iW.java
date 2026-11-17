package X;

import androidx.glance.appwidget.AppWidgetSession;
import androidx.room.TriggerBasedInvalidationTracker;

/* renamed from: X.8iW, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C8iW extends HzP {
    public final int $t;
    public int A00;
    public int A01;
    public int A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public final Object A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8iW(Object obj, AppWidgetSession appWidgetSession, HtJ<? super C8iW> htJ) {
        super(appWidgetSession);
        this.$t = htJ;
        this.A07 = obj;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        int i = this.$t;
        this.A06 = obj;
        this.A02 |= Integer.MIN_VALUE;
        return i != 0 ? TriggerBasedInvalidationTracker.A02(null, (TriggerBasedInvalidationTracker) this.A07, this, 0) : AppWidgetSession.A02((AppWidgetSession) this.A07, null, this);
    }
}
