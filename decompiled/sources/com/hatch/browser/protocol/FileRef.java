package com.hatch.browser.protocol;

import X.AbstractC7611F5y;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C3cI;
import X.C3cJ;
import X.C60R;
import X.C7384Etj;
import X.HwO;

/* loaded from: classes6.dex */
public final class FileRef {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public long bytes;
    public String mimeType;
    public String name;
    public String path;
    public String sha256;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FileRef) {
                FileRef fileRef = (FileRef) obj;
                if (!C7384Etj.areEqual(this.path, fileRef.path) || !C7384Etj.areEqual(this.name, fileRef.name) || !C7384Etj.areEqual(this.mimeType, fileRef.mimeType) || this.bytes != fileRef.bytes || !C7384Etj.areEqual(this.sha256, fileRef.sha256)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setName(String str) {
        C7384Etj.A0Y(str, 0);
        this.name = str;
    }

    public final void setPath(String str) {
        C7384Etj.A0Y(str, 0);
        this.path = str;
    }

    public final void setSha256(String str) {
        C7384Etj.A0Y(str, 0);
        this.sha256 = str;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* renamed from: copy-xiodHJ4$default, reason: not valid java name */
    public static /* synthetic */ FileRef m3595copyxiodHJ4$default(FileRef fileRef, String str, String str2, String str3, long j, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fileRef.path;
        }
        if ((i & 2) != 0) {
            str2 = fileRef.name;
        }
        if ((i & 4) != 0) {
            str3 = fileRef.mimeType;
        }
        if ((i & 8) != 0) {
            j = fileRef.bytes;
        }
        if ((i & 16) != 0) {
            str4 = fileRef.sha256;
        }
        return fileRef.m3597copyxiodHJ4(str, str2, str3, j, str4);
    }

    public final String component1() {
        return this.path;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.mimeType;
    }

    /* renamed from: component4-s-VKNKU, reason: not valid java name */
    public final long m3596component4sVKNKU() {
        return this.bytes;
    }

    public final String component5() {
        return this.sha256;
    }

    /* renamed from: getBytes-s-VKNKU, reason: not valid java name */
    public final long m3598getBytessVKNKU() {
        return this.bytes;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getSha256() {
        return this.sha256;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.sha256, C60R.A00(this.bytes, (AnonymousClass005.A0I(this.name, AnonymousClass001.A0G(this.path)) + AnonymousClass006.A0G(this.mimeType)) * 31));
    }

    /* renamed from: setBytes-VKZWuLQ, reason: not valid java name */
    public final void m3599setBytesVKZWuLQ(long j) {
        this.bytes = j;
    }

    public final void setMimeType(String str) {
        this.mimeType = str;
    }

    public String toString() {
        String str = this.path;
        String str2 = this.name;
        String str3 = this.mimeType;
        String strA00 = HwO.A00(this.bytes);
        String str4 = this.sha256;
        StringBuilder sbA0x = C3cI.A0x("FileRef(path=", str);
        AbstractC7611F5y.A0y(sbA0x, str2, str3, strA00);
        return C3cJ.A0N(", sha256=", str4, sbA0x);
    }

    public FileRef(String str, String str2, String str3, long j, String str4) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(str4, 4);
        this.path = str;
        this.name = str2;
        this.mimeType = str3;
        this.bytes = j;
        this.sha256 = str4;
    }

    /* renamed from: copy-xiodHJ4, reason: not valid java name */
    public final FileRef m3597copyxiodHJ4(String str, String str2, String str3, long j, String str4) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(str4, 4);
        return new FileRef(str, str2, str3, j, str4);
    }

    public /* synthetic */ FileRef(String str, String str2, String str3, long j, String str4, C06H c06h) {
        this(str, str2, str3, j, str4);
    }
}
