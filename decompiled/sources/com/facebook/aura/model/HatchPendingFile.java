package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes5.dex */
public final class HatchPendingFile extends C06G {
    public static final int $stable = 0;
    public final String mimeType;
    public final String uri;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchPendingFile) {
                HatchPendingFile hatchPendingFile = (HatchPendingFile) obj;
                if (!C7384Etj.areEqual(this.uri, hatchPendingFile.uri) || !C7384Etj.areEqual(this.mimeType, hatchPendingFile.mimeType)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchPendingFile copy$default(HatchPendingFile hatchPendingFile, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchPendingFile.uri;
        }
        if ((i & 2) != 0) {
            str2 = hatchPendingFile.mimeType;
        }
        AnonymousClass003.A0u(str, str2);
        return new HatchPendingFile(str, str2);
    }

    public final String component1() {
        return this.uri;
    }

    public final String component2() {
        return this.mimeType;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.mimeType, AnonymousClass001.A0G(this.uri));
    }

    public HatchPendingFile(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.uri = str;
        this.mimeType = str2;
    }

    public final HatchPendingFile copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new HatchPendingFile(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchPendingFile(String str, String str2, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? "application/octet-stream" : str2);
    }
}
