package com.facebook.aura.conversation.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.Awn;
import X.C10649I0t;
import X.C20Z;
import X.C3UX;
import X.EnumC10460Hji;
import X.EnumC10573Huf;
import X.F2N;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import com.facebook.aura.deeplink.HatchIntentViewModel;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationScreenKt$ComposerLaunchEffect$1$1", f = "HatchConversationScreen.kt", l = {1260}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConversationScreenKt$ComposerLaunchEffect$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ HatchIntentViewModel $intentViewModel;
    public final /* synthetic */ F2N $lifecycle;
    public final /* synthetic */ HatchConversationViewModel $viewModel;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationScreenKt$ComposerLaunchEffect$1$1$1", f = "HatchConversationScreen.kt", l = {1261}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.HatchConversationScreenKt$ComposerLaunchEffect$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchIntentViewModel $intentViewModel;
        public final /* synthetic */ HatchConversationViewModel $viewModel;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchIntentViewModel hatchIntentViewModel, HatchConversationViewModel hatchConversationViewModel, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$intentViewModel = hatchIntentViewModel;
            this.$viewModel = hatchConversationViewModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$intentViewModel, this.$viewModel, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final HatchIntentViewModel hatchIntentViewModel = this.$intentViewModel;
                C10649I0t c10649I0t = new C10649I0t(hatchIntentViewModel.pendingComposerLaunch, 2);
                final HatchConversationViewModel hatchConversationViewModel = this.$viewModel;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.conversation.view.HatchConversationScreenKt.ComposerLaunchEffect.1.1.1.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((HatchIntentViewModel.ComposerLaunch) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(HatchIntentViewModel.ComposerLaunch composerLaunch, HtJ<? super Unit> htJ) {
                        if (hatchIntentViewModel.takeComposerLaunch(composerLaunch)) {
                            hatchConversationViewModel.requestComposerLaunch(composerLaunch.action);
                        }
                        return Unit.INSTANCE;
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

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationScreenKt$ComposerLaunchEffect$1$1(F2N f2n, HatchIntentViewModel hatchIntentViewModel, HatchConversationViewModel hatchConversationViewModel, HtJ<? super HatchConversationScreenKt$ComposerLaunchEffect$1$1> htJ) {
        super(2, htJ);
        this.$lifecycle = f2n;
        this.$intentViewModel = hatchIntentViewModel;
        this.$viewModel = hatchConversationViewModel;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchConversationScreenKt$ComposerLaunchEffect$1$1(this.$lifecycle, this.$intentViewModel, this.$viewModel, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            F2N f2n = this.$lifecycle;
            EnumC10573Huf enumC10573Huf = EnumC10573Huf.A05;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$intentViewModel, this.$viewModel, null);
            this.label = 1;
            if (Awn.A00(enumC10573Huf, f2n, this, anonymousClass1) == enumC10460Hji) {
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
        return ((HatchConversationScreenKt$ComposerLaunchEffect$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
