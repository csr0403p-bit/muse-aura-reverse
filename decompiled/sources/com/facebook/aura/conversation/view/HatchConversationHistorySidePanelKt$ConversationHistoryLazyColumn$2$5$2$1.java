package com.facebook.aura.conversation.view;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass007;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.view.View;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.conversation.repo.HatchThreadsRepository;
import com.facebook.aura.gateway.HatchSessionItem;
import com.facebook.aura.vds.toast.AuraToast;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$5$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<HatchSessionItem> $actionOverlaySession$delegate;
    public final /* synthetic */ C3UX $actionScope;
    public final /* synthetic */ String $pinFailedMessage;
    public final /* synthetic */ String $pinSuccessMessage;
    public final /* synthetic */ HatchSessionItem $session;
    public final /* synthetic */ HatchThreadsRepository $threadsRepo;
    public final /* synthetic */ String $unpinFailedMessage;
    public final /* synthetic */ String $unpinSuccessMessage;
    public final /* synthetic */ View $viewRoot;

    @DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$5$2$1$1", f = "HatchConversationHistorySidePanel.kt", l = {1294, 1296}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$5$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $failedMessage;
        public final /* synthetic */ HatchSessionItem $session;
        public final /* synthetic */ String $successMessage;
        public final /* synthetic */ HatchThreadsRepository $threadsRepo;
        public final /* synthetic */ View $viewRoot;
        public final /* synthetic */ boolean $wasPinned;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, HatchThreadsRepository hatchThreadsRepository, HatchSessionItem hatchSessionItem, View view, String str, String str2, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$wasPinned = z;
            this.$threadsRepo = hatchThreadsRepository;
            this.$session = hatchSessionItem;
            this.$viewRoot = view;
            this.$successMessage = str;
            this.$failedMessage = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$wasPinned, this.$threadsRepo, this.$session, this.$viewRoot, this.$successMessage, this.$failedMessage, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                boolean z = this.$wasPinned;
                HatchThreadsRepository hatchThreadsRepository = this.$threadsRepo;
                String str = this.$session.sessionId;
                if (z) {
                    this.label = 1;
                    obj = hatchThreadsRepository.unpinSession(str, this);
                } else {
                    this.label = 2;
                    obj = hatchThreadsRepository.pinSession(str, this);
                }
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1 && i != 2) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            boolean zA1X = AnonymousClass001.A1X(obj);
            AnonymousClass007.A0n(this.$viewRoot, AuraToast.Companion, zA1X ? this.$successMessage : this.$failedMessage);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$5$2$1(HatchSessionItem hatchSessionItem, String str, String str2, String str3, String str4, C3UX c3ux, MutableState<HatchSessionItem> mutableState, HatchThreadsRepository hatchThreadsRepository, View view) {
        super(0);
        this.$session = hatchSessionItem;
        this.$unpinSuccessMessage = str;
        this.$unpinFailedMessage = str2;
        this.$pinSuccessMessage = str3;
        this.$pinFailedMessage = str4;
        this.$actionScope = c3ux;
        this.$actionOverlaySession$delegate = mutableState;
        this.$threadsRepo = hatchThreadsRepository;
        this.$viewRoot = view;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        String str;
        String str2;
        MutableState<HatchSessionItem> mutableState = this.$actionOverlaySession$delegate;
        float f = HatchConversationHistorySidePanelKt.SidePanelBottomActionSize;
        mutableState.Af8(null);
        HatchSessionItem hatchSessionItem = this.$session;
        boolean z = hatchSessionItem.isPinned;
        if (z) {
            str = this.$unpinSuccessMessage;
            str2 = this.$unpinFailedMessage;
        } else {
            str = this.$pinSuccessMessage;
            str2 = this.$pinFailedMessage;
        }
        AnonymousClass001.A1J(new AnonymousClass1(z, this.$threadsRepo, hatchSessionItem, this.$viewRoot, str, str2, null), this.$actionScope);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
