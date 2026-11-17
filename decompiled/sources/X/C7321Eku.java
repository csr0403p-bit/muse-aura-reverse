package X;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.nio.ByteBuffer;

/* renamed from: X.Eku, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7321Eku extends PhantomReference<ByteBuffer> {
    public final int A00;
    public final int A01;
    public final long A02;
    public final String A03;

    /* JADX WARN: Incorrect types in method signature: (Ljava/nio/ByteBuffer;Ljava/lang/ref/ReferenceQueue<-Ljava/nio/ByteBuffer;>;IJILjava/lang/String;)V */
    public C7321Eku(String str, ReferenceQueue referenceQueue, ByteBuffer byteBuffer, int i, int i2, long j) {
        super(byteBuffer, referenceQueue);
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
        this.A03 = str;
    }
}
