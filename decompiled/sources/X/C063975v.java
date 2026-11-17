package X;

import android.content.ComponentName;
import android.content.Context;
import androidx.glance.appwidget.GlanceRemoteViewsService;
import androidx.glance.appwidget.action.ActionCallbackBroadcastReceiver;
import androidx.glance.appwidget.action.ActionTrampolineActivity;
import androidx.glance.appwidget.action.InvisibleActionTrampolineActivity;

/* renamed from: X.75v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C063975v {
    public final ComponentName A00;
    public final ComponentName A01;
    public final ComponentName A02;
    public final ComponentName A03;

    public static final C063975v A00(Context context) {
        return new C063975v(new ComponentName(context, (Class<?>) ActionTrampolineActivity.class), new ComponentName(context, (Class<?>) InvisibleActionTrampolineActivity.class), new ComponentName(context, (Class<?>) ActionCallbackBroadcastReceiver.class), new ComponentName(context, (Class<?>) GlanceRemoteViewsService.class));
    }

    public C063975v(ComponentName componentName, ComponentName componentName2, ComponentName componentName3, ComponentName componentName4) {
        this.A00 = componentName;
        this.A01 = componentName2;
        this.A03 = componentName3;
        this.A02 = componentName4;
    }
}
