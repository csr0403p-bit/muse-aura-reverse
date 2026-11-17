package com.facebook.aura.status.view;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.C05663ul;
import X.C1Vj;
import X.C3UX;
import X.C6v3;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.vds.compose.bottomsheet.state.AuraSheetState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$ActivityGoalBottomSheetContent$1$1$observedSheetValue$1", f = "ActivityGoalBottomSheetComponent.kt", l = {172}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class ActivityGoalBottomSheetComponentKt$ActivityGoalBottomSheetContent$1$1$observedSheetValue$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super C1Vj>, Object> {
    public final /* synthetic */ AuraSheetState $sheetState;
    public int label;

    /* renamed from: com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$ActivityGoalBottomSheetContent$1$1$observedSheetValue$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<C1Vj> {
        public final /* synthetic */ AuraSheetState $sheetState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AuraSheetState auraSheetState) {
            super(0);
            this.$sheetState = auraSheetState;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final C1Vj invoke() {
            return (C1Vj) this.$sheetState.sheetState.A00.A07.getValue();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$ActivityGoalBottomSheetContent$1$1$observedSheetValue$1$2", f = "ActivityGoalBottomSheetComponent.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$ActivityGoalBottomSheetContent$1$1$observedSheetValue$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C1Vj, HtJ<? super Boolean>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0012  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r2 = r3.L$0
                int r0 = r3.label
                if (r0 != 0) goto L18
                X.Hwg.A00(r4)
                X.1Vj r0 = X.C1Vj.Expanded
                if (r2 == r0) goto L12
                X.1Vj r1 = X.C1Vj.PartiallyExpanded
                r0 = 0
                if (r2 != r1) goto L13
            L12:
                r0 = 1
            L13:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            L18:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$ActivityGoalBottomSheetContent$1$1$observedSheetValue$1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C1Vj c1Vj, HtJ<? super Boolean> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
            anonymousClass2.L$0 = c1Vj;
            return anonymousClass2.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityGoalBottomSheetComponentKt$ActivityGoalBottomSheetContent$1$1$observedSheetValue$1(AuraSheetState auraSheetState, HtJ<? super ActivityGoalBottomSheetComponentKt$ActivityGoalBottomSheetContent$1$1$observedSheetValue$1> htJ) {
        super(2, htJ);
        this.$sheetState = auraSheetState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ActivityGoalBottomSheetComponentKt$ActivityGoalBottomSheetContent$1$1$observedSheetValue$1(this.$sheetState, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C05663ul c05663ulA01 = C6v3.A01(new AnonymousClass1(this.$sheetState));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(null);
            this.label = 1;
            obj = AbstractC9777Gfy.A00(this, anonymousClass2, c05663ulA01);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super C1Vj> htJ) {
        return new ActivityGoalBottomSheetComponentKt$ActivityGoalBottomSheetContent$1$1$observedSheetValue$1(this.$sheetState, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
