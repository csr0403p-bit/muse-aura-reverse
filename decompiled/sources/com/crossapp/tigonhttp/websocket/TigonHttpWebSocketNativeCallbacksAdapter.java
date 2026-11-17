package com.crossapp.tigonhttp.websocket;

import X.AbstractC10395HbC;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C7384Etj;
import X.RunnableC10392Hb9;
import X.RunnableC10393HbA;
import X.RunnableC10394HbB;
import X.RunnableC10396HbD;
import X.RunnableC10397HbE;
import X.RunnableC10398HbF;
import X.RunnableC10399HbG;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes6.dex */
public final class TigonHttpWebSocketNativeCallbacksAdapter {
    public final AbstractC10395HbC callbacks;
    public final Executor executor;

    public final void onBinaryMessageNative(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        dispatch(new RunnableC10394HbB(this, bArr));
    }

    public final void onClosedNative(int i, String str) {
        C7384Etj.A0Y(str, 1);
        dispatch(new RunnableC10396HbD(this, str, i));
    }

    public final void onClosingNative(int i, String str) {
        C7384Etj.A0Y(str, 1);
        dispatch(new RunnableC10397HbE(this, str, i));
    }

    public final void onFailureNative(String str, boolean z, int i, String[] strArr, String[] strArr2, String str2, String str3) {
        AnonymousClass005.A16(str, strArr, strArr2, str2, 0);
        C7384Etj.A0Y(str3, 6);
        dispatch(new RunnableC10392Hb9(this, str, str3, strArr, strArr2, i, z));
    }

    public final void onOpenNative(int i, String[] strArr, String[] strArr2, String str, String str2) {
        AnonymousClass005.A11(strArr, strArr2, str, 1);
        C7384Etj.A0Y(str2, 4);
        dispatch(new RunnableC10393HbA(this, str2, strArr, strArr2, i));
    }

    public final void onTextMessageNative(String str) {
        C7384Etj.A0Y(str, 0);
        dispatch(new RunnableC10398HbF(this, str));
    }

    private final void dispatch(Runnable runnable) {
        try {
            this.executor.execute(runnable);
        } catch (RejectedExecutionException unused) {
        }
    }

    public final void onLowWaterNative(long j) {
        dispatch(new RunnableC10399HbG(this));
    }

    public TigonHttpWebSocketNativeCallbacksAdapter(AbstractC10395HbC abstractC10395HbC, Executor executor) {
        AnonymousClass003.A0u(abstractC10395HbC, executor);
        this.callbacks = abstractC10395HbC;
        this.executor = executor;
    }
}
