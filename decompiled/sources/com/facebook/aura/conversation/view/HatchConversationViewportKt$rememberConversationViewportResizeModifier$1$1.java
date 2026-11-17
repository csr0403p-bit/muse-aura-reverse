package com.facebook.aura.conversation.view;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C00r;
import X.C1BO;
import X.C3Q0;
import X.C3UX;
import X.C3UY;
import X.C3pU;
import X.C6v3;
import X.C7Bq;
import X.EnumC10460Hji;
import X.F1E;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import org.maplibre.android.R;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationViewportKt$rememberConversationViewportResizeModifier$1$1", f = "HatchConversationViewport.kt", l = {42}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConversationViewportKt$rememberConversationViewportResizeModifier$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<Function0<Boolean>> $isEditingWidgetField$delegate;
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ C00r $totalAvatarScrollCompensationPx$delegate;
    public final /* synthetic */ MutableState<Boolean> $viewportSettled$delegate;
    public Object L$0;
    public int label;

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationViewportKt$rememberConversationViewportResizeModifier$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Integer> {
        public final /* synthetic */ LazyListState $listState;
        public final /* synthetic */ C00r $totalAvatarScrollCompensationPx$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LazyListState lazyListState, C00r c00r) {
            super(0);
            this.$listState = lazyListState;
            this.$totalAvatarScrollCompensationPx$delegate = c00r;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            int iA09 = AnonymousClass002.A09(this.$listState.A04().AMh());
            return Integer.valueOf(iA09 > 0 ? iA09 + this.$totalAvatarScrollCompensationPx$delegate.AGd() : 0);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationViewportKt$rememberConversationViewportResizeModifier$1$1$3", f = "HatchConversationViewport.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft, R.styleable.maplibre_MapView_maplibre_uiRotateGestures}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.HatchConversationViewportKt$rememberConversationViewportResizeModifier$1$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<Integer, HtJ<? super Unit>, Object> {
        public final /* synthetic */ F1E $baseline;
        public final /* synthetic */ C1BO<Function0<Boolean>> $isEditingWidgetField$delegate;
        public final /* synthetic */ LazyListState $listState;
        public final /* synthetic */ MutableState<Boolean> $viewportSettled$delegate;
        public /* synthetic */ int I$0;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationViewportKt$rememberConversationViewportResizeModifier$1$1$3$1", f = "HatchConversationViewport.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.conversation.view.HatchConversationViewportKt$rememberConversationViewportResizeModifier$1$1$3$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3Q0, HtJ<? super Unit>, Object> {
            public final /* synthetic */ F1E $baseline;
            public final /* synthetic */ int $height;
            public /* synthetic */ Object L$0;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(F1E f1e, int i, HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
                this.$baseline = f1e;
                this.$height = i;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$baseline, this.$height, htJ);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                C3Q0 c3q0 = (C3Q0) this.L$0;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                c3q0.AcG(this.$baseline.element - this.$height);
                return Unit.INSTANCE;
            }

            @Override // X.G0V
            public final Object invoke(C3Q0 c3q0, HtJ<? super Unit> htJ) {
                return ((AnonymousClass1) create(c3q0, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(F1E f1e, LazyListState lazyListState, MutableState<Boolean> mutableState, C1BO<? extends Function0<Boolean>> c1bo, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$baseline = f1e;
            this.$listState = lazyListState;
            this.$viewportSettled$delegate = mutableState;
            this.$isEditingWidgetField$delegate = c1bo;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$baseline, this.$listState, this.$viewportSettled$delegate, this.$isEditingWidgetField$delegate, htJ);
            anonymousClass3.I$0 = AnonymousClass001.A0F(obj);
            return anonymousClass3;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            int i = this.I$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i2 = this.label;
            if (i2 == 0) {
                Hwg.A00(obj);
                boolean zA0A = MutableState.A0A((MutableState) this.$viewportSettled$delegate);
                F1E f1e = this.$baseline;
                if (zA0A) {
                    if (i < f1e.element && !AnonymousClass003.A1Y(C1BO.A0A(this.$isEditingWidgetField$delegate))) {
                        LazyListState lazyListState = this.$listState;
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$baseline, i, null);
                        this.I$0 = i;
                        this.label = 2;
                        if (lazyListState.AcF(C3UY.A02, this, anonymousClass1) == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    }
                    this.$baseline.element = i;
                } else {
                    f1e.element = i;
                    this.I$0 = i;
                    this.label = 1;
                    if (C7Bq.A01(300L, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                    MutableState.A09(true, this.$viewportSettled$delegate);
                }
            } else if (i2 == 1) {
                Hwg.A00(obj);
                MutableState.A09(true, this.$viewportSettled$delegate);
            } else {
                if (i2 != 2) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                this.$baseline.element = i;
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Integer num, HtJ<? super Unit> htJ) {
            return invoke(AnonymousClass001.A0F(num), htJ);
        }

        public final Object invoke(int i, HtJ<? super Unit> htJ) {
            return ((AnonymousClass3) create(Integer.valueOf(i), htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationViewportKt$rememberConversationViewportResizeModifier$1$1(LazyListState lazyListState, C00r c00r, MutableState<Boolean> mutableState, C1BO<? extends Function0<Boolean>> c1bo, HtJ<? super HatchConversationViewportKt$rememberConversationViewportResizeModifier$1$1> htJ) {
        super(2, htJ);
        this.$listState = lazyListState;
        this.$totalAvatarScrollCompensationPx$delegate = c00r;
        this.$viewportSettled$delegate = mutableState;
        this.$isEditingWidgetField$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchConversationViewportKt$rememberConversationViewportResizeModifier$1$1(this.$listState, this.$totalAvatarScrollCompensationPx$delegate, this.$viewportSettled$delegate, this.$isEditingWidgetField$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            F1E f1e = new F1E();
            HatchConversationViewportKt$rememberConversationViewportResizeModifier$1$1$invokeSuspend$$inlined$filter$1 hatchConversationViewportKt$rememberConversationViewportResizeModifier$1$1$invokeSuspend$$inlined$filter$1 = new HatchConversationViewportKt$rememberConversationViewportResizeModifier$1$1$invokeSuspend$$inlined$filter$1(C6v3.A01(new AnonymousClass1(this.$listState, this.$totalAvatarScrollCompensationPx$delegate)));
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(f1e, this.$listState, this.$viewportSettled$delegate, this.$isEditingWidgetField$delegate, null);
            this.L$0 = null;
            this.label = 1;
            if (C3pU.A00(this, anonymousClass3, hatchConversationViewportKt$rememberConversationViewportResizeModifier$1$1$invokeSuspend$$inlined$filter$1) == enumC10460Hji) {
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
        return ((HatchConversationViewportKt$rememberConversationViewportResizeModifier$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
