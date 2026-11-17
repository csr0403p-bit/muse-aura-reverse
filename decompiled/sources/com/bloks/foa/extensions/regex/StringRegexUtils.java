package com.bloks.foa.extensions.regex;

import X.ETi;

/* loaded from: classes6.dex */
public final class StringRegexUtils {
    public static final StringRegexUtils INSTANCE = new StringRegexUtils();

    public static final native boolean matchesRegex(String str, String str2);

    static {
        ETi.loadLibrary("stringregex-jni");
    }
}
