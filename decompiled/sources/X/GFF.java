package X;

import androidx.health.platform.client.proto.Utf8$UnpairedSurrogateException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public final class GFF {
    public static final GFF<?> A03 = new GFF(true);
    public boolean A00;
    public boolean A01;
    public final DUL<T, Object> A02 = new DUN();

    private final void A01() {
        if (this.A01) {
            return;
        }
        DUL<T, Object> dul = this.A02;
        int size = dul.A00.size();
        for (int i = 0; i < size; i++) {
            Map.Entry entry = dul.A00.get(i);
            if (entry.getValue() instanceof GF2) {
                ((GF2) entry.getValue()).A07();
            }
        }
        dul.A05();
        this.A01 = true;
    }

    public static void A02(GFE gfe, EnumC10215Grb enumC10215Grb, Object obj, int i) {
        long jDoubleToRawLongBits;
        int iFloatToRawIntBits;
        long jA05;
        GF8 gf8;
        int iA0F;
        if (enumC10215Grb != EnumC10215Grb.A03) {
            gfe.A04((i << 3) | enumC10215Grb.wireType);
            switch (GFY.A00[enumC10215Grb.ordinal()]) {
                case 1:
                    jDoubleToRawLongBits = Double.doubleToRawLongBits(BV6.A00(obj));
                    gfe.A05(jDoubleToRawLongBits);
                    break;
                case 2:
                    iFloatToRawIntBits = Float.floatToRawIntBits(AnonymousClass001.A02(obj));
                    gfe.A02(iFloatToRawIntBits);
                    break;
                case 3:
                case 4:
                    jA05 = C3cG.A05(obj);
                    gfe.A06(jA05);
                    break;
                case 5:
                case 18:
                    gfe.A03(AnonymousClass001.A0F(obj));
                    break;
                case 6:
                case 15:
                    jDoubleToRawLongBits = C3cG.A05(obj);
                    gfe.A05(jDoubleToRawLongBits);
                    break;
                case 7:
                case 14:
                    iFloatToRawIntBits = AnonymousClass001.A0F(obj);
                    gfe.A02(iFloatToRawIntBits);
                    break;
                case 8:
                    gfe.A01(AnonymousClass001.A1X(obj) ? (byte) 1 : (byte) 0);
                    break;
                case 9:
                    gf8 = (GF8) obj;
                    gf8.Aj0(gfe);
                    break;
                case 10:
                    gf8 = (GF8) obj;
                    gfe.A04(((GF5) gf8).A04(null));
                    gf8.Aj0(gfe);
                    break;
                case 11:
                    if (!(obj instanceof GEY)) {
                        gfe.A08((String) obj);
                        break;
                    }
                    gfe.A07((GEY) obj);
                    break;
                case 12:
                    if (!(obj instanceof GEY)) {
                        byte[] bArr = (byte[]) obj;
                        int length = bArr.length;
                        gfe.A04(length);
                        GFE.A00(gfe, bArr, 0, length);
                        break;
                    }
                    gfe.A07((GEY) obj);
                    break;
                case 13:
                    iA0F = AnonymousClass001.A0F(obj);
                    break;
                case 16:
                    iA0F = AbstractC7607F5u.A0A(AnonymousClass001.A0F(obj));
                    break;
                case 17:
                    jA05 = AbstractC7610F5x.A0S(C3cG.A05(obj));
                    gfe.A06(jA05);
                    break;
            }
        }
        int i2 = i << 3;
        gfe.A04(i2 | 3);
        ((GF8) obj).Aj0(gfe);
        iA0F = i2 | 4;
        gfe.A04(iA0F);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* bridge */ /* synthetic */ Object clone() {
        Map.Entry entryA0l;
        GFF gff = new GFF();
        DUL<T, Object> dul = this.A02;
        if (0 < dul.A00.size()) {
            entryA0l = (Map.Entry) dul.A00.get(0);
        } else {
            Iterator it = (dul.A01.isEmpty() ? Collections.EMPTY_SET : dul.A01.entrySet()).iterator();
            if (!it.hasNext()) {
                gff.A00 = this.A00;
                return gff;
            }
            entryA0l = C3cH.A0l(it);
        }
        entryA0l.getKey();
        entryA0l.getValue();
        throw BV4.A0a("isRepeated");
    }

    public final boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof GFF) {
            return this.A02.equals(((GFF) o).A02);
        }
        return false;
    }

    public final int hashCode() {
        return this.A02.hashCode();
    }

    public GFF() {
    }

    public static int A00(final EnumC10215Grb type, final Object number, final int value) {
        int iA04;
        long jA0F;
        int iA08;
        int iA0A;
        int iNumberOfLeadingZeros;
        int length;
        int iA0C = AbstractC7610F5x.A0C(value);
        if (type == EnumC10215Grb.A03) {
            iA0C *= 2;
        }
        switch (GFY.A00[type.ordinal()]) {
            case 1:
            case 6:
            case 15:
                iA08 = 8;
                return iA0C + iA08;
            case 2:
            case 7:
            case 14:
                iA08 = 4;
                return iA0C + iA08;
            case 3:
            case 4:
                jA0F = C3cG.A05(number);
                iNumberOfLeadingZeros = 640 - (Long.numberOfLeadingZeros(jA0F) * 9);
                iA08 = iNumberOfLeadingZeros >>> 6;
                return iA0C + iA08;
            case 5:
            case 18:
                jA0F = AnonymousClass001.A0F(number);
                iNumberOfLeadingZeros = 640 - (Long.numberOfLeadingZeros(jA0F) * 9);
                iA08 = iNumberOfLeadingZeros >>> 6;
                return iA0C + iA08;
            case 8:
                iA08 = 1;
                return iA0C + iA08;
            case 9:
                iA08 = ((GF5) ((GF8) number)).A04(null);
                return iA0C + iA08;
            case 10:
                iA04 = ((GF5) ((GF8) number)).A04(null);
                iA08 = AbstractC7610F5x.A06(iA04);
                return iA0C + iA08;
            case 11:
                if (!(number instanceof GEY)) {
                    String str = (String) number;
                    boolean z = GFE.A05;
                    try {
                        length = GE5.A00(str);
                    } catch (Utf8$UnpairedSurrogateException unused) {
                        length = str.getBytes(AbstractC9349GFi.A04).length;
                    }
                    iA08 = AbstractC7610F5x.A06(length);
                    return iA0C + iA08;
                }
                iA08 = AbstractC7610F5x.A06(iA04);
                return iA0C + iA08;
            case 12:
                iA04 = !(number instanceof GEY) ? ((byte[]) number).length : ((GEY) number).A01();
                iA08 = AbstractC7610F5x.A06(iA04);
                return iA0C + iA08;
            case 13:
                iA0A = AnonymousClass001.A0F(number);
                iNumberOfLeadingZeros = 352 - (Integer.numberOfLeadingZeros(iA0A) * 9);
                iA08 = iNumberOfLeadingZeros >>> 6;
                return iA0C + iA08;
            case 16:
                iA0A = AbstractC7607F5u.A0A(AnonymousClass001.A0F(number));
                iNumberOfLeadingZeros = 352 - (Integer.numberOfLeadingZeros(iA0A) * 9);
                iA08 = iNumberOfLeadingZeros >>> 6;
                return iA0C + iA08;
            case 17:
                long jA05 = C3cG.A05(number);
                boolean z2 = GFE.A05;
                iA08 = AbstractC7609F5w.A08(AbstractC7610F5x.A0S(jA05));
                return iA0C + iA08;
            default:
                throw BV4.A0c("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public GFF(final boolean dummy) {
        A01();
        A01();
    }
}
