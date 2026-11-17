package com.facebook.rendercore;

/* loaded from: classes6.dex */
public final class DuplicateRenderUnitException extends IllegalStateException {
    public final long id;

    public DuplicateRenderUnitException(long j, String str) {
        super(str);
        this.id = j;
    }
}
