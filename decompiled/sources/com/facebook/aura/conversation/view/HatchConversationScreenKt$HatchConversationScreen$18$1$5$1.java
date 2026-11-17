package com.facebook.aura.conversation.view;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass007;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.view.View;
import com.facebook.aura.conversation.repo.HatchThreadsRepository;
import com.facebook.aura.conversation.repo.RenameSessionResult;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import com.facebook.aura.vds.toast.AuraToast;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class HatchConversationScreenKt$HatchConversationScreen$18$1$5$1 extends AbstractC7559F3s implements G0V<String, G0U<? super Boolean, ? extends Unit>, Unit> {
    public final /* synthetic */ C3UX $archiveScope;
    public final /* synthetic */ String $renameFailedMessage;
    public final /* synthetic */ String $renameTooLongMessage;
    public final /* synthetic */ HatchThreadsRepository $threadsRepository;
    public final /* synthetic */ View $view;
    public final /* synthetic */ HatchConversationViewModel $viewModel;

    @DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationScreenKt$HatchConversationScreen$18$1$5$1$1", f = "HatchConversationScreen.kt", l = {674}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.HatchConversationScreenKt$HatchConversationScreen$18$1$5$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $newTitle;
        public final /* synthetic */ G0U<Boolean, Unit> $onResult;
        public final /* synthetic */ String $renameFailedMessage;
        public final /* synthetic */ String $renameTooLongMessage;
        public final /* synthetic */ HatchThreadsRepository $threadsRepository;
        public final /* synthetic */ View $view;
        public final /* synthetic */ HatchConversationViewModel $viewModel;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(HatchThreadsRepository hatchThreadsRepository, HatchConversationViewModel hatchConversationViewModel, String str, View view, String str2, String str3, G0U<? super Boolean, Unit> g0u, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$threadsRepository = hatchThreadsRepository;
            this.$viewModel = hatchConversationViewModel;
            this.$newTitle = str;
            this.$view = view;
            this.$renameTooLongMessage = str2;
            this.$renameFailedMessage = str3;
            this.$onResult = g0u;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$threadsRepository, this.$viewModel, this.$newTitle, this.$view, this.$renameTooLongMessage, this.$renameFailedMessage, this.$onResult, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            boolean z = true;
            if (i == 0) {
                Hwg.A00(obj);
                HatchThreadsRepository hatchThreadsRepository = this.$threadsRepository;
                String str = this.$viewModel.sessionId;
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
            if (obj != RenameSessionResult.SUCCESS) {
                z = false;
                AnonymousClass007.A0l(this.$view, AuraToast.Companion, AuraToast.Duration.SHORT, obj == RenameSessionResult.TITLE_TOO_LONG ? this.$renameTooLongMessage : this.$renameFailedMessage);
            }
            AnonymousClass001.A1K(z, this.$onResult);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationScreenKt$HatchConversationScreen$18$1$5$1(C3UX c3ux, HatchThreadsRepository hatchThreadsRepository, HatchConversationViewModel hatchConversationViewModel, View view, String str, String str2) {
        super(2);
        this.$archiveScope = c3ux;
        this.$threadsRepository = hatchThreadsRepository;
        this.$viewModel = hatchConversationViewModel;
        this.$view = view;
        this.$renameTooLongMessage = str;
        this.$renameFailedMessage = str2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(String str, G0U<? super Boolean, ? extends Unit> g0u) {
        invoke2(str, (G0U<? super Boolean, Unit>) g0u);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str, G0U<? super Boolean, Unit> g0u) {
        AnonymousClass003.A0u(str, g0u);
        AnonymousClass001.A1J(new AnonymousClass1(this.$threadsRepository, this.$viewModel, str, this.$view, this.$renameTooLongMessage, this.$renameFailedMessage, g0u, null), this.$archiveScope);
    }
}
