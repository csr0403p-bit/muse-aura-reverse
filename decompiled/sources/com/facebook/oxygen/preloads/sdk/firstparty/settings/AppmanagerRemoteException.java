package com.facebook.oxygen.preloads.sdk.firstparty.settings;

/* loaded from: classes3.dex */
public class AppmanagerRemoteException extends Exception {
    public static final long serialVersionUID = 1;
    public final int reason;

    public AppmanagerRemoteException(int i, String str, Throwable th) {
        super(str, th);
        this.reason = i;
    }

    public AppmanagerRemoteException(String str) {
        super(str);
        this.reason = 2;
    }
}
