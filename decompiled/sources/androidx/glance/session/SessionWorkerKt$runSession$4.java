package androidx.glance.session;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass738;
import X.BBH;
import X.BFw;
import X.BLG;
import X.BO7;
import X.C066277e;
import X.C3UX;
import X.C3pU;
import X.C77Q;
import X.C8iY;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.glance.session.SessionWorkerKt$runSession$4", f = "SessionWorker.kt", l = {211}, m = "invokeSuspend", v = 1)
/* loaded from: classes3.dex */
public final class SessionWorkerKt$runSession$4 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ BBH $recomposer;
    public final /* synthetic */ AnonymousClass738 $root;
    public final /* synthetic */ Session $session;
    public final /* synthetic */ C77Q $this_runSession;
    public final /* synthetic */ C066277e $timeouts;
    public final /* synthetic */ BLG<Boolean> $uiReady;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/BBH;Landroidx/glance/session/Session;LX/BLG<Ljava/lang/Boolean;>;Landroid/content/Context;LX/738;LX/77Q;LX/77e;LX/HtJ<-Landroidx/glance/session/SessionWorkerKt$runSession$4;>;)V */
    public SessionWorkerKt$runSession$4(Context context, BBH bbh, AnonymousClass738 anonymousClass738, Session session, C066277e c066277e, C77Q c77q, HtJ htJ, BLG blg) {
        super(2, htJ);
        this.$recomposer = bbh;
        this.$session = session;
        this.$uiReady = blg;
        this.$context = context;
        this.$root = anonymousClass738;
        this.$this_runSession = c77q;
        this.$timeouts = c066277e;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        BBH bbh = this.$recomposer;
        Session session = this.$session;
        BLG<Boolean> blg = this.$uiReady;
        SessionWorkerKt$runSession$4 sessionWorkerKt$runSession$4 = new SessionWorkerKt$runSession$4(this.$context, bbh, this.$root, session, this.$timeouts, this.$this_runSession, htJ, blg);
        sessionWorkerKt$runSession$4.L$0 = obj;
        return sessionWorkerKt$runSession$4;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C3UX c3ux = (C3UX) this.L$0;
            BO7 bo7 = new BO7();
            BBH bbh = this.$recomposer;
            bo7.element = bbh.A00;
            BLG<BFw> blg = bbh.A0Q;
            Session session = this.$session;
            BLG<Boolean> blg2 = this.$uiReady;
            C8iY c8iY = new C8iY(this.$context, bbh, this.$root, session, this.$timeouts, this.$this_runSession, null, bo7, c3ux, blg2);
            this.label = 1;
            if (C3pU.A00(this, c8iY, blg) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((SessionWorkerKt$runSession$4) AbstractC07127nr.A09(htJ, c3ux, this)).invokeSuspend(Unit.INSTANCE);
    }
}
