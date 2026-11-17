package com.facebook.rendercore;

import X.C7384Etj;
import X.FGT;

/* loaded from: classes6.dex */
public final class RenderUnitUpdateException extends RuntimeException {
    public final String renderUnitDebugKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RenderUnitUpdateException(FGT<?> fgt, String str, Throwable th) {
        super(str, th);
        C7384Etj.A0Y(str, 1);
        this.renderUnitDebugKey = String.valueOf(fgt.A0J());
    }
}
