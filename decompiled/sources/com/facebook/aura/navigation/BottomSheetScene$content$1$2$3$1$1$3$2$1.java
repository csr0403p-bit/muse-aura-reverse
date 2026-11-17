package com.facebook.aura.navigation;

import X.AbstractC7559F3s;
import com.facebook.aura.vds.compose.bottomsheet.state.AuraSheetState;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class BottomSheetScene$content$1$2$3$1$1$3$2$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ AtomicBoolean $isDismissing;
    public final /* synthetic */ AuraSheetState $sheetState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScene$content$1$2$3$1$1$3$2$1(AtomicBoolean atomicBoolean, AuraSheetState auraSheetState) {
        super(0);
        this.$isDismissing = atomicBoolean;
        this.$sheetState = auraSheetState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean invoke() {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.$isDismissing
            boolean r0 = r0.get()
            if (r0 != 0) goto L19
            com.facebook.aura.vds.compose.bottomsheet.state.AuraSheetState r0 = r2.$sheetState
            X.1Pn r0 = r0.sheetState
            androidx.compose.material3.internal.AnchoredDraggableState<X.1Vj> r0 = r0.A00
            X.1BO r0 = r0.A0A
            java.lang.Object r2 = r0.getValue()
            X.1Vj r1 = X.C1Vj.Hidden
            r0 = 1
            if (r2 != r1) goto L1a
        L19:
            r0 = 0
        L1a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.navigation.BottomSheetScene$content$1$2$3$1$1$3$2$1.invoke():java.lang.Boolean");
    }
}
