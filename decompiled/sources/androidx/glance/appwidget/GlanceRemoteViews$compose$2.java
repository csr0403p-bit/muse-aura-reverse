package androidx.glance.appwidget;

import X.AKC;
import X.AbstractC07127nr;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.AnonymousClass733;
import X.ApI;
import X.B1V;
import X.BBG;
import X.BBH;
import X.BFM;
import X.BLG;
import X.BU2;
import X.C063975v;
import X.C3UX;
import X.C73Q;
import X.C73R;
import X.C75K;
import X.C75j;
import X.C77K;
import X.C8iZ;
import X.EnumC10460Hji;
import X.G0V;
import X.GBM;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.glance.appwidget.GlanceRemoteViews$compose$2", f = "GlanceRemoteViews.kt", l = {81, 100}, m = "invokeSuspend", v = 1)
/* loaded from: classes3.dex */
public final class GlanceRemoteViews$compose$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super C77K>, Object> {

    /* renamed from: $$v$c$androidx-compose-ui-unit-DpSize$-size$0, reason: not valid java name */
    public final /* synthetic */ long f1$$v$c$androidxcomposeuiunitDpSize$size$0;
    public final /* synthetic */ Bundle $appWidgetOptions;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ Object $state;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ GlanceRemoteViews this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Landroidx/glance/appwidget/GlanceRemoteViews;Landroid/content/Context;JLjava/lang/Object;Landroid/os/Bundle;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/HtJ<-Landroidx/glance/appwidget/GlanceRemoteViews$compose$2;>;)V */
    public GlanceRemoteViews$compose$2(Context context, Bundle bundle, GlanceRemoteViews glanceRemoteViews, Object obj, HtJ htJ, G0V g0v, long j) {
        super(2, htJ);
        this.this$0 = glanceRemoteViews;
        this.$context = context;
        this.f1$$v$c$androidxcomposeuiunitDpSize$size$0 = j;
        this.$state = obj;
        this.$appWidgetOptions = bundle;
        this.$content = g0v;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        GlanceRemoteViews glanceRemoteViews = this.this$0;
        Context context = this.$context;
        long j = this.f1$$v$c$androidxcomposeuiunitDpSize$size$0;
        GlanceRemoteViews$compose$2 glanceRemoteViews$compose$2 = new GlanceRemoteViews$compose$2(context, this.$appWidgetOptions, glanceRemoteViews, this.$state, htJ, this.$content, j);
        glanceRemoteViews$compose$2.L$0 = obj;
        return glanceRemoteViews$compose$2;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        C3UX c3ux;
        C75j c75j;
        AnonymousClass733 anonymousClass733;
        Object objA00 = obj;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(objA00);
            c3ux = (C3UX) this.L$0;
            GlanceRemoteViews glanceRemoteViews = this.this$0;
            Context context = this.$context;
            this.L$0 = c3ux;
            this.label = 1;
            objA00 = GlanceRemoteViews.A00(context, glanceRemoteViews, this);
            if (objA00 == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw AnonymousClass001.A0n();
                }
                anonymousClass733 = (AnonymousClass733) this.L$1;
                c75j = (C75j) this.L$0;
                Hwg.A00(objA00);
                C73R.A02(anonymousClass733);
                Context context2 = this.$context;
                return new C77K(C75K.A01(null, context2, C063975v.A00(context2), c75j, anonymousClass733, 0, c75j.A04(anonymousClass733), this.f1$$v$c$androidxcomposeuiunitDpSize$size$0));
            }
            c3ux = (C3UX) this.L$0;
            Hwg.A00(objA00);
        }
        c75j = (C75j) objA00;
        anonymousClass733 = new AnonymousClass733(50);
        C73Q c73q = new C73Q(anonymousClass733);
        BLG<AKC<ApI>> blg = BBH.A0R;
        BBH bbh = new BBH(c3ux.AEA());
        BBG bbg = new BBG(c73q, bbh);
        final Context context3 = this.$context;
        final Object obj2 = this.$state;
        final Bundle bundle = this.$appWidgetOptions;
        final long j = this.f1$$v$c$androidxcomposeuiunitDpSize$size$0;
        final G0V<BFM, Integer, Unit> g0v = this.$content;
        bbg.Ad8(B1V.A01(new G0V() { // from class: X.73L
            @Override // X.G0V
            public final Object invoke(Object obj3, Object obj4) {
                Context context4 = context3;
                Object obj5 = obj2;
                Bundle bundle2 = bundle;
                long j2 = j;
                G0V g0v2 = g0v;
                BFM bfm = (BFM) obj3;
                if (AnonymousClass005.A0D(obj4) == 2 && bfm.AKh()) {
                    bfm.Afo();
                } else {
                    AKT.A02(bfm, g0v2, new AKJ[]{C7VW.A00.A04(context4), C7VW.A01.A04(C73M.A00), C7VW.A03.A04(obj5), C7VV.A00.A04(bundle2), C7VW.A02.A04(new C73O(j2))}, 8);
                }
                return Unit.INSTANCE;
            }
        }, -131064190, true));
        AnonymousClass001.A1J(new C8iZ(bbh, null, 3), c3ux);
        if (((GBM) bbh.A0P).A0R(Unit.INSTANCE)) {
            synchronized (bbh.A0K) {
                bbh.A08 = true;
            }
        }
        this.L$0 = c75j;
        this.L$1 = anonymousClass733;
        this.label = 2;
        Object objA002 = AbstractC9777Gfy.A00(this, new BU2(null), bbh.A0Q);
        if (objA002 != enumC10460Hji) {
            objA002 = Unit.INSTANCE;
        }
        if (objA002 == enumC10460Hji) {
            return enumC10460Hji;
        }
        C73R.A02(anonymousClass733);
        Context context22 = this.$context;
        return new C77K(C75K.A01(null, context22, C063975v.A00(context22), c75j, anonymousClass733, 0, c75j.A04(anonymousClass733), this.f1$$v$c$androidxcomposeuiunitDpSize$size$0));
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super C77K> htJ) {
        return ((GlanceRemoteViews$compose$2) AbstractC07127nr.A09(htJ, c3ux, this)).invokeSuspend(Unit.INSTANCE);
    }
}
