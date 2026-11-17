package com.facebook.aura.skills.connect.repository;

import X.AGH;
import X.AIW;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.C06H;
import X.C0924AIa;
import X.C10571Hud;
import X.C2nw;
import X.C3UX;
import X.C3cG;
import X.C3cI;
import X.C60O;
import X.C60Q;
import X.C6tn;
import X.C7384Etj;
import X.C7438Evz;
import X.C7BY;
import X.C7qW;
import X.C9jH;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.G0W;
import X.GAo;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.InterfaceC7549F2g;
import android.net.Uri;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin;
import com.facebook.aura.devices.pairing.HatchDeviceBleManagerKt;
import com.facebook.aura.json.NetworkException;
import com.facebook.aura.network.api.JarvisPath;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.facebook.aura.perf.HatchConnectorQplLogger;
import com.facebook.aura.skills.connect.repository.SkillConnectAction;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class AuraSkillAuthRepository implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final LinkedHashMap<String, String> oauthConnectorIds;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository$fetchConnectAction$2", f = "AuraSkillAuthRepository.kt", l = {413}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository$fetchConnectAction$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super SkillConnectAction>, Object> {
        public final /* synthetic */ String $connectorId;
        public final /* synthetic */ String $sourceSessionId;
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public final /* synthetic */ AuraSkillAuthRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, AuraSkillAuthRepository auraSkillAuthRepository, String str2, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$connectorId = str;
            this.this$0 = auraSkillAuthRepository;
            this.$sourceSessionId = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$connectorId, this.this$0, this.$sourceSessionId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1595executeBodylessJarvisRequestWithp3iPjrY;
            SkillConnectAction domain;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                HatchHttpApi hatchHttpApiA06 = C60O.A06(obj);
                JarvisPath.ConnectorConnectInfo connectorConnectInfo = new JarvisPath.ConnectorConnectInfo(C6tn.A06(this.$connectorId, HatchWebPageParserKt.UTF_8));
                RequestType requestType = RequestType.GET;
                AbstractC3358CGz abstractC3358CGz = this.this$0.userSession;
                String str = this.$sourceSessionId;
                HxE<String, ? extends Object>[] hxEArrA1a = C60O.A1a(str != null ? new HxE[]{C3cG.A0r("session_id", str)} : new HxE[0]);
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                AuraSkillAuthRepository$fetchConnectAction$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 auraSkillAuthRepository$fetchConnectAction$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 = AuraSkillAuthRepository$fetchConnectAction$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.I$0 = 1;
                this.I$1 = 1;
                this.I$2 = 0;
                this.label = 1;
                objM1595executeBodylessJarvisRequestWithp3iPjrY = hatchHttpApiA06.m1595executeBodylessJarvisRequestWithp3iPjrY(auraSkillAuthRepository$fetchConnectAction$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1, false, connectorConnectInfo, requestType, abstractC3358CGz, null, hxEArrA1a, null, setA18, true, c9jHA0E, true, null, false, this);
                if (objM1595executeBodylessJarvisRequestWithp3iPjrY == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1595executeBodylessJarvisRequestWithp3iPjrY = AnonymousClass002.A0j(obj);
            }
            if (objM1595executeBodylessJarvisRequestWithp3iPjrY instanceof C10571Hud) {
                objM1595executeBodylessJarvisRequestWithp3iPjrY = null;
            }
            SkillConnectInfoResponseJson skillConnectInfoResponseJson = (SkillConnectInfoResponseJson) objM1595executeBodylessJarvisRequestWithp3iPjrY;
            if (skillConnectInfoResponseJson == null || (domain = AuraSkillAuthRepositoryJsonKt.toDomain(skillConnectInfoResponseJson)) == null) {
                return null;
            }
            AuraSkillAuthRepository auraSkillAuthRepository = this.this$0;
            String str2 = this.$connectorId;
            if (domain instanceof SkillConnectAction.OAuth) {
                auraSkillAuthRepository.registerOAuthConnector(str2, ((SkillConnectAction.OAuth) domain).url);
            }
            return domain;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super SkillConnectAction> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository$postAuthCallback$2, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C138042 extends C7438Evz implements G0W {
        public C138042(Object obj) {
            super(3, obj, AuraSkillAuthRepository.class, "postForAck", "postForAck-0E7RQCE(Lcom/facebook/aura/network/api/JarvisPath;Lkotlinx/serialization/json/JsonElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
        @Override // X.G0W
        /* renamed from: invoke-0E7RQCE, reason: not valid java name and merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invoke(com.facebook.aura.network.api.JarvisPath r6, kotlinx.serialization.json.JsonElement r7, X.HtJ<? super X.HsJ<com.facebook.aura.skills.connect.repository.OAuthCallbackResponseJson>> r8) {
            /*
                r5 = this;
                boolean r0 = r8 instanceof com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository$postAuthCallback$2$invoke0E7RQCE$1
                if (r0 == 0) goto L3b
                r4 = r8
                com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository$postAuthCallback$2$invoke-0E7RQCE$1 r4 = (com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository$postAuthCallback$2$invoke0E7RQCE$1) r4
                int r2 = r4.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L3b
                int r2 = r2 - r1
                r4.label = r2
            L12:
                java.lang.Object r1 = r4.result
                X.Hji r3 = X.EnumC10460Hji.A02
                int r0 = r4.label
                r2 = 1
                if (r0 == 0) goto L26
                if (r0 != r2) goto L41
                java.lang.Object r0 = X.AnonymousClass001.A0q(r1)
            L21:
                X.HsJ r3 = X.C3cG.A0t(r0)
                return r3
            L26:
                X.Hwg.A00(r1)
                java.lang.Object r1 = r5.receiver
                com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository r1 = (com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository) r1
                r0 = 0
                r4.L$0 = r0
                r4.L$1 = r0
                r4.label = r2
                java.lang.Object r0 = com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository.m2095access$postForAck0E7RQCE(r1, r6, r7, r4)
                if (r0 != r3) goto L21
                return r3
            L3b:
                com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository$postAuthCallback$2$invoke-0E7RQCE$1 r4 = new com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository$postAuthCallback$2$invoke-0E7RQCE$1
                r4.<init>(r5, r8)
                goto L12
            L41:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository.C138042.invoke(com.facebook.aura.network.api.JarvisPath, kotlinx.serialization.json.JsonElement, X.HtJ):java.lang.Object");
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository$postAuthCallback$3", f = "AuraSkillAuthRepository.kt", l = {HatchDeviceBleManagerKt.REQUESTED_MTU}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository$postAuthCallback$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ String $authFlowType;
        public final /* synthetic */ JsonElement $body;
        public final /* synthetic */ String $callbackErrorMessage;
        public final /* synthetic */ String $callbackErrorType;
        public final /* synthetic */ String $callbackFailureReason;
        public final /* synthetic */ HatchComponent $completedComponent;
        public final /* synthetic */ String $connectorId;
        public final /* synthetic */ boolean $endQplOnSuccess;
        public final /* synthetic */ JarvisPath $endpoint;
        public final /* synthetic */ HatchComponent $failedComponent;
        public final /* synthetic */ boolean $markCallbackOnResponse;
        public final /* synthetic */ HatchSkillOAuthOrigin $origin;
        public final /* synthetic */ G0W<JarvisPath, JsonElement, HtJ<? super HsJ<OAuthCallbackResponseJson>>, Object> $request;
        public int label;
        public final /* synthetic */ AuraSkillAuthRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(G0W<? super JarvisPath, ? super JsonElement, ? super HtJ<? super HsJ<OAuthCallbackResponseJson>>, ? extends Object> g0w, JarvisPath jarvisPath, JsonElement jsonElement, AuraSkillAuthRepository auraSkillAuthRepository, String str, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, HatchComponent hatchComponent, String str2, boolean z, String str3, String str4, String str5, HatchComponent hatchComponent2, boolean z2, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$request = g0w;
            this.$endpoint = jarvisPath;
            this.$body = jsonElement;
            this.this$0 = auraSkillAuthRepository;
            this.$connectorId = str;
            this.$origin = hatchSkillOAuthOrigin;
            this.$failedComponent = hatchComponent;
            this.$authFlowType = str2;
            this.$markCallbackOnResponse = z;
            this.$callbackFailureReason = str3;
            this.$callbackErrorType = str4;
            this.$callbackErrorMessage = str5;
            this.$completedComponent = hatchComponent2;
            this.$endQplOnSuccess = z2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass3(this.$request, this.$endpoint, this.$body, this.this$0, this.$connectorId, this.$origin, this.$failedComponent, this.$authFlowType, this.$markCallbackOnResponse, this.$callbackFailureReason, this.$callbackErrorType, this.$callbackErrorMessage, this.$completedComponent, this.$endQplOnSuccess, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            boolean z;
            Integer numA0R;
            Object objInvoke = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            boolean z2 = true;
            boolean z3 = false;
            try {
                if (i == 0) {
                    Hwg.A00(objInvoke);
                    G0W<JarvisPath, JsonElement, HtJ<? super HsJ<OAuthCallbackResponseJson>>, Object> g0w = this.$request;
                    JarvisPath jarvisPath = this.$endpoint;
                    JsonElement jsonElement = this.$body;
                    this.label = 1;
                    objInvoke = g0w.invoke(jarvisPath, jsonElement, this);
                    if (objInvoke == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(objInvoke);
                }
                obj2 = ((HsJ) objInvoke).value;
                Throwable thA00 = HsJ.A00(obj2);
                z = obj2 instanceof C10571Hud;
                if (!z) {
                    numA0R = C3cG.A0R(200);
                } else {
                    NetworkException networkException = thA00 instanceof NetworkException ? (NetworkException) thA00 : null;
                    numA0R = networkException != null ? C3cG.A0R(networkException.httpResponseCode) : null;
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A08(AuraSkillAuthRepositoryKt.TAG, FGI.A0d("POST /", this.$endpoint.getValue(), " failed: ", e2.getMessage()), e2);
                AuraSkillAuthRepository auraSkillAuthRepository = this.this$0;
                String str = this.$connectorId;
                HatchSkillOAuthOrigin hatchSkillOAuthOrigin = this.$origin;
                HatchComponent hatchComponent = this.$failedComponent;
                String str2 = this.$authFlowType;
                String strA0Y = C3cI.A0Y(e2);
                auraSkillAuthRepository.logAuthResult(str, hatchSkillOAuthOrigin, hatchComponent, str2, "network_error", strA0Y);
                HatchConnectorQplLogger.INSTANCE.endAuthFail("network_error", strA0Y, e2.getMessage());
            }
            if (numA0R == null) {
                this.this$0.logAuthResult(this.$connectorId, this.$origin, this.$failedComponent, this.$authFlowType, "network_error", "null_response");
                HatchConnectorQplLogger.INSTANCE.endAuthFail("network_error", "null_response", FGI.A0U("POST /", this.$endpoint.getValue(), " returned null response"));
                return false;
            }
            if (this.$markCallbackOnResponse) {
                HatchConnectorQplLogger.INSTANCE.markAuthCallbackReceived();
            }
            if (z || numA0R.intValue() != 200) {
                AuraSkillAuthRepository auraSkillAuthRepository2 = this.this$0;
                auraSkillAuthRepository2.logAuthResult(this.$connectorId, this.$origin, this.$failedComponent, this.$authFlowType, auraSkillAuthRepository2.failureReasonForHttpError(this.$endpoint), AnonymousClass007.A0a("http_", numA0R));
                HatchConnectorQplLogger.INSTANCE.endAuthFail(this.this$0.failureReasonForHttpError(this.$endpoint), AnonymousClass007.A0a("http_", numA0R), AnonymousClass006.A0y(numA0R, " returned HTTP ", C3cI.A0x("POST /", this.$endpoint.getValue())));
                return false;
            }
            String str3 = this.$callbackFailureReason;
            if (str3 != null) {
                this.this$0.logAuthResult(this.$connectorId, this.$origin, this.$failedComponent, this.$authFlowType, str3, this.$callbackErrorType);
                HatchConnectorQplLogger.INSTANCE.endAuthFail(this.$callbackFailureReason, this.$callbackErrorType, this.$callbackErrorMessage);
            } else {
                OAuthCallbackResponseJson oAuthCallbackResponseJson = (OAuthCallbackResponseJson) obj2;
                boolean zEquals = "failed".equals(oAuthCallbackResponseJson != null ? oAuthCallbackResponseJson.status : null);
                AuraSkillAuthRepository auraSkillAuthRepository3 = this.this$0;
                if (!zEquals) {
                    AuraSkillAuthRepository.logAuthResult$default(auraSkillAuthRepository3, this.$connectorId, this.$origin, this.$completedComponent, this.$authFlowType, null, null, 48, null);
                    if (this.$endQplOnSuccess) {
                        HatchConnectorQplLogger.INSTANCE.endAuthSuccess(false);
                    }
                    z3 = z2;
                    return Boolean.valueOf(z3);
                }
                auraSkillAuthRepository3.logAuthResult(this.$connectorId, this.$origin, this.$failedComponent, this.$authFlowType, "server_error", "oauth_callback_failed");
                HatchConnectorQplLogger.INSTANCE.endAuthFail("server_error", "oauth_callback_failed", FGI.A0U("POST /", this.$endpoint.getValue(), " returned a failed connection result"));
            }
            z2 = false;
            z3 = z2;
            return Boolean.valueOf(z3);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ((AnonymousClass3) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository$sendOAuthCallback$3, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C138053 extends C7438Evz implements G0W {
        public C138053(Object obj) {
            super(3, obj, AuraSkillAuthRepository.class, "postForConnectionStatus", "postForConnectionStatus-0E7RQCE(Lcom/facebook/aura/network/api/JarvisPath;Lkotlinx/serialization/json/JsonElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
        @Override // X.G0W
        /* renamed from: invoke-0E7RQCE, reason: not valid java name and merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invoke(com.facebook.aura.network.api.JarvisPath r6, kotlinx.serialization.json.JsonElement r7, X.HtJ<? super X.HsJ<com.facebook.aura.skills.connect.repository.OAuthCallbackResponseJson>> r8) {
            /*
                r5 = this;
                boolean r0 = r8 instanceof com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository$sendOAuthCallback$3$invoke0E7RQCE$1
                if (r0 == 0) goto L3b
                r4 = r8
                com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository$sendOAuthCallback$3$invoke-0E7RQCE$1 r4 = (com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository$sendOAuthCallback$3$invoke0E7RQCE$1) r4
                int r2 = r4.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L3b
                int r2 = r2 - r1
                r4.label = r2
            L12:
                java.lang.Object r1 = r4.result
                X.Hji r3 = X.EnumC10460Hji.A02
                int r0 = r4.label
                r2 = 1
                if (r0 == 0) goto L26
                if (r0 != r2) goto L41
                java.lang.Object r0 = X.AnonymousClass001.A0q(r1)
            L21:
                X.HsJ r3 = X.C3cG.A0t(r0)
                return r3
            L26:
                X.Hwg.A00(r1)
                java.lang.Object r1 = r5.receiver
                com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository r1 = (com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository) r1
                r0 = 0
                r4.L$0 = r0
                r4.L$1 = r0
                r4.label = r2
                java.lang.Object r0 = com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository.m2096access$postForConnectionStatus0E7RQCE(r1, r6, r7, r4)
                if (r0 != r3) goto L21
                return r3
            L3b:
                com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository$sendOAuthCallback$3$invoke-0E7RQCE$1 r4 = new com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository$sendOAuthCallback$3$invoke-0E7RQCE$1
                r4.<init>(r5, r8)
                goto L12
            L41:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository.C138053.invoke(com.facebook.aura.network.api.JarvisPath, kotlinx.serialization.json.JsonElement, X.HtJ):java.lang.Object");
        }
    }

    public final boolean completeCustomConnectorAuth(Uri uri) {
        C7384Etj.A0Y(uri, 0);
        HatchConnectorQplLogger hatchConnectorQplLogger = HatchConnectorQplLogger.INSTANCE;
        hatchConnectorQplLogger.markAuthCallbackReceived();
        String queryParameter = uri.getQueryParameter("error");
        if (queryParameter == null || C7BY.A0j(queryParameter)) {
            hatchConnectorQplLogger.endAuthSuccess(false);
            return true;
        }
        hatchConnectorQplLogger.endAuthFail(HatchConnectorQplLogger.AuthFailureReason.OAUTH_ERROR, queryParameter, uri.getQueryParameter("error_description"));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String failureReasonForHttpError(JarvisPath jarvisPath) {
        return (C7384Etj.areEqual(jarvisPath, JarvisPath.ApiKeyAuthCallback.INSTANCE) || C7384Etj.areEqual(jarvisPath, JarvisPath.UsernamePasswordAuthCallback.INSTANCE)) ? HatchConnectorQplLogger.AuthFailureReason.INVALID_CREDENTIALS : "server_error";
    }

    public static /* synthetic */ void logAuthResult$default(AuraSkillAuthRepository auraSkillAuthRepository, String str, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, HatchComponent hatchComponent, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            str4 = null;
        }
        auraSkillAuthRepository.logAuthResult(str, hatchSkillOAuthOrigin, hatchComponent, str2, str3, str4);
    }

    public static /* synthetic */ Object postAuthCallback$default(AuraSkillAuthRepository auraSkillAuthRepository, JarvisPath jarvisPath, JsonElement jsonElement, String str, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, String str2, HatchComponent hatchComponent, HatchComponent hatchComponent2, String str3, String str4, String str5, boolean z, boolean z2, G0W g0w, HtJ htJ, int i, Object obj) {
        G0W c138042 = g0w;
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        if ((i & 128) != 0) {
            str3 = null;
        }
        if ((i & 256) != 0) {
            str4 = null;
        }
        if ((i & 512) != 0) {
            str5 = null;
        }
        boolean zA1Q = C60Q.A1Q(i & 1024, z);
        boolean zA1Q2 = C60Q.A1Q(i & 2048, z2);
        if ((i & 4096) != 0) {
            c138042 = new C138042(auraSkillAuthRepository);
        }
        return auraSkillAuthRepository.postAuthCallback(jarvisPath, jsonElement, str, hatchSkillOAuthOrigin, str2, hatchComponent, hatchComponent2, str3, str4, str5, zA1Q, zA1Q2, c138042, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* renamed from: postForAck-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2097postForAck0E7RQCE(com.facebook.aura.network.api.JarvisPath r24, kotlinx.serialization.json.JsonElement r25, X.HtJ<? super X.HsJ<com.facebook.aura.skills.connect.repository.OAuthCallbackResponseJson>> r26) {
        /*
            r23 = this;
            r4 = r26
            boolean r0 = r4 instanceof com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository$postForAck$1
            r5 = r23
            if (r0 == 0) goto L8b
            r3 = r4
            com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository$postForAck$1 r3 = (com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository$postForAck$1) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8b
            int r2 = r2 - r1
            r3.label = r2
        L16:
            java.lang.Object r2 = r3.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r7 = 1
            if (r0 == 0) goto L2d
            if (r0 != r7) goto L91
            java.lang.Object r1 = X.AnonymousClass001.A0q(r2)
        L25:
            boolean r0 = r1 instanceof X.C10571Hud
            r0 = r0 ^ 1
            if (r0 == 0) goto L2c
            r1 = 0
        L2c:
            return r1
        L2d:
            X.Hwg.A00(r2)
            com.facebook.aura.network.http.HatchHttpApi r4 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.network.http.RequestType r10 = com.facebook.aura.network.http.RequestType.POST
            X.CGz r11 = r5.userSession
            r0 = 0
            X.HxE[] r14 = new X.HxE[r0]
            java.util.Set r15 = X.AnonymousClass004.A18()
            X.9jH r18 = X.AGH.A0E()
            com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository$postForAck-0E7RQCE$$inlined$executeJarvisRequest-Z6QaZII$default$1 r5 = com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository$postForAck0E7RQCE$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE
            com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository$postForAck-0E7RQCE$$inlined$executeJarvisRequest-Z6QaZII$default$2 r6 = com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository$postForAck0E7RQCE$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE
            r12 = 0
            r3.L$0 = r12
            r3.L$1 = r12
            r3.L$2 = r12
            r3.L$3 = r12
            r3.L$4 = r12
            r3.L$5 = r12
            r3.L$6 = r12
            r3.L$7 = r12
            r3.L$8 = r12
            r3.L$9 = r12
            r3.I$0 = r7
            r3.I$1 = r7
            r3.I$2 = r0
            r3.I$3 = r7
            r3.I$4 = r0
            r3.I$5 = r0
            r3.I$6 = r0
            r3.label = r7
            r8 = r24
            r9 = r25
            r13 = r12
            r16 = r7
            r17 = r7
            r19 = r12
            r20 = r0
            r21 = r7
            r22 = r0
            r23 = r0
            r24 = r12
            r25 = r0
            r26 = r3
            java.lang.Object r0 = r4.m1599executeJarvisRequestWithFof5HsY(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            if (r0 == r1) goto L2c
            r1 = r0
            goto L25
        L8b:
            com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository$postForAck$1 r3 = new com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository$postForAck$1
            r3.<init>(r5, r4)
            goto L16
        L91:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository.m2097postForAck0E7RQCE(com.facebook.aura.network.api.JarvisPath, kotlinx.serialization.json.JsonElement, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* renamed from: postForConnectionStatus-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2098postForConnectionStatus0E7RQCE(com.facebook.aura.network.api.JarvisPath r26, kotlinx.serialization.json.JsonElement r27, X.HtJ<? super X.HsJ<com.facebook.aura.skills.connect.repository.OAuthCallbackResponseJson>> r28) {
        /*
            r25 = this;
            r3 = r28
            boolean r0 = r3 instanceof com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository$postForConnectionStatus$1
            r5 = r25
            if (r0 == 0) goto L84
            r4 = r3
            com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository$postForConnectionStatus$1 r4 = (com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository$postForConnectionStatus$1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L84
            int r2 = r2 - r1
            r4.label = r2
        L16:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L26
            if (r0 != r1) goto L8a
            java.lang.Object r2 = X.AnonymousClass001.A0q(r3)
        L25:
            return r2
        L26:
            com.facebook.aura.network.http.HatchHttpApi r6 = X.C60O.A06(r3)
            com.facebook.aura.network.http.RequestType r12 = com.facebook.aura.network.http.RequestType.POST
            X.CGz r13 = r5.userSession
            r9 = 0
            X.HxE[] r0 = new X.HxE[r9]
            java.util.Set r17 = X.AnonymousClass004.A18()
            X.9jH r20 = X.AGH.A0E()
            com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository$postForConnectionStatus-0E7RQCE$$inlined$executeJarvisRequest-Z6QaZII$default$1 r7 = com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository$postForConnectionStatus0E7RQCE$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE
            com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository$postForConnectionStatus-0E7RQCE$$inlined$executeJarvisRequest-Z6QaZII$default$2 r8 = com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository$postForConnectionStatus0E7RQCE$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE
            r14 = 0
            r4.L$0 = r14
            r4.L$1 = r14
            r4.L$2 = r14
            r4.L$3 = r14
            r4.L$4 = r14
            r4.L$5 = r14
            r4.L$6 = r14
            r4.L$7 = r14
            r4.L$8 = r14
            r4.L$9 = r14
            r4.I$0 = r1
            r4.I$1 = r1
            r4.I$2 = r9
            r4.I$3 = r1
            r4.I$4 = r9
            r4.I$5 = r9
            r4.I$6 = r9
            r4.label = r1
            r10 = r26
            r11 = r27
            r15 = r14
            r19 = r1
            r21 = r14
            r22 = r9
            r23 = r1
            r24 = r9
            r25 = r9
            r26 = r14
            r27 = r9
            r28 = r4
            r18 = r1
            r16 = r0
            java.lang.Object r0 = r6.m1599executeJarvisRequestWithFof5HsY(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            if (r0 == r2) goto L25
            return r0
        L84:
            com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository$postForConnectionStatus$1 r4 = new com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository$postForConnectionStatus$1
            r4.<init>(r5, r3)
            goto L16
        L8a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository.m2098postForConnectionStatus0E7RQCE(com.facebook.aura.network.api.JarvisPath, kotlinx.serialization.json.JsonElement, X.HtJ):java.lang.Object");
    }

    public static /* synthetic */ Object sendConsentAuthCallback$default(AuraSkillAuthRepository auraSkillAuthRepository, String str, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, String str2, HtJ htJ, int i, Object obj) {
        if ((i & 2) != 0) {
            hatchSkillOAuthOrigin = HatchSkillOAuthOrigin.CHAT;
        }
        return auraSkillAuthRepository.sendConsentAuthCallback(str, hatchSkillOAuthOrigin, AnonymousClass006.A0t(i, str2), htJ);
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        synchronized (this.oauthConnectorIds) {
            this.oauthConnectorIds.clear();
        }
    }

    public final String consumeOAuthConnector(String str) {
        String strRemove;
        if (str == null) {
            return null;
        }
        synchronized (this.oauthConnectorIds) {
            strRemove = this.oauthConnectorIds.remove(str);
        }
        return strRemove;
    }

    public final Object sendApiKeyAuthCallback(String str, String str2, String str3, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, HtJ<? super Boolean> htJ) {
        return postAuthCallback(JarvisPath.ApiKeyAuthCallback.INSTANCE, AuraSkillAuthRepositoryJsonKt.apiKeyAuthBody(str, str2, str3), str, hatchSkillOAuthOrigin, null, HatchComponent.SKILL_API_KEY_AUTH_COMPLETED, HatchComponent.SKILL_API_KEY_AUTH_FAILED, null, null, null, true, true, new C138042(this), htJ);
    }

    public final Object sendConsentAuthCallback(String str, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, String str2, HtJ<? super Boolean> htJ) {
        JarvisPath.ConsentAuthCallback consentAuthCallback = JarvisPath.ConsentAuthCallback.INSTANCE;
        C2nw c2nwA1K = C60O.A1K();
        C7qW.A06("provider", str, c2nwA1K);
        if (str2 != null) {
            C7qW.A06("session_id", str2, c2nwA1K);
        }
        return postAuthCallback(consentAuthCallback, c2nwA1K.A00(), str, hatchSkillOAuthOrigin, "consent", HatchComponent.SKILL_AUTH_COMPLETED, HatchComponent.SKILL_AUTH_FAILED, null, null, null, true, false, new C138042(this), htJ);
    }

    public final Object sendOAuthCallback(Uri uri, String str, HtJ<? super Boolean> htJ) {
        String queryParameter = uri.getQueryParameter("error");
        HatchConnectorQplLogger.INSTANCE.markAuthCallbackReceived();
        return postAuthCallback(JarvisPath.OAuthCallback.INSTANCE, AuraSkillAuthRepositoryJsonKt.oauthCallbackBody(uri), str, HatchSkillOAuthOrigin.CHAT, "direct_oauth", HatchComponent.SKILL_AUTH_COMPLETED, HatchComponent.SKILL_AUTH_FAILED, queryParameter != null ? HatchConnectorQplLogger.AuthFailureReason.OAUTH_ERROR : null, queryParameter, uri.getQueryParameter("error_description"), false, true, new C138053(this), htJ);
    }

    public final Object sendStripeLinkConnectComplete(Uri uri, String str, HtJ<? super Boolean> htJ) {
        String queryParameter = uri.getQueryParameter("error");
        C2nw c2nwA1K = C60O.A1K();
        Iterator<String> it = uri.getQueryParameterNames().iterator();
        while (it.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it);
            String queryParameter2 = uri.getQueryParameter(strA0j);
            if (queryParameter2 != null) {
                C7384Etj.A0X(strA0j);
                C7qW.A06(strA0j, queryParameter2, c2nwA1K);
            }
        }
        JsonObject jsonObjectA00 = c2nwA1K.A00();
        HatchConnectorQplLogger.INSTANCE.markAuthCallbackReceived();
        return postAuthCallback(JarvisPath.StripeLinkConnectComplete.INSTANCE, jsonObjectA00, str, HatchSkillOAuthOrigin.CHAT, "web", HatchComponent.SKILL_AUTH_COMPLETED, HatchComponent.SKILL_AUTH_FAILED, queryParameter != null ? HatchConnectorQplLogger.AuthFailureReason.LINKING_FAILURE : null, queryParameter, uri.getQueryParameter("error_description"), false, true, new C138042(this), htJ);
    }

    public final Object sendUsernamePasswordAuthCallback(String str, String str2, String str3, String str4, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, HtJ<? super Boolean> htJ) {
        return postAuthCallback(JarvisPath.UsernamePasswordAuthCallback.INSTANCE, AuraSkillAuthRepositoryJsonKt.usernamePasswordAuthBody(str, str2, str3, str4), str, hatchSkillOAuthOrigin, null, HatchComponent.SKILL_API_KEY_AUTH_COMPLETED, HatchComponent.SKILL_API_KEY_AUTH_FAILED, null, null, null, true, true, new C138042(this), htJ);
    }

    public final class Companion {
        public final AuraSkillAuthRepository getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (AuraSkillAuthRepository) abstractC3358CGz.A03(AuraSkillAuthRepository.class, new AuraSkillAuthRepository$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public AuraSkillAuthRepository(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this.oauthConnectorIds = C3cG.A0j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logAuthResult(String str, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, HatchComponent hatchComponent, String str2, String str3, String str4) {
        C0924AIa c0924AIaA0u = C3cG.A0u();
        if (str2 != null) {
            AnonymousClass001.A1C(HatchMetadataKey.AUTH_FLOW_TYPE, str2, c0924AIaA0u);
        }
        if (str != null) {
            AnonymousClass001.A1C(HatchMetadataKey.PROVIDER, str, c0924AIaA0u);
        }
        if (str3 != null) {
            AnonymousClass001.A1C(HatchMetadataKey.FAILURE_REASON, str3, c0924AIaA0u);
        }
        if (str4 != null) {
            AnonymousClass001.A1C(HatchMetadataKey.ERROR, str4, c0924AIaA0u);
        }
        C0924AIa c0924AIaA0K = AIW.A0K(c0924AIaA0u);
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        if (c0924AIaA0K.isEmpty()) {
            c0924AIaA0K = null;
        }
        hatchInteractionLogger.logSkillOAuthResult(hatchSkillOAuthOrigin, hatchComponent, c0924AIaA0K);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object postAuthCallback(JarvisPath jarvisPath, JsonElement jsonElement, String str, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, String str2, HatchComponent hatchComponent, HatchComponent hatchComponent2, String str3, String str4, String str5, boolean z, boolean z2, G0W<? super JarvisPath, ? super JsonElement, ? super HtJ<? super HsJ<OAuthCallbackResponseJson>>, ? extends Object> g0w, HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass3(g0w, jarvisPath, jsonElement, this, str, hatchSkillOAuthOrigin, hatchComponent2, str2, z, str3, str4, str5, hatchComponent, z2, null));
    }

    public static /* synthetic */ Object sendApiKeyAuthCallback$default(AuraSkillAuthRepository auraSkillAuthRepository, String str, String str2, String str3, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, HtJ htJ, int i, Object obj) {
        String strA0t = AnonymousClass006.A0t(i, str3);
        if ((i & 8) != 0) {
            hatchSkillOAuthOrigin = HatchSkillOAuthOrigin.CHAT;
        }
        return auraSkillAuthRepository.sendApiKeyAuthCallback(str, str2, strA0t, hatchSkillOAuthOrigin, htJ);
    }

    public static /* synthetic */ Object sendUsernamePasswordAuthCallback$default(AuraSkillAuthRepository auraSkillAuthRepository, String str, String str2, String str3, String str4, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, HtJ htJ, int i, Object obj) {
        String strA0u = AnonymousClass006.A0u(i, str4);
        if ((i & 16) != 0) {
            hatchSkillOAuthOrigin = HatchSkillOAuthOrigin.CHAT;
        }
        return auraSkillAuthRepository.sendUsernamePasswordAuthCallback(str, str2, str3, strA0u, hatchSkillOAuthOrigin, htJ);
    }

    public final Object fetchConnectAction(String str, String str2, HtJ<? super SkillConnectAction> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(str, this, str2, null));
    }

    public final void registerOAuthConnector(String str, String str2) {
        String queryParameter;
        AnonymousClass003.A0u(str, str2);
        if (C7BY.A0j(str)) {
            return;
        }
        Uri uri = Uri.parse(str2);
        if (!uri.isHierarchical() || (queryParameter = uri.getQueryParameter("state")) == null || C7BY.A0j(queryParameter)) {
            return;
        }
        synchronized (this.oauthConnectorIds) {
            this.oauthConnectorIds.remove(queryParameter);
            this.oauthConnectorIds.put(queryParameter, str);
            while (true) {
                LinkedHashMap<String, String> linkedHashMap = this.oauthConnectorIds;
                if (linkedHashMap.size() > 32) {
                    Set<String> setKeySet = linkedHashMap.keySet();
                    C7384Etj.A0U(setKeySet);
                    linkedHashMap.remove(AbstractC0878AGe.A0B(setKeySet));
                }
            }
        }
    }

    public /* synthetic */ AuraSkillAuthRepository(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
