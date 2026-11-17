package com.facebook.privacy.e2ee.genericimpl.backup.common;

import X.HD2;

/* loaded from: classes6.dex */
public final class BackupException extends Exception {
    public final HD2 exceptionType;
    public final Throwable failureReason;

    public BackupException(HD2 hd2, Throwable th) {
        this.exceptionType = hd2;
        this.failureReason = th;
    }
}
