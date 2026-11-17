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

@DebugMetadata(c = "androidx.glance.appwidget.GlanceAppWidgetReceiver$onReceive$1$1", f = "GlanceAppWidgetReceiver.kt", l = {230}, m = "invokeSuspend", v = 1)
/* loaded from: classes3.dex */
public final class GlanceAppWidgetReceiver$onReceive$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $actionKey;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ int $id;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ GlanceAppWidgetReceiver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Landroidx/glance/appwidget/GlanceAppWidgetReceiver;Landroid/content/Context;ILjava/lang/String;LX/HtJ<-Landroidx/glance/appwidget/GlanceAppWidgetReceiver$onReceive$1$1;>;)V */
    public GlanceAppWidgetReceiver$onReceive$1$1(Context context, GlanceAppWidgetReceiver glanceAppWidgetReceiver, String str, HtJ htJ, int i) {
        super(2, htJ);
        this.this$0 = glanceAppWidgetReceiver;
        this.$context = context;
        this.$id = i;
        this.$actionKey = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        GlanceAppWidgetReceiver glanceAppWidgetReceiver = this.this$0;
        GlanceAppWidgetReceiver$onReceive$1$1 glanceAppWidgetReceiver$onReceive$1$1 = new GlanceAppWidgetReceiver$onReceive$1$1(this.$context, glanceAppWidgetReceiver, this.$actionKey, htJ, this.$id);
        glanceAppWidgetReceiver$onReceive$1$1.L$0 = obj;
        return glanceAppWidgetReceiver$onReceive$1$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C3UX c3ux = (C3UX) this.L$0;
            GlanceAppWidgetReceiver glanceAppWidgetReceiver = this.this$0;
            Context context = this.$context;
            int i2 = this.$id;
            String str = this.$actionKey;
            this.label = 1;
            if (glanceAppWidgetReceiver.doLambda$glance_appwidget(c3ux, context, i2, str, this) == enumC10460Hji) {
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
        return ((GlanceAppWidgetReceiver$onReceive$1$1) AbstractC07127nr.A09(htJ, c3ux, this)).invokeSuspend(Unit.INSTANCE);
    }
}
