package org.bouncycastle.util.encoders;

/* loaded from: classes5.dex */
public class DecoderException extends IllegalStateException {
    public Throwable cause;

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }
}
