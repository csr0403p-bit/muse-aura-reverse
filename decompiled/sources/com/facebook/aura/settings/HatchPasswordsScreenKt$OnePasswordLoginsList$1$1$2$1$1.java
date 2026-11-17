package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C78N;
import X.G0U;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchPasswordsScreenKt$OnePasswordLoginsList$1$1$2$1$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ CredentialCandidate $candidate;
    public final /* synthetic */ G0U<CredentialCandidate, Unit> $onCredentialClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchPasswordsScreenKt$OnePasswordLoginsList$1$1$2$1$1(CredentialCandidate credentialCandidate, G0U<? super CredentialCandidate, Unit> g0u) {
        super(2);
        this.$candidate = credentialCandidate;
        this.$onCredentialClick = g0u;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            CredentialCandidate credentialCandidate = this.$candidate;
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$onCredentialClick, bfm.A65(credentialCandidate));
            CredentialCandidate credentialCandidate2 = this.$candidate;
            G0U<CredentialCandidate, Unit> g0u = this.$onCredentialClick;
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new HatchPasswordsScreenKt$OnePasswordLoginsList$1$1$2$1$1$1$1(credentialCandidate2, g0u);
                bfm.Ai0(objAaT);
            }
            HatchSecureStorageScreenKt.SecureStorageCredentialRow(credentialCandidate, (Function0) objAaT, null, bfm, 0, 4);
            return;
        }
        bfm.Afo();
    }
}
