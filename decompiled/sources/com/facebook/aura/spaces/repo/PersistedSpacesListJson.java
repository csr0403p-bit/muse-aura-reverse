package com.facebook.aura.spaces.repo;

import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C60R;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class PersistedSpacesListJson extends C06G {
    public static final int SCHEMA_VERSION = 2;
    public final List<PersistedSpaceCardJson> cards;
    public final long saved_at_ms;
    public final int version;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1V(C79.A01, null, null, PersistedSpacesListJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<PersistedSpacesListJson> serializer() {
            return PersistedSpacesListJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public PersistedSpacesListJson(int i, long j, List<PersistedSpaceCardJson> list) {
        C7384Etj.A0Y(list, 2);
        this.version = i;
        this.saved_at_ms = j;
        this.cards = list;
    }

    public final PersistedSpacesListJson copy(int i, long j, List<PersistedSpaceCardJson> list) {
        C7384Etj.A0Y(list, 2);
        return new PersistedSpacesListJson(i, j, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PersistedSpacesListJson) {
                PersistedSpacesListJson persistedSpacesListJson = (PersistedSpacesListJson) obj;
                if (this.version != persistedSpacesListJson.version || this.saved_at_ms != persistedSpacesListJson.saved_at_ms || !C7384Etj.areEqual(this.cards, persistedSpacesListJson.cards)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PersistedSpacesListJson copy$default(PersistedSpacesListJson persistedSpacesListJson, int i, long j, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = persistedSpacesListJson.version;
        }
        if ((i2 & 2) != 0) {
            j = persistedSpacesListJson.saved_at_ms;
        }
        if ((i2 & 4) != 0) {
            list = persistedSpacesListJson.cards;
        }
        return persistedSpacesListJson.copy(i, j, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_spaces_repo_repo(PersistedSpacesListJson persistedSpacesListJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || persistedSpacesListJson.version != 2) {
            c9j5.AAK(c9iZ, 0, persistedSpacesListJson.version);
        }
        if (zAfR || persistedSpacesListJson.saved_at_ms != 0) {
            c9j5.AAN(c9iZ, 1, persistedSpacesListJson.saved_at_ms);
        }
        if (zAfR || !C3cG.A1L(persistedSpacesListJson.cards)) {
            c9j5.AAQ(persistedSpacesListJson.cards, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
    }

    public final int component1() {
        return this.version;
    }

    public final long component2() {
        return this.saved_at_ms;
    }

    public final List<PersistedSpaceCardJson> component3() {
        return this.cards;
    }

    public final List<PersistedSpaceCardJson> getCards() {
        return this.cards;
    }

    public final long getSaved_at_ms() {
        return this.saved_at_ms;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.cards, C60R.A00(this.saved_at_ms, this.version * 31));
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PersistedSpacesListJson(int i, int i2, long j, List list, C2hx c2hx) {
        this.version = (i & 1) == 0 ? 2 : i2;
        if ((i & 2) == 0) {
            this.saved_at_ms = 0L;
        } else {
            this.saved_at_ms = j;
        }
        if ((i & 4) == 0) {
            this.cards = C0881AGi.A00;
        } else {
            this.cards = list;
        }
    }

    public /* synthetic */ PersistedSpacesListJson(int i, long j, List list, int i2, C06H c06h) {
        this((i2 & 1) != 0 ? 2 : i, (i2 & 2) != 0 ? 0L : j, C3cI.A12(list, i2));
    }

    public PersistedSpacesListJson() {
        this(2, 0L, C0881AGi.A00);
    }
}
