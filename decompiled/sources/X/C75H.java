package X;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.glance.appwidget.GlanceRemoteViewsService;
import java.util.Map;

/* renamed from: X.75H, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C75H {
    public static final void A00(RemoteViews remoteViews, C75B c75b, C75P c75p, String str, int i) {
        if (Build.VERSION.SDK_INT > 31) {
            C75G.A00.A00(remoteViews, c75b, i);
            return;
        }
        Context context = c75p.A06;
        int i2 = c75p.A00;
        Intent intentPutExtra = new Intent().setComponent(c75p.A07.A02).putExtra("appWidgetId", i2).putExtra("androidx.glance.widget.extra.view_id", i).putExtra("androidx.glance.widget.extra.size_info", str);
        intentPutExtra.setData(Uri.parse(intentPutExtra.toUri(1)));
        if (context.getPackageManager().resolveService(intentPutExtra, 0) == null) {
            StringBuilder sbA0w = C60O.A0w();
            sbA0w.append(intentPutExtra.getComponent());
            throw C3cG.A0Q(AnonymousClass001.A0v(" could not be resolved, check the app manifest.", sbA0w));
        }
        remoteViews.setRemoteAdapter(i, intentPutExtra);
        C75D c75d = GlanceRemoteViewsService.A00;
        synchronized (c75d) {
            Map<String, C75B> map = c75d.A00;
            StringBuilder sbA0w2 = C60O.A0w();
            sbA0w2.append(i2);
            sbA0w2.append('-');
            sbA0w2.append(i);
            sbA0w2.append('-');
            map.put(AnonymousClass001.A0v(str, sbA0w2), c75b);
        }
        AppWidgetManager.getInstance(context).notifyAppWidgetViewDataChanged(i2, i);
    }
}
