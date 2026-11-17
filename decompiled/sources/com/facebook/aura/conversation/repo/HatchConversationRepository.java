package com.facebook.aura.conversation.repo;

import X.ADq;
import X.AGH;
import X.AIW;
import X.AbstractC05633ui;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC0882AGj;
import X.AbstractC0885AGm;
import X.AbstractC10623Hzj;
import X.AbstractC2159Azp;
import X.AbstractC2258BHp;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass602;
import X.BLG;
import X.BQG;
import X.C05573ua;
import X.C06827l3;
import X.C06G;
import X.C06H;
import X.C07739il;
import X.C0881AGi;
import X.C0924AIa;
import X.C0KA;
import X.C10533Hqc;
import X.C10543Hqv;
import X.C10571Hud;
import X.C10649I0t;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C22I;
import X.C2nw;
import X.C31u;
import X.C3Em;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C3pU;
import X.C60O;
import X.C60P;
import X.C60Q;
import X.C60R;
import X.C6ys;
import X.C7354EnR;
import X.C7380Etd;
import X.C7384Etj;
import X.C78W;
import X.C79;
import X.C7BY;
import X.C7Bq;
import X.C7LE;
import X.C7qW;
import X.C9286GCn;
import X.C9290GCr;
import X.C9jH;
import X.CFK;
import X.CUB;
import X.EnumC10460Hji;
import X.EuR;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.GAX;
import X.GAo;
import X.GDB;
import X.HoC;
import X.Hr7;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.Hxb;
import X.Hy1;
import X.HzC;
import X.HzP;
import X.HzR;
import X.InterfaceC7359EnW;
import android.content.Context;
import android.database.SQLException;
import android.location.Location;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.checkpoint.probe.HatchCheckpointGate;
import com.facebook.aura.commands.location.HatchLocationProvider;
import com.facebook.aura.components.reactions.AuraSingleTearKt;
import com.facebook.aura.conversation.api.ConversationLivePresentationHooks;
import com.facebook.aura.conversation.api.ConversationUserMessageHooks;
import com.facebook.aura.conversation.offline.HatchOfflineConversationRepository;
import com.facebook.aura.conversation.reactions.HatchReactionUsageStore;
import com.facebook.aura.conversation.repo.MC;
import com.facebook.aura.executors.AuraExecutors;
import com.facebook.aura.feed.repo.FeedRepositoryKt;
import com.facebook.aura.gateway.ConnectionClosed;
import com.facebook.aura.gateway.DeliveryAck;
import com.facebook.aura.gateway.DeliveryError;
import com.facebook.aura.gateway.HatchAgentExecution;
import com.facebook.aura.gateway.HatchDeltaAccumulator;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.HatchGatewayConnectionState;
import com.facebook.aura.gateway.HatchPresentationTokenBinderKt;
import com.facebook.aura.gateway.HatchSessionUpdate;
import com.facebook.aura.gateway.MarkChatAsSeenResult;
import com.facebook.aura.gateway.SessionUpdatedEvent;
import com.facebook.aura.gateway.TransportRejection;
import com.facebook.aura.gateway.service.GeofenceEventWorker;
import com.facebook.aura.gateway.service.HatchGatewayServiceManager;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.identity.provider.HatchIdentityProvider;
import com.facebook.aura.library.uicontrol.GoalUiCommandsKt;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import com.facebook.aura.livesession.api.LiveConversation;
import com.facebook.aura.livesession.api.LiveConversationReplies;
import com.facebook.aura.livesession.api.LiveSession;
import com.facebook.aura.livesession.api.LiveSessions;
import com.facebook.aura.livesession.api.LiveTranscript;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.model.AiIdentity;
import com.facebook.aura.model.HatchAttachment;
import com.facebook.aura.model.HatchChatEvent;
import com.facebook.aura.model.HatchDeltaTranscript;
import com.facebook.aura.model.HatchMessage;
import com.facebook.aura.model.HatchMessageKt;
import com.facebook.aura.model.HatchMessageOrigin;
import com.facebook.aura.model.HatchMessageRole;
import com.facebook.aura.model.HatchMessageSendStatus;
import com.facebook.aura.model.HatchMessageUnsendStatus;
import com.facebook.aura.model.HatchPresentationData;
import com.facebook.aura.model.HatchSendErrorCategory;
import com.facebook.aura.model.HatchSendMessage;
import com.facebook.aura.model.HatchTextEntitySegment;
import com.facebook.aura.model.HatchTranscriptKt;
import com.facebook.aura.model.HatchWidget;
import com.facebook.aura.model.HatchWidgetData;
import com.facebook.aura.model.HatchWidgetPresentation;
import com.facebook.aura.model.HatchWidgetPresentationKt;
import com.facebook.aura.model.ImageOptionsWidgetData;
import com.facebook.aura.model.JSONState;
import com.facebook.aura.model.OptionWidgetData;
import com.facebook.aura.model.PendingDiscussionItem;
import com.facebook.aura.model.ReplyAttribution;
import com.facebook.aura.model.ReplyAttributionSerializer;
import com.facebook.aura.model.SpaceConstructionStatus;
import com.facebook.aura.model.SpaceProposalPresentation;
import com.facebook.aura.model.SpaceProposalPresentationData;
import com.facebook.aura.model.WidgetStateMutationHost;
import com.facebook.aura.model.WidgetStateMutationResult;
import com.facebook.aura.model.WidgetStateSource;
import com.facebook.aura.network.api.JarvisPath;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import com.facebook.aura.notification.model.HatchChatLocalNotificationConfig;
import com.facebook.aura.notifications.push.ConversationNotificationState;
import com.facebook.aura.notifications.push.HatchChatNotificationIds;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import com.facebook.aura.perf.HatchConversationQplLogger;
import com.facebook.aura.perf.HatchNavTTRCCoordinator;
import com.facebook.aura.perf.HatchNavTTRCSpec;
import com.facebook.aura.qpl.startup.HatchStartupQpl;
import com.facebook.aura.qpl.startup.points.HatchStartupPoints;
import com.facebook.aura.status.repo.HatchBotStatusMuteStore;
import com.facebook.aura.utils.HatchStringUtils;
import com.facebook.aura.utils.HatchUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class HatchConversationRepository implements WidgetStateMutationHost {
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {new C7354EnR(HatchConversationRepository.class, "isStaticResponseRedactionEnabled", "isStaticResponseRedactionEnabled()Z", 0), new C7354EnR(HatchConversationRepository.class, "pauseQueuedSendExpiryWhileOffline", "getPauseQueuedSendExpiryWhileOffline()Z", 0)};
    public final C3Em<Unit> _assistantMessageStarted;
    public final C3Em<Unit> _attachmentsDropped;
    public final BLG<HatchConversationState> _conversationState;
    public final C3Em<String> _liveComposerHint;
    public final C3Em<HatchReactionLanding> _reactionLanded;
    public final C3Em<List<Long>> _removedMessageSeqs;
    public final C3Em<HatchSendErrorCategory> _sendFailed;
    public final BLG<SubAgentActivityState> _subAgentActivity;
    public final C3Em<List<HatchMessage>> _tombstonedMessages;
    public final HatchDeltaAccumulator accumulator;
    public volatile Long activeMessageSeq;
    public final Set<String> activeReplyToIds;
    public final Context appContext;
    public final C22I<Unit> assistantMessageStarted;
    public final HatchConversationAttachmentBuilder attachmentBuilder;
    public final C22I<Unit> attachmentsDropped;
    public final C1BN<HatchConversationState> conversationState;
    public final Set<String> createdProvisionalTurnIds;
    public volatile boolean didSendStreamRequest;
    public final Set<String> escalatedSendRequestIds;
    public final HatchGatewayConnection gateway;
    public volatile HatchNavTTRCCoordinator.TraceToken gatewayConnectToken;
    public volatile boolean hasLoadedHistory;
    public final BLG<Long> historyRecoveryGeneration;
    public final Object historyRecoveryLock;
    public final HzR<Unit> historyRecoveryRequests;
    public final C31u isStaticResponseRedactionEnabled$delegate;
    public volatile Long lastSeq;
    public volatile String lastStartedAssistantMessageId;
    public final C22I<String> liveComposerHint;
    public final HatchConversationRepository$liveConversation$1 liveConversation;
    public final LiveTranscript liveTranscript;
    public final boolean loadHistoryOnConnect;
    public final HatchNavTTRCCoordinator navTtrcCoordinator;
    public volatile long networkRestoredAtMs;
    public final C31u pauseQueuedSendExpiryWhileOffline$delegate;
    public String pendingMessageInFlightRequestId;
    public final List<PendingMessage> pendingMessages;
    public final Object pendingMessagesLock;
    public String pendingTranscriptTurnId;
    public final HatchPrimarySessionRepository primarySessionRepository;
    public final ConcurrentHashMap<String, Long> processedEnvelopeSeqs;
    public final HatchConversationQplLogger qplLogger;
    public final C22I<HatchReactionLanding> reactionLanded;
    public volatile Long reconnectingSinceMs;
    public final C22I<List<Long>> removedMessageSeqs;
    public final C06827l3 replyPreviewStripRegex;
    public final Set<String> resentRequestIds;
    public final C3UX scope;
    public final C22I<HatchSendErrorCategory> sendFailed;
    public final ConcurrentHashMap<String, HoC> sendWatchdogs;
    public final String sessionId;
    public HoC settledStreamRecoveryJob;
    public final C3Em<Unit> streamActivityTick;
    public HoC streamIdleWatchdogJob;
    public final Set<String> streamIdsAwaitingSettle;
    public final C1BN<SubAgentActivityState> subAgentActivity;
    public final boolean subscribeToThread;
    public final HatchThreadsRepository threadsRepository;
    public final C22I<List<HatchMessage>> tombstonedMessages;
    public long transcriptFlushGeneration;
    public HoC transcriptFlushJob;
    public final Object transcriptFlushLock;
    public final ConcurrentHashMap<String, Integer> transportRejectionRetries;
    public final ConcurrentHashMap<String, HoC> transportRejectionRetryJobs;
    public final AbstractC3358CGz userSession;
    public final HatchConversationWidgetStateSync widgetStateSync;

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository$1", f = "HatchConversationRepository.kt", l = {5021}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public Object L$1;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository$1$1", f = "HatchConversationRepository.kt", l = {721}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00941 extends AbstractC07127nr implements G0V<Unit, HtJ<? super Unit>, Object> {
            public int label;
            public final /* synthetic */ HatchConversationRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00941(HatchConversationRepository hatchConversationRepository, HtJ<? super C00941> htJ) {
                super(2, htJ);
                this.this$0 = hatchConversationRepository;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C00941(this.this$0, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchConversationRepository hatchConversationRepository = this.this$0;
                    this.label = 1;
                    if (hatchConversationRepository.reloadHistory(this) == enumC10460Hji) {
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
            public final Object invoke(Unit unit, HtJ<? super Unit> htJ) {
                return new C00941(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationRepository.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C22I<Unit> c22i = HatchConversationHistoryReloads.Companion.getInstance(HatchConversationRepository.this.userSession).requests;
                C00941 c00941 = new C00941(HatchConversationRepository.this, null);
                C7384Etj.A0Z(c22i, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.FlowKt__CollectKt.collectLatest>");
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (C3pU.A00(this, c00941, c22i) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0Q("SharedFlow never completes, this call should never return.");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchConversationRepository.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository$10", f = "HatchConversationRepository.kt", l = {926}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$10, reason: invalid class name */
    public final class AnonymousClass10 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass10(HtJ<? super AnonymousClass10> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationRepository.this.new AnonymousClass10(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchConversationRepository.this.new AnonymousClass10(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C22I<DeliveryError> c22i = HatchConversationRepository.this.gateway.getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().deliveryErrors;
                final HatchConversationRepository hatchConversationRepository = HatchConversationRepository.this;
                C20Z<? super DeliveryError> c20z = new C20Z() { // from class: com.facebook.aura.conversation.repo.HatchConversationRepository.10.1
                    public final Object emit(DeliveryError deliveryError, HtJ<? super Unit> htJ) {
                        String str = deliveryError.requestId;
                        HatchConversationQplLogger hatchConversationQplLogger = hatchConversationRepository.qplLogger;
                        if (str != null) {
                            String str2 = deliveryError.errorCode;
                            hatchConversationQplLogger.failDeliveryAndTurn(str, "server_error", str2, deliveryError.errorMessage, str2);
                            HatchConversationRepository.updateMessageSendStatus$default(hatchConversationRepository, str, HatchMessageSendStatus.FAILED, deliveryError.errorMessage, deliveryError.category, null, 16, null);
                            if (hatchConversationRepository.completePendingMessage(str)) {
                                hatchConversationRepository.flushPendingMessages();
                            }
                        } else {
                            String str3 = deliveryError.errorCode;
                            hatchConversationQplLogger.failAllTraces("server_error", str3, deliveryError.errorMessage, str3);
                        }
                        return Unit.INSTANCE;
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((DeliveryError) obj2, (HtJ<? super Unit>) htJ);
                    }
                };
                this.label = 1;
                if (c22i.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0p();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository$11", f = "HatchConversationRepository.kt", l = {957}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$11, reason: invalid class name */
    public final class AnonymousClass11 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass11(HtJ<? super AnonymousClass11> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationRepository.this.new AnonymousClass11(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchConversationRepository.this.new AnonymousClass11(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C22I<TransportRejection> c22i = HatchConversationRepository.this.gateway.getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().transportRejections;
                final HatchConversationRepository hatchConversationRepository = HatchConversationRepository.this;
                C20Z<? super TransportRejection> c20z = new C20Z() { // from class: com.facebook.aura.conversation.repo.HatchConversationRepository.11.1
                    public final Object emit(TransportRejection transportRejection, HtJ<? super Unit> htJ) {
                        int iIntValue;
                        HatchConversationState value;
                        HatchConversationState hatchConversationStateCopy$default;
                        String str = transportRejection.requestId;
                        if (str != null) {
                            List<HatchMessage> list = C60O.A04(hatchConversationRepository).messages;
                            if ((list instanceof Collection) && list.isEmpty()) {
                                hatchConversationRepository.releaseRejectedSend(str);
                            } else {
                                Iterator<HatchMessage> it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    if (str.equals(C60Q.A0K(it).requestId)) {
                                        HoC hoCRemove = hatchConversationRepository.sendWatchdogs.remove(str);
                                        if (hoCRemove != null) {
                                            hoCRemove.A5w(null);
                                        }
                                        Integer numMerge = hatchConversationRepository.transportRejectionRetries.merge(str, C3cG.A0R(1), new BiFunction() { // from class: com.facebook.aura.conversation.repo.HatchConversationRepository$11$1$attempt$1
                                            @Override // java.util.function.BiFunction
                                            public /* bridge */ /* synthetic */ Object apply(Object obj2, Object obj3) {
                                                return Integer.valueOf(AnonymousClass001.A0F(obj2) + AnonymousClass001.A0F(obj3));
                                            }

                                            public final Integer apply(int i2, int i3) {
                                                return Integer.valueOf(i2 + i3);
                                            }
                                        });
                                        if (numMerge != null) {
                                            iIntValue = numMerge.intValue();
                                            if (iIntValue > 6) {
                                                CFK.A06("HatchConversationRepository", FGI.A0h("Transport rejection for ", str, ": ", transportRejection.errorCode, "; out of retries, marking FAILED/TRANSPORT"));
                                                HatchConversationRepository.updateMessageSendStatus$default(hatchConversationRepository, str, HatchMessageSendStatus.FAILED, null, HatchSendErrorCategory.TRANSPORT, null, 20, null);
                                                BLG<HatchConversationState> blg = hatchConversationRepository._conversationState;
                                                do {
                                                    value = blg.getValue();
                                                    hatchConversationStateCopy$default = value;
                                                    if (hatchConversationStateCopy$default.streamingState == StreamingState.PendingResponse) {
                                                        hatchConversationStateCopy$default = HatchConversationState.copy$default(hatchConversationStateCopy$default, null, null, StreamingState.Done, null, null, null, false, null, false, null, null, null, null, false, null, 32763, null);
                                                    }
                                                } while (!blg.A6e(value, hatchConversationStateCopy$default));
                                            }
                                        } else {
                                            iIntValue = 1;
                                        }
                                        long jTransportRejectionRetryDelayMs = hatchConversationRepository.transportRejectionRetryDelayMs(iIntValue);
                                        String str2 = transportRejection.errorCode;
                                        StringBuilder sbA0x = C3cI.A0x("Transport rejection for ", str);
                                        sbA0x.append(": ");
                                        sbA0x.append(str2);
                                        sbA0x.append("; silent retry ");
                                        sbA0x.append(iIntValue);
                                        sbA0x.append(" in ");
                                        sbA0x.append(jTransportRejectionRetryDelayMs);
                                        CFK.A05("HatchConversationRepository", AnonymousClass001.A0v("ms", sbA0x));
                                        HatchConversationRepository hatchConversationRepository2 = hatchConversationRepository;
                                        C3UX c3ux = hatchConversationRepository2.scope;
                                        C10533Hqc c10533HqcA02 = GAo.A02(C79.A01, C6ys.A00, new HatchConversationRepository$11$1$retry$1(jTransportRejectionRetryDelayMs, hatchConversationRepository2, str, null), c3ux);
                                        HatchConversationRepository hatchConversationRepository3 = hatchConversationRepository;
                                        synchronized (hatchConversationRepository3.pendingMessagesLock) {
                                            HoC hoCPut = hatchConversationRepository3.transportRejectionRetryJobs.put(str, c10533HqcA02);
                                            if (hoCPut != null) {
                                                hoCPut.A5w(null);
                                            }
                                        }
                                        c10533HqcA02.Afv();
                                    }
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((TransportRejection) obj2, (HtJ<? super Unit>) htJ);
                    }
                };
                this.label = 1;
                if (c22i.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0p();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository$12", f = "HatchConversationRepository.kt", l = {AuraSingleTearKt.SINGLE_TEAR_TOTAL_MS}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$12, reason: invalid class name */
    public final class AnonymousClass12 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass12(HtJ<? super AnonymousClass12> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationRepository.this.new AnonymousClass12(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchConversationRepository.this.new AnonymousClass12(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final HatchConversationRepository hatchConversationRepository = HatchConversationRepository.this;
                C22I<ConnectionClosed> c22i = hatchConversationRepository.gateway.connectionClosedEvents;
                C20Z<? super ConnectionClosed> c20z = new C20Z() { // from class: com.facebook.aura.conversation.repo.HatchConversationRepository.12.1
                    public final Object emit(ConnectionClosed connectionClosed, HtJ<? super Unit> htJ) {
                        HatchConversationQplLogger hatchConversationQplLogger = hatchConversationRepository.qplLogger;
                        int i2 = connectionClosed.code;
                        hatchConversationQplLogger.failAllTraces("ws_closed", FGI.A0H("ws_close_", i2), connectionClosed.reason, String.valueOf(i2));
                        return Unit.INSTANCE;
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((ConnectionClosed) obj2, (HtJ<? super Unit>) htJ);
                    }
                };
                this.label = 1;
                if (c22i.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0p();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository$13", f = "HatchConversationRepository.kt", l = {1033}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$13, reason: invalid class name */
    public final class AnonymousClass13 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$13$1, reason: invalid class name */
        public final class AnonymousClass1<T> implements C20Z {
            public final /* synthetic */ HatchConversationRepository this$0;

            public AnonymousClass1(HatchConversationRepository hatchConversationRepository) {
                this.this$0 = hatchConversationRepository;
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(boolean r6, X.HtJ<? super kotlin.Unit> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.facebook.aura.conversation.repo.HatchConversationRepository$13$1$emit$1
                    if (r0 == 0) goto L45
                    r4 = r7
                    com.facebook.aura.conversation.repo.HatchConversationRepository$13$1$emit$1 r4 = (com.facebook.aura.conversation.repo.HatchConversationRepository$13$1$emit$1) r4
                    int r2 = r4.label
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r0 = r2 & r1
                    if (r0 == 0) goto L45
                    int r2 = r2 - r1
                    r4.label = r2
                L12:
                    java.lang.Object r3 = r4.result
                    X.Hji r2 = X.EnumC10460Hji.A02
                    int r0 = r4.label
                    r1 = 1
                    if (r0 == 0) goto L28
                    if (r0 != r1) goto L4b
                    X.Hwg.A00(r3)
                L20:
                    com.facebook.aura.conversation.repo.HatchConversationRepository r0 = r5.this$0
                    com.facebook.aura.conversation.repo.HatchConversationRepository.access$scanStaleSendingMessages(r0)
                L25:
                    kotlin.Unit r2 = kotlin.Unit.INSTANCE
                    return r2
                L28:
                    X.Hwg.A00(r3)
                    com.facebook.aura.conversation.repo.HatchConversationRepository r0 = r5.this$0
                    if (r6 == 0) goto L3f
                    com.facebook.aura.conversation.repo.HatchConversationRepository.access$requestHistoryRecovery(r0)
                    r4.Z$0 = r6
                    r4.label = r1
                    r0 = 5000(0x1388, double:2.4703E-320)
                    java.lang.Object r0 = X.C7Bq.A01(r0, r4)
                    if (r0 != r2) goto L20
                    return r2
                L3f:
                    com.facebook.aura.perf.HatchConversationQplLogger r0 = r0.qplLogger
                    r0.cancelBackgroundAllAgentSendTraces()
                    goto L25
                L45:
                    com.facebook.aura.conversation.repo.HatchConversationRepository$13$1$emit$1 r4 = new com.facebook.aura.conversation.repo.HatchConversationRepository$13$1$emit$1
                    r4.<init>(r5, r7)
                    goto L12
                L4b:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchConversationRepository.AnonymousClass13.AnonymousClass1.emit(boolean, X.HtJ):java.lang.Object");
            }

            @Override // X.C20Z
            public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ) {
                return emit(AnonymousClass001.A1X(obj), (HtJ<? super Unit>) htJ);
            }
        }

        public AnonymousClass13(HtJ<? super AnonymousClass13> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationRepository.this.new AnonymousClass13(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchConversationRepository.this.new AnonymousClass13(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C20Q<Boolean> c20q = AuraAppLifecycleManager.isAppInForegroundFlow;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(HatchConversationRepository.this);
                this.label = 1;
                if (c20q.collect(anonymousClass1, this) == enumC10460Hji) {
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
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository$14", f = "HatchConversationRepository.kt", l = {1047, 1048, 1057}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$14, reason: invalid class name */
    public final class AnonymousClass14 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public long J$0;
        public long J$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository$14$1", f = "HatchConversationRepository.kt", l = {1058, 1064, 1067}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$14$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ long $generation;
            public final /* synthetic */ C10543Hqv<Long> $recoveredThroughSeq;
            public Object L$0;
            public int label;
            public final /* synthetic */ HatchConversationRepository this$0;

            @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository$14$1$1", f = "HatchConversationRepository.kt", l = {}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$14$1$1, reason: invalid class name and collision with other inner class name */
            public final class C00951 extends AbstractC07127nr implements G0V<HatchConversationState, HtJ<? super Boolean>, Object> {
                public /* synthetic */ Object L$0;
                public int label;

                public C00951(HtJ<? super C00951> htJ) {
                    super(2, htJ);
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    C00951 c00951 = new C00951(htJ);
                    c00951.L$0 = obj;
                    return c00951;
                }

                @Override // X.G0V
                public final Object invoke(HatchConversationState hatchConversationState, HtJ<? super Boolean> htJ) {
                    C00951 c00951 = new C00951(htJ);
                    c00951.L$0 = hatchConversationState;
                    return c00951.invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
                @Override // X.AbstractC8884Fsp
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                    /*
                        r2 = this;
                        java.lang.Object r1 = r2.L$0
                        com.facebook.aura.conversation.repo.HatchConversationState r1 = (com.facebook.aura.conversation.repo.HatchConversationState) r1
                        int r0 = r2.label
                        if (r0 != 0) goto L1c
                        X.Hwg.A00(r3)
                        com.facebook.aura.conversation.repo.HistoryLoadingState r2 = r1.historyLoadingState
                        com.facebook.aura.conversation.repo.HistoryLoadingState r0 = com.facebook.aura.conversation.repo.HistoryLoadingState.LOADING
                        if (r2 == r0) goto L16
                        com.facebook.aura.conversation.repo.HistoryLoadingState r1 = com.facebook.aura.conversation.repo.HistoryLoadingState.REFRESHING
                        r0 = 1
                        if (r2 != r1) goto L17
                    L16:
                        r0 = 0
                    L17:
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                        return r0
                    L1c:
                        java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchConversationRepository.AnonymousClass14.AnonymousClass1.C00951.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HatchConversationRepository hatchConversationRepository, long j, C10543Hqv<Long> c10543Hqv, HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
                this.this$0 = hatchConversationRepository;
                this.$generation = j;
                this.$recoveredThroughSeq = c10543Hqv;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass1(this.this$0, this.$generation, this.$recoveredThroughSeq, htJ);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
            /* JADX WARN: Type inference failed for: r9v2 */
            /* JADX WARN: Type inference failed for: r9v4, types: [T] */
            /* JADX WARN: Type inference failed for: r9v5 */
            /* JADX WARN: Type inference failed for: r9v6 */
            @Override // X.AbstractC8884Fsp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    X.Hji r4 = X.EnumC10460Hji.A02
                    int r0 = r8.label
                    r7 = 3
                    r3 = 2
                    r5 = 1
                    if (r0 == 0) goto L25
                    if (r0 == r5) goto L3b
                    if (r0 == r3) goto L21
                    if (r0 != r7) goto L79
                    java.lang.Object r5 = r8.L$0
                    X.Hqv r5 = (X.C10543Hqv) r5
                    X.Hwg.A00(r9)
                L16:
                    if (r9 != 0) goto L1c
                    X.Hqv<java.lang.Long> r0 = r8.$recoveredThroughSeq
                    T r9 = r0.element
                L1c:
                    r5.element = r9
                L1e:
                    kotlin.Unit r4 = kotlin.Unit.INSTANCE
                    return r4
                L21:
                    X.Hwg.A00(r9)
                    goto L1e
                L25:
                    X.Hwg.A00(r9)
                    com.facebook.aura.conversation.repo.HatchConversationRepository r0 = r8.this$0
                    X.BLG<com.facebook.aura.conversation.repo.HatchConversationState> r2 = r0._conversationState
                    r1 = 0
                    com.facebook.aura.conversation.repo.HatchConversationRepository$14$1$1 r0 = new com.facebook.aura.conversation.repo.HatchConversationRepository$14$1$1
                    r0.<init>(r1)
                    r8.label = r5
                    java.lang.Object r0 = X.AbstractC9777Gfy.A00(r8, r0, r2)
                    if (r0 != r4) goto L3e
                    return r4
                L3b:
                    X.Hwg.A00(r9)
                L3e:
                    long r5 = r8.$generation
                    com.facebook.aura.conversation.repo.HatchConversationRepository r0 = r8.this$0
                    X.BLG<java.lang.Long> r0 = r0.historyRecoveryGeneration
                    long r1 = X.C3cH.A08(r0)
                    int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                    if (r0 != 0) goto L1e
                    com.facebook.aura.conversation.repo.HatchConversationRepository r0 = r8.this$0
                    boolean r0 = r0.hasLoadedHistory
                    if (r0 != 0) goto L60
                    com.facebook.aura.conversation.repo.HatchConversationRepository r2 = r8.this$0
                    r8.label = r3
                    r1 = 10
                    r0 = 0
                    java.lang.Object r0 = r2.loadChatHistory(r1, r0, r0, r8)
                    if (r0 != r4) goto L1e
                    return r4
                L60:
                    X.Hqv<java.lang.Long> r5 = r8.$recoveredThroughSeq
                    com.facebook.aura.conversation.repo.HatchConversationRepository r3 = r8.this$0
                    long r1 = r8.$generation
                    T r0 = r5.element
                    java.lang.Long r0 = (java.lang.Long) r0
                    if (r0 != 0) goto L6e
                    java.lang.Long r0 = r3.lastSeq
                L6e:
                    r8.L$0 = r5
                    r8.label = r7
                    java.lang.Object r9 = com.facebook.aura.conversation.repo.HatchConversationRepository.access$recoverHistory(r3, r1, r0, r8)
                    if (r9 != r4) goto L16
                    return r4
                L79:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchConversationRepository.AnonymousClass14.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass14(HtJ<? super AnonymousClass14> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationRepository.this.new AnonymousClass14(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchConversationRepository.this.new AnonymousClass14(htJ).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00da  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00b6 -> B:14:0x0045). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00d1 -> B:14:0x0045). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r16) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 221
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchConversationRepository.AnonymousClass14.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository$15", f = "HatchConversationRepository.kt", l = {1086}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$15, reason: invalid class name */
    public final class AnonymousClass15 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass15(HtJ<? super AnonymousClass15> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationRepository.this.new AnonymousClass15(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchConversationRepository.this.new AnonymousClass15(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final HatchConversationRepository hatchConversationRepository = HatchConversationRepository.this;
                C05573ua c05573uaA01 = AbstractC05633ui.A01(new HatchConversationRepository$15$invokeSuspend$$inlined$map$2(GDB.A01(new HatchConversationRepository$15$invokeSuspend$$inlined$map$1(hatchConversationRepository._conversationState))), hatchConversationRepository.streamActivityTick);
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.conversation.repo.HatchConversationRepository.15.3
                    public final Object emit(Unit unit, HtJ<? super Unit> htJ) {
                        StreamingState streamingState = C60O.A04(hatchConversationRepository).streamingState;
                        StreamingState streamingState2 = StreamingState.Done;
                        HatchConversationRepository hatchConversationRepository2 = hatchConversationRepository;
                        if (streamingState == streamingState2) {
                            HoC hoC = hatchConversationRepository2.streamIdleWatchdogJob;
                            if (hoC != null) {
                                hoC.A5w(null);
                            }
                            HatchConversationRepository hatchConversationRepository3 = hatchConversationRepository;
                            hatchConversationRepository3.streamIdleWatchdogJob = null;
                            hatchConversationRepository3.requestHistoryRecovery();
                        } else {
                            hatchConversationRepository2.armStreamIdleWatchdog();
                        }
                        return Unit.INSTANCE;
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((Unit) obj2, (HtJ<? super Unit>) htJ);
                    }
                };
                this.label = 1;
                if (c05573uaA01.collect(c20z, this) == enumC10460Hji) {
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
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository$16", f = "HatchConversationRepository.kt", l = {1098}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$16, reason: invalid class name */
    public final class AnonymousClass16 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass16(HtJ<? super AnonymousClass16> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationRepository.this.new AnonymousClass16(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchConversationRepository.this.new AnonymousClass16(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C22I<SessionUpdatedEvent> c22i = HatchConversationRepository.this.gateway.getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().sessionUpdatedEvents;
                final HatchConversationRepository hatchConversationRepository = HatchConversationRepository.this;
                C20Z<? super SessionUpdatedEvent> c20z = new C20Z() { // from class: com.facebook.aura.conversation.repo.HatchConversationRepository.16.1
                    public final Object emit(SessionUpdatedEvent sessionUpdatedEvent, HtJ<? super Unit> htJ) {
                        HatchConversationRepository hatchConversationRepository2 = hatchConversationRepository;
                        String str = hatchConversationRepository2.sessionId;
                        if (str != null && str.equals(sessionUpdatedEvent.sessionId)) {
                            HatchSessionUpdate hatchSessionUpdate = sessionUpdatedEvent.sessionUpdate;
                            if (hatchSessionUpdate != null) {
                                hatchConversationRepository2.threadsRepository.applySessionUpdate(hatchSessionUpdate);
                            }
                            if ("activity".equals(sessionUpdatedEvent.change)) {
                                HatchConversationRepository hatchConversationRepository3 = hatchConversationRepository;
                                hatchConversationRepository3.gateway.confirmThreadSession(hatchConversationRepository3.sessionId);
                                hatchConversationRepository.requestHistoryRecovery();
                            }
                        }
                        return Unit.INSTANCE;
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((SessionUpdatedEvent) obj2, (HtJ<? super Unit>) htJ);
                    }
                };
                this.label = 1;
                if (c22i.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0p();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository$17", f = "HatchConversationRepository.kt", l = {1118}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$17, reason: invalid class name */
    public final class AnonymousClass17 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchIdentityProvider $identityProvider;
        public int label;
        public final /* synthetic */ HatchConversationRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass17(HatchIdentityProvider hatchIdentityProvider, HatchConversationRepository hatchConversationRepository, HtJ<? super AnonymousClass17> htJ) {
            super(2, htJ);
            this.$identityProvider = hatchIdentityProvider;
            this.this$0 = hatchConversationRepository;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass17(this.$identityProvider, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C1BN<AiIdentity> c1bn = this.$identityProvider.aiIdentity;
                final HatchConversationRepository hatchConversationRepository = this.this$0;
                C20Q c20qA01 = GDB.A01(new HatchConversationRepository$17$invokeSuspend$$inlined$map$1(c1bn, hatchConversationRepository));
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.conversation.repo.HatchConversationRepository.17.2
                    public final Object emit(String str, HtJ<? super Unit> htJ) {
                        HatchConversationState value;
                        BLG<HatchConversationState> blg = hatchConversationRepository._conversationState;
                        do {
                            value = blg.getValue();
                        } while (!blg.A6e(value, HatchConversationState.copy$default(value, null, null, null, null, null, null, false, null, false, null, null, null, str, false, null, 28671, null)));
                        return Unit.INSTANCE;
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((String) obj2, (HtJ<? super Unit>) htJ);
                    }
                };
                this.label = 1;
                if (c20qA01.collect(c20z, this) == enumC10460Hji) {
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
            return ((AnonymousClass17) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository$2", f = "HatchConversationRepository.kt", l = {726}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationRepository.this.new AnonymousClass2(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchConversationRepository.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AnonymousClass602 anonymousClass602A00 = AnonymousClass602.A00(HatchGatewayPrefsStore.Companion.getInstance(HatchConversationRepository.this.userSession).hatcheryVmIdFlow);
                final HatchConversationRepository hatchConversationRepository = HatchConversationRepository.this;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.conversation.repo.HatchConversationRepository.2.1
                    public final Object emit(String str, HtJ<? super Unit> htJ) {
                        hatchConversationRepository.clearChat();
                        HatchConversationRepository hatchConversationRepository2 = hatchConversationRepository;
                        if (hatchConversationRepository2.sessionId == null) {
                            HatchOfflineConversationRepository.Companion.getInstance(hatchConversationRepository2.userSession).keepOnlyVm(str);
                        }
                        return Unit.INSTANCE;
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((String) obj2, (HtJ<? super Unit>) htJ);
                    }
                };
                this.label = 1;
                if (anonymousClass602A00.collect(c20z, this) == enumC10460Hji) {
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
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository$3", f = "HatchConversationRepository.kt", l = {734}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass3(HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationRepository.this.new AnonymousClass3(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchConversationRepository.this.new AnonymousClass3(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C22I<HatchChatEvent> c22i = HatchConversationRepository.this.gateway.getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().chatEvents;
                final HatchConversationRepository hatchConversationRepository = HatchConversationRepository.this;
                C20Z<? super HatchChatEvent> c20z = new C20Z() { // from class: com.facebook.aura.conversation.repo.HatchConversationRepository.3.1
                    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
                    /* JADX WARN: Removed duplicated region for block: B:30:0x0069 A[PHI: r5
  0x0069: PHI (r5v1 java.lang.String) = (r5v0 java.lang.String), (r5v5 java.lang.String) binds: [B:12:0x002b, B:20:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Removed duplicated region for block: B:41:0x008c  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(com.facebook.aura.model.HatchChatEvent r9, X.HtJ<? super kotlin.Unit> r10) {
                        /*
                            r8 = this;
                            r2 = 0
                            com.facebook.aura.conversation.repo.HatchConversationRepository r0 = r1
                            java.lang.String r1 = r0.sessionId
                            com.facebook.aura.conversation.repo.HatchPrimarySessionRepository r0 = r0.primarySessionRepository
                            X.1BN<java.lang.String> r0 = r0.primarySessionId
                            java.lang.Object r0 = r0.getValue()
                            java.lang.String r0 = (java.lang.String) r0
                            boolean r0 = com.facebook.aura.model.HatchGatewayEventKt.isInConversation(r9, r1, r0)
                            if (r0 != 0) goto L1f
                            java.lang.Class r0 = r9.getClass()
                            X.C0861A6i.A01(r0)
                        L1c:
                            kotlin.Unit r0 = kotlin.Unit.INSTANCE
                            return r0
                        L1f:
                            com.facebook.aura.model.CanonicalEventEnvelope r0 = r9.getEnvelope()
                            if (r0 == 0) goto L84
                            java.lang.Long r6 = r0.seq
                            if (r6 == 0) goto L84
                            java.lang.String r5 = r0.messageId
                            if (r5 != 0) goto L69
                            boolean r0 = r9 instanceof com.facebook.aura.model.HatchChatEvent.MessageUser
                            if (r0 == 0) goto L67
                            r0 = r9
                            com.facebook.aura.model.HatchChatEvent$MessageUser r0 = (com.facebook.aura.model.HatchChatEvent.MessageUser) r0
                            if (r0 == 0) goto L67
                            com.facebook.aura.model.HatchMessage r0 = r0.message
                            if (r0 == 0) goto L67
                            java.lang.String r5 = r0.id
                            if (r5 != 0) goto L69
                        L3e:
                            java.lang.String r7 = "__global__"
                        L40:
                            com.facebook.aura.conversation.repo.HatchConversationRepository r0 = r1
                            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r0 = r0.processedEnvelopeSeqs
                            java.lang.Object r0 = r0.get(r7)
                            java.lang.Number r0 = (java.lang.Number) r0
                            if (r0 == 0) goto L7d
                            long r3 = r6.longValue()
                            long r1 = r0.longValue()
                            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                            if (r0 > 0) goto L7d
                            java.lang.Class r0 = r9.getClass()
                            X.C0861A6i.A01(r0)
                            if (r5 == 0) goto L1c
                            r0 = 20
                            X.BQG.A17(r5, r0)
                            goto L1c
                        L67:
                            r5 = r2
                            goto L3e
                        L69:
                            boolean r0 = r9 instanceof com.facebook.aura.model.HatchChatEvent.MessageUser
                            if (r0 == 0) goto L74
                            java.lang.String r0 = "message.user:"
                        L6f:
                            java.lang.String r7 = X.FGI.A0M(r0, r5)
                            goto L40
                        L74:
                            boolean r0 = r9 instanceof com.facebook.aura.model.HatchChatEvent.MessageAssistant
                            if (r0 == 0) goto L7b
                            java.lang.String r0 = "message.assistant:"
                            goto L6f
                        L7b:
                            r7 = r5
                            goto L40
                        L7d:
                            com.facebook.aura.conversation.repo.HatchConversationRepository r0 = r1
                            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r0 = r0.processedEnvelopeSeqs
                            r0.put(r7, r6)
                        L84:
                            com.facebook.aura.conversation.repo.HatchConversationRepository r0 = r1
                            boolean r0 = com.facebook.aura.conversation.repo.HatchConversationRepository.access$handleUserLiveTranscriptEvent(r0, r9)
                            if (r0 != 0) goto L1c
                            com.facebook.aura.conversation.repo.HatchConversationRepository r0 = r1
                            com.facebook.aura.perf.HatchConversationQplLogger r0 = r0.qplLogger
                            java.lang.String r1 = r0.handleConversationEvent(r9)
                            com.facebook.aura.conversation.repo.HatchConversationRepository r0 = r1
                            com.facebook.aura.conversation.repo.HatchConversationRepository.access$handleChatEvent(r0, r9, r1)
                            com.facebook.aura.conversation.repo.HatchConversationRepository r0 = r1
                            com.facebook.aura.conversation.repo.HatchConversationState r0 = X.C60O.A04(r0)
                            com.facebook.aura.conversation.repo.StreamingState r1 = r0.streamingState
                            com.facebook.aura.conversation.repo.StreamingState r0 = com.facebook.aura.conversation.repo.StreamingState.Done
                            if (r1 == r0) goto L1c
                            com.facebook.aura.conversation.repo.HatchConversationRepository r0 = r1
                            X.3Em<kotlin.Unit> r0 = r0.streamActivityTick
                            X.C3cG.A1I(r0)
                            goto L1c
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchConversationRepository.AnonymousClass3.AnonymousClass1.emit(com.facebook.aura.model.HatchChatEvent, X.HtJ):java.lang.Object");
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((HatchChatEvent) obj2, (HtJ<? super Unit>) htJ);
                    }
                };
                this.label = 1;
                if (c22i.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0p();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository$4", f = "HatchConversationRepository.kt", l = {786}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass4(HtJ<? super AnonymousClass4> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationRepository.this.new AnonymousClass4(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchConversationRepository.this.new AnonymousClass4(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final HatchConversationRepository hatchConversationRepository = HatchConversationRepository.this;
                C10649I0t c10649I0t = new C10649I0t(hatchConversationRepository.gateway.protocol.primarySessionId, 2);
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.conversation.repo.HatchConversationRepository.4.1
                    public final Object emit(String str, HtJ<? super Unit> htJ) {
                        hatchConversationRepository.primarySessionRepository.setPrimarySessionId(str);
                        return Unit.INSTANCE;
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((String) obj2, (HtJ<? super Unit>) htJ);
                    }
                };
                this.label = 1;
                if (c10649I0t.collect(c20z, this) == enumC10460Hji) {
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
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository$5", f = "HatchConversationRepository.kt", l = {791}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass5(HtJ<? super AnonymousClass5> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationRepository.this.new AnonymousClass5(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchConversationRepository.this.new AnonymousClass5(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final HatchConversationRepository hatchConversationRepository = HatchConversationRepository.this;
                C10649I0t c10649I0t = new C10649I0t(hatchConversationRepository.primarySessionRepository.primarySessionId, 2);
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.conversation.repo.HatchConversationRepository.5.1
                    public final Object emit(String str, HtJ<? super Unit> htJ) {
                        hatchConversationRepository.gateway.setPrimarySessionId(str);
                        return Unit.INSTANCE;
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((String) obj2, (HtJ<? super Unit>) htJ);
                    }
                };
                this.label = 1;
                if (c10649I0t.collect(c20z, this) == enumC10460Hji) {
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
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository$6", f = "HatchConversationRepository.kt", l = {797}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass6(HtJ<? super AnonymousClass6> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationRepository.this.new AnonymousClass6(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchConversationRepository.this.new AnonymousClass6(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchConversationRepository hatchConversationRepository = HatchConversationRepository.this;
                String str = hatchConversationRepository.sessionId;
                this.label = 1;
                if (hatchConversationRepository.seedReplayCursorFromCache(str, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            HatchConversationRepository hatchConversationRepository2 = HatchConversationRepository.this;
            hatchConversationRepository2.gateway.subscribeToSession(hatchConversationRepository2.sessionId);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository$7", f = "HatchConversationRepository.kt", l = {803}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass7(HtJ<? super AnonymousClass7> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationRepository.this.new AnonymousClass7(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchConversationRepository.this.new AnonymousClass7(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final HatchConversationRepository hatchConversationRepository = HatchConversationRepository.this;
                C1BN<Boolean> c1bn = hatchConversationRepository.gateway.serviceRestartPending;
                C20Z<? super Boolean> c20z = new C20Z() { // from class: com.facebook.aura.conversation.repo.HatchConversationRepository.7.1
                    public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                        HatchConversationState value;
                        BLG<HatchConversationState> blg = hatchConversationRepository._conversationState;
                        do {
                            value = blg.getValue();
                        } while (!blg.A6e(value, HatchConversationState.copy$default(value, null, null, null, null, null, null, z, null, false, null, null, null, null, false, null, 32703, null)));
                        return Unit.INSTANCE;
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                    }
                };
                this.label = 1;
                if (c1bn.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0p();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository$8", f = "HatchConversationRepository.kt", l = {810}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$8, reason: invalid class name */
    public final class AnonymousClass8 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$8$1, reason: invalid class name */
        public final class AnonymousClass1<T> implements C20Z {
            public final /* synthetic */ HatchConversationRepository this$0;

            public AnonymousClass1(HatchConversationRepository hatchConversationRepository) {
                this.this$0 = hatchConversationRepository;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:67:0x013a  */
            /* JADX WARN: Type inference failed for: r14v0, types: [com.facebook.aura.gateway.HatchGatewayConnectionState, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r14v1 */
            /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(com.facebook.aura.gateway.HatchGatewayConnectionState r24, X.HtJ<? super kotlin.Unit> r25) {
                /*
                    Method dump skipped, instructions count: 326
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchConversationRepository.AnonymousClass8.AnonymousClass1.emit(com.facebook.aura.gateway.HatchGatewayConnectionState, X.HtJ):java.lang.Object");
            }

            @Override // X.C20Z
            public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ) {
                return emit((HatchGatewayConnectionState) obj, (HtJ<? super Unit>) htJ);
            }
        }

        public AnonymousClass8(HtJ<? super AnonymousClass8> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationRepository.this.new AnonymousClass8(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchConversationRepository.this.new AnonymousClass8(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchConversationRepository hatchConversationRepository = HatchConversationRepository.this;
                C1BN<HatchGatewayConnectionState> c1bn = hatchConversationRepository.gateway.connectionState;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(hatchConversationRepository);
                this.label = 1;
                if (c1bn.collect(anonymousClass1, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0p();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository$9", f = "HatchConversationRepository.kt", l = {901}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$9, reason: invalid class name */
    public final class AnonymousClass9 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass9(HtJ<? super AnonymousClass9> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationRepository.this.new AnonymousClass9(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchConversationRepository.this.new AnonymousClass9(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C22I<DeliveryAck> c22i = HatchConversationRepository.this.gateway.getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().deliveryAcks;
                final HatchConversationRepository hatchConversationRepository = HatchConversationRepository.this;
                C20Z<? super DeliveryAck> c20z = new C20Z() { // from class: com.facebook.aura.conversation.repo.HatchConversationRepository.9.1
                    public final Object emit(DeliveryAck deliveryAck, HtJ<? super Unit> htJ) {
                        HatchConversationRepository hatchConversationRepository2 = hatchConversationRepository;
                        if (hatchConversationRepository2.sessionId != null) {
                            List<HatchMessage> list = C60O.A04(hatchConversationRepository2).messages;
                            if (!(list instanceof Collection) || !list.isEmpty()) {
                                Iterator<HatchMessage> it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    if (C7384Etj.areEqual(C60Q.A0K(it).requestId, deliveryAck.requestId)) {
                                        HatchConversationRepository hatchConversationRepository3 = hatchConversationRepository;
                                        hatchConversationRepository3.gateway.confirmThreadSession(hatchConversationRepository3.sessionId);
                                        break;
                                    }
                                }
                            }
                        }
                        HatchConversationQplLogger hatchConversationQplLogger = hatchConversationRepository.qplLogger;
                        String str = deliveryAck.requestId;
                        String str2 = deliveryAck.serverMessageId;
                        hatchConversationQplLogger.onMessageIdReceived(str, str2, str2);
                        hatchConversationRepository.qplLogger.endDeliveryTrace(deliveryAck.requestId);
                        HatchConversationRepository.updateMessageSendStatus$default(hatchConversationRepository, deliveryAck.requestId, HatchMessageSendStatus.SENT, null, null, deliveryAck.serverMessageId, 12, null);
                        if (hatchConversationRepository.completePendingMessage(deliveryAck.requestId)) {
                            hatchConversationRepository.flushPendingMessages();
                        }
                        return Unit.INSTANCE;
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((DeliveryAck) obj2, (HtJ<? super Unit>) htJ);
                    }
                };
                this.label = 1;
                if (c22i.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0p();
        }
    }

    public final class MessageRemovalOutcome {
        public final List<HatchMessage> dropped;
        public final List<HatchMessage> kept;
        public final int strippedCarriers;
        public final List<HatchMessage> tombstoned;

        public final boolean getChanged() {
            return (this.dropped.isEmpty() && this.tombstoned.isEmpty() && this.strippedCarriers <= 0) ? false : true;
        }

        public final List<HatchMessage> getDropped() {
            return this.dropped;
        }

        public final List<HatchMessage> getKept() {
            return this.kept;
        }

        public final int getStrippedCarriers() {
            return this.strippedCarriers;
        }

        public final List<HatchMessage> getTombstoned() {
            return this.tombstoned;
        }

        public MessageRemovalOutcome(List<HatchMessage> list, List<HatchMessage> list2, List<HatchMessage> list3, int i) {
            AnonymousClass005.A0x(list, list2, list3);
            this.kept = list;
            this.dropped = list2;
            this.tombstoned = list3;
            this.strippedCarriers = i;
        }
    }

    public final class PendingMessage extends C06G {
        public final List<HatchAttachment> attachments;
        public final Map<String, Object> extraParams;
        public final String inReplyTo;
        public final String liveSessionTargetThreadId;
        public final String requestId;
        public final boolean routeToLiveSession;
        public final String text;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof PendingMessage) {
                    PendingMessage pendingMessage = (PendingMessage) obj;
                    if (!C7384Etj.areEqual(this.text, pendingMessage.text) || !C7384Etj.areEqual(this.attachments, pendingMessage.attachments) || !C7384Etj.areEqual(this.extraParams, pendingMessage.extraParams) || this.routeToLiveSession != pendingMessage.routeToLiveSession || !C7384Etj.areEqual(this.liveSessionTargetThreadId, pendingMessage.liveSessionTargetThreadId) || !C7384Etj.areEqual(this.inReplyTo, pendingMessage.inReplyTo) || !C7384Etj.areEqual(this.requestId, pendingMessage.requestId)) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PendingMessage copy$default(PendingMessage pendingMessage, String str, List list, Map map, boolean z, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = pendingMessage.text;
            }
            if ((i & 2) != 0) {
                list = pendingMessage.attachments;
            }
            if ((i & 4) != 0) {
                map = pendingMessage.extraParams;
            }
            if ((i & 8) != 0) {
                z = pendingMessage.routeToLiveSession;
            }
            if ((i & 16) != 0) {
                str2 = pendingMessage.liveSessionTargetThreadId;
            }
            if ((i & 32) != 0) {
                str3 = pendingMessage.inReplyTo;
            }
            if ((i & 64) != 0) {
                str4 = pendingMessage.requestId;
            }
            return pendingMessage.copy(str, list, map, z, str2, str3, str4);
        }

        public final String component1() {
            return this.text;
        }

        public final List<HatchAttachment> component2() {
            return this.attachments;
        }

        public final Map<String, Object> component3() {
            return this.extraParams;
        }

        public final boolean component4() {
            return this.routeToLiveSession;
        }

        public final String component5() {
            return this.liveSessionTargetThreadId;
        }

        public final String component6() {
            return this.inReplyTo;
        }

        public final String component7() {
            return this.requestId;
        }

        public final List<HatchAttachment> getAttachments() {
            return this.attachments;
        }

        public final Map<String, Object> getExtraParams() {
            return this.extraParams;
        }

        public final String getInReplyTo() {
            return this.inReplyTo;
        }

        public final String getLiveSessionTargetThreadId() {
            return this.liveSessionTargetThreadId;
        }

        public final String getRequestId() {
            return this.requestId;
        }

        public final boolean getRouteToLiveSession() {
            return this.routeToLiveSession;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.requestId, (((C0KA.A01(AnonymousClass005.A0F(this.extraParams, (AnonymousClass001.A0G(this.text) + AnonymousClass006.A0D(this.attachments)) * 31), this.routeToLiveSession) + AnonymousClass006.A0G(this.liveSessionTargetThreadId)) * 31) + AnonymousClass005.A0H(this.inReplyTo)) * 31);
        }

        public PendingMessage(String str, List<HatchAttachment> list, Map<String, ? extends Object> map, boolean z, String str2, String str3, String str4) {
            AnonymousClass003.A0v(str, map);
            C7384Etj.A0Y(str4, 6);
            this.text = str;
            this.attachments = list;
            this.extraParams = map;
            this.routeToLiveSession = z;
            this.liveSessionTargetThreadId = str2;
            this.inReplyTo = str3;
            this.requestId = str4;
        }

        public final PendingMessage copy(String str, List<HatchAttachment> list, Map<String, ? extends Object> map, boolean z, String str2, String str3, String str4) {
            AnonymousClass003.A0v(str, map);
            C7384Etj.A0Y(str4, 6);
            return new PendingMessage(str, list, map, z, str2, str3, str4);
        }

        public String toString() {
            return super.toString();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository$armSendWatchdog$1", f = "HatchConversationRepository.kt", l = {1366}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$armSendWatchdog$1, reason: invalid class name and case insensitive filesystem */
    public final class C113521 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $requestId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C113521(String str, HtJ<? super C113521> htJ) {
            super(2, htJ);
            this.$requestId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationRepository.this.new C113521(this.$requestId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HatchMessage next;
            HatchConversationState value;
            Object objA01 = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(objA01);
                    HatchConversationRepository$armSendWatchdog$1$finalStatus$1 hatchConversationRepository$armSendWatchdog$1$finalStatus$1 = new HatchConversationRepository$armSendWatchdog$1$finalStatus$1(HatchConversationRepository.this, this.$requestId, null);
                    this.label = 1;
                    objA01 = GAX.A01(this, hatchConversationRepository$armSendWatchdog$1$finalStatus$1, 15000L);
                    if (objA01 == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(objA01);
                }
                HatchMessageSendStatus hatchMessageSendStatus = (HatchMessageSendStatus) objA01;
                HatchConversationRepository hatchConversationRepository = HatchConversationRepository.this;
                if (hatchMessageSendStatus == null) {
                    List<HatchMessage> list = C60O.A04(hatchConversationRepository).messages;
                    String str = this.$requestId;
                    Iterator<HatchMessage> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (C7384Etj.areEqual(next.requestId, str)) {
                            break;
                        }
                    }
                    HatchMessage hatchMessage = next;
                    HatchMessageSendStatus hatchMessageSendStatus2 = hatchMessage != null ? hatchMessage.sendStatus : null;
                    HatchMessageSendStatus hatchMessageSendStatus3 = HatchMessageSendStatus.SENDING;
                    HatchConversationRepository hatchConversationRepository2 = HatchConversationRepository.this;
                    if (hatchMessageSendStatus2 != hatchMessageSendStatus3) {
                        hatchConversationRepository2.escalatedSendRequestIds.remove(this.$requestId);
                    } else if ((hatchConversationRepository2.gateway.connectionState.getValue() instanceof HatchGatewayConnectionState.Connected) && HatchConversationRepository.this.escalatedSendRequestIds.add(this.$requestId) && HatchConversationRepository.this.gateway.recoverFromSuspectedDeadConnection("send_ack_timeout")) {
                        C60Q.A1J("Send watchdog: requestId=", BQG.A17(this.$requestId, 8), " timed out while Connected \u2014 suspected dead socket, forcing reconnect + requeue", "HatchConversationRepository");
                    } else {
                        HatchConversationRepository.this.escalatedSendRequestIds.remove(this.$requestId);
                        C60Q.A1J("Send watchdog: requestId=", BQG.A17(this.$requestId, 8), " timed out after 15000ms; marking FAILED/TRANSPORT", "HatchConversationRepository");
                        HatchConversationRepository.updateMessageSendStatus$default(HatchConversationRepository.this, this.$requestId, HatchMessageSendStatus.FAILED, null, HatchSendErrorCategory.TRANSPORT, null, 20, null);
                        HatchConversationRepository hatchConversationRepository3 = HatchConversationRepository.this;
                        Object obj2 = hatchConversationRepository3.pendingMessagesLock;
                        String str2 = this.$requestId;
                        synchronized (obj2) {
                            AbstractC0882AGj.A0v(hatchConversationRepository3.pendingMessages, new HatchConversationRepository$armSendWatchdog$1$1$1(str2));
                        }
                        BLG<HatchConversationState> blg = HatchConversationRepository.this._conversationState;
                        do {
                            value = blg.getValue();
                        } while (!blg.A6e(value, HatchConversationState.copy$default(value, null, null, StreamingState.Done, null, null, null, false, null, false, null, null, null, null, false, null, 32763, null)));
                        if (HatchConversationRepository.this.completePendingMessage(this.$requestId)) {
                            HatchConversationRepository.this.flushPendingMessages();
                        }
                    }
                } else {
                    hatchConversationRepository.escalatedSendRequestIds.remove(this.$requestId);
                }
                HatchConversationRepository.this.sendWatchdogs.remove(this.$requestId);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                HatchConversationRepository.this.sendWatchdogs.remove(this.$requestId);
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C113521) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository$armStreamIdleWatchdog$1", f = "HatchConversationRepository.kt", l = {4894}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$armStreamIdleWatchdog$1, reason: invalid class name and case insensitive filesystem */
    public final class C113531 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C113531(HtJ<? super C113531> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationRepository.this.new C113531(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchConversationRepository.this.new C113531(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                this.label = 1;
                if (C7Bq.A01(120000L, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            if (C60O.A04(HatchConversationRepository.this).streamingState != StreamingState.Done) {
                CFK.A06("HatchConversationRepository", "Stream idle watchdog fired; forcing cleanup");
                HatchConversationRepository.this.cleanupStreamingState(CleanupReason.STREAM_IDLE_TIMEOUT);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository", f = "HatchConversationRepository.kt", l = {1644}, m = "cancelGeneration", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$cancelGeneration$1, reason: invalid class name and case insensitive filesystem */
    public final class C113541 extends HzP {
        public Object L$0;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C113541(HtJ<? super C113541> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchConversationRepository.this.cancelGeneration(false, null, this);
        }
    }

    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$cancelGeneration$2, reason: invalid class name and case insensitive filesystem */
    public final class C113552 extends AbstractC7559F3s implements Function0<Unit> {
        public static final C113552 INSTANCE = new C113552();

        public C113552() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository$cancelGeneration$3", f = "HatchConversationRepository.kt", l = {1684}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$cancelGeneration$3, reason: invalid class name and case insensitive filesystem */
    public final class C113563 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $cancelAttemptStreamId;
        public final /* synthetic */ Function0<Unit> $onLocalBusyCleanup;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C113563(String str, Function0<Unit> function0, HtJ<? super C113563> htJ) {
            super(2, htJ);
            this.$cancelAttemptStreamId = str;
            this.$onLocalBusyCleanup = function0;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationRepository.this.new C113563(this.$cancelAttemptStreamId, this.$onLocalBusyCleanup, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                this.label = 1;
                if (C7Bq.A01(5000L, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            HatchConversationState hatchConversationStateA04 = C60O.A04(HatchConversationRepository.this);
            if (hatchConversationStateA04.streamingState != StreamingState.Done && C7384Etj.areEqual(hatchConversationStateA04.streamingMessageId, this.$cancelAttemptStreamId)) {
                CFK.A06("HatchConversationRepository", "cancelGeneration: ChatAborted not received within 5000ms, forcing cleanup");
                HatchConversationRepository.this.cleanupStreamingState(CleanupReason.FALLBACK_TIMEOUT);
                this.$onLocalBusyCleanup.invoke();
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C113563) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$isStaleSend$2, reason: invalid class name and case insensitive filesystem */
    public final class C113572 extends AbstractC7559F3s implements Function0<Boolean> {
        public C113572() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(HatchConversationRepository.this.getPauseQueuedSendExpiryWhileOffline());
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository", f = "HatchConversationRepository.kt", l = {2838, 2852}, m = "jumpToMessage", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$jumpToMessage$1, reason: invalid class name and case insensitive filesystem */
    public final class C113581 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C113581(HtJ<? super C113581> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchConversationRepository.this.jumpToMessage(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository$launchFetchAndConnect$1", f = "HatchConversationRepository.kt", l = {1589}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$launchFetchAndConnect$1, reason: invalid class name and case insensitive filesystem */
    public final class C113591 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ boolean $force;
        public final /* synthetic */ boolean $joinInFlight;
        public final /* synthetic */ String $reason;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C113591(boolean z, boolean z2, String str, HtJ<? super C113591> htJ) {
            super(2, htJ);
            this.$force = z;
            this.$joinInFlight = z2;
            this.$reason = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationRepository.this.new C113591(this.$force, this.$joinInFlight, this.$reason, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchNavTTRCCoordinator hatchNavTTRCCoordinator = HatchConversationRepository.this.navTtrcCoordinator;
                    HatchNavTTRCSpec.Surface surface = HatchNavTTRCSpec.Surface.CHAT;
                    HatchNavTTRCCoordinator.TraceToken traceTokenCaptureActiveToken = hatchNavTTRCCoordinator.captureActiveToken(surface);
                    HatchConversationRepository.this.setGatewayConnectToken(traceTokenCaptureActiveToken);
                    HatchConversationRepository.this.navTtrcCoordinator.onDiagnosticPoint(surface, HatchNavTTRCSpec.Points.CHAT_GATEWAY_CONNECT_START, traceTokenCaptureActiveToken);
                    HatchGatewayConnection hatchGatewayConnection = HatchConversationRepository.this.gateway;
                    boolean z = this.$force;
                    boolean z2 = this.$joinInFlight;
                    this.L$0 = null;
                    this.label = 1;
                    obj = hatchGatewayConnection.fetchAndConnect(z, z2, null, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                boolean zA1X = AnonymousClass001.A1X(obj);
                String str = this.$reason;
                boolean z3 = this.$force;
                StringBuilder sbA0x = C3cI.A0x("fetchAndConnect[", str);
                sbA0x.append(" force=");
                sbA0x.append(z3);
                C60R.A1L("]: started=", "HatchConversationRepository", sbA0x, zA1X);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A04("HatchConversationRepository", FGI.A0d("fetchAndConnect[", this.$reason, "] failed: ", e2.getMessage()));
                HatchNavTTRCCoordinator.TraceToken traceTokenConsumeGatewayConnectToken = HatchConversationRepository.this.consumeGatewayConnectToken();
                if (traceTokenConsumeGatewayConnectToken != null) {
                    HatchConversationRepository.this.navTtrcCoordinator.onFailure(HatchNavTTRCSpec.Surface.CHAT, HatchNavTTRCSpec.FailureReason.GATEWAY_CONNECTION_FAILED, C60O.A0n(e2), e2.getMessage(), null, traceTokenConsumeGatewayConnectToken);
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C113591) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository", f = "HatchConversationRepository.kt", l = {2525}, m = "loadChatHistory", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$loadChatHistory$1, reason: invalid class name and case insensitive filesystem */
    public final class C113601 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public boolean Z$0;
        public boolean Z$1;
        public boolean Z$2;
        public int label;
        public /* synthetic */ Object result;

        public C113601(HtJ<? super C113601> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchConversationRepository.this.loadChatHistory(0, false, false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository$loadChatHistory$2", f = "HatchConversationRepository.kt", l = {2493}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$loadChatHistory$2, reason: invalid class name and case insensitive filesystem */
    public final class C113612 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C113612(HtJ<? super C113612> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationRepository.this.new C113612(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchConversationRepository.this.new C113612(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchOfflineConversationRepository companion = HatchOfflineConversationRepository.Companion.getInstance(HatchConversationRepository.this.userSession);
                    String str = HatchConversationRepository.this.sessionId;
                    if (str == null) {
                        str = "primary_session_id";
                    }
                    this.label = 1;
                    if (companion.loadLatestMessages(str, 20, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
            } catch (SQLException e) {
                CFK.A0A("HatchConversationRepository", "Offline cache warm read failed", e);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository", f = "HatchConversationRepository.kt", l = {2780}, m = "loadMoreHistory", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$loadMoreHistory$1, reason: invalid class name and case insensitive filesystem */
    public final class C113621 extends HzP {
        public int I$0;
        public long J$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C113621(HtJ<? super C113621> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchConversationRepository.this.loadMoreHistory(0, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository$pokeChat$2", f = "HatchConversationRepository.kt", l = {5064}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$pokeChat$2, reason: invalid class name and case insensitive filesystem */
    public final class C113632 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchChatPokeResponse>, Object> {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public int I$7;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public int label;

        public C113632(HtJ<? super C113632> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationRepository.this.new C113632(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super HatchChatPokeResponse> htJ) {
            return HatchConversationRepository.this.new C113632(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1599executeJarvisRequestWithFof5HsY;
            HatchConversationState value;
            HatchChatPokeResponse domain;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    i = 0;
                    if (C60O.A04(HatchConversationRepository.this).streamingState == StreamingState.Done) {
                        i = 1;
                        BLG<HatchConversationState> blg = HatchConversationRepository.this._conversationState;
                        do {
                            value = blg.getValue();
                        } while (!blg.A6e(value, HatchConversationState.copy$default(value, null, null, StreamingState.PendingResponse, null, null, null, false, null, false, null, null, null, null, false, null, 32763, null)));
                    }
                    HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
                    JarvisPath.ChatPoke chatPoke = JarvisPath.ChatPoke.INSTANCE;
                    C9jH c9jHA0E = AGH.A0E();
                    Set<Integer> setA18 = AnonymousClass004.A18();
                    HatchConversationRepository$pokeChat$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 hatchConversationRepository$pokeChat$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 = HatchConversationRepository$pokeChat$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE;
                    HatchConversationRepository$pokeChat$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 hatchConversationRepository$pokeChat$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 = HatchConversationRepository$pokeChat$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.I$0 = i;
                    this.I$1 = 1;
                    this.I$2 = 1;
                    this.I$3 = 0;
                    this.I$4 = 1;
                    this.I$5 = 0;
                    this.I$6 = 0;
                    this.I$7 = 0;
                    this.label = 1;
                    objM1599executeJarvisRequestWithFof5HsY = hatchHttpApi.m1599executeJarvisRequestWithFof5HsY(hatchConversationRepository$pokeChat$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1, hatchConversationRepository$pokeChat$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2, false, chatPoke, new JsonObject(c9jHA0E), RequestType.POST, HatchConversationRepository.this.userSession, null, null, new HxE[0], setA18, true, true, c9jHA0E, null, false, true, false, false, null, false, this);
                    if (objM1599executeJarvisRequestWithFof5HsY == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    i = this.I$0;
                    objM1599executeJarvisRequestWithFof5HsY = AnonymousClass002.A0j(obj);
                }
                if (objM1599executeJarvisRequestWithFof5HsY instanceof C10571Hud) {
                    objM1599executeJarvisRequestWithFof5HsY = null;
                }
                PokeChatPayloadJson pokeChatPayloadJson = (PokeChatPayloadJson) objM1599executeJarvisRequestWithFof5HsY;
                if (pokeChatPayloadJson != null) {
                    domain = pokeChatPayloadJson.toDomain();
                    if (domain == null) {
                    }
                    return domain;
                }
                domain = null;
                if (i != 0) {
                    do {
                    } while (!C60R.A1Z(HatchConversationRepository.this._conversationState));
                }
                return domain;
            } catch (Exception e) {
                CFK.A08("HatchConversationRepository", FGI.A0M("pokeChat failed: ", e.getMessage()), e);
                if (i != 0) {
                    while (!C60R.A1Z(HatchConversationRepository.this._conversationState)) {
                    }
                }
                return null;
            }
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository$probeCheckpointStatusForSend$1", f = "HatchConversationRepository.kt", l = {1254}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$probeCheckpointStatusForSend$1, reason: invalid class name and case insensitive filesystem */
    public final class C113641 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C113641(HtJ<? super C113641> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationRepository.this.new C113641(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchConversationRepository.this.new C113641(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchCheckpointGate companion = HatchCheckpointGate.Companion.getInstance(HatchConversationRepository.this.userSession);
                this.label = 1;
                if (companion.onActivity(this) == enumC10460Hji) {
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
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository", f = "HatchConversationRepository.kt", l = {2324}, m = "recoverHistory", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$recoverHistory$1, reason: invalid class name and case insensitive filesystem */
    public final class C113651 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C113651(HtJ<? super C113651> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchConversationRepository.this.recoverHistory(0L, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository", f = "HatchConversationRepository.kt", l = {2410}, m = "recoverHistoryWhenStreamsSettle", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$recoverHistoryWhenStreamsSettle$1, reason: invalid class name and case insensitive filesystem */
    public final class C113661 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C113661(HtJ<? super C113661> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchConversationRepository.this.recoverHistoryWhenStreamsSettle(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository", f = "HatchConversationRepository.kt", l = {2213, 2214, 2219, 2227}, m = "reloadHistory", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$reloadHistory$1, reason: invalid class name and case insensitive filesystem */
    public final class C113671 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C113671(HtJ<? super C113671> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchConversationRepository.this.reloadHistory(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository$reloadHistory$2", f = "HatchConversationRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$reloadHistory$2, reason: invalid class name and case insensitive filesystem */
    public final class C113682 extends AbstractC07127nr implements G0V<HatchGatewayConnectionState, HtJ<? super Boolean>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public C113682(HtJ<? super C113682> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C113682 c113682 = new C113682(htJ);
            c113682.L$0 = obj;
            return c113682;
        }

        @Override // X.G0V
        public final Object invoke(HatchGatewayConnectionState hatchGatewayConnectionState, HtJ<? super Boolean> htJ) {
            C113682 c113682 = new C113682(htJ);
            c113682.L$0 = hatchGatewayConnectionState;
            return c113682.invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.L$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return Boolean.valueOf(obj2 instanceof HatchGatewayConnectionState.Connected);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository$reloadHistory$3", f = "HatchConversationRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$reloadHistory$3, reason: invalid class name and case insensitive filesystem */
    public final class C113693 extends AbstractC07127nr implements G0V<HatchConversationState, HtJ<? super Boolean>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public C113693(HtJ<? super C113693> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C113693 c113693 = new C113693(htJ);
            c113693.L$0 = obj;
            return c113693;
        }

        @Override // X.G0V
        public final Object invoke(HatchConversationState hatchConversationState, HtJ<? super Boolean> htJ) {
            C113693 c113693 = new C113693(htJ);
            c113693.L$0 = hatchConversationState;
            return c113693.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
            /*
                r2 = this;
                java.lang.Object r1 = r2.L$0
                com.facebook.aura.conversation.repo.HatchConversationState r1 = (com.facebook.aura.conversation.repo.HatchConversationState) r1
                int r0 = r2.label
                if (r0 != 0) goto L1c
                X.Hwg.A00(r3)
                com.facebook.aura.conversation.repo.HistoryLoadingState r2 = r1.historyLoadingState
                com.facebook.aura.conversation.repo.HistoryLoadingState r0 = com.facebook.aura.conversation.repo.HistoryLoadingState.LOADING
                if (r2 == r0) goto L16
                com.facebook.aura.conversation.repo.HistoryLoadingState r1 = com.facebook.aura.conversation.repo.HistoryLoadingState.REFRESHING
                r0 = 1
                if (r2 != r1) goto L17
            L16:
                r0 = 0
            L17:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            L1c:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchConversationRepository.C113693.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository$reloadHistory$4", f = "HatchConversationRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$reloadHistory$4, reason: invalid class name and case insensitive filesystem */
    public final class C113704 extends AbstractC07127nr implements G0V<HatchGatewayConnectionState, HtJ<? super Boolean>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public C113704(HtJ<? super C113704> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C113704 c113704 = new C113704(htJ);
            c113704.L$0 = obj;
            return c113704;
        }

        @Override // X.G0V
        public final Object invoke(HatchGatewayConnectionState hatchGatewayConnectionState, HtJ<? super Boolean> htJ) {
            C113704 c113704 = new C113704(htJ);
            c113704.L$0 = hatchGatewayConnectionState;
            return c113704.invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.L$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return C3cG.A0P(obj2 instanceof HatchGatewayConnectionState.Connected);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository", f = "HatchConversationRepository.kt", l = {443}, m = "seedReplayCursorFromCache", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$seedReplayCursorFromCache$1, reason: invalid class name and case insensitive filesystem */
    public final class C113711 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C113711(HtJ<? super C113711> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchConversationRepository.this.seedReplayCursorFromCache(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository$sendMessage$2", f = "HatchConversationRepository.kt", l = {1795}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$sendMessage$2, reason: invalid class name and case insensitive filesystem */
    public final class C113722 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $replacesMessageId;
        public final /* synthetic */ HatchSendMessage $sendMessage;
        public int label;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            JsonObject jsonObjectFeedUnitReplyToTarget;
            String str;
            Object objBuildAttachments = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchConversationAttachmentBuilder hatchConversationAttachmentBuilder = HatchConversationRepository.this.attachmentBuilder;
                HatchSendMessage hatchSendMessage = this.$sendMessage;
                this.label = 1;
                objBuildAttachments = hatchConversationAttachmentBuilder.buildAttachments(hatchSendMessage, this);
                if (objBuildAttachments == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            List list = (List) objBuildAttachments;
            PendingDiscussionItem pendingDiscussionItem = this.$sendMessage.pendingDiscussionItem;
            if (pendingDiscussionItem == null || (str = pendingDiscussionItem.id) == null) {
                jsonObjectFeedUnitReplyToTarget = null;
            } else {
                HatchConversationRepository hatchConversationRepository = HatchConversationRepository.this;
                jsonObjectFeedUnitReplyToTarget = hatchConversationRepository.feedUnitReplyToTarget(str);
                if (jsonObjectFeedUnitReplyToTarget == null) {
                    jsonObjectFeedUnitReplyToTarget = hatchConversationRepository.goalReplyToTarget(str);
                }
            }
            Map mapA11 = this.$sendMessage.extraParams;
            if (jsonObjectFeedUnitReplyToTarget != null) {
                if (mapA11 == null) {
                    mapA11 = AGH.A0E();
                }
                mapA11 = AnonymousClass006.A11("reply_to_target", jsonObjectFeedUnitReplyToTarget, mapA11);
            }
            HatchConversationRepository hatchConversationRepository2 = HatchConversationRepository.this;
            HatchSendMessage hatchSendMessage2 = this.$sendMessage;
            String str2 = hatchSendMessage2.text;
            ReplyAttribution replyAttribution = hatchSendMessage2.replyAttribution;
            Map<String, String> map = hatchSendMessage2.messageMetadata;
            String str3 = hatchSendMessage2.requestId;
            Map mapWithMessageOrigin = hatchConversationRepository2.withMessageOrigin(mapA11, hatchSendMessage2.messageOrigin);
            HatchSendMessage hatchSendMessage3 = this.$sendMessage;
            String str4 = hatchSendMessage3.hiddenPrompt;
            boolean z = hatchSendMessage3.routeToLiveSession;
            if (z) {
                str4 = null;
            }
            hatchConversationRepository2.sendMessageInternal(str2, list, replyAttribution, map, str3, mapWithMessageOrigin, str4, z, hatchSendMessage3.liveSessionTargetThreadId, this.$replacesMessageId);
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C113722(HatchSendMessage hatchSendMessage, String str, HtJ<? super C113722> htJ) {
            super(2, htJ);
            this.$sendMessage = hatchSendMessage;
            this.$replacesMessageId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationRepository.this.new C113722(this.$sendMessage, this.$replacesMessageId, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C113722) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$sendMessage$3, reason: invalid class name and case insensitive filesystem */
    public final class C113733 extends AbstractC7559F3s implements G0U<Throwable, Unit> {
        public final /* synthetic */ HatchSendMessage $sendMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C113733(HatchSendMessage hatchSendMessage) {
            super(1);
            this.$sendMessage = hatchSendMessage;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            if (th != null) {
                HatchAgentExecution.Companion.getInstance(HatchConversationRepository.this.userSession).failRequest(this.$sendMessage.requestId);
            }
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository", f = "HatchConversationRepository.kt", l = {1753}, m = "submitExternalUserMessage", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$submitExternalUserMessage$1, reason: invalid class name and case insensitive filesystem */
    public final class C113741 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C113741(HtJ<? super C113741> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchConversationRepository.this.submitExternalUserMessage(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository$syncUnreadMessageCount$1", f = "HatchConversationRepository.kt", l = {4816, 4820}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$syncUnreadMessageCount$1, reason: invalid class name and case insensitive filesystem */
    public final class C113751 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public int label;

        public C113751(HtJ<? super C113751> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationRepository.this.new C113751(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchConversationRepository.this.new C113751(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchConversationRepository hatchConversationRepository = HatchConversationRepository.this;
                HatchGatewayConnection hatchGatewayConnection = hatchConversationRepository.gateway;
                String str = hatchConversationRepository.sessionId;
                this.label = 1;
                obj = hatchGatewayConnection.markChatAsSeen(str, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    HatchChatLocalNotificationConfig.Companion.getInstance(HatchConversationRepository.this.userSession).setUnreadMessageCount(AnonymousClass001.A0F(obj));
                    return Unit.INSTANCE;
                }
                Hwg.A00(obj);
            }
            Boolean bool = ((MarkChatAsSeenResult) obj).hasUnreadThreads;
            if (bool != null) {
                HatchConversationRepository hatchConversationRepository2 = HatchConversationRepository.this;
                HatchThreadsRepository.Companion.getInstance(hatchConversationRepository2.userSession).updateHasUnreadThreads(bool.booleanValue());
            }
            HatchConversationRepository hatchConversationRepository3 = HatchConversationRepository.this;
            HatchGatewayConnection hatchGatewayConnection2 = hatchConversationRepository3.gateway;
            String str2 = hatchConversationRepository3.sessionId;
            this.L$0 = null;
            this.label = 2;
            obj = hatchGatewayConnection2.fetchUnreadCount(str2, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
            HatchChatLocalNotificationConfig.Companion.getInstance(HatchConversationRepository.this.userSession).setUnreadMessageCount(AnonymousClass001.A0F(obj));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository$toggleReaction$1", f = "HatchConversationRepository.kt", l = {4784}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$toggleReaction$1, reason: invalid class name and case insensitive filesystem */
    public final class C113761 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ boolean $alreadyReacted;
        public final /* synthetic */ String $emoji;
        public final /* synthetic */ String $messageId;
        public final /* synthetic */ List<String> $optimisticReactions;
        public final /* synthetic */ List<String> $previousReactions;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C113761(String str, String str2, boolean z, List<String> list, List<String> list2, HtJ<? super C113761> htJ) {
            super(2, htJ);
            this.$messageId = str;
            this.$emoji = str2;
            this.$alreadyReacted = z;
            this.$optimisticReactions = list;
            this.$previousReactions = list2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationRepository.this.new C113761(this.$messageId, this.$emoji, this.$alreadyReacted, this.$optimisticReactions, this.$previousReactions, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            List list;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchConversationRepository hatchConversationRepository = HatchConversationRepository.this;
                    HatchGatewayConnection hatchGatewayConnection = hatchConversationRepository.gateway;
                    String str = this.$messageId;
                    String str2 = this.$emoji;
                    String str3 = hatchConversationRepository.sessionId;
                    this.label = 1;
                    obj = hatchGatewayConnection.toggleReaction(str, str2, str3, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                list = (List) obj;
            } catch (Exception e) {
                CFK.A0A("HatchConversationRepository", FGI.A0d("toggleReaction: exception for messageId=", this.$messageId, ", emoji=", this.$emoji), e);
                HatchConversationRepository.toggleReaction$rollbackOptimistic(HatchConversationRepository.this, this.$messageId, this.$optimisticReactions, this.$previousReactions);
            }
            if (list == null) {
                C60Q.A1K("toggleReaction: server call failed for messageId=", this.$messageId, ", emoji=", this.$emoji, "HatchConversationRepository");
                HatchConversationRepository.toggleReaction$rollbackOptimistic(HatchConversationRepository.this, this.$messageId, this.$optimisticReactions, this.$previousReactions);
                return Unit.INSTANCE;
            }
            HatchConversationRepository.this.applyReactions(this.$messageId, list, false);
            if (!this.$alreadyReacted && list.contains(this.$emoji)) {
                HatchReactionUsageStore.Companion.getInstance(HatchConversationRepository.this.userSession).recordUsage(this.$emoji);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C113761) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository$warmLocationForSend$1", f = "HatchConversationRepository.kt", l = {1250}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$warmLocationForSend$1, reason: invalid class name and case insensitive filesystem */
    public final class C113771 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C113771(HtJ<? super C113771> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationRepository.this.new C113771(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchConversationRepository.this.new C113771(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchLocationProvider hatchLocationProvider = HatchLocationProvider.INSTANCE;
                Context context = HatchConversationRepository.this.appContext;
                this.label = 1;
                if (hatchLocationProvider.warmLocation(context, this) == enumC10460Hji) {
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
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.facebook.aura.conversation.repo.HatchConversationRepository$liveConversation$1, com.facebook.aura.livesession.api.LiveConversation] */
    public HatchConversationRepository(Context context, AbstractC3358CGz abstractC3358CGz, String str, HatchConversationQplLogger hatchConversationQplLogger, boolean z, boolean z2) {
        boolean z3 = false;
        C7384Etj.A0Y(context, 0);
        AnonymousClass002.A1B(abstractC3358CGz, 1, hatchConversationQplLogger);
        this.appContext = context;
        this.userSession = abstractC3358CGz;
        this.sessionId = str;
        this.qplLogger = hatchConversationQplLogger;
        this.loadHistoryOnConnect = z;
        this.subscribeToThread = z2;
        HatchGatewayServiceManager hatchGatewayServiceManager = HatchGatewayServiceManager.INSTANCE;
        HatchGatewayConnection companion = HatchGatewayConnection.Companion.getInstance(abstractC3358CGz);
        this.gateway = companion;
        this.threadsRepository = HatchThreadsRepository.Companion.getInstance(abstractC3358CGz);
        this.primarySessionRepository = HatchPrimarySessionRepository.Companion.getInstance(abstractC3358CGz);
        this.navTtrcCoordinator = HatchNavTTRCCoordinator.Companion.getInstance(abstractC3358CGz);
        HzC hzCA04 = C78W.A04(new Hy1(AuraExecutors.INSTANCE.getBackgroundThreadExecutor()));
        this.scope = hzCA04;
        ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet();
        C7384Etj.A0U(keySetViewNewKeySet);
        this.createdProvisionalTurnIds = keySetViewNewKeySet;
        this.isStaticResponseRedactionEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.enable_static_response_redaction);
        this.pauseQueuedSendExpiryWhileOffline$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android_networking.pause_queued_send_expiry_while_offline);
        C9286GCn c9286GCnA14 = C3cG.A14(new HatchConversationState(null, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, C3cH.A1R(companion.serviceRestartPending), null == true ? 1 : 0, z3, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, z3, null == true ? 1 : 0, 32703, null == true ? 1 : 0));
        this._conversationState = c9286GCnA14;
        this.conversationState = C3cG.A11(c9286GCnA14);
        C9286GCn c9286GCnA13 = C3cG.A13();
        this._subAgentActivity = c9286GCnA13;
        this.subAgentActivity = C3cG.A11(c9286GCnA13);
        Integer num = C79.A00;
        C9290GCr c9290GCrA12 = C3cG.A12(num, 0, 1);
        this._liveComposerHint = c9290GCrA12;
        this.liveComposerHint = c9290GCrA12;
        C9290GCr c9290GCrA122 = C3cG.A12(num, 0, 4);
        this._removedMessageSeqs = c9290GCrA122;
        this.removedMessageSeqs = c9290GCrA122;
        C9290GCr c9290GCrA123 = C3cG.A12(num, 0, 4);
        this._tombstonedMessages = c9290GCrA123;
        this.tombstonedMessages = c9290GCrA123;
        C9290GCr c9290GCrA124 = C3cG.A12(num, 0, 1);
        this._reactionLanded = c9290GCrA124;
        this.reactionLanded = c9290GCrA124;
        C9290GCr c9290GCrA125 = C3cG.A12(num, 0, 1);
        this._assistantMessageStarted = c9290GCrA125;
        this.assistantMessageStarted = c9290GCrA125;
        C9290GCr c9290GCrA126 = C3cG.A12(num, 0, 1);
        this._sendFailed = c9290GCrA126;
        this.sendFailed = c9290GCrA126;
        C9290GCr c9290GCrA127 = C3cG.A12(num, 0, 1);
        this._attachmentsDropped = c9290GCrA127;
        this.attachmentsDropped = c9290GCrA127;
        ConcurrentHashMap.KeySetView keySetViewNewKeySet2 = ConcurrentHashMap.newKeySet();
        C7384Etj.A0U(keySetViewNewKeySet2);
        this.activeReplyToIds = keySetViewNewKeySet2;
        this.historyRecoveryRequests = AbstractC10623Hzj.A00(num, -1);
        this.historyRecoveryGeneration = C3cG.A14(0L);
        this.historyRecoveryLock = C3cG.A0T();
        this.streamIdsAwaitingSettle = C3cG.A0k();
        this.accumulator = new HatchDeltaAccumulator();
        this.transcriptFlushLock = C3cG.A0T();
        this.processedEnvelopeSeqs = C60O.A1C();
        this.attachmentBuilder = new HatchConversationAttachmentBuilder(context, abstractC3358CGz, c9290GCrA127);
        this.widgetStateSync = new HatchConversationWidgetStateSync(abstractC3358CGz, str, z, companion, hzCA04, c9286GCnA14);
        this.pendingMessages = C3cG.A0h();
        this.pendingMessagesLock = C3cG.A0T();
        this.streamActivityTick = C3cG.A12(num, 0, 1);
        this.sendWatchdogs = C60O.A1C();
        ConcurrentHashMap.KeySetView keySetViewNewKeySet3 = ConcurrentHashMap.newKeySet();
        C7384Etj.A0U(keySetViewNewKeySet3);
        this.escalatedSendRequestIds = keySetViewNewKeySet3;
        this.transportRejectionRetries = C60O.A1C();
        this.transportRejectionRetryJobs = C60O.A1C();
        ConcurrentHashMap.KeySetView keySetViewNewKeySet4 = ConcurrentHashMap.newKeySet();
        C7384Etj.A0U(keySetViewNewKeySet4);
        this.resentRequestIds = keySetViewNewKeySet4;
        this.replyPreviewStripRegex = C06827l3.A02("\\[(image|file):[^]]*]");
        ?? r8 = new LiveConversation() { // from class: com.facebook.aura.conversation.repo.HatchConversationRepository$liveConversation$1
            public final C20Q<LiveConversationReplies> replies;

            @Override // com.facebook.aura.livesession.api.LiveConversation
            public void finishStreamingUserMessage(String str2) {
                C7384Etj.A0Y(str2, 0);
                this.this$0.finishStreamingUserMessage(str2);
            }

            @Override // com.facebook.aura.livesession.api.LiveConversation
            public void removeProvisionalUserMessages(Set<String> set) {
                C7384Etj.A0Y(set, 0);
                this.this$0.removeProvisionalUserMessages(set);
            }

            @Override // com.facebook.aura.livesession.api.LiveConversation
            public void sendUserMessage(String str2, String str3) {
                C7384Etj.A0Y(str2, 0);
                HatchConversationRepository hatchConversationRepository = this.this$0;
                String strA0k = AnonymousClass002.A0k();
                C0881AGi c0881AGi = C0881AGi.A00;
                hatchConversationRepository.sendMessage(new HatchSendMessage(str2, strA0k, null, c0881AGi, c0881AGi, null, null, null, null, false, null, AGH.A0E(), null), str3 != null ? FGI.A0M(HatchConversationRepositoryKt.PROVISIONAL_USER_MESSAGE_PREFIX, str3) : null);
            }

            @Override // com.facebook.aura.livesession.api.LiveConversation
            public void startStreamingUserMessage(String str2, Long l) {
                C7384Etj.A0Y(str2, 0);
                this.this$0.startStreamingUserMessage(str2, l);
            }

            {
                this.replies = this.this$0.loadHistoryOnConnect ? new HatchConversationRepository$liveConversation$1$special$$inlined$map$1(this.this$0.conversationState) : null;
            }

            @Override // com.facebook.aura.livesession.api.LiveConversation
            public C20Q<LiveConversationReplies> getReplies() {
                return this.replies;
            }

            @Override // com.facebook.aura.livesession.api.LiveConversation
            public String getThreadId() {
                return this.this$0.sessionId;
            }

            @Override // com.facebook.aura.livesession.api.LiveConversation
            public void onLiveSessionConnected() {
                String str2;
                HatchConversationRepository hatchConversationRepository = this.this$0;
                if (!hatchConversationRepository.subscribeToThread || (str2 = hatchConversationRepository.sessionId) == null) {
                    return;
                }
                hatchConversationRepository.gateway.confirmThreadSession(str2);
            }

            @Override // com.facebook.aura.livesession.api.LiveConversation
            public void appendStreamingUserMessage(String str2, String str3) {
                AnonymousClass003.A0u(str2, str3);
                this.this$0.appendStreamingUserMessage(str2, str3);
            }

            @Override // com.facebook.aura.livesession.api.LiveConversation
            public void showProvisionalUserMessage(String str2, String str3) {
                AnonymousClass003.A0u(str2, str3);
                this.this$0.showProvisionalUserMessage(str2, str3);
            }
        };
        this.liveConversation = r8;
        LiveSession liveSessionForSession = LiveSessions.INSTANCE.forSession(abstractC3358CGz);
        this.liveTranscript = liveSessionForSession != 0 ? liveSessionForSession.attachTranscript(r8, hzCA04) : null;
        HatchConversationRepositoryKt.reachableRepositories.add(this);
        if (z) {
            GAo.A02(num, C6ys.A00, new AnonymousClass1(null), hzCA04);
        }
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(null);
        C6ys c6ys = C6ys.A00;
        GAo.A02(num, c6ys, anonymousClass2, hzCA04);
        GAo.A02(C79.A0K, c6ys, new AnonymousClass3(null), hzCA04);
        warmLocationForSend();
        if (str == null) {
            GAo.A02(num, c6ys, new AnonymousClass4(null), hzCA04);
            GAo.A02(num, c6ys, new AnonymousClass5(null), hzCA04);
        } else if (z2) {
            GAo.A02(num, c6ys, new AnonymousClass6(null), hzCA04);
        }
        GAo.A02(num, c6ys, new AnonymousClass7(null), hzCA04);
        GAo.A02(num, c6ys, new AnonymousClass8(null), hzCA04);
        GAo.A02(num, c6ys, new AnonymousClass9(null), hzCA04);
        GAo.A02(num, c6ys, new AnonymousClass10(null), hzCA04);
        GAo.A02(num, c6ys, new AnonymousClass11(null), hzCA04);
        GAo.A02(num, c6ys, new AnonymousClass12(null), hzCA04);
        GAo.A02(num, c6ys, new AnonymousClass13(null), hzCA04);
        GAo.A02(num, c6ys, new AnonymousClass14(null), hzCA04);
        GAo.A02(num, c6ys, new AnonymousClass15(null), hzCA04);
        GAo.A02(num, c6ys, new AnonymousClass16(null), hzCA04);
        GAo.A02(num, c6ys, new AnonymousClass17(HatchIdentityProvider.Companion.getInstance(abstractC3358CGz), this, null), hzCA04);
        connectIfDisconnected(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cleanupStreamingState(CleanupReason cleanupReason) {
        HatchConversationState value;
        HatchConversationState hatchConversationState;
        this.didSendStreamRequest = false;
        this.activeReplyToIds.clear();
        cancelPendingTranscriptFlush();
        this.accumulator.reset();
        boolean z = cleanupReason == CleanupReason.USER_STOP || cleanupReason == CleanupReason.FALLBACK_TIMEOUT || cleanupReason == CleanupReason.TRANSPORT_FAILURE || cleanupReason == CleanupReason.STREAM_IDLE_TIMEOUT;
        BLG<HatchConversationState> blg = this._conversationState;
        do {
            value = blg.getValue();
            hatchConversationState = value;
        } while (!blg.A6e(value, HatchConversationState.copy$default(hatchConversationState, null, null, StreamingState.Done, z ? hatchConversationState.streamingMessageId : null, null, null, false, null, false, null, null, null, null, false, null, 32755, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized HatchNavTTRCCoordinator.TraceToken consumeGatewayConnectToken() {
        HatchNavTTRCCoordinator.TraceToken traceToken;
        traceToken = this.gatewayConnectToken;
        this.gatewayConnectToken = null;
        return traceToken;
    }

    private final void failSendsAwaitingRetry() {
        List listA0X;
        synchronized (this.pendingMessagesLock) {
            Set<String> setKeySet = this.transportRejectionRetryJobs.keySet();
            C7384Etj.A0U(setKeySet);
            listA0X = AbstractC0878AGe.A0X(setKeySet);
            Iterator it = listA0X.iterator();
            while (it.hasNext()) {
                HoC hoCRemove = this.transportRejectionRetryJobs.remove(AnonymousClass005.A0j(it));
                if (hoCRemove != null) {
                    hoCRemove.A5w(null);
                }
            }
        }
        for (Object obj : listA0X) {
            C7384Etj.A0U(obj);
            String str = (String) obj;
            CFK.A05("HatchConversationRepository", FGI.A0U("Stop cancelled the silent retry for ", str, "; marking FAILED/TRANSPORT"));
            updateMessageSendStatus(str, HatchMessageSendStatus.FAILED, null, HatchSendErrorCategory.TRANSPORT, null);
            releaseRejectedSend(str);
        }
    }

    public static final boolean handleChatEvent$lambda$5$shouldRedact(String str, String str2, HatchMessage hatchMessage) {
        if (str != null) {
            String str3 = hatchMessage.id;
            if (str.equals(str3) || str.equals(hatchMessage.serverMessageId) || (C7384Etj.areEqual(str3, str2) && hatchMessage.serverMessageId == null)) {
                return true;
            }
        }
        return false;
    }

    private final int indexOfUserMessageToStamp(List<HatchMessage> list, HatchMessage hatchMessage) {
        String strDedupeContentKey;
        Object next;
        if (hatchMessage != null && (strDedupeContentKey = dedupeContentKey(hatchMessage)) != null) {
            ADq aDqA12 = AbstractC0885AGm.A12(list);
            ArrayList arrayListA0h = C3cG.A0h();
            Iterator<Integer> it = aDqA12.iterator();
            while (it.hasNext()) {
                Integer next2 = it.next();
                int iA0F = AnonymousClass001.A0F(next2);
                if (list.get(iA0F).role == HatchMessageRole.USER && list.get(iA0F).seq == null && !list.get(iA0F).isPending) {
                    C3cI.A1J(dedupeContentKey(list.get(iA0F)), next2, strDedupeContentKey, arrayListA0h);
                }
            }
            Iterator it2 = arrayListA0h.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (list.get(AnonymousClass001.A0F(next)).sendStatus != HatchMessageSendStatus.FAILED) {
                    break;
                }
            }
            Number number = (Number) next;
            if (number != null || (number = (Number) AbstractC0878AGe.A0G(arrayListA0h)) != null) {
                return number.intValue();
            }
        }
        Iterator<HatchMessage> it3 = list.iterator();
        int i = 0;
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            HatchMessage hatchMessageA0K = C60Q.A0K(it3);
            if (hatchMessageA0K.role != HatchMessageRole.USER || hatchMessageA0K.seq != null || hatchMessageA0K.isPending || hatchMessageA0K.sendStatus == HatchMessageSendStatus.FAILED || !C60O.A1X(hatchMessageA0K.id, HatchConversationRepositoryKt.PROVISIONAL_USER_MESSAGE_PREFIX)) {
                i++;
            } else if (i >= 0) {
                return i;
            }
        }
        Iterator<HatchMessage> it4 = list.iterator();
        int i2 = 0;
        while (it4.hasNext()) {
            HatchMessage hatchMessageA0K2 = C60Q.A0K(it4);
            if (hatchMessageA0K2.role == HatchMessageRole.USER && hatchMessageA0K2.seq == null && !hatchMessageA0K2.isPending && hatchMessageA0K2.sendStatus != HatchMessageSendStatus.FAILED && !C60O.A1X(hatchMessageA0K2.id, HatchConversationRepositoryKt.PROVISIONAL_USER_MESSAGE_PREFIX)) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchFetchAndConnect(String str, boolean z, boolean z2) {
        AnonymousClass001.A1J(new C113591(z, z2, str, null), this.scope);
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.model.ReplyAttribution mergeReplyAttribution(com.facebook.aura.model.ReplyAttribution r14, com.facebook.aura.model.ReplyAttribution r15) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchConversationRepository.mergeReplyAttribution(com.facebook.aura.model.ReplyAttribution, com.facebook.aura.model.ReplyAttribution):com.facebook.aura.model.ReplyAttribution");
    }

    private final HatchWidgetPresentation promoteIfMatch(HatchWidgetPresentation hatchWidgetPresentation, String str) {
        SpaceProposalPresentationData spaceProposalPresentationData;
        if (C7384Etj.areEqual(hatchWidgetPresentation.presentationId, str)) {
            HatchPresentationData hatchPresentationData = hatchWidgetPresentation.data;
            if ((hatchPresentationData instanceof SpaceProposalPresentationData) && (spaceProposalPresentationData = (SpaceProposalPresentationData) hatchPresentationData) != null) {
                SpaceProposalPresentation spaceProposalPresentation = spaceProposalPresentationData.proposal;
                if (spaceProposalPresentation.constructionStatus == null) {
                    SpaceProposalPresentation spaceProposalPresentationCopy = spaceProposalPresentation.copy(spaceProposalPresentation.name, spaceProposalPresentation.slug, spaceProposalPresentation.description, spaceProposalPresentation.features, spaceProposalPresentation.imageUrl, SpaceConstructionStatus.CONSTRUCTING);
                    C7384Etj.A0Y(spaceProposalPresentationCopy, 0);
                    return HatchWidgetPresentation.copy$default(hatchWidgetPresentation, null, null, new SpaceProposalPresentationData(spaceProposalPresentationCopy), null, null, null, null, null, null, null, false, 2043, null);
                }
            }
        }
        return hatchWidgetPresentation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void setGatewayConnectToken(HatchNavTTRCCoordinator.TraceToken traceToken) {
        this.gatewayConnectToken = traceToken;
    }

    public final void markProposalBuilding(String str) {
        HatchConversationState value;
        HatchConversationState hatchConversationState;
        C7384Etj.A0Y(str, 0);
        BLG<HatchConversationState> blg = this._conversationState;
        do {
            value = blg.getValue();
            hatchConversationState = value;
        } while (!blg.A6e(value, HatchConversationState.copy$default(hatchConversationState, markProposalBuilding$promote(this, str, hatchConversationState.history), markProposalBuilding$promote(this, str, hatchConversationState.messages), null, null, null, null, false, null, false, null, null, null, null, false, null, 32764, null)));
    }

    public final void retrySendMessage(String str, boolean z) {
        Object obj;
        Object next;
        Object next2;
        C7384Etj.A0Y(str, 0);
        Iterator itA14 = C60O.A14(C60O.A04(this));
        while (true) {
            obj = null;
            if (itA14.hasNext()) {
                next = itA14.next();
                if (str.equals(((HatchMessage) next).id)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        HatchMessage hatchMessage = (HatchMessage) next;
        if (hatchMessage != null) {
            HatchBotStatusMuteStore.Companion.getInstance(this.userSession).onUserMessageSent();
            String str2 = hatchMessage.requestId;
            if (str2 != null) {
                AnonymousClass002.A1K(this.sendWatchdogs.remove(str2));
            }
            String strA0k = AnonymousClass002.A0k();
            if (!hatchMessage.routeToLiveSession && clientOnlyCommandToken(hatchMessage.content) == null) {
                HatchGatewayServiceManager.INSTANCE.beginAgentExecution(this.userSession, this.sessionId, strA0k);
            }
            HatchGatewayConnectionState value = this.gateway.connectionState.getValue();
            boolean z2 = z && HatchUtil.INSTANCE.isOfflineMessageQueueEnabled() && (!(value instanceof HatchGatewayConnectionState.Connected) || hasPendingMessageWork());
            BLG<HatchConversationState> blg = this._conversationState;
            while (true) {
                HatchConversationState value2 = blg.getValue();
                HatchConversationState hatchConversationStateCopy$default = value2;
                Iterator itA142 = C60O.A14(hatchConversationStateCopy$default);
                while (true) {
                    if (itA142.hasNext()) {
                        next2 = itA142.next();
                        if (str.equals(((HatchMessage) next2).id)) {
                            break;
                        }
                    } else {
                        next2 = obj;
                        break;
                    }
                }
                HatchMessage hatchMessage2 = (HatchMessage) next2;
                if (hatchMessage2 != null) {
                    List<HatchMessage> list = hatchConversationStateCopy$default.messages;
                    ArrayList arrayListA0h = C3cG.A0h();
                    for (HatchMessage hatchMessage3 : list) {
                        if (!str.equals(hatchMessage3.id)) {
                            arrayListA0h.add(hatchMessage3);
                        }
                    }
                    hatchConversationStateCopy$default = HatchConversationState.copy$default(hatchConversationStateCopy$default, null, AbstractC0878AGe.A0Q(HatchMessage.copy$default(hatchMessage2, null, null, null, System.currentTimeMillis(), null, null, null, null, null, null, null, null, null, null, false, null, null, z2, null, null, null, null, HatchMessageSendStatus.SENDING, null, null, null, strA0k, null, null, false, null, null, false, null, -121766025, 3, null), arrayListA0h), !z2 ? StreamingState.PendingResponse : value instanceof HatchGatewayConnectionState.Connected ? hatchConversationStateCopy$default.streamingState : StreamingState.Done, null, null, null, false, null, false, null, null, null, null, false, null, 32761, null);
                }
                if (blg.A6e(value2, hatchConversationStateCopy$default)) {
                    break;
                } else {
                    obj = null;
                }
            }
            if (!z2) {
                this.gateway.sendChatMessage(hatchMessage.content, hatchMessage.attachments, withLocationUploadTimestamp(withCurrentReplyTarget(withLiveSessionRouting(buildSendExtraParams(hatchMessage.extraParams), hatchMessage.routeToLiveSession, hatchMessage.liveSessionTargetThreadId), strA0k)), hatchMessage.getInReplyTo(), strA0k);
                this.qplLogger.onWebSocketFrameSent(strA0k);
                armSendWatchdog(strA0k);
                return;
            }
            synchronized (this.pendingMessagesLock) {
                this.pendingMessages.add(toPendingMessage(hatchMessage, strA0k));
            }
            if (value instanceof HatchGatewayConnectionState.Connected) {
                flushPendingMessages();
            } else {
                if (this.gateway.isStorageRecoveryConnected()) {
                    return;
                }
                connectIfDisconnected(true);
            }
        }
    }

    public final void sendMessage(HatchSendMessage hatchSendMessage, String str) {
        HatchConversationState value;
        HatchConversationState hatchConversationState;
        ArrayList arrayListA0i;
        C7384Etj.A0Y(hatchSendMessage, 0);
        if (str != null) {
            BLG<HatchConversationState> blg = this._conversationState;
            do {
                value = blg.getValue();
                hatchConversationState = value;
                List<HatchMessage> list = hatchConversationState.messages;
                arrayListA0i = AnonymousClass003.A0i(list);
                for (HatchMessage hatchMessageCopy$default : list) {
                    if (str.equals(hatchMessageCopy$default.id)) {
                        hatchMessageCopy$default = HatchMessage.copy$default(hatchMessageCopy$default, null, null, null, 0L, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, hatchSendMessage.requestId, null, null, false, null, null, false, null, -67108865, 3, null);
                    }
                    arrayListA0i.add(hatchMessageCopy$default);
                }
            } while (!blg.A6e(value, HatchConversationState.copy$default(hatchConversationState, null, arrayListA0i, null, null, null, null, false, null, false, null, null, null, null, false, null, 32765, null)));
        }
        HatchBotStatusMuteStore.Companion.getInstance(this.userSession).onUserMessageSent();
        ConversationUserMessageHooks.INSTANCE.notifySent();
        if (!hatchSendMessage.routeToLiveSession && clientOnlyCommandToken(hatchSendMessage.text) == null) {
            HatchGatewayServiceManager.INSTANCE.beginAgentExecution(this.userSession, this.sessionId, hatchSendMessage.requestId);
        }
        warmLocationForSend();
        probeCheckpointStatusForSend();
        AnonymousClass001.A11(new C113722(hatchSendMessage, str, null), this.scope).AO5(new C113733(hatchSendMessage));
    }

    public final boolean supportsReplyTargetType(String str) {
        C7384Etj.A0Y(str, 0);
        return this.gateway.getCurrentReplyElementSupport().targetTypes.contains(str);
    }

    public final void toggleReaction(String str, String str2) {
        boolean zA1Y = C60P.A1Y(str, str2);
        List<String> list = C60O.A04(this).reactions.get(str);
        if (list == null) {
            list = C0881AGi.A00;
        }
        boolean zContains = list.contains(str2);
        List<String> listA0b = zContains ? AbstractC0878AGe.A0b(list, str2) : Collections.singletonList(str2);
        applyReactions(str, listA0b, zA1Y);
        AnonymousClass001.A1J(new C113761(str, str2, zContains, listA0b, list, null), this.scope);
    }

    private final HatchMessage adoptHistorySeqForLocalImage(HatchMessage hatchMessage, Map<String, HatchMessage> map, Map<String, HatchMessage> map2) {
        String str;
        String strDedupeContentKey;
        HatchMessage hatchMessage2;
        Long l;
        if (!hasDisplayedLocalImage(hatchMessage) || hatchMessage.seq != null || ((((str = hatchMessage.serverMessageId) == null || (hatchMessage2 = map.get(str)) == null) && ((strDedupeContentKey = dedupeContentKey(hatchMessage)) == null || (hatchMessage2 = map2.get(strDedupeContentKey)) == null)) || (l = hatchMessage2.seq) == null)) {
            return hatchMessage;
        }
        String str2 = hatchMessage.serverMessageId;
        if (str2 == null) {
            str2 = hatchMessage2.id;
        }
        return HatchMessage.copy$default(hatchMessage, null, null, null, 0L, null, null, null, l, str2, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, -385, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void appendStreamingUserMessage(String str, String str2) {
        HatchConversationState value;
        HatchConversationState hatchConversationStateCopy$default;
        BLG<HatchConversationState> blg = this._conversationState;
        do {
            value = blg.getValue();
            hatchConversationStateCopy$default = value;
            if (C7384Etj.areEqual(hatchConversationStateCopy$default.streamingUserMessageId, str)) {
                Iterator itA14 = C60O.A14(hatchConversationStateCopy$default);
                int i = 0;
                while (itA14.hasNext()) {
                    HatchMessage hatchMessageA0K = C60Q.A0K(itA14);
                    if (hatchMessageA0K.role != HatchMessageRole.USER || (!C7384Etj.areEqual(hatchMessageA0K.id, str) && !C7384Etj.areEqual(hatchMessageA0K.serverMessageId, str))) {
                        i++;
                    } else if (i >= 0) {
                        ArrayList arrayListA0R = AbstractC0878AGe.A0R(hatchConversationStateCopy$default.messages);
                        arrayListA0R.set(i, HatchMessage.copy$default((HatchMessage) arrayListA0R.get(i), null, null, FGI.A0M(((HatchMessage) arrayListA0R.get(i)).content, str2), 0L, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, -5, 3, null));
                        hatchConversationStateCopy$default = HatchConversationState.copy$default(hatchConversationStateCopy$default, null, arrayListA0R, null, null, null, null, false, null, false, null, null, null, null, false, null, 32765, null);
                    }
                }
            }
        } while (!blg.A6e(value, hatchConversationStateCopy$default));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyReactions(String str, List<String> list, boolean z) {
        HatchConversationState value;
        HatchConversationState hatchConversationState;
        Map mapA09;
        boolean zAreEqual;
        BLG<HatchConversationState> blg = this._conversationState;
        do {
            value = blg.getValue();
            hatchConversationState = value;
            boolean zIsEmpty = list.isEmpty();
            Map<String, List<String>> map = hatchConversationState.reactions;
            mapA09 = zIsEmpty ? AGH.A09(str, map) : AnonymousClass006.A11(str, list, map);
            zAreEqual = C7384Etj.areEqual(mapA09, hatchConversationState.reactions);
        } while (!blg.A6e(value, HatchConversationState.copy$default(hatchConversationState, null, null, null, null, null, null, false, null, false, null, null, mapA09, null, false, null, 30719, null)));
        if (zAreEqual || !z) {
            return;
        }
        this._reactionLanded.AhV(new HatchReactionLanding(str, (String) AbstractC0878AGe.A0I(list)));
    }

    public static /* synthetic */ void applyReactions$default(HatchConversationRepository hatchConversationRepository, String str, List list, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        hatchConversationRepository.applyReactions(str, list, z);
    }

    private final void armSendWatchdog(String str) {
        HtJ htJA13 = AnonymousClass006.A13(this.sendWatchdogs.remove(str));
        this.sendWatchdogs.put(str, AnonymousClass001.A11(new C113521(str, htJA13), this.scope));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void armStreamIdleWatchdog() {
        HtJ htJA13 = AnonymousClass006.A13(this.streamIdleWatchdogJob);
        this.streamIdleWatchdogJob = AnonymousClass001.A11(new C113531(htJA13), this.scope);
    }

    private final Map<String, Object> buildSendExtraParams(Map<String, ? extends Object> map) {
        EuR location = HatchLocationProvider.INSTANCE.getLocation(this.appContext);
        C0924AIa c0924AIaA0u = C3cG.A0u();
        if (location != null) {
            Location location2 = location.A00;
            c0924AIaA0u.put(GeofenceEventWorker.KEY_LATITUDE, Double.valueOf(location2.getLatitude()));
            c0924AIaA0u.put(GeofenceEventWorker.KEY_LONGITUDE, Double.valueOf(location2.getLongitude()));
            Long lA01 = location.A01();
            if (lA01 != null) {
                c0924AIaA0u.put(HatchConversationRepositoryKt.LOCATION_FIX_TIMESTAMP_MS_KEY, lA01);
            }
        }
        String id = TimeZone.getDefault().getID();
        C7384Etj.A0U(id);
        c0924AIaA0u.put(FeedRepositoryKt.TIMEZONE_PARAM, id);
        String languageTag = Locale.getDefault().toLanguageTag();
        C7384Etj.A0U(languageTag);
        c0924AIaA0u.put("user_locale", languageTag);
        c0924AIaA0u.put("node_id", C60O.A0l());
        String strWireSessionId = wireSessionId();
        if (strWireSessionId != null) {
            c0924AIaA0u.put("session_id", strWireSessionId);
        }
        if (map != null) {
            c0924AIaA0u.putAll(map);
        }
        return AIW.A0K(c0924AIaA0u);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Map buildSendExtraParams$default(HatchConversationRepository hatchConversationRepository, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = null;
        }
        return hatchConversationRepository.buildSendExtraParams(map);
    }

    private final void cancelPendingTranscriptFlush() {
        HoC hoC;
        synchronized (this.transcriptFlushLock) {
            this.transcriptFlushGeneration++;
            hoC = this.transcriptFlushJob;
            this.transcriptFlushJob = null;
            this.pendingTranscriptTurnId = null;
        }
        if (hoC != null) {
            hoC.A5w(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean completePendingMessage(String str) {
        boolean z;
        synchronized (this.pendingMessagesLock) {
            if (C7384Etj.areEqual(this.pendingMessageInFlightRequestId, str)) {
                this.pendingMessageInFlightRequestId = null;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    private final boolean completesTruncatedCopy(HatchMessage hatchMessage, HatchMessage hatchMessage2) {
        String str;
        int length;
        if (hatchMessage.role != HatchMessageRole.AGENT || (length = (str = hatchMessage2.content).length()) <= 0) {
            return false;
        }
        String str2 = hatchMessage.content;
        return str2.length() > length && str2.startsWith(str);
    }

    private final String dedupeContentKey(HatchMessage hatchMessage) {
        return C60O.A0q(HatchConversationRepositoryKt.messageContentWhitespaceRegex.A03(AnonymousClass002.A0l(hatchMessage.content), InviteCodeScratcherKt.CODE_SEPARATOR));
    }

    private final void emitConversationFetchFailure(String str) {
        HatchStartupQpl.Companion.markerPoint(HatchStartupPoints.CONVERSATION_FETCH_END, C60O.A0s("FAILURE", str));
    }

    private final void emitConversationFetchSuccess() {
        HatchStartupQpl.Companion.markerPoint(HatchStartupPoints.CONVERSATION_FETCH_END, C60O.A0s("SUCCESS", null));
    }

    private final void emitConversationRefreshFailure(String str) {
        HatchStartupQpl.Companion.markerPoint(HatchStartupPoints.CONVERSATION_REFRESH_END, C60O.A0s("FAILURE", str));
    }

    private final void emitConversationRefreshSuccess() {
        HatchStartupQpl.Companion.markerPoint(HatchStartupPoints.CONVERSATION_REFRESH_END, C60O.A0s("SUCCESS", null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishStreamingUserMessage(String str) {
        HatchConversationState value;
        HatchConversationState hatchConversationStateCopy$default;
        BLG<HatchConversationState> blg = this._conversationState;
        do {
            value = blg.getValue();
            hatchConversationStateCopy$default = value;
            if (C7384Etj.areEqual(hatchConversationStateCopy$default.streamingUserMessageId, str)) {
                hatchConversationStateCopy$default = HatchConversationState.copy$default(hatchConversationStateCopy$default, null, null, null, null, null, null, false, null, false, null, null, null, null, false, null, 32751, null);
            }
        } while (!blg.A6e(value, hatchConversationStateCopy$default));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void flushPendingMessages() {
        Object next;
        HatchConversationState value;
        HatchConversationState hatchConversationState;
        ArrayList arrayList;
        HatchConversationState value2;
        if (this.gateway.connectionState.getValue() instanceof HatchGatewayConnectionState.Connected) {
            synchronized (this.pendingMessagesLock) {
                if (this.pendingMessageInFlightRequestId != null || this.pendingMessages.isEmpty()) {
                    return;
                }
                PendingMessage pendingMessageRemove = this.pendingMessages.remove(0);
                this.pendingMessageInFlightRequestId = pendingMessageRemove.requestId;
                Iterator itA14 = C60O.A14(C60O.A04(this));
                while (true) {
                    if (itA14.hasNext()) {
                        next = itA14.next();
                        if (C7384Etj.areEqual(((HatchMessage) next).requestId, pendingMessageRemove.requestId)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                HatchMessage hatchMessage = (HatchMessage) next;
                if (hatchMessage != null && hatchMessage.isPending && isStaleSend(hatchMessage, System.currentTimeMillis()) && getPauseQueuedSendExpiryWhileOffline()) {
                    updateMessageSendStatus(pendingMessageRemove.requestId, HatchMessageSendStatus.FAILED, null, HatchSendErrorCategory.TRANSPORT, null);
                    completePendingMessage(pendingMessageRemove.requestId);
                    flushPendingMessages();
                    return;
                }
                BLG<HatchConversationState> blg = this._conversationState;
                do {
                    value = blg.getValue();
                    hatchConversationState = value;
                    List<HatchMessage> list = hatchConversationState.messages;
                    arrayList = new ArrayList(Hr7.A1D(list, 10));
                    for (HatchMessage hatchMessageCopy$default : list) {
                        if (C7384Etj.areEqual(hatchMessageCopy$default.requestId, pendingMessageRemove.requestId)) {
                            hatchMessageCopy$default = HatchMessage.copy$default(hatchMessageCopy$default, null, null, null, 0L, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, -131073, 3, null);
                        }
                        arrayList.add(hatchMessageCopy$default);
                    }
                } while (!blg.A6e(value, HatchConversationState.copy$default(hatchConversationState, null, arrayList, null, null, null, null, false, null, false, null, null, null, null, false, null, 32765, null)));
                CFK.A05("HatchConversationRepository", C60O.A0r("Flushing next pending message (requestId=", pendingMessageRemove.requestId));
                BLG<HatchConversationState> blg2 = this._conversationState;
                do {
                    value2 = blg2.getValue();
                } while (!blg2.A6e(value2, HatchConversationState.copy$default(value2, null, null, StreamingState.PendingResponse, null, null, null, false, null, false, null, null, null, null, false, null, 32763, null)));
                this.resentRequestIds.add(pendingMessageRemove.requestId);
                this.gateway.sendChatMessage(pendingMessageRemove.text, pendingMessageRemove.attachments, withLocationUploadTimestamp(withLiveSessionRouting(withCurrentReplyTarget(pendingMessageRemove.extraParams, pendingMessageRemove.requestId), pendingMessageRemove.routeToLiveSession, pendingMessageRemove.liveSessionTargetThreadId)), pendingMessageRemove.inReplyTo, pendingMessageRemove.requestId);
                this.qplLogger.onWebSocketFrameSent(pendingMessageRemove.requestId);
                armSendWatchdog(pendingMessageRemove.requestId);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0207  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void flushTranscript(java.lang.String r58, java.lang.Long r59) {
        /*
            Method dump skipped, instructions count: 992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchConversationRepository.flushTranscript(java.lang.String, java.lang.Long):void");
    }

    public static /* synthetic */ void flushTranscript$default(HatchConversationRepository hatchConversationRepository, String str, Long l, int i, Object obj) {
        if ((i & 2) != 0) {
            l = null;
        }
        hatchConversationRepository.flushTranscript(str, l);
    }

    private final void flushTranscriptNow(String str) {
        HoC hoC;
        String str2;
        synchronized (this.transcriptFlushLock) {
            this.transcriptFlushGeneration++;
            hoC = this.transcriptFlushJob;
            this.transcriptFlushJob = null;
            str2 = this.pendingTranscriptTurnId;
            this.pendingTranscriptTurnId = null;
        }
        if (hoC != null) {
            hoC.A5w(null);
        }
        if (str == null) {
            str = str2;
        }
        flushTranscript(str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getPauseQueuedSendExpiryWhileOffline() {
        return C31u.A01(this, this.pauseQueuedSendExpiryWhileOffline$delegate, $$delegatedProperties, 1);
    }

    public static final HatchMessage handleChatEvent$redacted(HatchMessage hatchMessage, String str) {
        return HatchMessage.copy$default(hatchMessage, null, null, str, 0L, null, null, null, null, null, null, C0881AGi.A00, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, -1476398133, 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void handleMessageAssistant(com.facebook.aura.model.HatchChatEvent.MessageAssistant r47) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchConversationRepository.handleMessageAssistant(com.facebook.aura.model.HatchChatEvent$MessageAssistant):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03fb A[EDGE_INSN: B:230:0x03fb->B:157:0x03fb BREAK  A[LOOP:6: B:165:0x0429->B:231:0x0429]] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0515 A[PHI: r2
  0x0515: PHI (r2v68 int) = (r2v39 int), (r2v76 int) binds: [B:146:0x03dc, B:184:0x047e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0257  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void handleMessageUser(com.facebook.aura.model.HatchChatEvent.MessageUser r58) {
        /*
            Method dump skipped, instructions count: 1497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchConversationRepository.handleMessageUser(com.facebook.aura.model.HatchChatEvent$MessageUser):void");
    }

    private final void handleMessagesRemoved(HatchChatEvent.MessagesRemoved messagesRemoved) {
        List<String> list = messagesRemoved.messageIds;
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass007.A19(linkedHashSetA0k, it);
        }
        removeMessages(linkedHashSetA0k);
    }

    private final void handlePresentation(HatchChatEvent.Presentation presentation) {
        HatchConversationState value;
        int i;
        HatchConversationState hatchConversationStateCopy$default;
        HatchWidgetPresentation hatchWidgetPresentation = presentation.presentation;
        String str = hatchWidgetPresentation.hostMessageId;
        String str2 = hatchWidgetPresentation.presentationId;
        String strA17 = str != null ? BQG.A17(str, 20) : null;
        String strHtmlBackedPresentationHtml = HatchWidgetPresentationKt.htmlBackedPresentationHtml(hatchWidgetPresentation);
        int length = strHtmlBackedPresentationHtml != null ? strHtmlBackedPresentationHtml.length() : 0;
        Long l = hatchWidgetPresentation.seq;
        StringBuilder sbA0x = C3cI.A0x("handlePresentation: id=", str2);
        sbA0x.append(" hostId=");
        sbA0x.append(strA17);
        sbA0x.append(" htmlLen=");
        sbA0x.append(length);
        CFK.A05("HatchConversationRepository", AnonymousClass006.A0y(l, " seq=", sbA0x));
        if (str == null) {
            CFK.A06("HatchConversationRepository", "handlePresentation: hostMessageId is null, dropping presentation");
            return;
        }
        HatchConversationState hatchConversationStateA04 = C60O.A04(this);
        String strFindWidgetTokenHostMessageId = HatchPresentationTokenBinderKt.findWidgetTokenHostMessageId(AbstractC0878AGe.A0P(hatchConversationStateA04.messages, hatchConversationStateA04.history), hatchWidgetPresentation);
        if (strFindWidgetTokenHostMessageId == null) {
            strFindWidgetTokenHostMessageId = str;
        }
        ConversationLivePresentationHooks conversationLivePresentationHooks = ConversationLivePresentationHooks.INSTANCE;
        if (!conversationLivePresentationHooks.isRestoredPresentation(hatchConversationStateA04.messages, hatchWidgetPresentation.presentationId, strFindWidgetTokenHostMessageId) && !conversationLivePresentationHooks.isRestoredPresentation(hatchConversationStateA04.history, hatchWidgetPresentation.presentationId, strFindWidgetTokenHostMessageId)) {
            conversationLivePresentationHooks.notifyDelivered(this.userSession, hatchWidgetPresentation);
        }
        BLG<HatchConversationState> blg = this._conversationState;
        do {
            value = blg.getValue();
            HatchConversationState hatchConversationState = value;
            String strFindWidgetTokenHostMessageId2 = HatchPresentationTokenBinderKt.findWidgetTokenHostMessageId(AbstractC0878AGe.A0P(hatchConversationState.messages, hatchConversationState.history), hatchWidgetPresentation);
            if (strFindWidgetTokenHostMessageId2 == null) {
                strFindWidgetTokenHostMessageId2 = str;
            }
            HatchWidgetPresentation hatchWidgetPresentationCopy$default = HatchWidgetPresentation.copy$default(hatchWidgetPresentation, null, null, null, null, strFindWidgetTokenHostMessageId2, null, null, null, null, null, false, 2031, null);
            List<HatchMessage> listStripPresentationElsewhere = stripPresentationElsewhere(hatchConversationState.messages, hatchWidgetPresentation.presentationId, strFindWidgetTokenHostMessageId2);
            List<HatchMessage> listStripPresentationElsewhere2 = stripPresentationElsewhere(hatchConversationState.history, hatchWidgetPresentation.presentationId, strFindWidgetTokenHostMessageId2);
            Iterator<HatchMessage> it = listStripPresentationElsewhere.iterator();
            int i2 = 0;
            while (true) {
                i = -1;
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                } else if (strFindWidgetTokenHostMessageId2.equals(C60Q.A0l(it))) {
                    break;
                } else {
                    i2++;
                }
            }
            Iterator<HatchMessage> it2 = listStripPresentationElsewhere2.iterator();
            int i3 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (strFindWidgetTokenHostMessageId2.equals(C60Q.A0l(it2))) {
                    i = i3;
                    break;
                }
                i3++;
            }
            String strA172 = BQG.A17(str, 20);
            int size = listStripPresentationElsewhere.size();
            int size2 = listStripPresentationElsewhere2.size();
            StringBuilder sbA0x2 = C3cI.A0x("handlePresentation: hostId=", strA172);
            sbA0x2.append(" msgIdx=");
            sbA0x2.append(i2);
            sbA0x2.append(" histIdx=");
            sbA0x2.append(i);
            sbA0x2.append(" messagesCount=");
            sbA0x2.append(size);
            CFK.A05("HatchConversationRepository", C60P.A1O(" historyCount=", sbA0x2, size2));
            if (i2 >= 0) {
                HatchMessage hatchMessage = listStripPresentationElsewhere.get(i2);
                HatchMessage hatchMessageCopy$default = HatchMessage.copy$default(hatchMessage, null, null, null, 0L, null, null, null, HatchWidgetPresentationKt.conversationSeq(hatchWidgetPresentation, hatchMessage.seq), null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, HatchPresentationTokenBinderKt.mergeWidgetPresentation(hatchMessage.presentations, hatchWidgetPresentationCopy$default), false, null, null, false, null, -268435585, 3, null);
                ArrayList arrayList = new ArrayList(listStripPresentationElsewhere);
                arrayList.set(i2, hatchMessageCopy$default);
                List<HatchWidgetPresentation> list = hatchMessageCopy$default.presentations;
                C60P.A1X(list != null ? C60Q.A0W(list) : null, ", presentationCount=", "HatchConversationRepository", C60O.A0y("handlePresentation: merged into existing message at msgIdx=", i2));
                hatchConversationStateCopy$default = HatchConversationState.copy$default(hatchConversationState, listStripPresentationElsewhere2, arrayList, null, null, null, null, false, null, false, null, null, null, null, false, null, 32764, null);
            } else if (i >= 0) {
                HatchMessage hatchMessage2 = listStripPresentationElsewhere2.get(i);
                HatchMessage hatchMessageCopy$default2 = HatchMessage.copy$default(hatchMessage2, null, null, null, 0L, null, null, null, HatchWidgetPresentationKt.conversationSeq(hatchWidgetPresentation, hatchMessage2.seq), null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, HatchPresentationTokenBinderKt.mergeWidgetPresentation(hatchMessage2.presentations, hatchWidgetPresentationCopy$default), false, null, null, false, null, -268435585, 3, null);
                ArrayList arrayList2 = new ArrayList(listStripPresentationElsewhere2);
                arrayList2.set(i, hatchMessageCopy$default2);
                List<HatchWidgetPresentation> list2 = hatchMessageCopy$default2.presentations;
                C60P.A1X(list2 != null ? C60Q.A0W(list2) : null, ", presentationCount=", "HatchConversationRepository", C60O.A0y("handlePresentation: merged into history at histIdx=", i));
                hatchConversationStateCopy$default = HatchConversationState.copy$default(hatchConversationState, arrayList2, listStripPresentationElsewhere, null, null, null, null, false, null, false, null, null, null, null, false, null, 32764, null);
            } else {
                Long lConversationSeq = HatchWidgetPresentationKt.conversationSeq(hatchWidgetPresentation);
                Long l2 = hatchWidgetPresentation.chatEventSeq;
                Long l3 = hatchWidgetPresentation.seq;
                StringBuilder sbA0x3 = C3cI.A0x("handlePresentation: creating new carrier message id=", str);
                sbA0x3.append(" seq=");
                sbA0x3.append(lConversationSeq);
                sbA0x3.append(" (chatEventSeq=");
                sbA0x3.append(l2);
                CFK.A05("HatchConversationRepository", C3cJ.A0L(l3, " eventSeq=", sbA0x3));
                int i4 = HatchMessage.$stable;
                HatchMessageRole hatchMessageRole = HatchMessageRole.AGENT;
                long jCurrentTimeMillis = System.currentTimeMillis();
                List listSingletonList = Collections.singletonList(hatchWidgetPresentationCopy$default);
                C0881AGi c0881AGi = C0881AGi.A00;
                hatchConversationStateCopy$default = HatchConversationState.copy$default(hatchConversationState, listStripPresentationElsewhere2, AbstractC0878AGe.A0Q(new HatchMessage(str, hatchMessageRole, "", jCurrentTimeMillis, null, null, null, lConversationSeq, null, c0881AGi, c0881AGi, null, null, null, false, null, null, false, null, null, null, null, HatchMessageSendStatus.SENT, HatchMessageUnsendStatus.NONE, null, null, null, null, listSingletonList, true, null, null, false, null), listStripPresentationElsewhere), null, null, null, null, false, null, false, null, null, null, null, false, null, 32764, null);
            }
        } while (!blg.A6e(value, HatchConversationRepositoryKt.withTokenBoundWidgetPresentations(hatchConversationStateCopy$default)));
        maybeEmitLiveComposerHint(AbstractC0885AGm.A0z(hatchWidgetPresentation.getWidget()));
    }

    private final void handleReactionsUpdated(HatchChatEvent.ReactionsUpdated reactionsUpdated) {
        applyReactions(reactionsUpdated.messageId, reactionsUpdated.reactions, true);
    }

    private final boolean hasDisplayedLocalImage(HatchMessage hatchMessage) {
        String str;
        List<HatchAttachment> list = hatchMessage.attachments;
        if (list != null && (!(list instanceof Collection) || !list.isEmpty())) {
            for (HatchAttachment hatchAttachment : list) {
                if (hatchAttachment.isImage() && (str = hatchAttachment.uri) != null && str.startsWith("content://")) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean hasPendingMessageWork() {
        /*
            r3 = this;
            java.lang.Object r2 = r3.pendingMessagesLock
            monitor-enter(r2)
            java.lang.String r0 = r3.pendingMessageInFlightRequestId     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L10
            java.util.List<com.facebook.aura.conversation.repo.HatchConversationRepository$PendingMessage> r0 = r3.pendingMessages     // Catch: java.lang.Throwable -> L13
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L13
            r0 = 0
            if (r1 != 0) goto L11
        L10:
            r0 = 1
        L11:
            monitor-exit(r2)
            return r0
        L13:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchConversationRepository.hasPendingMessageWork():boolean");
    }

    public static /* synthetic */ int indexOfUserMessageToStamp$default(HatchConversationRepository hatchConversationRepository, List list, HatchMessage hatchMessage, int i, Object obj) {
        if ((i & 2) != 0) {
            hatchMessage = null;
        }
        return hatchConversationRepository.indexOfUserMessageToStamp(list, hatchMessage);
    }

    private final boolean isRemovedBy(HatchWidgetPresentation hatchWidgetPresentation, Set<String> set) {
        String str;
        return set.contains(hatchWidgetPresentation.presentationId) || ((str = hatchWidgetPresentation.presentationEventId) != null && set.contains(str));
    }

    private final boolean isStaticResponseRedactionEnabled() {
        return C31u.A01(this, this.isStaticResponseRedactionEnabled$delegate, $$delegatedProperties, 0);
    }

    public static /* synthetic */ Object jumpToMessage$default(HatchConversationRepository hatchConversationRepository, String str, Long l, HtJ htJ, int i, Object obj) {
        if ((i & 2) != 0) {
            l = null;
        }
        return hatchConversationRepository.jumpToMessage(str, l, htJ);
    }

    public static /* synthetic */ Object loadChatHistory$default(HatchConversationRepository hatchConversationRepository, int i, boolean z, boolean z2, HtJ htJ, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 10;
        }
        return hatchConversationRepository.loadChatHistory(i, AnonymousClass001.A1Q(i2, z), AnonymousClass005.A1O(i2, z2), htJ);
    }

    public static /* synthetic */ Object loadMoreHistory$default(HatchConversationRepository hatchConversationRepository, int i, HtJ htJ, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 20;
        }
        return hatchConversationRepository.loadMoreHistory(i, htJ);
    }

    private final void maybeEmitLiveComposerHint(List<HatchWidget> list) {
        OptionWidgetData optionWidgetData;
        String str;
        if (list != null) {
            for (HatchWidget hatchWidget : list) {
                HatchWidgetData hatchWidgetData = hatchWidget.data;
                if ((hatchWidgetData instanceof OptionWidgetData) && (optionWidgetData = (OptionWidgetData) hatchWidgetData) != null && (str = optionWidgetData.composerHint) != null && HatchWidgetPresentationKt.optionWidgetResolvedSelection(hatchWidget.state, optionWidgetData) == null) {
                    this._liveComposerHint.AhV(str);
                    return;
                }
            }
        }
    }

    private final HatchMessage mergeCanonicalUserMessage(HatchMessage hatchMessage, HatchMessage hatchMessage2) {
        Long l = hatchMessage2.seq;
        String str = hatchMessage2.id;
        String str2 = hatchMessage2.content;
        if (str2.length() <= 0) {
            str2 = hatchMessage.content;
        }
        List<HatchAttachment> listMergeEchoAttachmentsKeepingLocalImages = mergeEchoAttachmentsKeepingLocalImages(hatchMessage.attachments, hatchMessage2.attachments);
        ReplyAttribution replyAttributionMergeReplyAttribution = mergeReplyAttribution(hatchMessage2.replyAttribution, hatchMessage.replyAttribution);
        HatchMessageUnsendStatus hatchMessageUnsendStatus = hatchMessage2.unsendStatus;
        HatchMessageUnsendStatus hatchMessageUnsendStatus2 = HatchMessageUnsendStatus.DELETED;
        if (hatchMessageUnsendStatus != hatchMessageUnsendStatus2) {
            hatchMessageUnsendStatus2 = hatchMessage.unsendStatus;
        }
        return HatchMessage.copy$default(hatchMessage, null, null, str2, 0L, listMergeEchoAttachmentsKeepingLocalImages, null, null, l, str, null, null, null, null, null, false, null, replyAttributionMergeReplyAttribution, false, null, null, null, null, null, hatchMessageUnsendStatus2, null, null, null, null, null, false, null, null, false, null, -8454549, 3, null);
    }

    private final List<HatchAttachment> mergeEchoAttachmentsKeepingLocalImages(List<HatchAttachment> list, List<HatchAttachment> list2) {
        String str;
        if (list2 == null) {
            return list;
        }
        if (list == null || list.size() != list2.size()) {
            return list2;
        }
        ArrayList arrayListA0i = AnonymousClass003.A0i(list2);
        int i = 0;
        for (HatchAttachment hatchAttachment : list2) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0885AGm.A14();
                throw F60.createAndThrow();
            }
            HatchAttachment hatchAttachment2 = list.get(i);
            if (hatchAttachment2.isImage() && (str = hatchAttachment2.uri) != null && str.startsWith("content://")) {
                hatchAttachment = hatchAttachment2;
            }
            arrayListA0i.add(hatchAttachment);
            i = i2;
        }
        return arrayListA0i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        r6.add(r4);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List<com.facebook.aura.model.HatchWidget>] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List<com.facebook.aura.model.HatchWidget>] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.AbstractCollection, java.util.AbstractList, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<com.facebook.aura.model.HatchWidget> mergeInlineWidgets(java.util.List<com.facebook.aura.model.HatchWidget> r6, java.util.List<com.facebook.aura.model.HatchWidget> r7) {
        /*
            r5 = this;
            if (r7 == 0) goto L52
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L52
            if (r6 != 0) goto Lc
            X.AGi r6 = X.C0881AGi.A00
        Lc:
            java.util.ArrayList r6 = X.AbstractC0878AGe.A0R(r6)
            java.util.Iterator r5 = r7.iterator()
        L14:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L52
            java.lang.Object r4 = r5.next()
            com.facebook.aura.model.HatchWidget r4 = (com.facebook.aura.model.HatchWidget) r4
            java.util.Iterator r3 = r6.iterator()
            r2 = 0
        L25:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r0 = r3.next()
            com.facebook.aura.model.HatchWidget r0 = (com.facebook.aura.model.HatchWidget) r0
            java.lang.String r1 = r0.widgetId
            java.lang.String r0 = r4.widgetId
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L4b
            if (r2 < 0) goto L4e
            java.lang.Object r0 = r6.get(r2)
            com.facebook.aura.model.HatchWidget r0 = (com.facebook.aura.model.HatchWidget) r0
            com.facebook.aura.model.HatchWidget r0 = com.facebook.aura.model.HatchWidgetPresentationKt.preserveWidgetState(r0, r4)
            r6.set(r2, r0)
            goto L14
        L4b:
            int r2 = r2 + 1
            goto L25
        L4e:
            r6.add(r4)
            goto L14
        L52:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchConversationRepository.mergeInlineWidgets(java.util.List, java.util.List):java.util.List");
    }

    private final HatchMessage patchAttachmentUrisFromEcho(HatchMessage hatchMessage, List<HatchAttachment> list) {
        List<HatchAttachment> list2 = hatchMessage.attachments;
        if (list2 != null && list2.size() == list.size()) {
            ArrayList arrayListA0i = AnonymousClass003.A0i(list2);
            boolean z = false;
            int i = 0;
            for (HatchAttachment hatchAttachment : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC0885AGm.A14();
                    throw F60.createAndThrow();
                }
                HatchAttachment hatchAttachmentCopy$default = hatchAttachment;
                String str = list.get(i).uri;
                String str2 = hatchAttachmentCopy$default.uri;
                if (str != null && !str.startsWith("content://") && str2 != null && str2.startsWith("content://") && !hatchAttachmentCopy$default.isImage()) {
                    z = true;
                    hatchAttachmentCopy$default = HatchAttachment.copy$default(hatchAttachmentCopy$default, null, null, str, null, null, null, null, null, null, null, 1019, null);
                }
                arrayListA0i.add(hatchAttachmentCopy$default);
                i = i2;
            }
            if (z) {
                return HatchMessage.copy$default(hatchMessage, null, null, null, 0L, arrayListA0i, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, -17, 3, null);
            }
        }
        return hatchMessage;
    }

    private final void probeCheckpointStatusForSend() {
        AnonymousClass001.A1J(new C113641(null), this.scope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reQueueSendingMessagesAsPending() {
        String str;
        synchronized (this.pendingMessagesLock) {
            this.pendingMessageInFlightRequestId = null;
            Set<String> setKeySet = this.transportRejectionRetryJobs.keySet();
            C7384Etj.A0U(setKeySet);
            Set setA0g = AbstractC0878AGe.A0g(setKeySet);
            Iterator it = setA0g.iterator();
            while (it.hasNext()) {
                HoC hoCRemove = this.transportRejectionRetryJobs.remove((String) it.next());
                if (hoCRemove != null) {
                    hoCRemove.A5w(null);
                }
            }
            List<PendingMessage> list = this.pendingMessages;
            ArrayList arrayListA0m = AnonymousClass002.A0m(list);
            Iterator<PendingMessage> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayListA0m.add(it2.next().requestId);
            }
            Set setA0g2 = AbstractC0878AGe.A0g(arrayListA0m);
            List<HatchMessage> list2 = C60O.A04(this).messages;
            ArrayList arrayListA0h = C3cG.A0h();
            for (HatchMessage hatchMessage : list2) {
                HatchMessage hatchMessage2 = hatchMessage;
                if (hatchMessage2.sendStatus == HatchMessageSendStatus.SENDING && (str = hatchMessage2.requestId) != null && !AbstractC0878AGe.A0k(setA0g2, str) && (AbstractC0878AGe.A0k(setA0g, hatchMessage2.requestId) || !AbstractC0878AGe.A0k(this.resentRequestIds, hatchMessage2.requestId))) {
                    arrayListA0h.add(hatchMessage);
                }
            }
            if (!arrayListA0h.isEmpty()) {
                ArrayList<HatchMessage> arrayListA0h2 = C3cG.A0h();
                ArrayList<HatchMessage> arrayListA0h3 = C3cG.A0h();
                for (Object obj : arrayListA0h) {
                    if (AbstractC0878AGe.A0k(setA0g, ((HatchMessage) obj).requestId)) {
                        arrayListA0h2.add(obj);
                    } else {
                        arrayListA0h3.add(obj);
                    }
                }
                List<PendingMessage> list3 = this.pendingMessages;
                ArrayList arrayListA0m2 = AnonymousClass002.A0m(arrayListA0h2);
                for (HatchMessage hatchMessage3 : arrayListA0h2) {
                    String str2 = hatchMessage3.requestId;
                    if (str2 == null) {
                        throw C60O.A0i("Required value was null.");
                    }
                    arrayListA0m2.add(toPendingMessage(hatchMessage3, str2));
                }
                list3.addAll(0, arrayListA0m2);
                for (HatchMessage hatchMessage4 : arrayListA0h3) {
                    List<PendingMessage> list4 = this.pendingMessages;
                    String str3 = hatchMessage4.requestId;
                    if (str3 == null) {
                        throw C60O.A0i("Required value was null.");
                    }
                    list4.add(toPendingMessage(hatchMessage4, str3));
                }
                C60O.A1O("Re-queued ", arrayListA0h.size(), " in-flight message(s) after transport failure", "HatchConversationRepository");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final HxE<List<HatchMessage>, List<HatchMessage>> reconcileHistoryRows(List<HatchMessage> list, List<HatchMessage> list2) {
        HatchMessage hatchMessageCopy$default;
        List<HatchMessage> list3 = list;
        int iA03 = C3cG.A03(list3, 10);
        if (iA03 < 16) {
            iA03 = 16;
        }
        LinkedHashMap linkedHashMapA15 = C60O.A15(iA03);
        for (HatchMessage hatchMessage : list3) {
            linkedHashMapA15.put(hatchMessage.id, hatchMessage);
        }
        ArrayList arrayListA0h = C3cG.A0h();
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (HatchMessage hatchMessage2 : list2) {
            if (linkedHashMapA15.containsKey(hatchMessage2.id)) {
                arrayListA0h.add(hatchMessage2);
            } else {
                arrayListA0h2.add(hatchMessage2);
            }
        }
        HxE hxEA0r = C3cG.A0r(arrayListA0h, arrayListA0h2);
        List list4 = (List) hxEA0r.first;
        B b = hxEA0r.second;
        ArrayList<HatchMessage> arrayListA0h3 = C3cG.A0h();
        for (Object obj : list4) {
            HatchMessage hatchMessage3 = (HatchMessage) obj;
            if ((hatchMessage3.presentations != null && (!r0.isEmpty())) || hatchMessage3.segments != null || hatchMessage3.unsendStatus == HatchMessageUnsendStatus.DELETED || completesTruncatedCopy(hatchMessage3, (HatchMessage) AbstractC2258BHp.A0L(hatchMessage3.id, linkedHashMapA15))) {
                arrayListA0h3.add(obj);
            }
        }
        int iA032 = C3cG.A03(arrayListA0h3, 10);
        if (iA032 < 16) {
            iA032 = 16;
        }
        LinkedHashMap linkedHashMapA152 = C60O.A15(iA032);
        for (HatchMessage hatchMessage4 : arrayListA0h3) {
            HatchMessage hatchMessageCopy$default2 = (HatchMessage) AbstractC2258BHp.A0L(hatchMessage4.id, linkedHashMapA15);
            if (completesTruncatedCopy(hatchMessage4, hatchMessageCopy$default2)) {
                String str = hatchMessage4.content;
                HatchDeltaTranscript hatchDeltaTranscriptWithAssistantText = hatchMessage4.transcript;
                if (hatchDeltaTranscriptWithAssistantText == null) {
                    HatchDeltaTranscript hatchDeltaTranscript = hatchMessageCopy$default2.transcript;
                    hatchDeltaTranscriptWithAssistantText = hatchDeltaTranscript != null ? HatchTranscriptKt.withAssistantText(hatchDeltaTranscript, str) : null;
                }
                hatchMessageCopy$default2 = HatchMessage.copy$default(hatchMessageCopy$default2, null, null, str, 0L, null, null, null, null, null, null, null, hatchDeltaTranscriptWithAssistantText, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, -2053, 3, null);
            }
            List list5 = hatchMessage4.presentations;
            if (list5 == null) {
                list5 = C0881AGi.A00;
            }
            Iterator it = list5.iterator();
            while (it.hasNext()) {
                hatchMessageCopy$default2 = HatchMessage.copy$default(hatchMessageCopy$default2, null, null, null, 0L, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, HatchPresentationTokenBinderKt.mergeWidgetPresentation(hatchMessageCopy$default2.presentations, (HatchWidgetPresentation) it.next()), false, null, null, false, null, -268435457, 3, null);
            }
            List<HatchTextEntitySegment> list6 = hatchMessage4.segments;
            if (list6 == null || (hatchMessageCopy$default = HatchMessage.copy$default(hatchMessageCopy$default2, null, null, null, 0L, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, list6, null, false, null, -1073741825, 3, null)) == null) {
                hatchMessageCopy$default = hatchMessageCopy$default2;
            }
            String str2 = hatchMessage4.id;
            HatchMessageUnsendStatus hatchMessageUnsendStatus = hatchMessage4.unsendStatus;
            HatchMessageUnsendStatus hatchMessageUnsendStatus2 = HatchMessageUnsendStatus.DELETED;
            if (hatchMessageUnsendStatus == hatchMessageUnsendStatus2) {
                hatchMessageCopy$default = HatchMessage.copy$default(hatchMessageCopy$default, null, null, null, 0L, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, hatchMessageUnsendStatus2, null, null, null, null, null, false, null, null, false, null, -8388609, 3, null);
            }
            HxE hxE = new HxE(str2, hatchMessageCopy$default);
            linkedHashMapA152.put(hxE.first, hxE.second);
        }
        if (!linkedHashMapA152.isEmpty()) {
            ArrayList arrayListA0m = AnonymousClass002.A0m(list3);
            for (HatchMessage hatchMessage5 : list3) {
                Object obj2 = linkedHashMapA152.get(hatchMessage5.id);
                if (obj2 != 0) {
                    hatchMessage5 = obj2;
                }
                arrayListA0m.add(hatchMessage5);
            }
            list3 = arrayListA0m;
        }
        return C3cG.A0r(list3, b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01bd A[Catch: all -> 0x02af, TryCatch #0 {, blocks: (B:52:0x0104, B:53:0x0106, B:97:0x01ef, B:56:0x011a, B:58:0x0122, B:59:0x0126, B:60:0x0134, B:62:0x013a, B:64:0x0145, B:65:0x0151, B:67:0x0157, B:69:0x0166, B:71:0x016c, B:73:0x0174, B:74:0x0178, B:76:0x0188, B:78:0x018c, B:81:0x0193, B:82:0x0197, B:84:0x019d, B:91:0x01b1, B:92:0x01b3, B:96:0x01bf, B:95:0x01bd, B:63:0x0142), top: B:142:0x0104 }] */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.Number] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x007d -> B:11:0x0037). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object recoverHistory(long r29, java.lang.Long r31, X.HtJ<? super java.lang.Long> r32) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchConversationRepository.recoverHistory(long, java.lang.Long, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object recoverHistoryWhenStreamsSettle(X.HtJ<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchConversationRepository.recoverHistoryWhenStreamsSettle(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void releaseRejectedSend(String str) {
        this.transportRejectionRetries.remove(str);
        synchronized (this.pendingMessagesLock) {
            AbstractC0882AGj.A0v(this.pendingMessages, new HatchConversationRepository$releaseRejectedSend$1$1(str));
        }
        if (completePendingMessage(str)) {
            flushPendingMessages();
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x006d -> B:17:0x0035). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x008b -> B:17:0x0035). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object reloadHistory(X.HtJ<? super kotlin.Unit> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.facebook.aura.conversation.repo.HatchConversationRepository.C113671
            if (r0 == 0) goto L2c
            r7 = r10
            com.facebook.aura.conversation.repo.HatchConversationRepository$reloadHistory$1 r7 = (com.facebook.aura.conversation.repo.HatchConversationRepository.C113671) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2c
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r1 = r7.result
            X.Hji r8 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r6 = 4
            r5 = 3
            r4 = 2
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L32
            if (r0 == r3) goto L47
            if (r0 == r4) goto L5a
            if (r0 == r5) goto L68
            if (r0 == r6) goto L32
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2c:
            com.facebook.aura.conversation.repo.HatchConversationRepository$reloadHistory$1 r7 = new com.facebook.aura.conversation.repo.HatchConversationRepository$reloadHistory$1
            r7.<init>(r10)
            goto L12
        L32:
            X.Hwg.A00(r1)
        L35:
            com.facebook.aura.gateway.HatchGatewayConnection r0 = r9.gateway
            X.1BN<com.facebook.aura.gateway.HatchGatewayConnectionState> r1 = r0.connectionState
            com.facebook.aura.conversation.repo.HatchConversationRepository$reloadHistory$2 r0 = new com.facebook.aura.conversation.repo.HatchConversationRepository$reloadHistory$2
            r0.<init>(r2)
            r7.label = r3
            java.lang.Object r0 = X.AbstractC9777Gfy.A00(r7, r0, r1)
            if (r0 != r8) goto L4a
            return r8
        L47:
            X.Hwg.A00(r1)
        L4a:
            X.BLG<com.facebook.aura.conversation.repo.HatchConversationState> r1 = r9._conversationState
            com.facebook.aura.conversation.repo.HatchConversationRepository$reloadHistory$3 r0 = new com.facebook.aura.conversation.repo.HatchConversationRepository$reloadHistory$3
            r0.<init>(r2)
            r7.label = r4
            java.lang.Object r0 = X.AbstractC9777Gfy.A00(r7, r0, r1)
            if (r0 != r8) goto L5d
            return r8
        L5a:
            X.Hwg.A00(r1)
        L5d:
            r7.label = r5
            r0 = 10
            java.lang.Object r1 = r9.loadChatHistory(r0, r3, r3, r7)
            if (r1 != r8) goto L6b
            return r8
        L68:
            X.Hwg.A00(r1)
        L6b:
            com.facebook.aura.conversation.repo.LoadChatHistoryOutcome r0 = com.facebook.aura.conversation.repo.LoadChatHistoryOutcome.ALREADY_LOADING
            if (r1 == r0) goto L35
            com.facebook.aura.conversation.repo.HatchConversationState r0 = X.C60O.A04(r9)
            com.facebook.aura.conversation.repo.HistoryLoadingState r1 = r0.historyLoadingState
            com.facebook.aura.conversation.repo.HistoryLoadingState r0 = com.facebook.aura.conversation.repo.HistoryLoadingState.SUCCESS
            if (r1 != r0) goto L7c
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L7c:
            com.facebook.aura.gateway.HatchGatewayConnection r0 = r9.gateway
            X.1BN<com.facebook.aura.gateway.HatchGatewayConnectionState> r1 = r0.connectionState
            com.facebook.aura.conversation.repo.HatchConversationRepository$reloadHistory$4 r0 = new com.facebook.aura.conversation.repo.HatchConversationRepository$reloadHistory$4
            r0.<init>(r2)
            r7.label = r6
            java.lang.Object r0 = X.AbstractC9777Gfy.A00(r7, r0, r1)
            if (r0 != r8) goto L35
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchConversationRepository.reloadHistory(X.HtJ):java.lang.Object");
    }

    private final void removeMessages(Set<String> set) {
        Long value;
        HatchConversationState value2;
        HatchConversationState hatchConversationStateWithTokenBoundWidgetPresentations;
        ArrayList arrayListA0P;
        ArrayList arrayListA0P2;
        int i;
        if (set.isEmpty()) {
            return;
        }
        synchronized (this.historyRecoveryLock) {
            BLG<Long> blg = this.historyRecoveryGeneration;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, Long.valueOf(C3cG.A05(value) + 1)));
        }
        requestHistoryRecovery();
        BLG<HatchConversationState> blg2 = this._conversationState;
        do {
            value2 = blg2.getValue();
            hatchConversationStateWithTokenBoundWidgetPresentations = value2;
            MessageRemovalOutcome messageRemovalOutcomeWithoutRemovedMessages = withoutRemovedMessages(hatchConversationStateWithTokenBoundWidgetPresentations.messages, set);
            MessageRemovalOutcome messageRemovalOutcomeWithoutRemovedMessages2 = withoutRemovedMessages(hatchConversationStateWithTokenBoundWidgetPresentations.history, set);
            arrayListA0P = AbstractC0878AGe.A0P(messageRemovalOutcomeWithoutRemovedMessages2.dropped, messageRemovalOutcomeWithoutRemovedMessages.dropped);
            arrayListA0P2 = AbstractC0878AGe.A0P(messageRemovalOutcomeWithoutRemovedMessages2.tombstoned, messageRemovalOutcomeWithoutRemovedMessages.tombstoned);
            i = messageRemovalOutcomeWithoutRemovedMessages.strippedCarriers + messageRemovalOutcomeWithoutRemovedMessages2.strippedCarriers;
            if (messageRemovalOutcomeWithoutRemovedMessages.getChanged() || messageRemovalOutcomeWithoutRemovedMessages2.getChanged()) {
                hatchConversationStateWithTokenBoundWidgetPresentations = HatchConversationRepositoryKt.withTokenBoundWidgetPresentations(HatchConversationState.copy$default(hatchConversationStateWithTokenBoundWidgetPresentations, messageRemovalOutcomeWithoutRemovedMessages2.kept, messageRemovalOutcomeWithoutRemovedMessages.kept, null, null, null, null, false, null, false, null, null, null, null, false, null, 32764, null));
            }
        } while (!blg2.A6e(value2, hatchConversationStateWithTokenBoundWidgetPresentations));
        if (arrayListA0P.isEmpty() && arrayListA0P2.isEmpty() && i == 0) {
            return;
        }
        int size = arrayListA0P.size();
        int size2 = arrayListA0P2.size();
        String strA0e = C3cH.A0e(",", AbstractC0878AGe.A0W(set));
        StringBuilder sbA0y = C60O.A0y("removeMessages: dropped ", size);
        sbA0y.append(" row(s), tombstoned ");
        sbA0y.append(size2);
        sbA0y.append(" row(s), stripped cards from ");
        sbA0y.append(i);
        CFK.A05("HatchConversationRepository", C60P.A1M(" carrier(s) for ids=", strA0e, sbA0y));
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = arrayListA0P.iterator();
        while (it.hasNext()) {
            C60R.A1O(arrayListA0h, it);
        }
        if (!arrayListA0h.isEmpty()) {
            this._removedMessageSeqs.AhV(arrayListA0h);
        }
        if (arrayListA0P2.isEmpty()) {
            return;
        }
        this._tombstonedMessages.AhV(arrayListA0P2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeProvisionalUserMessages(Set<String> set) {
        HatchConversationState value;
        HatchConversationState hatchConversationState;
        ArrayList arrayList;
        String str;
        this.createdProvisionalTurnIds.clear();
        BLG<HatchConversationState> blg = this._conversationState;
        do {
            value = blg.getValue();
            hatchConversationState = value;
            List<HatchMessage> list = hatchConversationState.messages;
            arrayList = new ArrayList();
            for (HatchMessage hatchMessage : list) {
                HatchMessage hatchMessage2 = hatchMessage;
                if (hatchMessage2.role == HatchMessageRole.USER && hatchMessage2.seq == null && hatchMessage2.requestId == null) {
                    String str2 = hatchMessage2.id;
                    C7384Etj.A0Y(str2, 0);
                    if (str2.startsWith(HatchConversationRepositoryKt.PROVISIONAL_USER_MESSAGE_PREFIX) || set.contains(hatchMessage2.id) || AbstractC0878AGe.A0k(set, hatchMessage2.serverMessageId)) {
                    }
                }
                arrayList.add(hatchMessage);
            }
            str = hatchConversationState.streamingUserMessageId;
            if (str == null || str.startsWith(HatchConversationRepositoryKt.PROVISIONAL_USER_MESSAGE_PREFIX) || set.contains(str)) {
                str = null;
            }
        } while (!blg.A6e(value, HatchConversationState.copy$default(hatchConversationState, null, arrayList, null, null, str, null, false, null, false, null, null, null, null, false, null, 32749, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestHistoryRecovery() {
        if (this.sessionId == null || !this.loadHistoryOnConnect) {
            return;
        }
        this.historyRecoveryRequests.AhZ(Unit.INSTANCE);
    }

    private final void requestHistoryRecoveryWhenStreamSettles(Set<String> set) {
        synchronized (this.streamIdsAwaitingSettle) {
            AbstractC0882AGj.A0r(set, this.streamIdsAwaitingSettle);
            HoC hoC = this.settledStreamRecoveryJob;
            if (hoC == null || !hoC.isActive()) {
                this.settledStreamRecoveryJob = AnonymousClass001.A11(new HatchConversationRepository$requestHistoryRecoveryWhenStreamSettles$1$1(this, null), this.scope);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requeuePendingMessage(HatchMessage hatchMessage) {
        String str = hatchMessage.requestId;
        if (str != null) {
            synchronized (this.pendingMessagesLock) {
                if (str.equals(this.pendingMessageInFlightRequestId)) {
                    this.pendingMessageInFlightRequestId = null;
                }
                List<PendingMessage> list = this.pendingMessages;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<PendingMessage> it = list.iterator();
                    while (it.hasNext()) {
                        if (str.equals(it.next().requestId)) {
                            break;
                        }
                    }
                }
                this.pendingMessages.add(0, toPendingMessage(hatchMessage, str));
            }
        }
    }

    private final String resolveReplyPreviewImagePath(HatchMessage hatchMessage) {
        HatchAttachment next;
        ImageOptionsWidgetData imageOptionsWidgetData;
        Collection collection = hatchMessage.widgets;
        if (collection == null) {
            collection = C0881AGi.A00;
        }
        List list = hatchMessage.attachments;
        if (list == null) {
            list = C0881AGi.A00;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            HatchWidget hatchWidget = ((HatchAttachment) it.next()).widget;
            if (hatchWidget != null) {
                arrayListA0h.add(hatchWidget);
            }
        }
        ArrayList arrayListA0P = AbstractC0878AGe.A0P(arrayListA0h, collection);
        List list2 = hatchMessage.presentations;
        if (list2 == null) {
            list2 = C0881AGi.A00;
        }
        ArrayList arrayListA0h2 = C3cG.A0h();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            HatchWidget widget = ((HatchWidgetPresentation) it2.next()).getWidget();
            if (widget != null) {
                arrayListA0h2.add(widget);
            }
        }
        ArrayList arrayListA0P2 = AbstractC0878AGe.A0P(arrayListA0h2, arrayListA0P);
        HashSet hashSetA13 = C60O.A13();
        ArrayList arrayListA0h3 = C3cG.A0h();
        Iterator it3 = arrayListA0P2.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            AnonymousClass006.A1P(((HatchWidget) next2).widgetId, next2, hashSetA13, arrayListA0h3);
        }
        Iterator it4 = arrayListA0h3.iterator();
        while (it4.hasNext()) {
            HatchWidget hatchWidget2 = (HatchWidget) it4.next();
            if (HatchWidgetPresentationKt.HATCH_WIDGET_KIND_IMAGE_OPTIONS.equals(hatchWidget2.kind)) {
                HatchWidgetData hatchWidgetData = hatchWidget2.data;
                if ((hatchWidgetData instanceof ImageOptionsWidgetData) && (imageOptionsWidgetData = (ImageOptionsWidgetData) hatchWidgetData) != null) {
                    String strImageOptionsSelectedPath = HatchWidgetPresentationKt.imageOptionsSelectedPath(hatchWidget2.state, imageOptionsWidgetData.images);
                    if (strImageOptionsSelectedPath != null) {
                        return strImageOptionsSelectedPath;
                    }
                    Number number = (Number) AbstractC0878AGe.A0G(HatchWidgetPresentationKt.imageOptionsSelectedIndices(hatchWidget2.state, imageOptionsWidgetData.images.size()));
                    if (number != null) {
                        return C60Q.A0n(imageOptionsWidgetData.images, number.intValue());
                    }
                }
            }
        }
        String strExtractImageReference = HatchStringUtils.INSTANCE.extractImageReference(hatchMessage.content);
        if (strExtractImageReference != null) {
            return strExtractImageReference;
        }
        List<HatchAttachment> list3 = hatchMessage.attachments;
        if (list3 != null) {
            Iterator<HatchAttachment> it5 = list3.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    next = null;
                    break;
                }
                next = it5.next();
                if (next.isImage()) {
                    break;
                }
            }
            HatchAttachment hatchAttachment = next;
            if (hatchAttachment != null) {
                String str = hatchAttachment.uploadedPath;
                return str == null ? hatchAttachment.uri : str;
            }
        }
        return null;
    }

    private final String sanitizeReplyPreview(String str) {
        return BQG.A17(AnonymousClass002.A0l(this.replyPreviewStripRegex.A03(AbstractC2159Azp.A0z(str, PairsDiscretionDocument.TERMINATOR, InviteCodeScratcherKt.CODE_SEPARATOR), "")), 100);
    }

    private final void scheduleTranscriptFlush(String str) {
        HoC hoC;
        synchronized (this.transcriptFlushLock) {
            if (str != null) {
                this.pendingTranscriptTurnId = str;
                hoC = this.transcriptFlushJob;
                if (hoC != null || !hoC.isActive()) {
                    long j = this.transcriptFlushGeneration + 1;
                    this.transcriptFlushGeneration = j;
                    this.transcriptFlushJob = AnonymousClass001.A11(new HatchConversationRepository$scheduleTranscriptFlush$1$1(this, j, null), this.scope);
                }
            } else {
                hoC = this.transcriptFlushJob;
                if (hoC != null) {
                }
                long j2 = this.transcriptFlushGeneration + 1;
                this.transcriptFlushGeneration = j2;
                this.transcriptFlushJob = AnonymousClass001.A11(new HatchConversationRepository$scheduleTranscriptFlush$1$1(this, j2, null), this.scope);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object seedReplayCursorFromCache(java.lang.String r6, X.HtJ<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.facebook.aura.conversation.repo.HatchConversationRepository.C113711
            if (r0 == 0) goto L1e
            r4 = r7
            com.facebook.aura.conversation.repo.HatchConversationRepository$seedReplayCursorFromCache$1 r4 = (com.facebook.aura.conversation.repo.HatchConversationRepository.C113711) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L29
            if (r0 != r2) goto L24
            goto L46
        L1e:
            com.facebook.aura.conversation.repo.HatchConversationRepository$seedReplayCursorFromCache$1 r4 = new com.facebook.aura.conversation.repo.HatchConversationRepository$seedReplayCursorFromCache$1
            r4.<init>(r7)
            goto L12
        L24:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L29:
            X.Hwg.A00(r1)
            java.lang.Long r0 = r5.lastSeq
            if (r0 != 0) goto L80
            com.facebook.aura.conversation.offline.HatchOfflineConversationRepository$Companion r1 = com.facebook.aura.conversation.offline.HatchOfflineConversationRepository.Companion     // Catch: java.util.concurrent.CancellationException -> L76 java.lang.Exception -> L78
            X.CGz r0 = r5.userSession     // Catch: java.util.concurrent.CancellationException -> L76 java.lang.Exception -> L78
            com.facebook.aura.conversation.offline.HatchOfflineConversationRepository r1 = r1.getInstance(r0)     // Catch: java.util.concurrent.CancellationException -> L76 java.lang.Exception -> L78
            r0 = 0
            r4.L$0 = r0     // Catch: java.util.concurrent.CancellationException -> L76 java.lang.Exception -> L78
            r4.label = r2     // Catch: java.util.concurrent.CancellationException -> L76 java.lang.Exception -> L78
            r0 = 20
            java.lang.Object r1 = r1.loadLatestMessages(r6, r0, r4)     // Catch: java.util.concurrent.CancellationException -> L76 java.lang.Exception -> L78
            if (r1 != r3) goto L49
            return r3
        L46:
            X.Hwg.A00(r1)     // Catch: java.util.concurrent.CancellationException -> L76 java.lang.Exception -> L78
        L49:
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.util.concurrent.CancellationException -> L76 java.lang.Exception -> L78
            java.util.ArrayList r2 = X.C3cG.A0h()     // Catch: java.util.concurrent.CancellationException -> L76 java.lang.Exception -> L78
            java.util.Iterator r1 = r1.iterator()     // Catch: java.util.concurrent.CancellationException -> L76 java.lang.Exception -> L78
        L53:
            boolean r0 = r1.hasNext()     // Catch: java.util.concurrent.CancellationException -> L76 java.lang.Exception -> L78
            if (r0 == 0) goto L5d
            X.C60R.A1O(r2, r1)     // Catch: java.util.concurrent.CancellationException -> L76 java.lang.Exception -> L78
            goto L53
        L5d:
            java.lang.Comparable r0 = X.AbstractC0878AGe.A07(r2)     // Catch: java.util.concurrent.CancellationException -> L76 java.lang.Exception -> L78
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.util.concurrent.CancellationException -> L76 java.lang.Exception -> L78
            if (r0 == 0) goto L73
            long r2 = r0.longValue()     // Catch: java.util.concurrent.CancellationException -> L76 java.lang.Exception -> L78
            com.facebook.aura.gateway.HatchGatewayConnection r1 = r5.gateway     // Catch: java.util.concurrent.CancellationException -> L76 java.lang.Exception -> L78
            java.lang.String r0 = r5.wireSessionId()     // Catch: java.util.concurrent.CancellationException -> L76 java.lang.Exception -> L78
            r1.setAfterChatEventSeq(r0, r2)     // Catch: java.util.concurrent.CancellationException -> L76 java.lang.Exception -> L78
            goto L80
        L73:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.util.concurrent.CancellationException -> L76 java.lang.Exception -> L78
            return r3
        L76:
            r0 = move-exception
            throw r0
        L78:
            r2 = move-exception
            java.lang.String r1 = "seedReplayCursorFromCache failed"
            java.lang.String r0 = "HatchConversationRepository"
            X.CFK.A08(r0, r1, r2)
        L80:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchConversationRepository.seedReplayCursorFromCache(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void sendMessageInternal(java.lang.String r58, java.util.List<com.facebook.aura.model.HatchAttachment> r59, com.facebook.aura.model.ReplyAttribution r60, java.util.Map<java.lang.String, java.lang.String> r61, java.lang.String r62, java.util.Map<java.lang.String, ? extends java.lang.Object> r63, java.lang.String r64, boolean r65, java.lang.String r66, java.lang.String r67) {
        /*
            Method dump skipped, instructions count: 880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchConversationRepository.sendMessageInternal(java.lang.String, java.util.List, com.facebook.aura.model.ReplyAttribution, java.util.Map, java.lang.String, java.util.Map, java.lang.String, boolean, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void sendMessageInternal$default(HatchConversationRepository hatchConversationRepository, String str, List list, ReplyAttribution replyAttribution, Map map, String str2, Map map2, String str3, boolean z, String str4, String str5, int i, Object obj) {
        if ((i & 4) != 0) {
            replyAttribution = null;
        }
        if ((i & 8) != 0) {
            map = null;
        }
        if ((i & 32) != 0) {
            map2 = null;
        }
        if ((i & 64) != 0) {
            str3 = null;
        }
        if ((i & 128) != 0) {
            z = false;
        }
        if ((i & 256) != 0) {
            str4 = null;
        }
        if ((i & 512) != 0) {
            str5 = null;
        }
        hatchConversationRepository.sendMessageInternal(str, list, replyAttribution, map, str2, map2, str3, z, str4, str5);
    }

    private final void settleStaleSendingHistory(long j) {
        HatchConversationState value;
        HatchConversationState hatchConversationStateCopy$default;
        BLG<HatchConversationState> blg = this._conversationState;
        do {
            value = blg.getValue();
            hatchConversationStateCopy$default = value;
            List<HatchMessage> list = hatchConversationStateCopy$default.history;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<HatchMessage> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (settleStaleSendingHistory$isStaleSending(C60Q.A0K(it), j)) {
                        List<HatchMessage> list2 = hatchConversationStateCopy$default.history;
                        ArrayList arrayListA0i = AnonymousClass003.A0i(list2);
                        for (HatchMessage hatchMessageCopy$default : list2) {
                            if (settleStaleSendingHistory$isStaleSending(hatchMessageCopy$default, j)) {
                                hatchMessageCopy$default = (hatchMessageCopy$default.seq == null && hatchMessageCopy$default.serverMessageId == null) ? HatchMessage.copy$default(hatchMessageCopy$default, null, null, null, 0L, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, HatchMessageSendStatus.FAILED, null, null, HatchSendErrorCategory.TRANSPORT, null, null, null, false, null, null, false, null, -37748737, 3, null) : HatchMessage.copy$default(hatchMessageCopy$default, null, null, null, 0L, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, HatchMessageSendStatus.SENT, null, null, null, null, null, null, false, null, null, false, null, -54525953, 3, null);
                            }
                            arrayListA0i.add(hatchMessageCopy$default);
                        }
                        hatchConversationStateCopy$default = HatchConversationState.copy$default(hatchConversationStateCopy$default, arrayListA0i, null, null, null, null, null, false, null, false, null, null, null, null, false, null, 32766, null);
                    }
                }
            }
        } while (!blg.A6e(value, hatchConversationStateCopy$default));
    }

    public static final boolean settleStaleSendingHistory$isStaleSending(HatchMessage hatchMessage, long j) {
        return hatchMessage.sendStatus == HatchMessageSendStatus.SENDING && j - hatchMessage.timestamp > 300000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showProvisionalUserMessage(String str, String str2) {
        HatchConversationState value;
        HatchConversationState hatchConversationStateCopy$default;
        if (C7BY.A0j(str2)) {
            return;
        }
        String strA0M = FGI.A0M(HatchConversationRepositoryKt.PROVISIONAL_USER_MESSAGE_PREFIX, str);
        BLG<HatchConversationState> blg = this._conversationState;
        do {
            value = blg.getValue();
            hatchConversationStateCopy$default = value;
            Iterator itA14 = C60O.A14(hatchConversationStateCopy$default);
            int i = 0;
            while (true) {
                if (!itA14.hasNext()) {
                    break;
                }
                if (!strA0M.equals(C60Q.A0l(itA14))) {
                    i++;
                } else if (i >= 0) {
                    HatchMessage hatchMessage = hatchConversationStateCopy$default.messages.get(i);
                    if (hatchMessage.seq == null && hatchMessage.requestId == null && (!C7384Etj.areEqual(hatchMessage.content, str2) || !strA0M.equals(hatchConversationStateCopy$default.streamingUserMessageId))) {
                        ArrayList arrayListA0R = AbstractC0878AGe.A0R(hatchConversationStateCopy$default.messages);
                        arrayListA0R.set(i, HatchMessage.copy$default(hatchMessage, null, null, str2, 0L, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, -5, 3, null));
                        hatchConversationStateCopy$default = HatchConversationState.copy$default(hatchConversationStateCopy$default, null, arrayListA0R, null, null, strA0M, null, false, null, false, null, null, null, null, false, null, 32749, null);
                    }
                }
            }
            if (!this.createdProvisionalTurnIds.contains(str)) {
                HatchMessageRole hatchMessageRole = HatchMessageRole.USER;
                HatchMessageSendStatus hatchMessageSendStatus = HatchMessageSendStatus.SENT;
                int i2 = HatchMessage.$stable;
                long jCurrentTimeMillis = System.currentTimeMillis();
                C0881AGi c0881AGi = C0881AGi.A00;
                hatchConversationStateCopy$default = HatchConversationState.copy$default(hatchConversationStateCopy$default, null, AbstractC0878AGe.A0Q(new HatchMessage(strA0M, hatchMessageRole, str2, jCurrentTimeMillis, null, null, null, null, null, c0881AGi, c0881AGi, null, null, null, false, null, null, false, null, null, null, null, hatchMessageSendStatus, HatchMessageUnsendStatus.NONE, null, null, null, null, null, false, null, null, false, null), hatchConversationStateCopy$default.messages), null, null, strA0M, null, false, null, false, null, null, null, null, false, null, 32749, null);
            }
        } while (!blg.A6e(value, hatchConversationStateCopy$default));
        List<HatchMessage> list = hatchConversationStateCopy$default.messages;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator<HatchMessage> it = list.iterator();
        while (it.hasNext()) {
            if (strA0M.equals(C60Q.A0l(it))) {
                this.createdProvisionalTurnIds.add(str);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void startStreamingUserMessage(java.lang.String r45, java.lang.Long r46) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchConversationRepository.startStreamingUserMessage(java.lang.String, java.lang.Long):void");
    }

    private final PendingMessage toPendingMessage(HatchMessage hatchMessage, String str) {
        return new PendingMessage(hatchMessage.content, hatchMessage.attachments, buildSendExtraParams(hatchMessage.extraParams), hatchMessage.routeToLiveSession, hatchMessage.liveSessionTargetThreadId, hatchMessage.getInReplyTo(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long transportRejectionRetryDelayMs(int i) {
        int i2 = i - 1;
        if (i2 > 4) {
            i2 = 4;
        }
        long j = 2000 << i2;
        if (j > 30000) {
            j = 30000;
        }
        long j2 = j / 2;
        return j2 + CUB.A01.A07(1 + j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02f4 A[PHI: r10 r18 r22
  0x02f4: PHI (r10v9 java.lang.String) = (r10v4 java.lang.String), (r10v1 java.lang.String) binds: [B:93:0x01cc, B:87:0x01bd] A[DONT_GENERATE, DONT_INLINE]
  0x02f4: PHI (r18v6 boolean) = (r18v3 boolean), (r18v1 boolean) binds: [B:93:0x01cc, B:87:0x01bd] A[DONT_GENERATE, DONT_INLINE]
  0x02f4: PHI (r22v6 java.lang.String) = (r22v3 java.lang.String), (r22v1 java.lang.String) binds: [B:93:0x01cc, B:87:0x01bd] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void tryFinalize(boolean r65) {
        /*
            Method dump skipped, instructions count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchConversationRepository.tryFinalize(boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.List<com.facebook.aura.model.HatchMessage>] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void updateMessageSendStatus(java.lang.String r28, com.facebook.aura.model.HatchMessageSendStatus r29, java.lang.String r30, com.facebook.aura.model.HatchSendErrorCategory r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchConversationRepository.updateMessageSendStatus(java.lang.String, com.facebook.aura.model.HatchMessageSendStatus, java.lang.String, com.facebook.aura.model.HatchSendErrorCategory, java.lang.String):void");
    }

    public static /* synthetic */ void updateMessageSendStatus$default(HatchConversationRepository hatchConversationRepository, String str, HatchMessageSendStatus hatchMessageSendStatus, String str2, HatchSendErrorCategory hatchSendErrorCategory, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            hatchSendErrorCategory = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        hatchConversationRepository.updateMessageSendStatus(str, hatchMessageSendStatus, str2, hatchSendErrorCategory, str3);
    }

    public static final HatchMessage updateMessageSendStatus$lambda$2$withStatus(HatchMessage hatchMessage, String str, String str2, HatchMessageSendStatus hatchMessageSendStatus, String str3, HatchSendErrorCategory hatchSendErrorCategory) {
        String str4 = str2;
        if (!C7384Etj.areEqual(str, hatchMessage.requestId)) {
            return hatchMessage;
        }
        if (str2 == null) {
            str4 = hatchMessage.serverMessageId;
        }
        return HatchMessage.copy$default(hatchMessage, null, null, null, 0L, null, null, null, null, str4, null, null, null, null, null, false, null, null, false, null, null, null, null, hatchMessageSendStatus, null, str3, hatchSendErrorCategory, null, null, null, false, null, null, false, null, -54526209, 3, null);
    }

    private final void updateUnsendStatus(String str, HatchMessageUnsendStatus hatchMessageUnsendStatus) {
        HatchConversationState value;
        HatchConversationState hatchConversationStateCopy$default;
        BLG<HatchConversationState> blg = this._conversationState;
        do {
            value = blg.getValue();
            hatchConversationStateCopy$default = value;
            List<HatchMessage> listWithUnsendStatus = withUnsendStatus(hatchConversationStateCopy$default.messages, str, hatchMessageUnsendStatus);
            List<HatchMessage> listWithUnsendStatus2 = withUnsendStatus(hatchConversationStateCopy$default.history, str, hatchMessageUnsendStatus);
            if (listWithUnsendStatus == null) {
                if (listWithUnsendStatus2 != null) {
                    listWithUnsendStatus = hatchConversationStateCopy$default.messages;
                }
            } else if (listWithUnsendStatus2 == null) {
                listWithUnsendStatus2 = hatchConversationStateCopy$default.history;
            }
            hatchConversationStateCopy$default = HatchConversationState.copy$default(hatchConversationStateCopy$default, listWithUnsendStatus2, listWithUnsendStatus, null, null, null, null, false, null, false, null, null, null, null, false, null, 32764, null);
        } while (!blg.A6e(value, hatchConversationStateCopy$default));
    }

    private final void warmLocationForSend() {
        AnonymousClass001.A1J(new C113771(null), this.scope);
    }

    private final String wireSessionId() {
        String str = this.sessionId;
        return str == null ? this.primarySessionRepository.primarySessionId.getValue() : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.Map<java.lang.String, java.lang.Object> withCurrentReplyTarget(java.util.Map<java.lang.String, ? extends java.lang.Object> r54, java.lang.String r55) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchConversationRepository.withCurrentReplyTarget(java.util.Map, java.lang.String):java.util.Map");
    }

    private final Map<String, Object> withLiveSessionRouting(Map<String, ? extends Object> map, boolean z, String str) {
        LiveSession liveSessionForSession;
        Map<String, Object> mapRouteOutgoing;
        return (!z || (liveSessionForSession = LiveSessions.INSTANCE.forSession(this.userSession)) == null || (mapRouteOutgoing = liveSessionForSession.routeOutgoing(map, str)) == null) ? map : mapRouteOutgoing;
    }

    private final Map<String, Object> withLocationUploadTimestamp(Map<String, ? extends Object> map) {
        return map.containsKey(GeofenceEventWorker.KEY_LATITUDE) ? AnonymousClass006.A11(HatchConversationRepositoryKt.LOCATION_UPLOAD_TIMESTAMP_MS_KEY, C60O.A0k(), map) : map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, Object> withMessageOrigin(Map<String, ? extends Object> map, HatchMessageOrigin hatchMessageOrigin) {
        Map mapA0E;
        if (hatchMessageOrigin == null) {
            return map;
        }
        if (map == null) {
            map = AGH.A0E();
        }
        C2nw c2nwA1K = C60O.A1K();
        C7qW.A06("kind", "options_widget", c2nwA1K);
        C7qW.A06("widget_id", hatchMessageOrigin.widgetId, c2nwA1K);
        C7qW.A06("message_id", hatchMessageOrigin.messageId, c2nwA1K);
        C7qW.A05(Integer.valueOf(hatchMessageOrigin.optionIndex), "option_index", c2nwA1K);
        JsonObject jsonObjectA01 = C7qW.A01("interaction_id", hatchMessageOrigin.interactionId, c2nwA1K);
        Object obj = map.get("metadata");
        if (!(obj instanceof JsonObject) || (mapA0E = (JsonObject) obj) == null) {
            mapA0E = AGH.A0E();
        }
        return AnonymousClass006.A11("metadata", new JsonObject(AnonymousClass006.A11("message_origin", jsonObjectA01, mapA0E)), map);
    }

    private final List<HatchMessage> withUnsendStatus(List<HatchMessage> list, String str, HatchMessageUnsendStatus hatchMessageUnsendStatus) {
        Iterator<HatchMessage> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            HatchMessage hatchMessageA0K = C60Q.A0K(it);
            if (C7384Etj.areEqual(hatchMessageA0K.id, str) || C7384Etj.areEqual(hatchMessageA0K.serverMessageId, str)) {
                if (i < 0) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.set(i, HatchMessage.copy$default((HatchMessage) arrayList.get(i), null, null, null, 0L, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, hatchMessageUnsendStatus, null, null, null, null, null, false, null, null, false, null, -8388609, 3, null));
                return arrayList;
            }
            i++;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object cancelGeneration(boolean r7, kotlin.jvm.functions.Function0<kotlin.Unit> r8, X.HtJ<? super kotlin.Unit> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.facebook.aura.conversation.repo.HatchConversationRepository.C113541
            if (r0 == 0) goto Lb1
            r5 = r9
            com.facebook.aura.conversation.repo.HatchConversationRepository$cancelGeneration$1 r5 = (com.facebook.aura.conversation.repo.HatchConversationRepository.C113541) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb1
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            java.lang.String r2 = "HatchConversationRepository"
            if (r0 == 0) goto L7f
            if (r0 != r3) goto Lb8
            java.lang.Object r8 = r5.L$0
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            X.Hwg.A00(r1)
        L26:
            kotlinx.serialization.json.JsonElement r1 = (kotlinx.serialization.json.JsonElement) r1
            if (r1 != 0) goto L3a
            java.lang.String r0 = "cancelGeneration: chat.cancel returned null (timeout / transport failure)"
            X.CFK.A06(r2, r0)
            com.facebook.aura.conversation.repo.CleanupReason r0 = com.facebook.aura.conversation.repo.CleanupReason.TRANSPORT_FAILURE
        L31:
            r6.cleanupStreamingState(r0)
            r8.invoke()
        L37:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L3a:
            com.facebook.aura.conversation.repo.CancelChatResult r0 = com.facebook.aura.conversation.repo.HatchConversationRepositoryJsonKt.parseCancelChatResponse(r1)
            boolean r5 = r0.cancelled
            java.lang.String r1 = r0.messageId
            r4 = 0
            if (r1 == 0) goto L5f
            r0 = 20
            java.lang.String r3 = X.BQG.A17(r1, r0)
        L4b:
            java.lang.String r0 = "cancelGeneration: cancelled="
            java.lang.StringBuilder r1 = X.C60O.A10(r0, r5)
            java.lang.String r0 = " messageId="
            java.lang.String r0 = X.C60P.A1M(r0, r3, r1)
            X.CFK.A05(r2, r0)
            if (r5 == 0) goto L61
            com.facebook.aura.conversation.repo.CleanupReason r0 = com.facebook.aura.conversation.repo.CleanupReason.USER_STOP
            goto L31
        L5f:
            r3 = r4
            goto L4b
        L61:
            com.facebook.aura.conversation.repo.HatchConversationState r0 = X.C60O.A04(r6)
            com.facebook.aura.conversation.repo.StreamingState r1 = r0.streamingState
            com.facebook.aura.conversation.repo.StreamingState r0 = com.facebook.aura.conversation.repo.StreamingState.Done
            if (r1 != r0) goto L6e
            com.facebook.aura.conversation.repo.CleanupReason r0 = com.facebook.aura.conversation.repo.CleanupReason.CANCEL_RACE
            goto L31
        L6e:
            com.facebook.aura.conversation.repo.HatchConversationState r0 = X.C60O.A04(r6)
            java.lang.String r2 = r0.streamingMessageId
            X.3UX r1 = r6.scope
            com.facebook.aura.conversation.repo.HatchConversationRepository$cancelGeneration$3 r0 = new com.facebook.aura.conversation.repo.HatchConversationRepository$cancelGeneration$3
            r0.<init>(r2, r8, r4)
            X.AnonymousClass001.A1J(r0, r1)
            goto L37
        L7f:
            X.Hwg.A00(r1)
            com.facebook.aura.gateway.service.NodeCommandService$Companion r1 = com.facebook.aura.gateway.service.NodeCommandService.Companion
            android.content.Context r0 = r6.appContext
            r1.cancelAll(r0)
            r6.failSendsAwaitingRetry()
            com.facebook.aura.conversation.repo.HatchConversationState r0 = X.C60O.A04(r6)
            com.facebook.aura.conversation.repo.StreamingState r1 = r0.streamingState
            com.facebook.aura.conversation.repo.StreamingState r0 = com.facebook.aura.conversation.repo.StreamingState.Done
            if (r1 != r0) goto La0
            if (r7 != 0) goto La0
            java.lang.String r0 = "cancelGeneration: no active turn (streamingState=Done, agent idle) \u2014 skipping chat.cancel"
            X.CFK.A05(r2, r0)
            com.facebook.aura.conversation.repo.CleanupReason r0 = com.facebook.aura.conversation.repo.CleanupReason.PRE_STREAM
            goto L31
        La0:
            com.facebook.aura.gateway.HatchGatewayConnection r1 = r6.gateway
            java.lang.String r0 = r6.sessionId
            r5.L$0 = r8
            r5.Z$0 = r7
            r5.label = r3
            java.lang.Object r1 = r1.cancelChat(r0, r5)
            if (r1 != r4) goto L26
            return r4
        Lb1:
            com.facebook.aura.conversation.repo.HatchConversationRepository$cancelGeneration$1 r5 = new com.facebook.aura.conversation.repo.HatchConversationRepository$cancelGeneration$1
            r5.<init>(r9)
            goto L12
        Lb8:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchConversationRepository.cancelGeneration(boolean, kotlin.jvm.functions.Function0, X.HtJ):java.lang.Object");
    }

    public final void clearChat() {
        Long value;
        HatchConversationState value2;
        HatchConversationState hatchConversationState;
        C0881AGi c0881AGi;
        synchronized (this.historyRecoveryLock) {
            BLG<Long> blg = this.historyRecoveryGeneration;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, Long.valueOf(value.longValue() + 1)));
        }
        LiveTranscript liveTranscript = this.liveTranscript;
        if (liveTranscript != null) {
            liveTranscript.onConversationCleared();
        }
        this.hasLoadedHistory = false;
        setGatewayConnectToken(null);
        this.lastSeq = null;
        this.processedEnvelopeSeqs.clear();
        this.didSendStreamRequest = false;
        synchronized (this.pendingMessagesLock) {
            this.pendingMessages.clear();
            this.pendingMessageInFlightRequestId = null;
        }
        Iterator itA1R = C60P.A1R(this.sendWatchdogs);
        while (itA1R.hasNext()) {
            HoC hoC = (HoC) itA1R.next();
            C7384Etj.A0X(hoC);
            hoC.A5w(null);
        }
        this.sendWatchdogs.clear();
        this.escalatedSendRequestIds.clear();
        this.transportRejectionRetries.clear();
        Iterator itA1R2 = C60P.A1R(this.transportRejectionRetryJobs);
        while (itA1R2.hasNext()) {
            HoC hoC2 = (HoC) itA1R2.next();
            C7384Etj.A0X(hoC2);
            hoC2.A5w(null);
        }
        this.transportRejectionRetryJobs.clear();
        this.resentRequestIds.clear();
        this.activeReplyToIds.clear();
        cancelPendingTranscriptFlush();
        this.accumulator.reset();
        this.navTtrcCoordinator.clearObservedQuery(HatchNavTTRCSpec.Surface.CHAT, HatchNavTTRCSpec.Queries.CHAT_DATA);
        BLG<HatchConversationState> blg2 = this._conversationState;
        do {
            value2 = blg2.getValue();
            hatchConversationState = value2;
            c0881AGi = C0881AGi.A00;
        } while (!blg2.A6e(value2, hatchConversationState.copy(c0881AGi, c0881AGi, StreamingState.Done, null, hatchConversationState.streamingUserMessageId, hatchConversationState.connectionState, hatchConversationState.serviceRestartPending, hatchConversationState.historyLoadingState, false, null, null, AGH.A0E(), hatchConversationState.avatarImageUrl, hatchConversationState.islandLoading, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void connectIfDisconnected(boolean r11) {
        /*
            r10 = this;
            com.facebook.aura.utils.HatchUtil r0 = com.facebook.aura.utils.HatchUtil.INSTANCE
            boolean r0 = r0.isAuraApp()
            if (r0 == 0) goto L58
            com.facebook.aura.gateway.HatchGatewayConnection r0 = r10.gateway
            X.1BN<com.facebook.aura.gateway.HatchGatewayConnectionState> r0 = r0.connectionState
            java.lang.Object r6 = r0.getValue()
            java.lang.Long r9 = r10.reconnectingSinceMs
            long r2 = android.os.SystemClock.elapsedRealtime()
            boolean r0 = r6 instanceof com.facebook.aura.gateway.HatchGatewayConnectionState.Reconnecting
            if (r0 == 0) goto L29
            if (r9 == 0) goto L29
            long r0 = r9.longValue()
            long r7 = r2 - r0
            r4 = 5000(0x1388, double:2.4703E-320)
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            r4 = 1
            if (r0 >= 0) goto L2a
        L29:
            r4 = 0
        L2a:
            java.lang.String r5 = X.C60O.A0n(r6)
            if (r9 == 0) goto L59
            long r0 = r9.longValue()
            long r2 = r2 - r0
        L35:
            java.lang.String r0 = "connectIfDisconnected: currentState="
            java.lang.StringBuilder r1 = X.C3cI.A0x(r0, r5)
            java.lang.String r0 = " reconnectingForMs="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " staleReconnecting="
            java.lang.String r1 = X.C60P.A1P(r0, r1, r4)
            java.lang.String r0 = "HatchConversationRepository"
            X.CFK.A05(r0, r1)
            boolean r0 = r6 instanceof com.facebook.aura.gateway.HatchGatewayConnectionState.Disconnected
            if (r0 != 0) goto L5c
            boolean r0 = r6 instanceof com.facebook.aura.gateway.HatchGatewayConnectionState.Error
            if (r0 != 0) goto L5c
            if (r4 != 0) goto L64
        L58:
            return
        L59:
            r2 = -1
            goto L35
        L5c:
            if (r4 != 0) goto L64
            java.lang.String r0 = "normal"
        L60:
            r10.launchFetchAndConnect(r0, r4, r11)
            return
        L64:
            java.lang.String r0 = "stale_reconnecting"
            goto L60
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchConversationRepository.connectIfDisconnected(boolean):void");
    }

    public final void dispose() {
        String str;
        if (this.subscribeToThread && (str = this.sessionId) != null) {
            this.gateway.unsubscribeFromSession(str);
        }
        LiveTranscript liveTranscript = this.liveTranscript;
        if (liveTranscript != null) {
            liveTranscript.onConversationCleared();
        }
        LiveTranscript liveTranscript2 = this.liveTranscript;
        if (liveTranscript2 != null) {
            liveTranscript2.onStreamReset();
        }
        Hxb.A03(null, this.scope);
        this.transportRejectionRetries.clear();
        this.transportRejectionRetryJobs.clear();
    }

    public final void expectServerResponse() {
        HatchConversationState value;
        BLG<HatchConversationState> blg = this._conversationState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, HatchConversationState.copy$default(value, null, null, StreamingState.PendingResponse, null, null, null, false, null, false, null, null, null, null, false, null, 32763, null)));
    }

    public final C22I<Unit> getAssistantMessageStarted() {
        return this.assistantMessageStarted;
    }

    public final C22I<Unit> getAttachmentsDropped() {
        return this.attachmentsDropped;
    }

    public final C1BN<HatchConversationState> getConversationState() {
        return this.conversationState;
    }

    public final C22I<String> getLiveComposerHint() {
        return this.liveComposerHint;
    }

    public final int getProcessedEnvelopeSeqCount$fbandroid_express_aura_java_com_facebook_aura_conversation_repo_repo() {
        return this.processedEnvelopeSeqs.size();
    }

    public final HatchConversationQplLogger getQplLogger() {
        return this.qplLogger;
    }

    public final C22I<HatchReactionLanding> getReactionLanded() {
        return this.reactionLanded;
    }

    public final C22I<List<Long>> getRemovedMessageSeqs() {
        return this.removedMessageSeqs;
    }

    public final C22I<HatchSendErrorCategory> getSendFailed() {
        return this.sendFailed;
    }

    public final C1BN<SubAgentActivityState> getSubAgentActivity() {
        return this.subAgentActivity;
    }

    public final C22I<List<HatchMessage>> getTombstonedMessages() {
        return this.tombstonedMessages;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f A[Catch: Exception -> 0x01c9, TryCatch #0 {Exception -> 0x01c9, blocks: (B:36:0x00db, B:37:0x00de, B:39:0x00e4, B:41:0x00f0, B:42:0x00f7, B:44:0x00fd, B:46:0x0100, B:47:0x010c, B:49:0x0112, B:50:0x0116, B:51:0x0129, B:52:0x014e, B:54:0x0154, B:55:0x015c, B:57:0x0172, B:58:0x0174, B:62:0x01aa, B:64:0x01ae, B:65:0x01bb, B:67:0x01c1, B:69:0x01c4, B:70:0x01c8, B:23:0x0083, B:24:0x0086, B:28:0x008f, B:29:0x009a, B:31:0x00a0, B:33:0x00a3, B:20:0x0070), top: B:77:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3 A[Catch: Exception -> 0x01c9, TryCatch #0 {Exception -> 0x01c9, blocks: (B:36:0x00db, B:37:0x00de, B:39:0x00e4, B:41:0x00f0, B:42:0x00f7, B:44:0x00fd, B:46:0x0100, B:47:0x010c, B:49:0x0112, B:50:0x0116, B:51:0x0129, B:52:0x014e, B:54:0x0154, B:55:0x015c, B:57:0x0172, B:58:0x0174, B:62:0x01aa, B:64:0x01ae, B:65:0x01bb, B:67:0x01c1, B:69:0x01c4, B:70:0x01c8, B:23:0x0083, B:24:0x0086, B:28:0x008f, B:29:0x009a, B:31:0x00a0, B:33:0x00a3, B:20:0x0070), top: B:77:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e4 A[Catch: Exception -> 0x01c9, TryCatch #0 {Exception -> 0x01c9, blocks: (B:36:0x00db, B:37:0x00de, B:39:0x00e4, B:41:0x00f0, B:42:0x00f7, B:44:0x00fd, B:46:0x0100, B:47:0x010c, B:49:0x0112, B:50:0x0116, B:51:0x0129, B:52:0x014e, B:54:0x0154, B:55:0x015c, B:57:0x0172, B:58:0x0174, B:62:0x01aa, B:64:0x01ae, B:65:0x01bb, B:67:0x01c1, B:69:0x01c4, B:70:0x01c8, B:23:0x0083, B:24:0x0086, B:28:0x008f, B:29:0x009a, B:31:0x00a0, B:33:0x00a3, B:20:0x0070), top: B:77:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01aa A[Catch: Exception -> 0x01c9, TryCatch #0 {Exception -> 0x01c9, blocks: (B:36:0x00db, B:37:0x00de, B:39:0x00e4, B:41:0x00f0, B:42:0x00f7, B:44:0x00fd, B:46:0x0100, B:47:0x010c, B:49:0x0112, B:50:0x0116, B:51:0x0129, B:52:0x014e, B:54:0x0154, B:55:0x015c, B:57:0x0172, B:58:0x0174, B:62:0x01aa, B:64:0x01ae, B:65:0x01bb, B:67:0x01c1, B:69:0x01c4, B:70:0x01c8, B:23:0x0083, B:24:0x0086, B:28:0x008f, B:29:0x009a, B:31:0x00a0, B:33:0x00a3, B:20:0x0070), top: B:77:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object jumpToMessage(java.lang.String r28, java.lang.Long r29, X.HtJ<? super kotlin.Unit> r30) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchConversationRepository.jumpToMessage(java.lang.String, java.lang.Long, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadMoreHistory(int r29, X.HtJ<? super kotlin.Unit> r30) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchConversationRepository.loadMoreHistory(int, X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.model.WidgetStateMutationHost
    public Object patchWidgetState(WidgetStateSource widgetStateSource, JsonObject jsonObject, G0U<? super JSONState, Boolean> g0u, HtJ<? super WidgetStateMutationResult> htJ) {
        return this.widgetStateSync.patchWidgetState(widgetStateSource, jsonObject, g0u, htJ);
    }

    @Override // com.facebook.aura.model.WidgetStateMutationHost
    public Object restoreWidgetState(String str, String str2, HtJ<? super WidgetStateSource> htJ) {
        return this.widgetStateSync.restoreWidgetState(str, str2, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object submitExternalUserMessage(com.facebook.aura.model.HatchMessage r47, X.G0U<? super X.HtJ<? super java.lang.Boolean>, ? extends java.lang.Object> r48, X.HtJ<? super java.lang.Boolean> r49) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchConversationRepository.submitExternalUserMessage(com.facebook.aura.model.HatchMessage, X.G0U, X.HtJ):java.lang.Object");
    }

    public final void syncUnreadMessageCount() {
        String str = this.sessionId;
        if (str == null) {
            str = "main";
        }
        C7380Etd c7380Etd = new C7380Etd(this.appContext);
        c7380Etd.A00.cancel(null, HatchChatNotificationIds.INSTANCE.chatNotificationId(str));
        ConversationNotificationState.Companion.getInstance(this.userSession).clear(str);
        AnonymousClass001.A1J(new C113751(null), this.scope);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00bc  */
    /* renamed from: unsendMessage-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m495unsendMessage0E7RQCE(java.lang.String r27, java.lang.String r28, X.HtJ<? super X.HsJ<kotlin.Unit>> r29) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchConversationRepository.m495unsendMessage0E7RQCE(java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object cancelGeneration$default(HatchConversationRepository hatchConversationRepository, boolean z, Function0 function0, HtJ htJ, int i, Object obj) {
        boolean zA1P = AnonymousClass001.A1P(i, z);
        if ((i & 2) != 0) {
            function0 = C113552.INSTANCE;
        }
        return hatchConversationRepository.cancelGeneration(zA1P, function0, htJ);
    }

    private final String clientOnlyCommandToken(String str) {
        String string = C7BY.A0H(str).toString();
        int length = string.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (C7LE.A01(string, i)) {
                string = string.substring(0, i);
                break;
            }
            i++;
        }
        if (string.equals("/side")) {
            return "/side";
        }
        if (string.equals("/fork")) {
            return "/fork";
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonObject feedUnitReplyToTarget(String str) {
        String strFeedUnitIdFromDiscussionHandle = HatchMessageKt.feedUnitIdFromDiscussionHandle(str);
        if (strFeedUnitIdFromDiscussionHandle == null) {
            return null;
        }
        C2nw c2nwA1K = C60O.A1K();
        C7qW.A06("type", ReplyAttributionSerializer.TYPE_FEED_UNIT, c2nwA1K);
        return C7qW.A01("unit_id", strFeedUnitIdFromDiscussionHandle, c2nwA1K);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonObject goalReplyToTarget(String str) {
        String strGoalIdFromDiscussionHandle = HatchMessageKt.goalIdFromDiscussionHandle(str);
        if (strGoalIdFromDiscussionHandle == null || !supportsReplyTargetType(ReplyAttributionSerializer.TYPE_GOAL)) {
            return null;
        }
        C2nw c2nwA1K = C60O.A1K();
        C7qW.A06("type", ReplyAttributionSerializer.TYPE_GOAL, c2nwA1K);
        return C7qW.A01(GoalUiCommandsKt.GOAL_ID_PARAM, strGoalIdFromDiscussionHandle, c2nwA1K);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleUserLiveTranscriptEvent(com.facebook.aura.model.HatchChatEvent r7) {
        /*
            r6 = this;
            boolean r0 = r7.isUserLiveTranscript()
            r5 = 0
            if (r0 == 0) goto L71
            boolean r0 = r7 instanceof com.facebook.aura.model.HatchChatEvent.MessageUser
            if (r0 != 0) goto L71
            boolean r0 = r7 instanceof com.facebook.aura.model.HatchChatEvent.MessageStart
            r4 = 1
            if (r0 == 0) goto L34
            com.facebook.aura.model.HatchChatEvent$MessageStart r7 = (com.facebook.aura.model.HatchChatEvent.MessageStart) r7
            com.facebook.aura.model.CanonicalEventEnvelope r0 = r7.envelope
            if (r0 == 0) goto L1a
            java.lang.String r3 = r0.messageId
            if (r3 != 0) goto L1c
        L1a:
            java.lang.String r3 = r7.messageId
        L1c:
            com.facebook.aura.livesession.api.LiveTranscript r2 = r6.liveTranscript
            if (r2 == 0) goto L31
            com.facebook.aura.model.HatchTranscriptMetadata r1 = r7.metadata
            if (r1 == 0) goto L32
            java.lang.Long r0 = r1.serverStartedAtMs
            if (r0 != 0) goto L2e
            long r0 = r1.startedAtMs
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L2e:
            r2.onServerTranscriptStart(r3, r0)
        L31:
            return r4
        L32:
            r0 = 0
            goto L2e
        L34:
            boolean r3 = r7 instanceof com.facebook.aura.model.HatchChatEvent.MessageDone
            if (r3 == 0) goto L48
            r1 = r7
            com.facebook.aura.model.HatchChatEvent$MessageDone r1 = (com.facebook.aura.model.HatchChatEvent.MessageDone) r1
            com.facebook.aura.model.CanonicalEventEnvelope r0 = r1.envelope
            if (r0 == 0) goto L43
            java.lang.String r2 = r0.messageId
            if (r2 != 0) goto L51
        L43:
            java.lang.String r2 = r1.messageId
        L45:
            if (r2 != 0) goto L51
            return r4
        L48:
            com.facebook.aura.model.CanonicalEventEnvelope r0 = r7.getEnvelope()
            if (r0 == 0) goto L31
            java.lang.String r2 = r0.messageId
            goto L45
        L51:
            boolean r0 = r7 instanceof com.facebook.aura.model.HatchChatEvent.DeltaText
            if (r0 == 0) goto L67
            com.facebook.aura.model.HatchChatEvent$DeltaText r7 = (com.facebook.aura.model.HatchChatEvent.DeltaText) r7
            java.lang.String r1 = r7.text
            int r0 = r1.length()
            if (r0 <= 0) goto L31
            com.facebook.aura.livesession.api.LiveTranscript r0 = r6.liveTranscript
            if (r0 == 0) goto L31
            r0.onServerTranscriptDelta(r2, r1)
            return r4
        L67:
            if (r3 == 0) goto L71
            com.facebook.aura.livesession.api.LiveTranscript r0 = r6.liveTranscript
            if (r0 == 0) goto L31
            r0.onServerTranscriptDone(r2)
            return r4
        L71:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchConversationRepository.handleUserLiveTranscriptEvent(com.facebook.aura.model.HatchChatEvent):boolean");
    }

    private final int indexOfFailedSendEcho(List<HatchMessage> list, List<HatchMessage> list2, HatchMessage hatchMessage, long j) {
        String strDedupeContentKey = dedupeContentKey(hatchMessage);
        if (strDedupeContentKey != null) {
            Iterator<HatchMessage> it = list2.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                HatchMessage hatchMessageA0K = C60Q.A0K(it);
                if (hatchMessageA0K.role != HatchMessageRole.USER || hatchMessageA0K.seq != null || hatchMessageA0K.sendStatus != HatchMessageSendStatus.FAILED || !strDedupeContentKey.equals(dedupeContentKey(hatchMessageA0K))) {
                    i++;
                } else if (i >= 0) {
                    ArrayList arrayListA0P = AbstractC0878AGe.A0P(list2.subList(0, i), list);
                    if (!(arrayListA0P instanceof Collection) || !arrayListA0P.isEmpty()) {
                        Iterator it2 = arrayListA0P.iterator();
                        while (it2.hasNext()) {
                            Long l = C60Q.A0K(it2).seq;
                            if ((l != null ? l.longValue() : Long.MIN_VALUE) < j) {
                            }
                        }
                    }
                    return i;
                }
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean isStaleSend(com.facebook.aura.model.HatchMessage r11, long r12) {
        /*
            r10 = this;
            com.facebook.aura.conversation.repo.HatchConversationState r0 = X.C60O.A04(r10)
            com.facebook.aura.gateway.HatchGatewayConnectionState r0 = r0.connectionState
            boolean r5 = com.facebook.aura.gateway.HatchGatewayConnectionStateKt.isOffline(r0)
            long r6 = r10.networkRestoredAtMs
            r2 = r11
            java.lang.String r1 = r11.requestId
            if (r1 == 0) goto L1b
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.HoC> r0 = r10.sendWatchdogs
            boolean r1 = r0.containsKey(r1)
            r0 = 1
            r8 = 1
            if (r1 == r0) goto L1c
        L1b:
            r8 = 0
        L1c:
            com.facebook.aura.conversation.repo.HatchConversationRepository$isStaleSend$2 r9 = new com.facebook.aura.conversation.repo.HatchConversationRepository$isStaleSend$2
            r9.<init>()
            r3 = r12
            boolean r0 = com.facebook.aura.conversation.repo.HatchConversationRepositoryKt.isStaleSend(r2, r3, r5, r6, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchConversationRepository.isStaleSend(com.facebook.aura.model.HatchMessage, long):boolean");
    }

    private final boolean looksLikeSamePartial(String str, String str2) {
        int length = str.length();
        if (length == 0) {
            return false;
        }
        String strA17 = BQG.A17(str, 64);
        if (str2.length() < length) {
            return false;
        }
        C7384Etj.A0Y(strA17, 1);
        return str2.startsWith(strA17);
    }

    public static final List<HatchMessage> markProposalBuilding$promote(HatchConversationRepository hatchConversationRepository, String str, List<HatchMessage> list) {
        ArrayList arrayListA0m = AnonymousClass002.A0m(list);
        for (HatchMessage hatchMessageA0N : list) {
            List<HatchWidgetPresentation> list2 = hatchMessageA0N.presentations;
            if (list2 != null) {
                ArrayList arrayListA0m2 = AnonymousClass002.A0m(list2);
                Iterator<HatchWidgetPresentation> it = list2.iterator();
                while (it.hasNext()) {
                    arrayListA0m2.add(hatchConversationRepository.promoteIfMatch(it.next(), str));
                }
                hatchMessageA0N = C60R.A0N(hatchMessageA0N, arrayListA0m2);
            }
            arrayListA0m.add(hatchMessageA0N);
        }
        return arrayListA0m;
    }

    private final boolean overlapsLoadedHistory(List<HatchMessage> list, List<HatchMessage> list2) {
        C07739il c07739ilSeqRange = seqRange(list);
        if (c07739ilSeqRange == null) {
            return false;
        }
        long j = c07739ilSeqRange.A00;
        C07739il c07739ilSeqRange2 = seqRange(list2);
        return c07739ilSeqRange2 != null && j <= c07739ilSeqRange2.A01;
    }

    private final List<HatchMessage> reconcileMessagesAgainstHistory(List<HatchMessage> list, List<HatchMessage> list2, C07739il c07739il, Set<String> set) {
        HatchMessage hatchMessageAdoptHistorySeqForLocalImage;
        LinkedHashMap linkedHashMapA15 = C60O.A15(AnonymousClass005.A0C(list2));
        for (HatchMessage hatchMessage : list2) {
            linkedHashMapA15.put(hatchMessage.id, hatchMessage);
        }
        Set<String> setKeySet = linkedHashMapA15.keySet();
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<HatchMessage> it = list2.iterator();
        while (it.hasNext()) {
            Long l = it.next().seq;
            if (l != null) {
                arrayListA0h.add(l);
            }
        }
        Set<Long> setA0g = AbstractC0878AGe.A0g(arrayListA0h);
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (HatchMessage hatchMessage2 : list2) {
            if (hatchMessage2.role == HatchMessageRole.USER) {
                arrayListA0h2.add(hatchMessage2);
            }
        }
        ArrayList arrayListA0h3 = C3cG.A0h();
        Iterator it2 = arrayListA0h2.iterator();
        while (it2.hasNext()) {
            String strDedupeContentKey = dedupeContentKey((HatchMessage) it2.next());
            if (strDedupeContentKey != null) {
                arrayListA0h3.add(strDedupeContentKey);
            }
        }
        Set<String> setA0g2 = AbstractC0878AGe.A0g(arrayListA0h3);
        ArrayList<HatchMessage> arrayListA0h4 = C3cG.A0h();
        for (HatchMessage hatchMessage3 : list2) {
            HatchMessage hatchMessage4 = hatchMessage3;
            if (hatchMessage4.role == HatchMessageRole.USER && hatchMessage4.seq != null) {
                arrayListA0h4.add(hatchMessage3);
            }
        }
        ArrayList arrayListA0h5 = C3cG.A0h();
        for (HatchMessage hatchMessage5 : arrayListA0h4) {
            String strDedupeContentKey2 = dedupeContentKey(hatchMessage5);
            if (strDedupeContentKey2 != null) {
                arrayListA0h5.add(new HxE(strDedupeContentKey2, hatchMessage5));
            }
        }
        Map<String, HatchMessage> mapA06 = AGH.A06(arrayListA0h5);
        ArrayList arrayListA0h6 = C3cG.A0h();
        for (HatchMessage hatchMessage6 : list) {
            if (shouldKeepLocalMessage(hatchMessage6, setKeySet, setA0g, setA0g2, c07739il, set) && (hatchMessageAdoptHistorySeqForLocalImage = adoptHistorySeqForLocalImage(hatchMessage6, linkedHashMapA15, mapA06)) != null) {
                arrayListA0h6.add(hatchMessageAdoptHistorySeqForLocalImage);
            }
        }
        return arrayListA0h6;
    }

    private final List<HatchMessage> resolveReplyPreviews(List<HatchMessage> list) {
        HatchMessage hatchMessage;
        LinkedHashMap linkedHashMapA15 = C60O.A15(AnonymousClass005.A0C(list));
        for (HatchMessage hatchMessage2 : list) {
            linkedHashMapA15.put(hatchMessage2.id, hatchMessage2);
        }
        ArrayList arrayListA0m = AnonymousClass002.A0m(list);
        for (HatchMessage hatchMessageCopy$default : list) {
            ReplyAttribution replyAttribution = hatchMessageCopy$default.replyAttribution;
            if (replyAttribution instanceof ReplyAttribution.Message) {
                ReplyAttribution.Message message = (ReplyAttribution.Message) replyAttribution;
                if (message.preview == null && message.previewImagePath == null && (hatchMessage = (HatchMessage) linkedHashMapA15.get(message.messageId)) != null) {
                    hatchMessageCopy$default = HatchMessage.copy$default(hatchMessageCopy$default, null, null, null, 0L, null, null, null, null, null, null, null, null, null, null, false, null, message.copy(message.messageId, sanitizeReplyPreview(hatchMessage.content), resolveReplyPreviewImagePath(hatchMessage)), false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, -65537, 3, null);
                }
            }
            arrayListA0m.add(hatchMessageCopy$default);
        }
        return arrayListA0m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scanStaleSendingMessages() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        settleStaleSendingHistory(jCurrentTimeMillis);
        List<HatchMessage> list = C60O.A04(this).messages;
        ArrayList arrayListA0h = C3cG.A0h();
        for (HatchMessage hatchMessage : list) {
            if (isStaleSend(hatchMessage, jCurrentTimeMillis)) {
                arrayListA0h.add(hatchMessage);
            }
        }
        if (arrayListA0h.isEmpty()) {
            return;
        }
        Iterator it = arrayListA0h.iterator();
        while (it.hasNext()) {
            String str = C60Q.A0K(it).requestId;
            if (str == null) {
                throw C60O.A0i("Required value was null.");
            }
            updateMessageSendStatus(str, HatchMessageSendStatus.FAILED, null, HatchSendErrorCategory.TRANSPORT, null);
        }
        ArrayList arrayListA0h2 = C3cG.A0h();
        Iterator it2 = arrayListA0h.iterator();
        while (it2.hasNext()) {
            String str2 = C60Q.A0K(it2).requestId;
            if (str2 != null) {
                arrayListA0h2.add(str2);
            }
        }
        Set setA0g = AbstractC0878AGe.A0g(arrayListA0h2);
        synchronized (this.pendingMessagesLock) {
            AbstractC0882AGj.A0v(this.pendingMessages, new HatchConversationRepository$scanStaleSendingMessages$1$1(setA0g));
        }
        C60O.A1O("Staleness scan: marked ", arrayListA0h.size(), " message(s) as stale", "HatchConversationRepository");
        while (!C60R.A1Z(this._conversationState)) {
        }
        if ((setA0g instanceof Collection) && setA0g.isEmpty()) {
            return;
        }
        Iterator it3 = setA0g.iterator();
        while (it3.hasNext()) {
            if (completePendingMessage(AnonymousClass005.A0j(it3))) {
                flushPendingMessages();
                return;
            }
        }
    }

    private final void scheduleOrFlushTranscript(String str) {
        if (C60O.A04(this).streamingMessageId == null) {
            flushTranscriptNow(str);
        } else {
            scheduleTranscriptFlush(str);
        }
    }

    private final C07739il seqRange(List<HatchMessage> list) {
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<HatchMessage> it = list.iterator();
        while (it.hasNext()) {
            Long l = it.next().seq;
            if (l != null) {
                arrayListA0h.add(l);
            }
        }
        Number number = (Number) AbstractC0878AGe.A09(arrayListA0h);
        Number number2 = (Number) AbstractC0878AGe.A07(arrayListA0h);
        if (number == null || number2 == null) {
            return null;
        }
        return new C07739il(number.longValue(), number2.longValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean shouldKeepLocalMessage(com.facebook.aura.model.HatchMessage r10, java.util.Set<java.lang.String> r11, java.util.Set<java.lang.Long> r12, java.util.Set<java.lang.String> r13, X.C07739il r14, java.util.Set<java.lang.String> r15) {
        /*
            r9 = this;
            boolean r0 = r9.hasDisplayedLocalImage(r10)
            r4 = 1
            if (r0 != 0) goto L6c
            boolean r8 = com.facebook.aura.conversation.repo.HatchConversationRepositoryKt.hasIdIn(r10, r15)
            r7 = 0
            if (r8 != 0) goto L15
            boolean r0 = com.facebook.aura.conversation.repo.HatchConversationRepositoryKt.hasIdIn(r10, r11)
            if (r0 == 0) goto L15
            return r7
        L15:
            com.facebook.aura.model.HatchMessageRole r0 = r10.role
            com.facebook.aura.model.HatchMessageRole r1 = com.facebook.aura.model.HatchMessageRole.USER
            if (r0 != r1) goto L26
            java.lang.Long r0 = r10.seq
            if (r0 == 0) goto L26
            boolean r0 = X.AbstractC0878AGe.A0k(r12, r0)
            if (r0 == 0) goto L26
            return r7
        L26:
            com.facebook.aura.model.HatchMessageRole r0 = r10.role
            if (r0 != r1) goto L3f
            java.lang.Long r0 = r10.seq
            if (r0 != 0) goto L3f
            java.lang.String r0 = r10.requestId
            if (r0 != 0) goto L3f
            java.lang.String r0 = r9.dedupeContentKey(r10)
            if (r0 == 0) goto L3f
            boolean r0 = r13.contains(r0)
            if (r0 != r4) goto L3f
            return r7
        L3f:
            java.lang.Long r0 = r10.seq
            if (r0 == 0) goto L6c
            long r5 = r0.longValue()
            if (r14 == 0) goto L6a
            long r1 = r14.A00
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 > 0) goto L56
            long r2 = r14.A01
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r0 = 1
            if (r1 <= 0) goto L57
        L56:
            r0 = 0
        L57:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L5b:
            boolean r0 = X.AnonymousClass002.A1b(r0, r4)
            if (r0 == 0) goto L6c
            com.facebook.aura.model.HatchMessageSendStatus r1 = r10.sendStatus
            com.facebook.aura.model.HatchMessageSendStatus r0 = com.facebook.aura.model.HatchMessageSendStatus.SENT
            if (r1 != r0) goto L6c
            if (r8 != 0) goto L6c
            return r7
        L6a:
            r0 = 0
            goto L5b
        L6c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchConversationRepository.shouldKeepLocalMessage(com.facebook.aura.model.HatchMessage, java.util.Set, java.util.Set, java.util.Set, X.9il, java.util.Set):boolean");
    }

    private final List<HatchMessage> stripPresentationElsewhere(List<HatchMessage> list, String str, String str2) {
        List<HatchWidgetPresentation> list2;
        ArrayList arrayListA0h = C3cG.A0h();
        for (HatchMessage hatchMessageA0N : list) {
            if (!C7384Etj.areEqual(hatchMessageA0N.id, str2) && (list2 = hatchMessageA0N.presentations) != null && !list2.isEmpty() && (!(list2 instanceof Collection) || !list2.isEmpty())) {
                Iterator<HatchWidgetPresentation> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (C7384Etj.areEqual(it.next().presentationId, str)) {
                        ArrayList arrayListA0h2 = C3cG.A0h();
                        for (HatchWidgetPresentation hatchWidgetPresentation : list2) {
                            AnonymousClass006.A1O(hatchWidgetPresentation.presentationId, str, hatchWidgetPresentation, arrayListA0h2);
                        }
                        if (!arrayListA0h2.isEmpty() || hatchMessageA0N.content.length() != 0 || hatchMessageA0N.transcript != null) {
                            hatchMessageA0N = C60R.A0N(hatchMessageA0N, arrayListA0h2.isEmpty() ? null : arrayListA0h2);
                            if (hatchMessageA0N != null) {
                            }
                        }
                    }
                }
            }
            arrayListA0h.add(hatchMessageA0N);
        }
        return arrayListA0h;
    }

    public static final void toggleReaction$rollbackOptimistic(HatchConversationRepository hatchConversationRepository, String str, List<String> list, List<String> list2) {
        List<String> list3 = C60O.A04(hatchConversationRepository).reactions.get(str);
        if (list3 == null) {
            list3 = C0881AGi.A00;
        }
        if (list3.equals(list)) {
            hatchConversationRepository.applyReactions(str, list2, false);
        }
    }

    private final MessageRemovalOutcome withoutRemovedMessages(List<HatchMessage> list, Set<String> set) {
        HatchMessage hatchMessageCopy$default;
        String str;
        ArrayList arrayListA0h = C3cG.A0h();
        ArrayList arrayListA0h2 = C3cG.A0h();
        ArrayList arrayListA0h3 = C3cG.A0h();
        int i = 0;
        for (HatchMessage hatchMessage : list) {
            if (!set.contains(hatchMessage.id) && ((str = hatchMessage.serverMessageId) == null || !set.contains(str))) {
                List<HatchWidgetPresentation> list2 = hatchMessage.presentations;
                if (list2 != null && !list2.isEmpty()) {
                    ArrayList arrayListA0h4 = C3cG.A0h();
                    for (HatchWidgetPresentation hatchWidgetPresentation : list2) {
                        if (!isRemovedBy(hatchWidgetPresentation, set)) {
                            arrayListA0h4.add(hatchWidgetPresentation);
                        }
                    }
                    if (arrayListA0h4.size() != list2.size()) {
                        if (arrayListA0h4.isEmpty() && hatchMessage.content.length() == 0 && hatchMessage.transcript == null) {
                            arrayListA0h2.add(hatchMessage);
                        } else {
                            i++;
                            if (arrayListA0h4.isEmpty()) {
                                arrayListA0h4 = null;
                            }
                            hatchMessageCopy$default = C60R.A0N(hatchMessage, arrayListA0h4);
                            arrayListA0h.add(hatchMessageCopy$default);
                        }
                    }
                }
                arrayListA0h.add(hatchMessage);
            } else if (hatchMessage.role == HatchMessageRole.USER) {
                HatchMessageUnsendStatus hatchMessageUnsendStatus = hatchMessage.unsendStatus;
                HatchMessageUnsendStatus hatchMessageUnsendStatus2 = HatchMessageUnsendStatus.DELETED;
                if (hatchMessageUnsendStatus != hatchMessageUnsendStatus2) {
                    hatchMessageCopy$default = HatchMessage.copy$default(hatchMessage, null, null, null, 0L, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, hatchMessageUnsendStatus2, null, null, null, null, null, false, null, null, false, null, -8388609, 3, null);
                    arrayListA0h3.add(hatchMessageCopy$default);
                    arrayListA0h.add(hatchMessageCopy$default);
                } else {
                    arrayListA0h.add(hatchMessage);
                }
            } else {
                arrayListA0h2.add(hatchMessage);
            }
        }
        return new MessageRemovalOutcome(arrayListA0h, arrayListA0h2, arrayListA0h3, i);
    }

    @Override // com.facebook.aura.model.WidgetStateMutationHost
    public WidgetStateSource captureWidgetState(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return this.widgetStateSync.captureWidgetState(str, str2);
    }

    public final Object pokeChat(HtJ<? super HatchChatPokeResponse> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C113632(null));
    }

    public final void setWidgetState(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.widgetStateSync.setWidgetState(str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:178:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x06be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleChatEvent(com.facebook.aura.model.HatchChatEvent r61, java.lang.String r62) {
        /*
            Method dump skipped, instructions count: 1737
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchConversationRepository.handleChatEvent(com.facebook.aura.model.HatchChatEvent, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x028e A[Catch: Exception -> 0x04c2, LOOP:5: B:104:0x0288->B:106:0x028e, LOOP_END, TRY_ENTER, TRY_LEAVE, TryCatch #25 {Exception -> 0x04c2, blocks: (B:102:0x0268, B:106:0x028e, B:109:0x02a4, B:111:0x02a8, B:113:0x02b0, B:118:0x02f3), top: B:326:0x0268 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x035a A[Catch: Exception -> 0x053a, TRY_LEAVE, TryCatch #21 {Exception -> 0x053a, blocks: (B:126:0x0345, B:127:0x0354, B:129:0x035a), top: B:319:0x0345 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0411 A[Catch: Exception -> 0x0574, TRY_ENTER, TryCatch #6 {Exception -> 0x0574, blocks: (B:170:0x04a9, B:195:0x04e6, B:201:0x04fd, B:130:0x0370, B:131:0x0390, B:132:0x039f, B:136:0x03db, B:141:0x0415, B:157:0x0445, B:161:0x0453, B:169:0x0477, B:144:0x041e, B:150:0x0431, B:154:0x043f, B:140:0x0411, B:219:0x0560, B:221:0x056a, B:223:0x056e), top: B:290:0x012f }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0419 A[Catch: Exception -> 0x04f8, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x04f8, blocks: (B:190:0x04d2, B:192:0x04e0, B:193:0x04e3, B:198:0x04ec, B:135:0x03bb, B:139:0x040e, B:143:0x0419, B:159:0x044f, B:162:0x0456, B:164:0x0460, B:167:0x0466, B:146:0x0422, B:148:0x042c, B:152:0x043b), top: B:279:0x03bb }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x041e A[Catch: Exception -> 0x0574, TRY_ENTER, TryCatch #6 {Exception -> 0x0574, blocks: (B:170:0x04a9, B:195:0x04e6, B:201:0x04fd, B:130:0x0370, B:131:0x0390, B:132:0x039f, B:136:0x03db, B:141:0x0415, B:157:0x0445, B:161:0x0453, B:169:0x0477, B:144:0x041e, B:150:0x0431, B:154:0x043f, B:140:0x0411, B:219:0x0560, B:221:0x056a, B:223:0x056e), top: B:290:0x012f }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0460 A[Catch: Exception -> 0x04f8, TryCatch #0 {Exception -> 0x04f8, blocks: (B:190:0x04d2, B:192:0x04e0, B:193:0x04e3, B:198:0x04ec, B:135:0x03bb, B:139:0x040e, B:143:0x0419, B:159:0x044f, B:162:0x0456, B:164:0x0460, B:167:0x0466, B:146:0x0422, B:148:0x042c, B:152:0x043b), top: B:279:0x03bb }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0466 A[Catch: Exception -> 0x04f8, TryCatch #0 {Exception -> 0x04f8, blocks: (B:190:0x04d2, B:192:0x04e0, B:193:0x04e3, B:198:0x04ec, B:135:0x03bb, B:139:0x040e, B:143:0x0419, B:159:0x044f, B:162:0x0456, B:164:0x0460, B:167:0x0466, B:146:0x0422, B:148:0x042c, B:152:0x043b), top: B:279:0x03bb }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x03a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0313 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0131 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0542 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadChatHistory(int r53, boolean r54, boolean r55, X.HtJ<? super com.facebook.aura.conversation.repo.LoadChatHistoryOutcome> r56) {
        /*
            Method dump skipped, instructions count: 1673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchConversationRepository.loadChatHistory(int, boolean, boolean, X.HtJ):java.lang.Object");
    }

    public /* synthetic */ HatchConversationRepository(Context context, AbstractC3358CGz abstractC3358CGz, String str, HatchConversationQplLogger hatchConversationQplLogger, boolean z, boolean z2, int i, C06H c06h) {
        this(context, abstractC3358CGz, str, (i & 8) != 0 ? new HatchConversationQplLogger() : hatchConversationQplLogger, C60Q.A1Q(i & 16, z), C60Q.A1Q(i & 32, z2));
    }
}
