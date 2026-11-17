package X;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.util.Pair;
import android.view.Surface;
import java.nio.ByteBuffer;

/* renamed from: X.DxP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC6181DxP extends InterfaceC6185DxT {
    void A6q(MediaCrypto mediaCrypto, MediaFormat mediaFormat, Surface surface, Object obj, int i);

    boolean A70();

    MediaFormat ADu();

    Integer AGu();

    Pair<Long, Integer> AIg();

    int ALq();

    ByteBuffer AN1(int i, int i2);

    boolean AOq();

    boolean AOt();

    boolean AOw();

    boolean AOy(int i);

    void Ae8(boolean z);

    void AeU(boolean z);

    void reset();

    void start();

    void stop();
}
