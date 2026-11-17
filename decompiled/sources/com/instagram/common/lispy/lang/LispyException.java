package com.instagram.common.lispy.lang;

import java.util.List;

/* loaded from: classes6.dex */
public final class LispyException extends BloksLispyException {
    public final String category;
    public final List<String> lispyStackTrace;

    public LispyException(String str, Throwable th, List<String> list) {
        super(th.getMessage(), th);
        this.category = str;
        this.lispyStackTrace = list;
    }
}
