package androidx.glance.appwidget;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass773;
import X.EnumC10460Hji;
import X.G2j;
import X.HtJ;
import X.Hwg;
import X.InterfaceC065376p;
import android.os.Bundle;
import androidx.glance.session.Session;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.glance.appwidget.GlanceAppWidget$resize$2", f = "GlanceAppWidget.kt", l = {192}, m = "invokeSuspend", v = 1)
/* loaded from: classes3.dex */
public final class GlanceAppWidget$resize$2 extends AbstractC07127nr implements G2j<InterfaceC065376p, AppWidgetSession, Boolean, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Bundle $options;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceAppWidget$resize$2(Bundle bundle, HtJ<? super GlanceAppWidget$resize$2> htJ) {
        super(4, htJ);
        this.$options = bundle;
    }

    @Override // X.G2j
    public final /* bridge */ /* synthetic */ Object invoke(InterfaceC065376p interfaceC065376p, AppWidgetSession appWidgetSession, Boolean bool, HtJ<? super Unit> htJ) {
        GlanceAppWidget$resize$2 glanceAppWidget$resize$2 = new GlanceAppWidget$resize$2(this.$options, htJ);
        glanceAppWidget$resize$2.L$0 = appWidgetSession;
        return glanceAppWidget$resize$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            Session session = (Session) this.L$0;
            Bundle bundle = this.$options;
            this.label = 1;
            if (session.A03.AcU(new AnonymousClass773(bundle), this) == enumC10460Hji) {
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
}
