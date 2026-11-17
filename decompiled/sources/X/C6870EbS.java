package X;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* renamed from: X.EbS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6870EbS extends AbstractC6894Ebq {
    public long A00;
    public boolean A01;
    public final C6854EbC A02;
    public final /* synthetic */ C6863EbL A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C6870EbS(C6854EbC c6854EbC, C6854EbC c6854EbC2) {
        super(c6854EbC2);
        this.A03 = c6854EbC2;
        this.A02 = c6854EbC;
        this.A00 = -1L;
        this.A01 = true;
    }

    @Override // X.AbstractC6894Ebq, X.InterfaceC6834Eam
    public final long AZ7(C6818EaW c6818EaW, long j) throws IOException, NumberFormatException {
        C7384Etj.A0Y(c6818EaW, 0);
        if (j < 0) {
            throw C7384Etj.A0D(Long.valueOf(j), "byteCount < 0: ");
        }
        if (super.A00) {
            throw BV4.A0R();
        }
        if (!this.A01) {
            return -1L;
        }
        long j2 = this.A00;
        if (j2 == 0 || j2 == -1) {
            if (j2 != -1) {
                this.A03.A06.AZa();
            }
            try {
                C6863EbL c6863EbL = this.A03;
                InterfaceC6831Eaj interfaceC6831Eaj = c6863EbL.A06;
                this.A00 = interfaceC6831Eaj.AZN();
                String strA0l = AnonymousClass002.A0l(interfaceC6831Eaj.AZa());
                long j3 = this.A00;
                if (j3 < 0 || (strA0l.length() > 0 && !strA0l.startsWith(";"))) {
                    StringBuilder sbA0z = C60O.A0z("expected chunk size and optional extensions but was \"", j3);
                    sbA0z.append(strA0l);
                    throw new ProtocolException(C8j3.A16(sbA0z, '\"'));
                }
                if (j3 == 0) {
                    this.A01 = false;
                    c6863EbL.A01 = c6863EbL.A04.A00();
                    C6859EbH c6859EbH = c6863EbL.A02;
                    C7384Etj.A0X(c6859EbH);
                    InterfaceC6803EaE interfaceC6803EaE = c6859EbH.A0D;
                    C6854EbC c6854EbC = this.A02;
                    C6844Eaw c6844Eaw = c6863EbL.A01;
                    C7384Etj.A0X(c6844Eaw);
                    AbstractC6802EaD.A01(interfaceC6803EaE, c6844Eaw, c6854EbC);
                    A00();
                }
                if (!this.A01) {
                    return -1L;
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }
        long jAZ7 = super.AZ7(c6818EaW, Math.min(j, this.A00));
        if (jAZ7 != -1) {
            this.A00 -= jAZ7;
            return jAZ7;
        }
        this.A03.A03.A01();
        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
        A00();
        throw protocolException;
    }

    @Override // X.InterfaceC6834Eam, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (super.A00) {
            return;
        }
        if (this.A01) {
            if (!AbstractC6843Eav.A0F(TimeUnit.MILLISECONDS, this, 100)) {
                this.A03.A03.A01();
                A00();
            }
        }
        super.A00 = true;
    }
}
