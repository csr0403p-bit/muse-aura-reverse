package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.BFI;
import X.C3UX;
import X.C3cJ;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifierCrypto;
import java.security.MessageDigest;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserDownloadHost$publish$sha256$1", f = "LocalBrowserDownloadHost.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class LocalBrowserDownloadHost$publish$sha256$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super String>, Object> {
    public final /* synthetic */ byte[] $bytes;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrowserDownloadHost$publish$sha256$1(byte[] bArr, HtJ<? super LocalBrowserDownloadHost$publish$sha256$1> htJ) {
        super(2, htJ);
        this.$bytes = bArr;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new LocalBrowserDownloadHost$publish$sha256$1(this.$bytes, htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super String> htJ) {
        return new LocalBrowserDownloadHost$publish$sha256$1(this.$bytes, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        byte[] bArrDigest = MessageDigest.getInstance(ConfidentialVmPinVerifierCrypto.SHA_256).digest(this.$bytes);
        C7384Etj.A0U(bArrDigest);
        return BFI.A0C("", new G0U() { // from class: com.facebook.aura.localbrowser.LocalBrowserDownloadHost$publish$sha256$1$$ExternalSyntheticLambda0
            @Override // X.G0U
            public final Object invoke(Object obj2) {
                return C3cJ.A0K(Byte.valueOf(((Number) obj2).byteValue()));
            }
        }, bArrDigest);
    }
}
