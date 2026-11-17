package X;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.Ec5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6908Ec5 implements Function0 {
    public final C6880Ebc A00;
    public final /* synthetic */ C6879Ebb A01;

    public C6908Ec5(C6879Ebb c6879Ebb, C6880Ebc c6880Ebc) {
        this.A01 = c6879Ebb;
        this.A00 = c6880Ebc;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() throws IOException {
        Ec2 ec2;
        Ec2 ec22;
        C6880Ebc c6880Ebc;
        Ec2 ec23 = Ec2.INTERNAL_ERROR;
        IOException e = null;
        try {
            try {
                c6880Ebc = this.A00;
            } catch (IOException e2) {
                e = e2;
                ec2 = Ec2.PROTOCOL_ERROR;
                ec22 = ec2;
            }
            if (!c6880Ebc.A03(this, true)) {
                throw BV4.A0K("Required SETTINGS preface not received");
            }
            while (c6880Ebc.A03(this, false)) {
            }
            ec2 = Ec2.NO_ERROR;
            ec22 = Ec2.CANCEL;
            this.A01.A04(e, ec2, ec22);
            AbstractC6843Eav.A0A(this.A00);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            this.A01.A04(null, ec23, ec23);
            AbstractC6843Eav.A0A(this.A00);
            throw th;
        }
    }
}
