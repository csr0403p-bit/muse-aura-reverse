package com.facebook.aura.file.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C10571Hud;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0U;
import X.G0V;
import X.HoC;
import X.HtJ;
import X.Hwg;
import android.os.Handler;
import android.webkit.JavascriptInterface;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.webview.diagnostics.HatchHtmlDiagnostics;
import com.facebook.aura.webview.diagnostics.HatchHtmlErrorCode;
import com.facebook.aura.webview.diagnostics.HatchHtmlSurface;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class AuraHtmlHostBridge {
    public static final int $stable = 8;
    public HoC hostActionJob;
    public final Handler mainHandler;
    public final G0V<AuraHtmlHostCallRequest, HtJ<? super Unit>, Object> onHostCall;
    public final G0V<AuraHtmlHostNavigateRequest, HtJ<? super Unit>, Object> onHostNavigate;
    public final C3UX scope;
    public final G0U<String, Boolean> validateJsInterfaceToken;

    @DebugMetadata(c = "com.facebook.aura.file.view.AuraHtmlHostBridge$dispatchHostCall$1", f = "AuraHtmlHostBridge.kt", l = {93}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.view.AuraHtmlHostBridge$dispatchHostCall$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ AuraHtmlHostCallRequest $request;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AuraHtmlHostCallRequest auraHtmlHostCallRequest, HtJ<? super AnonymousClass1> htJ) {
            super(1, htJ);
            this.$request = auraHtmlHostCallRequest;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return AuraHtmlHostBridge.this.new AnonymousClass1(this.$request, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                G0V<AuraHtmlHostCallRequest, HtJ<? super Unit>, Object> g0v = AuraHtmlHostBridge.this.onHostCall;
                AuraHtmlHostCallRequest auraHtmlHostCallRequest = this.$request;
                this.label = 1;
                if (g0v.invoke(auraHtmlHostCallRequest, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.view.AuraHtmlHostBridge$dispatchHostNavigate$1", f = "AuraHtmlHostBridge.kt", l = {97}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.view.AuraHtmlHostBridge$dispatchHostNavigate$1, reason: invalid class name and case insensitive filesystem */
    public final class C119301 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ AuraHtmlHostNavigateRequest $request;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119301(AuraHtmlHostNavigateRequest auraHtmlHostNavigateRequest, HtJ<? super C119301> htJ) {
            super(1, htJ);
            this.$request = auraHtmlHostNavigateRequest;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return AuraHtmlHostBridge.this.new C119301(this.$request, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                G0V<AuraHtmlHostNavigateRequest, HtJ<? super Unit>, Object> g0v = AuraHtmlHostBridge.this.onHostNavigate;
                AuraHtmlHostNavigateRequest auraHtmlHostNavigateRequest = this.$request;
                this.label = 1;
                if (g0v.invoke(auraHtmlHostNavigateRequest, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return ((C119301) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final void dispatchHostCall(AuraHtmlHostCallRequest auraHtmlHostCallRequest) {
        enqueueHostAction(new AnonymousClass1(auraHtmlHostCallRequest, null));
    }

    private final void dispatchHostNavigate(AuraHtmlHostNavigateRequest auraHtmlHostNavigateRequest) {
        enqueueHostAction(new C119301(auraHtmlHostNavigateRequest, null));
    }

    private final void enqueueHostAction(final G0U<? super HtJ<? super Unit>, ? extends Object> g0u) {
        this.mainHandler.post(new Runnable() { // from class: com.facebook.aura.file.view.AuraHtmlHostBridge.enqueueHostAction.1

            @DebugMetadata(c = "com.facebook.aura.file.view.AuraHtmlHostBridge$enqueueHostAction$1$1", f = "AuraHtmlHostBridge.kt", l = {104, 105}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.file.view.AuraHtmlHostBridge$enqueueHostAction$1$1, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            public final class C01571 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
                public final /* synthetic */ G0U<HtJ<? super Unit>, Object> $action;
                public final /* synthetic */ HoC $previousJob;
                public int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C01571(HoC hoC, G0U<? super HtJ<? super Unit>, ? extends Object> g0u, HtJ<? super C01571> htJ) {
                    super(2, htJ);
                    this.$previousJob = hoC;
                    this.$action = g0u;
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    return new C01571(this.$previousJob, this.$action, htJ);
                }

                @Override // X.AbstractC8884Fsp
                public final Object invokeSuspend(Object obj) {
                    EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                    int i = this.label;
                    if (i == 0) {
                        Hwg.A00(obj);
                        HoC hoC = this.$previousJob;
                        if (hoC != null) {
                            this.label = 1;
                            if (hoC.APQ(this) == enumC10460Hji) {
                                return enumC10460Hji;
                            }
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw AnonymousClass001.A0n();
                            }
                            Hwg.A00(obj);
                            return Unit.INSTANCE;
                        }
                        Hwg.A00(obj);
                    }
                    G0U<HtJ<? super Unit>, Object> g0u = this.$action;
                    this.label = 2;
                    if (g0u.invoke(this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                    return Unit.INSTANCE;
                }

                @Override // X.G0V
                public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                    return ((C01571) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                AuraHtmlHostBridge auraHtmlHostBridge = AuraHtmlHostBridge.this;
                HoC hoC = auraHtmlHostBridge.hostActionJob;
                auraHtmlHostBridge.hostActionJob = AnonymousClass001.A11(new C01571(hoC, g0u, null), auraHtmlHostBridge.scope);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleHatchUrlEvent(String str, String str2) {
        Object objA0s;
        String str3;
        HatchHtmlDiagnostics hatchHtmlDiagnostics;
        HatchHtmlSurface hatchHtmlSurface;
        HatchHtmlErrorCode hatchHtmlErrorCode;
        if (AnonymousClass003.A1X(str, this.validateJsInterfaceToken)) {
            if (str2 != null) {
                try {
                    objA0s = (AuraHtmlHostEvent) HatchJsonKt.HatchJson.A00(str2, AuraHtmlHostEvent$$serializer.INSTANCE);
                } catch (Throwable th) {
                    objA0s = C3cG.A0s(th);
                }
                AuraHtmlHostEvent auraHtmlHostEvent = (AuraHtmlHostEvent) (objA0s instanceof C10571Hud ? null : objA0s);
                if (auraHtmlHostEvent != null) {
                    String str4 = auraHtmlHostEvent.type;
                    if ("hatch:call".equals(str4)) {
                        AuraHtmlHostCallRequest callRequest = AuraHtmlHostBridgeKt.toCallRequest(auraHtmlHostEvent);
                        if (callRequest != null) {
                            dispatchHostCall(callRequest);
                            return;
                        } else {
                            str4 = auraHtmlHostEvent.action;
                            str3 = "action=";
                        }
                    } else if ("hatch:navigate".equals(str4)) {
                        AuraHtmlHostNavigateRequest navigateRequest = AuraHtmlHostBridgeKt.toNavigateRequest(auraHtmlHostEvent);
                        if (navigateRequest != null) {
                            dispatchHostNavigate(navigateRequest);
                            return;
                        } else {
                            str4 = auraHtmlHostEvent.target;
                            str3 = "target=";
                        }
                    } else {
                        str3 = "type=";
                    }
                    reportNotAllowed(FGI.A0M(str3, str4));
                    return;
                }
            }
            hatchHtmlDiagnostics = HatchHtmlDiagnostics.INSTANCE;
            hatchHtmlSurface = HatchHtmlSurface.WORKSPACE_HTML;
            hatchHtmlErrorCode = HatchHtmlErrorCode.BRIDGE_MALFORMED_EVENT;
        } else {
            CFK.A06(AuraHtmlHostBridgeKt.TAG, "Ignoring hatch host event with invalid JS bridge token");
            hatchHtmlDiagnostics = HatchHtmlDiagnostics.INSTANCE;
            hatchHtmlSurface = HatchHtmlSurface.WORKSPACE_HTML;
            hatchHtmlErrorCode = HatchHtmlErrorCode.BRIDGE_TOKEN_INVALID;
        }
        hatchHtmlDiagnostics.logError(hatchHtmlSurface, hatchHtmlErrorCode, null, null, null, null);
    }

    private final void reportNotAllowed(String str) {
        HatchHtmlDiagnostics.INSTANCE.logError(HatchHtmlSurface.WORKSPACE_HTML, HatchHtmlErrorCode.BRIDGE_ACTION_NOT_ALLOWED, str, null, null, null);
    }

    @JavascriptInterface
    public final void postHatchUrlEvent(final String str, final String str2) {
        this.mainHandler.post(new Runnable() { // from class: com.facebook.aura.file.view.AuraHtmlHostBridge.postHatchUrlEvent.1
            @Override // java.lang.Runnable
            public final void run() {
                AuraHtmlHostBridge.this.handleHatchUrlEvent(str, str2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuraHtmlHostBridge(C3UX c3ux, G0U<? super String, Boolean> g0u, G0V<? super AuraHtmlHostCallRequest, ? super HtJ<? super Unit>, ? extends Object> g0v, G0V<? super AuraHtmlHostNavigateRequest, ? super HtJ<? super Unit>, ? extends Object> g0v2) {
        AnonymousClass005.A14(c3ux, g0u, g0v, g0v2);
        this.scope = c3ux;
        this.validateJsInterfaceToken = g0u;
        this.onHostCall = g0v;
        this.onHostNavigate = g0v2;
        this.mainHandler = C60O.A02();
    }
}
