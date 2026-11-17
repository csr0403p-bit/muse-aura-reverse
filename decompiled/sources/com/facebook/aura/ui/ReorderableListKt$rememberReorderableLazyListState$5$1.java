package com.facebook.aura.ui;

import X.AbstractC07127nr;
import X.C3UX;
import X.G0V;
import X.HtJ;
import androidx.compose.foundation.lazy.LazyListState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.ui.ReorderableListKt$rememberReorderableLazyListState$5$1", f = "ReorderableList.kt", l = {747, 748}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class ReorderableListKt$rememberReorderableLazyListState$5$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ ReorderableLazyListState $state;
    public float F$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReorderableListKt$rememberReorderableLazyListState$5$1(ReorderableLazyListState reorderableLazyListState, LazyListState lazyListState, HtJ<? super ReorderableListKt$rememberReorderableLazyListState$5$1> htJ) {
        super(2, htJ);
        this.$state = reorderableLazyListState;
        this.$listState = lazyListState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ReorderableListKt$rememberReorderableLazyListState$5$1(this.$state, this.$listState, htJ);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0020 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0032 -> B:7:0x000f). Please report as a decompilation issue!!! */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L35
            if (r0 == r2) goto L21
            if (r0 != r3) goto L39
            X.Hwg.A00(r6)
        Lf:
            com.facebook.aura.ui.ReorderableLazyListState r0 = r5.$state
            r0.onListScrolled$fbandroid_express_aura_java_com_facebook_aura_ui_ui()
        L14:
            com.facebook.aura.ui.ReorderableLazyListState r0 = r5.$state
            X.HzR<java.lang.Float> r0 = r0.scrollChannel
            r5.label = r2
            java.lang.Object r6 = r0.AZg(r5)
            if (r6 != r4) goto L24
            return r4
        L21:
            X.Hwg.A00(r6)
        L24:
            float r1 = X.AnonymousClass001.A02(r6)
            androidx.compose.foundation.lazy.LazyListState r0 = r5.$listState
            r5.F$0 = r1
            r5.label = r3
            java.lang.Object r0 = com.facebook.aura.ui.ReorderableListKt.scrollBy(r0, r1, r5)
            if (r0 != r4) goto Lf
            return r4
        L35:
            X.Hwg.A00(r6)
            goto L14
        L39:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ui.ReorderableListKt$rememberReorderableLazyListState$5$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((ReorderableListKt$rememberReorderableLazyListState$5$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
