package X;

import com.facebook.aura.activation.view.InviteCodeScratcherKt;

/* loaded from: classes6.dex */
public final class HBQ {
    public float A00;
    public float A01;
    public float A02;
    public float A03;

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("[");
        sbA0x.append(this.A01);
        sbA0x.append(InviteCodeScratcherKt.CODE_SEPARATOR);
        sbA0x.append(this.A02);
        sbA0x.append(InviteCodeScratcherKt.CODE_SEPARATOR);
        sbA0x.append(this.A03);
        sbA0x.append(InviteCodeScratcherKt.CODE_SEPARATOR);
        sbA0x.append(this.A00);
        return AnonymousClass001.A0v("]", sbA0x);
    }

    public HBQ(HBQ hbq) {
        this.A01 = hbq.A01;
        this.A02 = hbq.A02;
        this.A03 = hbq.A03;
        this.A00 = hbq.A00;
    }

    public HBQ(float f, float f2, float f3, float f4) {
        this.A01 = f;
        this.A02 = f2;
        this.A03 = f3;
        this.A00 = f4;
    }
}
