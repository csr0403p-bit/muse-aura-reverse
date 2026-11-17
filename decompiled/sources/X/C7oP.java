package X;

import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: X.7oP, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7oP {
    public final Pattern A00;
    public final boolean A01;

    public static C7oP A00(Object obj) {
        Pattern patternCompile = Pattern.compile("");
        boolean z = false;
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject.has("pattern")) {
                patternCompile = Pattern.compile(jSONObject.getString("pattern"), 32);
                if (jSONObject.has("negation") && jSONObject.getString("negation").equalsIgnoreCase("true")) {
                    z = true;
                }
            }
        } else if (obj instanceof String) {
            patternCompile = Pattern.compile((String) obj, 32);
        }
        return new C7oP(patternCompile, z);
    }

    public static boolean A01(C7oP c7oP, CharSequence charSequence) {
        return c7oP.A00.matcher(charSequence).matches() ^ c7oP.A01;
    }

    public C7oP(Pattern pattern, boolean z) {
        this.A00 = pattern;
        this.A01 = z;
    }

    public C7oP() {
        this(Pattern.compile(""), false);
    }
}
