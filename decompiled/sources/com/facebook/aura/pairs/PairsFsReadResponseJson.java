package com.facebook.aura.pairs;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class PairsFsReadResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final boolean eof;
    public final String text;

    public final class Companion {
        public final C9hr<PairsFsReadResponseJson> serializer() {
            return PairsFsReadResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(PairsFsReadResponseJson pairsFsReadResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || pairsFsReadResponseJson.eof) {
            c9j5.AA7(c9iZ, 0, pairsFsReadResponseJson.eof);
        }
        if (zAfR || pairsFsReadResponseJson.text != null) {
            c9j5.AAP(pairsFsReadResponseJson.text, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PairsFsReadResponseJson) {
                PairsFsReadResponseJson pairsFsReadResponseJson = (PairsFsReadResponseJson) obj;
                if (this.eof != pairsFsReadResponseJson.eof || !C7384Etj.areEqual(this.text, pairsFsReadResponseJson.text)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PairsFsReadResponseJson copy$default(PairsFsReadResponseJson pairsFsReadResponseJson, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = pairsFsReadResponseJson.eof;
        }
        if ((i & 2) != 0) {
            str = pairsFsReadResponseJson.text;
        }
        return new PairsFsReadResponseJson(z, str);
    }

    public final boolean component1() {
        return this.eof;
    }

    public final String component2() {
        return this.text;
    }

    public final PairsFsReadResponseJson copy(boolean z, String str) {
        return new PairsFsReadResponseJson(z, str);
    }

    public final boolean getEof() {
        return this.eof;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return C0KA.A02(this.eof) + AnonymousClass006.A0G(this.text);
    }

    public PairsFsReadResponseJson(boolean z, String str) {
        this.eof = z;
        this.text = str;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PairsFsReadResponseJson(int i, boolean z, String str, C2hx c2hx) {
        this.eof = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.text = null;
        } else {
            this.text = str;
        }
    }

    public /* synthetic */ PairsFsReadResponseJson(boolean z, String str, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), AnonymousClass006.A0s(i, str));
    }

    public PairsFsReadResponseJson() {
        this(false, null);
    }
}
