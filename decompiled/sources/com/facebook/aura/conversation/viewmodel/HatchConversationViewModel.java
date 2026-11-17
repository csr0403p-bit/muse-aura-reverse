package com.facebook.aura.conversation.viewmodel;

import X.AEs;
import X.AEu;
import X.AGH;
import X.AGI;
import X.AHD;
import X.AHI;
import X.AIG;
import X.AbstractC05623ug;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC10623Hzj;
import X.AbstractC1903AtO;
import X.AbstractC2159Azp;
import X.AbstractC3358CGz;
import X.AbstractC5321DgF;
import X.AbstractC7559F3s;
import X.AbstractC9777Gfy;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass441;
import X.AnonymousClass602;
import X.AnonymousClass603;
import X.AnonymousClass801;
import X.BFI;
import X.BLG;
import X.BLL;
import X.BQG;
import X.C00r;
import X.C05663ul;
import X.C06827l3;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C0KA;
import X.C10543Hqv;
import X.C10649I0t;
import X.C1890At8;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C22I;
import X.C27k;
import X.C3Ej;
import X.C3Ek;
import X.C3Em;
import X.C3Es;
import X.C3Pi;
import X.C3UX;
import X.C3bP;
import X.C3cI;
import X.C3pU;
import X.C3rb;
import X.C4o7;
import X.C6v3;
import X.C6ys;
import X.C7384Etj;
import X.C78T;
import X.C79;
import X.C7BY;
import X.C7Bq;
import X.C9258GBl;
import X.C9286GCn;
import X.C9290GCr;
import X.CFK;
import X.EnumC10460Hji;
import X.EsN;
import X.Ey9;
import X.F0C;
import X.F2X;
import X.F3w;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import X.GAo;
import X.GCV;
import X.GDB;
import X.HoC;
import X.Hr7;
import X.HrH;
import X.HsJ;
import X.Ht9;
import X.HtJ;
import X.Hu1;
import X.HuJ;
import X.HwN;
import X.HwV;
import X.Hwg;
import X.HxE;
import X.HzP;
import X.HzR;
import X.InterfaceC2261BLa;
import X.InterfaceC2349BUy;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.facebook.aura.R;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.agentpermission.ConnectorOrderCheckoutRowsKt;
import com.facebook.aura.analytics.hatch.HatchCitationAnalytics;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchComposerEntryPoint;
import com.facebook.aura.analytics.hatch.HatchInteractionEnumsKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchSendButtonOrigin;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.commands.health.MC;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightKt;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.common.url.HatchPeerInviteLinks;
import com.facebook.aura.composer.dictation.ComposerDictationController;
import com.facebook.aura.composer.dictation.DictationHost;
import com.facebook.aura.confidentialvm.session.ConfidentialSessionGate;
import com.facebook.aura.conversation.api.ComposerLaunchAction;
import com.facebook.aura.conversation.api.ConversationComposers;
import com.facebook.aura.conversation.api.ConversationInputBlocks;
import com.facebook.aura.conversation.api.ConversationWidgetRequest;
import com.facebook.aura.conversation.api.ConversationWidgetRequests;
import com.facebook.aura.conversation.constants.HatchConversationConstants;
import com.facebook.aura.conversation.offline.HatchOfflineConversationRepository;
import com.facebook.aura.conversation.repo.HatchConversationMessageOrderingKt;
import com.facebook.aura.conversation.repo.HatchConversationRepository;
import com.facebook.aura.conversation.repo.HatchConversationState;
import com.facebook.aura.conversation.repo.HatchLiveSessionRoutingKt;
import com.facebook.aura.conversation.repo.HatchPrimaryConversationRepository;
import com.facebook.aura.conversation.repo.HatchPrimarySessionRepository;
import com.facebook.aura.conversation.repo.HatchReactionLanding;
import com.facebook.aura.conversation.repo.HatchThreadsRepository;
import com.facebook.aura.conversation.repo.HistoryLoadingState;
import com.facebook.aura.conversation.repo.SessionRefreshResult;
import com.facebook.aura.conversation.repo.ThreadsView;
import com.facebook.aura.conversation.viewmodel.HatchConversationListItem;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewEffect;
import com.facebook.aura.conversation.viewmodel.HatchDocumentType;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.file.actions.HatchFileActions;
import com.facebook.aura.file.actions.HatchFileRef;
import com.facebook.aura.file.repo.ArtifactDeployHolder;
import com.facebook.aura.file.repo.ArtifactDeploySnapshot;
import com.facebook.aura.file.repo.HatchDeletedMediaStore;
import com.facebook.aura.file.utils.HatchFileUIUtils;
import com.facebook.aura.file.view.ArtifactFileActionMenuKt;
import com.facebook.aura.file.view.ContentItemClipboardKt;
import com.facebook.aura.file.view.api.ContentItem;
import com.facebook.aura.file.view.api.ContentType;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.gateway.HatchFileOperations;
import com.facebook.aura.gateway.HatchGatewayConnectionState;
import com.facebook.aura.gateway.HatchSessionItem;
import com.facebook.aura.identity.provider.HatchConversationTheme;
import com.facebook.aura.identity.provider.HatchIdentityProvider;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import com.facebook.aura.livesession.api.LiveSession;
import com.facebook.aura.livesession.api.LiveSessions;
import com.facebook.aura.microphone.api.Microphone;
import com.facebook.aura.model.AgentActivityStatus;
import com.facebook.aura.model.DiscussionItemType;
import com.facebook.aura.model.HatchMessage;
import com.facebook.aura.model.HatchMessageKt;
import com.facebook.aura.model.HatchPendingFile;
import com.facebook.aura.model.HatchSearchResultData;
import com.facebook.aura.model.HatchSendErrorCategory;
import com.facebook.aura.model.HatchSendMessage;
import com.facebook.aura.model.HatchWidgetPresentation;
import com.facebook.aura.model.PendingDiscussionItem;
import com.facebook.aura.model.ReplyAttribution;
import com.facebook.aura.model.ReplyAttributionSerializer;
import com.facebook.aura.model.WidgetStateMutationHost;
import com.facebook.aura.network.api.HatchUrlSegments;
import com.facebook.aura.opengraph.HatchOpenGraphRepository;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import com.facebook.aura.perf.HatchConversationQplLogger;
import com.facebook.aura.qpl.startup.HatchStartupQpl;
import com.facebook.aura.qpl.startup.points.HatchStartupPoints;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import com.facebook.aura.status.repo.AgentActivityInfo;
import com.facebook.aura.status.repo.HatchStatusRepository;
import com.facebook.aura.toast.api.ToastApi;
import com.facebook.aura.uicontrol.PendingWidgetMessage;
import com.facebook.aura.uicontrol.UiAction;
import com.facebook.aura.uicontrol.UiActionExecutor;
import com.facebook.aura.uicontrol.UiControlActionSink;
import com.facebook.aura.uicontrol.UiSuggestion;
import com.facebook.aura.utils.HatchUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationViewModel extends AEs {
    public static final int $stable = 8;
    public static final long ATTACHMENT_UPLOAD_TIMEOUT_MS = 30000;
    public static final long AWAIT_FIRST_RESPONSE_TIMEOUT_MS = 30000;
    public static final long COMPOSER_DRAFT_SAVE_DEBOUNCE_MS = 2000;
    public static final Companion Companion = new Companion();
    public static final Set<String> DOCUMENT_MARKDOWN_EXTENSIONS = BFI.A0H(new String[]{"md", "markdown", "mdown"});
    public static final long OFFLINE_SAVE_DEBOUNCE_MS = 4000;
    public static final int POKE_MAX_PER_WINDOW = 3;
    public static final long POKE_WINDOW_MS = 300000;
    public static final int ROOM_PAGE_SIZE = 20;
    public static final String TAG = "HatchConversationVM";
    public static volatile boolean composerHintAnimationShown;
    public final C3Em<String> _composerHintAnimation;
    public final BLG<String> _highlightedMessageId;
    public final BLG<Boolean> _isDraftDictated;
    public final SnapshotStateList<HatchConversationListItem> _listItems;
    public final BLG<HatchSessionItem> _loadedSideChatInfo;
    public final BLG<HatchSendMessage> _pendingMessage;
    public final BLG<HatchConversationUiState> _uiState;
    public final C3Em<HatchConversationViewEffect> _viewEffects;
    public final boolean allowTypingCursorWhenDisconnected;
    public final C20Q<HatchConversationAnnouncement> announcement;
    public final HatchConversationAttachments attachments;
    public HoC awaitFirstResponseJob;
    public final C1BN<Boolean> awaitingApproval;
    public boolean cachedHistoryLogPending;
    public Integer cachedHistoryPushAgeMs;
    public final C20Q<Boolean> canAnnounce;
    public final F0C composerDrafts$delegate;
    public final C22I<String> composerHintAnimation;
    public final AutoCloseable composerRegistration;
    public final C00r composerRestores$delegate;
    public final C1890At8 composerTextState;
    public final ConfidentialSessionGate confidentialSessionGate;
    public final Context context;
    public volatile String cursorHandoffKey;
    public final HatchDeletedMediaStore deletedMediaStore;
    public final ArtifactDeployHolder deployHolder;
    public final ComposerDictationController dictation;
    public final GenericListSelectionDelegate genericListSelections;
    public final C1BN<String> highlightedMessageId;
    public HistorySource historySource;
    public final HatchIdentityProvider identityProvider;
    public final SingleFlight imageCopy;
    public final String instanceId;
    public boolean isDraftRestorePending;
    public boolean isExpectingResponse;
    public final boolean isNewThread;
    public final BLG<Boolean> isOnScreen;
    public final boolean isPrimaryThread;
    public boolean isSessionDeleted;
    public HoC jumpToMessageJob;
    public final C1BN<Map<String, String>> latestWidgetIdsByKind;
    public final C1BN<AHD<HatchConversationListItem>> listItems;
    public final HatchConversationListMapper listMapper;
    public final C1BN<HatchSessionItem> loadedSideChatInfo;
    public final int maxWidgetHeightCacheSize;
    public final HatchOfflineConversationRepository offlineRepo;
    public final boolean opensMainChat;
    public HatchComposerEntryPoint pendingEntryPoint;
    public String pendingEntryPointOriginId;
    public final AIG<Long> pokeTimestampsMs;
    public final HatchConversationQplLogger qplLogger;
    public final HatchConversationRepository repository;
    public boolean roomHasMore;
    public List<HatchMessage> roomMessages;
    public Long roomOldestSeq;
    public boolean roomPaginating;
    public final HatchConversationScrollController scrollController;
    public final HzR<Unit> scrollToBottomRequestChannel;
    public final C20Q<Unit> scrollToBottomRequests;
    public final BLG<String> sentRequestId;
    public final C1BN<HatchSentTurn> sentTurn;
    public final String sessionId;
    public final HatchStatusRepository statusRepository;
    public HoC stopDictationFocusJob;
    public final InterfaceC2261BLa syncMutex;
    public final F0C threadsRepository$delegate;
    public final C1BN<HatchConversationUiState> uiState;
    public final AbstractC3358CGz userSession;
    public final C22I<HatchConversationViewEffect> viewEffects;
    public final LinkedHashMap<String, Integer> widgetHeightCache;

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$1", f = "HatchConversationViewModel.kt", l = {484}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchConversationViewModel hatchConversationViewModel = HatchConversationViewModel.this;
                    C22I<Unit> c22iScrollRequests = hatchConversationViewModel.scrollController.scrollRequests(hatchConversationViewModel.sessionId);
                    final HatchConversationViewModel hatchConversationViewModel2 = HatchConversationViewModel.this;
                    C20Z<? super Unit> c20z = new C20Z() { // from class: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.1.1
                        public final Object emit(Unit unit, HtJ<? super Unit> htJ) {
                            HzR<Unit> hzR = hatchConversationViewModel2.scrollToBottomRequestChannel;
                            Unit unit2 = Unit.INSTANCE;
                            hzR.AhZ(unit2);
                            return unit2;
                        }

                        @Override // X.C20Z
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                            HzR<Unit> hzR = hatchConversationViewModel2.scrollToBottomRequestChannel;
                            Unit unit = Unit.INSTANCE;
                            hzR.AhZ(unit);
                            return unit;
                        }
                    };
                    this.label = 1;
                    if (c22iScrollRequests.collect(c20z, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th) {
                HatchConversationViewModel hatchConversationViewModel3 = HatchConversationViewModel.this;
                hatchConversationViewModel3.scrollController.release(hatchConversationViewModel3.sessionId);
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchConversationViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$10", f = "HatchConversationViewModel.kt", l = {581}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$10, reason: invalid class name */
    public final class AnonymousClass10 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$10$1", f = "HatchConversationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$10$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G2j<HatchConversationState, AgentActivityInfo, Boolean, HtJ<? super HwV<? extends HatchConversationState, ? extends AgentActivityInfo, ? extends Boolean>>, Object> {
            public /* synthetic */ Object L$0;
            public /* synthetic */ Object L$1;
            public /* synthetic */ boolean Z$0;
            public int label;

            public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
                super(4, htJ);
            }

            public final Object invoke(HatchConversationState hatchConversationState, AgentActivityInfo agentActivityInfo, boolean z, HtJ<? super HwV<HatchConversationState, AgentActivityInfo, Boolean>> htJ) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
                anonymousClass1.L$0 = hatchConversationState;
                anonymousClass1.L$1 = agentActivityInfo;
                anonymousClass1.Z$0 = z;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                Object obj2 = this.L$0;
                Object obj3 = this.L$1;
                boolean z = this.Z$0;
                if (this.label == 0) {
                    return new HwV(obj2, obj3, AnonymousClass001.A0k(obj, z));
                }
                throw AnonymousClass001.A0n();
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Object invoke(HatchConversationState hatchConversationState, AgentActivityInfo agentActivityInfo, Boolean bool, HtJ<? super HwV<? extends HatchConversationState, ? extends AgentActivityInfo, ? extends Boolean>> htJ) {
                return invoke(hatchConversationState, agentActivityInfo, AnonymousClass001.A1X(bool), (HtJ<? super HwV<HatchConversationState, AgentActivityInfo, Boolean>>) htJ);
            }
        }

        /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$10$2, reason: invalid class name */
        public final class AnonymousClass2<T> implements C20Z {
            public final /* synthetic */ HatchConversationViewModel this$0;

            /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$10$2$WhenMappings */
            /* loaded from: classes6.dex */
            public abstract /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[AgentActivityStatus.values().length];
                    try {
                        AnonymousClass002.A13(AgentActivityStatus.RESPONDING, iArr);
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        AnonymousClass002.A14(AgentActivityStatus.MAKING_SOMETHING, iArr);
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        AnonymousClass002.A15(AgentActivityStatus.WORKING, iArr);
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        AnonymousClass002.A16(AgentActivityStatus.COMPOSING, iArr);
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        AnonymousClass002.A17(AgentActivityStatus.COMPACTING, iArr);
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        AnonymousClass002.A18(AgentActivityStatus.WAITING_FOR_SUBAGENTS, iArr);
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        AnonymousClass006.A1G(AgentActivityStatus.ONLINE, iArr);
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        AnonymousClass006.A1H(AgentActivityStatus.NEEDS_APPROVAL, iArr);
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        AnonymousClass006.A1I(AgentActivityStatus.OUT_OF_CREDITS, iArr);
                    } catch (NoSuchFieldError unused9) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public AnonymousClass2(HatchConversationViewModel hatchConversationViewModel) {
                this.this$0 = hatchConversationViewModel;
            }

            @Override // X.C20Z
            public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ) {
                return emit((HwV<HatchConversationState, AgentActivityInfo, Boolean>) obj, (HtJ<? super Unit>) htJ);
            }

            /* JADX WARN: Code restructure failed: missing block: B:47:0x00cd, code lost:
            
                if (r3.messages.isEmpty() == false) goto L48;
             */
            /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x00aa A[PHI: r5
  0x00aa: PHI (r5v1 int) = (r5v0 int), (r5v4 int) binds: [B:37:0x009e, B:39:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:45:0x00c6 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:49:0x00d6  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x00e0  */
            /* JADX WARN: Removed duplicated region for block: B:59:0x00ff  */
            /* JADX WARN: Removed duplicated region for block: B:67:0x011b  */
            /* JADX WARN: Removed duplicated region for block: B:75:0x0131  */
            /* JADX WARN: Removed duplicated region for block: B:82:0x0188 A[PHI: r29
  0x0188: PHI (r29v2 boolean) = (r29v0 boolean), (r29v3 boolean) binds: [B:76:0x0133, B:74:0x012f] A[DONT_GENERATE, DONT_INLINE]] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(X.HwV<com.facebook.aura.conversation.repo.HatchConversationState, com.facebook.aura.status.repo.AgentActivityInfo, java.lang.Boolean> r49, X.HtJ<? super kotlin.Unit> r50) {
                /*
                    Method dump skipped, instructions count: 440
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.AnonymousClass10.AnonymousClass2.emit(X.HwV, X.HtJ):java.lang.Object");
            }
        }

        public AnonymousClass10(HtJ<? super AnonymousClass10> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationViewModel.this.new AnonymousClass10(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchConversationViewModel hatchConversationViewModel = HatchConversationViewModel.this;
                C20Q c20qA01 = AbstractC05623ug.A01(C3rb.A00(new AnonymousClass1(null), hatchConversationViewModel.repository.conversationState, hatchConversationViewModel.statusRepository.agentActivity, hatchConversationViewModel.awaitingApproval));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(HatchConversationViewModel.this);
                this.label = 1;
                if (c20qA01.collect(anonymousClass2, this) == enumC10460Hji) {
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
            return HatchConversationViewModel.this.new AnonymousClass10(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$11", f = "HatchConversationViewModel.kt", l = {670}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$11, reason: invalid class name */
    public final class AnonymousClass11 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass11(HtJ<? super AnonymousClass11> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationViewModel.this.new AnonymousClass11(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final HatchConversationViewModel hatchConversationViewModel = HatchConversationViewModel.this;
                C22I<Unit> c22i = hatchConversationViewModel.repository.attachmentsDropped;
                C20Z<? super Unit> c20z = new C20Z() { // from class: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.11.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((Unit) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(Unit unit, HtJ<? super Unit> htJ) {
                        hatchConversationViewModel._viewEffects.AhV(HatchConversationViewEffect.ShowAttachmentUploadFailed.INSTANCE);
                        return Unit.INSTANCE;
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
            throw new KotlinNothingValueException();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchConversationViewModel.this.new AnonymousClass11(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$12", f = "HatchConversationViewModel.kt", l = {675}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$12, reason: invalid class name */
    public final class AnonymousClass12 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass12(HtJ<? super AnonymousClass12> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationViewModel.this.new AnonymousClass12(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final HatchConversationViewModel hatchConversationViewModel = HatchConversationViewModel.this;
                C22I<String> c22i = hatchConversationViewModel.repository.liveComposerHint;
                C20Z<? super String> c20z = new C20Z() { // from class: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.12.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((String) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(String str, HtJ<? super Unit> htJ) {
                        if (!HatchConversationViewModel.composerHintAnimationShown) {
                            HatchConversationViewModel.composerHintAnimationShown = true;
                            hatchConversationViewModel._composerHintAnimation.AhV(str);
                        }
                        return Unit.INSTANCE;
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
            throw new KotlinNothingValueException();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchConversationViewModel.this.new AnonymousClass12(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$13", f = "HatchConversationViewModel.kt", l = {683}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$13, reason: invalid class name */
    public final class AnonymousClass13 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$13$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<String> {
            public final /* synthetic */ HatchConversationViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HatchConversationViewModel hatchConversationViewModel) {
                super(0);
                this.this$0 = hatchConversationViewModel;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ String invoke() {
                return AnonymousClass003.A0h(this.this$0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return AnonymousClass003.A0h(this.this$0);
            }
        }

        public AnonymousClass13(HtJ<? super AnonymousClass13> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationViewModel.this.new AnonymousClass13(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C05663ul c05663ulA01 = C6v3.A01(new AnonymousClass1(HatchConversationViewModel.this));
                final HatchConversationViewModel hatchConversationViewModel = HatchConversationViewModel.this;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.13.2
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((String) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(String str, HtJ<? super Unit> htJ) {
                        HatchSendMessage value;
                        BLG<HatchSendMessage> blg = hatchConversationViewModel._pendingMessage;
                        do {
                            value = blg.getValue();
                        } while (!blg.A6e(value, HatchSendMessage.copy$default(value, str, null, null, null, null, null, null, null, null, false, null, null, null, 8190, null)));
                        if (C7BY.A0j(str)) {
                            AnonymousClass003.A14(hatchConversationViewModel._isDraftDictated, false);
                        }
                        if (str.length() > 0) {
                            hatchConversationViewModel.isDraftRestorePending = false;
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c05663ulA01.collect(c20z, this) == enumC10460Hji) {
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
            return HatchConversationViewModel.this.new AnonymousClass13(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$14", f = "HatchConversationViewModel.kt", l = {2448}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$14, reason: invalid class name */
    public final class AnonymousClass14 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public Object L$1;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$14$1", f = "HatchConversationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$14$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<HatchSendMessage, HtJ<? super Unit>, Object> {
            public /* synthetic */ Object L$0;
            public int label;
            public final /* synthetic */ HatchConversationViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HatchConversationViewModel hatchConversationViewModel, HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
                this.this$0 = hatchConversationViewModel;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, htJ);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                HatchConversationUiState value;
                HatchConversationUiState hatchConversationUiState;
                AHD ahdA07;
                AHD ahdA072;
                PendingDiscussionItem pendingDiscussionItem;
                HatchSendMessage hatchSendMessage = (HatchSendMessage) this.L$0;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                BLG<HatchConversationUiState> blg = this.this$0._uiState;
                do {
                    value = blg.getValue();
                    hatchConversationUiState = value;
                    ahdA07 = AGI.A07(hatchSendMessage.imageUris);
                    List<HatchPendingFile> list = hatchSendMessage.fileUris;
                    ArrayList arrayList = new ArrayList(Hr7.A1D(list, 10));
                    Iterator<HatchPendingFile> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().uri);
                    }
                    ahdA072 = AGI.A07(arrayList);
                    pendingDiscussionItem = hatchSendMessage.pendingDiscussionItem;
                } while (!blg.A6e(value, HatchConversationUiState.copy$default(hatchConversationUiState, false, false, false, false, false, false, 0, null, false, ahdA07, ahdA072, null, null, null, null, false, false, false, null, pendingDiscussionItem != null ? pendingDiscussionItem.previewImageData : null, null, null, null, null, null, null, false, 0, false, false, false, false, null, null, false, -525825, 7, null)));
                return Unit.INSTANCE;
            }

            @Override // X.G0V
            public final Object invoke(HatchSendMessage hatchSendMessage, HtJ<? super Unit> htJ) {
                return ((AnonymousClass1) create(hatchSendMessage, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass14(HtJ<? super AnonymousClass14> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationViewModel.this.new AnonymousClass14(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchConversationViewModel hatchConversationViewModel = HatchConversationViewModel.this;
                BLG<HatchSendMessage> blg = hatchConversationViewModel._pendingMessage;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(hatchConversationViewModel, null);
                C7384Etj.A0Z(blg, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.FlowKt__CollectKt.collectLatest>");
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (C3pU.A00(this, anonymousClass1, blg) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw new IllegalStateException("SharedFlow never completes, this call should never return.");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchConversationViewModel.this.new AnonymousClass14(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$15", f = "HatchConversationViewModel.kt", l = {706}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$15, reason: invalid class name */
    public final class AnonymousClass15 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass15(HtJ<? super AnonymousClass15> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationViewModel.this.new AnonymousClass15(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchThreadsRepository threadsRepository = HatchConversationViewModel.this.getThreadsRepository();
                String str = HatchConversationViewModel.this.sessionId;
                this.label = 1;
                obj = threadsRepository.refreshSession(str, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            SessionRefreshResult sessionRefreshResult = (SessionRefreshResult) obj;
            if (sessionRefreshResult instanceof SessionRefreshResult.Found) {
                HatchConversationViewModel.this._loadedSideChatInfo.Af8(((SessionRefreshResult.Found) sessionRefreshResult).session);
            } else if (C7384Etj.areEqual(sessionRefreshResult, SessionRefreshResult.NotFound.INSTANCE)) {
                HatchConversationViewModel hatchConversationViewModel = HatchConversationViewModel.this;
                if (!hatchConversationViewModel.isNewThread && C1BN.A00(hatchConversationViewModel).messages.isEmpty()) {
                    HatchConversationViewModel.this.isSessionDeleted = true;
                    ToastApi.INSTANCE.showToast(R.string._name_removed__res_0x7f1210fe);
                    HatchConversationViewModel.this._viewEffects.AhV(HatchConversationViewEffect.SessionDeleted.INSTANCE);
                }
            } else if (!C7384Etj.areEqual(sessionRefreshResult, SessionRefreshResult.Failed.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchConversationViewModel.this.new AnonymousClass15(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$2", f = "HatchConversationViewModel.kt", l = {492}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationViewModel.this.new AnonymousClass2(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchPrimarySessionRepository companion = HatchPrimarySessionRepository.Companion.getInstance(HatchConversationViewModel.this.userSession);
                this.label = 1;
                if (companion.ensureLoaded(this) == enumC10460Hji) {
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
            return HatchConversationViewModel.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$3", f = "HatchConversationViewModel.kt", l = {497}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$3$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        public final /* synthetic */ class AnonymousClass1 implements C20Z, InterfaceC2349BUy {
            public final /* synthetic */ HatchConversationViewModel $tmp0;

            public AnonymousClass1(HatchConversationViewModel hatchConversationViewModel) {
                this.$tmp0 = hatchConversationViewModel;
            }

            public final Object emit(ConversationWidgetRequest conversationWidgetRequest, HtJ<? super Unit> htJ) {
                this.$tmp0.fulfillWidgetRequest(conversationWidgetRequest);
                return Unit.INSTANCE;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof C20Z) && (obj instanceof InterfaceC2349BUy)) {
                    return C3cI.A1V(obj, getFunctionDelegate());
                }
                return false;
            }

            @Override // X.InterfaceC2349BUy
            public final Ht9<?> getFunctionDelegate() {
                return new F2X(2, this.$tmp0, HatchConversationViewModel.class, "fulfillWidgetRequest", "fulfillWidgetRequest(Lcom/facebook/aura/conversation/api/ConversationWidgetRequest;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            @Override // X.C20Z
            public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ) {
                this.$tmp0.fulfillWidgetRequest((ConversationWidgetRequest) obj);
                return Unit.INSTANCE;
            }
        }

        public AnonymousClass3(HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationViewModel.this.new AnonymousClass3(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ConversationWidgetRequests companion = ConversationWidgetRequests.Companion.getInstance(HatchConversationViewModel.this.userSession);
                HatchConversationViewModel hatchConversationViewModel = HatchConversationViewModel.this;
                C20Q<ConversationWidgetRequest> c20qObserve = companion.observe(hatchConversationViewModel.sessionId, hatchConversationViewModel.isPrimaryThread, hatchConversationViewModel.isOnScreen);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(HatchConversationViewModel.this);
                this.label = 1;
                if (c20qObserve.collect(anonymousClass1, this) == enumC10460Hji) {
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
            return HatchConversationViewModel.this.new AnonymousClass3(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$4", f = "HatchConversationViewModel.kt", l = {501}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$4$1", f = "HatchConversationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$4$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G2j<HatchSendMessage, HatchConversationUiState, Integer, HtJ<? super Boolean>, Object> {
            public /* synthetic */ int I$0;
            public /* synthetic */ Object L$0;
            public /* synthetic */ Object L$1;
            public int label;

            public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
                super(4, htJ);
            }

            public final Object invoke(HatchSendMessage hatchSendMessage, HatchConversationUiState hatchConversationUiState, int i, HtJ<? super Boolean> htJ) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
                anonymousClass1.L$0 = hatchSendMessage;
                anonymousClass1.L$1 = hatchConversationUiState;
                anonymousClass1.I$0 = i;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
            @Override // X.AbstractC8884Fsp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r3 = r4.L$0
                    com.facebook.aura.model.HatchSendMessage r3 = (com.facebook.aura.model.HatchSendMessage) r3
                    java.lang.Object r2 = r4.L$1
                    com.facebook.aura.conversation.viewmodel.HatchConversationUiState r2 = (com.facebook.aura.conversation.viewmodel.HatchConversationUiState) r2
                    int r1 = r4.I$0
                    int r0 = r4.label
                    if (r0 != 0) goto L3c
                    X.Hwg.A00(r5)
                    java.lang.String r0 = r3.text
                    boolean r0 = X.C7BY.A0j(r0)
                    if (r0 == 0) goto L36
                    int r0 = com.facebook.aura.conversation.viewmodel.HatchConversationAttachmentsKt.attachmentCount(r3)
                    if (r0 > 0) goto L36
                    com.facebook.aura.model.PendingDiscussionItem r0 = r3.pendingDiscussionItem
                    if (r0 != 0) goto L36
                    X.AHD<java.lang.String> r0 = r2.linkAttachmentUrls
                    boolean r0 = r0.isEmpty()
                    if (r0 == 0) goto L36
                    com.facebook.aura.conversation.viewmodel.ReplyContext r0 = r2.replyContext
                    if (r0 != 0) goto L36
                    com.facebook.aura.conversation.viewmodel.MessageContext r0 = r2.messageContext
                    if (r0 != 0) goto L36
                    r0 = 0
                    if (r1 <= 0) goto L37
                L36:
                    r0 = 1
                L37:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    return r0
                L3c:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.AnonymousClass4.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Object invoke(HatchSendMessage hatchSendMessage, HatchConversationUiState hatchConversationUiState, Integer num, HtJ<? super Boolean> htJ) {
                return invoke(hatchSendMessage, hatchConversationUiState, AnonymousClass001.A0F(num), htJ);
            }
        }

        public AnonymousClass4(HtJ<? super AnonymousClass4> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationViewModel.this.new AnonymousClass4(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ConversationComposers companion = ConversationComposers.Companion.getInstance(HatchConversationViewModel.this.userSession);
                HatchConversationViewModel hatchConversationViewModel = HatchConversationViewModel.this;
                String str = hatchConversationViewModel.sessionId;
                AnonymousClass603 anonymousClass603A00 = C3rb.A00(new AnonymousClass1(null), hatchConversationViewModel._pendingMessage, hatchConversationViewModel._uiState, hatchConversationViewModel.attachments.stagingImageBatchCount);
                this.label = 1;
                if (companion.publish(str, anonymousClass603A00, this) == enumC10460Hji) {
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
            return HatchConversationViewModel.this.new AnonymousClass4(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$5", f = "HatchConversationViewModel.kt", l = {521}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass5(HtJ<? super AnonymousClass5> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationViewModel.this.new AnonymousClass5(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C22I<String> c22i = HatchConversationViewModel.this.getThreadsRepository().sessionDeletedEvents;
                final HatchConversationViewModel hatchConversationViewModel = HatchConversationViewModel.this;
                C20Z<? super String> c20z = new C20Z() { // from class: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.5.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((String) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(String str, HtJ<? super Unit> htJ) {
                        if (C7384Etj.areEqual(str, hatchConversationViewModel.sessionId)) {
                            HatchConversationViewModel hatchConversationViewModel2 = hatchConversationViewModel;
                            hatchConversationViewModel2.isSessionDeleted = true;
                            hatchConversationViewModel2._viewEffects.AhV(HatchConversationViewEffect.SessionDeleted.INSTANCE);
                        }
                        return Unit.INSTANCE;
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
            throw new KotlinNothingValueException();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchConversationViewModel.this.new AnonymousClass5(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$6", f = "HatchConversationViewModel.kt", l = {MC.wearables_hatch_health_connectors.__CONFIG__}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass6(HtJ<? super AnonymousClass6> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationViewModel.this.new AnonymousClass6(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final HatchConversationViewModel hatchConversationViewModel = HatchConversationViewModel.this;
                C1BN<HatchConversationTheme> c1bn = hatchConversationViewModel.identityProvider.conversationTheme;
                C20Z<? super HatchConversationTheme> c20z = new C20Z() { // from class: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.6.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((HatchConversationTheme) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(HatchConversationTheme hatchConversationTheme, HtJ<? super Unit> htJ) {
                        HatchConversationUiState value;
                        BLG<HatchConversationUiState> blg = hatchConversationViewModel._uiState;
                        do {
                            value = blg.getValue();
                        } while (!blg.A6e(value, HatchConversationUiState.copy$default(value, false, false, false, false, false, false, 0, null, false, null, null, null, null, null, null, false, false, false, null, null, null, null, null, hatchConversationTheme, null, null, false, 0, false, false, false, false, null, null, false, -8388609, 7, null)));
                        return Unit.INSTANCE;
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
            throw new KotlinNothingValueException();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchConversationViewModel.this.new AnonymousClass6(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$7", f = "HatchConversationViewModel.kt", l = {536}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass7(HtJ<? super AnonymousClass7> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationViewModel.this.new AnonymousClass7(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C20Q<Boolean> c20qObserve = ConversationInputBlocks.INSTANCE.observe(HatchConversationViewModel.this.userSession);
                final HatchConversationViewModel hatchConversationViewModel = HatchConversationViewModel.this;
                C20Z<? super Boolean> c20z = new C20Z() { // from class: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.7.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                        HatchConversationUiState value;
                        BLG<HatchConversationUiState> blg = hatchConversationViewModel._uiState;
                        do {
                            value = blg.getValue();
                        } while (!blg.A6e(value, HatchConversationUiState.copy$default(value, false, false, false, false, false, false, 0, null, false, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, false, 0, false, false, false, false, null, null, z, -1, 3, null)));
                        if (z) {
                            hatchConversationViewModel.dictation.cancel(false);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c20qObserve.collect(c20z, this) == enumC10460Hji) {
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
            return HatchConversationViewModel.this.new AnonymousClass7(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$8", f = "HatchConversationViewModel.kt", l = {545}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$8, reason: invalid class name */
    public final class AnonymousClass8 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass8(HtJ<? super AnonymousClass8> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationViewModel.this.new AnonymousClass8(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C22I<UiSuggestion> c22i = UiControlActionSink.Companion.getInstance(HatchConversationViewModel.this.userSession).pendingSuggestion;
                final HatchConversationViewModel hatchConversationViewModel = HatchConversationViewModel.this;
                C20Z<? super UiSuggestion> c20z = new C20Z() { // from class: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.8.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((UiSuggestion) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(UiSuggestion uiSuggestion, HtJ<? super Unit> htJ) {
                        HatchConversationUiState value;
                        BLG<HatchConversationUiState> blg = hatchConversationViewModel._uiState;
                        do {
                            value = blg.getValue();
                        } while (!blg.A6e(value, HatchConversationUiState.copy$default(value, false, false, false, false, false, false, 0, null, false, null, null, null, null, null, null, false, false, false, null, null, null, null, uiSuggestion, null, null, null, false, 0, false, false, false, false, null, null, false, -4194305, 7, null)));
                        return Unit.INSTANCE;
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
            throw new KotlinNothingValueException();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchConversationViewModel.this.new AnonymousClass8(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$9", f = "HatchConversationViewModel.kt", l = {550}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$9, reason: invalid class name */
    public final class AnonymousClass9 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$9$1, reason: invalid class name */
        /* loaded from: classes3.dex */
        public final class AnonymousClass1<T> implements C20Z {
            public final /* synthetic */ HatchConversationViewModel this$0;

            public AnonymousClass1(HatchConversationViewModel hatchConversationViewModel) {
                this.this$0 = hatchConversationViewModel;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(com.facebook.aura.uicontrol.PendingWidgetMessage r15, X.HtJ<? super kotlin.Unit> r16) {
                /*
                    r14 = this;
                    r3 = r16
                    boolean r0 = r3 instanceof com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$9$1$emit$1
                    if (r0 == 0) goto L24
                    r4 = r3
                    com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$9$1$emit$1 r4 = (com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$9$1$emit$1) r4
                    int r2 = r4.label
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r0 = r2 & r1
                    if (r0 == 0) goto L24
                    int r2 = r2 - r1
                    r4.label = r2
                L14:
                    java.lang.Object r1 = r4.result
                    X.Hji r3 = X.EnumC10460Hji.A02
                    int r0 = r4.label
                    r2 = 1
                    if (r0 == 0) goto L2f
                    if (r0 != r2) goto L2a
                    java.lang.Object r15 = r4.L$0
                    com.facebook.aura.uicontrol.PendingWidgetMessage r15 = (com.facebook.aura.uicontrol.PendingWidgetMessage) r15
                    goto L4f
                L24:
                    com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$9$1$emit$1 r4 = new com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$9$1$emit$1
                    r4.<init>(r14, r3)
                    goto L14
                L2a:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                L2f:
                    X.Hwg.A00(r1)
                    java.lang.String r1 = r15.threadId
                    com.facebook.aura.conversation.viewmodel.HatchConversationViewModel r0 = r14.this$0
                    java.lang.String r0 = r0.sessionId
                    boolean r0 = X.C7384Etj.areEqual(r1, r0)
                    if (r0 == 0) goto L95
                    X.G0V<com.facebook.aura.model.WidgetStateMutationHost, X.HtJ<? super java.lang.Boolean>, java.lang.Object> r1 = r15.beforeSend     // Catch: java.util.concurrent.CancellationException -> L88 java.lang.Exception -> L8a
                    com.facebook.aura.conversation.viewmodel.HatchConversationViewModel r0 = r14.this$0     // Catch: java.util.concurrent.CancellationException -> L88 java.lang.Exception -> L8a
                    com.facebook.aura.conversation.repo.HatchConversationRepository r0 = r0.repository     // Catch: java.util.concurrent.CancellationException -> L88 java.lang.Exception -> L8a
                    r4.L$0 = r15     // Catch: java.util.concurrent.CancellationException -> L88 java.lang.Exception -> L8a
                    r4.label = r2     // Catch: java.util.concurrent.CancellationException -> L88 java.lang.Exception -> L8a
                    java.lang.Object r1 = r1.invoke(r0, r4)     // Catch: java.util.concurrent.CancellationException -> L88 java.lang.Exception -> L8a
                    if (r1 != r3) goto L52
                    return r3
                L4f:
                    X.Hwg.A00(r1)     // Catch: java.util.concurrent.CancellationException -> L88 java.lang.Exception -> L8a
                L52:
                    boolean r0 = X.AnonymousClass001.A1X(r1)     // Catch: java.util.concurrent.CancellationException -> L88 java.lang.Exception -> L8a
                    if (r0 != 0) goto L5b
                    kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.util.concurrent.CancellationException -> L88 java.lang.Exception -> L8a
                    return r3
                L5b:
                    com.facebook.aura.conversation.viewmodel.HatchConversationViewModel r2 = r14.this$0     // Catch: java.util.concurrent.CancellationException -> L88 java.lang.Exception -> L8a
                    java.lang.String r4 = r15.text     // Catch: java.util.concurrent.CancellationException -> L88 java.lang.Exception -> L8a
                    java.lang.String r1 = r15.replyToMessageId     // Catch: java.util.concurrent.CancellationException -> L88 java.lang.Exception -> L8a
                    if (r1 == 0) goto L86
                    r0 = 0
                    com.facebook.aura.model.ReplyAttribution$Message r9 = new com.facebook.aura.model.ReplyAttribution$Message     // Catch: java.util.concurrent.CancellationException -> L88 java.lang.Exception -> L8a
                    r9.<init>(r1, r0, r0)     // Catch: java.util.concurrent.CancellationException -> L88 java.lang.Exception -> L8a
                L69:
                    boolean r13 = r15.routeToLiveSession     // Catch: java.util.concurrent.CancellationException -> L88 java.lang.Exception -> L8a
                    r6 = 0
                    java.lang.String r5 = X.AnonymousClass002.A0k()     // Catch: java.util.concurrent.CancellationException -> L88 java.lang.Exception -> L8a
                    X.AGi r7 = X.C0881AGi.A00     // Catch: java.util.concurrent.CancellationException -> L88 java.lang.Exception -> L8a
                    X.9jH r15 = X.AGH.A0E()     // Catch: java.util.concurrent.CancellationException -> L88 java.lang.Exception -> L8a
                    com.facebook.aura.model.HatchSendMessage r3 = new com.facebook.aura.model.HatchSendMessage     // Catch: java.util.concurrent.CancellationException -> L88 java.lang.Exception -> L8a
                    r8 = r7
                    r10 = r6
                    r11 = r6
                    r12 = r6
                    r14 = r6
                    r16 = r6
                    r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch: java.util.concurrent.CancellationException -> L88 java.lang.Exception -> L8a
                    r2.onWidgetSendMessage(r3)     // Catch: java.util.concurrent.CancellationException -> L88 java.lang.Exception -> L8a
                    goto L95
                L86:
                    r9 = 0
                    goto L69
                L88:
                    r0 = move-exception
                    throw r0
                L8a:
                    r2 = move-exception
                    java.lang.String r1 = "widget message send failed"
                    r0 = 2
                    java.lang.String r0 = X.AnonymousClass000.A00(r0)
                    X.CFK.A08(r0, r1, r2)
                L95:
                    kotlin.Unit r3 = kotlin.Unit.INSTANCE
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.AnonymousClass9.AnonymousClass1.emit(com.facebook.aura.uicontrol.PendingWidgetMessage, X.HtJ):java.lang.Object");
            }

            @Override // X.C20Z
            public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ) {
                return emit((PendingWidgetMessage) obj, (HtJ<? super Unit>) htJ);
            }
        }

        public AnonymousClass9(HtJ<? super AnonymousClass9> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationViewModel.this.new AnonymousClass9(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C22I<PendingWidgetMessage> c22i = UiControlActionSink.Companion.getInstance(HatchConversationViewModel.this.userSession).pendingWidgetMessage;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(HatchConversationViewModel.this);
                this.label = 1;
                if (c22i.collect(anonymousClass1, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchConversationViewModel.this.new AnonymousClass9(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final class ArtifactShareSnapshot extends C06G {
        public static final int $stable = 0;
        public final String deployedUrl;
        public final boolean hasPendingChanges;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ArtifactShareSnapshot) {
                    ArtifactShareSnapshot artifactShareSnapshot = (ArtifactShareSnapshot) obj;
                    if (!C7384Etj.areEqual(this.deployedUrl, artifactShareSnapshot.deployedUrl) || this.hasPendingChanges != artifactShareSnapshot.hasPendingChanges) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ ArtifactShareSnapshot copy$default(ArtifactShareSnapshot artifactShareSnapshot, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = artifactShareSnapshot.deployedUrl;
            }
            if ((i & 2) != 0) {
                z = artifactShareSnapshot.hasPendingChanges;
            }
            return new ArtifactShareSnapshot(str, z);
        }

        public final String component1() {
            return this.deployedUrl;
        }

        public final boolean component2() {
            return this.hasPendingChanges;
        }

        public final ArtifactShareSnapshot copy(String str, boolean z) {
            return new ArtifactShareSnapshot(str, z);
        }

        public final String getDeployedUrl() {
            return this.deployedUrl;
        }

        public final boolean getHasPendingChanges() {
            return this.hasPendingChanges;
        }

        public int hashCode() {
            return C0KA.A00(AnonymousClass006.A0G(this.deployedUrl) * 31, this.hasPendingChanges);
        }

        public ArtifactShareSnapshot(String str, boolean z) {
            this.deployedUrl = str;
            this.hasPendingChanges = z;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Factory extends AuraViewModelFactory<HatchConversationViewModel> {
        public static final int $stable = 8;
        public final boolean allowTypingCursorWhenDisconnected;
        public final Context context;
        public final boolean isNewThread;
        public final String sessionId;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public HatchConversationViewModel create() {
            return new HatchConversationViewModel(this.context, this.userSession, this.sessionId, this.allowTypingCursorWhenDisconnected, this.isNewThread);
        }

        public Factory(Context context, AbstractC3358CGz abstractC3358CGz, String str, boolean z, boolean z2) {
            AnonymousClass005.A0x(context, abstractC3358CGz, str);
            this.context = context;
            this.userSession = abstractC3358CGz;
            this.sessionId = str;
            this.allowTypingCursorWhenDisconnected = z;
            this.isNewThread = z2;
        }

        public /* synthetic */ Factory(Context context, AbstractC3358CGz abstractC3358CGz, String str, boolean z, boolean z2, int i, C06H c06h) {
            this(context, abstractC3358CGz, str, AnonymousClass005.A1P(i, z), (i & 16) != 0 ? false : z2);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class HistorySource {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ HistorySource[] $VALUES;
        public static final HistorySource NETWORK;
        public static final HistorySource ROOM;

        static {
            HistorySource historySource = new HistorySource("ROOM", 0);
            ROOM = historySource;
            HistorySource historySource2 = new HistorySource("NETWORK", 1);
            NETWORK = historySource2;
            HistorySource[] historySourceArr = {historySource, historySource2};
            $VALUES = historySourceArr;
            $ENTRIES = new F3w(historySourceArr);
        }

        public static Ey9<HistorySource> getEntries() {
            return $ENTRIES;
        }

        public static HistorySource valueOf(String str) {
            return (HistorySource) Enum.valueOf(HistorySource.class, str);
        }

        public static HistorySource[] values() {
            return (HistorySource[]) $VALUES.clone();
        }

        public HistorySource(String str, int i) {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$acceptPendingSuggestion$2", f = "HatchConversationViewModel.kt", l = {1200}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$acceptPendingSuggestion$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes3.dex */
    public final class C115322 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ UiControlActionSink $sink;
        public final /* synthetic */ UiSuggestion $suggestion;
        public int label;
        public final /* synthetic */ HatchConversationViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115322(UiSuggestion uiSuggestion, HatchConversationViewModel hatchConversationViewModel, UiControlActionSink uiControlActionSink, HtJ<? super C115322> htJ) {
            super(2, htJ);
            this.$suggestion = uiSuggestion;
            this.this$0 = hatchConversationViewModel;
            this.$sink = uiControlActionSink;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C115322(this.$suggestion, this.this$0, this.$sink, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                UiActionExecutor uiActionExecutor = UiActionExecutor.INSTANCE;
                UiAction uiAction = this.$suggestion.action;
                AbstractC3358CGz abstractC3358CGz = this.this$0.userSession;
                UiControlActionSink uiControlActionSink = this.$sink;
                HatchConversationViewModel$acceptPendingSuggestion$2$result$1 hatchConversationViewModel$acceptPendingSuggestion$2$result$1 = new HatchConversationViewModel$acceptPendingSuggestion$2$result$1(uiControlActionSink);
                HatchConversationViewModel$acceptPendingSuggestion$2$result$2 hatchConversationViewModel$acceptPendingSuggestion$2$result$2 = new HatchConversationViewModel$acceptPendingSuggestion$2$result$2(uiControlActionSink);
                this.label = 1;
                obj = uiActionExecutor.perform(uiAction, abstractC3358CGz, hatchConversationViewModel$acceptPendingSuggestion$2$result$1, hatchConversationViewModel$acceptPendingSuggestion$2$result$2, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            UiActionExecutor.Result result = (UiActionExecutor.Result) obj;
            if (result instanceof UiActionExecutor.Result.Unsupported) {
                CFK.A06(AnonymousClass000.A00(2), FGI.A0d("accept suggest ", this.$suggestion.invokeId, " unsupported: ", ((UiActionExecutor.Result.Unsupported) result).reason));
                ToastApi.INSTANCE.showToast(R.string._name_removed__res_0x7f120bcd);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C115322) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$copyImage$1", f = "HatchConversationViewModel.kt", l = {1974}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$copyImage$1, reason: invalid class name and case insensitive filesystem */
    public final class C115331 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Long $clipAtTap;
        public final /* synthetic */ ClipboardManager $clipboard;
        public final /* synthetic */ ContentItem $image;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$copyImage$1$1", f = "HatchConversationViewModel.kt", l = {1975}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$copyImage$1$1, reason: invalid class name and collision with other inner class name */
        public final class C01151 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
            public final /* synthetic */ Long $clipAtTap;
            public final /* synthetic */ ClipboardManager $clipboard;
            public final /* synthetic */ ContentItem $image;
            public int label;
            public final /* synthetic */ HatchConversationViewModel this$0;

            /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$copyImage$1$1$1, reason: invalid class name and collision with other inner class name */
            public final class C01161 extends AbstractC7559F3s implements Function0<Boolean> {
                public final /* synthetic */ Long $clipAtTap;
                public final /* synthetic */ ClipboardManager $clipboard;
                public final /* synthetic */ HatchConversationViewModel this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C01161(HatchConversationViewModel hatchConversationViewModel, ClipboardManager clipboardManager, Long l) {
                    super(0);
                    this.this$0 = hatchConversationViewModel;
                    this.$clipboard = clipboardManager;
                    this.$clipAtTap = l;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
                @Override // kotlin.jvm.functions.Function0
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Boolean invoke() {
                    /*
                        r2 = this;
                        com.facebook.aura.auth.AuraSessionManager r1 = com.facebook.aura.auth.AuraSessionManager.INSTANCE
                        com.facebook.aura.conversation.viewmodel.HatchConversationViewModel r0 = r2.this$0
                        X.CGz r0 = r0.userSession
                        boolean r0 = r1.isCurrentSession(r0)
                        if (r0 == 0) goto L2f
                        com.facebook.aura.lifecycle.AuraAppLifecycleManager r0 = com.facebook.aura.lifecycle.AuraAppLifecycleManager.INSTANCE
                        boolean r0 = r0.isAppInForeground()
                        if (r0 == 0) goto L2f
                        android.content.ClipboardManager r0 = r2.$clipboard
                        if (r0 == 0) goto L35
                        android.content.ClipDescription r0 = r0.getPrimaryClipDescription()
                        if (r0 == 0) goto L35
                        long r0 = r0.getTimestamp()
                        java.lang.Long r1 = java.lang.Long.valueOf(r0)
                    L26:
                        java.lang.Long r0 = r2.$clipAtTap
                        boolean r1 = X.C7384Etj.areEqual(r1, r0)
                        r0 = 1
                        if (r1 != 0) goto L30
                    L2f:
                        r0 = 0
                    L30:
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                        return r0
                    L35:
                        r1 = 0
                        goto L26
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.C115331.C01151.C01161.invoke():java.lang.Boolean");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01151(HatchConversationViewModel hatchConversationViewModel, ContentItem contentItem, ClipboardManager clipboardManager, Long l, HtJ<? super C01151> htJ) {
                super(1, htJ);
                this.this$0 = hatchConversationViewModel;
                this.$image = contentItem;
                this.$clipboard = clipboardManager;
                this.$clipAtTap = l;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new C01151(this.this$0, this.$image, this.$clipboard, this.$clipAtTap, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    Context contextA0I = AnonymousClass001.A0I(this.this$0.context);
                    HatchConversationViewModel hatchConversationViewModel = this.this$0;
                    AbstractC3358CGz abstractC3358CGz = hatchConversationViewModel.userSession;
                    ContentItem contentItem = this.$image;
                    C01161 c01161 = new C01161(hatchConversationViewModel, this.$clipboard, this.$clipAtTap);
                    this.label = 1;
                    if (ContentItemClipboardKt.copyContentItemToClipboard(contextA0I, abstractC3358CGz, contentItem, c01161, this) == enumC10460Hji) {
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
                return ((C01151) create(htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115331(ContentItem contentItem, ClipboardManager clipboardManager, Long l, HtJ<? super C115331> htJ) {
            super(2, htJ);
            this.$image = contentItem;
            this.$clipboard = clipboardManager;
            this.$clipAtTap = l;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationViewModel.this.new C115331(this.$image, this.$clipboard, this.$clipAtTap, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchConversationViewModel hatchConversationViewModel = HatchConversationViewModel.this;
                SingleFlight singleFlight = hatchConversationViewModel.imageCopy;
                C01151 c01151 = new C01151(hatchConversationViewModel, this.$image, this.$clipboard, this.$clipAtTap, null);
                this.label = 1;
                if (singleFlight.invoke(Unit.INSTANCE, c01151, this) == enumC10460Hji) {
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
            return ((C115331) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel", f = "HatchConversationViewModel.kt", l = {924}, m = "deleteOfflineMessagesSafely", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$deleteOfflineMessagesSafely$1, reason: invalid class name and case insensitive filesystem */
    public final class C115341 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C115341(HtJ<? super C115341> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchConversationViewModel.this.deleteOfflineMessagesSafely(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$downloadDocument$1", f = "HatchConversationViewModel.kt", l = {2219}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$downloadDocument$1, reason: invalid class name and case insensitive filesystem */
    public final class C115351 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $fileName;
        public final /* synthetic */ String $relativePath;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$downloadDocument$1$1", f = "HatchConversationViewModel.kt", l = {2221}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$downloadDocument$1$1, reason: invalid class name and collision with other inner class name */
        public final class C01171 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
            public final /* synthetic */ Context $context;
            public final /* synthetic */ String $fileName;
            public final /* synthetic */ String $relativePath;
            public int label;
            public final /* synthetic */ HatchConversationViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01171(Context context, String str, String str2, HatchConversationViewModel hatchConversationViewModel, HtJ<? super C01171> htJ) {
                super(1, htJ);
                this.$context = context;
                this.$relativePath = str;
                this.$fileName = str2;
                this.this$0 = hatchConversationViewModel;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new C01171(this.$context, this.$relativePath, this.$fileName, this.this$0, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchFileActions hatchFileActions = HatchFileActions.INSTANCE;
                    Context context = this.$context;
                    HatchFileRef.Workspace workspace = new HatchFileRef.Workspace(this.$relativePath, this.$fileName);
                    AbstractC3358CGz abstractC3358CGz = this.this$0.userSession;
                    this.label = 1;
                    if (hatchFileActions.download(context, workspace, abstractC3358CGz, false, null, this) == enumC10460Hji) {
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
                return ((C01171) create(htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115351(String str, Context context, String str2, HtJ<? super C115351> htJ) {
            super(2, htJ);
            this.$fileName = str;
            this.$context = context;
            this.$relativePath = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationViewModel.this.new C115351(this.$fileName, this.$context, this.$relativePath, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchConversationViewModel hatchConversationViewModel = HatchConversationViewModel.this;
                HatchPendingFileActionType hatchPendingFileActionType = HatchPendingFileActionType.DOWNLOAD;
                String str = this.$fileName;
                C01171 c01171 = new C01171(this.$context, this.$relativePath, str, hatchConversationViewModel, null);
                this.label = 1;
                if (hatchConversationViewModel.withPendingFileAction(hatchPendingFileActionType, str, c01171, this) == enumC10460Hji) {
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
            return ((C115351) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$downloadDocumentAsPdf$1", f = "HatchConversationViewModel.kt", l = {2153}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$downloadDocumentAsPdf$1, reason: invalid class name and case insensitive filesystem */
    public final class C115361 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ HatchDocumentType $documentType;
        public final /* synthetic */ String $fileName;
        public final /* synthetic */ String $relativePath;
        public final /* synthetic */ String $url;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$downloadDocumentAsPdf$1$1", f = "HatchConversationViewModel.kt", l = {2156, 2164}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$downloadDocumentAsPdf$1$1, reason: invalid class name and collision with other inner class name */
        public final class C01181 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
            public final /* synthetic */ Context $context;
            public final /* synthetic */ HatchDocumentType $documentType;
            public final /* synthetic */ String $fileName;
            public final /* synthetic */ String $relativePath;
            public final /* synthetic */ String $url;
            public int label;
            public final /* synthetic */ HatchConversationViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01181(HatchDocumentType hatchDocumentType, Context context, String str, String str2, HatchConversationViewModel hatchConversationViewModel, String str3, HtJ<? super C01181> htJ) {
                super(1, htJ);
                this.$documentType = hatchDocumentType;
                this.$context = context;
                this.$url = str;
                this.$fileName = str2;
                this.this$0 = hatchConversationViewModel;
                this.$relativePath = str3;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new C01181(this.$documentType, this.$context, this.$url, this.$fileName, this.this$0, this.$relativePath, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                Object objDownloadMarkdownAsPdf;
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    if (this.$documentType instanceof HatchDocumentType.Html) {
                        HatchFileUIUtils hatchFileUIUtils = HatchFileUIUtils.INSTANCE;
                        Context context = this.$context;
                        String str = this.$url;
                        String str2 = this.$fileName;
                        AbstractC3358CGz abstractC3358CGz = this.this$0.userSession;
                        this.label = 1;
                        objDownloadMarkdownAsPdf = hatchFileUIUtils.downloadHtmlAsPdf(context, str, str2, abstractC3358CGz, this);
                    } else {
                        HatchFileUIUtils hatchFileUIUtils2 = HatchFileUIUtils.INSTANCE;
                        Context context2 = this.$context;
                        String str3 = this.$relativePath;
                        String str4 = this.$fileName;
                        AbstractC3358CGz abstractC3358CGz2 = this.this$0.userSession;
                        this.label = 2;
                        objDownloadMarkdownAsPdf = hatchFileUIUtils2.downloadMarkdownAsPdf(context2, str3, str4, abstractC3358CGz2, this);
                    }
                    if (objDownloadMarkdownAsPdf == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1 && i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                return Unit.INSTANCE;
            }

            @Override // X.G0U
            public final Object invoke(HtJ<? super Unit> htJ) {
                return ((C01181) create(htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115361(String str, HatchDocumentType hatchDocumentType, Context context, String str2, String str3, HtJ<? super C115361> htJ) {
            super(2, htJ);
            this.$fileName = str;
            this.$documentType = hatchDocumentType;
            this.$context = context;
            this.$url = str2;
            this.$relativePath = str3;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationViewModel.this.new C115361(this.$fileName, this.$documentType, this.$context, this.$url, this.$relativePath, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchConversationViewModel hatchConversationViewModel = HatchConversationViewModel.this;
                HatchPendingFileActionType hatchPendingFileActionType = HatchPendingFileActionType.DOWNLOAD_AS_PDF;
                String str = this.$fileName;
                C01181 c01181 = new C01181(this.$documentType, this.$context, this.$url, str, hatchConversationViewModel, this.$relativePath, null);
                this.label = 1;
                if (hatchConversationViewModel.withPendingFileAction(hatchPendingFileActionType, str, c01181, this) == enumC10460Hji) {
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
            return ((C115361) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$downloadHtmlAsPdf$1", f = "HatchConversationViewModel.kt", l = {2183}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$downloadHtmlAsPdf$1, reason: invalid class name and case insensitive filesystem */
    public final class C115371 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $fileName;
        public final /* synthetic */ String $url;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$downloadHtmlAsPdf$1$1", f = "HatchConversationViewModel.kt", l = {2184}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$downloadHtmlAsPdf$1$1, reason: invalid class name and collision with other inner class name */
        public final class C01191 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
            public final /* synthetic */ Context $context;
            public final /* synthetic */ String $fileName;
            public final /* synthetic */ String $url;
            public int label;
            public final /* synthetic */ HatchConversationViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01191(Context context, String str, String str2, HatchConversationViewModel hatchConversationViewModel, HtJ<? super C01191> htJ) {
                super(1, htJ);
                this.$context = context;
                this.$url = str;
                this.$fileName = str2;
                this.this$0 = hatchConversationViewModel;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new C01191(this.$context, this.$url, this.$fileName, this.this$0, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchFileUIUtils hatchFileUIUtils = HatchFileUIUtils.INSTANCE;
                    Context context = this.$context;
                    String str = this.$url;
                    String str2 = this.$fileName;
                    AbstractC3358CGz abstractC3358CGz = this.this$0.userSession;
                    this.label = 1;
                    if (hatchFileUIUtils.downloadHtmlAsPdf(context, str, str2, abstractC3358CGz, this) == enumC10460Hji) {
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
                return ((C01191) create(htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115371(String str, Context context, String str2, HtJ<? super C115371> htJ) {
            super(2, htJ);
            this.$fileName = str;
            this.$context = context;
            this.$url = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationViewModel.this.new C115371(this.$fileName, this.$context, this.$url, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchConversationViewModel hatchConversationViewModel = HatchConversationViewModel.this;
                HatchPendingFileActionType hatchPendingFileActionType = HatchPendingFileActionType.DOWNLOAD_AS_PDF;
                String str = this.$fileName;
                C01191 c01191 = new C01191(this.$context, this.$url, str, hatchConversationViewModel, null);
                this.label = 1;
                if (hatchConversationViewModel.withPendingFileAction(hatchPendingFileActionType, str, c01191, this) == enumC10460Hji) {
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
            return ((C115371) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$downloadHtmlFile$1", f = "HatchConversationViewModel.kt", l = {2201}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$downloadHtmlFile$1, reason: invalid class name and case insensitive filesystem */
    public final class C115381 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $fileName;
        public final /* synthetic */ String $url;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$downloadHtmlFile$1$1", f = "HatchConversationViewModel.kt", l = {2202}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$downloadHtmlFile$1$1, reason: invalid class name and collision with other inner class name */
        public final class C01201 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
            public final /* synthetic */ Context $context;
            public final /* synthetic */ String $fileName;
            public final /* synthetic */ String $url;
            public int label;
            public final /* synthetic */ HatchConversationViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01201(Context context, String str, String str2, HatchConversationViewModel hatchConversationViewModel, HtJ<? super C01201> htJ) {
                super(1, htJ);
                this.$context = context;
                this.$url = str;
                this.$fileName = str2;
                this.this$0 = hatchConversationViewModel;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new C01201(this.$context, this.$url, this.$fileName, this.this$0, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchFileUIUtils hatchFileUIUtils = HatchFileUIUtils.INSTANCE;
                    Context context = this.$context;
                    String str = this.$url;
                    String str2 = this.$fileName;
                    AbstractC3358CGz abstractC3358CGz = this.this$0.userSession;
                    this.label = 1;
                    if (hatchFileUIUtils.downloadHtmlFile(context, str, str2, abstractC3358CGz, this) == enumC10460Hji) {
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
                return ((C01201) create(htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115381(String str, Context context, String str2, HtJ<? super C115381> htJ) {
            super(2, htJ);
            this.$fileName = str;
            this.$context = context;
            this.$url = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationViewModel.this.new C115381(this.$fileName, this.$context, this.$url, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchConversationViewModel hatchConversationViewModel = HatchConversationViewModel.this;
                HatchPendingFileActionType hatchPendingFileActionType = HatchPendingFileActionType.DOWNLOAD_AS_HTML;
                String str = this.$fileName;
                C01201 c01201 = new C01201(this.$context, this.$url, str, hatchConversationViewModel, null);
                this.label = 1;
                if (hatchConversationViewModel.withPendingFileAction(hatchPendingFileActionType, str, c01201, this) == enumC10460Hji) {
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
            return ((C115381) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$jumpToMessage$1", f = "HatchConversationViewModel.kt", l = {1810, 1816}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$jumpToMessage$1, reason: invalid class name and case insensitive filesystem */
    public final class C115391 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $messageId;
        public final /* synthetic */ Long $seq;
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$jumpToMessage$1$1", f = "HatchConversationViewModel.kt", l = {1810}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$jumpToMessage$1$1, reason: invalid class name and collision with other inner class name */
        public final class C01211 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ String $messageId;
            public final /* synthetic */ Long $seq;
            public int label;
            public final /* synthetic */ HatchConversationViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01211(HatchConversationViewModel hatchConversationViewModel, String str, Long l, HtJ<? super C01211> htJ) {
                super(2, htJ);
                this.this$0 = hatchConversationViewModel;
                this.$messageId = str;
                this.$seq = l;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C01211(this.this$0, this.$messageId, this.$seq, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchConversationRepository hatchConversationRepository = this.this$0.repository;
                    String str = this.$messageId;
                    Long l = this.$seq;
                    this.label = 1;
                    if (hatchConversationRepository.jumpToMessage(str, l, this) == enumC10460Hji) {
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
                return ((C01211) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115391(String str, Long l, HtJ<? super C115391> htJ) {
            super(2, htJ);
            this.$messageId = str;
            this.$seq = l;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationViewModel.this.new C115391(this.$messageId, this.$seq, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x001f A[PHI: r2 r3 r4 r5
  0x001f: PHI (r2v2 com.facebook.aura.conversation.viewmodel.HatchConversationViewModel) = 
  (r2v1 com.facebook.aura.conversation.viewmodel.HatchConversationViewModel)
  (r2v3 com.facebook.aura.conversation.viewmodel.HatchConversationViewModel)
 binds: [B:20:0x0063, B:8:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x001f: PHI (r3v2 java.lang.String) = (r3v1 java.lang.String), (r3v3 java.lang.String) binds: [B:20:0x0063, B:8:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x001f: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:20:0x0063, B:8:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x001f: PHI (r5v2 int) = (r5v1 int), (r5v4 int) binds: [B:20:0x0063, B:8:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0037 -> B:7:0x001b). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                X.Hji r7 = X.EnumC10460Hji.A02
                int r0 = r9.label
                r6 = 2
                r8 = 1
                if (r0 == 0) goto L3a
                if (r0 == r8) goto L60
                if (r0 != r6) goto L6b
                int r5 = r9.I$1
                int r4 = r9.I$0
                java.lang.Object r3 = r9.L$1
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r2 = r9.L$0
                com.facebook.aura.conversation.viewmodel.HatchConversationViewModel r2 = (com.facebook.aura.conversation.viewmodel.HatchConversationViewModel) r2
                X.Hwg.A00(r10)
            L1b:
                int r5 = r5 + 1
                if (r5 >= r4) goto L70
            L1f:
                boolean r0 = com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.access$tryHighlightLoadedMessage(r2, r3)
                if (r0 != 0) goto L70
                r9.L$0 = r2
                r9.L$1 = r3
                r9.I$0 = r4
                r9.I$1 = r5
                r9.I$2 = r5
                r9.label = r6
                r0 = 100
                java.lang.Object r0 = X.C7Bq.A01(r0, r9)
                if (r0 != r7) goto L1b
                return r7
            L3a:
                X.Hwg.A00(r10)
                com.facebook.aura.conversation.viewmodel.HatchConversationViewModel r1 = com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.this
                java.lang.String r0 = r9.$messageId
                boolean r0 = com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.access$tryHighlightLoadedMessage(r1, r0)
                if (r0 != 0) goto L70
                X.78T r5 = X.AnonymousClass001.A0y()
                com.facebook.aura.conversation.viewmodel.HatchConversationViewModel r4 = com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.this
                java.lang.String r3 = r9.$messageId
                java.lang.Long r2 = r9.$seq
                r1 = 0
                com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$jumpToMessage$1$1 r0 = new com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$jumpToMessage$1$1
                r0.<init>(r4, r3, r2, r1)
                r9.label = r8
                java.lang.Object r0 = X.GAo.A00(r9, r5, r0)
                if (r0 != r7) goto L63
                return r7
            L60:
                X.Hwg.A00(r10)
            L63:
                com.facebook.aura.conversation.viewmodel.HatchConversationViewModel r2 = com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.this
                java.lang.String r3 = r9.$messageId
                r4 = 50
                r5 = 0
                goto L1f
            L6b:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L70:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.C115391.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C115391) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$lateTranscriptDraftSaver$1, reason: invalid class name and case insensitive filesystem */
    public final class C115401 extends AbstractC7559F3s implements G0U<String, Unit> {
        public final /* synthetic */ HatchConversationComposerController $composerController;
        public final /* synthetic */ HatchComposerDraftStore $drafts;
        public final /* synthetic */ C10543Hqv<String> $expectedDraft;
        public final /* synthetic */ String $sessionId;

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            C7384Etj.A0Y(str, 0);
            if (str.length() <= 0 || !C7384Etj.areEqual(this.$drafts.cachedText(this.$sessionId), this.$expectedDraft.element) || HatchPeerInviteLinks.INSTANCE.contains(str)) {
                return;
            }
            this.$composerController.requestDraftReplacing(this.$sessionId, this.$expectedDraft.element, str);
            this.$expectedDraft.element = str;
            this.$drafts.save(this.$sessionId, str, true, false);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115401(HatchComposerDraftStore hatchComposerDraftStore, String str, C10543Hqv<String> c10543Hqv, HatchConversationComposerController hatchConversationComposerController) {
            super(1);
            this.$drafts = hatchComposerDraftStore;
            this.$sessionId = str;
            this.$expectedDraft = c10543Hqv;
            this.$composerController = hatchConversationComposerController;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$loadMoreHistory$1", f = "HatchConversationViewModel.kt", l = {1799}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$loadMoreHistory$1, reason: invalid class name and case insensitive filesystem */
    public final class C115411 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C115411(HtJ<? super C115411> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationViewModel.this.new C115411(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchConversationRepository hatchConversationRepository = HatchConversationViewModel.this.repository;
                this.label = 1;
                if (hatchConversationRepository.loadMoreHistory(20, this) == enumC10460Hji) {
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
            return HatchConversationViewModel.this.new C115411(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$loadMoreRoomHistory$2", f = "HatchConversationViewModel.kt", l = {830, 838}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$loadMoreRoomHistory$2, reason: invalid class name and case insensitive filesystem */
    public final class C115422 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ long $before;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115422(long j, HtJ<? super C115422> htJ) {
            super(2, htJ);
            this.$before = j;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationViewModel.this.new C115422(this.$before, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r44) {
            /*
                Method dump skipped, instructions count: 368
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.C115422.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C115422) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$observeBackgroundFlush$1", f = "HatchConversationViewModel.kt", l = {901}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$observeBackgroundFlush$1, reason: invalid class name and case insensitive filesystem */
    public final class C115431 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C115431(HtJ<? super C115431> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationViewModel.this.new C115431(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C20Q c20qA01 = GDB.A01(AuraAppLifecycleManager.isAppInForegroundFlow);
                final HatchConversationViewModel hatchConversationViewModel = HatchConversationViewModel.this;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.observeBackgroundFlush.1.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                        if (!z) {
                            HatchConversationViewModel hatchConversationViewModel2 = hatchConversationViewModel;
                            hatchConversationViewModel2.cachedHistoryLogPending = false;
                            hatchConversationViewModel2.persistComposerDraft(AnonymousClass003.A0h(hatchConversationViewModel2), true);
                            HatchConversationViewModel hatchConversationViewModel3 = hatchConversationViewModel;
                            Object objPersistOfflineSnapshotSafely = hatchConversationViewModel3.persistOfflineSnapshotSafely(C1BN.A00(hatchConversationViewModel3), htJ);
                            if (objPersistOfflineSnapshotSafely == EnumC10460Hji.A02) {
                                return objPersistOfflineSnapshotSafely;
                            }
                        }
                        return Unit.INSTANCE;
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
            return HatchConversationViewModel.this.new C115431(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$observeComposerDraftPersistence$1", f = "HatchConversationViewModel.kt", l = {870}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$observeComposerDraftPersistence$1, reason: invalid class name and case insensitive filesystem */
    public final class C115441 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$observeComposerDraftPersistence$1$2, reason: invalid class name */
        public final /* synthetic */ class AnonymousClass2 extends F2X implements G0W {
            public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

            public AnonymousClass2() {
                super(3, HxE.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
            }

            public final Object invoke(String str, boolean z, HtJ<? super HxE<String, Boolean>> htJ) {
                return AnonymousClass002.A0q(str, z);
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return new HxE(obj, obj2);
            }
        }

        public C115441(HtJ<? super C115441> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationViewModel.this.new C115441(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchConversationViewModel hatchConversationViewModel = HatchConversationViewModel.this;
                AnonymousClass602 anonymousClass602A00 = C4o7.A00(new C3bP(2000L, 1), GDB.A01(C3rb.A03(AnonymousClass2.INSTANCE, new HatchConversationViewModel$observeComposerDraftPersistence$1$invokeSuspend$$inlined$map$1(hatchConversationViewModel._pendingMessage), hatchConversationViewModel._isDraftDictated)));
                final HatchConversationViewModel hatchConversationViewModel2 = HatchConversationViewModel.this;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.observeComposerDraftPersistence.1.3
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((HxE<String, Boolean>) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(HxE<String, Boolean> hxE, HtJ<? super Unit> htJ) {
                        HatchConversationViewModel.persistComposerDraft$default(hatchConversationViewModel2, hxE.first, false, 2, null);
                        return Unit.INSTANCE;
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

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchConversationViewModel.this.new C115441(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$observeOfflinePersistence$1", f = "HatchConversationViewModel.kt", l = {878, 883}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$observeOfflinePersistence$1, reason: invalid class name and case insensitive filesystem */
    public final class C115451 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public int label;

        public C115451(HtJ<? super C115451> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationViewModel.this.new C115451(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C1BN<HatchConversationState> c1bn = HatchConversationViewModel.this.repository.conversationState;
                HatchConversationViewModel$observeOfflinePersistence$1$initialNetworkHistory$1 hatchConversationViewModel$observeOfflinePersistence$1$initialNetworkHistory$1 = new HatchConversationViewModel$observeOfflinePersistence$1$initialNetworkHistory$1(null);
                this.label = 1;
                obj = AbstractC9777Gfy.A00(this, hatchConversationViewModel$observeOfflinePersistence$1$initialNetworkHistory$1, c1bn);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
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
            HatchConversationViewModel hatchConversationViewModel = HatchConversationViewModel.this;
            this.L$0 = null;
            this.label = 2;
            if (hatchConversationViewModel.persistOfflineSnapshotSafely((HatchConversationState) obj, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchConversationViewModel.this.new C115451(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$observeOfflinePersistence$2", f = "HatchConversationViewModel.kt", l = {889}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$observeOfflinePersistence$2, reason: invalid class name and case insensitive filesystem */
    public final class C115462 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C115462(HtJ<? super C115462> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationViewModel.this.new C115462(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AnonymousClass602 anonymousClass602A00 = C4o7.A00(new C3bP(4000L, 1), new HatchConversationViewModel$observeOfflinePersistence$2$invokeSuspend$$inlined$filter$1(HatchConversationViewModel.this.repository.conversationState));
                final HatchConversationViewModel hatchConversationViewModel = HatchConversationViewModel.this;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.observeOfflinePersistence.2.2
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((HatchConversationState) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(HatchConversationState hatchConversationState, HtJ<? super Unit> htJ) {
                        Object objPersistOfflineSnapshotSafely = hatchConversationViewModel.persistOfflineSnapshotSafely(hatchConversationState, htJ);
                        if (objPersistOfflineSnapshotSafely != EnumC10460Hji.A02) {
                            return Unit.INSTANCE;
                        }
                        return objPersistOfflineSnapshotSafely;
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

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchConversationViewModel.this.new C115462(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$observeOfflinePersistence$3", f = "HatchConversationViewModel.kt", l = {892}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$observeOfflinePersistence$3, reason: invalid class name and case insensitive filesystem */
    public final class C115473 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C115473(HtJ<? super C115473> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationViewModel.this.new C115473(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final HatchConversationViewModel hatchConversationViewModel = HatchConversationViewModel.this;
                C22I<List<Long>> c22i = hatchConversationViewModel.repository.removedMessageSeqs;
                C20Z<? super List<Long>> c20z = new C20Z() { // from class: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.observeOfflinePersistence.3.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((List<Long>) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(List<Long> list, HtJ<? super Unit> htJ) {
                        Object objDeleteOfflineMessagesSafely = hatchConversationViewModel.deleteOfflineMessagesSafely(list, htJ);
                        if (objDeleteOfflineMessagesSafely != EnumC10460Hji.A02) {
                            return Unit.INSTANCE;
                        }
                        return objDeleteOfflineMessagesSafely;
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
            throw new KotlinNothingValueException();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchConversationViewModel.this.new C115473(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$observeOfflinePersistence$4", f = "HatchConversationViewModel.kt", l = {895}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$observeOfflinePersistence$4, reason: invalid class name and case insensitive filesystem */
    public final class C115484 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C115484(HtJ<? super C115484> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationViewModel.this.new C115484(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final HatchConversationViewModel hatchConversationViewModel = HatchConversationViewModel.this;
                C22I<List<HatchMessage>> c22i = hatchConversationViewModel.repository.tombstonedMessages;
                C20Z<? super List<HatchMessage>> c20z = new C20Z() { // from class: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.observeOfflinePersistence.4.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((List<HatchMessage>) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(List<HatchMessage> list, HtJ<? super Unit> htJ) {
                        Object objPersistOfflineMessagesSafely = hatchConversationViewModel.persistOfflineMessagesSafely(list, htJ);
                        if (objPersistOfflineMessagesSafely != EnumC10460Hji.A02) {
                            return Unit.INSTANCE;
                        }
                        return objPersistOfflineMessagesSafely;
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
            throw new KotlinNothingValueException();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchConversationViewModel.this.new C115484(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel", f = "HatchConversationViewModel.kt", l = {937}, m = "persistOfflineMessagesSafely", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$persistOfflineMessagesSafely$1, reason: invalid class name and case insensitive filesystem */
    public final class C115491 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C115491(HtJ<? super C115491> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchConversationViewModel.this.persistOfflineMessagesSafely(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel", f = "HatchConversationViewModel.kt", l = {913}, m = "persistOfflineSnapshotSafely", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$persistOfflineSnapshotSafely$1, reason: invalid class name and case insensitive filesystem */
    public final class C115501 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C115501(HtJ<? super C115501> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchConversationViewModel.this.persistOfflineSnapshotSafely(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$pokeAgent$3", f = "HatchConversationViewModel.kt", l = {1373}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$pokeAgent$3, reason: invalid class name and case insensitive filesystem */
    public final class C115513 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C115513(HtJ<? super C115513> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationViewModel.this.new C115513(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HatchConversationUiState value;
            Object objPokeChat = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(objPokeChat);
                HatchConversationRepository hatchConversationRepository = HatchConversationViewModel.this.repository;
                this.label = 1;
                objPokeChat = hatchConversationRepository.pokeChat(this);
                if (objPokeChat == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(objPokeChat);
            }
            BLG<HatchConversationUiState> blg = HatchConversationViewModel.this._uiState;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, HatchConversationUiState.copy$default(value, false, false, false, false, false, false, 0, null, false, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, false, 0, false, false, false, false, null, null, false, -268435457, 7, null)));
            if (objPokeChat == null) {
                CFK.A06("HatchConversationVM", "Poke failed");
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchConversationViewModel.this.new C115513(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$prefetchArtifactStatus$1", f = "HatchConversationViewModel.kt", l = {1906}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$prefetchArtifactStatus$1, reason: invalid class name and case insensitive filesystem */
    public final class C115521 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $projectDir;
        public int label;
        public final /* synthetic */ HatchConversationViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115521(String str, HatchConversationViewModel hatchConversationViewModel, HtJ<? super C115521> htJ) {
            super(2, htJ);
            this.$projectDir = str;
            this.this$0 = hatchConversationViewModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C115521(this.$projectDir, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchFileOperations hatchFileOperations = HatchFileOperations.INSTANCE;
                    String str = this.$projectDir;
                    AbstractC3358CGz abstractC3358CGz = this.this$0.userSession;
                    this.label = 1;
                    obj = hatchFileOperations.fetchArtifactUrl(str, abstractC3358CGz, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                this.this$0.deployHolder.cacheStatus(this.$projectDir, (HatchFileOperations.FetchArtifactUrlResult) obj);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A08("HatchConversationVM", FGI.A0M("Failed to prefetch artifact status for ", this.$projectDir), e2);
                this.this$0.deployHolder.invalidateCachedStatus(this.$projectDir);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C115521) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$prewarmComposerDrafts$1", f = "HatchConversationViewModel.kt", l = {1004}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$prewarmComposerDrafts$1, reason: invalid class name and case insensitive filesystem */
    public final class C115531 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ boolean $restore;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115531(boolean z, HtJ<? super C115531> htJ) {
            super(2, htJ);
            this.$restore = z;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationViewModel.this.new C115531(this.$restore, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HatchSendMessage value;
            Object objA00 = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                C78T c78tA0s = AnonymousClass002.A0s(objA00);
                HatchConversationViewModel$prewarmComposerDrafts$1$text$1 hatchConversationViewModel$prewarmComposerDrafts$1$text$1 = new HatchConversationViewModel$prewarmComposerDrafts$1$text$1(HatchConversationViewModel.this, this.$restore, null);
                this.label = 1;
                objA00 = GAo.A00(this, c78tA0s, hatchConversationViewModel$prewarmComposerDrafts$1$text$1);
                if (objA00 == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(objA00);
            }
            String str = (String) objA00;
            HatchConversationViewModel hatchConversationViewModel = HatchConversationViewModel.this;
            if (!hatchConversationViewModel.isDraftRestorePending) {
                HatchConversationViewModel hatchConversationViewModel2 = HatchConversationViewModel.this;
                HatchConversationViewModel.persistComposerDraft$default(hatchConversationViewModel2, AnonymousClass003.A0h(hatchConversationViewModel2), false, 2, null);
            } else if (str != null) {
                hatchConversationViewModel.isDraftRestorePending = false;
                if (str.length() > 0 && !HatchPeerInviteLinks.INSTANCE.contains(str) && HatchConversationViewModel.this.composerTextState.A07().length() == 0) {
                    HatchConversationViewModel.this.setComposerRestores(HatchConversationViewModel.this.composerRestores$delegate.AGd() + 1);
                    HatchConversationViewModel.this.setComposerText(str);
                    BLG<HatchSendMessage> blg = HatchConversationViewModel.this._pendingMessage;
                    do {
                        value = blg.getValue();
                    } while (!blg.A6e(value, HatchSendMessage.copy$default(value, str, null, null, null, null, null, null, null, null, false, null, null, null, 8190, null)));
                    HatchConversationViewModel hatchConversationViewModel3 = HatchConversationViewModel.this;
                    AnonymousClass003.A14(hatchConversationViewModel3._isDraftDictated, hatchConversationViewModel3.getComposerDrafts().isDictated(HatchConversationViewModel.this.sessionId));
                }
                HatchConversationViewModel hatchConversationViewModel22 = HatchConversationViewModel.this;
                HatchConversationViewModel.persistComposerDraft$default(hatchConversationViewModel22, AnonymousClass003.A0h(hatchConversationViewModel22), false, 2, null);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C115531) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$saveDocumentToGoogleDrive$1", f = "HatchConversationViewModel.kt", l = {2134}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$saveDocumentToGoogleDrive$1, reason: invalid class name and case insensitive filesystem */
    public final class C115541 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $fileName;
        public final /* synthetic */ String $relativePath;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$saveDocumentToGoogleDrive$1$1", f = "HatchConversationViewModel.kt", l = {2135}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$saveDocumentToGoogleDrive$1$1, reason: invalid class name and collision with other inner class name */
        public final class C01241 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
            public final /* synthetic */ Context $context;
            public final /* synthetic */ String $fileName;
            public final /* synthetic */ String $relativePath;
            public int label;
            public final /* synthetic */ HatchConversationViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01241(Context context, String str, String str2, HatchConversationViewModel hatchConversationViewModel, HtJ<? super C01241> htJ) {
                super(1, htJ);
                this.$context = context;
                this.$relativePath = str;
                this.$fileName = str2;
                this.this$0 = hatchConversationViewModel;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new C01241(this.$context, this.$relativePath, this.$fileName, this.this$0, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchFileActions hatchFileActions = HatchFileActions.INSTANCE;
                    Context context = this.$context;
                    HatchFileRef.Workspace workspace = new HatchFileRef.Workspace(this.$relativePath, this.$fileName);
                    AbstractC3358CGz abstractC3358CGz = this.this$0.userSession;
                    this.label = 1;
                    if (hatchFileActions.saveToGoogleDrive(context, workspace, abstractC3358CGz, this) == enumC10460Hji) {
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
                return ((C01241) create(htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115541(String str, Context context, String str2, HtJ<? super C115541> htJ) {
            super(2, htJ);
            this.$fileName = str;
            this.$context = context;
            this.$relativePath = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationViewModel.this.new C115541(this.$fileName, this.$context, this.$relativePath, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchConversationViewModel hatchConversationViewModel = HatchConversationViewModel.this;
                HatchPendingFileActionType hatchPendingFileActionType = HatchPendingFileActionType.SAVE_TO_DRIVE;
                String str = this.$fileName;
                C01241 c01241 = new C01241(this.$context, this.$relativePath, str, hatchConversationViewModel, null);
                this.label = 1;
                if (hatchConversationViewModel.withPendingFileAction(hatchPendingFileActionType, str, c01241, this) == enumC10460Hji) {
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
            return ((C115541) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$schedulePokeRateLimitReset$1", f = "HatchConversationViewModel.kt", l = {1392}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$schedulePokeRateLimitReset$1, reason: invalid class name and case insensitive filesystem */
    public final class C115551 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ long $delayMs;
        public int label;
        public final /* synthetic */ HatchConversationViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115551(long j, HatchConversationViewModel hatchConversationViewModel, HtJ<? super C115551> htJ) {
            super(2, htJ);
            this.$delayMs = j;
            this.this$0 = hatchConversationViewModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C115551(this.$delayMs, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HatchConversationUiState value;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                long j = this.$delayMs;
                this.label = 1;
                if (C7Bq.A01(j, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            this.this$0.pruneExpiredPokes(System.currentTimeMillis());
            HatchConversationViewModel hatchConversationViewModel = this.this$0;
            BLG<HatchConversationUiState> blg = hatchConversationViewModel._uiState;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, HatchConversationUiState.copy$default(value, false, false, false, false, false, false, 0, null, false, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, false, 0, false, hatchConversationViewModel.pokeTimestampsMs.size() >= 3, false, false, null, null, false, -536870913, 7, null)));
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C115551) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$seedFromOfflineCache$1", f = "HatchConversationViewModel.kt", l = {759, 775, 790}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$seedFromOfflineCache$1, reason: invalid class name and case insensitive filesystem */
    public final class C115561 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;

        public C115561(HtJ<? super C115561> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C115561 c115561 = HatchConversationViewModel.this.new C115561(htJ);
            c115561.L$0 = obj;
            return c115561;
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x019c  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x01b8 A[Catch: Exception -> 0x0298, CancellationException -> 0x02fa, all -> 0x02fc, TryCatch #3 {CancellationException -> 0x02fa, Exception -> 0x0298, blocks: (B:57:0x01b1, B:58:0x01b4, B:60:0x01b8, B:63:0x01cb, B:64:0x01d1, B:47:0x012e, B:48:0x0131, B:49:0x0135, B:51:0x0196, B:54:0x019e, B:19:0x0056, B:20:0x0059, B:22:0x0061, B:27:0x00bb, B:29:0x00c3, B:31:0x00cd, B:33:0x00d7, B:35:0x00dd, B:36:0x00e6, B:38:0x00f2, B:39:0x00f4, B:41:0x0100, B:65:0x01e4, B:10:0x0029, B:12:0x0031, B:14:0x003b, B:16:0x0045, B:70:0x023e), top: B:91:0x0012, outer: #2 }] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r52) {
            /*
                Method dump skipped, instructions count: 859
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.C115561.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C115561) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$sendMessageAfterAttachments$1", f = "HatchConversationViewModel.kt", l = {1306, 1308}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$sendMessageAfterAttachments$1, reason: invalid class name and case insensitive filesystem */
    public final class C115571 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchSendButtonOrigin $sendButtonOrigin;
        public final /* synthetic */ HoC $stagingJob;
        public Object L$0;
        public int label;
        public final /* synthetic */ HatchConversationViewModel this$0;

        @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$sendMessageAfterAttachments$1$1", f = "HatchConversationViewModel.kt", l = {1308}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$sendMessageAfterAttachments$1$1, reason: invalid class name and collision with other inner class name */
        public final class C01251 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super List<? extends HsJ<? extends Unit>>>, Object> {
            public final /* synthetic */ List<C27k<HsJ<Unit>>> $uploads;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C01251(List<? extends C27k<HsJ<Unit>>> list, HtJ<? super C01251> htJ) {
                super(2, htJ);
                this.$uploads = list;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C01251(this.$uploads, htJ);
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super List<? extends HsJ<? extends Unit>>> htJ) {
                return invoke2(c3ux, (HtJ<? super List<HsJ<Unit>>>) htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    List<C27k<HsJ<Unit>>> list = this.$uploads;
                    this.label = 1;
                    obj = EsN.A00(list, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                return obj;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(C3UX c3ux, HtJ<? super List<HsJ<Unit>>> htJ) {
                return new C01251(this.$uploads, htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115571(HoC hoC, HatchConversationViewModel hatchConversationViewModel, HatchSendButtonOrigin hatchSendButtonOrigin, HtJ<? super C115571> htJ) {
            super(2, htJ);
            this.$stagingJob = hoC;
            this.this$0 = hatchConversationViewModel;
            this.$sendButtonOrigin = hatchSendButtonOrigin;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C115571(this.$stagingJob, this.this$0, this.$sendButtonOrigin, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0012  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                X.Hji r5 = X.EnumC10460Hji.A02
                int r0 = r6.label
                r4 = 0
                r3 = 2
                r1 = 1
                if (r0 == 0) goto L25
                if (r0 == r1) goto L33
                if (r0 != r3) goto L50
                X.Hwg.A00(r7)
            L10:
                if (r7 != 0) goto L1c
                java.lang.String r1 = "HatchConversationVM"
                java.lang.String r0 = "Attachment upload timed out, leaving staged content in the composer"
                X.CFK.A06(r1, r0)
            L19:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            L1c:
                com.facebook.aura.conversation.viewmodel.HatchConversationViewModel r2 = r6.this$0
                com.facebook.aura.analytics.hatch.HatchSendButtonOrigin r1 = r6.$sendButtonOrigin
                r0 = 0
                r2.sendMessage(r0, r1)
                goto L19
            L25:
                X.Hwg.A00(r7)
                X.HoC r0 = r6.$stagingJob
                r6.label = r1
                java.lang.Object r0 = r0.APQ(r6)
                if (r0 != r5) goto L36
                return r5
            L33:
                X.Hwg.A00(r7)
            L36:
                com.facebook.aura.conversation.viewmodel.HatchConversationViewModel r0 = r6.this$0
                com.facebook.aura.conversation.viewmodel.HatchConversationAttachments r0 = r0.attachments
                java.util.List r0 = r0.uploadJobs()
                com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$sendMessageAfterAttachments$1$1 r2 = new com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$sendMessageAfterAttachments$1$1
                r2.<init>(r0, r4)
                r6.L$0 = r4
                r6.label = r3
                r0 = 30000(0x7530, double:1.4822E-319)
                java.lang.Object r7 = X.GAX.A01(r6, r2, r0)
                if (r7 != r5) goto L10
                return r5
            L50:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.C115571.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C115571) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$shareDocument$1", f = "HatchConversationViewModel.kt", l = {2121}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$shareDocument$1, reason: invalid class name and case insensitive filesystem */
    public final class C115581 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $fileName;
        public final /* synthetic */ String $relativePath;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$shareDocument$1$1", f = "HatchConversationViewModel.kt", l = {2122}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$shareDocument$1$1, reason: invalid class name and collision with other inner class name */
        public final class C01261 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
            public final /* synthetic */ Context $context;
            public final /* synthetic */ String $fileName;
            public final /* synthetic */ String $relativePath;
            public int label;
            public final /* synthetic */ HatchConversationViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01261(Context context, String str, String str2, HatchConversationViewModel hatchConversationViewModel, HtJ<? super C01261> htJ) {
                super(1, htJ);
                this.$context = context;
                this.$relativePath = str;
                this.$fileName = str2;
                this.this$0 = hatchConversationViewModel;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new C01261(this.$context, this.$relativePath, this.$fileName, this.this$0, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchFileActions hatchFileActions = HatchFileActions.INSTANCE;
                    Context context = this.$context;
                    HatchFileRef.Workspace workspace = new HatchFileRef.Workspace(this.$relativePath, this.$fileName);
                    AbstractC3358CGz abstractC3358CGz = this.this$0.userSession;
                    this.label = 1;
                    if (hatchFileActions.share(context, workspace, abstractC3358CGz, this) == enumC10460Hji) {
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
                return ((C01261) create(htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115581(String str, Context context, String str2, HtJ<? super C115581> htJ) {
            super(2, htJ);
            this.$fileName = str;
            this.$context = context;
            this.$relativePath = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationViewModel.this.new C115581(this.$fileName, this.$context, this.$relativePath, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchConversationViewModel hatchConversationViewModel = HatchConversationViewModel.this;
                HatchPendingFileActionType hatchPendingFileActionType = HatchPendingFileActionType.SHARE;
                String str = this.$fileName;
                C01261 c01261 = new C01261(this.$context, this.$relativePath, str, hatchConversationViewModel, null);
                this.label = 1;
                if (hatchConversationViewModel.withPendingFileAction(hatchPendingFileActionType, str, c01261, this) == enumC10460Hji) {
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
            return ((C115581) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$startAwaitFirstResponseWatchdog$1", f = "HatchConversationViewModel.kt", l = {1569}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$startAwaitFirstResponseWatchdog$1, reason: invalid class name and case insensitive filesystem */
    public final class C115591 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C115591(HtJ<? super C115591> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationViewModel.this.new C115591(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                this.label = 1;
                if (C7Bq.A01(30000L, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            HatchConversationViewModel.this.clearAwaitFirstResponse();
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchConversationViewModel.this.new C115591(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$stopDictation$1", f = "HatchConversationViewModel.kt", l = {1095, 1097, 1099}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$stopDictation$1, reason: invalid class name and case insensitive filesystem */
    public final class C115601 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$stopDictation$1$1", f = "HatchConversationViewModel.kt", l = {1095}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$stopDictation$1$1, reason: invalid class name and collision with other inner class name */
        public final class C01271 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
            public int label;
            public final /* synthetic */ HatchConversationViewModel this$0;

            @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$stopDictation$1$1$1", f = "HatchConversationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$stopDictation$1$1$1, reason: invalid class name and collision with other inner class name */
            public final class C01281 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Boolean>, Object> {
                public /* synthetic */ boolean Z$0;
                public int label;

                public C01281(HtJ<? super C01281> htJ) {
                    super(2, htJ);
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    C01281 c01281 = new C01281(htJ);
                    c01281.Z$0 = AnonymousClass001.A1X(obj);
                    return c01281;
                }

                @Override // X.AbstractC8884Fsp
                public final Object invokeSuspend(Object obj) {
                    boolean z = this.Z$0;
                    if (this.label != 0) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return Boolean.valueOf(!z);
                }

                @Override // X.G0V
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Boolean> htJ) {
                    return invoke(AnonymousClass001.A1X(bool), htJ);
                }

                public final Object invoke(boolean z, HtJ<? super Boolean> htJ) {
                    return ((C01281) AnonymousClass002.A0r(htJ, this, z)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01271(HatchConversationViewModel hatchConversationViewModel, HtJ<? super C01271> htJ) {
                super(2, htJ);
                this.this$0 = hatchConversationViewModel;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C01271(this.this$0, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    C1BN<Boolean> c1bn = this.this$0.dictation.isActive;
                    C01281 c01281 = new C01281(null);
                    this.label = 1;
                    obj = AbstractC9777Gfy.A00(this, c01281, c1bn);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                return obj;
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
                return new C01271(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C115601(HtJ<? super C115601> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationViewModel.this.new C115601(htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0067 A[RETURN] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                X.Hji r6 = X.EnumC10460Hji.A02
                int r0 = r7.label
                r5 = 3
                r4 = 2
                r3 = 1
                if (r0 == 0) goto L32
                if (r0 == r3) goto L48
                if (r0 == r4) goto L58
                if (r0 != r5) goto L68
                X.Hwg.A00(r8)
            L12:
                boolean r0 = X.AnonymousClass001.A1X(r8)
                if (r0 == 0) goto L2f
                com.facebook.aura.conversation.viewmodel.HatchConversationViewModel r0 = com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.this
                boolean r0 = r0.hasComposerText()
                if (r0 == 0) goto L2f
                com.facebook.aura.conversation.viewmodel.HatchConversationViewModel r0 = com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.this
                android.content.Context r0 = r0.context
                boolean r0 = X.HuJ.A00(r0)
                if (r0 == 0) goto L2f
                com.facebook.aura.conversation.viewmodel.HatchConversationViewModel r0 = com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.this
                r0.requestComposerFocus()
            L2f:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            L32:
                X.Hwg.A00(r8)
                com.facebook.aura.conversation.viewmodel.HatchConversationViewModel r1 = com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.this
                r0 = 0
                com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$stopDictation$1$1 r2 = new com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$stopDictation$1$1
                r2.<init>(r1, r0)
                r7.label = r3
                r0 = 10000(0x2710, double:4.9407E-320)
                java.lang.Object r8 = X.GAX.A01(r7, r2, r0)
                if (r8 != r6) goto L4b
                return r6
            L48:
                X.Hwg.A00(r8)
            L4b:
                if (r8 == 0) goto L2f
                r7.label = r4
                r0 = 500(0x1f4, double:2.47E-321)
                java.lang.Object r0 = X.C7Bq.A01(r0, r7)
                if (r0 != r6) goto L5b
                return r6
            L58:
                X.Hwg.A00(r8)
            L5b:
                com.facebook.aura.conversation.viewmodel.HatchConversationViewModel r0 = com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.this
                X.20Q<java.lang.Boolean> r0 = r0.canAnnounce
                r7.label = r5
                java.lang.Object r8 = X.AbstractC9777Gfy.A02(r0, r7)
                if (r8 != r6) goto L12
                return r6
            L68:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.C115601.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchConversationViewModel.this.new C115601(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$stopGeneration$1", f = "HatchConversationViewModel.kt", l = {1651}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$stopGeneration$1, reason: invalid class name and case insensitive filesystem */
    public final class C115611 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Function0<Unit> $liveSessionCleanup;
        public int label;

        /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$stopGeneration$1$1, reason: invalid class name and collision with other inner class name */
        public final class C01291 extends AbstractC7559F3s implements Function0<Unit> {
            public final /* synthetic */ Function0<Unit> $liveSessionCleanup;
            public final /* synthetic */ HatchConversationViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01291(HatchConversationViewModel hatchConversationViewModel, Function0<Unit> function0) {
                super(0);
                this.this$0 = hatchConversationViewModel;
                this.$liveSessionCleanup = function0;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.statusRepository.clearBusyActivity();
                Function0<Unit> function0 = this.$liveSessionCleanup;
                if (function0 != null) {
                    function0.invoke();
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115611(Function0<Unit> function0, HtJ<? super C115611> htJ) {
            super(2, htJ);
            this.$liveSessionCleanup = function0;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationViewModel.this.new C115611(this.$liveSessionCleanup, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchConversationViewModel hatchConversationViewModel = HatchConversationViewModel.this;
                HatchConversationRepository hatchConversationRepository = hatchConversationViewModel.repository;
                boolean z = AnonymousClass002.A0Z(hatchConversationViewModel).isCancelableActivity;
                C01291 c01291 = new C01291(HatchConversationViewModel.this, this.$liveSessionCleanup);
                this.label = 1;
                if (hatchConversationRepository.cancelGeneration(z, c01291, this) == enumC10460Hji) {
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
            return ((C115611) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel", f = "HatchConversationViewModel.kt", l = {2452, 2031, 2092}, m = "syncListItems", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$syncListItems$1, reason: invalid class name and case insensitive filesystem */
    public final class C115621 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C115621(HtJ<? super C115621> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchConversationViewModel.this.syncListItems(null, null, false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$unsendMessage$1", f = "HatchConversationViewModel.kt", l = {1992}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$unsendMessage$1, reason: invalid class name and case insensitive filesystem */
    public final class C115631 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $messageId;
        public final /* synthetic */ String $serverMessageId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115631(String str, String str2, HtJ<? super C115631> htJ) {
            super(2, htJ);
            this.$messageId = str;
            this.$serverMessageId = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationViewModel.this.new C115631(this.$messageId, this.$serverMessageId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM495unsendMessage0E7RQCE;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchConversationRepository hatchConversationRepository = HatchConversationViewModel.this.repository;
                String str = this.$messageId;
                String str2 = this.$serverMessageId;
                this.label = 1;
                objM495unsendMessage0E7RQCE = hatchConversationRepository.m495unsendMessage0E7RQCE(str, str2, this);
                if (objM495unsendMessage0E7RQCE == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM495unsendMessage0E7RQCE = AnonymousClass001.A0q(obj);
            }
            HatchConversationViewModel hatchConversationViewModel = HatchConversationViewModel.this;
            if (HsJ.A00(objM495unsendMessage0E7RQCE) != null) {
                hatchConversationViewModel._viewEffects.AhV(HatchConversationViewEffect.ShowUnsendFailed.INSTANCE);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C115631) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel", f = "HatchConversationViewModel.kt", l = {2108}, m = "withPendingFileAction", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$withPendingFileAction$1, reason: invalid class name and case insensitive filesystem */
    public final class C115641<T> extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C115641(HtJ<? super C115641> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchConversationViewModel.this.withPendingFileAction(null, null, null, this);
        }
    }

    private final void dispatchUserMessage(HatchSendMessage hatchSendMessage) {
        int[] iArr = {0, 1, 2};
        int i = 0;
        do {
            AnonymousClass801.A0X(iArr[i], this.context, this.userSession);
            i++;
        } while (i < 3);
        HatchSendMessage hatchSendMessageCopy$default = HatchSendMessage.copy$default(hatchSendMessage, null, null, null, null, null, null, null, null, null, true, null, null, null, 7679, null);
        AbstractC3358CGz abstractC3358CGz = this.userSession;
        String str = this.sessionId;
        if (this.isPrimaryThread) {
            str = null;
        }
        sendMessageAndFollow(HatchLiveSessionRoutingKt.resolveLiveSessionRoute(hatchSendMessageCopy$default, abstractC3358CGz, str));
    }

    public final void addPendingFileUris(List<HxE<String, String>> list) {
        C7384Etj.A0Y(list, 0);
        this.attachments.addPendingFileUris(list);
    }

    public final HoC addPendingImageUri(String str) {
        C7384Etj.A0Y(str, 0);
        return this.attachments.addPendingImageUris(Collections.singletonList(str));
    }

    public final HoC addPendingImageUris(List<String> list) {
        C7384Etj.A0Y(list, 0);
        return this.attachments.addPendingImageUris(list);
    }

    public final void copyImage(ContentItem contentItem) {
        ClipDescription primaryClipDescription;
        C7384Etj.A0Y(contentItem, 0);
        ClipboardManager clipboardManager = (ClipboardManager) this.context.getSystemService(ClipboardManager.class);
        AnonymousClass001.A1J(new C115331(contentItem, clipboardManager, (clipboardManager == null || (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) == null) ? null : Long.valueOf(primaryClipDescription.getTimestamp()), null), AEu.A00(this));
    }

    public final void deleteMediaUrl(String str) {
        C7384Etj.A0Y(str, 0);
        this.deletedMediaStore.hideForSession(str);
    }

    public final void downloadDocument(Context context, String str, String str2) {
        AnonymousClass005.A0x(context, str, str2);
        AnonymousClass001.A1J(new C115351(str2, context, str, null), AEu.A00(this));
    }

    public final void downloadDocumentAsPdf(Context context, String str, String str2, String str3, HatchDocumentType hatchDocumentType) {
        AnonymousClass005.A17(context, str, str2, str3, hatchDocumentType);
        AnonymousClass001.A1J(new C115361(str3, hatchDocumentType, context, str, str2, null), AEu.A00(this));
    }

    public final void downloadHtmlAsPdf(Context context, String str, String str2) {
        AnonymousClass005.A0x(context, str, str2);
        AnonymousClass001.A1J(new C115371(str2, context, str, null), AEu.A00(this));
    }

    public final void downloadHtmlFile(Context context, String str, String str2) {
        AnonymousClass005.A0x(context, str, str2);
        AnonymousClass001.A1J(new C115381(str2, context, str, null), AEu.A00(this));
    }

    public final int getWidgetHeight(String str) {
        C7384Etj.A0Y(str, 0);
        Integer num = this.widgetHeightCache.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final boolean isPublishableArtifact(String str) {
        C7384Etj.A0Y(str, 0);
        return C7BY.A0q(resolveProjectDir(str), FGI.A0U(CustomConnectorRegisterRepositoryKt.ROOT_PATH, HatchFileUIUtils.INSTANCE.getArtifactsPathSegment(), CustomConnectorRegisterRepositoryKt.ROOT_PATH), false);
    }

    public final void jumpToMessage(String str, Long l) {
        C7384Etj.A0Y(str, 0);
        HtJ htJA13 = AnonymousClass006.A13(this.jumpToMessageJob);
        this.jumpToMessageJob = AnonymousClass001.A11(new C115391(str, l, htJA13), AEu.A00(this));
    }

    public final void markProposalBuilding(String str) {
        C7384Etj.A0Y(str, 0);
        if (ConversationInputBlocks.INSTANCE.isBlocked(this.userSession)) {
            return;
        }
        this.repository.markProposalBuilding(str);
    }

    public final void onAttachmentsPicked(List<? extends Uri> list) {
        C7384Etj.A0Y(list, 0);
        this.attachments.onAttachmentsPicked(list);
    }

    public final void onFirstTokenRendered(String str) {
        C7384Etj.A0Y(str, 0);
        this.qplLogger.onFirstTokenRendered(str);
    }

    public final void onWidgetSendMessage(HatchSendMessage hatchSendMessage) {
        C7384Etj.A0Y(hatchSendMessage, 0);
        AbstractC3358CGz abstractC3358CGz = this.userSession;
        String str = this.sessionId;
        if (this.isPrimaryThread) {
            str = null;
        }
        sendMessageAndFollow(HatchLiveSessionRoutingKt.resolveLiveSessionRoute(hatchSendMessage, abstractC3358CGz, str));
    }

    public final ArtifactShareSnapshot peekArtifactShareSnapshot(String str) {
        C7384Etj.A0Y(str, 0);
        String strResolveProjectDir = resolveProjectDir(str);
        ArtifactDeploySnapshot artifactDeploySnapshotPeekAll = this.deployHolder.peekAll(strResolveProjectDir);
        HatchFileOperations.FetchArtifactUrlResult fetchArtifactUrlResultPeekCachedStatus = this.deployHolder.peekCachedStatus(strResolveProjectDir);
        String str2 = null;
        HatchFileOperations.FetchArtifactUrlResult.Success success = fetchArtifactUrlResultPeekCachedStatus instanceof HatchFileOperations.FetchArtifactUrlResult.Success ? (HatchFileOperations.FetchArtifactUrlResult.Success) fetchArtifactUrlResultPeekCachedStatus : null;
        String str3 = artifactDeploySnapshotPeekAll.publishedUrl;
        if (str3 != null) {
            str2 = str3;
        } else if (success != null) {
            str2 = success.url;
        }
        return new ArtifactShareSnapshot(str2, artifactDeploySnapshotPeekAll.edited);
    }

    public final void prefetchArtifactStatus(String str) {
        C7384Etj.A0Y(str, 0);
        String strResolveProjectDir = resolveProjectDir(str);
        if (C7BY.A0q(strResolveProjectDir, FGI.A0U(CustomConnectorRegisterRepositoryKt.ROOT_PATH, HatchFileUIUtils.INSTANCE.getArtifactsPathSegment(), CustomConnectorRegisterRepositoryKt.ROOT_PATH), false)) {
            ArtifactDeploySnapshot artifactDeploySnapshotPeekAll = this.deployHolder.peekAll(strResolveProjectDir);
            String str2 = artifactDeploySnapshotPeekAll.publishedUrl;
            if (str2 != null) {
                this.deployHolder.cacheStatus(strResolveProjectDir, new HatchFileOperations.FetchArtifactUrlResult.Success(str2, null));
                return;
            }
            if (artifactDeploySnapshotPeekAll.unpublished || artifactDeploySnapshotPeekAll.edited) {
                this.deployHolder.invalidateCachedStatus(strResolveProjectDir);
            }
            if (this.deployHolder.peekCachedStatus(strResolveProjectDir) == null && this.deployHolder.reserveFetch(strResolveProjectDir)) {
                AnonymousClass001.A1I(AnonymousClass001.A0y(), new C115521(strResolveProjectDir, this, null), AEu.A00(this));
            }
        }
    }

    public final void removeLinkAttachmentUrl(String str) {
        HatchConversationUiState value;
        HatchConversationUiState hatchConversationUiState;
        C7384Etj.A0Y(str, 0);
        BLG<HatchConversationUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            hatchConversationUiState = value;
        } while (!blg.A6e(value, HatchConversationUiState.copy$default(hatchConversationUiState, false, false, false, false, false, false, 0, null, false, null, null, null, null, AGI.A07(AbstractC0878AGe.A0b(hatchConversationUiState.linkAttachmentUrls, str)), null, false, false, false, null, null, null, null, null, null, null, null, false, 0, false, false, false, false, null, null, false, -8193, 7, null)));
    }

    public final void replaceLinkAttachmentUrls(List<String> list) {
        HatchConversationUiState value;
        C7384Etj.A0Y(list, 0);
        BLG<HatchConversationUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, HatchConversationUiState.copy$default(value, false, false, false, false, false, false, 0, null, false, null, null, null, null, AGI.A07(list), null, false, false, false, null, null, null, null, null, null, null, null, false, 0, false, false, false, false, null, null, false, -8193, 7, null)));
    }

    public final HoC replaceLinkImageUris(List<String> list) {
        C7384Etj.A0Y(list, 0);
        return this.attachments.replaceLinkImageUris(list);
    }

    public final void requestComposerLaunch(ComposerLaunchAction composerLaunchAction) {
        HatchConversationUiState value;
        C7384Etj.A0Y(composerLaunchAction, 0);
        BLG<HatchConversationUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, HatchConversationUiState.copy$default(value, false, false, false, false, false, false, 0, null, false, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, false, 0, false, false, false, false, composerLaunchAction, null, false, -1, 6, null)));
    }

    public final String resolveDocumentRelativePath(String str) {
        C7384Etj.A0Y(str, 0);
        return resolveRelativePath(str);
    }

    public final void retrySendMessage(String str) {
        HatchMessage next;
        String str2;
        C7384Etj.A0Y(str, 0);
        if (ConversationInputBlocks.INSTANCE.isBlocked(this.userSession)) {
            return;
        }
        requestScrollToBottom();
        this.repository.retrySendMessage(str, isUnsentNewThread());
        Iterator<HatchMessage> it = C1BN.A00(this).messages.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (str.equals(next.id)) {
                    break;
                }
            }
        }
        HatchMessage hatchMessage = next;
        if (hatchMessage == null || (str2 = hatchMessage.requestId) == null) {
            return;
        }
        AnonymousClass002.A1I(this.sentRequestId, str2);
    }

    public final void retryUpload(String str) {
        C7384Etj.A0Y(str, 0);
        this.attachments.retryUpload(str);
    }

    public final void saveDocumentToGoogleDrive(Context context, String str, String str2) {
        AnonymousClass005.A0x(context, str, str2);
        AnonymousClass001.A1J(new C115541(str2, context, str, null), AEu.A00(this));
    }

    public final void sendMessageAfterAttachments(HoC hoC, HatchComposerEntryPoint hatchComposerEntryPoint) {
        HatchSendButtonOrigin hatchSendButtonOrigin;
        if (hatchComposerEntryPoint != null) {
            boolean z = this.isPrimaryThread;
            String str = this.sessionId;
            if (z) {
                str = null;
            }
            hatchSendButtonOrigin = new HatchSendButtonOrigin(z, str, hatchComposerEntryPoint, null);
        } else {
            hatchSendButtonOrigin = null;
        }
        if (hoC == null) {
            sendMessage(false, hatchSendButtonOrigin);
        } else {
            AnonymousClass001.A1J(new C115571(hoC, this, hatchSendButtonOrigin, null), AEu.A00(this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void sendReplyPrompt(ReplyPrompt replyPrompt) {
        boolean z = false;
        C7384Etj.A0Y(replyPrompt, 0);
        if (AnonymousClass002.A0Z(this).isAwaitingApproval) {
            setReplyContext(replyPrompt.replyContext);
            if (hasComposerText()) {
                return;
            }
            setComposerText(replyPrompt.text);
            return;
        }
        HatchSendMessage hatchSendMessage = new HatchSendMessage(replyPrompt.text, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, replyPrompt.replyContext.attribution, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 8158, 0 == true ? 1 : 0);
        markAwaitingResponse(false);
        this.qplLogger.onOptimisticInserted(beginUserSendTrace(hatchSendMessage).deliveryInstanceKey);
        dispatchUserMessage(hatchSendMessage);
    }

    public final void setComposerText(String str) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass004.A1D(false, this._isDraftDictated);
        AbstractC1903AtO.A00(this.composerTextState, str);
    }

    public final void setMessageContext(String str, Map<String, String> map, String str2) {
        HatchConversationUiState value;
        HatchSendMessage value2;
        boolean zA1a = AnonymousClass002.A1a(str, map);
        BLG<HatchConversationUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, HatchConversationUiState.copy$default(value, false, false, false, false, false, false, 0, null, false, null, null, null, null, null, null, false, false, false, null, null, null, new MessageContext(str, str2), null, null, null, null, false, 0, false, false, false, false, null, null, false, -2097153, 7, null)));
        BLG<HatchSendMessage> blg2 = this._pendingMessage;
        do {
            value2 = blg2.getValue();
        } while (!blg2.A6e(value2, HatchSendMessage.copy$default(value2, null, null, null, null, null, null, map, null, null, false, null, null, null, 8127, null)));
        persistComposerDraft("", zA1a);
    }

    public final void setMessageMetadata(Map<String, String> map) {
        HatchSendMessage value;
        C7384Etj.A0Y(map, 0);
        BLG<HatchSendMessage> blg = this._pendingMessage;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, HatchSendMessage.copy$default(value, null, null, null, null, null, null, map, null, null, false, null, null, null, 8127, null)));
    }

    public final void setPendingEntryPoint(HatchComposerEntryPoint hatchComposerEntryPoint, String str) {
        C7384Etj.A0Y(hatchComposerEntryPoint, 0);
        this.pendingEntryPoint = hatchComposerEntryPoint;
        this.pendingEntryPointOriginId = str;
    }

    public final void setPendingExtraParams(Map<String, ? extends Object> map) {
        HatchSendMessage value;
        HatchSendMessage hatchSendMessage;
        Map mapA0E;
        C7384Etj.A0Y(map, 0);
        if (map.isEmpty()) {
            return;
        }
        BLG<HatchSendMessage> blg = this._pendingMessage;
        do {
            value = blg.getValue();
            hatchSendMessage = value;
            mapA0E = hatchSendMessage.extraParams;
            if (mapA0E == null) {
                mapA0E = AGH.A0E();
            }
        } while (!blg.A6e(value, HatchSendMessage.copy$default(hatchSendMessage, null, null, null, null, null, null, null, AGH.A02(mapA0E, map), null, false, null, null, null, 8063, null)));
    }

    public final void setWidgetHeight(String str, int i) {
        C7384Etj.A0Y(str, 0);
        this.widgetHeightCache.put(str, Integer.valueOf(i));
        LinkedHashMap<String, Integer> linkedHashMap = this.widgetHeightCache;
        if (linkedHashMap.size() > this.maxWidgetHeightCacheSize) {
            Set<String> setKeySet = linkedHashMap.keySet();
            C7384Etj.A0U(setKeySet);
            linkedHashMap.remove(AbstractC0878AGe.A0B(setKeySet));
        }
    }

    public final void shareDocument(Context context, String str, String str2) {
        AnonymousClass005.A0x(context, str, str2);
        AnonymousClass001.A1J(new C115581(str2, context, str, null), AEu.A00(this));
    }

    public final void showSourcesBottomSheet(HatchSearchResultData hatchSearchResultData, HatchCitationAnalytics hatchCitationAnalytics) {
        HatchConversationUiState value;
        C7384Etj.A0Y(hatchSearchResultData, 0);
        BLG<HatchConversationUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, HatchConversationUiState.copy$default(value, false, false, false, false, false, false, 0, null, false, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, hatchSearchResultData, hatchCitationAnalytics, false, 0, false, false, false, false, null, null, false, -50331649, 7, null)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationViewModel(Context context, AbstractC3358CGz abstractC3358CGz, String str, boolean z, boolean z2) {
        HatchConversationRepository hatchConversationRepository;
        Object value;
        boolean z3 = false;
        boolean zA1a = AnonymousClass002.A1a(context, abstractC3358CGz);
        C7384Etj.A0Y(str, 2);
        this.context = context;
        this.userSession = abstractC3358CGz;
        this.sessionId = str;
        this.allowTypingCursorWhenDisconnected = z;
        this.isNewThread = z2;
        this.deployHolder = ArtifactDeployHolder.Companion.getInstance(abstractC3358CGz);
        this.confidentialSessionGate = ConfidentialSessionGate.Companion.getInstance(abstractC3358CGz);
        this.instanceId = AnonymousClass002.A0k();
        boolean zEquals = str.equals("primary_session_id");
        this.isPrimaryThread = zEquals;
        boolean zIsMainChatId = isMainChatId();
        this.opensMainChat = zIsMainChatId;
        if (zEquals) {
            hatchConversationRepository = HatchPrimaryConversationRepository.Companion.getInstance(context, abstractC3358CGz).repository;
        } else if (str.equals(HatchConversationConstants.ASSIST_CONVERSATION_SESSION_ID)) {
            hatchConversationRepository = new HatchConversationRepository(context, abstractC3358CGz, null, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 40, null == true ? 1 : 0);
        } else {
            boolean z4 = !zIsMainChatId;
            hatchConversationRepository = new HatchConversationRepository(context, abstractC3358CGz, str, null, z4, z4, 8, null == true ? 1 : 0);
        }
        this.repository = hatchConversationRepository;
        this.qplLogger = hatchConversationRepository.qplLogger;
        HatchStatusRepository hatchStatusRepository = new HatchStatusRepository(abstractC3358CGz, normalizedSessionId());
        this.statusRepository = hatchStatusRepository;
        AnonymousClass602 anonymousClass602A00 = C4o7.A00(HatchConversationViewModel$awaitingApproval$2.INSTANCE, GDB.A01(C3rb.A03(new HatchConversationViewModel$awaitingApproval$1(this, null), HatchAgentPermissionsRepository.Companion.getInstance(abstractC3358CGz).pendingApprovals, HatchPrimarySessionRepository.Companion.getInstance(abstractC3358CGz).primarySessionId)));
        BLL bllA00 = AEu.A00(this);
        C3Ej c3Ej = C3Ek.A00;
        this.awaitingApproval = AnonymousClass441.A00(false, bllA00, anonymousClass602A00, c3Ej);
        this.scrollController = HatchConversationScrollController.Companion.getInstance(abstractC3358CGz);
        this.composerDrafts$delegate = AbstractC5321DgF.A03(new HatchConversationViewModel$composerDrafts$2(this));
        this.composerRestores$delegate = new ParcelableSnapshotMutableIntState(0);
        C9286GCn c9286GCn = new C9286GCn(new HatchSendMessage(readPersistedComposerDraft(), null, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, z3, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 8190, null == true ? 1 : 0));
        this._pendingMessage = c9286GCn;
        this.composerTextState = new C1890At8(((HatchSendMessage) c9286GCn.getValue()).text);
        this._isDraftDictated = AnonymousClass002.A0v(readPersistedDraftDictated());
        Integer num = C79.A00;
        C9290GCr c9290GCr = new C9290GCr(num, 0, zA1a ? 1 : 0);
        this._viewEffects = c9290GCr;
        this.viewEffects = c9290GCr;
        int i = -1;
        GCV gcvA00 = AbstractC10623Hzj.A00(num, -1);
        this.scrollToBottomRequestChannel = gcvA00;
        this.scrollToBottomRequests = Hu1.A01(gcvA00);
        C9290GCr c9290GCr2 = new C9290GCr(num, 0, zA1a ? 1 : 0);
        this._composerHintAnimation = c9290GCr2;
        this.composerHintAnimation = c9290GCr2;
        ComposerDictationController composerDictationController = new ComposerDictationController(abstractC3358CGz, context, AEu.A00(this), str.equals(HatchConversationConstants.ASSIST_CONVERSATION_SESSION_ID) ? "assist" : "chat", new DictationHost() { // from class: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$dictation$1
            @Override // com.facebook.aura.composer.dictation.DictationHost
            public void setComposerText(String str2) {
                C7384Etj.A0Y(str2, 0);
                AbstractC1903AtO.A00(this.this$0.composerTextState, str2);
            }

            @Override // com.facebook.aura.composer.dictation.DictationHost
            public void clearDraft() {
                HatchSendMessage value2;
                this.this$0.setComposerText("");
                BLG<HatchSendMessage> blg = this.this$0._pendingMessage;
                do {
                    value2 = blg.getValue();
                } while (!blg.A6e(value2, HatchSendMessage.copy$default(value2, "", null, null, null, null, null, null, null, null, false, null, null, null, 8190, null)));
                this.this$0.persistComposerDraft("", true);
                AnonymousClass003.A14(this.this$0._isDraftDictated, false);
            }

            @Override // com.facebook.aura.composer.dictation.DictationHost
            public String getComposerText() {
                return AnonymousClass003.A0h(this.this$0);
            }

            @Override // com.facebook.aura.composer.dictation.DictationHost
            public String getPendingMessageText() {
                return this.this$0._pendingMessage.getValue().text;
            }

            @Override // com.facebook.aura.composer.dictation.DictationHost
            public void onCaptureStarted() {
                this.this$0._viewEffects.AhV(HatchConversationViewEffect.DictationCaptureStarted.INSTANCE);
            }

            @Override // com.facebook.aura.composer.dictation.DictationHost
            public void onDictatedTextKept() {
                AnonymousClass004.A1D(true, this.this$0._isDraftDictated);
            }

            @Override // com.facebook.aura.composer.dictation.DictationHost
            public void onDictatedTextLanded() {
                this.this$0._viewEffects.AhV(HatchConversationViewEffect.DictatedTextLanded.INSTANCE);
            }

            @Override // com.facebook.aura.composer.dictation.DictationHost
            public void onMicSilenced() {
                this.this$0._viewEffects.AhV(HatchConversationViewEffect.ShowDictationMicSilenced.INSTANCE);
            }

            @Override // com.facebook.aura.composer.dictation.DictationHost
            public void onNoSpeech() {
                this.this$0._viewEffects.AhV(HatchConversationViewEffect.ShowDictationNoSpeech.INSTANCE);
            }

            @Override // com.facebook.aura.composer.dictation.DictationHost
            public boolean send() {
                return this.this$0.sendMessage(true, null);
            }

            @Override // com.facebook.aura.composer.dictation.DictationHost
            public void onDictationFailed(boolean z5) {
                boolean zA0j = C7BY.A0j(getComposerText());
                boolean z6 = !zA0j;
                C3Em<HatchConversationViewEffect> c3Em = this.this$0._viewEffects;
                int i2 = R.string._name_removed__res_0x7f120857;
                if (z5) {
                    i2 = R.string._name_removed__res_0x7f120858;
                }
                c3Em.AhV(new HatchConversationViewEffect.ShowDictationFailed(z6, i2));
                if (zA0j) {
                    return;
                }
                this.this$0.requestComposerFocus();
            }
        });
        this.dictation = composerDictationController;
        this.deletedMediaStore = HatchDeletedMediaStore.Companion.getInstance(abstractC3358CGz);
        this.offlineRepo = HatchOfflineConversationRepository.Companion.getInstance(abstractC3358CGz);
        this.threadsRepository$delegate = AbstractC5321DgF.A03(new HatchConversationViewModel$threadsRepository$2(this));
        this.historySource = HistorySource.ROOM;
        this.roomMessages = C0881AGi.A00;
        this.syncMutex = new C9258GBl();
        HrH hrH = HwN.A01;
        C9286GCn c9286GCn2 = new C9286GCn(hrH);
        this._highlightedMessageId = c9286GCn2;
        this.highlightedMessageId = c9286GCn2;
        C9286GCn c9286GCn3 = new C9286GCn(hrH);
        this._loadedSideChatInfo = c9286GCn3;
        this.loadedSideChatInfo = c9286GCn3;
        C9286GCn c9286GCn4 = new C9286GCn(new HatchConversationUiState(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, ConversationInputBlocks.INSTANCE.isBlocked(abstractC3358CGz), i, 3, null == true ? 1 : 0));
        this._uiState = c9286GCn4;
        this.uiState = c9286GCn4;
        this._listItems = new SnapshotStateList();
        C3Pi c3PiA00 = AnonymousClass441.A00(AHI.A01, AEu.A00(this), C6v3.A01(new HatchConversationViewModel$listItems$1(this)), c3Ej);
        this.listItems = c3PiA00;
        this.latestWidgetIdsByKind = AnonymousClass441.A00(AGH.A0E(), AEu.A00(this), new HatchConversationViewModel$special$$inlined$map$1(c3PiA00), c3Ej);
        this.isOnScreen = new C9286GCn(false);
        this.identityProvider = HatchIdentityProvider.Companion.getInstance(abstractC3358CGz);
        AnonymousClass603 anonymousClass603A00 = C3rb.A00(new HatchConversationViewModel$canAnnounce$1(null), composerDictationController.isActive, LiveSessions.INSTANCE.isActive(abstractC3358CGz), Microphone.INSTANCE.holder(abstractC3358CGz));
        this.canAnnounce = anonymousClass603A00;
        C9286GCn c9286GCn5 = new C9286GCn(hrH);
        this.sentRequestId = c9286GCn5;
        C3Pi c3PiA002 = AnonymousClass441.A00(null, AEu.A00(this), AbstractC05623ug.A00(AuraDispatchers.INSTANCE.m764default(), new C10649I0t(C3rb.A03(new HatchConversationViewModel$sentTurn$1(null), hatchConversationRepository.conversationState, c9286GCn5), 2)), new C3Es(0L, 0L));
        this.sentTurn = c3PiA002;
        this.announcement = HatchFinishedRepliesKt.announcements(c3PiA00, c9286GCn5, c3PiA002, anonymousClass603A00, new HatchConversationViewModel$announcement$1(this), new HatchConversationViewModel$special$$inlined$map$2(new HatchConversationViewModel$special$$inlined$filter$1(hatchStatusRepository.agentActivity)), hatchConversationRepository.sendFailed);
        this.attachments = new HatchConversationAttachments(context, abstractC3358CGz, str, zEquals, AEu.A00(this), c9286GCn, c9286GCn4, c9290GCr);
        this.listMapper = new HatchConversationListMapper(context, abstractC3358CGz, str, normalizedSessionId(), hatchConversationRepository, z, z2);
        this.composerRegistration = HatchConversationComposerController.Companion.getInstance(abstractC3358CGz).register(str, new HatchConversationViewModel$composerRegistration$1(this), new HatchConversationViewModel$composerRegistration$2(this), new HatchConversationViewModel$composerRegistration$3(this));
        BLL bllA002 = AEu.A00(this);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
        C6ys c6ys = C6ys.A00;
        GAo.A02(num, c6ys, new AnonymousClass4(null), AnonymousClass001.A0e(this, num, c6ys, new AnonymousClass3(null), AnonymousClass001.A0e(this, num, c6ys, new AnonymousClass2(null), AnonymousClass001.A0e(this, num, c6ys, anonymousClass1, bllA002))));
        if (!zEquals) {
            GAo.A02(num, c6ys, new AnonymousClass5(null), AEu.A00(this));
        }
        GAo.A02(num, c6ys, new AnonymousClass14(null), AnonymousClass001.A0e(this, num, c6ys, new AnonymousClass13(null), AnonymousClass001.A0e(this, num, c6ys, new AnonymousClass12(null), AnonymousClass001.A0e(this, num, c6ys, new AnonymousClass11(null), AnonymousClass001.A0e(this, num, c6ys, new AnonymousClass10(null), AnonymousClass001.A0e(this, num, c6ys, new AnonymousClass9(null), AnonymousClass001.A0e(this, num, c6ys, new AnonymousClass8(null), AnonymousClass001.A0e(this, num, c6ys, new AnonymousClass7(null), AnonymousClass001.A0e(this, num, c6ys, new AnonymousClass6(null), AEu.A00(this))))))))));
        observeComposerDraftPersistence();
        prewarmComposerDrafts();
        if (HatchConversationConstants.ASSIST_CONVERSATION_SESSION_ID.equals(str)) {
            do {
                value = c9286GCn4.getValue();
            } while (!c9286GCn4.A6e(value, HatchConversationUiState.copy$default((HatchConversationUiState) value, false, false, false, false, false, false, 0, null, false, null, null, null, null, null, null, zA1a, false, false, null, null, null, null, null, null, null, null, false, 0, false, false, false, false, null, null, false, -32769, 7, null)));
        } else {
            if (!zEquals) {
                GAo.A02(num, c6ys, new AnonymousClass15(null), AEu.A00(this));
            }
            seedFromOfflineCache();
            observeOfflinePersistence();
            observeBackgroundFlush();
        }
        this.pokeTimestampsMs = new AIG<>();
        this.widgetHeightCache = new LinkedHashMap<>(16, 0.75f, zA1a);
        this.maxWidgetHeightCacheSize = 100;
        this.genericListSelections = new GenericListSelectionDelegate(AEu.A00(this), this.repository, new HatchConversationViewModel$genericListSelections$1(this));
        this.imageCopy = SingleFlightKt.SingleFlight(this.userSession, OnDuplicateCall.Cancel.INSTANCE, false);
    }

    public static /* synthetic */ void addPendingFileUri$default(HatchConversationViewModel hatchConversationViewModel, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "application/octet-stream";
        }
        hatchConversationViewModel.addPendingFileUri(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.perf.HatchConversationQplLogger.PendingUserSendTrace beginUserSendTrace(com.facebook.aura.model.HatchSendMessage r6) {
        /*
            r5 = this;
            com.facebook.aura.perf.HatchConversationQplLogger r5 = r5.qplLogger
            java.lang.String r4 = r6.requestId
            java.lang.String r0 = r6.text
            int r3 = r0.length()
            java.util.List<java.lang.String> r0 = r6.imageUris
            int r2 = r0.size()
            java.util.List<com.facebook.aura.model.HatchPendingFile> r0 = r6.fileUris
            int r0 = r0.size()
            int r2 = r2 + r0
            com.facebook.aura.model.PendingDiscussionItem r0 = r6.pendingDiscussionItem
            if (r0 == 0) goto L20
            android.graphics.Bitmap r1 = r0.previewImageData
            r0 = 1
            if (r1 != 0) goto L21
        L20:
            r0 = 0
        L21:
            int r2 = r2 + r0
            com.facebook.aura.perf.HatchConversationQplLogger$PendingUserSendTrace r0 = r5.beginUserSend(r4, r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.beginUserSendTrace(com.facebook.aura.model.HatchSendMessage):com.facebook.aura.perf.HatchConversationQplLogger$PendingUserSendTrace");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearAwaitFirstResponse() {
        HatchConversationUiState value;
        HoC hoC = this.awaitFirstResponseJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.awaitFirstResponseJob = null;
        if (AnonymousClass002.A0Z(this).isAwaitingFirstResponse) {
            BLG<HatchConversationUiState> blg = this._uiState;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, HatchConversationUiState.copy$default(value, false, false, false, false, false, false, 0, null, false, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, false, 0, false, false, false, false, null, null, false, -5, 7, null)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int composerHintResId(HatchGatewayConnectionState hatchGatewayConnectionState) {
        return ((hatchGatewayConnectionState instanceof HatchGatewayConnectionState.Connected) || HatchUtil.INSTANCE.isOfflineMessageQueueEnabled()) ? this.confidentialSessionGate.isConfidentialVm() ? R.string._name_removed__res_0x7f12071a : R.string.composer_hint : R.string._name_removed__res_0x7f120719;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object deleteOfflineMessagesSafely(java.util.List<java.lang.Long> r8, X.HtJ<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.C115341
            if (r0 == 0) goto L1e
            r6 = r9
            com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$deleteOfflineMessagesSafely$1 r6 = (com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.C115341) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L2d
            if (r0 != r4) goto L28
            goto L24
        L1e:
            com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$deleteOfflineMessagesSafely$1 r6 = new com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$deleteOfflineMessagesSafely$1
            r6.<init>(r9)
            goto L12
        L24:
            X.Hwg.A00(r1)     // Catch: java.util.concurrent.CancellationException -> L4a java.lang.Exception -> L4c
            goto L54
        L28:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2d:
            X.Hwg.A00(r1)
            com.facebook.aura.conversation.repo.HatchConversationState r0 = X.C1BN.A00(r7)
            java.lang.String r3 = r0.vmId
            if (r3 == 0) goto L54
            com.facebook.aura.conversation.offline.HatchOfflineConversationRepository r2 = r7.offlineRepo     // Catch: java.util.concurrent.CancellationException -> L4a java.lang.Exception -> L4c
            java.lang.String r1 = r7.sessionId     // Catch: java.util.concurrent.CancellationException -> L4a java.lang.Exception -> L4c
            r0 = 0
            r6.L$0 = r0     // Catch: java.util.concurrent.CancellationException -> L4a java.lang.Exception -> L4c
            r6.L$1 = r0     // Catch: java.util.concurrent.CancellationException -> L4a java.lang.Exception -> L4c
            r6.label = r4     // Catch: java.util.concurrent.CancellationException -> L4a java.lang.Exception -> L4c
            java.lang.Object r0 = r2.deleteMessages(r3, r1, r8, r6)     // Catch: java.util.concurrent.CancellationException -> L4a java.lang.Exception -> L4c
            if (r0 != r5) goto L54
            return r5
        L4a:
            r0 = move-exception
            throw r0
        L4c:
            r2 = move-exception
            java.lang.String r1 = "Offline conversation delete failed"
            java.lang.String r0 = "HatchConversationVM"
            X.CFK.A08(r0, r1, r2)
        L54:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.deleteOfflineMessagesSafely(java.util.List, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void fulfillWidgetRequest(com.facebook.aura.conversation.api.ConversationWidgetRequest r4) {
        /*
            r3 = this;
            X.1BN<X.AHD<com.facebook.aura.conversation.viewmodel.HatchConversationListItem>> r0 = r3.listItems
            java.lang.Object r1 = r0.getValue()
            java.util.List r1 = (java.util.List) r1
            java.lang.String r0 = r4.widgetId
            com.facebook.aura.model.HatchWidget r2 = com.facebook.aura.conversation.viewmodel.HatchConversationViewModelKt.locateWidget(r1, r0)
            if (r2 == 0) goto L27
            X.1BN<java.util.Map<java.lang.String, java.lang.String>> r0 = r3.latestWidgetIdsByKind
            java.lang.Object r1 = r0.getValue()
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r0 = r2.kind
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r0 = r4.widgetId
            boolean r1 = X.C7384Etj.areEqual(r1, r0)
            r0 = 1
            if (r1 != 0) goto L28
        L27:
            r0 = 0
        L28:
            r4.respond(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.fulfillWidgetRequest(com.facebook.aura.conversation.api.ConversationWidgetRequest):void");
    }

    public static /* synthetic */ void getAwaitingApproval$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HatchComposerDraftStore getComposerDrafts() {
        return (HatchComposerDraftStore) this.composerDrafts$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HatchThreadsRepository getThreadsRepository() {
        return (HatchThreadsRepository) this.threadsRepository$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hasNetworkContent(HatchConversationState hatchConversationState) {
        return (hatchConversationState.history.isEmpty() && hatchConversationState.messages.isEmpty() && hatchConversationState.historyLoadingState != HistoryLoadingState.SUCCESS) ? false : true;
    }

    private final boolean isHtml(String str, String str2, String str3) {
        return HatchFileUIUtils.FileExtensions.INSTANCE.isHtml(str, str2, str3);
    }

    private final boolean isMainChatId() {
        return C7384Etj.areEqual(HatchPrimarySessionRepository.Companion.getInstance(this.userSession).primarySessionId.getValue(), this.sessionId);
    }

    public static /* synthetic */ void jumpToMessage$default(HatchConversationViewModel hatchConversationViewModel, String str, Long l, int i, Object obj) {
        if ((i & 2) != 0) {
            l = null;
        }
        hatchConversationViewModel.jumpToMessage(str, l);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.String] */
    private final G0U<String, Unit> lateTranscriptDraftSaver() {
        if (!this.dictation.isFinalizing() || !shouldPersistComposerDraft() || AnonymousClass002.A0Z(this).messageContext != null) {
            return null;
        }
        HatchComposerDraftStore composerDrafts = getComposerDrafts();
        HatchConversationComposerController companion = HatchConversationComposerController.Companion.getInstance(this.userSession);
        String str = this.sessionId;
        C10543Hqv c10543Hqv = new C10543Hqv();
        ?? CachedText = composerDrafts.cachedText(str);
        if (CachedText == 0) {
            return null;
        }
        c10543Hqv.element = CachedText;
        return new C115401(composerDrafts, str, c10543Hqv, companion);
    }

    private final void loadMoreRoomHistory() {
        Long l;
        HatchConversationUiState value;
        if (this.roomPaginating || !this.roomHasMore || (l = this.roomOldestSeq) == null) {
            return;
        }
        long jLongValue = l.longValue();
        this.roomPaginating = true;
        BLG<HatchConversationUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, HatchConversationUiState.copy$default(value, false, false, false, false, false, false, 0, null, false, null, null, null, null, null, HistoryLoadingState.LOADING, false, false, false, null, null, null, null, null, null, null, null, false, 0, false, false, false, false, null, null, false, -16385, 7, null)));
        AnonymousClass001.A1J(new C115422(jLongValue, null), AEu.A00(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logCachedHistoryIfShown() {
        if (this.cachedHistoryLogPending && AnonymousClass003.A1Z(this.isOnScreen)) {
            this.cachedHistoryLogPending = false;
            if (this.historySource == HistorySource.ROOM) {
                HatchStartupQpl.Companion companion = HatchStartupQpl.Companion;
                companion.markerPoint(HatchStartupPoints.CACHED_HISTORY_LOADED);
                companion.markerAnnotate(HatchStartupPoints.ANNOTATION_SERVED_FROM_CACHE, true);
                Integer num = this.cachedHistoryPushAgeMs;
                if (num != null) {
                    int iIntValue = num.intValue();
                    companion.markerAnnotate(HatchStartupPoints.ANNOTATION_PREFETCH_WRITER, HatchStartupPoints.PREFETCH_WRITER_PUSH);
                    companion.markerAnnotate(HatchStartupPoints.ANNOTATION_PREFETCH_AGE_MS, iIntValue);
                }
            }
        }
    }

    private final void markAwaitingResponse(boolean z) {
        HatchConversationUiState value;
        BLG<HatchConversationUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, HatchConversationUiState.copy$default(value, false, true, true, false, false, false, 0, null, false, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, false, 0, false, false, false, false, null, null, false, z ? -3145735 : -7, 7, null)));
        startAwaitFirstResponseWatchdog();
        this.isExpectingResponse = true;
    }

    private final String normalizedSessionId() {
        String str = this.sessionId;
        if ("primary_session_id".equals(str) || HatchConversationConstants.ASSIST_CONVERSATION_SESSION_ID.equals(str)) {
            return null;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object persistOfflineMessagesSafely(java.util.List<com.facebook.aura.model.HatchMessage> r11, X.HtJ<? super kotlin.Unit> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.C115491
            if (r0 == 0) goto L1e
            r9 = r12
            com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$persistOfflineMessagesSafely$1 r9 = (com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.C115491) r9
            int r2 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r9.label = r2
        L12:
            java.lang.Object r3 = r9.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r9.label
            r1 = 1
            if (r0 == 0) goto L2d
            if (r0 != r1) goto L28
            goto L24
        L1e:
            com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$persistOfflineMessagesSafely$1 r9 = new com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$persistOfflineMessagesSafely$1
            r9.<init>(r12)
            goto L12
        L24:
            X.Hwg.A00(r3)     // Catch: java.util.concurrent.CancellationException -> L5b java.lang.Exception -> L5d
            goto L65
        L28:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2d:
            X.Hwg.A00(r3)
            r7 = r11
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L65
            boolean r0 = r10.isMainChatId()
            if (r0 != 0) goto L65
            com.facebook.aura.conversation.repo.HatchConversationState r0 = X.C1BN.A00(r10)
            java.lang.String r4 = r0.vmId
            if (r4 == 0) goto L65
            com.facebook.aura.conversation.offline.HatchOfflineConversationRepository r3 = r10.offlineRepo     // Catch: java.util.concurrent.CancellationException -> L5b java.lang.Exception -> L5d
            java.lang.String r5 = r10.sessionId     // Catch: java.util.concurrent.CancellationException -> L5b java.lang.Exception -> L5d
            com.facebook.aura.gateway.HatchSessionItem r6 = r10.threadItemFor()     // Catch: java.util.concurrent.CancellationException -> L5b java.lang.Exception -> L5d
            r8 = 0
            r9.L$0 = r8     // Catch: java.util.concurrent.CancellationException -> L5b java.lang.Exception -> L5d
            r9.L$1 = r8     // Catch: java.util.concurrent.CancellationException -> L5b java.lang.Exception -> L5d
            r9.label = r1     // Catch: java.util.concurrent.CancellationException -> L5b java.lang.Exception -> L5d
            java.lang.Object r0 = r3.saveMessages(r4, r5, r6, r7, r8, r9)     // Catch: java.util.concurrent.CancellationException -> L5b java.lang.Exception -> L5d
            if (r0 != r2) goto L65
            return r2
        L5b:
            r0 = move-exception
            throw r0
        L5d:
            r2 = move-exception
            java.lang.String r1 = "Offline conversation message persist failed"
            java.lang.String r0 = "HatchConversationVM"
            X.CFK.A08(r0, r1, r2)
        L65:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.persistOfflineMessagesSafely(java.util.List, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object persistOfflineSnapshotSafely(com.facebook.aura.conversation.repo.HatchConversationState r6, X.HtJ<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.C115501
            if (r0 == 0) goto L1e
            r4 = r7
            com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$persistOfflineSnapshotSafely$1 r4 = (com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.C115501) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L2d
            if (r0 != r1) goto L28
            goto L24
        L1e:
            com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$persistOfflineSnapshotSafely$1 r4 = new com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$persistOfflineSnapshotSafely$1
            r4.<init>(r7)
            goto L12
        L24:
            X.Hwg.A00(r3)     // Catch: java.lang.Exception -> L3c java.util.concurrent.CancellationException -> L47
            goto L44
        L28:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2d:
            X.Hwg.A00(r3)
            r0 = 0
            r4.L$0 = r0     // Catch: java.lang.Exception -> L3c java.util.concurrent.CancellationException -> L47
            r4.label = r1     // Catch: java.lang.Exception -> L3c java.util.concurrent.CancellationException -> L47
            java.lang.Object r0 = r5.persistOfflineSnapshot(r6, r4)     // Catch: java.lang.Exception -> L3c java.util.concurrent.CancellationException -> L47
            if (r0 != r2) goto L44
            return r2
        L3c:
            r2 = move-exception
            java.lang.String r1 = "Offline conversation persist failed"
            java.lang.String r0 = "HatchConversationVM"
            X.CFK.A08(r0, r1, r2)
        L44:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L47:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.persistOfflineSnapshotSafely(com.facebook.aura.conversation.repo.HatchConversationState, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pruneExpiredPokes(long j) {
        while (!this.pokeTimestampsMs.isEmpty() && j - this.pokeTimestampsMs.A0T().longValue() > 300000) {
            this.pokeTimestampsMs.removeFirst();
        }
    }

    private final String replyImageReferenceFor(String str, String str2) {
        HatchConversationListItem.Message message;
        HatchMessageUiModel hatchMessageUiModel;
        Object next;
        Iterator it = this._listItems.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            HatchConversationListItem hatchConversationListItem = (HatchConversationListItem) it.next();
            if ((hatchConversationListItem instanceof HatchConversationListItem.Message) && (message = (HatchConversationListItem.Message) hatchConversationListItem) != null && (hatchMessageUiModel = message.message) != null && C7384Etj.areEqual(hatchMessageUiModel.id, str)) {
                AHD<ContentItem> ahd = hatchMessageUiModel.inlineMediaItems;
                if (ahd != null) {
                    Iterator it2 = ahd.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        if (((ContentItem) next).type instanceof ContentType.Image) {
                            break;
                        }
                    }
                    ContentItem contentItem = (ContentItem) next;
                    if (contentItem != null) {
                        String str3 = contentItem.workspacePath;
                        if (str3 != null) {
                            return str3;
                        }
                        String str4 = contentItem.imageUri;
                        if (str4 != null) {
                            return str4;
                        }
                    }
                }
            }
        }
        return HatchConversationViewModelKt.extractReplyImageReference(str2);
    }

    private final HatchWidgetPresentation replyPresentationFor(String str) {
        HatchWidgetPresentation hatchWidgetPresentation;
        HatchConversationListItem.Message message;
        HatchMessageUiModel hatchMessageUiModel;
        AHD<HatchWidgetPresentation> ahd;
        Iterator it = this._listItems.iterator();
        while (true) {
            hatchWidgetPresentation = null;
            if (!it.hasNext()) {
                break;
            }
            HatchConversationListItem hatchConversationListItem = (HatchConversationListItem) it.next();
            if ((hatchConversationListItem instanceof HatchConversationListItem.Message) && (message = (HatchConversationListItem.Message) hatchConversationListItem) != null && (hatchMessageUiModel = message.message) != null && C7384Etj.areEqual(hatchMessageUiModel.id, str) && (ahd = hatchMessageUiModel.presentations) != null && (hatchWidgetPresentation = (HatchWidgetPresentation) AbstractC0878AGe.A0K(ahd)) != null) {
                break;
            }
        }
        return hatchWidgetPresentation;
    }

    private final String replyPreviewText(String str) {
        return BQG.A17(AnonymousClass002.A0l(new C06827l3("\\[(image|file):[^]]*]").A03(AbstractC2159Azp.A0z(str, PairsDiscretionDocument.TERMINATOR, InviteCodeScratcherKt.CODE_SEPARATOR), "")), 100);
    }

    private final String replyTargetPresentationEventId(HatchWidgetPresentation hatchWidgetPresentation) {
        String str = hatchWidgetPresentation.presentationEventId;
        if (str != null) {
            return str;
        }
        String str2 = hatchWidgetPresentation.hostMessageId;
        return str2 == null ? hatchWidgetPresentation.presentationId : str2;
    }

    private final String resolveProjectDir(String str) {
        return HatchFileOperations.INSTANCE.resolveProjectDirFromPath(resolveRelativePath(str));
    }

    private final String resolveRelativePath(String str) {
        if (C7BY.A0q(str, HatchUrlSegments.FS_RAW_SEGMENT, false)) {
            String strA0U = C7BY.A0U(str, HatchUrlSegments.FS_RAW_SEGMENT, str);
            String strDecode = Uri.decode(C7BY.A0W(strA0U, HatchOpenGraphRepository.UNKNOWN_HOST, strA0U));
            C7384Etj.A0U(strDecode);
            return strDecode;
        }
        if (!AnonymousClass005.A1a(str, ArtifactFileActionMenuKt.SANDBOX_REFERENCE_PREFIX)) {
            return C7BY.A0W(str, HatchOpenGraphRepository.UNKNOWN_HOST, str);
        }
        String strA0K = C7BY.A0K(ArtifactFileActionMenuKt.SANDBOX_REFERENCE_PREFIX, str);
        return C7BY.A0W(strA0K, HatchOpenGraphRepository.UNKNOWN_HOST, strA0K);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0015 A[PHI: r4
  0x0015: PHI (r4v3 java.util.List) = (r4v0 java.util.List), (r4v4 java.util.List) binds: [B:7:0x000f, B:9:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052 A[PHI: r4 r5
  0x0052: PHI (r4v1 java.util.List) = (r4v3 java.util.List), (r4v4 java.util.List) binds: [B:11:0x0017, B:9:0x0013] A[DONT_GENERATE, DONT_INLINE]
  0x0052: PHI (r5v0 com.facebook.aura.conversation.repo.StreamingState) = (r5v2 com.facebook.aura.conversation.repo.StreamingState), (r5v3 com.facebook.aura.conversation.repo.StreamingState) binds: [B:11:0x0017, B:9:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0011 A[PHI: r4
  0x0011: PHI (r4v4 java.util.List) = (r4v0 java.util.List), (r4v5 java.util.List) binds: [B:7:0x000f, B:5:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.conversation.repo.HatchConversationState roomConversationState(com.facebook.aura.conversation.repo.HatchConversationState r17) {
        /*
            r16 = this;
            r0 = r16
            java.util.List<com.facebook.aura.model.HatchMessage> r3 = r0.roomMessages
            r12 = 0
            r2 = r17
            if (r17 == 0) goto Ld
            java.util.List<com.facebook.aura.model.HatchMessage> r4 = r2.messages
            if (r4 != 0) goto L11
        Ld:
            X.AGi r4 = X.C0881AGi.A00
            if (r17 == 0) goto L15
        L11:
            com.facebook.aura.conversation.repo.StreamingState r5 = r2.streamingState
            if (r5 != 0) goto L52
        L15:
            com.facebook.aura.conversation.repo.StreamingState r5 = com.facebook.aura.conversation.repo.StreamingState.Done
            if (r17 != 0) goto L52
            r6 = r12
            r7 = r12
        L1b:
            com.facebook.aura.conversation.repo.HistoryLoadingState r10 = com.facebook.aura.conversation.repo.HistoryLoadingState.SUCCESS
            boolean r11 = r0.roomHasMore
            java.util.Map r1 = com.facebook.aura.conversation.repo.HatchConversationRepositoryKt.reactionsForMessages(r3)
            if (r17 == 0) goto L29
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r2.reactions
            if (r0 != 0) goto L2d
        L29:
            X.9jH r0 = X.AGH.A0E()
        L2d:
            java.util.LinkedHashMap r14 = X.AGH.A02(r1, r0)
            if (r17 == 0) goto L4a
            com.facebook.aura.gateway.HatchGatewayConnectionState r8 = r2.connectionState
            if (r8 == 0) goto L4a
            boolean r0 = com.facebook.aura.gateway.HatchGatewayConnectionStateKt.isOffline(r8)
            if (r0 == 0) goto L4a
        L3d:
            r9 = 0
            com.facebook.aura.conversation.repo.HatchConversationState r2 = new com.facebook.aura.conversation.repo.HatchConversationState
            r13 = r12
            r15 = r12
            r16 = r9
            r17 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r2
        L4a:
            com.facebook.aura.gateway.HatchGatewayConnectionState$Reason r0 = com.facebook.aura.gateway.HatchGatewayConnectionState.Reason.NONE
            com.facebook.aura.gateway.HatchGatewayConnectionState$Disconnected r8 = new com.facebook.aura.gateway.HatchGatewayConnectionState$Disconnected
            r8.<init>(r0)
            goto L3d
        L52:
            java.lang.String r6 = r2.streamingMessageId
            java.lang.String r7 = r2.streamingUserMessageId
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.roomConversationState(com.facebook.aura.conversation.repo.HatchConversationState):com.facebook.aura.conversation.repo.HatchConversationState");
    }

    public static /* synthetic */ HatchConversationState roomConversationState$default(HatchConversationViewModel hatchConversationViewModel, HatchConversationState hatchConversationState, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchConversationState = null;
        }
        return hatchConversationViewModel.roomConversationState(hatchConversationState);
    }

    private final void schedulePokeRateLimitReset() {
        Long lA0U = this.pokeTimestampsMs.A0U();
        if (lA0U != null) {
            long jCurrentTimeMillis = 300000 - (System.currentTimeMillis() - lA0U.longValue());
            if (jCurrentTimeMillis < 1000) {
                jCurrentTimeMillis = 1000;
            }
            AnonymousClass001.A1J(new C115551(jCurrentTimeMillis, this, null), AEu.A00(this));
        }
    }

    public static /* synthetic */ void sendMessageAfterAttachments$default(HatchConversationViewModel hatchConversationViewModel, HoC hoC, HatchComposerEntryPoint hatchComposerEntryPoint, int i, Object obj) {
        if ((i & 2) != 0) {
            hatchComposerEntryPoint = null;
        }
        hatchConversationViewModel.sendMessageAfterAttachments(hoC, hatchComposerEntryPoint);
    }

    private final void sendMessageAndFollow(HatchSendMessage hatchSendMessage) {
        if (ConversationInputBlocks.INSTANCE.isBlocked(this.userSession)) {
            return;
        }
        requestScrollToBottom();
        this.sentRequestId.Af8(hatchSendMessage.requestId);
        this.repository.sendMessage(hatchSendMessage, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setComposerRestores(int i) {
        this.composerRestores$delegate.AdX(i);
    }

    private final boolean shouldPersistComposerDraft() {
        return (HatchConversationConstants.ASSIST_CONVERSATION_SESSION_ID.equals(this.sessionId) || this.isSessionDeleted) ? false : true;
    }

    private final void startAwaitFirstResponseWatchdog() {
        HtJ htJA13 = AnonymousClass006.A13(this.awaitFirstResponseJob);
        this.awaitFirstResponseJob = AnonymousClass001.A11(new C115591(htJA13), AEu.A00(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d A[RETURN] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v6, types: [X.BLa] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object syncListItems(com.facebook.aura.conversation.repo.HatchConversationState r9, com.facebook.aura.status.repo.AgentActivityInfo r10, boolean r11, X.HtJ<? super kotlin.Unit> r12) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.C115621
            if (r0 == 0) goto L29
            r5 = r12
            com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$syncListItems$1 r5 = (com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.C115621) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L29
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r2 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r3 = r5.label
            r6 = 3
            r1 = 2
            r0 = 1
            r12 = 0
            if (r3 == 0) goto L50
            if (r3 == r0) goto L3e
            if (r3 == r1) goto L34
            if (r3 != r6) goto L2f
            java.lang.Object r3 = r5.L$2
            X.BLa r3 = (X.InterfaceC2261BLa) r3
            goto L9e
        L29:
            com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$syncListItems$1 r5 = new com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$syncListItems$1
            r5.<init>(r12)
            goto L12
        L2f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L34:
            boolean r11 = r5.Z$0
            java.lang.Object r3 = r5.L$2
            X.BLa r3 = (X.InterfaceC2261BLa) r3
            X.Hwg.A00(r2)     // Catch: java.lang.Throwable -> La9
            goto L82
        L3e:
            boolean r11 = r5.Z$0
            java.lang.Object r3 = r5.L$2
            X.BLa r3 = (X.InterfaceC2261BLa) r3
            java.lang.Object r10 = r5.L$1
            com.facebook.aura.status.repo.AgentActivityInfo r10 = (com.facebook.aura.status.repo.AgentActivityInfo) r10
            java.lang.Object r9 = r5.L$0
            com.facebook.aura.conversation.repo.HatchConversationState r9 = (com.facebook.aura.conversation.repo.HatchConversationState) r9
            X.Hwg.A00(r2)
            goto L66
        L50:
            X.Hwg.A00(r2)
            X.BLa r3 = r8.syncMutex
            r5.L$0 = r9
            r5.L$1 = r10
            r5.L$2 = r3
            r5.Z$0 = r11
            r5.label = r0
            java.lang.Object r0 = r3.APs(r12, r5)
            if (r0 != r4) goto L66
            return r4
        L66:
            com.facebook.aura.executors.AuraDispatchers r0 = com.facebook.aura.executors.AuraDispatchers.INSTANCE     // Catch: java.lang.Throwable -> La7
            X.78T r0 = r0.m764default()     // Catch: java.lang.Throwable -> La7
            com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$syncListItems$2$operations$1 r7 = new com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$syncListItems$2$operations$1     // Catch: java.lang.Throwable -> La7
            r7.<init>(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> La7
            r5.L$0 = r12     // Catch: java.lang.Throwable -> La7
            r5.L$1 = r12     // Catch: java.lang.Throwable -> La7
            r5.L$2 = r3     // Catch: java.lang.Throwable -> La7
            r5.Z$0 = r11     // Catch: java.lang.Throwable -> La7
            r5.label = r1     // Catch: java.lang.Throwable -> La7
            java.lang.Object r2 = X.GAo.A00(r5, r0, r7)     // Catch: java.lang.Throwable -> La7
            if (r2 != r4) goto L82
            return r4
        L82:
            X.AHD r2 = (X.AHD) r2     // Catch: java.lang.Throwable -> La7
            X.HwK r1 = X.HwK.A00     // Catch: java.lang.Throwable -> La7
            com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$syncListItems$2$1 r0 = new com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$syncListItems$2$1     // Catch: java.lang.Throwable -> La7
            r0.<init>(r8, r2, r12)     // Catch: java.lang.Throwable -> La7
            r5.L$0 = r12     // Catch: java.lang.Throwable -> La7
            r5.L$1 = r12     // Catch: java.lang.Throwable -> La7
            r5.L$2 = r3     // Catch: java.lang.Throwable -> La7
            r5.L$3 = r12     // Catch: java.lang.Throwable -> La7
            r5.Z$0 = r11     // Catch: java.lang.Throwable -> La7
            r5.label = r6     // Catch: java.lang.Throwable -> La7
            java.lang.Object r0 = X.GAo.A00(r5, r1, r0)     // Catch: java.lang.Throwable -> La7
            if (r0 != r4) goto La1
            return r4
        L9e:
            X.Hwg.A00(r2)     // Catch: java.lang.Throwable -> La7
        La1:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> La7
            r3.Ahe(r12)
            return r0
        La7:
            r0 = move-exception
            goto Laa
        La9:
            r0 = move-exception
        Laa:
            r3.Ahe(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.syncListItems(com.facebook.aura.conversation.repo.HatchConversationState, com.facebook.aura.status.repo.AgentActivityInfo, boolean, X.HtJ):java.lang.Object");
    }

    private final HatchSessionItem threadItemFor() {
        Object next;
        Object obj = null;
        if ("primary_session_id".equals(this.sessionId)) {
            return null;
        }
        Iterator<E> it = getThreadsRepository().sessions(ThreadsView.ACTIVE).getValue().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C7384Etj.areEqual(((HatchSessionItem) next).sessionId, this.sessionId)) {
                break;
            }
        }
        HatchSessionItem hatchSessionItem = (HatchSessionItem) next;
        if (hatchSessionItem != null) {
            return hatchSessionItem;
        }
        Iterator<E> it2 = getThreadsRepository().sessions(ThreadsView.ARCHIVED).getValue().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (C7384Etj.areEqual(((HatchSessionItem) next2).sessionId, this.sessionId)) {
                obj = next2;
                break;
            }
        }
        return (HatchSessionItem) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean tryHighlightLoadedMessage(String str) {
        HatchConversationUiState value;
        Iterator it = this._listItems.iterator();
        int i = 0;
        while (it.hasNext()) {
            HatchConversationListItem hatchConversationListItem = (HatchConversationListItem) it.next();
            if (hatchConversationListItem instanceof HatchConversationListItem.Message) {
                HatchConversationListItem.Message message = (HatchConversationListItem.Message) hatchConversationListItem;
                if (C7384Etj.areEqual(message.message.id, str) || C7384Etj.areEqual(message.message.serverMessageId, str) || C7384Etj.areEqual(message.message.messageId, str)) {
                    if (i < 0) {
                        return false;
                    }
                    BLG<HatchConversationUiState> blg = this._uiState;
                    do {
                        value = blg.getValue();
                    } while (!blg.A6e(value, HatchConversationUiState.copy$default(value, false, false, false, false, false, false, 0, null, false, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, false, i, false, false, false, false, null, null, false, -134217729, 7, null)));
                    return true;
                }
            }
            i++;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object withPendingFileAction(com.facebook.aura.conversation.viewmodel.HatchPendingFileActionType r48, java.lang.String r49, X.G0U<? super X.HtJ<? super T>, ? extends java.lang.Object> r50, X.HtJ<? super T> r51) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.withPendingFileAction(com.facebook.aura.conversation.viewmodel.HatchPendingFileActionType, java.lang.String, X.G0U, X.HtJ):java.lang.Object");
    }

    public final void acceptPendingSuggestion() {
        HatchConversationUiState value;
        UiSuggestion uiSuggestion = AnonymousClass002.A0Z(this).pendingSuggestion;
        if (uiSuggestion != null) {
            HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, null, HatchInteractionEnumsKt.chatScreen(this.isPrimaryThread), HatchComponent.SUGGESTED_ACTION_ACCEPT, null, null, null);
            UiControlActionSink companion = UiControlActionSink.Companion.getInstance(this.userSession);
            BLG<HatchConversationUiState> blg = this._uiState;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, HatchConversationUiState.copy$default(value, false, false, false, false, false, false, 0, null, false, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, false, 0, false, false, false, false, null, null, false, -4194305, 7, null)));
            AnonymousClass001.A1J(new C115322(uiSuggestion, this, companion, null), AEu.A00(this));
        }
    }

    public final boolean allowsFileAttachments() {
        return this.attachments.allowsFileAttachments();
    }

    public final Integer attachmentPickerLimit() {
        return this.attachments.attachmentPickerLimit();
    }

    public final void cancelStopDictationFocus() {
        AnonymousClass002.A1K(this.stopDictationFocusJob);
    }

    public final void clearComposerFocusRequest() {
        HatchConversationUiState value;
        BLG<HatchConversationUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, HatchConversationUiState.copy$default(value, false, false, false, false, false, false, 0, null, false, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, false, 0, false, false, false, false, null, null, false, Integer.MAX_VALUE, 7, null)));
    }

    public final void clearComposerLaunchRequest() {
        HatchConversationUiState value;
        BLG<HatchConversationUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, HatchConversationUiState.copy$default(value, false, false, false, false, false, false, 0, null, false, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, false, 0, false, false, false, false, null, null, false, -1, 6, null)));
    }

    public final void clearConversation() {
        this.listMapper.clearRenderedIds();
        this.cursorHandoffKey = null;
        this.repository.clearChat();
    }

    public final void clearHighlightedMessageIndex() {
        HatchConversationUiState value;
        BLG<HatchConversationUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, HatchConversationUiState.copy$default(value, false, false, false, false, false, false, 0, null, false, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, false, -1, false, false, false, false, null, null, false, -134217729, 7, null)));
    }

    public final void clearMessageContext() {
        HatchConversationUiState value;
        HatchSendMessage value2;
        BLG<HatchConversationUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, HatchConversationUiState.copy$default(value, false, false, false, false, false, false, 0, null, false, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, false, 0, false, false, false, false, null, null, false, -2097153, 7, null)));
        BLG<HatchSendMessage> blg2 = this._pendingMessage;
        do {
            value2 = blg2.getValue();
        } while (!blg2.A6e(value2, HatchSendMessage.copy$default(value2, null, null, null, null, null, null, null, null, null, false, null, null, null, 8123, null)));
    }

    public final void clearReplyContext() {
        HatchConversationUiState value;
        BLG<HatchConversationUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, HatchConversationUiState.copy$default(value, false, false, false, false, false, false, 0, null, false, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, false, 0, false, false, false, false, null, null, false, -1048577, 7, null)));
    }

    public final void dismissPendingSuggestion() {
        HatchConversationUiState value;
        if (AnonymousClass002.A0Z(this).pendingSuggestion != null) {
            HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, null, HatchInteractionEnumsKt.chatScreen(this.isPrimaryThread), HatchComponent.SUGGESTED_ACTION_DISMISS, null, null, null);
            BLG<HatchConversationUiState> blg = this._uiState;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, HatchConversationUiState.copy$default(value, false, false, false, false, false, false, 0, null, false, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, false, 0, false, false, false, false, null, null, false, -4194305, 7, null)));
        }
    }

    public final void dismissSourcesBottomSheet() {
        HatchConversationUiState value;
        BLG<HatchConversationUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, HatchConversationUiState.copy$default(value, false, false, false, false, false, false, 0, null, false, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, false, 0, false, false, false, false, null, null, false, -50331649, 7, null)));
    }

    public final C20Q<HatchConversationAnnouncement> getAnnouncement() {
        return this.announcement;
    }

    public final C22I<Unit> getAssistantMessageStarted() {
        return this.repository.assistantMessageStarted;
    }

    public final C22I<String> getComposerHintAnimation() {
        return this.composerHintAnimation;
    }

    public final int getComposerRestores() {
        return this.composerRestores$delegate.AGd();
    }

    public final C1890At8 getComposerTextState() {
        return this.composerTextState;
    }

    public final ComposerDictationController getDictation() {
        return this.dictation;
    }

    public final GenericListSelectionDelegate getGenericListSelections() {
        return this.genericListSelections;
    }

    public final C1BN<String> getHighlightedMessageId() {
        return this.highlightedMessageId;
    }

    /* renamed from: getInstanceId-38SHtFc, reason: not valid java name */
    public final String m711getInstanceId38SHtFc() {
        return this.instanceId;
    }

    public final C1BN<Map<String, String>> getLatestWidgetIdsByKind() {
        return this.latestWidgetIdsByKind;
    }

    public final C1BN<AHD<HatchConversationListItem>> getListItems() {
        return this.listItems;
    }

    public final C1BN<HatchSessionItem> getLoadedSideChatInfo() {
        return this.loadedSideChatInfo;
    }

    public final boolean getOpensMainChat() {
        return this.opensMainChat;
    }

    public final HatchComposerEntryPoint getPendingEntryPoint() {
        return this.pendingEntryPoint;
    }

    public final String getPendingEntryPointOriginId() {
        return this.pendingEntryPointOriginId;
    }

    public final C22I<HatchReactionLanding> getReactionLanded() {
        return this.repository.reactionLanded;
    }

    public final C20Q<Unit> getScrollToBottomRequests() {
        return this.scrollToBottomRequests;
    }

    public final C22I<HatchSendErrorCategory> getSendFailed() {
        return this.repository.sendFailed;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final C1BN<HatchConversationUiState> getUiState() {
        return this.uiState;
    }

    public final C22I<HatchConversationViewEffect> getViewEffects() {
        return this.viewEffects;
    }

    public final WidgetStateMutationHost getWidgetStateMutationHost() {
        return this.repository;
    }

    public final boolean hasComposerText() {
        return !C7BY.A0j(this.composerTextState.A07());
    }

    public final boolean isUnsentNewThread() {
        if (!this.isNewThread) {
            return false;
        }
        HatchConversationState hatchConversationStateA00 = C1BN.A00(this);
        List<HatchMessage> list = hatchConversationStateA00.messages;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<HatchMessage> it = list.iterator();
            while (it.hasNext()) {
                if (HatchConversationViewModelKt.isConfirmedUserMessage(it.next())) {
                    return false;
                }
            }
        }
        List<HatchMessage> list2 = hatchConversationStateA00.history;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        Iterator<HatchMessage> it2 = list2.iterator();
        while (it2.hasNext()) {
            if (HatchConversationViewModelKt.isConfirmedUserMessage(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public final void loadMoreHistory() {
        if (this.historySource == HistorySource.ROOM) {
            loadMoreRoomHistory();
        } else {
            AnonymousClass001.A1J(new C115411(null), AEu.A00(this));
        }
    }

    @Override // X.AEs
    public void onCleared() throws Exception {
        this.composerRegistration.close();
        persistComposerDraft(AnonymousClass003.A0h(this), true);
        this.dictation.release(lateTranscriptDraftSaver());
        this.qplLogger.onCancel("left_surface");
        if (!"primary_session_id".equals(this.sessionId)) {
            this.repository.dispose();
        }
        this.statusRepository.dispose();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void pokeAgent() {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.pokeAgent():void");
    }

    public final void removePendingFileUri(int i) {
        this.attachments.removePendingFileUri(i);
    }

    public final void removePendingImageUri(int i) {
        this.attachments.removePendingImageUri(i);
    }

    public final void requestComposerFocus() {
        HatchConversationUiState value;
        BLG<HatchConversationUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, HatchConversationUiState.copy$default(value, false, false, false, false, false, false, 0, null, false, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, false, 0, false, false, false, true, null, null, false, Integer.MAX_VALUE, 7, null)));
    }

    public final void requestScrollToBottom() {
        this.scrollToBottomRequestChannel.AhZ(Unit.INSTANCE);
    }

    public final void retryConnection() {
        this.repository.connectIfDisconnected(false);
    }

    public final boolean sendFromSendButton() {
        boolean z = this.isPrimaryThread;
        String str = this.sessionId;
        if (z) {
            str = null;
        }
        return sendMessage(false, new HatchSendButtonOrigin(z, str, this.pendingEntryPoint, this.pendingEntryPointOriginId));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean sendMessage(boolean r48, com.facebook.aura.analytics.hatch.HatchSendButtonOrigin r49) {
        /*
            Method dump skipped, instructions count: 593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.sendMessage(boolean, com.facebook.aura.analytics.hatch.HatchSendButtonOrigin):boolean");
    }

    public final void setHighlightedMessageId(String str) {
        this._highlightedMessageId.Af8(str);
    }

    public final void setOnScreen(boolean z) {
        AnonymousClass004.A1D(z, this.isOnScreen);
        if (z) {
            logCachedHistoryIfShown();
        }
    }

    public final void setPendingDiscussionItem(PendingDiscussionItem pendingDiscussionItem) {
        HatchSendMessage value;
        BLG<HatchSendMessage> blg = this._pendingMessage;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, HatchSendMessage.copy$default(value, null, null, pendingDiscussionItem, null, null, null, null, null, null, false, null, null, null, 8187, null)));
    }

    public final void setReplyContext(String str, String str2, String str3) {
        HatchConversationUiState value;
        AnonymousClass003.A0x(str2, str3);
        ReplyAttribution.Message message = str != null ? new ReplyAttribution.Message(str, str3, null) : null;
        BLG<HatchConversationUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, HatchConversationUiState.copy$default(value, false, false, false, false, false, false, 0, null, false, null, null, null, null, null, null, false, false, false, null, null, message != null ? new ReplyContext(message, str3, str2, null) : null, null, null, null, null, null, false, 0, false, false, false, false, null, null, false, -1048577, 7, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a A[PHI: r5 r6
  0x002a: PHI (r5v3 java.lang.String) = (r5v0 java.lang.String), (r5v4 java.lang.String) binds: [B:10:0x0028, B:8:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x002a: PHI (r6v5 com.facebook.aura.model.HatchWidgetPresentation) = (r6v2 com.facebook.aura.model.HatchWidgetPresentation), (r6v0 com.facebook.aura.model.HatchWidgetPresentation) binds: [B:10:0x0028, B:8:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0030 A[PHI: r5 r6
  0x0030: PHI (r5v2 java.lang.String) = (r5v0 java.lang.String), (r5v3 java.lang.String) binds: [B:10:0x0028, B:12:0x002e] A[DONT_GENERATE, DONT_INLINE]
  0x0030: PHI (r6v4 com.facebook.aura.model.HatchWidgetPresentation) = (r6v2 com.facebook.aura.model.HatchWidgetPresentation), (r6v5 com.facebook.aura.model.HatchWidgetPresentation) binds: [B:10:0x0028, B:12:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setReplyContextAndDismissOverlay(java.lang.String r47, java.lang.String r48) {
        /*
            r46 = this;
            r7 = r47
            r2 = r48
            boolean r11 = X.AnonymousClass004.A1b(r7, r2)
            r8 = r46
            com.facebook.aura.model.HatchWidgetPresentation r6 = r8.replyPresentationFor(r7)
            boolean r0 = X.C7BY.A0j(r2)
            if (r0 == 0) goto La9
            if (r6 == 0) goto L24
            java.lang.String r1 = com.facebook.aura.model.HatchWidgetPresentationKt.replyPreviewText(r6)
            if (r1 == 0) goto L24
            r0 = 100
            java.lang.String r5 = X.BQG.A17(r1, r0)
            if (r5 != 0) goto L2a
        L24:
            java.lang.String r5 = r8.replyPreviewText(r2)
            if (r6 == 0) goto L30
        L2a:
            java.lang.String r4 = com.facebook.aura.model.HatchWidgetPresentationKt.replyPreviewImageReference(r6)
            if (r4 != 0) goto L34
        L30:
            java.lang.String r4 = r8.replyImageReferenceFor(r7, r2)
        L34:
            X.BLG<com.facebook.aura.conversation.viewmodel.HatchConversationUiState> r3 = r8._uiState
        L36:
            java.lang.Object r9 = r3.getValue()
            r10 = r9
            com.facebook.aura.conversation.viewmodel.HatchConversationUiState r10 = (com.facebook.aura.conversation.viewmodel.HatchConversationUiState) r10
            if (r6 == 0) goto La3
            java.lang.String r1 = r8.replyTargetPresentationEventId(r6)
            r0 = 0
            com.facebook.aura.model.ReplyAttribution$Presentation r2 = new com.facebook.aura.model.ReplyAttribution$Presentation
            r2.<init>(r1, r5, r4, r0)
        L49:
            com.facebook.aura.model.ReplyAttribution r2 = (com.facebook.aura.model.ReplyAttribution) r2
            r1 = 0
            com.facebook.aura.conversation.viewmodel.ReplyContext r0 = new com.facebook.aura.conversation.viewmodel.ReplyContext
            r0.<init>(r2, r5, r1, r4)
            r47 = 7
            r46 = -1048577(0xffffffffffefffff, float:NaN)
            r12 = r11
            r13 = r11
            r14 = r11
            r15 = r11
            r16 = r11
            r17 = r11
            r18 = r1
            r19 = r11
            r20 = r1
            r21 = r1
            r22 = r1
            r23 = r1
            r24 = r1
            r25 = r1
            r26 = r11
            r27 = r11
            r28 = r11
            r29 = r1
            r30 = r1
            r31 = r0
            r32 = r1
            r33 = r1
            r34 = r1
            r35 = r1
            r36 = r1
            r37 = r11
            r38 = r11
            r39 = r11
            r40 = r11
            r41 = r11
            r42 = r11
            r43 = r1
            r44 = r1
            r45 = r11
            r48 = r1
            com.facebook.aura.conversation.viewmodel.HatchConversationUiState r0 = com.facebook.aura.conversation.viewmodel.HatchConversationUiState.copy$default(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            boolean r0 = r3.A6e(r9, r0)
            if (r0 == 0) goto L36
            return
        La3:
            com.facebook.aura.model.ReplyAttribution$Message r2 = new com.facebook.aura.model.ReplyAttribution$Message
            r2.<init>(r7, r5, r4)
            goto L49
        La9:
            r6 = 0
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel.setReplyContextAndDismissOverlay(java.lang.String, java.lang.String):void");
    }

    public final void stageReplyDraft(String str, ReplyAttribution.Context context) {
        HatchConversationUiState value;
        HatchConversationUiState hatchConversationUiState;
        ReplyContext replyContext;
        String str2 = str;
        boolean zA1a = AnonymousClass002.A1a(str2, context);
        boolean zSupportsReplyTargetType = this.repository.supportsReplyTargetType(context.targetType);
        if (!zSupportsReplyTargetType) {
            str2 = context.fallbackText;
        }
        setComposerText(FGI.A0M(str2, InviteCodeScratcherKt.CODE_SEPARATOR));
        BLG<HatchConversationUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            hatchConversationUiState = value;
            if (zSupportsReplyTargetType) {
                List listAsList = Arrays.asList(context.label, context.preview);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listAsList) {
                    AnonymousClass006.A1F((String) obj, obj, arrayList);
                }
                replyContext = new ReplyContext(context, AbstractC0878AGe.A0L(ConnectorOrderCheckoutRowsKt.DETAIL_SEPARATOR, "", "", arrayList, null), null, null);
            } else {
                replyContext = null;
            }
        } while (!blg.A6e(value, HatchConversationUiState.copy$default(hatchConversationUiState, false, false, false, false, false, false, 0, null, false, null, null, null, null, null, null, false, false, false, null, null, replyContext, null, null, null, null, null, false, 0, false, false, false, zA1a, null, null, false, 2146435071, 7, null)));
    }

    public final void stopDictation() {
        this.dictation.end();
        if (HuJ.A00(this.context)) {
            HtJ htJA13 = AnonymousClass006.A13(this.stopDictationFocusJob);
            this.stopDictationFocusJob = AnonymousClass001.A11(new C115601(htJA13), AEu.A00(this));
        }
    }

    public final void stopGeneration() {
        Function0<Unit> function0PrepareStopGeneration;
        this.qplLogger.onStopGeneration();
        LiveSession liveSessionForSession = LiveSessions.INSTANCE.forSession(this.userSession);
        if (liveSessionForSession != null) {
            String str = this.sessionId;
            if (this.isPrimaryThread) {
                str = null;
            }
            function0PrepareStopGeneration = liveSessionForSession.prepareStopGeneration(str);
        } else {
            function0PrepareStopGeneration = null;
        }
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C115611(function0PrepareStopGeneration, null), AEu.A00(this));
    }

    public final void syncUnreadMessageCount() {
        this.repository.syncUnreadMessageCount();
    }

    /* loaded from: classes2.dex */
    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final void observeBackgroundFlush() {
        AnonymousClass001.A1J(new C115431(null), AEu.A00(this));
    }

    private final void observeComposerDraftPersistence() {
        if (shouldPersistComposerDraft()) {
            AnonymousClass001.A1J(new C115441(null), AEu.A00(this));
        }
    }

    private final void observeOfflinePersistence() {
        BLL bllA00 = AEu.A00(this);
        C115451 c115451 = new C115451(null);
        C6ys c6ys = C6ys.A00;
        Integer num = C79.A00;
        GAo.A02(num, c6ys, new C115484(null), AnonymousClass001.A0e(this, num, c6ys, new C115473(null), AnonymousClass001.A0e(this, num, c6ys, new C115462(null), AnonymousClass001.A0e(this, num, c6ys, c115451, bllA00))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void persistComposerDraft(String str, boolean z) {
        if (!shouldPersistComposerDraft() || this.isDraftRestorePending) {
            return;
        }
        if (str.length() == 0 || AnonymousClass002.A0Z(this).messageContext != null || HatchPeerInviteLinks.INSTANCE.contains(str)) {
            getComposerDrafts().clear(this.sessionId, z);
        } else {
            getComposerDrafts().save(this.sessionId, str, AnonymousClass003.A1Z(this._isDraftDictated), z);
        }
    }

    public static /* synthetic */ void persistComposerDraft$default(HatchConversationViewModel hatchConversationViewModel, String str, boolean z, int i, Object obj) {
        hatchConversationViewModel.persistComposerDraft(str, AnonymousClass001.A1Q(i, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object persistOfflineSnapshot(HatchConversationState hatchConversationState, HtJ<? super Unit> htJ) {
        String str;
        Object objSaveMessages;
        return (isMainChatId() || (str = hatchConversationState.vmId) == null || (objSaveMessages = this.offlineRepo.saveMessages(str, this.sessionId, threadItemFor(), reconciledSettledMessages(hatchConversationState), null, htJ)) != EnumC10460Hji.A02) ? Unit.INSTANCE : objSaveMessages;
    }

    private final void prewarmComposerDrafts() {
        if (shouldPersistComposerDraft()) {
            boolean z = this.isDraftRestorePending;
            AnonymousClass001.A1J(new C115531(z, null), AEu.A00(this));
        }
    }

    private final String readPersistedComposerDraft() {
        if (shouldPersistComposerDraft()) {
            String strCachedText = getComposerDrafts().cachedText(this.sessionId);
            this.isDraftRestorePending = AnonymousClass002.A1Y(strCachedText);
            if (strCachedText == null) {
                strCachedText = "";
            }
            if (!HatchPeerInviteLinks.INSTANCE.contains(strCachedText)) {
                return strCachedText;
            }
        }
        return "";
    }

    private final boolean readPersistedDraftDictated() {
        return shouldPersistComposerDraft() && !C7BY.A0j(this._pendingMessage.getValue().text) && getComposerDrafts().isDictated(this.sessionId);
    }

    private final List<HatchMessage> reconciledSettledMessages(HatchConversationState hatchConversationState) {
        Set<String> activeStreamingMessageIds = hatchConversationState.getActiveStreamingMessageIds();
        ArrayList arrayListA0P = AbstractC0878AGe.A0P(hatchConversationState.messages, HatchConversationMessageOrderingKt.withoutLiveDuplicates(hatchConversationState.history, hatchConversationState.messages));
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListA0P.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!activeStreamingMessageIds.contains(((HatchMessage) next).id)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private final void seedFromOfflineCache() {
        AnonymousClass001.A1J(new C115561(null), AEu.A00(this));
    }

    public static /* synthetic */ boolean sendMessage$default(HatchConversationViewModel hatchConversationViewModel, boolean z, HatchSendButtonOrigin hatchSendButtonOrigin, int i, Object obj) {
        boolean zA1P = AnonymousClass001.A1P(i, z);
        if ((i & 2) != 0) {
            hatchSendButtonOrigin = null;
        }
        return hatchConversationViewModel.sendMessage(zA1P, hatchSendButtonOrigin);
    }

    private final String withLinkAttachments(String str, List<String> list) {
        if (list.isEmpty()) {
            return str;
        }
        ArrayList arrayListA0P = AbstractC0878AGe.A0P(list, Collections.singletonList(C7BY.A0G(str).toString()));
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListA0P.iterator();
        while (it.hasNext()) {
            AnonymousClass007.A19(arrayList, it);
        }
        return AbstractC0878AGe.A0L(PairsDiscretionDocument.TERMINATOR, "", "", arrayList, null);
    }

    public final void addPendingFileUri(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.attachments.addPendingFileUri(str, str2);
    }

    public final void cancelDictation() {
        cancelStopDictationFocus();
        this.dictation.cancel(true);
    }

    public final void endDictationAndSend() {
        boolean z = AnonymousClass002.A0Z(this).isAwaitingApproval;
        ComposerDictationController composerDictationController = this.dictation;
        if (!z) {
            composerDictationController.endAndSend(null);
        } else {
            composerDictationController.end();
            ToastApi.INSTANCE.showToast(R.string._name_removed__res_0x7f120722);
        }
    }

    public final void onWidgetSetState(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        if (ConversationInputBlocks.INSTANCE.isBlocked(this.userSession)) {
            return;
        }
        this.repository.setWidgetState(str, str2, str3);
    }

    public final HatchDocumentType resolveDocumentType(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        if (HatchFileUIUtils.FileExtensions.INSTANCE.isHtml(str3, str2, str)) {
            return HatchDocumentType.Html.INSTANCE;
        }
        return DOCUMENT_MARKDOWN_EXTENSIONS.contains(AnonymousClass001.A0u(C7BY.A0R(str2, "", '.'))) ? HatchDocumentType.Markdown.INSTANCE : HatchDocumentType.Generic.INSTANCE;
    }

    public final void stageGoalDiscussion(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        clearMessageContext();
        if (!this.repository.supportsReplyTargetType(ReplyAttributionSerializer.TYPE_GOAL)) {
            setMessageContext(str2, AnonymousClass007.A0c(HatchMetadataKey.GOAL_ID, str), str3);
        } else {
            setMessageContext(str2, AGH.A0E(), str3);
            setPendingDiscussionItem(new PendingDiscussionItem(HatchMessageKt.createAttachmentHandleForDiscussionItem(str, DiscussionItemType.Goal), null));
        }
    }

    public final void toggleReaction(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.repository.toggleReaction(str2, str);
    }

    public final void unsendMessage(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        AnonymousClass001.A1J(new C115631(str, str2, null), AEu.A00(this));
    }

    public /* synthetic */ HatchConversationViewModel(Context context, AbstractC3358CGz abstractC3358CGz, String str, boolean z, boolean z2, int i, C06H c06h) {
        this(context, abstractC3358CGz, str, AnonymousClass005.A1P(i, z), (i & 16) != 0 ? false : z2);
    }

    public final void setReplyContext(ReplyContext replyContext) {
        HatchConversationUiState value;
        C7384Etj.A0Y(replyContext, 0);
        BLG<HatchConversationUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, HatchConversationUiState.copy$default(value, false, false, false, false, false, false, 0, null, false, null, null, null, null, null, null, false, false, false, null, null, replyContext, null, null, null, null, null, false, 0, false, false, false, true, null, null, false, 2146435071, 7, null)));
    }
}
