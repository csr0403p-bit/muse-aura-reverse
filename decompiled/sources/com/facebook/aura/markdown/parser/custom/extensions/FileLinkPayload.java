package com.facebook.aura.markdown.parser.custom.extensions;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class FileLinkPayload {
    public final String displayName;
    public final FileLinkKind kind;
    public final String url;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FileLinkPayload) {
                FileLinkPayload fileLinkPayload = (FileLinkPayload) obj;
                if (this.kind != fileLinkPayload.kind || !C7384Etj.areEqual(this.url, fileLinkPayload.url) || !C7384Etj.areEqual(this.displayName, fileLinkPayload.displayName)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FileLinkPayload copy$default(FileLinkPayload fileLinkPayload, FileLinkKind fileLinkKind, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            fileLinkKind = fileLinkPayload.kind;
        }
        if ((i & 2) != 0) {
            str = fileLinkPayload.url;
        }
        if ((i & 4) != 0) {
            str2 = fileLinkPayload.displayName;
        }
        return fileLinkPayload.copy(fileLinkKind, str, str2);
    }

    public final FileLinkKind component1() {
        return this.kind;
    }

    public final String component2() {
        return this.url;
    }

    public final String component3() {
        return this.displayName;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final FileLinkKind getKind() {
        return this.kind;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.displayName, AnonymousClass005.A0I(this.url, AnonymousClass005.A0E(this.kind)));
    }

    public String toString() {
        FileLinkKind fileLinkKind = this.kind;
        String str = this.url;
        String str2 = this.displayName;
        StringBuilder sbA0f = C3cG.A0f(fileLinkKind, "FileLinkPayload(kind=");
        sbA0f.append(", url=");
        sbA0f.append(str);
        return C3cJ.A0N(", displayName=", str2, sbA0f);
    }

    public FileLinkPayload(FileLinkKind fileLinkKind, String str, String str2) {
        AnonymousClass005.A0x(fileLinkKind, str, str2);
        this.kind = fileLinkKind;
        this.url = str;
        this.displayName = str2;
    }

    public final FileLinkPayload copy(FileLinkKind fileLinkKind, String str, String str2) {
        AnonymousClass005.A0x(fileLinkKind, str, str2);
        return new FileLinkPayload(fileLinkKind, str, str2);
    }
}
