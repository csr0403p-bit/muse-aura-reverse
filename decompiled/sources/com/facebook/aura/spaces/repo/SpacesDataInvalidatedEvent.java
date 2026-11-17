package com.facebook.aura.spaces.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import java.util.List;
import kotlinx.serialization.json.JsonArray;

/* loaded from: classes3.dex */
public final class SpacesDataInvalidatedEvent extends C06G {
    public final String originActionCallId;
    public final List<JsonArray> queryKeys;
    public final String slug;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SpacesDataInvalidatedEvent) {
                SpacesDataInvalidatedEvent spacesDataInvalidatedEvent = (SpacesDataInvalidatedEvent) obj;
                if (!C7384Etj.areEqual(this.slug, spacesDataInvalidatedEvent.slug) || !C7384Etj.areEqual(this.queryKeys, spacesDataInvalidatedEvent.queryKeys) || !C7384Etj.areEqual(this.originActionCallId, spacesDataInvalidatedEvent.originActionCallId)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpacesDataInvalidatedEvent copy$default(SpacesDataInvalidatedEvent spacesDataInvalidatedEvent, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spacesDataInvalidatedEvent.slug;
        }
        if ((i & 2) != 0) {
            list = spacesDataInvalidatedEvent.queryKeys;
        }
        if ((i & 4) != 0) {
            str2 = spacesDataInvalidatedEvent.originActionCallId;
        }
        return spacesDataInvalidatedEvent.copy(str, list, str2);
    }

    public final String component1() {
        return this.slug;
    }

    public final List<JsonArray> component2() {
        return this.queryKeys;
    }

    public final String component3() {
        return this.originActionCallId;
    }

    public final String getOriginActionCallId() {
        return this.originActionCallId;
    }

    public final List<JsonArray> getQueryKeys() {
        return this.queryKeys;
    }

    public final String getSlug() {
        return this.slug;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.queryKeys, AnonymousClass001.A0G(this.slug)) + AnonymousClass006.A0G(this.originActionCallId);
    }

    public SpacesDataInvalidatedEvent(String str, List<JsonArray> list, String str2) {
        AnonymousClass003.A0u(str, list);
        this.slug = str;
        this.queryKeys = list;
        this.originActionCallId = str2;
    }

    public final SpacesDataInvalidatedEvent copy(String str, List<JsonArray> list, String str2) {
        AnonymousClass003.A0u(str, list);
        return new SpacesDataInvalidatedEvent(str, list, str2);
    }

    public String toString() {
        return super.toString();
    }
}
