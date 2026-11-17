package com.facebook.payments.dcp.xapp.model;

import X.Hzd;
import com.facebook.aura.model.ReplyAttributionSerializer;

/* loaded from: classes6.dex */
public class IapNativeErrorAsThrowable extends RuntimeException {
    public final Hzd iapNativeError;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractMap, java.util.TreeMap] */
    public IapNativeErrorAsThrowable(Hzd hzd) {
        String string;
        Object obj = hzd.A05().get(ReplyAttributionSerializer.TYPE_MESSAGE);
        super((obj == null || (string = obj.toString()) == null) ? "" : string);
        this.iapNativeError = hzd;
    }
}
