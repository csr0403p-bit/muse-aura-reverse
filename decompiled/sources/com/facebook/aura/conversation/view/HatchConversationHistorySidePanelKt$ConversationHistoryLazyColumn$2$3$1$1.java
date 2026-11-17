package com.facebook.aura.conversation.view;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass007;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.view.View;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.conversation.repo.ArchiveSessionResult;
import com.facebook.aura.conversation.repo.HatchThreadsRepository;
import com.facebook.aura.gateway.HatchSessionItem;
import com.facebook.aura.vds.toast.AuraToast;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$3$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C3UX $actionScope;
    public final /* synthetic */ String $archiveFailedMessage;
    public final /* synthetic */ MutableState<HatchSessionItem> $archiveSession$delegate;
    public final /* synthetic */ String $archiveSuccessMessage;
    public final /* synthetic */ String $archiveVoiceCallActiveMessage;
    public final /* synthetic */ HatchSessionItem $sessionToArchive;
    public final /* synthetic */ HatchThreadsRepository $threadsRepo;
    public final /* synthetic */ View $viewRoot;

    @DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$3$1$1$1", f = "HatchConversationHistorySidePanel.kt", l = {1221}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$3$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $archiveFailedMessage;
        public final /* synthetic */ String $archiveSuccessMessage;
        public final /* synthetic */ String $archiveVoiceCallActiveMessage;
        public final /* synthetic */ HatchSessionItem $sessionToArchive;
        public final /* synthetic */ HatchThreadsRepository $threadsRepo;
        public final /* synthetic */ View $viewRoot;
        public int label;

        /* renamed from: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$3$1$1$1$WhenMappings */
        /* loaded from: classes3.dex */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ArchiveSessionResult.values().length];
                try {
                    AnonymousClass002.A13(ArchiveSessionResult.SUCCESS, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(ArchiveSessionResult.VOICE_CALL_ACTIVE, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    AnonymousClass002.A15(ArchiveSessionResult.FAILED, iArr);
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchThreadsRepository hatchThreadsRepository, HatchSessionItem hatchSessionItem, View view, String str, String str2, String str3, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$threadsRepo = hatchThreadsRepository;
            this.$sessionToArchive = hatchSessionItem;
            this.$viewRoot = view;
            this.$archiveSuccessMessage = str;
            this.$archiveVoiceCallActiveMessage = str2;
            this.$archiveFailedMessage = str3;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$threadsRepo, this.$sessionToArchive, this.$viewRoot, this.$archiveSuccessMessage, this.$archiveVoiceCallActiveMessage, this.$archiveFailedMessage, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            String str;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchThreadsRepository hatchThreadsRepository = this.$threadsRepo;
                String str2 = this.$sessionToArchive.sessionId;
                this.label = 1;
                obj = hatchThreadsRepository.archiveSession(str2, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            AuraToast.Companion companion = AuraToast.Companion;
            View view = this.$viewRoot;
            int iOrdinal = ((ArchiveSessionResult) obj).ordinal();
            if (iOrdinal == 0) {
                str = this.$archiveSuccessMessage;
            } else if (iOrdinal == 1) {
                str = this.$archiveVoiceCallActiveMessage;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = this.$archiveFailedMessage;
            }
            AnonymousClass007.A0l(view, companion, AuraToast.Duration.SHORT, str);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$3$1$1(C3UX c3ux, MutableState<HatchSessionItem> mutableState, HatchThreadsRepository hatchThreadsRepository, HatchSessionItem hatchSessionItem, View view, String str, String str2, String str3) {
        super(0);
        this.$actionScope = c3ux;
        this.$archiveSession$delegate = mutableState;
        this.$threadsRepo = hatchThreadsRepository;
        this.$sessionToArchive = hatchSessionItem;
        this.$viewRoot = view;
        this.$archiveSuccessMessage = str;
        this.$archiveVoiceCallActiveMessage = str2;
        this.$archiveFailedMessage = str3;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState<HatchSessionItem> mutableState = this.$archiveSession$delegate;
        float f = HatchConversationHistorySidePanelKt.SidePanelBottomActionSize;
        mutableState.Af8(null);
        AnonymousClass001.A1J(new AnonymousClass1(this.$threadsRepo, this.$sessionToArchive, this.$viewRoot, this.$archiveSuccessMessage, this.$archiveVoiceCallActiveMessage, this.$archiveFailedMessage, null), this.$actionScope);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
