package com.crossapp.tigonhttp.websocket;

import X.AbstractC10395HbC;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BV4;
import X.C60Q;
import X.C7384Etj;
import X.DCW;
import X.ESl;
import X.ESo;
import X.ETi;
import X.HxE;
import com.crossapp.tigonhttp.TigonHttpClient$TigonHttpClientServiceHolder;
import com.facebook.jni.HybridData;
import com.facebook.tigon.iface.TigonServiceHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class TigonHttpWebSocketClient {
    public static final ESo Companion = new ESo();
    public final DCW tigonHttpClient;

    public TigonHttpWebSocketClient(DCW dcw) {
        C7384Etj.A0Y(dcw, 0);
        this.tigonHttpClient = dcw;
    }

    public static final native HybridData newWebSocketNative(TigonServiceHolder tigonServiceHolder, String str, String[] strArr, String[] strArr2, String[] strArr3, int i, int i2, long j, TigonHttpWebSocketNativeCallbacksAdapter tigonHttpWebSocketNativeCallbacksAdapter);

    public final TigonHttpWebSocket newWebSocket(ESl eSl, AbstractC10395HbC abstractC10395HbC, Executor executor) {
        AnonymousClass005.A0x(eSl, abstractC10395HbC, executor);
        TigonHttpWebSocketNativeCallbacksAdapter tigonHttpWebSocketNativeCallbacksAdapter = new TigonHttpWebSocketNativeCallbacksAdapter(abstractC10395HbC, executor);
        TigonHttpWebSocket tigonHttpWebSocket = TigonHttpWebSocket.$redex_init_class;
        TigonHttpClient$TigonHttpClientServiceHolder tigonHttpClient$TigonHttpClientServiceHolder = this.tigonHttpClient.A00;
        String str = eSl.A01;
        List<HxE<String, String>> list = eSl.A02;
        ArrayList arrayListA0m = AnonymousClass002.A0m(list);
        Iterator<HxE<String, String>> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0m.add(C60Q.A10(it).first);
        }
        String[] strArrA1b = BV4.A1b(arrayListA0m);
        ArrayList arrayListA0m2 = AnonymousClass002.A0m(list);
        Iterator<HxE<String, String>> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayListA0m2.add(C60Q.A10(it2).second);
        }
        return new TigonHttpWebSocket(newWebSocketNative(tigonHttpClient$TigonHttpClientServiceHolder, str, strArrA1b, BV4.A1b(arrayListA0m2), BV4.A1b(eSl.A03), eSl.A00, 0, 16777216L, tigonHttpWebSocketNativeCallbacksAdapter));
    }

    static {
        ETi.loadLibrary("tigonhttpwebsocket-jni");
    }
}
