package com.facebook.aura.composer.upload;

import X.C7384Etj;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class AttachmentUploadException extends IOException {
    public final String errorClass;
    public final Integer httpStatus;
    public final String serverErrorCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttachmentUploadException(String str, String str2, Integer num, String str3) {
        super(str);
        C7384Etj.A0Y(str, 0);
        this.errorClass = str2;
        this.httpStatus = num;
        this.serverErrorCode = str3;
    }

    public final String getErrorClass() {
        return this.errorClass;
    }

    public final Integer getHttpStatus() {
        return this.httpStatus;
    }

    public final String getServerErrorCode() {
        return this.serverErrorCode;
    }
}
