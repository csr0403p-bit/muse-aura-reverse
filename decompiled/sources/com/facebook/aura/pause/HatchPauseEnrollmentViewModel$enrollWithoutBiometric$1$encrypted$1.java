package com.facebook.aura.pause;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.hatchlockcrypto.HatchPassphraseEncryptor;
import com.facebook.aura.hatchlockcrypto.PassphraseHashResult;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.pause.HatchPauseEnrollmentViewModel$enrollWithoutBiometric$1$encrypted$1", f = "HatchPauseEnrollmentViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchPauseEnrollmentViewModel$enrollWithoutBiometric$1$encrypted$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super byte[]>, Object> {
    public final /* synthetic */ PassphraseHashResult $hashResult;
    public final /* synthetic */ String $keyAlias;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPauseEnrollmentViewModel$enrollWithoutBiometric$1$encrypted$1(String str, PassphraseHashResult passphraseHashResult, HtJ<? super HatchPauseEnrollmentViewModel$enrollWithoutBiometric$1$encrypted$1> htJ) {
        super(2, htJ);
        this.$keyAlias = str;
        this.$hashResult = passphraseHashResult;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchPauseEnrollmentViewModel$enrollWithoutBiometric$1$encrypted$1(this.$keyAlias, this.$hashResult, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return HatchPassphraseEncryptor.INSTANCE.encrypt(this.$keyAlias, this.$hashResult.hash);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super byte[]> htJ) {
        return ((HatchPauseEnrollmentViewModel$enrollWithoutBiometric$1$encrypted$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
