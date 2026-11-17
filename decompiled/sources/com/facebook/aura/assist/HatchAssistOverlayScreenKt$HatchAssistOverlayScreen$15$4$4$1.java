package com.facebook.aura.assist;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C05663ul;
import X.C1160Acs;
import X.C16C;
import X.C1BO;
import X.C20Z;
import X.C3UX;
import X.C6v3;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.assist.HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$15$4$4$1", f = "HatchAssistOverlayScreen.kt", l = {367}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$15$4$4$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ LazyListState $conversationListState;
    public final /* synthetic */ C1BO<Boolean> $currentIsStreaming$delegate;
    public final /* synthetic */ MutableState<Integer> $frozenHeightPx$delegate;
    public int label;

    /* renamed from: com.facebook.aura.assist.HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$15$4$4$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ LazyListState $conversationListState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LazyListState lazyListState) {
            super(0);
            this.$conversationListState = lazyListState;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.$conversationListState.AOz());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$15$4$4$1(LazyListState lazyListState, C1BO<Boolean> c1bo, MutableState<Integer> mutableState, HtJ<? super HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$15$4$4$1> htJ) {
        super(2, htJ);
        this.$conversationListState = lazyListState;
        this.$currentIsStreaming$delegate = c1bo;
        this.$frozenHeightPx$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$15$4$4$1(this.$conversationListState, this.$currentIsStreaming$delegate, this.$frozenHeightPx$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C05663ul c05663ulA01 = C6v3.A01(new AnonymousClass1(this.$conversationListState));
            final LazyListState lazyListState = this.$conversationListState;
            final C1BO<Boolean> c1bo = this.$currentIsStreaming$delegate;
            final MutableState<Integer> mutableState = this.$frozenHeightPx$delegate;
            C20Z c20z = new C20Z() { // from class: com.facebook.aura.assist.HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$15$4$4$1.2
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                }

                public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                    MutableState<Integer> mutableState2;
                    int i2;
                    Object next;
                    if (z) {
                        if (C1BO.A0F(c1bo) && MutableState.A02((MutableState) mutableState) == 0) {
                            Iterator it = AnonymousClass003.A0j(lazyListState).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    next = it.next();
                                    if (((C1160Acs) ((C16C) next)).A07 == 0) {
                                        break;
                                    }
                                } else {
                                    next = null;
                                    break;
                                }
                            }
                            C16C c16c = (C16C) next;
                            mutableState2 = mutableState;
                            if (c16c != null) {
                                i2 = ((C1160Acs) c16c).A09;
                            } else {
                                i2 = 0;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    if (MutableState.A02((MutableState) mutableState) > 0 && lazyListState.A02() == 0 && lazyListState.A03() == 0) {
                        mutableState2 = mutableState;
                        i2 = 0;
                    }
                    return Unit.INSTANCE;
                    MutableState.A07(i2, mutableState2);
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (c05663ulA01.collect(c20z, this) == enumC10460Hji) {
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
        return ((HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$15$4$4$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
