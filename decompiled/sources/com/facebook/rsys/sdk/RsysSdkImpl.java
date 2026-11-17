package com.facebook.rsys.sdk;

import X.AbstractC7607F5u;
import X.AnonymousClass002;
import X.BV4;
import X.C3cG;
import X.C7384Etj;
import X.C8197FYo;
import X.C8472Feb;
import X.C9605GRm;
import X.C9628GUq;
import X.ETi;
import X.F0C;
import X.FZP;
import X.G0U;
import X.G56;
import X.GR9;
import X.GSS;
import X.GTw;
import X.GTy;
import X.GUU;
import X.GUl;
import X.GV5;
import X.GVX;
import X.GVk;
import X.HxE;
import android.content.Context;
import com.facebook.msys.mci.RedactedString;
import com.facebook.rsys.appinfo.gen.AppInfo;
import com.facebook.rsys.callintent.gen.CallIntent;
import com.facebook.rsys.callintent.gen.CallIntentFactory;
import com.facebook.rsys.callmanager.callclient.gen.CallManager;
import com.facebook.rsys.callmanager.callintentcommon.gen.InitCallConfig;
import com.facebook.rsys.callmanager.gen.Call;
import com.facebook.rsys.callmanager.gen.CallApi;
import com.facebook.rsys.callmanager.gen.CallManagerClient;
import com.facebook.rsys.callmanager.gen.UserContext;
import com.facebook.rsys.crypto.gen.CryptoContextHolder;
import com.facebook.rsys.environmentvariables.gen.EnvironmentVariablesProxy;
import com.facebook.rsys.execution.gen.TaskExecutor;
import com.facebook.rsys.filelogging.gen.LargeLogUploadProxy;
import com.facebook.rsys.log.gen.LogPersistenceProxy;
import com.facebook.rsys.logringbuffer.gen.LogRingBufferProxy;
import com.facebook.rsys.odin.gen.LiteInferenceEngineHolder;
import com.facebook.rsys.overlayconfigmanager.OverlayConfigManagerHolder;
import com.facebook.rsys.perf.holders.gen.PerfLoggerHolder;
import com.facebook.xanalytics.XAnalyticsHolder;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes6.dex */
public final class RsysSdkImpl implements GVk {
    public final Context A00;
    public final GSS A01;
    public final CallManagerClient A02;
    public final EnvironmentVariablesProxy A03;
    public final TaskExecutor A04;
    public final TaskExecutor A05;
    public final C9605GRm A06;
    public final Integer A07;
    public final Map<String, GR9> A08;
    public final Map<HxE<String, String>, GVX> A09;
    public final CopyOnWriteArraySet A0A;
    public final F0C<CallIntentFactory> A0B;
    public final F0C<CallManager> A0C;
    public final F0C A0D;
    public final F0C A0E;
    public final G0U<Call, G56> A0F;
    public final G0U<Call, CallApi> A0G;
    public final boolean A0H;

    public RsysSdkImpl(Context context, GSS gss, CallManagerClient callManagerClient, TaskExecutor taskExecutor, TaskExecutor taskExecutor2, Integer num, G0U g0u, G0U g0u2, G0U g0u3, boolean z) {
        AnonymousClass002.A1B(taskExecutor, 2, taskExecutor2);
        C7384Etj.A0Y(num, 7);
        this.A00 = context;
        this.A02 = callManagerClient;
        this.A05 = taskExecutor;
        this.A04 = taskExecutor2;
        this.A01 = gss;
        this.A0H = z;
        this.A07 = num;
        this.A0F = g0u2;
        this.A0G = g0u3;
        this.A08 = Collections.synchronizedMap(C3cG.A0j());
        this.A09 = Collections.synchronizedMap(C3cG.A0j());
        this.A0A = new CopyOnWriteArraySet();
        this.A0C = AbstractC7607F5u.A1A(null, new C8197FYo(30, this, g0u));
        this.A03 = ((GUl) callManagerClient).A00.A02;
        this.A06 = new C9605GRm(this);
        this.A0E = AbstractC7607F5u.A1A(null, C8472Feb.A00(41));
        this.A0B = FZP.A02(this, 7);
        this.A0D = FZP.A02(this, 8);
        ETi.loadLibrary("simplejni");
    }

    public static final SettableFuture A00(GTy gTy, GVX gvx, RsysSdkImpl rsysSdkImpl) {
        CallIntent callIntent = gTy.A02;
        C7384Etj.A0T(callIntent.callContext.selfId);
        A01(gvx, rsysSdkImpl);
        SettableFuture settableFuture = new SettableFuture();
        boolean z = gTy.A05;
        rsysSdkImpl.A0C.getValue().initCall(new InitCallConfig(gTy.A01, callIntent, BV4.A0t(gTy.A04), z), new GTw(gTy, rsysSdkImpl, settableFuture));
        return settableFuture;
    }

    public static final void A01(GVX gvx, RsysSdkImpl rsysSdkImpl) {
        RedactedString redactedString;
        GV5 gv5 = gvx.A01;
        synchronized (gvx) {
            if (!gvx.A00) {
                CallManager value = rsysSdkImpl.A0C.getValue();
                String str = gv5.A03;
                String str2 = gv5.A02;
                if (str2 != null) {
                    redactedString = new RedactedString();
                    redactedString.mNativeHolder = RedactedString.initNativeHolder(str2);
                } else {
                    redactedString = null;
                }
                AppInfo appInfo = gv5.A00;
                GUU guu = gv5.A01;
                CryptoContextHolder cryptoContextHolder = (CryptoContextHolder) guu.A00.getValue();
                LogPersistenceProxy logPersistenceProxy = (LogPersistenceProxy) guu.A03.getValue();
                LargeLogUploadProxy largeLogUploadProxy = (LargeLogUploadProxy) guu.A01.getValue();
                C9628GUq c9628GUq = guu.A08;
                OverlayConfigManagerHolder overlayConfigManagerHolder = (OverlayConfigManagerHolder) guu.A06.getValue();
                XAnalyticsHolder xAnalyticsHolder = c9628GUq.A03;
                PerfLoggerHolder perfLogger = ((CallIntentFactory) C7384Etj.A0G(rsysSdkImpl.A0B)).getPerfLogger(str, appInfo.appId);
                guu.A05.getValue();
                value.registerUser(new UserContext(str, redactedString, appInfo, cryptoContextHolder, null, logPersistenceProxy, largeLogUploadProxy, null, overlayConfigManagerHolder, null, null, xAnalyticsHolder, perfLogger, null, (LogRingBufferProxy) guu.A04.getValue(), (LiteInferenceEngineHolder) guu.A02.getValue()), null);
                gvx.A00 = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    @Override // X.GVk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Ahm(java.lang.String r6, java.lang.String r7, X.HtJ<? super kotlin.Unit> r8) throws java.lang.Throwable {
        /*
            r5 = this;
            r4 = 14
            boolean r0 = r8 instanceof X.C8911FtT
            if (r0 == 0) goto L93
            r3 = r8
            X.FtT r3 = (X.C8911FtT) r3
            int r0 = r3.$t
            if (r0 != r4) goto L93
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L93
            int r2 = r2 - r1
            r3.A00 = r2
        L18:
            java.lang.Object r1 = r3.A04
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r3.A00
            r2 = 1
            if (r0 == 0) goto L3d
            if (r0 != r2) goto L99
            java.lang.Object r7 = r3.A02
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r3.A01
            java.lang.String r6 = (java.lang.String) r6
            X.Hwg.A00(r1)
        L2e:
            X.F0C<com.facebook.rsys.callintent.gen.CallIntentFactory> r0 = r5.A0B
            java.lang.Object r1 = X.C7384Etj.A0G(r0)
            com.facebook.rsys.callintent.gen.CallIntentFactory r1 = (com.facebook.rsys.callintent.gen.CallIntentFactory) r1
            r0 = 0
            r1.unregisterUser(r6, r7, r0)
        L3a:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L3c:
            return r4
        L3d:
            X.Hwg.A00(r1)
            java.util.Map<X.HxE<java.lang.String, java.lang.String>, X.GVX> r1 = r5.A09
            X.HxE r0 = X.C3cG.A0r(r6, r7)
            java.lang.Object r1 = r1.remove(r0)
            X.GVX r1 = (X.GVX) r1
            if (r1 == 0) goto L3a
            monitor-enter(r1)
            boolean r0 = r1.A00     // Catch: java.lang.Throwable -> La3
            monitor-exit(r1)
            if (r0 == 0) goto L2e
            r3.A01 = r6
            r3.A02 = r7
            r0 = 0
            r3.A03 = r0
            r3.A00 = r2
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<X.GBG<?>, java.lang.Object> r0 = X.GBG.A01
            X.HtJ r0 = X.C7Bm.A02(r3)
            X.Hji r3 = X.EnumC10460Hji.A04
            X.GBG r2 = new X.GBG
            r2.<init>(r3, r0)
            X.F0C<com.facebook.rsys.callmanager.callclient.gen.CallManager> r0 = r5.A0C
            java.lang.Object r1 = r0.getValue()
            com.facebook.rsys.callmanager.callclient.gen.CallManager r1 = (com.facebook.rsys.callmanager.callclient.gen.CallManager) r1
            X.GVV r0 = new X.GVV
            r0.<init>(r2)
            r1.unregisterUser(r6, r7, r0)
            java.lang.Object r1 = r2.result
            if (r1 != r3) goto L88
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<X.GBG<?>, java.lang.Object> r0 = X.GBG.A01
            boolean r0 = X.AbstractC5217DdT.A00(r2, r3, r4, r0)
            if (r0 != 0) goto L3c
            java.lang.Object r1 = r2.result
        L88:
            X.Hji r0 = X.EnumC10460Hji.A03
            if (r1 == r0) goto L3c
            boolean r0 = r1 instanceof X.C10571Hud
            if (r0 != 0) goto L9e
            if (r1 != r4) goto L2e
            return r4
        L93:
            X.FtT r3 = new X.FtT
            r3.<init>(r5, r8, r4)
            goto L18
        L99:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L9e:
            X.Hud r1 = (X.C10571Hud) r1
            java.lang.Throwable r0 = r1.exception
            throw r0
        La3:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rsys.sdk.RsysSdkImpl.Ahm(java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }
}
