package com.facebook.aura.pause;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.C7LE;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchUnpauseBottomSheetContentKt$UnpauseHatchRecoveryKeyPage$1$1$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ MutableState<String> $recoveryKey$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        MutableState<String> mutableState = this.$recoveryKey$delegate;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (!C7LE.A00(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        mutableState.Af8(sb.toString());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchUnpauseBottomSheetContentKt$UnpauseHatchRecoveryKeyPage$1$1$1(MutableState<String> mutableState) {
        super(1);
        this.$recoveryKey$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
