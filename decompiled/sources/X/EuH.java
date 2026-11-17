package X;

import android.net.Uri;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public class EuH {
    public static final Pattern A02;
    public String A00;
    public final Uri A01;

    static {
        Pattern patternCompile = Pattern.compile("^(.*\\/)(live-dash.*)");
        C7384Etj.A0U(patternCompile);
        A02 = patternCompile;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof EuH)) {
            return false;
        }
        String str = this.A00;
        return str != null ? str.equals(((EuH) obj).A00) : this.A01.equals(((EuH) obj).A01);
    }

    public final int hashCode() {
        String str = this.A00;
        return str != null ? str.hashCode() : this.A01.hashCode();
    }

    public String toString() {
        return C60O.A0o(this.A01);
    }

    public EuH(Uri uri) {
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.clearQuery();
        Uri uriBuild = builderBuildUpon.build();
        C7384Etj.A0U(uriBuild);
        this.A01 = uriBuild;
        String path = uriBuild.getPath();
        if (path != null) {
            Matcher matcher = A02.matcher(path);
            if (matcher.find() && matcher.groupCount() == 2) {
                this.A00 = matcher.group(2);
            }
        }
    }
}
