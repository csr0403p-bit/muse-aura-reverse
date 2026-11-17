package com.facebook.aura.conversation.view;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.conversation.repo.HatchThreadsRepository;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationScreenKt$HatchConversationScreen$18$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C3UX $archiveScope;
    public final /* synthetic */ HatchThreadsRepository $threadsRepository;
    public final /* synthetic */ HatchConversationViewModel $viewModel;

    @DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationScreenKt$HatchConversationScreen$18$1$2$1$1", f = "HatchConversationScreen.kt", l = {632}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.HatchConversationScreenKt$HatchConversationScreen$18$1$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchThreadsRepository $threadsRepository;
        public final /* synthetic */ HatchConversationViewModel $viewModel;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchThreadsRepository hatchThreadsRepository, HatchConversationViewModel hatchConversationViewModel, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$threadsRepository = hatchThreadsRepository;
            this.$viewModel = hatchConversationViewModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$threadsRepository, this.$viewModel, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchThreadsRepository hatchThreadsRepository = this.$threadsRepository;
                String str = this.$viewModel.sessionId;
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
    public HatchConversationScreenKt$HatchConversationScreen$18$1$2$1(C3UX c3ux, HatchThreadsRepository hatchThreadsRepository, HatchConversationViewModel hatchConversationViewModel) {
        super(0);
        this.$archiveScope = c3ux;
        this.$threadsRepository = hatchThreadsRepository;
        this.$viewModel = hatchConversationViewModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AnonymousClass001.A1J(new AnonymousClass1(this.$threadsRepository, this.$viewModel, null), this.$archiveScope);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
