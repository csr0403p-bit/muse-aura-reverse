package com.facebook.aura.localbrowser;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class LocalBrowserBlocklistStateJson {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final long checked_at;
    public final LocalBrowserBlocklistFileJson current;
    public final LocalBrowserBlocklistFileJson previous;

    public final class Companion {
        public final C9hr<LocalBrowserBlocklistStateJson> serializer() {
            return LocalBrowserBlocklistStateJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public LocalBrowserBlocklistStateJson(LocalBrowserBlocklistFileJson localBrowserBlocklistFileJson, LocalBrowserBlocklistFileJson localBrowserBlocklistFileJson2, long j) {
        C7384Etj.A0Y(localBrowserBlocklistFileJson, 0);
        this.current = localBrowserBlocklistFileJson;
        this.previous = localBrowserBlocklistFileJson2;
        this.checked_at = j;
    }

    public final LocalBrowserBlocklistStateJson copy(LocalBrowserBlocklistFileJson localBrowserBlocklistFileJson, LocalBrowserBlocklistFileJson localBrowserBlocklistFileJson2, long j) {
        C7384Etj.A0Y(localBrowserBlocklistFileJson, 0);
        return new LocalBrowserBlocklistStateJson(localBrowserBlocklistFileJson, localBrowserBlocklistFileJson2, j);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LocalBrowserBlocklistStateJson) {
                LocalBrowserBlocklistStateJson localBrowserBlocklistStateJson = (LocalBrowserBlocklistStateJson) obj;
                if (!C7384Etj.areEqual(this.current, localBrowserBlocklistStateJson.current) || !C7384Etj.areEqual(this.previous, localBrowserBlocklistStateJson.previous) || this.checked_at != localBrowserBlocklistStateJson.checked_at) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LocalBrowserBlocklistStateJson copy$default(LocalBrowserBlocklistStateJson localBrowserBlocklistStateJson, LocalBrowserBlocklistFileJson localBrowserBlocklistFileJson, LocalBrowserBlocklistFileJson localBrowserBlocklistFileJson2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            localBrowserBlocklistFileJson = localBrowserBlocklistStateJson.current;
        }
        if ((i & 2) != 0) {
            localBrowserBlocklistFileJson2 = localBrowserBlocklistStateJson.previous;
        }
        if ((i & 4) != 0) {
            j = localBrowserBlocklistStateJson.checked_at;
        }
        return localBrowserBlocklistStateJson.copy(localBrowserBlocklistFileJson, localBrowserBlocklistFileJson2, j);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser(LocalBrowserBlocklistStateJson localBrowserBlocklistStateJson, C9j5 c9j5, C9iZ c9iZ) {
        LocalBrowserBlocklistFileJson$$serializer localBrowserBlocklistFileJson$$serializer = LocalBrowserBlocklistFileJson$$serializer.INSTANCE;
        c9j5.AAQ(localBrowserBlocklistStateJson.current, localBrowserBlocklistFileJson$$serializer, c9iZ, 0);
        if (c9j5.AfR() || localBrowserBlocklistStateJson.previous != null) {
            c9j5.AAP(localBrowserBlocklistStateJson.previous, localBrowserBlocklistFileJson$$serializer, c9iZ, 1);
        }
        c9j5.AAN(c9iZ, 2, localBrowserBlocklistStateJson.checked_at);
    }

    public final LocalBrowserBlocklistFileJson component1() {
        return this.current;
    }

    public final LocalBrowserBlocklistFileJson component2() {
        return this.previous;
    }

    public final long component3() {
        return this.checked_at;
    }

    public final long getChecked_at() {
        return this.checked_at;
    }

    public final LocalBrowserBlocklistFileJson getCurrent() {
        return this.current;
    }

    public final LocalBrowserBlocklistFileJson getPrevious() {
        return this.previous;
    }

    public int hashCode() {
        return AnonymousClass006.A05(this.checked_at, (AnonymousClass005.A0E(this.current) + AnonymousClass006.A0D(this.previous)) * 31);
    }

    public String toString() {
        LocalBrowserBlocklistFileJson localBrowserBlocklistFileJson = this.current;
        LocalBrowserBlocklistFileJson localBrowserBlocklistFileJson2 = this.previous;
        long j = this.checked_at;
        StringBuilder sbA0f = C3cG.A0f(localBrowserBlocklistFileJson, "LocalBrowserBlocklistStateJson(current=");
        sbA0f.append(", previous=");
        sbA0f.append(localBrowserBlocklistFileJson2);
        sbA0f.append(", checked_at=");
        sbA0f.append(j);
        return AnonymousClass001.A0v(")", sbA0f);
    }

    public /* synthetic */ LocalBrowserBlocklistStateJson(int i, LocalBrowserBlocklistFileJson localBrowserBlocklistFileJson, LocalBrowserBlocklistFileJson localBrowserBlocklistFileJson2, long j, C2hx c2hx) {
        if (5 != (i & 5)) {
            C9iI.A00(LocalBrowserBlocklistStateJson$$serializer.descriptor, i, 5);
            throw F60.createAndThrow();
        }
        this.current = localBrowserBlocklistFileJson;
        if ((i & 2) == 0) {
            this.previous = null;
        } else {
            this.previous = localBrowserBlocklistFileJson2;
        }
        this.checked_at = j;
    }

    public /* synthetic */ LocalBrowserBlocklistStateJson(LocalBrowserBlocklistFileJson localBrowserBlocklistFileJson, LocalBrowserBlocklistFileJson localBrowserBlocklistFileJson2, long j, int i, C06H c06h) {
        this(localBrowserBlocklistFileJson, (i & 2) != 0 ? null : localBrowserBlocklistFileJson2, j);
    }
}
