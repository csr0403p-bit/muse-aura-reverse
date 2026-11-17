package com.facebook.aura.nodes.datasource;

import X.AbstractC4103Cmd;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C3UX;
import X.G0U;
import X.HtJ;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class BroadcastReceiverHost implements TriggerHost {
    public final List<String> actions;
    public final Context context;
    public final G0U<HtJ<? super Unit>, Object> onReceive;
    public volatile BroadcastReceiver receiver;
    public final C3UX scope;

    @Override // com.facebook.aura.nodes.datasource.TriggerHost
    public void start() {
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.facebook.aura.nodes.datasource.BroadcastReceiverHost$start$rcv$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                BroadcastReceiverHost broadcastReceiverHost = this.this$0;
                AnonymousClass001.A1J(new BroadcastReceiverHost$start$rcv$1$onReceive$1(broadcastReceiverHost, null), broadcastReceiverHost.scope);
            }
        };
        this.receiver = broadcastReceiver;
        IntentFilter intentFilter = new IntentFilter();
        Iterator<String> it = this.actions.iterator();
        while (it.hasNext()) {
            intentFilter.addAction(AnonymousClass005.A0j(it));
        }
        AbstractC4103Cmd.A04(broadcastReceiver, this.context, intentFilter, 4);
    }

    @Override // com.facebook.aura.nodes.datasource.TriggerHost
    public void stop() {
        BroadcastReceiver broadcastReceiver = this.receiver;
        if (broadcastReceiver != null) {
            try {
                this.context.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException unused) {
            }
        }
        this.receiver = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BroadcastReceiverHost(Context context, C3UX c3ux, List<String> list, G0U<? super HtJ<? super Unit>, ? extends Object> g0u) {
        AnonymousClass005.A14(context, c3ux, list, g0u);
        this.context = context;
        this.scope = c3ux;
        this.actions = list;
        this.onReceive = g0u;
    }
}
