package com.facebook.aura.nodes.datasource;

import X.C3cG;
import X.HtJ;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes6.dex */
public interface PagedBackfillStrategy {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final long START_CURSOR = 0;

    /* renamed from: com.facebook.aura.nodes.datasource.PagedBackfillStrategy$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static JsonObject $default$ackStub(PagedBackfillStrategy pagedBackfillStrategy) {
            return null;
        }

        public static /* synthetic */ JsonObject access$ackStub$jd(PagedBackfillStrategy pagedBackfillStrategy) {
            return null;
        }
    }

    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final long START_CURSOR = 0;
    }

    public abstract class DefaultImpls {
        @Deprecated
        public static Object estimatedChunks(PagedBackfillStrategy pagedBackfillStrategy, HtJ<? super Integer> htJ) {
            return C3cG.A0R(1);
        }

        @Deprecated
        public static JsonObject ackStub(PagedBackfillStrategy pagedBackfillStrategy) {
            return null;
        }
    }

    JsonObject ackStub();

    Object estimatedChunks(HtJ<? super Integer> htJ);

    int getPageSize();

    Object page(long j, int i, HtJ<? super BackfillPage> htJ);
}
