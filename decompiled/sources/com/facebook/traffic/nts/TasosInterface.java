package com.facebook.traffic.nts;

import com.facebook.traffic.nts.appnetsessionid.AppNetSessionIdManager;
import com.facebook.traffic.nts.tasos.bwemanager.BWEManagerV2;
import com.facebook.traffic.nts.tasos.congestionmanager.CongestionManager;
import com.facebook.traffic.nts.tasos.dccmanager.TasosDccManager;
import com.facebook.traffic.nts.tasos.http_layer_bwe.HttpLayerBwe;
import com.facebook.traffic.nts.tasos.tasosnetworkinfo.TasosNetworkInfo;

/* loaded from: classes6.dex */
public interface TasosInterface {
    public static final Companion Companion = Companion.$$INSTANCE;

    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static volatile TasosInterface _instance;

        public final TasosInterface getInstance() {
            return _instance;
        }

        public final void setInstance(TasosInterface tasosInterface) {
            if (_instance != null || tasosInterface == null) {
                return;
            }
            _instance = tasosInterface;
        }
    }

    AppNetSessionIdManager getAppNetSessionIdManager();

    BWEManagerV2 getBWEManager();

    CongestionManager getCongestionManager();

    HttpLayerBwe getHttpLayerBwe();

    TasosDccManager getTasosDccManager();

    TasosNetworkInfo getTasosNetworkInfo();
}
