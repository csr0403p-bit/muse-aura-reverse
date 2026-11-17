package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.base.Ascii;

@Deprecated
/* renamed from: X.E2i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6356E2i implements InterfaceC5403Dhw {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C6356E2i c6356E2i = (C6356E2i) obj;
                if (!this.A00.equals(c6356E2i.A00) || !this.A01.equals(c6356E2i.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC5403Dhw
    public final /* synthetic */ byte[] AMp() {
        return null;
    }

    @Override // X.InterfaceC5403Dhw
    public final /* synthetic */ C6154Dwx AMq() {
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC5403Dhw
    public final void AY7(C10389Has c10389Has) {
        Integer numA02;
        Integer numA022;
        Integer numA023;
        Integer numA024;
        String str = this.A00;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS") && (numA024 = DX6.A02(this.A01)) != null) {
                    c10389Has.A0T = numA024;
                    break;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS") && (numA023 = DX6.A02(this.A01)) != null) {
                    c10389Has.A0S = numA023;
                    break;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER") && (numA022 = DX6.A02(this.A01)) != null) {
                    c10389Has.A0U = numA022;
                    break;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    c10389Has.A06 = this.A01;
                    break;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    c10389Has.A0D = this.A01;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c10389Has.A0G = this.A01;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c10389Has.A0B = this.A01;
                    break;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER") && (numA02 = DX6.A02(this.A01)) != null) {
                    c10389Has.A0J = numA02;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c10389Has.A05 = this.A01;
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c10389Has.A07 = this.A01;
                    break;
                }
                break;
        }
    }

    public final int hashCode() {
        return AnonymousClass001.A0H(this.A01, BV8.A0B(this.A00));
    }

    public final String toString() {
        return FGI.A0d("VC: ", this.A00, InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, this.A01);
    }

    public C6356E2i(String str, String str2) {
        this.A00 = Ascii.toUpperCase(str);
        this.A01 = str2;
    }
}
