package com.facebook.aura.ageverification;

import X.C7384Etj;

/* loaded from: classes3.dex */
public abstract class AgeVerificationClientKt {
    public static final String ATTEMPT_ALREADY_SUBMITTED = "attempt_already_submitted";
    public static final String ATTEMPT_IN_PROGRESS = "attempt_in_progress";
    public static final String EVIDENCE_REJECTED = "evidence_rejected";
    public static final int HTTP_NONE = -1;
    public static final int HTTP_OK = 200;
    public static final int HTTP_SERVER_ERROR = 500;
    public static final String INVALID_ATTEMPT = "invalid_attempt";
    public static final String INVALID_FILE = "invalid_file";
    public static final String INVALID_FILE_HANDLE = "invalid_file_handle";
    public static final String INVALID_RESPONSE = "invalid_response";
    public static final String METHOD_NOT_ALLOWED = "method_not_allowed";
    public static final String MISSING_CAPTURE = "missing_capture";
    public static final String NOT_ELIGIBLE = "not_eligible";
    public static final String NOT_SUPPORTED = "not_supported";
    public static final String RATE_LIMITED = "rate_limited";
    public static final String RETRIES_EXHAUSTED = "retries_exhausted";
    public static final String SUBMIT_FAILED = "submit_failed";
    public static final String TAG = "AgeVerificationClient";
    public static final String UNKNOWN_UPLOAD_KIND = "unknown_upload_kind";
    public static final String UPLOAD_FAILED = "upload_failed";

    public static final String getProblemType(Throwable th) {
        AgeVerificationException ageVerificationException;
        C7384Etj.A0Y(th, 0);
        if (!(th instanceof AgeVerificationException) || (ageVerificationException = (AgeVerificationException) th) == null) {
            return null;
        }
        return ageVerificationException.problemType;
    }
}
