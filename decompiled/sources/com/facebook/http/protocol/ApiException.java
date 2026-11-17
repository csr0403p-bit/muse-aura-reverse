package com.facebook.http.protocol;

import java.io.IOException;
import java.util.Map;

/* loaded from: classes5.dex */
public class ApiException extends IOException {
    public static final long serialVersionUID = 1;
    public transient Map<String, String> A00;
    public String batchOperationName;
    public ApiErrorResult result;
    public int statusCode;
}
