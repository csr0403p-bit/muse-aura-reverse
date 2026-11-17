package com.facebook.aura.conversation.view;

import X.AGI;
import X.AHD;
import X.AHI;
import X.AKQ;
import X.AbstractC07539Wl;
import X.AbstractC0885AGm;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BA2;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BQN;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C0861A6i;
import X.C10G;
import X.C1515AkP;
import X.C1BO;
import X.C1DG;
import X.C1HY;
import X.C1er;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.C7BY;
import X.C90m;
import X.C9m9;
import X.F2N;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.HtJ;
import X.HzP;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchComposerEntryPoint;
import com.facebook.aura.analytics.hatch.HatchEventType;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.confidentialvm.session.ConfidentialSessionGate;
import com.facebook.aura.conversation.common.HatchPendingMessage;
import com.facebook.aura.conversation.repo.HatchThreadsRepository;
import com.facebook.aura.conversation.search.ConversationSearchScreenKt;
import com.facebook.aura.conversation.viewmodel.HatchConversationUiState;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import com.facebook.aura.conversation.viewmodel.HatchDocumentType;
import com.facebook.aura.conversation.widget.api.ConversationPresentationAction;
import com.facebook.aura.conversation.widget.api.ConversationPresentationActionContext;
import com.facebook.aura.conversation.widget.api.ConversationPresentationActionContributor;
import com.facebook.aura.conversation.widget.api.ConversationPresentationActions;
import com.facebook.aura.deeplink.HatchIntentViewModel;
import com.facebook.aura.deeplink.PendingDeeplinkMessage;
import com.facebook.aura.gateway.HatchSessionItem;
import com.facebook.aura.header.api.ConversationHeaderActionContributor;
import com.facebook.aura.header.api.ConversationHeaderActions;
import com.facebook.aura.header.api.ConversationHeaderContext;
import com.facebook.aura.header.api.HeaderAction;
import com.facebook.aura.header.view.HeaderButton;
import com.facebook.aura.header.view.HeaderLeadingButton;
import com.facebook.aura.model.HatchFileProviderUtil;
import com.facebook.aura.model.HatchMessageChannel;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.PublishArtifactSheetKey;
import com.facebook.aura.perf.HatchNavTTRCCoordinator;
import com.facebook.aura.ui.HatchRenameDialogKt;
import com.facebook.aura.utils.HatchUtil;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchConversationScreenKt {
    public static final long IME_SHOW_TIMEOUT_MS = 1000;
    public static final String TAG = "HatchConversation";
    public static final long THREAD_HEADER_CHANNEL_INTRO_DURATION_MS = 3000;
    public static final long THREAD_HEADER_INTRO_DURATION_MS = 2500;
    public static final int THREAD_HEADER_TITLE_SLIDE_OFFSET_DP = 12;
    public static final float THREAD_MENU_BELOW_HEADER_GAP = 8.0f;
    public static final int THREAD_STATUS_PILL_TRANSITION_DURATION_MS = 600;

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationScreenKt$ComposerLaunchEffect$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ HatchConversationViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchConversationViewModel hatchConversationViewModel, int i) {
            super(2);
            this.$viewModel = hatchConversationViewModel;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchConversationScreenKt.ComposerLaunchEffect(this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationScreenKt$ConversationScreenDecoration$13, reason: invalid class name */
    public final class AnonymousClass13 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$changed2;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $accountUsername;
        public final /* synthetic */ HatchMessageChannel $channel;
        public final /* synthetic */ G2j<C1DG, C1DG, BFM, Integer, Unit> $content;
        public final /* synthetic */ boolean $hasLoadedSideChatInfo;
        public final /* synthetic */ boolean $isArchived;
        public final /* synthetic */ boolean $isCreatingNewThread;
        public final /* synthetic */ boolean $isExternalChannel;
        public final /* synthetic */ boolean $isLiveSessionEligible;
        public final /* synthetic */ boolean $isMainTab;
        public final /* synthetic */ boolean $isPinned;
        public final /* synthetic */ boolean $isReadOnly;
        public final /* synthetic */ boolean $isThreadCreated;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onArchiveThread;
        public final /* synthetic */ Function0<Unit> $onBackClick;
        public final /* synthetic */ Function0<Unit> $onDeleteThread;
        public final /* synthetic */ Function0<Unit> $onInviteFriendsClick;
        public final /* synthetic */ Function0<Unit> $onPinThread;
        public final /* synthetic */ G0V<String, G0U<? super Boolean, Unit>, Unit> $onRenameThread;
        public final /* synthetic */ Function0<Unit> $onSearchClick;
        public final /* synthetic */ Function0<Unit> $onTabReselected;
        public final /* synthetic */ Function0<Unit> $onUnarchiveThread;
        public final /* synthetic */ Function0<Unit> $onUnpinThread;
        public final /* synthetic */ boolean $showBackButton;
        public final /* synthetic */ String $threadId;
        public final /* synthetic */ String $threadTitle;
        public final /* synthetic */ HatchConversationUiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass13(boolean z, HatchConversationUiState hatchConversationUiState, String str, BRg bRg, Function0<Unit> function0, Function0<Unit> function02, boolean z2, String str2, Function0<Unit> function03, String str3, boolean z3, boolean z4, boolean z5, Function0<Unit> function04, Function0<Unit> function05, boolean z6, boolean z7, HatchMessageChannel hatchMessageChannel, boolean z8, boolean z9, Function0<Unit> function06, Function0<Unit> function07, G0V<? super String, ? super G0U<? super Boolean, Unit>, Unit> g0v, Function0<Unit> function08, boolean z10, Function0<Unit> function09, G2j<? super C1DG, ? super C1DG, ? super BFM, ? super Integer, Unit> g2j, int i, int i2, int i3, int i4) {
            super(2);
            this.$isMainTab = z;
            this.$uiState = hatchConversationUiState;
            this.$threadId = str;
            this.$modifier = bRg;
            this.$onSearchClick = function0;
            this.$onBackClick = function02;
            this.$showBackButton = z2;
            this.$accountUsername = str2;
            this.$onTabReselected = function03;
            this.$threadTitle = str3;
            this.$isCreatingNewThread = z3;
            this.$hasLoadedSideChatInfo = z4;
            this.$isThreadCreated = z5;
            this.$onArchiveThread = function04;
            this.$onUnarchiveThread = function05;
            this.$isArchived = z6;
            this.$isPinned = z7;
            this.$channel = hatchMessageChannel;
            this.$isExternalChannel = z8;
            this.$isReadOnly = z9;
            this.$onPinThread = function06;
            this.$onUnpinThread = function07;
            this.$onRenameThread = g0v;
            this.$onDeleteThread = function08;
            this.$isLiveSessionEligible = z10;
            this.$onInviteFriendsClick = function09;
            this.$content = g2j;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$changed2 = i3;
            this.$$default = i4;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchConversationScreenKt.ConversationScreenDecoration(this.$isMainTab, this.$uiState, this.$threadId, this.$modifier, this.$onSearchClick, this.$onBackClick, this.$showBackButton, this.$accountUsername, this.$onTabReselected, this.$threadTitle, this.$isCreatingNewThread, this.$hasLoadedSideChatInfo, this.$isThreadCreated, this.$onArchiveThread, this.$onUnarchiveThread, this.$isArchived, this.$isPinned, this.$channel, this.$isExternalChannel, this.$isReadOnly, this.$onPinThread, this.$onUnpinThread, this.$onRenameThread, this.$onDeleteThread, this.$isLiveSessionEligible, this.$onInviteFriendsClick, this.$content, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), AnonymousClass011.A01(this.$$changed2), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationScreenKt$HatchConversationScreen$18, reason: invalid class name */
    public final class AnonymousClass18 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ C1BO<AHD<HatchSessionItem>> $activeThreadSessions$delegate;
        public final /* synthetic */ String $archiveFailedMessage;
        public final /* synthetic */ String $archiveSuccessMessage;
        public final /* synthetic */ String $archiveVoiceCallActiveMessage;
        public final /* synthetic */ C1BO<AHD<HatchSessionItem>> $archivedThreadSessions$delegate;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $deleteFailedMessage;
        public final /* synthetic */ String $deleteSuccessMessage;
        public final /* synthetic */ String $highlightMessageId;
        public final /* synthetic */ C1BO<String> $highlightedMessageId$delegate;
        public final /* synthetic */ boolean $isArchived;
        public final /* synthetic */ boolean $isArchivedContext;
        public final /* synthetic */ boolean $isCreatingNewThread;
        public final /* synthetic */ boolean $isMainTab;
        public final /* synthetic */ boolean $isPrimaryThread;
        public final /* synthetic */ C1BO<HatchSessionItem> $loadedSideChatInfo$delegate;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchNavTTRCCoordinator $navTtrcCoordinator;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ G0U<String, Unit> $onRichFormatOpenCTAClick;
        public final /* synthetic */ C1BO<PendingDeeplinkMessage> $pendingDeeplinkMessage$delegate;
        public final /* synthetic */ String $pinFailedMessage;
        public final /* synthetic */ String $pinSuccessMessage;
        public final /* synthetic */ String $renameFailedMessage;
        public final /* synthetic */ String $renameTooLongMessage;
        public final /* synthetic */ MutableState<Boolean> $showMicDeniedDialog$delegate;
        public final /* synthetic */ String $threadId;
        public final /* synthetic */ String $threadTitle;
        public final /* synthetic */ HatchThreadsRepository $threadsRepository;
        public final /* synthetic */ C1BO<HatchConversationUiState> $uiState$delegate;
        public final /* synthetic */ String $unpinFailedMessage;
        public final /* synthetic */ String $unpinSuccessMessage;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public final /* synthetic */ View $view;
        public final /* synthetic */ HatchConversationViewModel $viewModel;

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass18(boolean z, boolean z2, String str, boolean z3, HatchThreadsRepository hatchThreadsRepository, HatchConversationViewModel hatchConversationViewModel, View view, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, BRg bRg, boolean z4, AuraNavigator auraNavigator, boolean z5, AbstractC3358CGz abstractC3358CGz, Context context, C1BO<? extends AHD<HatchSessionItem>> c1bo, C1BO<? extends AHD<HatchSessionItem>> c1bo2, C1BO<HatchSessionItem> c1bo3, C1BO<HatchConversationUiState> c1bo4, G0U<? super String, Unit> g0u, HatchNavTTRCCoordinator hatchNavTTRCCoordinator, C1BO<PendingDeeplinkMessage> c1bo5, String str14, C1BO<String> c1bo6, MutableState<Boolean> mutableState) {
            super(2);
            this.$isMainTab = z;
            this.$isArchived = z2;
            this.$threadTitle = str;
            this.$isArchivedContext = z3;
            this.$threadsRepository = hatchThreadsRepository;
            this.$viewModel = hatchConversationViewModel;
            this.$view = view;
            this.$archiveSuccessMessage = str2;
            this.$archiveVoiceCallActiveMessage = str3;
            this.$archiveFailedMessage = str4;
            this.$pinSuccessMessage = str5;
            this.$pinFailedMessage = str6;
            this.$unpinSuccessMessage = str7;
            this.$unpinFailedMessage = str8;
            this.$renameTooLongMessage = str9;
            this.$renameFailedMessage = str10;
            this.$deleteSuccessMessage = str11;
            this.$deleteFailedMessage = str12;
            this.$threadId = str13;
            this.$modifier = bRg;
            this.$isPrimaryThread = z4;
            this.$navigator = auraNavigator;
            this.$isCreatingNewThread = z5;
            this.$userSession = abstractC3358CGz;
            this.$context = context;
            this.$activeThreadSessions$delegate = c1bo;
            this.$archivedThreadSessions$delegate = c1bo2;
            this.$loadedSideChatInfo$delegate = c1bo3;
            this.$uiState$delegate = c1bo4;
            this.$onRichFormatOpenCTAClick = g0u;
            this.$navTtrcCoordinator = hatchNavTTRCCoordinator;
            this.$pendingDeeplinkMessage$delegate = c1bo5;
            this.$highlightMessageId = str14;
            this.$highlightedMessageId$delegate = c1bo6;
            this.$showMicDeniedDialog$delegate = mutableState;
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x0329  */
        /* JADX WARN: Removed duplicated region for block: B:103:0x039c  */
        /* JADX WARN: Removed duplicated region for block: B:114:0x03ef  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x03f6  */
        /* JADX WARN: Removed duplicated region for block: B:116:0x0421  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x0427  */
        /* JADX WARN: Removed duplicated region for block: B:118:0x043f  */
        /* JADX WARN: Removed duplicated region for block: B:121:0x0445 A[PHI: r22
  0x0445: PHI (r22v1 boolean) = (r22v0 boolean), (r22v3 boolean), (r22v3 boolean) binds: [B:119:0x0441, B:36:0x0131, B:38:0x0137] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:128:0x045b  */
        /* JADX WARN: Removed duplicated region for block: B:130:0x0462 A[PHI: r4
  0x0462: PHI (r4v69 com.facebook.aura.gateway.HatchSessionItem) = (r4v68 com.facebook.aura.gateway.HatchSessionItem), (r4v74 com.facebook.aura.gateway.HatchSessionItem) binds: [B:16:0x00e6, B:23:0x0105] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x012d A[PHI: r22
  0x012d: PHI (r22v3 boolean) = (r22v0 boolean), (r22v4 boolean) binds: [B:119:0x0441, B:34:0x012b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0152  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x015a  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x017b  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x01da  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x01f3  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x02e1 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x02e3  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x02fb A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:92:0x02fd  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x0311 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0313  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x0327 A[ADDED_TO_REGION] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(X.BFM r66, int r67) {
            /*
                Method dump skipped, instructions count: 1136
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationScreenKt.AnonymousClass18.invoke(X.BFM, int):void");
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationScreenKt$HatchConversationScreen$19, reason: invalid class name */
    public final class AnonymousClass19 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $highlightMessageId;
        public final /* synthetic */ Long $highlightMessageSeq;
        public final /* synthetic */ boolean $isCreatingNewThread;
        public final /* synthetic */ boolean $isMainTab;
        public final /* synthetic */ boolean $isOpenedFromArchive;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onRichFormatOpenCTAClick;
        public final /* synthetic */ String $threadTitle;
        public final /* synthetic */ HatchConversationViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass19(boolean z, G0U<? super String, Unit> g0u, BRg bRg, boolean z2, String str, boolean z3, String str2, Long l, HatchConversationViewModel hatchConversationViewModel, int i, int i2) {
            super(2);
            this.$isMainTab = z;
            this.$onRichFormatOpenCTAClick = g0u;
            this.$modifier = bRg;
            this.$isOpenedFromArchive = z2;
            this.$threadTitle = str;
            this.$isCreatingNewThread = z3;
            this.$highlightMessageId = str2;
            this.$highlightMessageSeq = l;
            this.$viewModel = hatchConversationViewModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchConversationScreenKt.HatchConversationScreen(this.$isMainTab, this.$onRichFormatOpenCTAClick, this.$modifier, this.$isOpenedFromArchive, this.$threadTitle, this.$isCreatingNewThread, this.$highlightMessageId, this.$highlightMessageSeq, this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationScreenKt$HatchConversationScreen$2, reason: invalid class name and case insensitive filesystem */
    public final class C114402 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $highlightMessageId;
        public final /* synthetic */ Long $highlightMessageSeq;
        public final /* synthetic */ boolean $isCreatingNewThread;
        public final /* synthetic */ boolean $isMainTab;
        public final /* synthetic */ boolean $isOpenedFromArchive;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onRichFormatOpenCTAClick;
        public final /* synthetic */ String $threadTitle;
        public final /* synthetic */ HatchConversationViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C114402(boolean z, G0U<? super String, Unit> g0u, BRg bRg, boolean z2, String str, boolean z3, String str2, Long l, HatchConversationViewModel hatchConversationViewModel, int i, int i2) {
            super(2);
            this.$isMainTab = z;
            this.$onRichFormatOpenCTAClick = g0u;
            this.$modifier = bRg;
            this.$isOpenedFromArchive = z2;
            this.$threadTitle = str;
            this.$isCreatingNewThread = z3;
            this.$highlightMessageId = str2;
            this.$highlightMessageSeq = l;
            this.$viewModel = hatchConversationViewModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchConversationScreenKt.HatchConversationScreen(this.$isMainTab, this.$onRichFormatOpenCTAClick, this.$modifier, this.$isOpenedFromArchive, this.$threadTitle, this.$isCreatingNewThread, this.$highlightMessageId, this.$highlightMessageSeq, this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationScreenKt$InboundLinkEffect$2, reason: invalid class name and case insensitive filesystem */
    public final class C114412 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ AHD<ConversationPresentationAction> $presentationActions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C114412(AHD<? extends ConversationPresentationAction> ahd, int i) {
            super(2);
            this.$presentationActions = ahd;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchConversationScreenKt.InboundLinkEffect(this.$presentationActions, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationScreenKt$ThreadArchiveConfirmationDialog$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $archiveText;
        public final /* synthetic */ String $cancelText;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Function0<Unit> function0, String str2, Function0<Unit> function02) {
            super(2);
            this.$cancelText = str;
            this.$onDismiss = function0;
            this.$archiveText = str2;
            this.$onConfirm = function02;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                BS0 bs0 = BRg.A00;
                BRg bRgA09 = C3U4.A09(C10G.A02, 16.0f);
                C9m9 c9m9A00 = AcQ.A00(12.0f);
                String str = this.$cancelText;
                Function0<Unit> function0 = this.$onDismiss;
                String str2 = this.$archiveText;
                Function0<Unit> function02 = this.$onConfirm;
                InterfaceC1380AiA interfaceC1380AiAA0Q = AnonymousClass006.A0Q(c9m9A00, bfm);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA09);
                Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function03);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0Q, akqA04, bRgA01, iA0J);
                C90m c90m = C90m.A00;
                AuraButtonStyles auraButtonStyles = AuraButtonStyles.INSTANCE;
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, str, null, c90m.AiP(bs0, 1.0f, true), auraButtonStyles.secondary(null, bfm, 48, 1), null, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 0, 0, 0, 134201317);
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, str2, null, AbstractC07539Wl.A00(c90m.AiP(bs0, 1.0f, true), "hatch-side-chat-archive-confirm-button"), auraButtonStyles.primaryAlt(null, bfm, 48, 1), null, null, false, false, false, false, false, null, null, function02, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 0, 0, 0, 134201317);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationScreenKt$ThreadArchiveConfirmationDialog$2, reason: invalid class name and case insensitive filesystem */
    public final class C114422 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114422(Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$onConfirm = function0;
            this.$onDismiss = function02;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchConversationScreenKt.ThreadArchiveConfirmationDialog(this.$onConfirm, this.$onDismiss, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationScreenKt$ThreadDeleteConfirmationDialog$1, reason: invalid class name and case insensitive filesystem */
    public final class C114431 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $cancelText;
        public final /* synthetic */ String $deleteText;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114431(String str, Function0<Unit> function0, String str2, Function0<Unit> function02) {
            super(2);
            this.$deleteText = str;
            this.$onConfirm = function0;
            this.$cancelText = str2;
            this.$onDismiss = function02;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$onDismiss, AnonymousClass001.A1R(bfm, this.$cancelText, AnonymousClass001.A1R(bfm, this.$onConfirm, bfm.A65(this.$deleteText))));
                String str = this.$deleteText;
                Function0<Unit> function0 = this.$onConfirm;
                String str2 = this.$cancelText;
                Function0<Unit> function02 = this.$onDismiss;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HatchConversationScreenKt$ThreadDeleteConfirmationDialog$1$1$1(str, function0, str2, function02);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass007.A14(bfm, objAaT);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationScreenKt$ThreadDeleteConfirmationDialog$2, reason: invalid class name and case insensitive filesystem */
    public final class C114442 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114442(Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$onConfirm = function0;
            this.$onDismiss = function02;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchConversationScreenKt.ThreadDeleteConfirmationDialog(this.$onConfirm, this.$onDismiss, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationScreenKt$ThreadRenameDialog$1, reason: invalid class name and case insensitive filesystem */
    public final class C114451 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $currentName;
        public final /* synthetic */ G0U<String, Unit> $onNameChange;
        public final /* synthetic */ String $placeholder;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C114451(String str, G0U<? super String, Unit> g0u, String str2) {
            super(2);
            this.$currentName = str;
            this.$onNameChange = g0u;
            this.$placeholder = str2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                ConversationSearchScreenKt.m504SearchTextFieldOqVHbNc(this.$currentName, this.$onNameChange, C10G.A02, false, false, null, false, null, this.$placeholder, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121102), null, null, null, 0L, bfm, 384, 384, 11512);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationScreenKt$ThreadRenameDialog$2, reason: invalid class name and case insensitive filesystem */
    public final class C114462 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $currentName;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ G0U<String, Unit> $onNameChange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C114462(String str, G0U<? super String, Unit> g0u, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$currentName = str;
            this.$onNameChange = g0u;
            this.$onConfirm = function0;
            this.$onDismiss = function02;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchConversationScreenKt.ThreadRenameDialog(this.$currentName, this.$onNameChange, this.$onConfirm, this.$onDismiss, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationScreenKt", f = "HatchConversationScreen.kt", l = {1493}, m = "awaitImeVisible", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.HatchConversationScreenKt$awaitImeVisible$1, reason: invalid class name and case insensitive filesystem */
    public final class C114471 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchConversationScreenKt.awaitImeVisible(null, this);
        }

        public C114471(HtJ<? super C114471> htJ) {
            super(htJ);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationScreenKt$buildDocumentMenuActions$1, reason: invalid class name and case insensitive filesystem */
    public final class C114491 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ String $fileName;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ String $relativePath;
        public final /* synthetic */ String $url;
        public final /* synthetic */ HatchConversationViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114491(HatchConversationViewModel hatchConversationViewModel, String str, AuraNavigator auraNavigator, String str2, String str3) {
            super(0);
            this.$viewModel = hatchConversationViewModel;
            this.$url = str;
            this.$navigator = auraNavigator;
            this.$fileName = str2;
            this.$relativePath = str3;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HatchConversationViewModel.ArtifactShareSnapshot artifactShareSnapshotPeekArtifactShareSnapshot = this.$viewModel.peekArtifactShareSnapshot(this.$url);
            this.$navigator.navigate((AuraNavKey) new PublishArtifactSheetKey(this.$url, this.$fileName, this.$relativePath, artifactShareSnapshotPeekArtifactShareSnapshot.deployedUrl, artifactShareSnapshotPeekArtifactShareSnapshot.hasPendingChanges, HatchSurface.CHAT), false);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationScreenKt$buildDocumentMenuActions$2, reason: invalid class name and case insensitive filesystem */
    public final class C114502 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $fileName;
        public final /* synthetic */ String $relativePath;
        public final /* synthetic */ HatchConversationViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114502(HatchConversationViewModel hatchConversationViewModel, Context context, String str, String str2) {
            super(0);
            this.$viewModel = hatchConversationViewModel;
            this.$context = context;
            this.$relativePath = str;
            this.$fileName = str2;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$viewModel.shareDocument(this.$context, this.$relativePath, this.$fileName);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationScreenKt$buildDocumentMenuActions$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $fileName;
        public final /* synthetic */ String $url;
        public final /* synthetic */ HatchConversationViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HatchConversationViewModel hatchConversationViewModel, Context context, String str, String str2) {
            super(0);
            this.$viewModel = hatchConversationViewModel;
            this.$context = context;
            this.$url = str;
            this.$fileName = str2;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$viewModel.downloadHtmlFile(this.$context, this.$url, this.$fileName);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationScreenKt$buildDocumentMenuActions$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $fileName;
        public final /* synthetic */ String $relativePath;
        public final /* synthetic */ HatchConversationViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(HatchConversationViewModel hatchConversationViewModel, Context context, String str, String str2) {
            super(0);
            this.$viewModel = hatchConversationViewModel;
            this.$context = context;
            this.$relativePath = str;
            this.$fileName = str2;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$viewModel.saveDocumentToGoogleDrive(this.$context, this.$relativePath, this.$fileName);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationScreenKt$buildDocumentMenuActions$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ HatchDocumentType $documentType;
        public final /* synthetic */ String $fileName;
        public final /* synthetic */ String $relativePath;
        public final /* synthetic */ String $url;
        public final /* synthetic */ HatchConversationViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(HatchConversationViewModel hatchConversationViewModel, Context context, String str, String str2, String str3, HatchDocumentType hatchDocumentType) {
            super(0);
            this.$viewModel = hatchConversationViewModel;
            this.$context = context;
            this.$url = str;
            this.$relativePath = str2;
            this.$fileName = str3;
            this.$documentType = hatchDocumentType;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$viewModel.downloadDocumentAsPdf(this.$context, this.$url, this.$relativePath, this.$fileName, this.$documentType);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationScreenKt$buildDocumentMenuActions$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $fileName;
        public final /* synthetic */ String $relativePath;
        public final /* synthetic */ HatchConversationViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(HatchConversationViewModel hatchConversationViewModel, Context context, String str, String str2) {
            super(0);
            this.$viewModel = hatchConversationViewModel;
            this.$context = context;
            this.$relativePath = str;
            this.$fileName = str2;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$viewModel.downloadDocument(this.$context, this.$relativePath, this.$fileName);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[PHI: r2 r12 r14
  0x0044: PHI (r2v2 com.facebook.aura.conversation.view.HatchConversationScreenKt$buildDocumentMenuActions$5) = 
  (r2v0 com.facebook.aura.conversation.view.HatchConversationScreenKt$buildDocumentMenuActions$5)
  (r2v3 com.facebook.aura.conversation.view.HatchConversationScreenKt$buildDocumentMenuActions$5)
 binds: [B:22:0x005c, B:16:0x0042] A[DONT_GENERATE, DONT_INLINE]
  0x0044: PHI (r12v2 com.facebook.aura.conversation.view.HatchConversationScreenKt$buildDocumentMenuActions$3) = 
  (r12v0 com.facebook.aura.conversation.view.HatchConversationScreenKt$buildDocumentMenuActions$3)
  (r12v3 com.facebook.aura.conversation.view.HatchConversationScreenKt$buildDocumentMenuActions$3)
 binds: [B:22:0x005c, B:16:0x0042] A[DONT_GENERATE, DONT_INLINE]
  0x0044: PHI (r14v3 com.facebook.aura.conversation.view.HatchConversationScreenKt$buildDocumentMenuActions$4) = 
  (r14v1 com.facebook.aura.conversation.view.HatchConversationScreenKt$buildDocumentMenuActions$4)
  (r14v4 com.facebook.aura.conversation.view.HatchConversationScreenKt$buildDocumentMenuActions$4)
 binds: [B:22:0x005c, B:16:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.conversation.view.richcontent.HatchDocumentChipMenuActions buildDocumentMenuActions(android.content.Context r13, com.facebook.aura.conversation.viewmodel.HatchConversationViewModel r14, com.facebook.aura.navigation.AuraNavigator r15, java.lang.String r16, java.lang.String r17, java.lang.String r18) {
        /*
            r3 = r14
            r5 = r16
            r7 = r17
            r0 = r18
            com.facebook.aura.conversation.viewmodel.HatchDocumentType r8 = r14.resolveDocumentType(r5, r7, r0)
            java.lang.String r6 = r14.resolveDocumentRelativePath(r5)
            boolean r1 = r8 instanceof com.facebook.aura.conversation.viewmodel.HatchDocumentType.Html
            if (r1 == 0) goto L1a
            boolean r2 = r14.isPublishableArtifact(r5)
            r0 = 1
            if (r2 != 0) goto L1b
        L1a:
            r0 = 0
        L1b:
            r11 = 0
            r4 = r13
            if (r0 == 0) goto L60
            com.facebook.aura.utils.HatchUtil r0 = com.facebook.aura.utils.HatchUtil.INSTANCE
            boolean r0 = r0.isArtifactSharingEnabled()
            if (r0 == 0) goto L5e
            com.facebook.aura.conversation.view.HatchConversationScreenKt$buildDocumentMenuActions$1 r9 = new com.facebook.aura.conversation.view.HatchConversationScreenKt$buildDocumentMenuActions$1
            r12 = r9
            r13 = r14
            r14 = r5
            r16 = r7
            r17 = r6
            r12.<init>(r13, r14, r15, r16, r17)
        L33:
            kotlin.jvm.functions.Function0 r9 = (kotlin.jvm.functions.Function0) r9
        L35:
            if (r1 == 0) goto L52
            com.facebook.aura.conversation.view.HatchConversationScreenKt$buildDocumentMenuActions$3 r12 = new com.facebook.aura.conversation.view.HatchConversationScreenKt$buildDocumentMenuActions$3
            r12.<init>(r3, r4, r5, r7)
            r14 = r11
        L3d:
            com.facebook.aura.conversation.view.HatchConversationScreenKt$buildDocumentMenuActions$5 r2 = new com.facebook.aura.conversation.view.HatchConversationScreenKt$buildDocumentMenuActions$5
            r2.<init>(r3, r4, r5, r6, r7, r8)
            if (r1 != 0) goto L49
        L44:
            com.facebook.aura.conversation.view.HatchConversationScreenKt$buildDocumentMenuActions$6 r11 = new com.facebook.aura.conversation.view.HatchConversationScreenKt$buildDocumentMenuActions$6
            r11.<init>(r3, r4, r6, r7)
        L49:
            com.facebook.aura.utils.ArtifactShareOption r10 = com.facebook.aura.utils.ArtifactShareOption.SHARE
            com.facebook.aura.conversation.view.richcontent.HatchDocumentChipMenuActions r8 = new com.facebook.aura.conversation.view.richcontent.HatchDocumentChipMenuActions
            r13 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r8
        L52:
            r12 = r11
            com.facebook.aura.conversation.view.HatchConversationScreenKt$buildDocumentMenuActions$4 r14 = new com.facebook.aura.conversation.view.HatchConversationScreenKt$buildDocumentMenuActions$4
            r14.<init>(r3, r4, r6, r7)
            boolean r0 = r8 instanceof com.facebook.aura.conversation.viewmodel.HatchDocumentType.Markdown
            if (r0 != 0) goto L3d
            r2 = r11
            goto L44
        L5e:
            r9 = r11
            goto L35
        L60:
            com.facebook.aura.conversation.view.HatchConversationScreenKt$buildDocumentMenuActions$2 r9 = new com.facebook.aura.conversation.view.HatchConversationScreenKt$buildDocumentMenuActions$2
            r9.<init>(r14, r13, r6, r7)
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationScreenKt.buildDocumentMenuActions(android.content.Context, com.facebook.aura.conversation.viewmodel.HatchConversationViewModel, com.facebook.aura.navigation.AuraNavigator, java.lang.String, java.lang.String, java.lang.String):com.facebook.aura.conversation.view.richcontent.HatchDocumentChipMenuActions");
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationScreenKt$awaitImeVisible$2, reason: invalid class name and case insensitive filesystem */
    public final class C114482 extends AbstractC7559F3s implements G0U<Long, Unit> {
        public static final C114482 INSTANCE = new C114482();

        public C114482() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            return AnonymousClass001.A0x(l);
        }

        public final void invoke(long j) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00e0  */
    /* renamed from: ConversationTabChrome-mgnxx2k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m567ConversationTabChromemgnxx2k(java.lang.String r67, X.BRg r68, X.B6A r69, java.lang.String r70, X.BRg r71, float r72, boolean r73, java.lang.String r74, X.AHD<? extends com.facebook.aura.header.view.HeaderButton> r75, com.facebook.aura.header.view.HeaderButton r76, com.facebook.aura.header.view.HeaderLeadingButton r77, kotlin.jvm.functions.Function0<kotlin.Unit> r78, X.G0U<? super com.facebook.aura.header.view.HeaderLeadingButton, kotlin.Unit> r79, X.G0U<? super com.facebook.aura.header.view.HeaderButton, kotlin.Unit> r80, X.AHD<com.facebook.aura.header.api.HeaderAction> r81, X.G2j<? super X.C1DG, ? super X.C1DG, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r82, X.BFM r83, int r84, int r85, int r86) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationScreenKt.m567ConversationTabChromemgnxx2k(java.lang.String, X.BRg, X.B6A, java.lang.String, X.BRg, float, boolean, java.lang.String, X.AHD, com.facebook.aura.header.view.HeaderButton, com.facebook.aura.header.view.HeaderLeadingButton, kotlin.jvm.functions.Function0, X.G0U, X.G0U, X.AHD, X.G2j, X.BFM, int, int, int):void");
    }

    public static final void ThreadArchiveConfirmationDialog(Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(function0, function02);
        bfm.AgG(-822034457);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function02);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraAlertDialogKt.AuraAlertDialog(bRg2, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1210f6), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1210f5), (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) null, B1V.A00(bfm, new AnonymousClass1(AnonymousClass001.A0r(bfm), function02, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1210f1), function0), 829835384), function02, (BA2) null, zA1b, zA1b, (G0U<? super String, Unit>) null, bfm, AnonymousClass006.A04((iA0T >> 6) & 14, 196608, iA0T), zA1b ? 1 : 0, 1944);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C114422(function0, function02, bRg2, i, i2);
        }
    }

    public static final void ThreadDeleteConfirmationDialog(Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(function0, function02);
        bfm.AgG(-2143078656);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function02);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraAlertDialogKt.AuraAlertDialog(bRg2, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1210fb), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1210fa), (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) null, B1V.A00(bfm, new C114431(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1210f2), function0, AnonymousClass001.A0r(bfm), function02), 1235343439), function02, (BA2) null, zA1b, zA1b, (G0U<? super String, Unit>) null, bfm, AnonymousClass006.A04((iA0T >> 6) & 14, 196608, iA0T), zA1b ? 1 : 0, 1944);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C114442(function0, function02, bRg2, i, i2);
        }
    }

    public static final void ThreadRenameDialog(String str, G0U<? super String, Unit> g0u, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        AnonymousClass005.A11(g0u, function0, function02, 1);
        bfm.AgG(-1568800988);
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
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121105);
            int i4 = iA0d & 14;
            int i5 = iA0d << 12;
            HatchRenameDialogKt.HatchRenameDialog(str, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121103), strA01, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121106), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121101), g0u, function0, function02, bRg2, false, 0, B1V.A00(bfm, new C114451(str, g0u, strA01), -1911753881), true, null, bfm, AnonymousClass005.A03(i5, AnonymousClass001.A07(i5, i4) | (3670016 & i5)), 432, 9728);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C114462(str, g0u, function0, function02, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitImeVisible(android.view.View r5, X.HtJ<? super kotlin.Unit> r6) {
        /*
            boolean r0 = r6 instanceof com.facebook.aura.conversation.view.HatchConversationScreenKt.C114471
            if (r0 == 0) goto L44
            r4 = r6
            com.facebook.aura.conversation.view.HatchConversationScreenKt$awaitImeVisible$1 r4 = (com.facebook.aura.conversation.view.HatchConversationScreenKt.C114471) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L44
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L21
            if (r0 != r2) goto L4a
            java.lang.Object r5 = r4.L$0
            android.view.View r5 = (android.view.View) r5
        L21:
            X.Hwg.A00(r1)
        L24:
            X.Ff4 r0 = X.AbstractC8508FfF.A00(r5)
            if (r0 == 0) goto L37
            r1 = 8
            X.Ff3 r0 = r0.A00
            boolean r0 = r0.A0C(r1)
            if (r0 != r2) goto L37
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        L37:
            com.facebook.aura.conversation.view.HatchConversationScreenKt$awaitImeVisible$2 r0 = com.facebook.aura.conversation.view.HatchConversationScreenKt.C114482.INSTANCE
            r4.L$0 = r5
            r4.label = r2
            java.lang.Object r0 = X.AvW.A01(r0, r4)
            if (r0 != r3) goto L24
            return r3
        L44:
            com.facebook.aura.conversation.view.HatchConversationScreenKt$awaitImeVisible$1 r4 = new com.facebook.aura.conversation.view.HatchConversationScreenKt$awaitImeVisible$1
            r4.<init>(r6)
            goto L12
        L4a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationScreenKt.awaitImeVisible(android.view.View, X.HtJ):java.lang.Object");
    }

    public static final AHD<HeaderButton> conversationHeaderButtons(boolean z, boolean z2, boolean z3, AbstractC3358CGz abstractC3358CGz) {
        HeaderButton headerButtonHeaderInviteButton;
        if (z) {
            headerButtonHeaderInviteButton = headerInviteButton(abstractC3358CGz);
        } else {
            if (z3) {
                return AHI.A01;
            }
            headerButtonHeaderInviteButton = HeaderButton.MoreOptions;
            if (!z2) {
                headerButtonHeaderInviteButton = null;
            }
        }
        return AGI.A07(AbstractC0885AGm.A0z(headerButtonHeaderInviteButton));
    }

    public static final HeaderLeadingButton conversationLeadingButton(boolean z) {
        return z ? HeaderLeadingButton.Back : HeaderLeadingButton.SidePanel;
    }

    public static final Uri createTempFileUri(Context context) {
        return HatchFileProviderUtil.INSTANCE.createCaptureUri(context);
    }

    public static final HatchComposerEntryPoint getSendButtonEntryPoint(HatchPendingMessage.PendingPayload pendingPayload) {
        HatchComposerEntryPoint hatchComposerEntryPoint = pendingPayload.entryPoint;
        if (isCardAutoSend(pendingPayload)) {
            return hatchComposerEntryPoint;
        }
        return null;
    }

    public static final HeaderButton headerInviteButton(AbstractC3358CGz abstractC3358CGz) {
        HeaderButton headerButton = HeaderButton.InviteFriends;
        if (ConfidentialSessionGate.Companion.getInstance(abstractC3358CGz).getShouldHideUnsupportedCvmFeatures() || !HatchUtil.INSTANCE.isInviteFriendsEnabled()) {
            return null;
        }
        return headerButton;
    }

    public static final boolean isCardAutoSend(HatchPendingMessage.PendingPayload pendingPayload) {
        return AnonymousClass002.A1Z(pendingPayload.entryPoint, HatchComposerEntryPoint.CARD_AUTO_SEND);
    }

    public static final void logNotificationPermission(HatchEventType hatchEventType) {
        HatchInteractionLogger.INSTANCE.logPermission(hatchEventType, HatchSurface.PERMISSIONS, null, HatchScreen.NOTIFICATION_PERMISSION, HatchComponent.NOTIFICATION_PERMISSION, null);
    }

    public static final void ComposerLaunchEffect(HatchConversationViewModel hatchConversationViewModel, BFM bfm, int i) {
        bfm.AgG(1496835312);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchConversationViewModel, bfm, i) ? 1 : 0) | i : i;
        boolean z = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 3, 2), bfm, iA05)) {
            ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
            HatchIntentViewModel hatchIntentViewModel = (HatchIntentViewModel) BQN.A00(null, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), null, new C0861A6i(HatchIntentViewModel.class));
            F2N f2nA00 = C1HY.A00(bfm);
            boolean zA1M = AnonymousClass003.A1M(bfm, f2nA00, hatchIntentViewModel);
            if ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(hatchConversationViewModel))) {
                z = true;
            }
            boolean z2 = zA1M | z;
            Object objAaT = bfm.AaT();
            if (z2 || objAaT == C78N.A00) {
                objAaT = new HatchConversationScreenKt$ComposerLaunchEffect$1$1(f2nA00, hatchIntentViewModel, hatchConversationViewModel, null);
                bfm.Ai0(objAaT);
            }
            C78e.A02(bfm, hatchIntentViewModel, hatchConversationViewModel, f2nA00, (G0V) objAaT);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(hatchConversationViewModel, i);
        }
    }

    public static final long HatchConversationScreen$lambda$15(C1BO<Long> c1bo) {
        return c1bo.getValue().longValue();
    }

    public static final long HatchConversationScreen$lambda$17(C1BO<Long> c1bo) {
        return c1bo.getValue().longValue();
    }

    public static final void InboundLinkEffect(AHD<? extends ConversationPresentationAction> ahd, BFM bfm, int i) {
        bfm.AgG(506652185);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(ahd, bfm, i) ? 1 : 0) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA05), bfm, iA05)) {
            ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
            HatchIntentViewModel hatchIntentViewModel = (HatchIntentViewModel) BQN.A00(null, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), null, new C0861A6i(HatchIntentViewModel.class));
            MutableState mutableStateA00 = C1er.A00(bfm, ahd);
            F2N f2nA00 = C1HY.A00(bfm);
            boolean zA1O = AnonymousClass003.A1O(bfm, hatchIntentViewModel, mutableStateA00, bfm.A67(f2nA00));
            Object objAaT = bfm.AaT();
            if (zA1O || objAaT == C78N.A00) {
                objAaT = new HatchConversationScreenKt$InboundLinkEffect$1$1(f2nA00, hatchIntentViewModel, mutableStateA00, null);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A1A(bfm, objAaT, hatchIntentViewModel, f2nA00);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C114412(ahd, i);
        }
    }

    public static final /* synthetic */ HatchConversationUiState access$HatchConversationScreen$lambda$6(C1BO c1bo) {
        return (HatchConversationUiState) c1bo.getValue();
    }

    public static final /* synthetic */ HatchSessionItem access$HatchConversationScreen$lambda$8(C1BO c1bo) {
        return (HatchSessionItem) c1bo.getValue();
    }

    public static final /* synthetic */ PendingDeeplinkMessage access$HatchConversationScreen$lambda$9(C1BO c1bo) {
        return (PendingDeeplinkMessage) c1bo.getValue();
    }

    public static final String conversationHeaderTitle(boolean z, String str, boolean z2, boolean z3, BFM bfm, int i) {
        int i2;
        bfm.AgE(942573401);
        if (z) {
            AnonymousClass002.A19(bfm);
            return null;
        }
        if (str == null || C7BY.A0j(str)) {
            if (z2) {
                bfm.AgE(-425051469);
                i2 = R.string._name_removed__res_0x7f12086e;
            } else if (z3) {
                bfm.AgE(-425048520);
                i2 = R.string._name_removed__res_0x7f120895;
            } else {
                AnonymousClass003.A0l(bfm, -291524763);
                str = "";
            }
            str = AnonymousClass003.A0e(bfm, i2);
        }
        AnonymousClass002.A19(bfm);
        return str;
    }

    public static final AHD<HeaderAction> rememberConversationHeaderActions(ConversationHeaderContext conversationHeaderContext, BFM bfm, int i) {
        Object objAaT = bfm.AaT();
        Object obj = C78N.A00;
        if (objAaT == obj) {
            objAaT = ConversationHeaderActions.INSTANCE.contributors();
            bfm.Ai0(objAaT);
        }
        bfm.AgE(528746627);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) objAaT).iterator();
        while (it.hasNext()) {
            HeaderAction headerActionRememberAction = ((ConversationHeaderActionContributor) it.next()).rememberAction(conversationHeaderContext, bfm, i & 14);
            if (headerActionRememberAction != null) {
                arrayList.add(headerActionRememberAction);
            }
        }
        AnonymousClass002.A19(bfm);
        boolean zA65 = bfm.A65(arrayList);
        Object objAaT2 = bfm.AaT();
        if (zA65 || objAaT2 == obj) {
            objAaT2 = AnonymousClass001.A0z(bfm, arrayList);
        }
        return (AHD) objAaT2;
    }

    public static final AHD<ConversationPresentationAction> rememberConversationPresentationActions(ConversationPresentationActionContext conversationPresentationActionContext, BFM bfm, int i) {
        Object objAaT = bfm.AaT();
        Object obj = C78N.A00;
        if (objAaT == obj) {
            objAaT = ConversationPresentationActions.INSTANCE.contributors();
            bfm.Ai0(objAaT);
        }
        bfm.AgE(-2081149549);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) objAaT).iterator();
        while (it.hasNext()) {
            ConversationPresentationAction conversationPresentationActionRememberAction = ((ConversationPresentationActionContributor) it.next()).rememberAction(conversationPresentationActionContext, bfm, i & 14);
            if (conversationPresentationActionRememberAction != null) {
                arrayList.add(conversationPresentationActionRememberAction);
            }
        }
        AnonymousClass002.A19(bfm);
        boolean zA65 = bfm.A65(arrayList);
        Object objAaT2 = bfm.AaT();
        if (zA65 || objAaT2 == obj) {
            objAaT2 = AnonymousClass001.A0z(bfm, arrayList);
        }
        return (AHD) objAaT2;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x05de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ConversationScreenDecoration(boolean r69, com.facebook.aura.conversation.viewmodel.HatchConversationUiState r70, java.lang.String r71, X.BRg r72, kotlin.jvm.functions.Function0<kotlin.Unit> r73, kotlin.jvm.functions.Function0<kotlin.Unit> r74, boolean r75, java.lang.String r76, kotlin.jvm.functions.Function0<kotlin.Unit> r77, java.lang.String r78, boolean r79, boolean r80, boolean r81, kotlin.jvm.functions.Function0<kotlin.Unit> r82, kotlin.jvm.functions.Function0<kotlin.Unit> r83, boolean r84, boolean r85, com.facebook.aura.model.HatchMessageChannel r86, boolean r87, boolean r88, kotlin.jvm.functions.Function0<kotlin.Unit> r89, kotlin.jvm.functions.Function0<kotlin.Unit> r90, X.G0V<? super java.lang.String, ? super X.G0U<? super java.lang.Boolean, kotlin.Unit>, kotlin.Unit> r91, kotlin.jvm.functions.Function0<kotlin.Unit> r92, boolean r93, kotlin.jvm.functions.Function0<kotlin.Unit> r94, X.G2j<? super X.C1DG, ? super X.C1DG, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r95, X.BFM r96, int r97, int r98, int r99, int r100) {
        /*
            Method dump skipped, instructions count: 2655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationScreenKt.ConversationScreenDecoration(boolean, com.facebook.aura.conversation.viewmodel.HatchConversationUiState, java.lang.String, X.BRg, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, java.lang.String, kotlin.jvm.functions.Function0, java.lang.String, boolean, boolean, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, boolean, com.facebook.aura.model.HatchMessageChannel, boolean, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.G0V, kotlin.jvm.functions.Function0, boolean, kotlin.jvm.functions.Function0, X.G2j, X.BFM, int, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:260:0x05a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchConversationScreen(boolean r60, X.G0U<? super java.lang.String, kotlin.Unit> r61, X.BRg r62, boolean r63, java.lang.String r64, boolean r65, java.lang.String r66, java.lang.Long r67, com.facebook.aura.conversation.viewmodel.HatchConversationViewModel r68, X.BFM r69, int r70, int r71) {
        /*
            Method dump skipped, instructions count: 1732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationScreenKt.HatchConversationScreen(boolean, X.G0U, X.BRg, boolean, java.lang.String, boolean, java.lang.String, java.lang.Long, com.facebook.aura.conversation.viewmodel.HatchConversationViewModel, X.BFM, int, int):void");
    }
}
