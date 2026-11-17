package com.facebook.aura.conversation.view;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C05663ul;
import X.C1BO;
import X.C20Z;
import X.C2A9;
import X.C3UX;
import X.C6v3;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.foundation.lazy.LazyListState;
import com.facebook.aura.conversation.view.richcontent.WidgetFieldHost;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchWidgetEditingKt$RevealFocusedWidgetFieldEffect$1$1", f = "HatchWidgetEditing.kt", l = {58}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchWidgetEditingKt$RevealFocusedWidgetFieldEffect$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<Function0<Float>> $currentViewportTopInWindow$delegate;
    public final /* synthetic */ C1BO<Function0<Boolean>> $isEditingWidgetField$delegate;
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ View $rootView;
    public int label;

    /* renamed from: com.facebook.aura.conversation.view.HatchWidgetEditingKt$RevealFocusedWidgetFieldEffect$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<C2A9> {
        public final /* synthetic */ LazyListState $listState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LazyListState lazyListState) {
            super(0);
            this.$listState = lazyListState;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final C2A9 invoke() {
            return this.$listState.A04();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ C2A9 invoke() {
            return this.$listState.A04();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchWidgetEditingKt$RevealFocusedWidgetFieldEffect$1$1(LazyListState lazyListState, C1BO<? extends Function0<Boolean>> c1bo, View view, C1BO<? extends Function0<Float>> c1bo2, HtJ<? super HatchWidgetEditingKt$RevealFocusedWidgetFieldEffect$1$1> htJ) {
        super(2, htJ);
        this.$listState = lazyListState;
        this.$isEditingWidgetField$delegate = c1bo;
        this.$rootView = view;
        this.$currentViewportTopInWindow$delegate = c1bo2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchWidgetEditingKt$RevealFocusedWidgetFieldEffect$1$1(this.$listState, this.$isEditingWidgetField$delegate, this.$rootView, this.$currentViewportTopInWindow$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C05663ul c05663ulA01 = C6v3.A01(new AnonymousClass1(this.$listState));
            final LazyListState lazyListState = this.$listState;
            HatchWidgetEditingKt$RevealFocusedWidgetFieldEffect$1$1$invokeSuspend$$inlined$filter$1 hatchWidgetEditingKt$RevealFocusedWidgetFieldEffect$1$1$invokeSuspend$$inlined$filter$1 = new HatchWidgetEditingKt$RevealFocusedWidgetFieldEffect$1$1$invokeSuspend$$inlined$filter$1(c05663ulA01, lazyListState, this.$isEditingWidgetField$delegate);
            final View view = this.$rootView;
            final C1BO<Function0<Float>> c1bo = this.$currentViewportTopInWindow$delegate;
            C20Z<? super C2A9> c20z = new C20Z() { // from class: com.facebook.aura.conversation.view.HatchWidgetEditingKt$RevealFocusedWidgetFieldEffect$1$1.3

                /* renamed from: com.facebook.aura.conversation.view.HatchWidgetEditingKt$RevealFocusedWidgetFieldEffect$1$1$3$1, reason: invalid class name */
                public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<Float, Float, Unit> {
                    public final /* synthetic */ C1BO<Function0<Float>> $currentViewportTopInWindow$delegate;
                    public final /* synthetic */ LazyListState $listState;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public AnonymousClass1(LazyListState lazyListState, C1BO<? extends Function0<Float>> c1bo) {
                        super(2);
                        this.$listState = lazyListState;
                        this.$currentViewportTopInWindow$delegate = c1bo;
                    }

                    @Override // X.G0V
                    public /* bridge */ /* synthetic */ Unit invoke(Float f, Float f2) {
                        invoke(AnonymousClass001.A02(f), AnonymousClass001.A02(f2));
                        return Unit.INSTANCE;
                    }

                    public final void invoke(float f, float f2) {
                        HatchWidgetEditingKt.revealAboveComposer(this.$listState, f, f2, AnonymousClass003.A04(C1BO.A0A(this.$currentViewportTopInWindow$delegate)));
                    }
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((C2A9) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(C2A9 c2a9, HtJ<? super Unit> htJ) {
                    WidgetFieldHost widgetFieldHost;
                    KeyEvent.Callback callbackFindFocus = view.findFocus();
                    if ((callbackFindFocus instanceof WidgetFieldHost) && (widgetFieldHost = (WidgetFieldHost) callbackFindFocus) != null) {
                        widgetFieldHost.requestFocusedFieldBounds(new AnonymousClass1(lazyListState, c1bo));
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (hatchWidgetEditingKt$RevealFocusedWidgetFieldEffect$1$1$invokeSuspend$$inlined$filter$1.collect(c20z, this) == enumC10460Hji) {
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
        return ((HatchWidgetEditingKt$RevealFocusedWidgetFieldEffect$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
