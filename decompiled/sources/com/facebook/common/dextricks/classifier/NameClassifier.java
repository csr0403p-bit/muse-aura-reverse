package com.facebook.common.dextricks.classifier;

import X.FGI;
import android.util.Log;
import com.facebook.common.dextricks.StringTreeSet;

/* loaded from: classes5.dex */
public final class NameClassifier {
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0127: INVOKE (r1 I:java.lang.String) = (r0v0 ?? I:java.lang.String), (r4 I:java.lang.String) STATIC call: X.FGI.A0M(java.lang.String, java.lang.String):java.lang.String A[MD:(java.lang.String, java.lang.String):java.lang.String (m)] (LINE:295), block:B:99:0x0125 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0079 A[Catch: IndexOutOfBoundsException -> 0x0124, TryCatch #0 {IndexOutOfBoundsException -> 0x0124, blocks: (B:3:0x0001, B:5:0x000d, B:68:0x00c7, B:70:0x00cd, B:72:0x00d3, B:74:0x00db, B:76:0x00e3, B:78:0x00ec, B:80:0x00f2, B:83:0x00f9, B:55:0x00a9, B:86:0x0101, B:90:0x010c, B:92:0x0114, B:94:0x011c, B:62:0x00b8, B:10:0x002d, B:12:0x0033, B:14:0x0039, B:16:0x0041, B:21:0x004c, B:23:0x0052, B:25:0x0058, B:27:0x0060, B:29:0x0066, B:31:0x006e, B:36:0x0079, B:38:0x007f, B:40:0x0085), top: B:101:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A00(java.lang.String r16) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.classifier.NameClassifier.A00(java.lang.String):boolean");
    }

    public static boolean A01(String str, String str2) {
        if (str != null) {
            try {
                if (StringTreeSet.search(str2, str)) {
                    return true;
                }
            } catch (IndexOutOfBoundsException e) {
                Log.e("NameClassifier", FGI.A0M("StringTreeSet search out of bounds for class: ", str2), e);
            }
        }
        return str2.length() == 38 && str2.charAt(3) == '.' && str2.charAt(13) == 'r' && str2.charAt(19) == 'L' && str2.charAt(23) == 'T' && str2.charAt(27) == 'P';
    }
}
