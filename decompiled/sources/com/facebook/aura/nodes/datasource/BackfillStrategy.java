package com.facebook.aura.nodes.datasource;

import X.HtJ;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes6.dex */
public interface BackfillStrategy {

    /* renamed from: com.facebook.aura.nodes.datasource.BackfillStrategy$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static JsonObject $default$ackStub(BackfillStrategy backfillStrategy) {
            return null;
        }

        public static void $default$onWindowAccepted(BackfillStrategy backfillStrategy) {
        }

        public static /* synthetic */ JsonObject access$ackStub$jd(BackfillStrategy backfillStrategy) {
            return null;
        }

        public static /* synthetic */ void access$onWindowAccepted$jd(BackfillStrategy backfillStrategy) {
        }

        public static int $default$estimatedChunks(BackfillStrategy backfillStrategy, long j, long j2) {
            long chunkDays = backfillStrategy.getChunkDays() * 86400000;
            if (chunkDays <= 0) {
                return 1;
            }
            long j3 = j2 - j;
            if (j3 < 0) {
                j3 = 0;
            }
            int i = (int) (((j3 + chunkDays) - 1) / chunkDays);
            if (i < 1) {
                return 1;
            }
            return i;
        }
    }

    /* loaded from: classes3.dex */
    public abstract class DefaultImpls {
        @Deprecated
        public static JsonObject ackStub(BackfillStrategy backfillStrategy) {
            return null;
        }

        @Deprecated
        public static void onWindowAccepted(BackfillStrategy backfillStrategy) {
        }

        @Deprecated
        public static int estimatedChunks(BackfillStrategy backfillStrategy, long j, long j2) {
            return CC.$default$estimatedChunks(backfillStrategy, j, j2);
        }
    }

    JsonObject ackStub();

    int estimatedChunks(long j, long j2);

    long getChunkDays();

    void onWindowAccepted();

    Object windowSnapshot(long j, long j2, HtJ<? super JsonObject> htJ);
}
