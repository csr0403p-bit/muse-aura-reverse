package com.facebook.aura.vmbrowser.runtime;

/* loaded from: classes2.dex */
public abstract class BrowserSessionControllerKt {
    public static final String ERROR_INVALID_STATE = "invalid_state";
    public static final int HTTP_CONFLICT = 409;
    public static final long[] RELOAD_BACKOFF_MS = {500, 1000, 2000, 5000, 10000};
    public static final String TAG = "BrowserSessionController";
    public static final int VNC_OUTBOUND_QUEUE_CAPACITY = 64;
    public static final String VNC_PAGE_URL = "file:///android_asset/vmvnc/vnc.html";
    public static final String WEBSOCKIFY_MODE_ATTACH = "attach";
    public static final String WEBSOCKIFY_MODE_PARAM = "mode";
}
