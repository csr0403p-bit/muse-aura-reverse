package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;

/* loaded from: classes5.dex */
public final class EHl {
    public C6572EHo A01;
    public String A03;
    public final C6572EHo A05;
    public final String A06;
    public long A00 = -1;
    public Integer A02 = C79.A0K;
    public final long A04 = System.currentTimeMillis();

    public EHl(C6572EHo c6572EHo, String str, String str2) {
        this.A06 = str;
        this.A05 = c6572EHo;
        this.A03 = str2;
    }

    public final String toString() {
        String strA00;
        StringBuilder sbA0x = C60O.A0x("{src_pkg=");
        sbA0x.append(this.A06);
        sbA0x.append(", phone_id=");
        C6572EHo c6572EHo = this.A01;
        sbA0x.append(c6572EHo == null ? null : c6572EHo.toString());
        sbA0x.append(", status=");
        switch (this.A02.intValue()) {
            case 2:
                strA00 = "failed";
                break;
            case 3:
                strA00 = C60N.A00(1);
                break;
            case 4:
                strA00 = HatchCcvLoggingKt.NO_POSTAL_FIELD;
                break;
            case 5:
                strA00 = "same";
                break;
            case 6:
                strA00 = "older";
                break;
            default:
                strA00 = "newer";
                break;
        }
        sbA0x.append(strA00);
        sbA0x.append(", duration=");
        long j = this.A00;
        if (j == -1) {
            throw C60O.A0i("End timestamp not initialized yet.");
        }
        sbA0x.append((int) (j - this.A04));
        sbA0x.append(", prev_phone_id=");
        C6572EHo c6572EHo2 = this.A05;
        sbA0x.append(c6572EHo2 == null ? null : c6572EHo2.toString());
        sbA0x.append(", sync_medium=");
        sbA0x.append(this.A03);
        sbA0x.append(", entry_point=");
        sbA0x.append((String) null);
        sbA0x.append(", session_key=");
        sbA0x.append((String) null);
        sbA0x.append(", is_phone_id_synced=");
        sbA0x.append(false);
        sbA0x.append(", ordered_pkgs_to_inquire=");
        sbA0x.append((String) null);
        sbA0x.append(", failure_reason=");
        sbA0x.append((String) null);
        sbA0x.append(", query_sequence=");
        return BV8.A0z(sbA0x, -1);
    }
}
