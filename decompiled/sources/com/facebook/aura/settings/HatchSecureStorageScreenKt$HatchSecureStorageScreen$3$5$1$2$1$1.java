package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C78N;
import X.G0U;
import X.G0V;
import com.facebook.aura.settings.SecureStorageCatalogRow;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSecureStorageScreenKt$HatchSecureStorageScreen$3$5$1$2$1$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ G0U<CredentialCandidate, Unit> $onCredentialClick;
    public final /* synthetic */ G0U<CustomConnectorCandidate, Unit> $onCustomConnectorClick;
    public final /* synthetic */ SecureStorageCatalogRow $row;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchSecureStorageScreenKt$HatchSecureStorageScreen$3$5$1$2$1$1(SecureStorageCatalogRow secureStorageCatalogRow, G0U<? super CredentialCandidate, Unit> g0u, G0U<? super CustomConnectorCandidate, Unit> g0u2) {
        super(2);
        this.$row = secureStorageCatalogRow;
        this.$onCredentialClick = g0u;
        this.$onCustomConnectorClick = g0u2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            SecureStorageCatalogRow secureStorageCatalogRow = this.$row;
            if (secureStorageCatalogRow instanceof SecureStorageCatalogRow.Credential) {
                bfm.AgE(-1863546787);
                SecureStorageCatalogRow secureStorageCatalogRow2 = this.$row;
                CredentialCandidate credentialCandidate = ((SecureStorageCatalogRow.Credential) secureStorageCatalogRow2).candidate;
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$onCredentialClick, bfm.A67(secureStorageCatalogRow2));
                SecureStorageCatalogRow secureStorageCatalogRow3 = this.$row;
                G0U<CredentialCandidate, Unit> g0u = this.$onCredentialClick;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HatchSecureStorageScreenKt$HatchSecureStorageScreen$3$5$1$2$1$1$1$1(secureStorageCatalogRow3, g0u);
                    bfm.Ai0(objAaT);
                }
                HatchSecureStorageScreenKt.SecureStorageCredentialRow(credentialCandidate, (Function0) objAaT, null, bfm, 0, 4);
            } else if (secureStorageCatalogRow instanceof SecureStorageCatalogRow.CustomConnector) {
                bfm.AgE(-1863533297);
                CustomConnectorCandidate customConnectorCandidate = ((SecureStorageCatalogRow.CustomConnector) this.$row).connector;
                boolean zA1T = AnonymousClass001.A1T(bfm, this.$row, bfm.A65(this.$onCustomConnectorClick));
                G0U<CustomConnectorCandidate, Unit> g0u2 = this.$onCustomConnectorClick;
                SecureStorageCatalogRow secureStorageCatalogRow4 = this.$row;
                Object objAaT2 = bfm.AaT();
                if (zA1T || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchSecureStorageScreenKt$HatchSecureStorageScreen$3$5$1$2$1$1$2$1(g0u2, secureStorageCatalogRow4);
                    bfm.Ai0(objAaT2);
                }
                HatchSecureStorageScreenKt.CustomConnectorRow(customConnectorCandidate, (Function0) objAaT2, bfm, 0);
            } else {
                AnonymousClass004.A1A(bfm, -1863549397);
                throw new NoWhenBranchMatchedException();
            }
            AnonymousClass001.A1D(bfm);
            return;
        }
        bfm.Afo();
    }
}
