package com.facebook.aura.navigation;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.vds.compose.bottomsheet.state.AuraSheetState;

/* loaded from: classes2.dex */
public final class BottomSheetScene$content$1$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ AuraSheetState $sheetState;
    public final /* synthetic */ BottomSheetScene<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScene$content$1$1$1(BottomSheetScene<T> bottomSheetScene, AuraSheetState auraSheetState) {
        super(1);
        this.this$0 = bottomSheetScene;
        this.$sheetState = auraSheetState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.this$0.retainedSheetState = this.$sheetState;
        return new C78g() { // from class: com.facebook.aura.navigation.BottomSheetScene$content$1$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
