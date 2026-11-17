package com.facebook.aura.nodes.datasource;

import X.C06G;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes6.dex */
public final class BackfillPage extends C06G {
    public final boolean hasMore;
    public final long nextCursor;
    public final JsonObject payload;

    public static /* synthetic */ BackfillPage copy$default(BackfillPage backfillPage, JsonObject jsonObject, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            jsonObject = backfillPage.payload;
        }
        if ((i & 2) != 0) {
            j = backfillPage.nextCursor;
        }
        if ((i & 4) != 0) {
            z = backfillPage.hasMore;
        }
        return new BackfillPage(jsonObject, j, z);
    }

    public final JsonObject component1() {
        return this.payload;
    }

    public final long component2() {
        return this.nextCursor;
    }

    public final boolean component3() {
        return this.hasMore;
    }

    public final BackfillPage copy(JsonObject jsonObject, long j, boolean z) {
        return new BackfillPage(jsonObject, j, z);
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final long getNextCursor() {
        return this.nextCursor;
    }

    public final JsonObject getPayload() {
        return this.payload;
    }

    public BackfillPage(JsonObject jsonObject, long j, boolean z) {
        this.payload = jsonObject;
        this.nextCursor = j;
        this.hasMore = z;
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return super.toString();
    }
}
