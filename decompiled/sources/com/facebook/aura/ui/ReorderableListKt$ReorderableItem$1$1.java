package com.facebook.aura.ui;

import X.AOW;
import X.AT5;
import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.C3UX;
import X.G0U;
import X.G0V;
import X.HtJ;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.ui.ReorderableListKt$ReorderableItem$1$1", f = "ReorderableList.kt", l = {882, 884, 886}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class ReorderableListKt$ReorderableItem$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ DragSettlement $settlement;
    public final /* synthetic */ AT5<Float, AOW> $settlementProgress;
    public final /* synthetic */ ReorderableLazyListState $state;
    public int label;

    /* renamed from: com.facebook.aura.ui.ReorderableListKt$ReorderableItem$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Long, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            l.longValue();
            return Unit.INSTANCE;
        }

        public final void invoke(long j) {
        }
    }

    /* renamed from: com.facebook.aura.ui.ReorderableListKt$ReorderableItem$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<Long, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            l.longValue();
            return Unit.INSTANCE;
        }

        public final void invoke(long j) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReorderableListKt$ReorderableItem$1$1(DragSettlement dragSettlement, ReorderableLazyListState reorderableLazyListState, AT5<Float, AOW> at5, HtJ<? super ReorderableListKt$ReorderableItem$1$1> htJ) {
        super(2, htJ);
        this.$settlement = dragSettlement;
        this.$state = reorderableLazyListState;
        this.$settlementProgress = at5;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ReorderableListKt$ReorderableItem$1$1(this.$settlement, this.$state, this.$settlementProgress, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002b -> B:18:0x0031). Please report as a decompilation issue!!! */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.Hji r7 = X.EnumC10460Hji.A02
            int r0 = r9.label
            r8 = 3
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L1c
            if (r0 == r1) goto L2e
            if (r0 == r2) goto L2e
            if (r0 != r8) goto L5a
            X.Hwg.A00(r10)
        L12:
            com.facebook.aura.ui.ReorderableLazyListState r1 = r9.$state
            com.facebook.aura.ui.DragSettlement r0 = r9.$settlement
            r1.onSettlementAnimationFinished$fbandroid_express_aura_java_com_facebook_aura_ui_ui(r0)
        L19:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L1c:
            X.Hwg.A00(r10)
            com.facebook.aura.ui.DragSettlement r0 = r9.$settlement
            if (r0 == 0) goto L19
            com.facebook.aura.ui.ReorderableListKt$ReorderableItem$1$1$1 r0 = com.facebook.aura.ui.ReorderableListKt$ReorderableItem$1$1.AnonymousClass1.INSTANCE
            r9.label = r1
        L27:
            java.lang.Object r0 = X.AvW.A00(r0, r9)
            if (r0 != r7) goto L31
            return r7
        L2e:
            X.Hwg.A00(r10)
        L31:
            com.facebook.aura.ui.ReorderableLazyListState r1 = r9.$state
            com.facebook.aura.ui.DragSettlement r0 = r9.$settlement
            java.lang.Float r0 = r1.settlementDestinationTop$fbandroid_express_aura_java_com_facebook_aura_ui_ui(r0)
            if (r0 != 0) goto L40
            com.facebook.aura.ui.ReorderableListKt$ReorderableItem$1$1$2 r0 = com.facebook.aura.ui.ReorderableListKt$ReorderableItem$1$1.AnonymousClass2.INSTANCE
            r9.label = r2
            goto L27
        L40:
            X.AT5<java.lang.Float, X.AOW> r6 = r9.$settlementProgress
            java.lang.Float r5 = X.AnonymousClass001.A0m()
            r4 = 0
            r3 = 120(0x78, float:1.68E-43)
            r2 = 0
            X.28s r1 = X.C2HU.A01
            X.ASj r0 = new X.ASj
            r0.<init>(r1, r3, r2)
            r9.label = r8
            java.lang.Object r0 = X.AnonymousClass002.A0i(r6, r0, r5, r9, r4)
            if (r0 != r7) goto L12
            return r7
        L5a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ui.ReorderableListKt$ReorderableItem$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((ReorderableListKt$ReorderableItem$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
