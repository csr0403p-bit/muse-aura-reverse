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
import com.facebook.aura.conversation.repo.HatchThreadsRepository;
import com.facebook.aura.conversation.repo.RenameSessionResult;
import com.facebook.aura.gateway.HatchSessionItem;
import com.facebook.aura.vds.toast.AuraToast;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$2$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C3UX $actionScope;
    public final /* synthetic */ MutableState<HatchSessionItem> $renameSession$delegate;
    public final /* synthetic */ MutableState<String> $renameText$delegate;
    public final /* synthetic */ String $renameTooLongMessage;
    public final /* synthetic */ HatchSessionItem $sessionToRename;
    public final /* synthetic */ HatchThreadsRepository $threadsRepo;
    public final /* synthetic */ View $viewRoot;

    @DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$2$2$1$1", f = "HatchConversationHistorySidePanel.kt", l = {1197}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$2$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $newTitle;
        public final /* synthetic */ MutableState<HatchSessionItem> $renameSession$delegate;
        public final /* synthetic */ String $renameTooLongMessage;
        public final /* synthetic */ HatchSessionItem $sessionToRename;
        public final /* synthetic */ HatchThreadsRepository $threadsRepo;
        public final /* synthetic */ View $viewRoot;
        public int label;

        /* renamed from: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$2$2$1$1$WhenMappings */
        /* loaded from: classes3.dex */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[RenameSessionResult.values().length];
                try {
                    AnonymousClass002.A13(RenameSessionResult.SUCCESS, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(RenameSessionResult.TITLE_TOO_LONG, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    AnonymousClass002.A15(RenameSessionResult.FAILED, iArr);
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchThreadsRepository hatchThreadsRepository, HatchSessionItem hatchSessionItem, String str, View view, String str2, MutableState<HatchSessionItem> mutableState, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$threadsRepo = hatchThreadsRepository;
            this.$sessionToRename = hatchSessionItem;
            this.$newTitle = str;
            this.$viewRoot = view;
            this.$renameTooLongMessage = str2;
            this.$renameSession$delegate = mutableState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$threadsRepo, this.$sessionToRename, this.$newTitle, this.$viewRoot, this.$renameTooLongMessage, this.$renameSession$delegate, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchThreadsRepository hatchThreadsRepository = this.$threadsRepo;
                String str = this.$sessionToRename.sessionId;
                String str2 = this.$newTitle;
                this.label = 1;
                obj = hatchThreadsRepository.renameSession(str, str2, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            int iOrdinal = ((RenameSessionResult) obj).ordinal();
            if (iOrdinal == 0) {
                MutableState<HatchSessionItem> mutableState = this.$renameSession$delegate;
                float f = HatchConversationHistorySidePanelKt.SidePanelBottomActionSize;
                mutableState.Af8(null);
            } else if (iOrdinal == 1) {
                AuraToast.Companion companion = AuraToast.Companion;
                AnonymousClass007.A0l(this.$viewRoot, companion, AuraToast.Duration.SHORT, this.$renameTooLongMessage);
            } else if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$2$2$1(C3UX c3ux, MutableState<String> mutableState, HatchThreadsRepository hatchThreadsRepository, HatchSessionItem hatchSessionItem, View view, String str, MutableState<HatchSessionItem> mutableState2) {
        super(0);
        this.$actionScope = c3ux;
        this.$renameText$delegate = mutableState;
        this.$threadsRepo = hatchThreadsRepository;
        this.$sessionToRename = hatchSessionItem;
        this.$viewRoot = view;
        this.$renameTooLongMessage = str;
        this.$renameSession$delegate = mutableState2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState<String> mutableState = this.$renameText$delegate;
        float f = HatchConversationHistorySidePanelKt.SidePanelBottomActionSize;
        String strA06 = MutableState.A06((MutableState) mutableState);
        if (strA06.length() > 0) {
            AnonymousClass001.A1J(new AnonymousClass1(this.$threadsRepo, this.$sessionToRename, strA06, this.$viewRoot, this.$renameTooLongMessage, this.$renameSession$delegate, null), this.$actionScope);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
