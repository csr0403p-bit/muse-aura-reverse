package com.facebook.aura.login.nativeflow;

import X.AbstractC07127nr;
import X.AbstractC07979sd;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.json.HatchJsonKt;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginCheckpointBlobDecrypter$decrypt$accessToken$1", f = "NativeLoginCheckpointContinuation.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class NativeLoginCheckpointBlobDecrypter$decrypt$accessToken$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super NativeLoginCheckpointDecryptResponseJson>, Object> {
    public final /* synthetic */ InputStream $body;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginCheckpointBlobDecrypter$decrypt$accessToken$1(InputStream inputStream, HtJ<? super NativeLoginCheckpointBlobDecrypter$decrypt$accessToken$1> htJ) {
        super(2, htJ);
        this.$body = inputStream;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new NativeLoginCheckpointBlobDecrypter$decrypt$accessToken$1(this.$body, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) throws IOException {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        InputStream inputStream = this.$body;
        try {
            NativeLoginCheckpointDecryptResponseJson nativeLoginCheckpointDecryptResponseJson = (NativeLoginCheckpointDecryptResponseJson) AbstractC07979sd.A00(inputStream, NativeLoginCheckpointDecryptResponseJson$$serializer.INSTANCE, HatchJsonKt.HatchJson);
            if (inputStream != null) {
                inputStream.close();
            }
            return nativeLoginCheckpointDecryptResponseJson;
        } finally {
        }
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super NativeLoginCheckpointDecryptResponseJson> htJ) {
        return new NativeLoginCheckpointBlobDecrypter$decrypt$accessToken$1(this.$body, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
