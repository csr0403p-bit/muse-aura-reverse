package X;

import androidx.glance.appwidget.GlanceRemoteViewsService;
import androidx.glance.session.SessionManagerImpl$scope$1;
import androidx.glance.session.TimerScopeKt;
import androidx.glance.state.GlanceState;
import androidx.room.ObservedTableVersions;

/* renamed from: X.8iO, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C8iO extends HzP {
    public final int $t;
    public int A00;
    public Object A01;
    public Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8iO(Object obj, GlanceRemoteViewsService.GlanceRemoteViewsFactory glanceRemoteViewsFactory, HtJ<? super C8iO> htJ) {
        super(glanceRemoteViewsFactory);
        this.$t = htJ;
        this.A02 = obj;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        switch (this.$t) {
            case 0:
                this.A01 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return GlanceRemoteViewsService.GlanceRemoteViewsFactory.A01(null, (GlanceRemoteViewsService.GlanceRemoteViewsFactory) this.A02, this);
            case 1:
                this.A01 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((SessionManagerImpl$scope$1) this.A02).AZt(null, this);
            case 2:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return TimerScopeKt.A00(null, this, null);
            case 3:
                this.A01 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((GlanceState) this.A02).AMM(null, null, null, this);
            case 4:
                this.A01 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((ObservedTableVersions) this.A02).A00(this, null);
            default:
                int i = this.A00;
                if (i != 0) {
                    if (i != 1) {
                        throw C3cG.A0Q("This coroutine had already completed");
                    }
                    this.A00 = 2;
                    Hwg.A00(obj);
                    return obj;
                }
                this.A00 = 1;
                Hwg.A00(obj);
                C7384Etj.A0Z(this.A02, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                G0V g0v = (G0V) this.A02;
                C0862A6j.A02(g0v, 2);
                return g0v.invoke(this.A01, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8iO(HtJ<? super C8iO> htJ) {
        super(htJ);
        this.$t = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8iO(Object obj, HtJ htJ, C78T c78t, G0V g0v) {
        super(htJ, c78t);
        this.$t = 5;
        this.A02 = g0v;
        this.A01 = obj;
    }
}
