package com.facebook.aura.widgets;

import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.CFK;
import X.FGI;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import com.facebook.aura.common.appcontext.AuraAppContext;
import com.facebook.aura.lifecycle.AppBackgroundedListener;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class AgentWidgetBackgroundedListener implements AppBackgroundedListener {
    public static final int $stable = 0;
    public static final AgentWidgetBackgroundedListener INSTANCE = new AgentWidgetBackgroundedListener();

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isPinned(Context context, AgentWidget agentWidget) {
        if (WidgetsGate.INSTANCE.isComponentEnabled(context, agentWidget.getReceiver())) {
            int[] appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, agentWidget.getReceiver()));
            C7384Etj.A0U(appWidgetIds);
            if (appWidgetIds.length != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.aura.lifecycle.AppBackgroundedListener
    public void onAppBackgrounded() {
        final Context context = AuraAppContext.INSTANCE.getContext();
        if (context != null) {
            C60O.A1D().execute(new Runnable() { // from class: com.facebook.aura.widgets.AgentWidgetBackgroundedListener.onAppBackgrounded.1
                @Override // java.lang.Runnable
                public final void run() {
                    List<HomeScreenWidget> list = HomeScreenWidgetKt.homeScreenWidgets;
                    ArrayList<AgentWidget> arrayListA0h = C3cG.A0h();
                    for (HomeScreenWidget homeScreenWidget : list) {
                        if (homeScreenWidget instanceof AgentWidget) {
                            arrayListA0h.add(homeScreenWidget);
                        }
                    }
                    Context context2 = context;
                    for (AgentWidget agentWidget : arrayListA0h) {
                        try {
                            if (AgentWidgetBackgroundedListener.INSTANCE.isPinned(context2, agentWidget)) {
                                AgentWidgetRefreshWorker.Companion.enqueue$fbandroid_express_aura_java_com_facebook_aura_widgets_widgets(context2, agentWidget);
                            }
                        } catch (Exception e) {
                            CFK.A08(AgentWidgetBackgroundedListenerKt.TAG, FGI.A0U("Failed to enqueue ", agentWidget.getKey(), " refresh"), e);
                        }
                    }
                }
            });
        }
    }
}
