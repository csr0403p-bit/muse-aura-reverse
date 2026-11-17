package com.facebook.aura.conversation.view;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.conversation.repo.HatchThreadsRepository;
import com.facebook.aura.conversation.repo.ThreadsView;
import com.facebook.aura.gateway.HatchSessionItem;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$5$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<HatchSessionItem> $actionOverlaySession$delegate;
    public final /* synthetic */ C3UX $actionScope;
    public final /* synthetic */ MutableState<HatchSessionItem> $archiveSession$delegate;
    public final /* synthetic */ HatchSessionItem $session;
    public final /* synthetic */ HatchThreadsRepository $threadsRepo;
    public final /* synthetic */ ThreadsView $view;

    @DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$5$3$1$1", f = "HatchConversationHistorySidePanel.kt", l = {1273}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$5$3$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchSessionItem $session;
        public final /* synthetic */ HatchThreadsRepository $threadsRepo;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchThreadsRepository hatchThreadsRepository, HatchSessionItem hatchSessionItem, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$threadsRepo = hatchThreadsRepository;
            this.$session = hatchSessionItem;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$threadsRepo, this.$session, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchThreadsRepository hatchThreadsRepository = this.$threadsRepo;
                String str = this.$session.sessionId;
                this.label = 1;
                if (hatchThreadsRepository.unarchiveSession(str, this) == enumC10460Hji) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$5$3$1(ThreadsView threadsView, C3UX c3ux, HatchSessionItem hatchSessionItem, MutableState<HatchSessionItem> mutableState, HatchThreadsRepository hatchThreadsRepository, MutableState<HatchSessionItem> mutableState2) {
        super(0);
        this.$view = threadsView;
        this.$actionScope = c3ux;
        this.$session = hatchSessionItem;
        this.$actionOverlaySession$delegate = mutableState;
        this.$threadsRepo = hatchThreadsRepository;
        this.$archiveSession$delegate = mutableState2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState<HatchSessionItem> mutableState = this.$actionOverlaySession$delegate;
        float f = HatchConversationHistorySidePanelKt.SidePanelBottomActionSize;
        mutableState.Af8(null);
        if (this.$view != ThreadsView.ARCHIVED) {
            this.$archiveSession$delegate.Af8(this.$session);
        } else {
            AnonymousClass001.A1J(new AnonymousClass1(this.$threadsRepo, this.$session, null), this.$actionScope);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
