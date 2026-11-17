package com.facebook.aura.conversation.view;

import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C1160Acs;
import X.C1161Act;
import X.C16C;
import X.C20Q;
import X.C3UX;
import X.C3pU;
import X.C6v3;
import X.C7Bq;
import X.EnumC10460Hji;
import X.G0V;
import X.GDB;
import X.HtJ;
import X.Hwg;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationScrollingKt$ScrollToBottomPill$1$1", f = "HatchConversationScrolling.kt", l = {148}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConversationScrollingKt$ScrollToBottomPill$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ float $scrollThresholdPx;
    public final /* synthetic */ MutableState<Boolean> $showScrollToBottomPill$delegate;
    public int label;

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationScrollingKt$ScrollToBottomPill$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ LazyListState $listState;
        public final /* synthetic */ float $scrollThresholdPx;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LazyListState lazyListState, float f) {
            super(0);
            this.$listState = lazyListState;
            this.$scrollThresholdPx = f;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            C16C c16c;
            C1161Act c1161Act = (C1161Act) this.$listState.A04();
            int i = c1161Act.A05;
            if (i == 0 || (c16c = (C16C) AbstractC0878AGe.A0I(c1161Act.A0D)) == null) {
                return false;
            }
            C1160Acs c1160Acs = (C1160Acs) c16c;
            if (c1160Acs.A07 < i - 1) {
                return true;
            }
            return Boolean.valueOf(((float) ((c1160Acs.A02 + c1160Acs.A09) - (c1161Act.A06 - c1161Act.A02))) > this.$scrollThresholdPx);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationScrollingKt$ScrollToBottomPill$1$1$2", f = "HatchConversationScrolling.kt", l = {150}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.HatchConversationScrollingKt$ScrollToBottomPill$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Unit>, Object> {
        public final /* synthetic */ MutableState<Boolean> $showScrollToBottomPill$delegate;
        public /* synthetic */ boolean Z$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MutableState<Boolean> mutableState, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$showScrollToBottomPill$delegate = mutableState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$showScrollToBottomPill$delegate, htJ);
            anonymousClass2.Z$0 = AnonymousClass001.A1X(obj);
            return anonymousClass2;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            boolean z = this.Z$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                if (!z) {
                    MutableState.A09(false, this.$showScrollToBottomPill$delegate);
                    return Unit.INSTANCE;
                }
                this.Z$0 = z;
                this.label = 1;
                if (C7Bq.A01(250L, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            MutableState.A09(true, this.$showScrollToBottomPill$delegate);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Unit> htJ) {
            return invoke(AnonymousClass001.A1X(bool), htJ);
        }

        public final Object invoke(boolean z, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) AnonymousClass002.A0r(htJ, this, z)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationScrollingKt$ScrollToBottomPill$1$1(LazyListState lazyListState, float f, MutableState<Boolean> mutableState, HtJ<? super HatchConversationScrollingKt$ScrollToBottomPill$1$1> htJ) {
        super(2, htJ);
        this.$listState = lazyListState;
        this.$scrollThresholdPx = f;
        this.$showScrollToBottomPill$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchConversationScrollingKt$ScrollToBottomPill$1$1(this.$listState, this.$scrollThresholdPx, this.$showScrollToBottomPill$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C20Q c20qA01 = GDB.A01(C6v3.A01(new AnonymousClass1(this.$listState, this.$scrollThresholdPx)));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$showScrollToBottomPill$delegate, null);
            this.label = 1;
            if (C3pU.A00(this, anonymousClass2, c20qA01) == enumC10460Hji) {
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
        return ((HatchConversationScrollingKt$ScrollToBottomPill$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
