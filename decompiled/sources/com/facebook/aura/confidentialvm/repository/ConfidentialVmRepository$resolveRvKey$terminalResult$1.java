package com.facebook.aura.confidentialvm.repository;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C10543Hqv;
import X.C3UX;
import X.CFK;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmRvKeyResolution;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$resolveRvKey$terminalResult$1", f = "ConfidentialVmRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class ConfidentialVmRepository$resolveRvKey$terminalResult$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super ConfidentialVmRvKeyResolution>, Object> {
    public final /* synthetic */ C10543Hqv<byte[]> $derivedKey;
    public final /* synthetic */ String $hatchlingId;
    public int label;
    public final /* synthetic */ ConfidentialVmRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmRepository$resolveRvKey$terminalResult$1(C10543Hqv<byte[]> c10543Hqv, ConfidentialVmRepository confidentialVmRepository, String str, HtJ<? super ConfidentialVmRepository$resolveRvKey$terminalResult$1> htJ) {
        super(2, htJ);
        this.$derivedKey = c10543Hqv;
        this.this$0 = confidentialVmRepository;
        this.$hatchlingId = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ConfidentialVmRepository$resolveRvKey$terminalResult$1(this.$derivedKey, this.this$0, this.$hatchlingId, htJ);
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [T, byte[]] */
    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        try {
            this.$derivedKey.element = this.this$0.getSecretService().A01(this.$hatchlingId);
            if (this.$derivedKey.element == null) {
                return ConfidentialVmRvKeyResolution.NoStoredSecret.INSTANCE;
            }
            return null;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            if (this.this$0.hasInterruptedCause(e2)) {
                Thread.currentThread().interrupt();
                CFK.A0K(ConfidentialVmRepository.TAG, e2, "resolveRvKey: interrupted deriving K_rv");
                return ConfidentialVmRvKeyResolution.Failure.INSTANCE;
            }
            if (this.this$0.isDeviceLocked()) {
                CFK.A0K(ConfidentialVmRepository.TAG, e2, "resolveRvKey: stored secret is unreadable while the phone is locked");
                return ConfidentialVmRvKeyResolution.DeviceLocked.INSTANCE;
            }
            CFK.A0K(ConfidentialVmRepository.TAG, e2, "resolveRvKey: stored secret is unreadable");
            return ConfidentialVmRvKeyResolution.UnreadableSecret.INSTANCE;
        }
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super ConfidentialVmRvKeyResolution> htJ) {
        return ((ConfidentialVmRepository$resolveRvKey$terminalResult$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
