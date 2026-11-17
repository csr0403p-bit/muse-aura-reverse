package com.facebook.aura.conversation.view;

import X.AaC;
import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;

/* loaded from: classes4.dex */
public final class HatchLetterWidgetKt$HatchLetterWidget$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ AaC[] $latestLetterBounds;
    public final /* synthetic */ AaC $scrollViewportBounds;
    public final /* synthetic */ MutableState<Boolean> $viewportLifted$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchLetterWidgetKt$HatchLetterWidget$2$1(AaC[] aaCArr, AaC aaC, MutableState<Boolean> mutableState) {
        super(1);
        this.$latestLetterBounds = aaCArr;
        this.$scrollViewportBounds = aaC;
        this.$viewportLifted$delegate = mutableState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        HatchLetterWidgetKt.HatchLetterWidget$updateViewportLift(this.$scrollViewportBounds, this.$viewportLifted$delegate, this.$latestLetterBounds[0]);
        return new C78g() { // from class: com.facebook.aura.conversation.view.HatchLetterWidgetKt$HatchLetterWidget$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
