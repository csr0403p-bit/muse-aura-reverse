package X;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import androidx.datastore.preferences.core.Preferences;
import androidx.glance.appwidget.AppWidgetSession;
import androidx.glance.appwidget.GlanceAppWidgetManager;
import androidx.glance.session.SessionWorker;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.8i4, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C8i4 implements Ht9, Function0 {
    public final int $t;
    public final Object A00;

    public C8i4(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws PendingIntent.CanceledException {
        C6JO<Preferences> value;
        switch (this.$t) {
            case 0:
                C7dh.A00(((RemoteAction) this.A00).getActionIntent());
                break;
            case 1:
                ((AppWidgetSession) this.A00).A01.getValue();
                break;
            case 2:
                GlanceAppWidgetManager glanceAppWidgetManager = (GlanceAppWidgetManager) this.A00;
                synchronized (GlanceAppWidgetManager.A05) {
                    value = GlanceAppWidgetManager.A03;
                    if (value == null) {
                        Context context = glanceAppWidgetManager.A01;
                        File fileA00 = C6PJ.A00(context, "GlanceAppWidgetManager");
                        if (fileA00.exists()) {
                            fileA00.delete();
                        }
                        value = GlanceAppWidgetManager.A06.getValue(context, C6PK.A00[0]);
                        GlanceAppWidgetManager.A03 = value;
                    }
                }
                return value;
            case 3:
                C78M c78m = (C78M) this.A00;
                long jA05 = C3cG.A05(c78m.A05.invoke());
                BO7 bo7 = new BO7();
                BO7 bo72 = new BO7();
                synchronized (c78m.A04) {
                    bo7.element = jA05 - c78m.A01;
                    bo72.element = 1000000000 / c78m.A00;
                }
                AnonymousClass001.A1J(new C07288ih(c78m, null, bo7, bo72, jA05), c78m.A06);
                break;
            default:
                SessionWorker sessionWorker = (SessionWorker) this.A00;
                C9250GBd c9250GBd = new C9250GBd(null);
                sessionWorker.A00 = c9250GBd;
                return c9250GBd;
        }
        return Unit.INSTANCE;
    }
}
