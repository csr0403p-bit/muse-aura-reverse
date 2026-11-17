package X;

import com.facebook.aura.pairs.PairsDiscretionDocument;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.webrtc.voiceengine.WebRtcAudioUtils;

/* loaded from: classes5.dex */
public final class C6Q {
    public static PrintWriter A00;
    public static StringWriter A01;

    static {
        StringWriter stringWriter = new StringWriter(WebRtcAudioUtils.DEFAULT_SAMPLE_RATE_HZ);
        A01 = stringWriter;
        A00 = new PrintWriter(stringWriter);
    }

    public static String A01(Throwable th) throws IOException {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.close();
        return stringWriter.toString();
    }

    public static String A00(String str, int i) {
        int i2;
        int iLastIndexOf;
        int iIndexOf;
        int length = str.length();
        return (length <= i || (iLastIndexOf = str.lastIndexOf(PairsDiscretionDocument.TERMINATOR, (i2 = (i * 3) / 4))) < 0 || (iIndexOf = str.indexOf(PairsDiscretionDocument.TERMINATOR, length - (i - i2))) < 0) ? str : FGI.A0U(BV4.A0j(str, iLastIndexOf + 1), "\t--------- TRIMMED FOR OVERFLOW ---------", str.substring(iIndexOf));
    }
}
