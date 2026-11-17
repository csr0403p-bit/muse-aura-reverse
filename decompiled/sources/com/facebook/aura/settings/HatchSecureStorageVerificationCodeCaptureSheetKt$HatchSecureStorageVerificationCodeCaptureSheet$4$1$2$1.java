package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.BFM;
import X.C07C;
import X.C1BO;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.ui.HatchSectionScope;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchSecureStorageVerificationCodeCaptureSheetKt$HatchSecureStorageVerificationCodeCaptureSheet$4$1$2$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ String $pageUrl;
    public final /* synthetic */ C1BO<SecureStorageVerificationCodeCaptureUiState> $uiState$delegate;

    /* renamed from: com.facebook.aura.settings.HatchSecureStorageVerificationCodeCaptureSheetKt$HatchSecureStorageVerificationCodeCaptureSheet$4$1$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ String $pageUrl;
        public final /* synthetic */ C1BO<SecureStorageVerificationCodeCaptureUiState> $uiState$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, C1BO<SecureStorageVerificationCodeCaptureUiState> c1bo) {
            super(3);
            this.$pageUrl = str;
            this.$uiState$delegate = c1bo;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                HatchSecureStorageVerificationCodeCaptureSheetKt.SecureStorageWebsiteOriginField(this.$pageUrl, !this.$uiState$delegate.getValue().isSubmitting, HatchSectionKt.hatchSectionRowShape(0, 1, bfm, 54), null, bfm, 0, 8);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass006.A1E(hatchSectionScope, new AnonymousClass1(this.$pageUrl, this.$uiState$delegate), 597573589);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSecureStorageVerificationCodeCaptureSheetKt$HatchSecureStorageVerificationCodeCaptureSheet$4$1$2$1(String str, C1BO<SecureStorageVerificationCodeCaptureUiState> c1bo) {
        super(1);
        this.$pageUrl = str;
        this.$uiState$delegate = c1bo;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
