package com.facebook.aura.login.nativeflow;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00r;
import X.C1er;
import X.C3UX;
import X.C3cG;
import X.C3cI;
import X.C60R;
import X.C6oR;
import X.C6oT;
import X.C6oc;
import X.C6od;
import X.C6t6;
import X.C6tp;
import X.C7384Etj;
import X.C75I;
import X.C78N;
import X.CFK;
import X.G0U;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.content.Context;
import android.net.Uri;
import android.webkit.CookieManager;
import android.webkit.WebView;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.checkpoint.view.HatchCheckpointWebPageKt;
import com.facebook.aura.identity.datr.AuraDatrDeviceIdentityBridge;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class NativeLoginCheckpointWebScreenKt {
    public static final long PAGE_LOAD_TIMEOUT_MS = 30000;
    public static final String TAG = "NativeLoginCheckpointWebScreen";
    public static final long WEB_DATA_CLEAR_TIMEOUT_MS = 5000;

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginCheckpointWebScreenKt$NativeLoginCheckpointWebScreen$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ G0U<String, Unit> $onCallback;
        public final /* synthetic */ Function0<Unit> $onFailure;
        public final /* synthetic */ String $url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(String str, G0U<? super String, Unit> g0u, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$url = str;
            this.$onCallback = g0u;
            this.$onFailure = function0;
            this.$onBack = function02;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginCheckpointWebScreenKt.NativeLoginCheckpointWebScreen(this.$url, this.$onCallback, this.$onFailure, this.$onBack, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginCheckpointWebScreenKt", f = "NativeLoginCheckpointWebScreen.kt", l = {255, 278}, m = "clearCheckpointWebData", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginCheckpointWebScreenKt$clearCheckpointWebData$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NativeLoginCheckpointWebScreenKt.clearCheckpointWebData(this);
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginCheckpointWebScreenKt$clearCheckpointWebData$2", f = "NativeLoginCheckpointWebScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginCheckpointWebScreenKt$clearCheckpointWebData$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends Unit>>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<Unit>> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
            anonymousClass2.L$0 = c3ux;
            return anonymousClass2.invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objA0s;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            try {
                CookieManager.getInstance().flush();
                objA0s = Unit.INSTANCE;
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            if (HsJ.A00(objA0s) != null) {
                CFK.A06(NativeLoginCheckpointWebScreenKt.TAG, "cookie flush failed");
            }
            return C3cG.A0t(objA0s);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends Unit>> htJ) {
            return invoke2(c3ux, (HtJ<? super HsJ<Unit>>) htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginCheckpointWebScreenKt", f = "NativeLoginCheckpointWebScreen.kt", l = {238}, m = "prepareDeviceIdentity", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginCheckpointWebScreenKt$prepareDeviceIdentity$1, reason: invalid class name and case insensitive filesystem */
    public final class C125221 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NativeLoginCheckpointWebScreenKt.prepareDeviceIdentity(this);
        }

        public C125221(HtJ<? super C125221> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginCheckpointWebScreenKt$prepareDeviceIdentity$2", f = "NativeLoginCheckpointWebScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginCheckpointWebScreenKt$prepareDeviceIdentity$2, reason: invalid class name and case insensitive filesystem */
    public final class C125232 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C125232(HtJ<? super C125232> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C125232(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return new C125232(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            AuraDatrDeviceIdentityBridge.INSTANCE.prepare();
            return Unit.INSTANCE;
        }
    }

    public static final void NativeLoginCheckpointWebScreen(String str, G0U<? super String, Unit> g0u, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        AnonymousClass005.A11(g0u, function0, function02, 1);
        bfm.AgG(-1768898599);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0u);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function02);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Context contextA0H = AnonymousClass002.A0H(bfm);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, objAaT, obj, true);
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = AnonymousClass002.A0O(bfm, 0);
            }
            C00r c00r = (C00r) objAaT2;
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = new AtomicBoolean(false);
                bfm.Ai0(objAaT3);
            }
            AtomicBoolean atomicBoolean = (AtomicBoolean) objAaT3;
            Object objAaT4 = bfm.AaT();
            if (objAaT4 == obj) {
                objAaT4 = new AtomicBoolean(false);
                bfm.Ai0(objAaT4);
            }
            AtomicBoolean atomicBoolean2 = (AtomicBoolean) objAaT4;
            int i4 = iA0d >> 3;
            MutableState mutableStateA00 = C1er.A00(bfm, g0u);
            MutableState mutableStateA002 = C1er.A00(bfm, function0);
            boolean zA65 = bfm.A65(contextA0H);
            Object objAaT5 = bfm.AaT();
            if (zA65 || objAaT5 == obj) {
                objAaT5 = checkpointWebView(contextA0H, new NativeLoginCheckpointWebScreenKt$NativeLoginCheckpointWebScreen$webView$1$1(atomicBoolean, mutableStateA00), new NativeLoginCheckpointWebScreenKt$NativeLoginCheckpointWebScreen$webView$1$2(mutableState, c00r), new NativeLoginCheckpointWebScreenKt$NativeLoginCheckpointWebScreen$webView$1$3(atomicBoolean, mutableStateA002), new NativeLoginCheckpointWebScreenKt$NativeLoginCheckpointWebScreen$webView$1$4(atomicBoolean2));
                bfm.Ai0(objAaT5);
            }
            C6t6 c6t6 = (C6t6) objAaT5;
            boolean zA1W = AnonymousClass002.A1W(bfm, mutableStateA002, AnonymousClass003.A1M(bfm, atomicBoolean, c6t6), AnonymousClass004.A1F(iA0d));
            Object objAaT6 = bfm.AaT();
            if (zA1W || objAaT6 == obj) {
                objAaT6 = new NativeLoginCheckpointWebScreenKt$NativeLoginCheckpointWebScreen$1$1(atomicBoolean, c6t6, str, mutableStateA002, null);
                bfm.Ai0(objAaT6);
            }
            AnonymousClass001.A1A(bfm, objAaT6, c6t6, str);
            Integer numValueOf = Integer.valueOf(c00r.AGd());
            boolean zA1O = AnonymousClass003.A1O(bfm, c6t6, mutableStateA002, bfm.A67(atomicBoolean));
            Object objAaT7 = bfm.AaT();
            if (zA1O || objAaT7 == obj) {
                objAaT7 = new NativeLoginCheckpointWebScreenKt$NativeLoginCheckpointWebScreen$2$1(atomicBoolean, c6t6, mutableState, mutableStateA002, null);
                bfm.Ai0(objAaT7);
            }
            AnonymousClass001.A18(bfm, objAaT7, numValueOf);
            boolean zA0A = MutableState.A0A(mutableState);
            boolean zA67 = bfm.A67(atomicBoolean2);
            Object objAaT8 = bfm.AaT();
            if (zA67 || objAaT8 == obj) {
                objAaT8 = new NativeLoginCheckpointWebScreenKt$NativeLoginCheckpointWebScreen$3$1(atomicBoolean2);
                bfm.Ai0(objAaT8);
            }
            HatchCheckpointWebPageKt.HatchCheckpointWebPage(c6t6, zA0A, function02, bRg2, null, (G0U) objAaT8, bfm, i4 & 8064, 16);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(str, g0u, function0, function02, bRg2, i, i2);
        }
    }

    public static final C6t6 checkpointWebView(Context context, final G0U<? super String, Unit> g0u, G0U<? super Boolean, Unit> g0u2, Function0<Unit> function0, G0U<? super WebView, Unit> g0u3) {
        C6oT c6oT = new C6oT() { // from class: com.facebook.aura.login.nativeflow.NativeLoginCheckpointWebScreenKt$checkpointWebView$callbackLauncher$1
            @Override // X.C6oT
            public final boolean launch(Uri uri, Context context2) {
                String strA0f = C60R.A0f(uri);
                C7384Etj.A0U(strA0f);
                boolean zIsAuraCheckpointCallback = NativeLoginCheckpointContinuationKt.isAuraCheckpointCallback(strA0f);
                G0U<String, Unit> g0u4 = g0u;
                if (zIsAuraCheckpointCallback) {
                    g0u4.invoke(strA0f);
                }
                return zIsAuraCheckpointCallback;
            }
        };
        NativeLoginCheckpointWebScreenKt$checkpointWebView$client$1 nativeLoginCheckpointWebScreenKt$checkpointWebView$client$1 = new NativeLoginCheckpointWebScreenKt$checkpointWebView$client$1(g0u, function0, g0u2, g0u3);
        C6t6 c6t6 = new C6t6(context);
        boolean zA1U = C60R.A1U(c6t6);
        c6t6.getSettings().setDomStorageEnabled(zA1U);
        c6t6.getSettings().setAllowFileAccess(false);
        c6t6.getSettings().setAllowContentAccess(false);
        c6t6.getSettings().setAllowFileAccessFromFileURLs(false);
        c6t6.getSettings().setAllowUniversalAccessFromFileURLs(false);
        c6t6.getSettings().setMixedContentMode(zA1U ? 1 : 0);
        c6t6.getSettings().setUserAgentString(C60R.A0d(c6t6));
        ArrayList arrayListA0h = C3cG.A0h();
        ArrayList arrayListA0h2 = C3cG.A0h();
        C6od c6odA00 = C6tp.A00();
        C7384Etj.A0U(c6odA00);
        arrayListA0h2.add(c6odA00);
        arrayListA0h.add(new C6oT[]{c6oT}[0]);
        c6t6.mUriHandler = new C6oc(new C75I(), new C6oR(), arrayListA0h, arrayListA0h2);
        c6t6.setWebViewClient(nativeLoginCheckpointWebScreenKt$checkpointWebView$client$1);
        return c6t6;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object clearCheckpointWebData(X.HtJ<? super java.lang.Boolean> r9) {
        /*
            boolean r0 = r9 instanceof com.facebook.aura.login.nativeflow.NativeLoginCheckpointWebScreenKt.AnonymousClass1
            if (r0 == 0) goto L6f
            r8 = r9
            com.facebook.aura.login.nativeflow.NativeLoginCheckpointWebScreenKt$clearCheckpointWebData$1 r8 = (com.facebook.aura.login.nativeflow.NativeLoginCheckpointWebScreenKt.AnonymousClass1) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6f
            int r2 = r2 - r1
            r8.label = r2
        L12:
            java.lang.Object r1 = r8.result
            X.Hji r7 = X.EnumC10460Hji.A02
            int r0 = r8.label
            r6 = 0
            java.lang.String r5 = "NativeLoginCheckpointWebScreen"
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L2b
            if (r0 == r3) goto L45
            if (r0 != r4) goto L75
            X.Hwg.A00(r1)
        L26:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        L2b:
            X.Hwg.A00(r1)
            android.webkit.WebStorage r0 = android.webkit.WebStorage.getInstance()     // Catch: java.lang.RuntimeException -> L7a
            r0.deleteAllData()     // Catch: java.lang.RuntimeException -> L7a
            com.facebook.aura.login.nativeflow.NativeLoginCheckpointWebScreenKt$clearCheckpointWebData$cookiesRemoved$1 r2 = new com.facebook.aura.login.nativeflow.NativeLoginCheckpointWebScreenKt$clearCheckpointWebData$cookiesRemoved$1
            r2.<init>(r6)
            r8.label = r3
            r0 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r1 = X.GAX.A01(r8, r2, r0)
            if (r1 != r7) goto L48
            return r7
        L45:
            X.Hwg.A00(r1)
        L48:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L54
            boolean r2 = r1.booleanValue()
        L50:
            if (r2 != 0) goto L5b
            r3 = 0
            goto L26
        L54:
            java.lang.String r0 = "cookie clear timed out"
            X.CFK.A06(r5, r0)
            r2 = 0
            goto L50
        L5b:
            X.78T r1 = X.AnonymousClass001.A0y()
            com.facebook.aura.login.nativeflow.NativeLoginCheckpointWebScreenKt$clearCheckpointWebData$2 r0 = new com.facebook.aura.login.nativeflow.NativeLoginCheckpointWebScreenKt$clearCheckpointWebData$2
            r0.<init>(r6)
            r8.Z$0 = r2
            r8.label = r4
            java.lang.Object r0 = X.GAo.A00(r8, r1, r0)
            if (r0 != r7) goto L26
            return r7
        L6f:
            com.facebook.aura.login.nativeflow.NativeLoginCheckpointWebScreenKt$clearCheckpointWebData$1 r8 = new com.facebook.aura.login.nativeflow.NativeLoginCheckpointWebScreenKt$clearCheckpointWebData$1
            r8.<init>(r9)
            goto L12
        L75:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L7a:
            java.lang.String r0 = "web storage clear failed"
            X.CFK.A06(r5, r0)
            java.lang.Boolean r0 = X.AnonymousClass001.A0h()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginCheckpointWebScreenKt.clearCheckpointWebData(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object prepareDeviceIdentity(X.HtJ<? super java.lang.Boolean> r6) {
        /*
            boolean r0 = r6 instanceof com.facebook.aura.login.nativeflow.NativeLoginCheckpointWebScreenKt.C125221
            if (r0 == 0) goto L1e
            r5 = r6
            com.facebook.aura.login.nativeflow.NativeLoginCheckpointWebScreenKt$prepareDeviceIdentity$1 r5 = (com.facebook.aura.login.nativeflow.NativeLoginCheckpointWebScreenKt.C125221) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L2d
            if (r0 != r3) goto L28
            goto L24
        L1e:
            com.facebook.aura.login.nativeflow.NativeLoginCheckpointWebScreenKt$prepareDeviceIdentity$1 r5 = new com.facebook.aura.login.nativeflow.NativeLoginCheckpointWebScreenKt$prepareDeviceIdentity$1
            r5.<init>(r6)
            goto L12
        L24:
            X.Hwg.A00(r1)     // Catch: java.lang.RuntimeException -> L43 java.util.concurrent.CancellationException -> L50
            goto L4b
        L28:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2d:
            X.Hwg.A00(r1)
            X.78T r2 = X.AnonymousClass001.A0y()     // Catch: java.lang.RuntimeException -> L43 java.util.concurrent.CancellationException -> L50
            r1 = 0
            com.facebook.aura.login.nativeflow.NativeLoginCheckpointWebScreenKt$prepareDeviceIdentity$2 r0 = new com.facebook.aura.login.nativeflow.NativeLoginCheckpointWebScreenKt$prepareDeviceIdentity$2     // Catch: java.lang.RuntimeException -> L43 java.util.concurrent.CancellationException -> L50
            r0.<init>(r1)     // Catch: java.lang.RuntimeException -> L43 java.util.concurrent.CancellationException -> L50
            r5.label = r3     // Catch: java.lang.RuntimeException -> L43 java.util.concurrent.CancellationException -> L50
            java.lang.Object r0 = X.GAo.A00(r5, r2, r0)     // Catch: java.lang.RuntimeException -> L43 java.util.concurrent.CancellationException -> L50
            if (r0 != r4) goto L4b
            return r4
        L43:
            java.lang.String r1 = "NativeLoginCheckpointWebScreen"
            java.lang.String r0 = "device identity prepare failed"
            X.CFK.A06(r1, r0)
            r3 = 0
        L4b:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        L50:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginCheckpointWebScreenKt.prepareDeviceIdentity(X.HtJ):java.lang.Object");
    }

    public static final void releaseCheckpointWebView(WebView webView, AtomicBoolean atomicBoolean) {
        if (C3cI.A1W(atomicBoolean)) {
            webView.stopLoading();
            webView.clearHistory();
            webView.onPause();
            webView.removeAllViews();
            webView.destroy();
        }
    }
}
