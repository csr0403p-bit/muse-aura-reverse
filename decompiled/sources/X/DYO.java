package X;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class DYO implements InterfaceC5403Dhw {
    public static final C6154Dwx A06 = C6162Dx5.A02(C6162Dx5.A00(), "application/id3");
    public static final C6154Dwx A07 = C6162Dx5.A02(C6162Dx5.A00(), "application/x-scte35");
    public int A00;
    public final long A01;
    public final long A02;
    public final String A03;
    public final String A04;
    public final byte[] A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                DYO dyo = (DYO) obj;
                if (this.A01 != dyo.A01 || this.A02 != dyo.A02 || !C6xC.A00(this.A03, dyo.A03) || !C6xC.A00(this.A04, dyo.A04) || !Arrays.equals(this.A05, dyo.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC5403Dhw
    public final C6154Dwx AMq() {
        String str;
        String str2 = this.A03;
        switch (str2.hashCode()) {
            case -1468477611:
                if (str2.equals("urn:scte:scte35:2014:bin")) {
                    return A07;
                }
                return null;
            case -795945609:
                str = "https://aomedia.org/emsg/ID3";
                break;
            case 1303648457:
                str = "https://developer.apple.com/streaming/emsg-id3";
                break;
            default:
                return null;
        }
        if (str2.equals(str)) {
            return A06;
        }
        return null;
    }

    public final int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int iA0B = BV8.A0B(this.A03);
        String str = this.A04;
        int iA06 = AnonymousClass006.A06(this.A02, AnonymousClass006.A06(this.A01, (iA0B + (str != null ? str.hashCode() : 0)) * 31)) + Arrays.hashCode(this.A05);
        this.A00 = iA06;
        return iA06;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("EMSG: scheme=");
        sbA0x.append(this.A03);
        sbA0x.append(", id=");
        sbA0x.append(this.A02);
        sbA0x.append(", durationMs=");
        sbA0x.append(this.A01);
        sbA0x.append(", value=");
        return AnonymousClass001.A0v(this.A04, sbA0x);
    }

    public DYO(String str, String str2, byte[] bArr, long j, long j2) {
        this.A03 = str;
        this.A04 = str2;
        this.A01 = j;
        this.A02 = j2;
        this.A05 = bArr;
    }

    @Override // X.InterfaceC5403Dhw
    public final byte[] AMp() {
        if (AMq() != null) {
            return this.A05;
        }
        return null;
    }

    @Override // X.InterfaceC5403Dhw
    public final /* synthetic */ void AY7(C10389Has c10389Has) {
    }
}
