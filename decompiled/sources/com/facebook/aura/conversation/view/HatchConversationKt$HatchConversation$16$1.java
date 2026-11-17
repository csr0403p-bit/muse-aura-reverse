package com.facebook.aura.conversation.view;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass602;
import X.C20Z;
import X.C3UX;
import X.C6v3;
import X.EnumC10460Hji;
import X.G0V;
import X.GDB;
import X.HtJ;
import X.Hwg;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.conversation.view.HatchConversationScrollingKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$16$1", f = "HatchConversation.kt", l = {546}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConversationKt$HatchConversation$16$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<Boolean> $autoFollowEnabled$delegate;
    public final /* synthetic */ Function0<Boolean> $isEditingWidgetField;
    public final /* synthetic */ LazyListState $listState;
    public int label;

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$16$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Integer> {
        public final /* synthetic */ LazyListState $listState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LazyListState lazyListState) {
            super(0);
            this.$listState = lazyListState;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf((int) (this.$listState.A04().AMh() >> 32));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationKt$HatchConversation$16$1(LazyListState lazyListState, Function0<Boolean> function0, MutableState<Boolean> mutableState, HtJ<? super HatchConversationKt$HatchConversation$16$1> htJ) {
        super(2, htJ);
        this.$listState = lazyListState;
        this.$isEditingWidgetField = function0;
        this.$autoFollowEnabled$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchConversationKt$HatchConversation$16$1(this.$listState, this.$isEditingWidgetField, this.$autoFollowEnabled$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AnonymousClass602 anonymousClass602 = new AnonymousClass602(GDB.A01(new HatchConversationKt$HatchConversation$16$1$invokeSuspend$$inlined$filter$1(C6v3.A01(new AnonymousClass1(this.$listState)))), 0);
            final LazyListState lazyListState = this.$listState;
            final Function0<Boolean> function0 = this.$isEditingWidgetField;
            final MutableState<Boolean> mutableState = this.$autoFollowEnabled$delegate;
            C20Z c20z = new C20Z() { // from class: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$16$1.3
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit(AnonymousClass001.A0F(obj2), (HtJ<? super Unit>) htJ);
                }

                public final Object emit(int i2, HtJ<? super Unit> htJ) {
                    if (MutableState.A0A((MutableState) mutableState)) {
                        Object objPinToBottomWhileSettling = HatchConversationScrollingKt.pinToBottomWhileSettling(lazyListState, 350L, null, null, HatchConversationScrollingKt.C114542.INSTANCE, HatchConversationScrollingKt.C114553.INSTANCE, false, false, HatchConversationScrollingKt.C114564.INSTANCE, HatchConversationScrollingKt.AnonymousClass5.INSTANCE, function0, htJ);
                        if (objPinToBottomWhileSettling == EnumC10460Hji.A02) {
                            return objPinToBottomWhileSettling;
                        }
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (anonymousClass602.collect(c20z, this) == enumC10460Hji) {
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
        return ((HatchConversationKt$HatchConversation$16$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
