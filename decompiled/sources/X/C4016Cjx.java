package X;

import com.facebook.falco.sampling.FFSamplingBridgeJava;

/* renamed from: X.Cjx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4016Cjx implements InterfaceC4017Cjy {
    public final /* synthetic */ C4947DGs A00;

    @Override // X.InterfaceC4017Cjy
    public final void ATJ(boolean z) {
        if (!z) {
            DG8 dg8 = this.A00.A00;
            if (dg8 == null) {
                C7384Etj.A0b("eventQueue");
                throw F60.createAndThrow();
            }
            synchronized (((HandlerC4948DGt) dg8).A0C) {
            }
        }
        FFSamplingBridgeJava.onUploadComplete(false, null, z);
    }

    public C4016Cjx(C4947DGs c4947DGs) {
        this.A00 = c4947DGs;
    }
}
