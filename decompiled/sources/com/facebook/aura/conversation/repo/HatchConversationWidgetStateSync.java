package com.facebook.aura.conversation.repo;

import X.AGH;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BLG;
import X.C10571Hud;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.C60R;
import X.C7384Etj;
import X.C9jH;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.HzP;
import com.facebook.aura.activation.view.AuraWaitlistConfettiKt;
import com.facebook.aura.ageverification.SelfieSnapshotKt;
import com.facebook.aura.conversation.offline.HatchOfflineConversationRepository;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.model.HatchMessage;
import com.facebook.aura.model.HatchWidget;
import com.facebook.aura.model.HatchWidgetPresentation;
import com.facebook.aura.model.HatchWidgetPresentationKt;
import com.facebook.aura.model.JSONState;
import com.facebook.aura.model.WidgetStateMutationHost;
import com.facebook.aura.model.WidgetStateMutationResult;
import com.facebook.aura.model.WidgetStateSource;
import com.facebook.aura.network.api.JarvisPath;
import com.facebook.aura.network.http.RequestType;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class HatchConversationWidgetStateSync implements WidgetStateMutationHost {
    public final BLG<HatchConversationState> conversationState;
    public final HatchGatewayConnection gateway;
    public final boolean loadHistoryOnConnect;
    public final C3UX scope;
    public final String sessionId;
    public final AbstractC3358CGz userSession;
    public final ConcurrentHashMap<String, WidgetStateSyncSlot> widgetStateSyncSlots;

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationWidgetStateSync$applyConfirmedWidgetState$1", f = "HatchConversationWidgetStateSync.kt", l = {447}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationWidgetStateSync$applyConfirmedWidgetState$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $cacheSessionId;
        public final /* synthetic */ String $cacheVmId;
        public final /* synthetic */ HatchMessage $confirmedMessage;
        public final /* synthetic */ JSONState $nextState;
        public final /* synthetic */ String $widgetId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, HatchMessage hatchMessage, String str3, JSONState jSONState, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$cacheVmId = str;
            this.$cacheSessionId = str2;
            this.$confirmedMessage = hatchMessage;
            this.$widgetId = str3;
            this.$nextState = jSONState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationWidgetStateSync.this.new AnonymousClass1(this.$cacheVmId, this.$cacheSessionId, this.$confirmedMessage, this.$widgetId, this.$nextState, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchOfflineConversationRepository companion = HatchOfflineConversationRepository.Companion.getInstance(HatchConversationWidgetStateSync.this.userSession);
                String str = this.$cacheVmId;
                String str2 = this.$cacheSessionId;
                HatchMessage hatchMessage = this.$confirmedMessage;
                String str3 = this.$widgetId;
                JSONState jSONState = this.$nextState;
                this.label = 1;
                if (companion.saveConfirmedWidgetState(str, str2, hatchMessage, str3, jSONState, this) == enumC10460Hji) {
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

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationWidgetStateSync$patchWidgetState$2", f = "HatchConversationWidgetStateSync.kt", l = {125}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationWidgetStateSync$patchWidgetState$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super WidgetStateMutationResult>, Object> {
        public final /* synthetic */ G0U<JSONState, Boolean> $canApply;
        public final /* synthetic */ JsonObject $patch;
        public final /* synthetic */ WidgetStateSource $source;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public final /* synthetic */ HatchConversationWidgetStateSync this$0;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            String str;
            String str2;
            JSONState jSONStateFindWidgetState;
            JsonObject jsonObject;
            JSONState jSONState;
            Object objPersistWidgetState = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    WidgetStateSource widgetStateSource = this.$source;
                    str = widgetStateSource.message.id;
                    str2 = widgetStateSource.widgetId;
                    jSONStateFindWidgetState = this.this$0.findWidgetState(str, str2);
                    if (jSONStateFindWidgetState == null) {
                        jSONStateFindWidgetState = this.$source.state;
                    }
                    if (!AnonymousClass003.A1X(jSONStateFindWidgetState, this.$canApply)) {
                        return new WidgetStateMutationResult(false, jSONStateFindWidgetState);
                    }
                    jsonObject = new JsonObject(AGH.A02(jSONStateFindWidgetState.data, this.$patch));
                    this.this$0.updateWidgetState(str, str2, new JSONState(jSONStateFindWidgetState.version, jsonObject));
                    HatchConversationWidgetStateSync hatchConversationWidgetStateSync = this.this$0;
                    JsonObject jsonObject2 = this.$patch;
                    G0U<JSONState, Boolean> g0u = this.$canApply;
                    this.L$0 = str;
                    this.L$1 = str2;
                    this.L$2 = jSONStateFindWidgetState;
                    this.L$3 = jsonObject;
                    this.label = 1;
                    objPersistWidgetState = hatchConversationWidgetStateSync.persistWidgetState(str2, jSONStateFindWidgetState, jsonObject, jsonObject2, g0u, this);
                    if (objPersistWidgetState == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    jsonObject = (JsonObject) this.L$3;
                    jSONStateFindWidgetState = (JSONState) this.L$2;
                    str2 = (String) this.L$1;
                    str = (String) this.L$0;
                    Hwg.A00(obj);
                }
                WidgetStateMutationResult widgetStateMutationResult = (WidgetStateMutationResult) objPersistWidgetState;
                if (widgetStateMutationResult != null) {
                    jSONState = widgetStateMutationResult.state;
                    if (jSONState != null && (widgetStateMutationResult.applied || !AnonymousClass003.A1X(jSONState, this.$canApply))) {
                        HatchConversationWidgetStateSync.applyConfirmedWidgetState$default(this.this$0, str, str2, jSONState, null, this.$source.message, 8, null);
                        return widgetStateMutationResult;
                    }
                } else {
                    jSONState = null;
                }
                HatchConversationWidgetStateSync hatchConversationWidgetStateSync2 = this.this$0;
                if (jSONState == null) {
                    jSONState = jSONStateFindWidgetState;
                }
                hatchConversationWidgetStateSync2.applyWidgetStateIfCurrent(str, str2, jsonObject, jSONState, this.$source.message);
                return widgetStateMutationResult;
            } catch (Throwable th) {
                this.this$0.applyWidgetStateIfCurrent(str, str2, jsonObject, jSONStateFindWidgetState, this.$source.message);
                throw th;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(WidgetStateSource widgetStateSource, HatchConversationWidgetStateSync hatchConversationWidgetStateSync, G0U<? super JSONState, Boolean> g0u, JsonObject jsonObject, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$source = widgetStateSource;
            this.this$0 = hatchConversationWidgetStateSync;
            this.$canApply = g0u;
            this.$patch = jsonObject;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$source, this.this$0, this.$canApply, this.$patch, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super WidgetStateMutationResult> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationWidgetStateSync", f = "HatchConversationWidgetStateSync.kt", l = {498, 517}, m = "persistWidgetState", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationWidgetStateSync$persistWidgetState$1, reason: invalid class name and case insensitive filesystem */
    public final class C113781 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public int label;
        public /* synthetic */ Object result;

        public C113781(HtJ<? super C113781> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchConversationWidgetStateSync.this.persistWidgetState(null, null, null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationWidgetStateSync$restoreWidgetState$2", f = "HatchConversationWidgetStateSync.kt", l = {AuraWaitlistConfettiKt.StandardParticleCount, SelfieSnapshotKt.SELFIE_JPEG_QUALITY}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationWidgetStateSync$restoreWidgetState$2, reason: invalid class name and case insensitive filesystem */
    public final class C113802 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super WidgetStateSource>, Object> {
        public final /* synthetic */ String $hostMessageId;
        public final /* synthetic */ String $widgetId;
        public long J$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C113802(String str, String str2, HtJ<? super C113802> htJ) {
            super(2, htJ);
            this.$hostMessageId = str;
            this.$widgetId = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationWidgetStateSync.this.new C113802(this.$hostMessageId, this.$widgetId, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0031 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0032 A[SYNTHETIC] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                X.Hji r5 = X.EnumC10460Hji.A02
                int r0 = r12.label
                r4 = 2
                r11 = 1
                r6 = 0
                if (r0 == 0) goto L34
                if (r0 == r11) goto L4a
                if (r0 != r4) goto L7e
                X.Hwg.A00(r13)
            L10:
                java.lang.Iterable r13 = (java.lang.Iterable) r13
                java.lang.String r3 = r12.$hostMessageId
                java.util.Iterator r1 = r13.iterator()
            L18:
                boolean r0 = r1.hasNext()
                if (r0 == 0) goto L32
                java.lang.Object r2 = r1.next()
                r0 = r2
                com.facebook.aura.model.HatchMessage r0 = (com.facebook.aura.model.HatchMessage) r0
                java.lang.String r0 = r0.id
                boolean r0 = X.C7384Etj.areEqual(r0, r3)
                if (r0 == 0) goto L18
            L2d:
                com.facebook.aura.model.HatchMessage r2 = (com.facebook.aura.model.HatchMessage) r2
                if (r2 != 0) goto L75
                return r6
            L32:
                r2 = r6
                goto L2d
            L34:
                X.Hwg.A00(r13)
                com.facebook.aura.conversation.repo.HatchConversationWidgetStateSync r0 = com.facebook.aura.conversation.repo.HatchConversationWidgetStateSync.this
                com.facebook.aura.gateway.HatchGatewayConnection r0 = r0.gateway
                java.lang.String r1 = r12.$hostMessageId
                r12.label = r11
                com.facebook.aura.gateway.HatchGatewayEventsHandler r0 = r0.getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway()
                java.lang.Object r13 = r0.fetchMessageSeq(r1, r12)
                if (r13 != r5) goto L4d
                return r5
            L4a:
                X.Hwg.A00(r13)
            L4d:
                java.lang.Number r13 = (java.lang.Number) r13
                if (r13 == 0) goto L83
                long r0 = r13.longValue()
                com.facebook.aura.conversation.offline.HatchOfflineConversationRepository$Companion r3 = com.facebook.aura.conversation.offline.HatchOfflineConversationRepository.Companion
                com.facebook.aura.conversation.repo.HatchConversationWidgetStateSync r2 = com.facebook.aura.conversation.repo.HatchConversationWidgetStateSync.this
                X.CGz r2 = r2.userSession
                com.facebook.aura.conversation.offline.HatchOfflineConversationRepository r7 = r3.getInstance(r2)
                com.facebook.aura.conversation.repo.HatchConversationWidgetStateSync r2 = com.facebook.aura.conversation.repo.HatchConversationWidgetStateSync.this
                java.lang.String r8 = r2.sessionId
                if (r8 != 0) goto L67
                java.lang.String r8 = "primary_session_id"
            L67:
                r9 = 1
                long r9 = r9 + r0
                r12.J$0 = r0
                r12.label = r4
                java.lang.Object r13 = r7.loadMessagesBefore(r8, r9, r11, r12)
                if (r13 != r5) goto L10
                return r5
            L75:
                com.facebook.aura.conversation.repo.HatchConversationWidgetStateSync r1 = com.facebook.aura.conversation.repo.HatchConversationWidgetStateSync.this
                java.lang.String r0 = r12.$widgetId
                com.facebook.aura.model.WidgetStateSource r5 = com.facebook.aura.conversation.repo.HatchConversationWidgetStateSync.access$widgetStateSource(r1, r2, r0)
                return r5
            L7e:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L83:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchConversationWidgetStateSync.C113802.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super WidgetStateSource> htJ) {
            return ((C113802) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationWidgetStateSync$setWidgetState$1", f = "HatchConversationWidgetStateSync.kt", l = {189}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationWidgetStateSync$setWidgetState$1, reason: invalid class name and case insensitive filesystem */
    public final class C113811 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $hostMessageId;
        public final /* synthetic */ WidgetStateSyncSlot $slot;
        public final /* synthetic */ String $slotKey;
        public final /* synthetic */ String $widgetId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C113811(String str, String str2, String str3, WidgetStateSyncSlot widgetStateSyncSlot, HtJ<? super C113811> htJ) {
            super(2, htJ);
            this.$slotKey = str;
            this.$hostMessageId = str2;
            this.$widgetId = str3;
            this.$slot = widgetStateSyncSlot;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationWidgetStateSync.this.new C113811(this.$slotKey, this.$hostMessageId, this.$widgetId, this.$slot, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchConversationWidgetStateSync hatchConversationWidgetStateSync = HatchConversationWidgetStateSync.this;
                String str = this.$slotKey;
                String str2 = this.$hostMessageId;
                String str3 = this.$widgetId;
                WidgetStateSyncSlot widgetStateSyncSlot = this.$slot;
                this.label = 1;
                if (hatchConversationWidgetStateSync.syncNextWidgetState(str, str2, str3, widgetStateSyncSlot, this) == enumC10460Hji) {
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

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C113811) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationWidgetStateSync$setWidgetStateDocument$2", f = "HatchConversationWidgetStateSync.kt", l = {585}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationWidgetStateSync$setWidgetStateDocument$2, reason: invalid class name and case insensitive filesystem */
    public final class C113822 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super WidgetStateMutationResult>, Object> {
        public final /* synthetic */ long $baseVersion;
        public final /* synthetic */ JsonObject $state;
        public final /* synthetic */ String $widgetId;
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public int label;
        public final /* synthetic */ HatchConversationWidgetStateSync this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C113822(String str, JsonObject jsonObject, long j, HatchConversationWidgetStateSync hatchConversationWidgetStateSync, HtJ<? super C113822> htJ) {
            super(2, htJ);
            this.$widgetId = str;
            this.$state = jsonObject;
            this.$baseVersion = j;
            this.this$0 = hatchConversationWidgetStateSync;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C113822(this.$widgetId, this.$state, this.$baseVersion, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1599executeJarvisRequestWithFof5HsY;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                HatchConversationWidgetStateSync$setWidgetStateDocument$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 hatchConversationWidgetStateSync$setWidgetStateDocument$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 = HatchConversationWidgetStateSync$setWidgetStateDocument$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE;
                HatchConversationWidgetStateSync$setWidgetStateDocument$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 hatchConversationWidgetStateSync$setWidgetStateDocument$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 = HatchConversationWidgetStateSync$setWidgetStateDocument$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.I$0 = 1;
                this.I$1 = 1;
                this.I$2 = 0;
                this.I$3 = 1;
                this.I$4 = 0;
                this.I$5 = 0;
                this.I$6 = 0;
                this.label = 1;
                objM1599executeJarvisRequestWithFof5HsY = C60O.A06(obj).m1599executeJarvisRequestWithFof5HsY(hatchConversationWidgetStateSync$setWidgetStateDocument$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1, hatchConversationWidgetStateSync$setWidgetStateDocument$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2, false, JarvisPath.WidgetsState.INSTANCE, new WidgetStateSetRequestJson(this.$widgetId, this.$state, this.$baseVersion, AnonymousClass002.A0k()), RequestType.POST, this.this$0.userSession, C3cG.A0S(10L), null, new HxE[0], setA18, true, true, c9jHA0E, null, false, true, false, false, null, false, this);
                if (objM1599executeJarvisRequestWithFof5HsY == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1599executeJarvisRequestWithFof5HsY = AnonymousClass002.A0j(obj);
            }
            String str = this.$widgetId;
            Throwable thA00 = HsJ.A00(objM1599executeJarvisRequestWithFof5HsY);
            if (thA00 != null) {
                CFK.A0A("HatchConversationRepository", FGI.A0M("widgets/state failed for ", str), thA00);
            }
            if (objM1599executeJarvisRequestWithFof5HsY instanceof C10571Hud) {
                objM1599executeJarvisRequestWithFof5HsY = null;
            }
            WidgetStateSetResponseJson widgetStateSetResponseJson = (WidgetStateSetResponseJson) objM1599executeJarvisRequestWithFof5HsY;
            if (widgetStateSetResponseJson != null) {
                return widgetStateSetResponseJson.toDomain();
            }
            return null;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super WidgetStateMutationResult> htJ) {
            return ((C113822) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationWidgetStateSync", f = "HatchConversationWidgetStateSync.kt", l = {359}, m = "syncNextWidgetState", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationWidgetStateSync$syncNextWidgetState$1, reason: invalid class name and case insensitive filesystem */
    public final class C113831 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public C113831(HtJ<? super C113831> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchConversationWidgetStateSync.this.syncNextWidgetState(null, null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationWidgetStateSync$syncNextWidgetState$2", f = "HatchConversationWidgetStateSync.kt", l = {393}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationWidgetStateSync$syncNextWidgetState$2, reason: invalid class name and case insensitive filesystem */
    public final class C113842 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $hostMessageId;
        public final /* synthetic */ WidgetStateSyncSlot $slot;
        public final /* synthetic */ String $slotKey;
        public final /* synthetic */ String $widgetId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C113842(String str, String str2, String str3, WidgetStateSyncSlot widgetStateSyncSlot, HtJ<? super C113842> htJ) {
            super(2, htJ);
            this.$slotKey = str;
            this.$hostMessageId = str2;
            this.$widgetId = str3;
            this.$slot = widgetStateSyncSlot;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationWidgetStateSync.this.new C113842(this.$slotKey, this.$hostMessageId, this.$widgetId, this.$slot, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchConversationWidgetStateSync hatchConversationWidgetStateSync = HatchConversationWidgetStateSync.this;
                String str = this.$slotKey;
                String str2 = this.$hostMessageId;
                String str3 = this.$widgetId;
                WidgetStateSyncSlot widgetStateSyncSlot = this.$slot;
                this.label = 1;
                if (hatchConversationWidgetStateSync.syncNextWidgetState(str, str2, str3, widgetStateSyncSlot, this) == enumC10460Hji) {
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

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C113842) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public HatchConversationWidgetStateSync(AbstractC3358CGz abstractC3358CGz, String str, boolean z, HatchGatewayConnection hatchGatewayConnection, C3UX c3ux, BLG<HatchConversationState> blg) {
        AnonymousClass005.A16(abstractC3358CGz, hatchGatewayConnection, c3ux, blg, 0);
        this.userSession = abstractC3358CGz;
        this.sessionId = str;
        this.loadHistoryOnConnect = z;
        this.gateway = hatchGatewayConnection;
        this.scope = c3ux;
        this.conversationState = blg;
        this.widgetStateSyncSlots = C60O.A1C();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0082, code lost:
    
        if (r13 != null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.model.HatchMessage applyConfirmedWidgetState(java.lang.String r10, java.lang.String r11, com.facebook.aura.model.JSONState r12, java.lang.Long r13, com.facebook.aura.model.HatchMessage r14) {
        /*
            r9 = this;
            r7 = r9
            com.facebook.aura.model.HatchMessage r2 = r9.updateWidgetState(r10, r11, r12)
            r4 = 0
            if (r2 != 0) goto L1d
            if (r14 == 0) goto L1c
            com.facebook.aura.model.JSONState r0 = r9.findWidgetState(r10, r11)
            if (r0 != 0) goto L1c
            java.util.List r0 = java.util.Collections.singletonList(r14)
            com.facebook.aura.conversation.repo.WidgetStateUpdateResult r0 = r9.updateWidgetStateInMessages(r0, r10, r11, r12)
            com.facebook.aura.model.HatchMessage r2 = r0.updatedMessage
            if (r2 != 0) goto L1d
        L1c:
            return r4
        L1d:
            java.lang.Long r0 = r2.seq
            if (r0 == 0) goto L5d
            long r5 = r0.longValue()
        L25:
            java.lang.Long r0 = r2.seq
            if (r0 == 0) goto L54
            long r3 = r0.longValue()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L54
            r10 = r2
        L32:
            boolean r0 = r9.loadHistoryOnConnect
            if (r0 == 0) goto L53
            X.BLG<com.facebook.aura.conversation.repo.HatchConversationState> r0 = r9.conversationState
            java.lang.Object r0 = r0.getValue()
            com.facebook.aura.conversation.repo.HatchConversationState r0 = (com.facebook.aura.conversation.repo.HatchConversationState) r0
            java.lang.String r8 = r0.vmId
            if (r8 == 0) goto L53
            java.lang.String r9 = r9.sessionId
            if (r9 != 0) goto L48
            java.lang.String r9 = "primary_session_id"
        L48:
            X.3UX r0 = r7.scope
            r13 = 0
            com.facebook.aura.conversation.repo.HatchConversationWidgetStateSync$applyConfirmedWidgetState$1 r6 = new com.facebook.aura.conversation.repo.HatchConversationWidgetStateSync$applyConfirmedWidgetState$1
            r6.<init>(r8, r9, r10, r11, r12, r13)
            X.AnonymousClass001.A1J(r6, r0)
        L53:
            return r2
        L54:
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            com.facebook.aura.model.HatchMessage r10 = X.C60P.A05(r2, r0)
            goto L32
        L5d:
            if (r13 != 0) goto L84
            java.util.List<com.facebook.aura.model.HatchWidgetPresentation> r0 = r2.presentations
            if (r0 == 0) goto L53
            java.util.Iterator r3 = r0.iterator()
        L67:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L89
            java.lang.Object r1 = r3.next()
            r0 = r1
            com.facebook.aura.model.HatchWidgetPresentation r0 = (com.facebook.aura.model.HatchWidgetPresentation) r0
            boolean r0 = com.facebook.aura.model.HatchWidgetPresentationKt.matchesWidgetId(r0, r11)
            if (r0 == 0) goto L67
        L7a:
            com.facebook.aura.model.HatchWidgetPresentation r1 = (com.facebook.aura.model.HatchWidgetPresentation) r1
            if (r1 == 0) goto L53
            java.lang.Long r13 = com.facebook.aura.model.HatchWidgetPresentationKt.conversationSeq(r1)
            if (r13 == 0) goto L53
        L84:
            long r5 = r13.longValue()
            goto L25
        L89:
            r1 = r4
            goto L7a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchConversationWidgetStateSync.applyConfirmedWidgetState(java.lang.String, java.lang.String, com.facebook.aura.model.JSONState, java.lang.Long, com.facebook.aura.model.HatchMessage):com.facebook.aura.model.HatchMessage");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean applyWidgetStateIfCurrent(String str, String str2, JsonObject jsonObject, JSONState jSONState, HatchMessage hatchMessage) {
        JSONState jSONStateFindWidgetState = findWidgetState(str, str2);
        if (jSONStateFindWidgetState == null) {
            if (hatchMessage != null) {
            }
        }
        if (!C7384Etj.areEqual(jSONStateFindWidgetState.data, jsonObject)) {
            return false;
        }
        return applyConfirmedWidgetState(str, str2, jSONState, null, hatchMessage) != null;
    }

    private final WidgetStateSyncWork takePendingWidgetStateSyncWork(String str, WidgetStateSyncSlot widgetStateSyncSlot) {
        WidgetStateSyncWork widgetStateSyncWork;
        synchronized (widgetStateSyncSlot) {
            JsonObject jsonObject = widgetStateSyncSlot.pendingStateData;
            widgetStateSyncWork = null;
            if (jsonObject == null) {
                widgetStateSyncSlot.isSyncing = false;
                this.widgetStateSyncSlots.remove(str, widgetStateSyncSlot);
            } else {
                widgetStateSyncSlot.pendingStateData = null;
                widgetStateSyncWork = new WidgetStateSyncWork(widgetStateSyncSlot.committedState, jsonObject);
            }
        }
        return widgetStateSyncWork;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void reconcileWidgetStateEvent(com.facebook.aura.model.HatchChatEvent.WidgetStateUpdated r12) {
        /*
            r11 = this;
            r0 = 0
            X.C7384Etj.A0Y(r12, r0)
            java.lang.String r2 = r12.hostMessageId
            java.lang.String r1 = r12.widgetId
            java.lang.String r0 = ":"
            java.lang.String r1 = X.FGI.A0U(r2, r0, r1)
            r7 = r11
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.facebook.aura.conversation.repo.WidgetStateSyncSlot> r0 = r11.widgetStateSyncSlots
            java.lang.Object r6 = r0.get(r1)
            com.facebook.aura.conversation.repo.WidgetStateSyncSlot r6 = (com.facebook.aura.conversation.repo.WidgetStateSyncSlot) r6
            if (r6 == 0) goto L40
            monitor-enter(r6)
            com.facebook.aura.model.JSONState r5 = r12.state     // Catch: java.lang.Throwable -> L3d
            long r3 = r5.version     // Catch: java.lang.Throwable -> L3d
            com.facebook.aura.model.JSONState r0 = r6.committedState     // Catch: java.lang.Throwable -> L3d
            long r1 = r0.version     // Catch: java.lang.Throwable -> L3d
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L29
            r6.setCommittedState(r5)     // Catch: java.lang.Throwable -> L3d
        L29:
            kotlinx.serialization.json.JsonObject r1 = r6.optimisticStateData     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L38
            com.facebook.aura.model.JSONState r0 = r12.state     // Catch: java.lang.Throwable -> L3d
            kotlinx.serialization.json.JsonObject r0 = r0.data     // Catch: java.lang.Throwable -> L3d
            boolean r1 = X.C7384Etj.areEqual(r0, r1)     // Catch: java.lang.Throwable -> L3d
            r0 = 1
            if (r1 == 0) goto L39
        L38:
            r0 = 0
        L39:
            monitor-exit(r6)
            if (r0 == 0) goto L40
            return
        L3d:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L40:
            java.lang.String r8 = r12.hostMessageId
            java.lang.String r9 = r12.widgetId
            com.facebook.aura.model.JSONState r10 = r12.state
            com.facebook.aura.model.CanonicalEventEnvelope r0 = r12.envelope
            if (r0 == 0) goto L51
            java.lang.Long r11 = r0.messageSeq
        L4c:
            r12 = 0
            r7.applyConfirmedWidgetState(r8, r9, r10, r11, r12)
            return
        L51:
            r11 = 0
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchConversationWidgetStateSync.reconcileWidgetStateEvent(com.facebook.aura.model.HatchChatEvent$WidgetStateUpdated):void");
    }

    public final void setWidgetState(String str, String str2, String str3) {
        Object objA0s;
        final JSONState jSONStateFindWidgetState;
        JSONState jSONState;
        boolean z;
        boolean zA1Z = AnonymousClass005.A1Z(str, str2, str3);
        try {
            objA0s = HatchWidgetPresentationKt.normalizeJSONStateData(HatchJsonKt.HatchJson.A04(str3));
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        JsonObject jsonObject = (JsonObject) objA0s;
        if (jsonObject == null || (jSONStateFindWidgetState = findWidgetState(str, str2)) == null || C7384Etj.areEqual(jSONStateFindWidgetState.data, jsonObject)) {
            return;
        }
        String strA0U = FGI.A0U(str, ":", str2);
        WidgetStateSyncSlot widgetStateSyncSlotComputeIfAbsent = this.widgetStateSyncSlots.computeIfAbsent(strA0U, new Function() { // from class: com.facebook.aura.conversation.repo.HatchConversationWidgetStateSync$setWidgetState$slot$1
            @Override // java.util.function.Function
            public final WidgetStateSyncSlot apply(String str4) {
                return new WidgetStateSyncSlot(jSONStateFindWidgetState, null, null, false);
            }
        });
        C7384Etj.A0U(widgetStateSyncSlotComputeIfAbsent);
        WidgetStateSyncSlot widgetStateSyncSlot = widgetStateSyncSlotComputeIfAbsent;
        synchronized (widgetStateSyncSlotComputeIfAbsent) {
            jSONState = new JSONState(widgetStateSyncSlot.committedState.version, jsonObject);
        }
        if (updateWidgetState(str, str2, jSONState) != null) {
            synchronized (widgetStateSyncSlotComputeIfAbsent) {
                widgetStateSyncSlot.pendingStateData = jsonObject;
                widgetStateSyncSlot.optimisticStateData = jsonObject;
                z = false;
                if (!widgetStateSyncSlot.isSyncing) {
                    z = true;
                    widgetStateSyncSlot.isSyncing = zA1Z;
                }
            }
            this.widgetStateSyncSlots.put(strA0U, widgetStateSyncSlot);
            if (z) {
                AnonymousClass001.A1I(AnonymousClass001.A0y(), new C113811(strA0U, str, str2, widgetStateSyncSlot, null), this.scope);
            }
        }
    }

    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationWidgetStateSync$persistWidgetState$2, reason: invalid class name and case insensitive filesystem */
    public final class C113792 extends AbstractC7559F3s implements G0U<JSONState, Boolean> {
        public static final C113792 INSTANCE = new C113792();

        public C113792() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Boolean invoke2(JSONState jSONState) {
            return AnonymousClass001.A0i();
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Boolean invoke(JSONState jSONState) {
            return AnonymousClass001.A0i();
        }
    }

    public static /* synthetic */ HatchMessage applyConfirmedWidgetState$default(HatchConversationWidgetStateSync hatchConversationWidgetStateSync, String str, String str2, JSONState jSONState, Long l, HatchMessage hatchMessage, int i, Object obj) {
        if ((i & 8) != 0) {
            l = null;
        }
        if ((i & 16) != 0) {
            hatchMessage = null;
        }
        return hatchConversationWidgetStateSync.applyConfirmedWidgetState(str, str2, jSONState, l, hatchMessage);
    }

    public static /* synthetic */ boolean applyWidgetStateIfCurrent$default(HatchConversationWidgetStateSync hatchConversationWidgetStateSync, String str, String str2, JsonObject jsonObject, JSONState jSONState, HatchMessage hatchMessage, int i, Object obj) {
        if ((i & 16) != 0) {
            hatchMessage = null;
        }
        return hatchConversationWidgetStateSync.applyWidgetStateIfCurrent(str, str2, jsonObject, jSONState, hatchMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONState findWidgetState(String str, String str2) {
        JSONState jSONState;
        HatchConversationState value = this.conversationState.getValue();
        HatchWidget hatchWidgetInlineWidgetFromHostMessage = inlineWidgetFromHostMessage(value.messages, str, str2);
        if (hatchWidgetInlineWidgetFromHostMessage == null || (jSONState = hatchWidgetInlineWidgetFromHostMessage.state) == null) {
            HatchWidgetPresentation hatchWidgetPresentationWidgetPresentationFromHostMessage = widgetPresentationFromHostMessage(value.messages, str, str2);
            if (hatchWidgetPresentationWidgetPresentationFromHostMessage == null) {
                HatchWidget hatchWidgetInlineWidgetFromHostMessage2 = inlineWidgetFromHostMessage(value.history, str, str2);
                if (hatchWidgetInlineWidgetFromHostMessage2 == null || (jSONState = hatchWidgetInlineWidgetFromHostMessage2.state) == null) {
                    hatchWidgetPresentationWidgetPresentationFromHostMessage = widgetPresentationFromHostMessage(value.history, str, str2);
                    if (hatchWidgetPresentationWidgetPresentationFromHostMessage == null) {
                        return null;
                    }
                }
            }
            return hatchWidgetPresentationWidgetPresentationFromHostMessage.getState();
        }
        return jSONState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00ea -> B:12:0x0047). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object persistWidgetState(java.lang.String r15, com.facebook.aura.model.JSONState r16, kotlinx.serialization.json.JsonObject r17, kotlinx.serialization.json.JsonObject r18, X.G0U<? super com.facebook.aura.model.JSONState, java.lang.Boolean> r19, X.HtJ<? super com.facebook.aura.model.WidgetStateMutationResult> r20) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchConversationWidgetStateSync.persistWidgetState(java.lang.String, com.facebook.aura.model.JSONState, kotlinx.serialization.json.JsonObject, kotlinx.serialization.json.JsonObject, X.G0U, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object persistWidgetState$default(HatchConversationWidgetStateSync hatchConversationWidgetStateSync, String str, JSONState jSONState, JsonObject jsonObject, JsonObject jsonObject2, G0U g0u, HtJ htJ, int i, Object obj) {
        if ((i & 8) != 0) {
            jsonObject2 = null;
        }
        if ((i & 16) != 0) {
            g0u = C113792.INSTANCE;
        }
        return hatchConversationWidgetStateSync.persistWidgetState(str, jSONState, jsonObject, jsonObject2, g0u, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object syncNextWidgetState(java.lang.String r16, java.lang.String r17, java.lang.String r18, com.facebook.aura.conversation.repo.WidgetStateSyncSlot r19, X.HtJ<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchConversationWidgetStateSync.syncNextWidgetState(java.lang.String, java.lang.String, java.lang.String, com.facebook.aura.conversation.repo.WidgetStateSyncSlot, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HatchMessage updateWidgetState(String str, String str2, JSONState jSONState) {
        HatchConversationState value;
        HatchConversationState hatchConversationStateCopy$default;
        HatchMessage hatchMessage;
        BLG<HatchConversationState> blg = this.conversationState;
        do {
            value = blg.getValue();
            hatchConversationStateCopy$default = value;
            WidgetStateUpdateResult widgetStateUpdateResultUpdateWidgetStateInMessages = updateWidgetStateInMessages(hatchConversationStateCopy$default.messages, str, str2, jSONState);
            if (widgetStateUpdateResultUpdateWidgetStateInMessages.found) {
                hatchMessage = widgetStateUpdateResultUpdateWidgetStateInMessages.updatedMessage;
                if (widgetStateUpdateResultUpdateWidgetStateInMessages.changed) {
                    hatchConversationStateCopy$default = C60R.A0K(hatchConversationStateCopy$default, widgetStateUpdateResultUpdateWidgetStateInMessages.messages);
                }
            } else {
                WidgetStateUpdateResult widgetStateUpdateResultUpdateWidgetStateInMessages2 = updateWidgetStateInMessages(hatchConversationStateCopy$default.history, str, str2, jSONState);
                hatchMessage = widgetStateUpdateResultUpdateWidgetStateInMessages2.updatedMessage;
                if (widgetStateUpdateResultUpdateWidgetStateInMessages2.changed) {
                    hatchConversationStateCopy$default = HatchConversationState.copy$default(hatchConversationStateCopy$default, widgetStateUpdateResultUpdateWidgetStateInMessages2.messages, null, null, null, null, null, false, null, false, null, null, null, null, false, null, 32766, null);
                }
            }
        } while (!blg.A6e(value, hatchConversationStateCopy$default));
        return hatchMessage;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0179, code lost:
    
        r0.set(r3, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0181, code lost:
    
        return new com.facebook.aura.conversation.repo.WidgetStateUpdateResult(r0, r2, r2, r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.conversation.repo.WidgetStateUpdateResult updateWidgetStateInMessages(java.util.List<com.facebook.aura.model.HatchMessage> r49, java.lang.String r50, java.lang.String r51, com.facebook.aura.model.JSONState r52) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchConversationWidgetStateSync.updateWidgetStateInMessages(java.util.List, java.lang.String, java.lang.String, com.facebook.aura.model.JSONState):com.facebook.aura.conversation.repo.WidgetStateUpdateResult");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.model.WidgetStateSource widgetStateSource(com.facebook.aura.model.HatchMessage r4, java.lang.String r5) {
        /*
            r3 = this;
            java.util.List<com.facebook.aura.model.HatchWidget> r0 = r4.widgets
            r3 = 0
            if (r0 == 0) goto L26
            java.util.Iterator r2 = r0.iterator()
        L9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L51
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.facebook.aura.model.HatchWidget r0 = (com.facebook.aura.model.HatchWidget) r0
            java.lang.String r0 = r0.widgetId
            boolean r0 = X.C7384Etj.areEqual(r0, r5)
            if (r0 == 0) goto L9
        L1e:
            com.facebook.aura.model.HatchWidget r1 = (com.facebook.aura.model.HatchWidget) r1
            if (r1 == 0) goto L26
            com.facebook.aura.model.JSONState r0 = r1.state
            if (r0 != 0) goto L49
        L26:
            java.util.List<com.facebook.aura.model.HatchWidgetPresentation> r0 = r4.presentations
            if (r0 == 0) goto L4e
            java.util.Iterator r2 = r0.iterator()
        L2e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L4f
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.facebook.aura.model.HatchWidgetPresentation r0 = (com.facebook.aura.model.HatchWidgetPresentation) r0
            boolean r0 = com.facebook.aura.model.HatchWidgetPresentationKt.matchesWidgetId(r0, r5)
            if (r0 == 0) goto L2e
        L41:
            com.facebook.aura.model.HatchWidgetPresentation r1 = (com.facebook.aura.model.HatchWidgetPresentation) r1
            if (r1 == 0) goto L4e
            com.facebook.aura.model.JSONState r0 = r1.getState()
        L49:
            com.facebook.aura.model.WidgetStateSource r3 = new com.facebook.aura.model.WidgetStateSource
            r3.<init>(r4, r5, r0)
        L4e:
            return r3
        L4f:
            r1 = r3
            goto L41
        L51:
            r1 = r3
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchConversationWidgetStateSync.widgetStateSource(com.facebook.aura.model.HatchMessage, java.lang.String):com.facebook.aura.model.WidgetStateSource");
    }

    private final HatchWidget inlineWidgetFromHostMessage(List<HatchMessage> list, String str, String str2) {
        HatchWidget hatchWidget;
        HatchMessage next;
        List<HatchWidget> list2;
        Iterator<HatchMessage> it = list.iterator();
        while (true) {
            hatchWidget = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C7384Etj.areEqual(next.id, str)) {
                break;
            }
        }
        HatchMessage hatchMessage = next;
        if (hatchMessage == null || (list2 = hatchMessage.widgets) == null) {
            return null;
        }
        Iterator<HatchWidget> it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            HatchWidget next2 = it2.next();
            if (C7384Etj.areEqual(next2.widgetId, str2)) {
                hatchWidget = next2;
                break;
            }
        }
        return hatchWidget;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object setWidgetStateDocument(String str, JsonObject jsonObject, long j, HtJ<? super WidgetStateMutationResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C113822(str, jsonObject, j, this, null));
    }

    private final HatchWidgetPresentation widgetPresentationFromHostMessage(List<HatchMessage> list, String str, String str2) {
        HatchWidgetPresentation hatchWidgetPresentation;
        HatchMessage next;
        List<HatchWidgetPresentation> list2;
        Iterator<HatchMessage> it = list.iterator();
        while (true) {
            hatchWidgetPresentation = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C7384Etj.areEqual(next.id, str)) {
                break;
            }
        }
        HatchMessage hatchMessage = next;
        if (hatchMessage == null || (list2 = hatchMessage.presentations) == null) {
            return null;
        }
        Iterator<HatchWidgetPresentation> it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            HatchWidgetPresentation next2 = it2.next();
            if (HatchWidgetPresentationKt.matchesWidgetId(next2, str2)) {
                hatchWidgetPresentation = next2;
                break;
            }
        }
        return hatchWidgetPresentation;
    }

    @Override // com.facebook.aura.model.WidgetStateMutationHost
    public WidgetStateSource captureWidgetState(String str, String str2) {
        Object next;
        HatchMessage next2;
        AnonymousClass003.A0u(str, str2);
        HatchConversationState value = this.conversationState.getValue();
        Iterator itA14 = C60O.A14(value);
        while (true) {
            if (!itA14.hasNext()) {
                next = null;
                break;
            }
            next = itA14.next();
            if (str.equals(((HatchMessage) next).id)) {
                break;
            }
        }
        HatchMessage hatchMessage = (HatchMessage) next;
        if (hatchMessage == null) {
            Iterator<HatchMessage> it = value.history.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
                if (str.equals(next2.id)) {
                    break;
                }
            }
            hatchMessage = next2;
            if (hatchMessage == null) {
                return null;
            }
        }
        return widgetStateSource(hatchMessage, str2);
    }

    @Override // com.facebook.aura.model.WidgetStateMutationHost
    public Object patchWidgetState(WidgetStateSource widgetStateSource, JsonObject jsonObject, G0U<? super JSONState, Boolean> g0u, HtJ<? super WidgetStateMutationResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(widgetStateSource, this, g0u, jsonObject, null));
    }

    @Override // com.facebook.aura.model.WidgetStateMutationHost
    public Object restoreWidgetState(String str, String str2, HtJ<? super WidgetStateSource> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C113802(str, str2, null));
    }
}
