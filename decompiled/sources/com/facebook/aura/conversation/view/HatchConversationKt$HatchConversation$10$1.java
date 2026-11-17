package com.facebook.aura.conversation.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C00r;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$10$1", f = "HatchConversation.kt", l = {370}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConversationKt$HatchConversation$10$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<Boolean> $autoFollowEnabled$delegate;
    public final /* synthetic */ C00r $bottomRevealRequestGeneration$delegate;
    public final /* synthetic */ C20Q<Unit> $scrollToBottomRequests;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationKt$HatchConversation$10$1(C20Q<Unit> c20q, MutableState<Boolean> mutableState, C00r c00r, HtJ<? super HatchConversationKt$HatchConversation$10$1> htJ) {
        super(2, htJ);
        this.$scrollToBottomRequests = c20q;
        this.$autoFollowEnabled$delegate = mutableState;
        this.$bottomRevealRequestGeneration$delegate = c00r;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchConversationKt$HatchConversation$10$1(this.$scrollToBottomRequests, this.$autoFollowEnabled$delegate, this.$bottomRevealRequestGeneration$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C20Q<Unit> c20q = this.$scrollToBottomRequests;
            if (c20q != null) {
                final MutableState<Boolean> mutableState = this.$autoFollowEnabled$delegate;
                final C00r c00r = this.$bottomRevealRequestGeneration$delegate;
                C20Z<? super Unit> c20z = new C20Z() { // from class: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$10$1.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((Unit) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(Unit unit, HtJ<? super Unit> htJ) {
                        MutableState.A09(true, mutableState);
                        c00r.AdX(c00r.AGd() + 1);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c20q.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
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
        return ((HatchConversationKt$HatchConversation$10$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
