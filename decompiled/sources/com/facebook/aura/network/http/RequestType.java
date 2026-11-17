package com.facebook.aura.network.http;

import X.C3cG;
import X.Ey9;
import com.facebook.tigon.iface.TigonRequest;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class RequestType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ RequestType[] $VALUES;
    public static final RequestType DELETE;
    public static final RequestType GET;
    public static final RequestType PATCH;
    public static final RequestType POST;
    public static final RequestType PUT;

    static {
        RequestType requestType = new RequestType(TigonRequest.GET, 0);
        GET = requestType;
        RequestType requestType2 = new RequestType("POST", 1);
        POST = requestType2;
        RequestType requestType3 = new RequestType("PUT", 2);
        PUT = requestType3;
        RequestType requestType4 = new RequestType("PATCH", 3);
        PATCH = requestType4;
        RequestType requestType5 = new RequestType("DELETE", 4);
        DELETE = requestType5;
        RequestType[] requestTypeArr = {requestType, requestType2, requestType3, requestType4, requestType5};
        $VALUES = requestTypeArr;
        $ENTRIES = C3cG.A0w(requestTypeArr);
    }

    public static Ey9<RequestType> getEntries() {
        return $ENTRIES;
    }

    public static RequestType valueOf(String str) {
        return (RequestType) Enum.valueOf(RequestType.class, str);
    }

    public static RequestType[] values() {
        return (RequestType[]) $VALUES.clone();
    }

    public RequestType(String str, int i) {
    }
}
