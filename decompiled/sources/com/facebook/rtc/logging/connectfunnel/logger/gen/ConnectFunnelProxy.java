package com.facebook.rtc.logging.connectfunnel.logger.gen;

import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class ConnectFunnelProxy {
    public abstract McfReference createStructuredLoggerPointer();

    public abstract ArrayList<Integer> createSubscribedEvents();

    public abstract String diskCachingCreateDirectory();

    public abstract boolean diskCachingIsEnabled();

    public abstract McfReference getPrivacyContext();

    public abstract void handleFunnelEvent(int i, Map<String, Long> map, Map<String, String> map2);
}
