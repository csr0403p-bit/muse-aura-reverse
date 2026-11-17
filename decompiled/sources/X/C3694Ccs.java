package X;

import android.content.Context;
import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Ccs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3694Ccs implements InterfaceC3729CdS {
    public CUK A00;
    public final AbstractC3743Cdg A01;
    public final CUK A02;

    @Override // X.InterfaceC3729CdS
    public final void AjK(InterfaceC3592CWb interfaceC3592CWb) throws UnsupportedEncodingException {
        CUK cuk;
        byte[] byteArray;
        C4513Cxn c4513Cxn;
        Class<?> cls;
        C9k c9k;
        int i = ((C3676Cca) this.A01).A00;
        if (i == 0) {
            cuk = this.A00;
            if (cuk == null) {
                return;
            }
        } else {
            cuk = this.A02;
        }
        InterfaceC3723CdM interfaceC3723CdM = (InterfaceC3723CdM) cuk.get();
        C3716CdF c3716CdF = (C3716CdF) interfaceC3592CWb;
        int i2 = c3716CdF.A01;
        C3708Cd7 c3708Cd7 = c3716CdF.A00;
        c3708Cd7.A03 = Boolean.valueOf(BV7.A1T(1, i ^ 1));
        c3708Cd7.A01 = false;
        C3713CdC c3713CdC = c3716CdF.A02;
        c3713CdC.A05 = new C3705Cd3(c3708Cd7);
        try {
            C3736CdZ.A00();
            if (i == 0) {
                C3707Cd6 c3707Cd6 = new C3707Cd6(c3713CdC);
                CHD chd = new CHD();
                D1W.A00.A6o(chd);
                chd.A01 = true;
                CHC chc = new CHC(chd);
                StringWriter stringWriter = new StringWriter();
                try {
                    chc.A00(stringWriter, c3707Cd6);
                } catch (IOException unused) {
                }
                byteArray = stringWriter.toString().getBytes("utf-8");
            } else {
                C3707Cd6 c3707Cd62 = new C3707Cd6(c3713CdC);
                CHT cht = new CHT();
                D1W.A00.A6o(cht);
                HashMap mapA0w = BV4.A0w(cht.A01);
                HashMap mapA0w2 = BV4.A0w(cht.A02);
                InterfaceC3288C9m interfaceC3288C9m = cht.A00;
                ByteArrayOutputStream byteArrayOutputStreamA0F = BV4.A0F();
                try {
                    c4513Cxn = new C4513Cxn(interfaceC3288C9m, byteArrayOutputStreamA0F, mapA0w, mapA0w2);
                    Map map = c4513Cxn.A02;
                    cls = c3707Cd62.getClass();
                    c9k = (C9k) map.get(cls);
                } catch (IOException unused2) {
                }
                if (c9k == null) {
                    throw new EncodingException("No encoder for ".concat(BV7.A0w(cls)));
                }
                c9k.AA4(c3707Cd62, c4513Cxn);
                byteArray = byteArrayOutputStreamA0F.toByteArray();
            }
            interfaceC3723CdM.AcV(new Ce4(i2 != 0 ? Ce5.DEFAULT : Ce5.VERY_LOW, byteArray));
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    public C3694Ccs(Context context, AbstractC3743Cdg abstractC3743Cdg) {
        this.A01 = abstractC3743Cdg;
        CfH cfH = CfH.A01;
        C3847Cfc.A01(context);
        final C3846Cfb c3846CfbA02 = C3847Cfc.A00().A02(cfH);
        if (CfH.A03.contains(new Ce6("json"))) {
            this.A00 = new CUJ(new CUK() { // from class: X.CgH
                @Override // X.CUK
                public final Object get() {
                    return c3846CfbA02.AM1(new Ce6("json"), C3916Cgu.A00, "FIREBASE_ML_SDK");
                }
            });
        }
        this.A02 = new CUJ(new CUK() { // from class: X.CgG
            @Override // X.CUK
            public final Object get() {
                return c3846CfbA02.AM1(new Ce6("proto"), C3910Cgo.A00, "FIREBASE_ML_SDK");
            }
        });
    }
}
