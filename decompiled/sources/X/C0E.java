package X;

import android.util.Log;
import androidx.media3.common.util.Util;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public abstract class C0E {
    public static Pattern A00 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$");
    public static final Pattern A01 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$");

    public static C0J A01(File file, String str, long j, long j2, long j3) {
        long length = j3;
        if (j3 <= 0) {
            length = file.length();
        }
        return new C0J(file, str, j, length, j2, true);
    }

    public static C0J A00(File file, long j, long j2, boolean z, boolean z2) {
        int iLastIndexOf;
        int iLastIndexOf2;
        long j3 = j2;
        long length = j;
        String name = file.getName();
        if (!z2) {
            Matcher matcher = A01.matcher(name);
            if (!matcher.matches()) {
                return null;
            }
            String strGroup = matcher.group(1);
            if (!z) {
                strGroup = Util.A0J(strGroup);
            }
            if (strGroup != null) {
                return A01(file, strGroup, BV5.A09(matcher, 2), BV5.A09(matcher, 3), length);
            }
            return null;
        }
        int iLastIndexOf3 = name.lastIndexOf(46);
        if (iLastIndexOf3 == -1 || (iLastIndexOf = name.lastIndexOf(46, iLastIndexOf3 - 1)) == -1 || (iLastIndexOf2 = name.lastIndexOf(46, iLastIndexOf - 1)) == -1) {
            return null;
        }
        String strSubstring = name.substring(iLastIndexOf2 + 1, iLastIndexOf);
        int iLastIndexOf4 = name.lastIndexOf(46, iLastIndexOf2 - 1);
        if (iLastIndexOf4 == -1) {
            return null;
        }
        String strSubstring2 = name.substring(iLastIndexOf4 + 1, iLastIndexOf2);
        String strA0j = BV4.A0j(name, iLastIndexOf4);
        if (j == -1) {
            length = file.length();
        }
        if (length == 0) {
            return null;
        }
        if (j2 == -9223372036854775807L) {
            try {
                j3 = Long.parseLong(strSubstring);
            } catch (NumberFormatException e) {
                Log.e("CacheSpan", FGI.A0M("invalid filename: ", name), e);
                return null;
            }
        }
        return A01(file, strA0j, Long.parseLong(strSubstring2), j3, length);
    }

    public static C0J A02(String str, long j) {
        return new C0J(null, str, j, -1L, -1L, false);
    }
}
