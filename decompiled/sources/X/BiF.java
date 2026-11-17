package X;

import android.graphics.Bitmap;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class BiF {
    public AbstractC2814Blr A00;
    public BpR<AbstractC2811Blo, AbstractC2866BnZ<byte[]>> A01;
    public BpR<AbstractC2866BnZ<InterfaceC2873Bng>, Bitmap> A02;
    public BpR<AbstractC2812Blp, AbstractC2866BnZ<byte[]>> A03;
    public BpR<AbstractC2815Bls, AbstractC2866BnZ<InterfaceC2873Bng>> A04;
    public BpR<AbstractC2866BnZ<byte[]>, AbstractC2866BnZ<Bitmap>> A05;
    public BpR<AbstractC2813Blq, C2796BlX> A06;
    public BpR<AbstractC2866BnZ<byte[]>, AbstractC2866BnZ<InterfaceC2873Bng>> A07;
    public BpR<AbstractC2866BnZ<InterfaceC2873Bng>, InterfaceC2873Bng> A08;
    public final C2511Bch A09;
    public final Executor A0A;
    public final boolean A0B;

    public BiF(Executor executor) {
        C2511Bch c2511Bch = AbstractC2399BaC.A00;
        this.A0A = AbstractC2399BaC.A00.A01(LowMemoryQuirk.class) != null ? new ExecutorC2949Bpk(executor) : executor;
        this.A09 = c2511Bch;
        this.A0B = c2511Bch.A03(IncorrectJpegMetadataQuirk.class);
    }
}
