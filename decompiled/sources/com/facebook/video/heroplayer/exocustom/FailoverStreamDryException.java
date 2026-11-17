package com.facebook.video.heroplayer.exocustom;

import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import java.io.IOException;

/* loaded from: classes5.dex */
public abstract class FailoverStreamDryException extends IOException {
    public static boolean A00(IOException iOException) {
        if (iOException instanceof HttpDataSource$InvalidResponseCodeException) {
            String str = ((HttpDataSource$InvalidResponseCodeException) iOException).responseMessage;
            if (str != null && str.contains("FailoverStreamDryException")) {
                return true;
            }
        } else if (iOException.getCause() != null) {
            iOException.getCause();
        }
        return false;
    }
}
