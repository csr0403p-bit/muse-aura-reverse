package androidx.glance.appwidget;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.glance.appwidget.GlanceAppWidgetReceiver$doUpdate$2$1", f = "GlanceAppWidgetReceiver.kt", l = {124}, m = "invokeSuspend", v = 1)
/* loaded from: classes3.dex */
public final class GlanceAppWidgetReceiver$doUpdate$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ int $it;
    public int label;
    public final /* synthetic */ GlanceAppWidgetReceiver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Landroidx/glance/appwidget/GlanceAppWidgetReceiver;Landroid/content/Context;ILX/HtJ<-Landroidx/glance/appwidget/GlanceAppWidgetReceiver$doUpdate$2$1;>;)V */
    public GlanceAppWidgetReceiver$doUpdate$2$1(Context context, GlanceAppWidgetReceiver glanceAppWidgetReceiver, HtJ htJ, int i) {
        super(2, htJ);
        this.this$0 = glanceAppWidgetReceiver;
        this.$context = context;
        this.$it = i;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new GlanceAppWidgetReceiver$doUpdate$2$1(this.$context, this.this$0, htJ, this.$it);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            GlanceAppWidget glanceAppWidget = this.this$0.getGlanceAppWidget();
            Context context = this.$context;
            int i2 = this.$it;
            this.label = 1;
            if (glanceAppWidget.update$glance_appwidget(context, i2, null, this) == enumC10460Hji) {
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
        return ((GlanceAppWidgetReceiver$doUpdate$2$1) AbstractC07127nr.A09(htJ, c3ux, this)).invokeSuspend(Unit.INSTANCE);
    }
}
