package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C1BO;
import X.C78N;
import X.G0V;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSecureStorageScreenKt$HatchSecureStorageCaptureSheet$5$1$4$1$2$1$4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ boolean $isFromChat;
    public final /* synthetic */ MutableState<Boolean> $isPasswordVisible$delegate;
    public final /* synthetic */ C1BO<SecureStorageCaptureUiState> $uiState$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSecureStorageScreenKt$HatchSecureStorageCaptureSheet$5$1$4$1$2$1$4(boolean z, MutableState<Boolean> mutableState, C1BO<SecureStorageCaptureUiState> c1bo) {
        super(2);
        this.$isFromChat = z;
        this.$isPasswordVisible$delegate = mutableState;
        this.$uiState$delegate = c1bo;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            boolean zA0A = MutableState.A0A((MutableState) this.$isPasswordVisible$delegate);
            boolean z = !this.$uiState$delegate.getValue().isSaving;
            boolean zA66 = bfm.A66(this.$isFromChat);
            boolean z2 = this.$isFromChat;
            MutableState<Boolean> mutableState = this.$isPasswordVisible$delegate;
            Object objAaT = bfm.AaT();
            if (zA66 || objAaT == C78N.A00) {
                objAaT = new HatchSecureStorageScreenKt$HatchSecureStorageCaptureSheet$5$1$4$1$2$1$4$1$1(z2, mutableState);
                bfm.Ai0(objAaT);
            }
            HatchSecureStorageScreenKt.PasswordVisibilityButton(zA0A, z, (Function0) objAaT, bfm, 0);
            return;
        }
        bfm.Afo();
    }
}
