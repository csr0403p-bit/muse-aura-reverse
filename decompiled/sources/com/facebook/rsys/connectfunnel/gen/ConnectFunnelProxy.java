package com.facebook.rsys.connectfunnel.gen;

import com.facebook.djinni.msys.infra.McfReference;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class ConnectFunnelProxy {
    public abstract void annotateMultiple(String str, Map<Integer, McfReference> map, Map<Integer, String> map2, Map<Integer, Boolean> map3, Map<Integer, Long> map4);

    public abstract void associateCallIds(String str, String str2, boolean z);

    public abstract void markPoint(String str, int i);

    public abstract void start(String str, int i, Map<Integer, McfReference> map);

    public abstract void upload(String str, McfReference mcfReference);
}
