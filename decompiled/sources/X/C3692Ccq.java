package X;

import android.content.Context;
import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Ccq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3692Ccq implements InterfaceC3730CdT {
    public CUK A00;
    public final AbstractC3747Cdk A01;
    public final CUK A02;

    @Override // X.InterfaceC3730CdT
    public final void AjH(InterfaceC3671CcV interfaceC3671CcV) throws UnsupportedEncodingException {
        CUK cuk;
        byte[] byteArray;
        C4504Cxd c4504Cxd;
        Class<?> cls;
        C9k c9k;
        int i = ((C3675CcZ) this.A01).A00;
        if (i == 0) {
            cuk = this.A00;
            if (cuk == null) {
                return;
            }
        } else {
            cuk = this.A02;
        }
        InterfaceC3723CdM interfaceC3723CdM = (InterfaceC3723CdM) cuk.get();
        CcQ ccQ = (CcQ) interfaceC3671CcV;
        C3688Ccm c3688Ccm = ccQ.A00;
        c3688Ccm.A03 = Boolean.valueOf(BV7.A1T(1, i ^ 1));
        c3688Ccm.A01 = false;
        C3691Ccp c3691Ccp = ccQ.A01;
        c3691Ccp.A02 = new C3689Ccn(c3688Ccm);
        try {
            C3518CRs.A00();
            if (i == 0) {
                C3690Cco c3690Cco = new C3690Cco(c3691Ccp);
                CHD chd = new CHD();
                D0F.A00.A6o(chd);
                chd.A01 = true;
                CHC chc = new CHC(chd);
                StringWriter stringWriter = new StringWriter();
                try {
                    chc.A00(stringWriter, c3690Cco);
                } catch (IOException unused) {
                }
                byteArray = stringWriter.toString().getBytes("utf-8");
            } else {
                C3690Cco c3690Cco2 = new C3690Cco(c3691Ccp);
                CHK chk = new CHK();
                D0F.A00.A6o(chk);
                HashMap mapA0w = BV4.A0w(chk.A01);
                HashMap mapA0w2 = BV4.A0w(chk.A02);
                InterfaceC3288C9m interfaceC3288C9m = chk.A00;
                ByteArrayOutputStream byteArrayOutputStreamA0F = BV4.A0F();
                try {
                    c4504Cxd = new C4504Cxd(interfaceC3288C9m, byteArrayOutputStreamA0F, mapA0w, mapA0w2);
                    Map map = c4504Cxd.A02;
                    cls = c3690Cco2.getClass();
                    c9k = (C9k) map.get(cls);
                } catch (IOException unused2) {
                }
                if (c9k == null) {
                    throw new EncodingException("No encoder for ".concat(BV7.A0w(cls)));
                }
                c9k.AA4(c3690Cco2, c4504Cxd);
                byteArray = byteArrayOutputStreamA0F.toByteArray();
            }
            interfaceC3723CdM.AcV(new Ce4(Ce5.VERY_LOW, byteArray));
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    public C3692Ccq(Context context, AbstractC3747Cdk abstractC3747Cdk) {
        this.A01 = abstractC3747Cdk;
        CfH cfH = CfH.A01;
        C3847Cfc.A01(context);
        final C3846Cfb c3846CfbA02 = C3847Cfc.A00().A02(cfH);
        if (CfH.A03.contains(new Ce6("json"))) {
            this.A00 = new CUJ(new CUK() { // from class: X.CgC
                @Override // X.CUK
                public final Object get() {
                    return c3846CfbA02.AM1(new Ce6("json"), C3912Cgq.A00, "FIREBASE_ML_SDK");
                }
            });
        }
        this.A02 = new CUJ(new CUK() { // from class: X.CgD
            @Override // X.CUK
            public final Object get() {
                return c3846CfbA02.AM1(new Ce6("proto"), C3911Cgp.A00, "FIREBASE_ML_SDK");
            }
        });
    }
}
