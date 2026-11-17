package X;

import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.Eep, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7043Eep extends AbstractC7024EeV<C6988Edo, EfF<InterfaceC7064EfB>> {
    public int A00;
    public boolean A01;
    public final C7198EiA A02;
    public final C7051Eex A03;
    public final InterfaceC7029Eea A04;
    public final InterfaceC7027EeY A05;
    public final /* synthetic */ C7041Een A06;

    public static final void A02(AbstractC7043Eep abstractC7043Eep, boolean z) {
        synchronized (abstractC7043Eep) {
            if (z) {
                if (!abstractC7043Eep.A01) {
                    ((AbstractC7024EeV) abstractC7043Eep).A00.AV9(1.0f);
                    abstractC7043Eep.A01 = true;
                    abstractC7043Eep.A03.A03();
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7043Eep(InterfaceC7028EeZ interfaceC7028EeZ, C7041Een c7041Een, InterfaceC7029Eea interfaceC7029Eea) {
        super(interfaceC7028EeZ);
        this.A06 = c7041Een;
        this.A04 = interfaceC7029Eea;
        C7185Ehv c7185Ehv = (C7185Ehv) interfaceC7029Eea;
        this.A05 = c7185Ehv.A05;
        C7198EiA c7198EiA = c7185Ehv.A07.A06;
        C7384Etj.A0U(c7198EiA);
        this.A02 = c7198EiA;
        C7042Eeo c7042Eeo = new C7042Eeo(this, c7041Een);
        Executor executor = c7041Een.A05;
        interfaceC7029Eea.AGL();
        this.A03 = new C7051Eex(c7042Eeo, executor);
        interfaceC7029Eea.A3R(new C7061Ef8(this));
    }

    public static final C6996Edx A01(InterfaceC7064EfB interfaceC7064EfB, InterfaceC7034Eeg interfaceC7034Eeg, AbstractC7043Eep abstractC7043Eep, String str, String str2, String str3, String str4, long j, boolean z) {
        HashMap mapA0v;
        Map<String, Object> extras;
        Object obj;
        String string = null;
        if (!abstractC7043Eep.A05.AbE(abstractC7043Eep.A04, "DecodeProducer")) {
            return null;
        }
        String strValueOf = String.valueOf(j);
        String strValueOf2 = String.valueOf(((C7070EfR) interfaceC7034Eeg).A02);
        String strValueOf3 = String.valueOf(z);
        if (interfaceC7064EfB != null && (extras = interfaceC7064EfB.getExtras()) != null && (obj = extras.get("non_fatal_decode_error")) != null) {
            string = obj.toString();
        }
        if (interfaceC7064EfB instanceof AbstractC7067EfE) {
            Bitmap bitmap = ((AbstractC7067EfE) interfaceC7064EfB).A04;
            if (bitmap == null) {
                throw BV4.A0U();
            }
            String strA07 = FGI.A07(bitmap.getWidth(), bitmap.getHeight(), "x");
            mapA0v = BV4.A0v(8);
            mapA0v.put("bitmapSize", strA07);
            mapA0v.put("queueTime", strValueOf);
            mapA0v.put("hasGoodQuality", strValueOf2);
            mapA0v.put("isFinal", strValueOf3);
            mapA0v.put("encodedImageSize", str2);
            mapA0v.put("imageFormat", str);
            mapA0v.put("requestedImageSize", str3);
            mapA0v.put("sampleSize", str4);
            mapA0v.put("byteCount", BV4.A0l(C60O.A0w(), bitmap.getByteCount()));
        } else {
            mapA0v = BV4.A0v(7);
            mapA0v.put("queueTime", strValueOf);
            mapA0v.put("hasGoodQuality", strValueOf2);
            mapA0v.put("isFinal", strValueOf3);
            mapA0v.put("encodedImageSize", str2);
            mapA0v.put("imageFormat", str);
            mapA0v.put("requestedImageSize", str3);
            mapA0v.put("sampleSize", str4);
        }
        if (string != null) {
            mapA0v.put("non_fatal_decode_error", string);
        }
        return new C6996Edx(mapA0v);
    }

    @Override // X.AbstractC7024EeV, X.AbstractC6691EUy
    public final void A04(float f) {
        super.A04(f * 0.99f);
    }
}
