package com.facebook.aura.modellock;

import X.AnonymousClass005;

/* loaded from: classes5.dex */
public final class ModelLockAppealFile {
    public final byte[] bytes;
    public final String fileName;
    public final ModelLockOwner owner;
    public final String sha256;

    public final byte[] getBytes() {
        return this.bytes;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final ModelLockOwner getOwner() {
        return this.owner;
    }

    public final String getSha256() {
        return this.sha256;
    }

    public ModelLockAppealFile(ModelLockOwner modelLockOwner, String str, byte[] bArr, String str2) {
        AnonymousClass005.A14(modelLockOwner, str, bArr, str2);
        this.owner = modelLockOwner;
        this.fileName = str;
        this.bytes = bArr;
        this.sha256 = str2;
    }
}
