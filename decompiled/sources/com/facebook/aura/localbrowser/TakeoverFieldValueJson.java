package com.facebook.aura.localbrowser;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import X.FGI;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class TakeoverFieldValueJson {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String kind;
    public final String text;

    public final class Companion {
        public final C9hr<TakeoverFieldValueJson> serializer() {
            return TakeoverFieldValueJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public TakeoverFieldValueJson(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.kind = str;
        this.text = str2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser(TakeoverFieldValueJson takeoverFieldValueJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(takeoverFieldValueJson.kind, c9iZ, 0);
        if (c9j5.AfR() || takeoverFieldValueJson.text != null) {
            c9j5.AAP(takeoverFieldValueJson.text, C07779iq.A01, c9iZ, 1);
        }
    }

    public final TakeoverFieldValueJson copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new TakeoverFieldValueJson(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TakeoverFieldValueJson) {
                TakeoverFieldValueJson takeoverFieldValueJson = (TakeoverFieldValueJson) obj;
                if (!C7384Etj.areEqual(this.kind, takeoverFieldValueJson.kind) || !C7384Etj.areEqual(this.text, takeoverFieldValueJson.text)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ TakeoverFieldValueJson copy$default(TakeoverFieldValueJson takeoverFieldValueJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = takeoverFieldValueJson.kind;
        }
        if ((i & 2) != 0) {
            str2 = takeoverFieldValueJson.text;
        }
        C7384Etj.A0Y(str, 0);
        return new TakeoverFieldValueJson(str, str2);
    }

    public final String component1() {
        return this.kind;
    }

    public final String component2() {
        return this.text;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.kind) + AnonymousClass006.A0G(this.text);
    }

    public String toString() {
        return FGI.A0h("TakeoverFieldValueJson(kind=", this.kind, ", text=", this.text, ")");
    }

    public /* synthetic */ TakeoverFieldValueJson(int i, String str, String str2, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(TakeoverFieldValueJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.kind = str;
        if ((i & 2) == 0) {
            this.text = null;
        } else {
            this.text = str2;
        }
    }

    public /* synthetic */ TakeoverFieldValueJson(String str, String str2, int i, C06H c06h) {
        this(str, AnonymousClass006.A0s(i, str2));
    }
}
