package com.facebook.aura.conversation.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationContentKt$HatchConversationContent$1$1", f = "HatchConversationContent.kt", l = {237}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConversationContentKt$HatchConversationContent$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<String> $composerAnimatedHint$delegate;
    public final /* synthetic */ HatchConversationViewModel $viewModel;
    public int label;

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationContentKt$HatchConversationContent$1$1$1, reason: invalid class name */
    public final class AnonymousClass1<T> implements C20Z {
        public final /* synthetic */ MutableState<String> $composerAnimatedHint$delegate;
        public final /* synthetic */ HatchConversationViewModel $viewModel;

        public AnonymousClass1(HatchConversationViewModel hatchConversationViewModel, MutableState<String> mutableState) {
            this.$viewModel = hatchConversationViewModel;
            this.$composerAnimatedHint$delegate = mutableState;
        }

        @Override // X.C20Z
        public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ) {
            return emit((String) obj, (HtJ<? super Unit>) htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.String r6, X.HtJ<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.facebook.aura.conversation.view.HatchConversationContentKt$HatchConversationContent$1$1$1$emit$1
                if (r0 == 0) goto L3e
                r4 = r7
                com.facebook.aura.conversation.view.HatchConversationContentKt$HatchConversationContent$1$1$1$emit$1 r4 = (com.facebook.aura.conversation.view.HatchConversationContentKt$HatchConversationContent$1$1$1$emit$1) r4
                int r2 = r4.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L3e
                int r2 = r2 - r1
                r4.label = r2
            L12:
                java.lang.Object r3 = r4.result
                X.Hji r2 = X.EnumC10460Hji.A02
                int r0 = r4.label
                r1 = 1
                if (r0 == 0) goto L28
                if (r0 != r1) goto L44
                X.Hwg.A00(r3)
            L20:
                com.facebook.aura.conversation.viewmodel.HatchConversationViewModel r0 = r5.$viewModel
                r0.requestComposerFocus()
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L28:
                X.Hwg.A00(r3)
                androidx.compose.runtime.MutableState<java.lang.String> r0 = r5.$composerAnimatedHint$delegate
                r0.Af8(r6)
                r0 = 0
                r4.L$0 = r0
                r4.label = r1
                r0 = 700(0x2bc, double:3.46E-321)
                java.lang.Object r0 = X.C7Bq.A01(r0, r4)
                if (r0 != r2) goto L20
                return r2
            L3e:
                com.facebook.aura.conversation.view.HatchConversationContentKt$HatchConversationContent$1$1$1$emit$1 r4 = new com.facebook.aura.conversation.view.HatchConversationContentKt$HatchConversationContent$1$1$1$emit$1
                r4.<init>(r5, r7)
                goto L12
            L44:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationContentKt$HatchConversationContent$1$1.AnonymousClass1.emit(java.lang.String, X.HtJ):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationContentKt$HatchConversationContent$1$1(HatchConversationViewModel hatchConversationViewModel, MutableState<String> mutableState, HtJ<? super HatchConversationContentKt$HatchConversationContent$1$1> htJ) {
        super(2, htJ);
        this.$viewModel = hatchConversationViewModel;
        this.$composerAnimatedHint$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchConversationContentKt$HatchConversationContent$1$1(this.$viewModel, this.$composerAnimatedHint$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchConversationViewModel hatchConversationViewModel = this.$viewModel;
            C22I<String> c22i = hatchConversationViewModel.composerHintAnimation;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(hatchConversationViewModel, this.$composerAnimatedHint$delegate);
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
        return ((HatchConversationContentKt$HatchConversationContent$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
