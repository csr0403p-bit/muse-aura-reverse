package com.facebook.aura.sharesheet;

import X.AnonymousClass003;

/* loaded from: classes4.dex */
public final class CodeElement implements ShareElement {
    public final String code;
    public final String language;

    public final String getCode() {
        return this.code;
    }

    public final String getLanguage() {
        return this.language;
    }

    public CodeElement(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.language = str;
        this.code = str2;
    }
}
