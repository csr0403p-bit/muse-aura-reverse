package com.facebook.soloader;

import X.C35;
import X.C60O;
import X.FGI;
import android.util.Log;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public class SoLoaderULErrorFactory {
    public static boolean corruptedLibName(String str) {
        Matcher matcher = Pattern.compile("\\P{ASCII}+").matcher(str);
        if (!matcher.find()) {
            return false;
        }
        Log.w("SoLoader", FGI.A0M("Library name is corrupted, contains non-ASCII characters ", matcher.group()));
        return true;
    }

    public static SoLoaderULError create(String str, UnsatisfiedLinkError unsatisfiedLinkError) {
        SoLoaderULError soLoaderULError;
        String strA0r = C60O.A0r(" (soName: ", str);
        if (unsatisfiedLinkError.getMessage() != null && unsatisfiedLinkError.getMessage().contains("ELF")) {
            C35.A00("Corrupted lib file detected");
            soLoaderULError = new SoLoaderCorruptedLibFileError(str, FGI.A0M(unsatisfiedLinkError.toString(), strA0r));
        } else if (corruptedLibName(str)) {
            C35.A00("Corrupted lib name detected");
            soLoaderULError = new SoLoaderCorruptedLibNameError(str, FGI.A0U("corrupted lib name: ", unsatisfiedLinkError.toString(), strA0r));
        } else {
            soLoaderULError = new SoLoaderULError(str, FGI.A0M(unsatisfiedLinkError.toString(), strA0r));
        }
        soLoaderULError.initCause(unsatisfiedLinkError);
        return soLoaderULError;
    }
}
