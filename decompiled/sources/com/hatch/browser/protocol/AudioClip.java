package com.hatch.browser.protocol;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06H;
import X.C7384Etj;
import X.FGI;

/* loaded from: classes6.dex */
public final class AudioClip {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public String base64;
    public String mimeType;

    public AudioClip(String str, String str2) {
        C7384Etj.A0Y(str2, 1);
        this.mimeType = str;
        this.base64 = str2;
    }

    public final AudioClip copy(String str, String str2) {
        C7384Etj.A0Y(str2, 1);
        return new AudioClip(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AudioClip) {
                AudioClip audioClip = (AudioClip) obj;
                if (!C7384Etj.areEqual(this.mimeType, audioClip.mimeType) || !C7384Etj.areEqual(this.base64, audioClip.base64)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setBase64(String str) {
        C7384Etj.A0Y(str, 0);
        this.base64 = str;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public static /* synthetic */ AudioClip copy$default(AudioClip audioClip, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = audioClip.mimeType;
        }
        if ((i & 2) != 0) {
            str2 = audioClip.base64;
        }
        C7384Etj.A0Y(str2, 1);
        return new AudioClip(str, str2);
    }

    public final String component1() {
        return this.mimeType;
    }

    public final String component2() {
        return this.base64;
    }

    public final String getBase64() {
        return this.base64;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.base64, AnonymousClass006.A0G(this.mimeType) * 31);
    }

    public final void setMimeType(String str) {
        this.mimeType = str;
    }

    public String toString() {
        return FGI.A0c("AudioClip(mimeType=", this.mimeType, ", base64=", this.base64);
    }
}
