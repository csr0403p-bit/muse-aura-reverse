package com.facebook.aura.spaces.repo;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import com.facebook.aura.conversation.offline.HatchOfflineConversationRepository;
import com.facebook.aura.feed.repo.FeedInstructionsCardStoreKt;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class SpaceCardState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ SpaceCardState[] $VALUES;
    public static final SpaceCardState ACTIVE;
    public static final Companion Companion;
    public static final SpaceCardState DISMISSED;
    public static final SpaceCardState EXPIRED;
    public static final SpaceCardState UNKNOWN;
    public final String value;

    static {
        SpaceCardState spaceCardState = new SpaceCardState("ACTIVE", 0, HatchOfflineConversationRepository.THREAD_STATUS_ACTIVE);
        ACTIVE = spaceCardState;
        SpaceCardState spaceCardState2 = new SpaceCardState("DISMISSED", 1, FeedInstructionsCardStoreKt.KEY_DISMISSED);
        DISMISSED = spaceCardState2;
        SpaceCardState spaceCardState3 = new SpaceCardState("EXPIRED", 2, "expired");
        EXPIRED = spaceCardState3;
        SpaceCardState spaceCardState4 = new SpaceCardState("UNKNOWN", 3, "unknown");
        UNKNOWN = spaceCardState4;
        SpaceCardState[] spaceCardStateArr = {spaceCardState, spaceCardState2, spaceCardState3, spaceCardState4};
        $VALUES = spaceCardStateArr;
        $ENTRIES = C3cG.A0w(spaceCardStateArr);
        Companion = new Companion();
    }

    public static Ey9<SpaceCardState> getEntries() {
        return $ENTRIES;
    }

    public static SpaceCardState valueOf(String str) {
        return (SpaceCardState) Enum.valueOf(SpaceCardState.class, str);
    }

    public static SpaceCardState[] values() {
        return (SpaceCardState[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public final class Companion {
        public final SpaceCardState fromString(String str) {
            SpaceCardState next;
            C7384Etj.A0Y(str, 0);
            Iterator<SpaceCardState> it = SpaceCardState.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (str.equals(next.getValue())) {
                    break;
                }
            }
            SpaceCardState spaceCardState = next;
            return spaceCardState == null ? SpaceCardState.UNKNOWN : spaceCardState;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public SpaceCardState(String str, int i, String str2) {
        this.value = str2;
    }
}
