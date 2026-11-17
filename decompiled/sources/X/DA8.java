package X;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes5.dex */
public abstract class DA8 implements Iterable<Byte>, Serializable {
    public static final DA8 A00 = new DA9(DAC.A05);
    public int zzc = 0;

    public static DA9 A01(byte[] bArr, int i) {
        A00(0, i, bArr.length);
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return new DA9(bArr2);
    }

    public abstract boolean equals(Object obj);

    public static int A00(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw BV6.A0g(FGI.A0I("Beginning index: ", i, " < 0"));
        }
        if (i2 < i) {
            throw C8j3.A0y(AbstractC7606F5t.A00(25), ", ", i, i2);
        }
        throw C8j3.A0y("End index: ", " >= ", i2, i3);
    }

    public final int A03() {
        DA9 da9 = (DA9) this;
        return da9 instanceof DAA ? ((DAA) da9).zzd : da9.zza.length;
    }

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int iA03 = A03();
            i = iA03;
            DA9 da9 = (DA9) this;
            int i2 = da9 instanceof DAA ? ((DAA) da9).zzc : 0;
            Charset charset = DAC.A02;
            for (int i3 = i2; i3 < i2 + iA03; i3++) {
                i = (i * 31) + da9.zza[i3];
            }
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new DA7(this);
    }

    public final String toString() {
        DA8 daa;
        String strConcat;
        Locale locale = Locale.ROOT;
        String strA0x = BV7.A0x(this);
        int iA03 = A03();
        Integer numValueOf = Integer.valueOf(iA03);
        if (iA03 <= 50) {
            strConcat = A02(this);
        } else {
            DA9 da9 = (DA9) this;
            int iA00 = A00(0, 47, da9.A03());
            if (iA00 == 0) {
                daa = A00;
            } else {
                daa = new DAA(da9.zza, da9 instanceof DAA ? ((DAA) da9).zzc : 0, iA00);
            }
            strConcat = A02(daa).concat("...");
        }
        return String.format(locale, AbstractC7606F5t.A00(23), strA0x, numValueOf, strConcat);
    }

    public static String A02(DA8 da8) {
        int i;
        String str;
        StringBuilder sbA0p = BV4.A0p(da8.A03());
        for (int i2 = 0; i2 < da8.A03(); i2++) {
            DA9 da9 = (DA9) da8;
            if (da9 instanceof DAA) {
                DAA daa = (DAA) da9;
                int i3 = daa.zzd;
                if (((i3 - (i2 + 1)) | i2) < 0) {
                    if (i2 < 0) {
                        throw new ArrayIndexOutOfBoundsException(FGI.A0H("Index < 0: ", i2));
                    }
                    throw new ArrayIndexOutOfBoundsException(FGI.A0T(AbstractC7606F5t.A00(29), ", ", i2, i3));
                }
                i = daa.zza[daa.zzc + i2];
            } else {
                i = da9.zza[i2];
            }
            if (i == 34) {
                str = "\\\"";
            } else if (i == 39) {
                str = "\\'";
            } else if (i != 92) {
                switch (i) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (i < 32 || i > 126) {
                            sbA0p.append('\\');
                            sbA0p.append((char) (((i >>> 6) & 3) + 48));
                            sbA0p.append((char) (((i >>> 3) & 7) + 48));
                            i = (i & 7) + 48;
                        }
                        sbA0p.append((char) i);
                        continue;
                        break;
                }
            } else {
                str = "\\\\";
            }
            sbA0p.append(str);
        }
        return sbA0p.toString();
    }

    public final byte[] A04() {
        int iA03 = A03();
        if (iA03 == 0) {
            return DAC.A05;
        }
        byte[] bArr = new byte[iA03];
        DA9 da9 = (DA9) this;
        if (!(da9 instanceof DAA)) {
            System.arraycopy(da9.zza, 0, bArr, 0, iA03);
            return bArr;
        }
        DAA daa = (DAA) da9;
        System.arraycopy(daa.zza, daa.zzc, bArr, 0, iA03);
        return bArr;
    }
}
