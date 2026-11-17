package com.facebook.aura.conversation.view;

import X.AWx;
import X.AXN;
import X.AaC;
import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import android.view.View;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchMessageLongPressMenuHostKt$HatchMessageLongPressMenuHost$6$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Boolean> $awaitingSelectionStart$delegate;
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ AXN $density;
    public final /* synthetic */ MutableState<AWx> $hostWindowOffset$delegate;
    public final /* synthetic */ MutableState<AWx> $longPressOffset$delegate;
    public final /* synthetic */ MutableState<AaC> $selectableBoundsInWindow$delegate;
    public final /* synthetic */ MutableState<Boolean> $selectionActive$delegate;
    public final /* synthetic */ MutableState<Boolean> $selectionHasFocus$delegate;
    public final /* synthetic */ View $view;

    @DebugMetadata(c = "com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt$HatchMessageLongPressMenuHost$6$3$1$1", f = "HatchMessageLongPressMenuHost.kt", l = {525, 536}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt$HatchMessageLongPressMenuHost$6$3$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ MutableState<Boolean> $awaitingSelectionStart$delegate;
        public final /* synthetic */ AXN $density;
        public final /* synthetic */ MutableState<AWx> $hostWindowOffset$delegate;
        public final /* synthetic */ MutableState<AWx> $longPressOffset$delegate;
        public final /* synthetic */ MutableState<AaC> $selectableBoundsInWindow$delegate;
        public final /* synthetic */ MutableState<Boolean> $selectionActive$delegate;
        public final /* synthetic */ MutableState<Boolean> $selectionHasFocus$delegate;
        public final /* synthetic */ View $view;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AXN axn, View view, MutableState<AWx> mutableState, MutableState<AWx> mutableState2, MutableState<AaC> mutableState3, MutableState<Boolean> mutableState4, MutableState<Boolean> mutableState5, MutableState<Boolean> mutableState6, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$density = axn;
            this.$view = view;
            this.$longPressOffset$delegate = mutableState;
            this.$hostWindowOffset$delegate = mutableState2;
            this.$selectableBoundsInWindow$delegate = mutableState3;
            this.$selectionHasFocus$delegate = mutableState4;
            this.$awaitingSelectionStart$delegate = mutableState5;
            this.$selectionActive$delegate = mutableState6;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$density, this.$view, this.$longPressOffset$delegate, this.$hostWindowOffset$delegate, this.$selectableBoundsInWindow$delegate, this.$selectionHasFocus$delegate, this.$awaitingSelectionStart$delegate, this.$selectionActive$delegate, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0091 A[PHI: r8
  0x0091: PHI (r8v2 java.util.Iterator<X.AWx>) = (r8v1 java.util.Iterator<X.AWx>), (r8v3 java.util.Iterator<X.AWx>) binds: [B:21:0x0061, B:8:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0097  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00bb -> B:7:0x0013). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                X.Hji r5 = X.EnumC10460Hji.A02
                int r1 = r13.label
                r4 = 2
                r0 = 1
                if (r1 == 0) goto L33
                if (r1 == r0) goto L41
                if (r1 != r4) goto Lc0
                java.lang.Object r8 = r13.L$1
                java.util.Iterator r8 = (java.util.Iterator) r8
                X.Hwg.A00(r14)
            L13:
                androidx.compose.runtime.MutableState<java.lang.Boolean> r1 = r13.$selectionHasFocus$delegate
                float r0 = com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt.MenuGap
                boolean r0 = androidx.compose.runtime.MutableState.A0A(r1)
                if (r0 == 0) goto L91
            L1d:
                androidx.compose.runtime.MutableState<java.lang.Boolean> r0 = r13.$awaitingSelectionStart$delegate
                r1 = 0
                androidx.compose.runtime.MutableState.A09(r1, r0)
                androidx.compose.runtime.MutableState<java.lang.Boolean> r0 = r13.$selectionHasFocus$delegate
                boolean r0 = androidx.compose.runtime.MutableState.A0A(r0)
                if (r0 != 0) goto L30
                androidx.compose.runtime.MutableState<java.lang.Boolean> r0 = r13.$selectionActive$delegate
                androidx.compose.runtime.MutableState.A09(r1, r0)
            L30:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            L33:
                X.Hwg.A00(r14)
                r13.label = r0
                r0 = 100
                java.lang.Object r0 = X.C7Bq.A01(r0, r13)
                if (r0 != r5) goto L44
                return r5
            L41:
                X.Hwg.A00(r14)
            L44:
                androidx.compose.runtime.MutableState<X.AWx> r1 = r13.$longPressOffset$delegate
                float r0 = com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt.MenuGap
                java.lang.Object r1 = r1.getValue()
                X.AWx r1 = (X.AWx) r1
                if (r1 == 0) goto Lbe
                androidx.compose.runtime.MutableState<X.AWx> r0 = r13.$hostWindowOffset$delegate
                long r2 = r1.A00
                long r0 = com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt.HatchMessageLongPressMenuHost$lambda$36(r0)
                long r0 = X.AWx.A05(r0, r2)
                X.AWx r6 = new X.AWx
                r6.<init>(r0)
            L61:
                androidx.compose.runtime.MutableState<X.AaC> r0 = r13.$selectableBoundsInWindow$delegate
                java.lang.Object r0 = r0.getValue()
                java.util.List r7 = X.AbstractC0885AGm.A0z(r0)
                androidx.compose.runtime.MutableState<X.AWx> r0 = r13.$hostWindowOffset$delegate
                long r8 = com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt.HatchMessageLongPressMenuHost$lambda$36(r0)
                X.AXN r1 = r13.$density
                float r0 = com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt.SelectionTextFallbackInset
                float r10 = r1.Ah4(r0)
                X.AXN r1 = r13.$density
                float r0 = com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt.SelectionLabelFallbackInset
                float r11 = r1.Ah4(r0)
                X.AXN r1 = r13.$density
                float r0 = com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt.SelectionVerticalFallbackInset
                float r12 = r1.Ah4(r0)
                java.util.List r0 = com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt.m652selectionSeedWindowOffsets86GbZ28(r6, r7, r8, r10, r11, r12)
                java.util.Iterator r8 = r0.iterator()
            L91:
                boolean r0 = r8.hasNext()
                if (r0 == 0) goto L1d
                java.lang.Object r0 = r8.next()
                X.AWx r0 = (X.AWx) r0
                long r2 = r0.A00
                android.view.View r7 = r13.$view
                float r6 = X.AnonymousClass003.A03(r2)
                r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
                float r1 = X.AnonymousClass001.A01(r0, r2)
                r0 = 0
                r13.L$0 = r0
                r13.L$1 = r8
                r13.J$0 = r2
                r13.label = r4
                java.lang.Object r0 = com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt.dispatchSyntheticLongPress(r7, r6, r1, r13)
                if (r0 != r5) goto L13
                return r5
            Lbe:
                r6 = 0
                goto L61
            Lc0:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt$HatchMessageLongPressMenuHost$6$3$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessageLongPressMenuHostKt$HatchMessageLongPressMenuHost$6$3$1(C3UX c3ux, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, AXN axn, View view, MutableState<AWx> mutableState3, MutableState<AWx> mutableState4, MutableState<AaC> mutableState5, MutableState<Boolean> mutableState6) {
        super(0);
        this.$coroutineScope = c3ux;
        this.$selectionActive$delegate = mutableState;
        this.$awaitingSelectionStart$delegate = mutableState2;
        this.$density = axn;
        this.$view = view;
        this.$longPressOffset$delegate = mutableState3;
        this.$hostWindowOffset$delegate = mutableState4;
        this.$selectableBoundsInWindow$delegate = mutableState5;
        this.$selectionHasFocus$delegate = mutableState6;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState<Boolean> mutableState = this.$selectionActive$delegate;
        float f = HatchMessageLongPressMenuHostKt.MenuGap;
        MutableState.A09(true, mutableState);
        MutableState.A09(true, this.$awaitingSelectionStart$delegate);
        AnonymousClass001.A1J(new AnonymousClass1(this.$density, this.$view, this.$longPressOffset$delegate, this.$hostWindowOffset$delegate, this.$selectableBoundsInWindow$delegate, this.$selectionHasFocus$delegate, this.$awaitingSelectionStart$delegate, this.$selectionActive$delegate, null), this.$coroutineScope);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
