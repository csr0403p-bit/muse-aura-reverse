package X;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.ParserException;
import com.google.common.base.Charsets;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.Byp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3124Byp implements InterfaceC3126Byr<Long> {
    public static final Pattern A00 = Pattern.compile("(.+?)(Z|((\\+|-|\u2212)(\\d\\d)(:?(\\d\\d))?))");

    @Override // X.InterfaceC3126Byr
    public final /* bridge */ /* synthetic */ Long AXb(Uri uri, InputStream inputStream) throws IOException {
        String line = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8)).readLine();
        try {
            Matcher matcher = A00.matcher(line);
            if (!matcher.matches()) {
                throw new ParserException(FGI.A0M("Couldn't parse timestamp: ", line), null, 4, true);
            }
            long time = C60R.A0k("yyyy-MM-dd'T'HH:mm:ss").parse(matcher.group(1)).getTime();
            if (!"Z".equals(matcher.group(2))) {
                long j = "+".equals(matcher.group(4)) ? 1L : -1L;
                long jA09 = BV5.A09(matcher, 5);
                String strGroup = matcher.group(7);
                time -= j * (((jA09 * 60) + (TextUtils.isEmpty(strGroup) ? 0L : Long.parseLong(strGroup))) * 60000);
            }
            return Long.valueOf(time);
        } catch (ParseException e) {
            throw new ParserException(null, e, 4, true);
        }
    }
}
