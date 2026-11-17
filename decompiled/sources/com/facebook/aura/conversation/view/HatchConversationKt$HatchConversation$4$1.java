package com.facebook.aura.conversation.view;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C20Z;
import X.C3UX;
import X.C6v3;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.view.View;
import androidx.compose.foundation.lazy.LazyListState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$4$1", f = "HatchConversation.kt", l = {205}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConversationKt$HatchConversation$4$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Function0<Unit> $clearFocusAfterKeyboardHides;
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ View $rootView;
    public int label;

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$4$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ LazyListState $listState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LazyListState lazyListState) {
            super(0);
            this.$listState = lazyListState;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.$listState.AOz());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationKt$HatchConversation$4$1(LazyListState lazyListState, View view, Function0<Unit> function0, HtJ<? super HatchConversationKt$HatchConversation$4$1> htJ) {
        super(2, htJ);
        this.$listState = lazyListState;
        this.$rootView = view;
        this.$clearFocusAfterKeyboardHides = function0;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchConversationKt$HatchConversation$4$1(this.$listState, this.$rootView, this.$clearFocusAfterKeyboardHides, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchConversationKt$HatchConversation$4$1$invokeSuspend$$inlined$filter$1 hatchConversationKt$HatchConversation$4$1$invokeSuspend$$inlined$filter$1 = new HatchConversationKt$HatchConversation$4$1$invokeSuspend$$inlined$filter$1(C6v3.A01(new AnonymousClass1(this.$listState)));
            final View view = this.$rootView;
            final Function0<Unit> function0 = this.$clearFocusAfterKeyboardHides;
            C20Z<? super Boolean> c20z = new C20Z() { // from class: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$4$1.3
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                }

                public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                    View viewFindFocus = view.findFocus();
                    if (viewFindFocus != null && viewFindFocus != view) {
                        function0.invoke();
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (hatchConversationKt$HatchConversation$4$1$invokeSuspend$$inlined$filter$1.collect(c20z, this) == enumC10460Hji) {
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
        return ((HatchConversationKt$HatchConversation$4$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
