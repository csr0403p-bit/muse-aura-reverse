package com.facebook.aura.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.C08R;
import X.C1BO;
import X.G0U;
import X.G0V;
import X.G2j;
import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ReorderableRowKt {

    /* renamed from: com.facebook.aura.ui.ReorderableRowKt$ReorderableRow$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ G2j<T, Boolean, BFM, Integer, Unit> $itemContent;
        public final /* synthetic */ List<T> $items;
        public final /* synthetic */ Function0<Unit> $onDragSettled;
        public final /* synthetic */ Function0<Unit> $onDragStarted;
        public final /* synthetic */ G0U<T, Unit> $onItemClick;
        public final /* synthetic */ Function0<Unit> $onItemSwapped;
        public final /* synthetic */ G0V<Integer, Integer, Unit> $onReorder;
        public final /* synthetic */ C08R $this_ReorderableRow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(C08R c08r, List<? extends T> list, boolean z, G0V<? super Integer, ? super Integer, Unit> g0v, G0U<? super T, Unit> g0u, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, G2j<? super T, ? super Boolean, ? super BFM, ? super Integer, Unit> g2j, int i, int i2) {
            super(2);
            this.$this_ReorderableRow = c08r;
            this.$items = list;
            this.$enabled = z;
            this.$onReorder = g0v;
            this.$onItemClick = g0u;
            this.$onDragStarted = function0;
            this.$onItemSwapped = function02;
            this.$onDragSettled = function03;
            this.$itemContent = g2j;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ReorderableRowKt.ReorderableRow(this.$this_ReorderableRow, this.$items, this.$enabled, this.$onReorder, this.$onItemClick, this.$onDragStarted, this.$onItemSwapped, this.$onDragSettled, this.$itemContent, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x01e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> void ReorderableRow(X.C08R r47, java.util.List<? extends T> r48, boolean r49, X.G0V<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> r50, X.G0U<? super T, kotlin.Unit> r51, kotlin.jvm.functions.Function0<kotlin.Unit> r52, kotlin.jvm.functions.Function0<kotlin.Unit> r53, kotlin.jvm.functions.Function0<kotlin.Unit> r54, X.G2j<? super T, ? super java.lang.Boolean, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r55, X.BFM r56, int r57, int r58) {
        /*
            Method dump skipped, instructions count: 853
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ui.ReorderableRowKt.ReorderableRow(X.08R, java.util.List, boolean, X.G0V, X.G0U, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.G2j, X.BFM, int, int):void");
    }

    public static final G0V<Integer, Integer, Unit> ReorderableRow$lambda$4(C1BO<? extends G0V<? super Integer, ? super Integer, Unit>> c1bo) {
        return (G0V) c1bo.getValue();
    }

    public static final /* synthetic */ Integer access$ReorderableRow$lambda$10(MutableState mutableState) {
        return (Integer) mutableState.getValue();
    }

    public static final /* synthetic */ G0V access$ReorderableRow$lambda$4(C1BO c1bo) {
        return (G0V) c1bo.getValue();
    }
}
