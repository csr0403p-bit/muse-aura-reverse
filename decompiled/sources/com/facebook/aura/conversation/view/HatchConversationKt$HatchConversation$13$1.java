package com.facebook.aura.conversation.view;

import X.ATR;
import X.ATS;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C10543Hqv;
import X.C1qN;
import X.C1rU;
import X.C20Z;
import X.C3Em;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.InterfaceC04911Xu;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$13$1", f = "HatchConversation.kt", l = {493}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConversationKt$HatchConversation$13$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<Boolean> $autoFollowEnabled$delegate;
    public final /* synthetic */ LazyListState $listState;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationKt$HatchConversation$13$1(LazyListState lazyListState, MutableState<Boolean> mutableState, HtJ<? super HatchConversationKt$HatchConversation$13$1> htJ) {
        super(2, htJ);
        this.$listState = lazyListState;
        this.$autoFollowEnabled$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        HatchConversationKt$HatchConversation$13$1 hatchConversationKt$HatchConversation$13$1 = new HatchConversationKt$HatchConversation$13$1(this.$listState, this.$autoFollowEnabled$delegate, htJ);
        hatchConversationKt$HatchConversation$13$1.L$0 = obj;
        return hatchConversationKt$HatchConversation$13$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        final C3UX c3ux = (C3UX) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            final C10543Hqv c10543Hqv = new C10543Hqv();
            final LazyListState lazyListState = this.$listState;
            C3Em<InterfaceC04911Xu> c3Em = ((C1qN) lazyListState.A09).A00;
            final MutableState<Boolean> mutableState = this.$autoFollowEnabled$delegate;
            C20Z<? super InterfaceC04911Xu> c20z = new C20Z() { // from class: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$13$1.1

                @DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$13$1$1$1", f = "HatchConversation.kt", l = {506}, m = "invokeSuspend", v = 2)
                /* renamed from: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$13$1$1$1, reason: invalid class name and collision with other inner class name */
                public final class C00981 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
                    public final /* synthetic */ MutableState<Boolean> $autoFollowEnabled$delegate;
                    public final /* synthetic */ LazyListState $listState;
                    public int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00981(LazyListState lazyListState, MutableState<Boolean> mutableState, HtJ<? super C00981> htJ) {
                        super(2, htJ);
                        this.$listState = lazyListState;
                        this.$autoFollowEnabled$delegate = mutableState;
                    }

                    @Override // X.AbstractC8884Fsp
                    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                        return new C00981(this.$listState, this.$autoFollowEnabled$delegate, htJ);
                    }

                    @Override // X.AbstractC8884Fsp
                    public final Object invokeSuspend(Object obj) {
                        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                        int i = this.label;
                        if (i == 0) {
                            Hwg.A00(obj);
                            LazyListState lazyListState = this.$listState;
                            this.label = 1;
                            if (HatchConversationScrollingKt.awaitScrollRest(lazyListState, this) == enumC10460Hji) {
                                return enumC10460Hji;
                            }
                        } else {
                            if (i != 1) {
                                throw AnonymousClass001.A0n();
                            }
                            Hwg.A00(obj);
                        }
                        if (HatchConversationScrollingKt.isAtBottom(this.$listState)) {
                            MutableState.A09(true, this.$autoFollowEnabled$delegate);
                        }
                        return Unit.INSTANCE;
                    }

                    @Override // X.G0V
                    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                        return ((C00981) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
                    }
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((InterfaceC04911Xu) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(InterfaceC04911Xu interfaceC04911Xu, HtJ<? super Unit> htJ) {
                    if (interfaceC04911Xu instanceof C1rU) {
                        HoC hoC = c10543Hqv.element;
                        if (hoC != null) {
                            hoC.A5w(null);
                        }
                        MutableState.A09(false, mutableState);
                    } else if ((interfaceC04911Xu instanceof ATS) || (interfaceC04911Xu instanceof ATR)) {
                        HoC hoC2 = c10543Hqv.element;
                        if (hoC2 != null) {
                            hoC2.A5w(null);
                        }
                        c10543Hqv.element = (T) AnonymousClass001.A11(new C00981(lazyListState, mutableState, null), c3ux);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (c3Em.collect(c20z, this) == enumC10460Hji) {
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
        return ((HatchConversationKt$HatchConversation$13$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
