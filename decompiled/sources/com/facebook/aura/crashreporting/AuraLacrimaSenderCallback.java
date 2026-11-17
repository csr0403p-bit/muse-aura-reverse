package com.facebook.aura.crashreporting;

import X.C06H;
import X.C3286C9d;
import X.C7384Etj;
import X.C9N;
import X.CFK;
import X.FGI;
import java.io.File;

/* loaded from: classes5.dex */
public final class AuraLacrimaSenderCallback implements C9N<C3286C9d> {
    public static final Companion Companion = new Companion();
    public static final String TAG = "AuraLacrimaSenderCallback";

    public /* bridge */ /* synthetic */ void onFlytrapRequest(int i, String str, File file, Boolean bool) {
    }

    public void onFlytrapRequestException(Exception exc, int i, String str, File file, boolean z) {
        C7384Etj.A0Y(exc, 0);
        CFK.A08(TAG, FGI.A0W("onFlytrapRequestException: attempt=", ", clientId=", str, i), exc);
    }

    public void onResponse(C3286C9d c3286C9d) {
        C7384Etj.A0Y(c3286C9d, 0);
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public void onSend(boolean z, String str) {
    }

    public /* bridge */ /* synthetic */ void onFlytrapRequestSuccess(String str, int i, String str2, File file, Boolean bool) {
    }

    @Override // X.C9N
    public /* bridge */ /* synthetic */ void onFlytrapRequestException(Exception exc, int i, String str, File file, Boolean bool) {
        onFlytrapRequestException(exc, i, str, file, bool.booleanValue());
    }

    public /* bridge */ /* synthetic */ void onResponse(Object obj) {
        C7384Etj.A0Y(obj, 0);
    }

    public void onFlytrapRequest(int i, String str, File file, boolean z) {
    }

    public void onFlytrapRequestSuccess(String str, int i, String str2, File file, boolean z) {
    }
}
