package X;

import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public interface EAX {
    public static final ByteBuffer A00 = BV8.A17(0);

    EAL A6n(EAL eal);

    ByteBuffer AIL();

    void AYz();

    void AZ0(ByteBuffer byteBuffer);

    void flush();

    boolean isActive();

    boolean isEnded();

    void reset();
}
