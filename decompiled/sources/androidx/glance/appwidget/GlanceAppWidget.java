package androidx.glance.appwidget;

import X.AnonymousClass771;
import X.AnonymousClass774;
import X.C063975v;
import X.C06H;
import X.C07218ia;
import X.C07328il;
import X.C3cG;
import X.C60O;
import X.C6PE;
import X.C6PP;
import X.C6PQ;
import X.C6vW;
import X.C70B;
import X.C73B;
import X.C73C;
import X.C77H;
import X.EnumC10460Hji;
import X.G2j;
import X.HtJ;
import X.InterfaceC065376p;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import android.widget.RemoteViews;
import androidx.glance.session.SessionManagerImpl;
import androidx.glance.state.GlanceState;
import com.facebook.aura.R;
import kotlin.Unit;

/* loaded from: classes3.dex */
public abstract class GlanceAppWidget {
    public static final int $stable = 8;
    public final int errorUiLayout;
    public final C73C previewSizeMode;
    public final C70B sizeMode;
    public final C6PQ<?> stateDefinition;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object deleted$glance_appwidget(android.content.Context r9, int r10, X.HtJ<? super kotlin.Unit> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.appwidget.GlanceAppWidget.deleted$glance_appwidget(android.content.Context, int, X.HtJ):java.lang.Object");
    }

    public abstract C70B getSizeMode();

    public abstract Object provideGlance(Context context, C6PP c6pp, HtJ<? super Unit> htJ);

    public final Object resize$glance_appwidget(Context context, int i, Bundle bundle, HtJ<? super Unit> htJ) {
        Object orCreateAppWidgetSession$glance_appwidget;
        return ((getSizeMode() instanceof C73B) || (orCreateAppWidgetSession$glance_appwidget = getOrCreateAppWidgetSession$glance_appwidget(context, new C6vW(i), bundle, new GlanceAppWidget$resize$2(bundle, null), htJ)) != EnumC10460Hji.A02) ? Unit.INSTANCE : orCreateAppWidgetSession$glance_appwidget;
    }

    public /* synthetic */ GlanceAppWidget(int i, int i2, C06H c06h) {
        this((i2 & 1) != 0 ? R.layout._name_removed__res_0x7f0d018d : i);
    }

    public static /* synthetic */ AppWidgetSession createAppWidgetSession$default(GlanceAppWidget glanceAppWidget, Context context, C6vW c6vW, Bundle bundle, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createAppWidgetSession");
        }
        if ((i & 4) != 0) {
            bundle = null;
        }
        return glanceAppWidget.createAppWidgetSession(context, c6vW, bundle);
    }

    public static /* synthetic */ Object getOrCreateAppWidgetSession$glance_appwidget$default(GlanceAppWidget glanceAppWidget, Context context, C6vW c6vW, Bundle bundle, G2j g2j, HtJ htJ, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOrCreateAppWidgetSession");
        }
        if ((i & 4) != 0) {
            bundle = null;
        }
        return glanceAppWidget.getOrCreateAppWidgetSession$glance_appwidget(context, c6vW, bundle, g2j, htJ);
    }

    public static /* synthetic */ Object triggerAction$glance_appwidget$default(GlanceAppWidget glanceAppWidget, Context context, int i, String str, Bundle bundle, HtJ htJ, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: triggerAction");
        }
        if ((i2 & 8) != 0) {
            bundle = null;
        }
        return glanceAppWidget.triggerAction$glance_appwidget(context, i, str, bundle, htJ);
    }

    public static /* synthetic */ Object update$glance_appwidget$default(GlanceAppWidget glanceAppWidget, Context context, int i, Bundle bundle, HtJ htJ, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update");
        }
        if ((i2 & 4) != 0) {
            bundle = null;
        }
        return glanceAppWidget.update$glance_appwidget(context, i, bundle, htJ);
    }

    public AppWidgetSession createAppWidgetSession(Context context, C6vW c6vW, Bundle bundle) {
        return new AppWidgetSession(bundle, c6vW, this, getSizeMode(), GlanceState.A00);
    }

    public C063975v getComponents(Context context) {
        return null;
    }

    public int getErrorUiLayout$glance_appwidget() {
        return this.errorUiLayout;
    }

    public final <T> Object getOrCreateAppWidgetSession$glance_appwidget(Context context, C6vW c6vW, Bundle bundle, G2j<? super InterfaceC065376p, ? super AppWidgetSession, ? super Boolean, ? super HtJ<? super T>, ? extends Object> g2j, HtJ<? super T> htJ) {
        return SessionManagerImpl.A00((SessionManagerImpl) AnonymousClass774.A00, htJ, new C07328il(context, bundle, c6vW, this, null, g2j));
    }

    public C73C getPreviewSizeMode() {
        return this.previewSizeMode;
    }

    public C77H getSessionManager(Context context) {
        return AnonymousClass774.A00;
    }

    public C6PQ<?> getStateDefinition() {
        return this.stateDefinition;
    }

    public void onCompositionError(Context context, C6PP c6pp, int i, Throwable th) throws Throwable {
        if (this.errorUiLayout == 0) {
            throw th;
        }
        AppWidgetManager.getInstance(context).updateAppWidget(i, new RemoteViews(context.getPackageName(), this.errorUiLayout));
    }

    public final Object triggerAction$glance_appwidget(Context context, int i, String str, Bundle bundle, HtJ<? super Unit> htJ) {
        return C3cG.A0U(getOrCreateAppWidgetSession$glance_appwidget(context, new C6vW(i), bundle, new GlanceAppWidget$triggerAction$2(str, null), htJ));
    }

    public final Object update(Context context, C6PP c6pp, HtJ<? super Unit> htJ) {
        int i;
        if (!(c6pp instanceof C6vW) || (i = ((C6vW) c6pp).A00) < -1) {
            throw C60O.A0i("Invalid Glance ID");
        }
        Object objUpdate$glance_appwidget = update$glance_appwidget(context, i, null, htJ);
        return objUpdate$glance_appwidget != EnumC10460Hji.A02 ? Unit.INSTANCE : objUpdate$glance_appwidget;
    }

    public final Object update$glance_appwidget(Context context, int i, Bundle bundle, HtJ<? super Unit> htJ) {
        if (AnonymousClass771.A00.get()) {
            Trace.beginAsyncSection("GlanceAppWidget::update", 0);
        }
        return C3cG.A0U(getOrCreateAppWidgetSession$glance_appwidget(context, new C6vW(i), bundle, new C07218ia(0, null), htJ));
    }

    public Object onDelete(Context context, C6PP c6pp, HtJ<? super Unit> htJ) {
        return Unit.INSTANCE;
    }

    public Object providePreview(Context context, int i, HtJ<? super Unit> htJ) {
        return Unit.INSTANCE;
    }

    public GlanceAppWidget(int i) {
        this.errorUiLayout = i;
        C73B c73b = C73B.A00;
        this.sizeMode = c73b;
        this.previewSizeMode = c73b;
        this.stateDefinition = C6PE.A00;
    }

    public GlanceAppWidget() {
        this(R.layout._name_removed__res_0x7f0d018d);
    }
}
