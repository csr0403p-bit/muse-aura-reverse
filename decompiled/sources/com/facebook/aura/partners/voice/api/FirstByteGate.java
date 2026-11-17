package com.facebook.aura.partners.voice.api;

import X.AnonymousClass003;
import X.C7384Etj;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class FirstByteGate extends OutputStream {
    public final Function0<Boolean> claim;
    public boolean open;
    public final OutputStream sink;

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        C7384Etj.A0Y(bArr, 0);
        if (!this.open && AnonymousClass003.A1Y(this.claim)) {
            this.open = true;
        }
        if (this.open) {
            this.sink.write(bArr, i, i2);
        }
    }

    public FirstByteGate(OutputStream outputStream, Function0<Boolean> function0) {
        AnonymousClass003.A0u(outputStream, function0);
        this.sink = outputStream;
        this.claim = function0;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }
}
