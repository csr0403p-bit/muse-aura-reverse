package com.facebook.aura.nodes.datasource;

import X.AbstractC3358CGz;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06H;
import X.C3UX;
import X.C3cG;
import X.CFK;
import X.FGI;
import X.G0U;
import android.content.Context;
import com.facebook.aura.nodes.core.NodeHitlGate;
import com.facebook.aura.nodes.datasource.ProactiveConnectionGate;
import com.facebook.aura.nodes.datasource.ProactiveTrigger;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchProactiveTriggerManager {
    public final CopyOnWriteArrayList<TriggerHost> activeHosts;
    public final Function0<String> clientId;
    public final ProactiveConnectionGate connectionGate;
    public final Context context;
    public final NodeHitlGate hitlGate;
    public final C3UX scope;
    public final DataSourcePublishSink sink;
    public final AbstractC3358CGz userSession;

    private final TriggerHost createHost(DataSource dataSource, G0U<? super String, Boolean> g0u) {
        HatchProactiveTriggerManager$createHost$onFire$1 hatchProactiveTriggerManager$createHost$onFire$1 = new HatchProactiveTriggerManager$createHost$onFire$1(g0u, dataSource, this, null);
        ProactiveTrigger proactiveTrigger = dataSource.getProactiveTrigger();
        if (proactiveTrigger instanceof ProactiveTrigger.ContentObserver) {
            ProactiveTrigger.ContentObserver contentObserver = (ProactiveTrigger.ContentObserver) proactiveTrigger;
            return new ContentObserverHost(this.context, this.scope, contentObserver.uri, contentObserver.notifyForDescendants, contentObserver.debounceMs, hatchProactiveTriggerManager$createHost$onFire$1);
        }
        if (proactiveTrigger instanceof ProactiveTrigger.BroadcastReceiver) {
            return new BroadcastReceiverHost(this.context, this.scope, ((ProactiveTrigger.BroadcastReceiver) proactiveTrigger).actions, hatchProactiveTriggerManager$createHost$onFire$1);
        }
        if ((proactiveTrigger instanceof ProactiveTrigger.NotificationListener) || (proactiveTrigger instanceof ProactiveTrigger.Periodic) || (proactiveTrigger instanceof ProactiveTrigger.CallerDriven) || (proactiveTrigger instanceof ProactiveTrigger.None)) {
            return null;
        }
        throw C3cG.A0q();
    }

    public /* synthetic */ HatchProactiveTriggerManager(Context context, C3UX c3ux, DataSourcePublishSink dataSourcePublishSink, Function0 function0, AbstractC3358CGz abstractC3358CGz, NodeHitlGate nodeHitlGate, ProactiveConnectionGate proactiveConnectionGate, int i, C06H c06h) {
        this(context, c3ux, dataSourcePublishSink, function0, abstractC3358CGz, (i & 32) != 0 ? NodeHitlGate.AllowAll.INSTANCE : nodeHitlGate, (i & 64) != 0 ? ProactiveConnectionGate.Companion.AlwaysReady : proactiveConnectionGate);
    }

    public final void start(Collection<? extends DataSource> collection, G0U<? super String, Boolean> g0u) {
        AnonymousClass003.A0u(collection, g0u);
        stop();
        for (DataSource dataSource : collection) {
            TriggerHost triggerHostCreateHost = createHost(dataSource, g0u);
            if (triggerHostCreateHost != null) {
                try {
                    triggerHostCreateHost.start();
                    this.activeHosts.add(triggerHostCreateHost);
                    String sourceId = dataSource.getSourceId();
                    ProactiveTrigger proactiveTrigger = dataSource.getProactiveTrigger();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Trigger started for source=");
                    sb.append(sourceId);
                    sb.append(" trigger=");
                    sb.append(proactiveTrigger);
                    CFK.A05(HatchProactiveTriggerManagerKt.TAG, sb.toString());
                } catch (SecurityException unused) {
                    dataSource.getSourceId();
                } catch (Exception e) {
                    CFK.A08(HatchProactiveTriggerManagerKt.TAG, FGI.A0d("Failed to start trigger for source=", dataSource.getSourceId(), ": ", e.getMessage()), e);
                }
            }
        }
    }

    public final void stop() {
        Iterator<TriggerHost> it = this.activeHosts.iterator();
        while (it.hasNext()) {
            try {
                it.next().stop();
            } catch (Exception e) {
                CFK.A06(HatchProactiveTriggerManagerKt.TAG, FGI.A0M("Trigger stop failed: ", e.getMessage()));
            }
        }
        this.activeHosts.clear();
    }

    public HatchProactiveTriggerManager(Context context, C3UX c3ux, DataSourcePublishSink dataSourcePublishSink, Function0<String> function0, AbstractC3358CGz abstractC3358CGz, NodeHitlGate nodeHitlGate, ProactiveConnectionGate proactiveConnectionGate) {
        AnonymousClass005.A17(context, c3ux, dataSourcePublishSink, function0, abstractC3358CGz);
        AnonymousClass003.A0z(nodeHitlGate, proactiveConnectionGate);
        this.context = context;
        this.scope = c3ux;
        this.sink = dataSourcePublishSink;
        this.clientId = function0;
        this.userSession = abstractC3358CGz;
        this.hitlGate = nodeHitlGate;
        this.connectionGate = proactiveConnectionGate;
        this.activeHosts = new CopyOnWriteArrayList<>();
    }
}
