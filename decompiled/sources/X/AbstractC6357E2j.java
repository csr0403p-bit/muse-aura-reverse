package X;

import android.util.Base64;
import androidx.media3.common.ParserException;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.E2j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6357E2j {
    public static E5F A01(E1P e1p, boolean z, boolean z2) throws ParserException {
        if (z) {
            A02(e1p, 3, false);
        }
        int iA0F = (int) e1p.A0F();
        Charset charset = StandardCharsets.UTF_8;
        e1p.A0M(charset, iA0F);
        long jA0F = e1p.A0F();
        String[] strArr = new String[(int) jA0F];
        for (int i = 0; i < jA0F; i++) {
            strArr[i] = e1p.A0M(charset, (int) e1p.A0F());
        }
        if (z2 && (e1p.A0A() & 1) == 0) {
            throw BV8.A0c("framing bit expected to be set");
        }
        return new E5F(strArr);
    }

    public static C5402Dhv A00(List<String> list) {
        ArrayList arrayListA0h = C3cG.A0h();
        for (int i = 0; i < list.size(); i++) {
            String strA0n = C60Q.A0n(list, i);
            String[] strArrSplit = strA0n.split(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, 2);
            if (strArrSplit.length != 2) {
                BV6.A1I("Failed to parse Vorbis comment: ", strA0n, "VorbisUtil");
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayListA0h.add(C6338E1o.A00(BV6.A0Z(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e) {
                    CNC.A06("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayListA0h.add(new C6356E2i(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayListA0h.isEmpty()) {
            return null;
        }
        return new C5402Dhv(arrayListA0h);
    }

    public static boolean A02(E1P e1p, int i, boolean z) throws ParserException {
        String string;
        StringBuilder sbA0x;
        int iA04 = e1p.A04();
        if (iA04 < 7) {
            if (!z) {
                sbA0x = C60O.A0y("too short header: ", iA04);
                string = sbA0x.toString();
            }
            return false;
        }
        if (e1p.A0A() != i) {
            if (!z) {
                sbA0x = C60O.A0x("expected header type ");
                BV4.A1N(sbA0x, i);
                string = sbA0x.toString();
            }
        } else {
            if (e1p.A0A() == 118 && e1p.A0A() == 111 && e1p.A0A() == 114 && e1p.A0A() == 98 && e1p.A0A() == 105 && e1p.A0A() == 115) {
                return true;
            }
            if (!z) {
                string = "expected characters 'vorbis'";
            }
        }
        return false;
        throw BV6.A0V(string, null);
    }
}
