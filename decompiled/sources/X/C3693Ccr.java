package X;

import android.content.Context;
import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Ccr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3693Ccr implements InterfaceC3731CdU {
    public CUK A00;
    public final AbstractC3750Cdn A01;
    public final CUK A02;

    @Override // X.InterfaceC3731CdU
    public final void AjI(Cbz cbz) throws UnsupportedEncodingException {
        CUK cuk;
        byte[] byteArray;
        C4510Cxk c4510Cxk;
        Class<?> cls;
        C9k c9k;
        int i = ((C3678Ccc) this.A01).A00;
        if (i == 0) {
            cuk = this.A00;
            if (cuk == null) {
                return;
            }
        } else {
            cuk = this.A02;
        }
        InterfaceC3723CdM interfaceC3723CdM = (InterfaceC3723CdM) cuk.get();
        C3717CdG c3717CdG = (C3717CdG) cbz;
        int i2 = c3717CdG.A01;
        C3709Cd8 c3709Cd8 = c3717CdG.A00;
        c3709Cd8.A03 = Boolean.valueOf(BV7.A1T(1, i ^ 1));
        c3709Cd8.A01 = false;
        C3712CdB c3712CdB = c3717CdG.A02;
        c3712CdB.A05 = new C3706Cd4(c3709Cd8);
        try {
            C3737Cda.A00();
            if (i == 0) {
                Cd5 cd5 = new Cd5(c3712CdB);
                CHD chd = new CHD();
                D13.A00.A6o(chd);
                chd.A01 = true;
                CHC chc = new CHC(chd);
                StringWriter stringWriter = new StringWriter();
                try {
                    chc.A00(stringWriter, cd5);
                } catch (IOException unused) {
                }
                byteArray = stringWriter.toString().getBytes("utf-8");
            } else {
                Cd5 cd52 = new Cd5(c3712CdB);
                CHM chm = new CHM();
                D13.A00.A6o(chm);
                HashMap mapA0w = BV4.A0w(chm.A01);
                HashMap mapA0w2 = BV4.A0w(chm.A02);
                InterfaceC3288C9m interfaceC3288C9m = chm.A00;
                ByteArrayOutputStream byteArrayOutputStreamA0F = BV4.A0F();
                try {
                    c4510Cxk = new C4510Cxk(interfaceC3288C9m, byteArrayOutputStreamA0F, mapA0w, mapA0w2);
                    Map map = c4510Cxk.A02;
                    cls = cd52.getClass();
                    c9k = (C9k) map.get(cls);
                } catch (IOException unused2) {
                }
                if (c9k == null) {
                    throw new EncodingException("No encoder for ".concat(BV7.A0w(cls)));
                }
                c9k.AA4(cd52, c4510Cxk);
                byteArray = byteArrayOutputStreamA0F.toByteArray();
            }
            interfaceC3723CdM.AcV(new Ce4(i2 != 0 ? Ce5.DEFAULT : Ce5.VERY_LOW, byteArray));
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    public C3693Ccr(Context context, AbstractC3750Cdn abstractC3750Cdn) {
        this.A01 = abstractC3750Cdn;
        CfH cfH = CfH.A01;
        C3847Cfc.A01(context);
        final C3846Cfb c3846CfbA02 = C3847Cfc.A00().A02(cfH);
        if (CfH.A03.contains(new Ce6("json"))) {
            this.A00 = new CUJ(new CUK() { // from class: X.CgE
                @Override // X.CUK
                public final Object get() {
                    return c3846CfbA02.AM1(new Ce6("json"), C3915Cgt.A00, "FIREBASE_ML_SDK");
                }
            });
        }
        this.A02 = new CUJ(new CUK() { // from class: X.CgF
            @Override // X.CUK
            public final Object get() {
                return c3846CfbA02.AM1(new Ce6("proto"), C3913Cgr.A00, "FIREBASE_ML_SDK");
            }
        });
    }
}
