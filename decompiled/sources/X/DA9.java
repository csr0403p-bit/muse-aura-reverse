package X;

/* loaded from: classes5.dex */
public class DA9 extends DAB {
    public final byte[] zza;

    @Override // X.DA8
    public final boolean equals(Object obj) {
        int iA03;
        if (obj != this) {
            if ((obj instanceof DA8) && (iA03 = A03()) == ((DA8) obj).A03()) {
                if (iA03 != 0) {
                    if (!(obj instanceof DA9)) {
                        return obj.equals(this);
                    }
                    DA9 da9 = (DA9) obj;
                    int i = this.zzc;
                    int i2 = da9.zzc;
                    if (i == 0 || i2 == 0 || i == i2) {
                        if (iA03 > da9.A03()) {
                            throw C60O.A0i(BV4.A0l(C60O.A0y("Length too large: ", iA03), iA03));
                        }
                        byte[] bArr = this.zza;
                        byte[] bArr2 = da9.zza;
                        int i3 = this instanceof DAA ? ((DAA) this).zzc : 0;
                        int i4 = i3 + iA03;
                        int i5 = da9 instanceof DAA ? ((DAA) da9).zzc : 0;
                        while (i3 < i4) {
                            if (bArr[i3] == bArr2[i5]) {
                                i3++;
                                i5++;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public DA9(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }
}
