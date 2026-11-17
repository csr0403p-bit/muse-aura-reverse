package com.facebook.aura.nodes.cards;

import X.A3q;
import X.AbstractC0878AGe;
import X.AnonymousClass002;
import X.BzK;
import X.C4oT;
import X.C7384Etj;
import android.content.Context;
import com.facebook.aura.assist.status.HatchDefaultAssistantStatus;
import com.facebook.aura.common.prefs.HatchPrefsStore;
import java.util.Set;

/* loaded from: classes2.dex */
public final class DefaultAssistantUpsellGate {
    public static final String EARNED_KEYS_PREF = "default_assistant_upsell_earned_keys";
    public static final DefaultAssistantUpsellGate INSTANCE = new DefaultAssistantUpsellGate();
    public static final int MAX_IMPRESSIONS = 3;

    public final class Decision {
        public static final int $stable = 0;
        public final String recordKey;
        public final boolean show;

        public final String getRecordKey() {
            return this.recordKey;
        }

        public final boolean getShow() {
            return this.show;
        }

        public Decision(boolean z, String str) {
            this.show = z;
            this.recordKey = str;
        }
    }

    public final Decision decide(Context context, String str, boolean z) {
        boolean zA1a = AnonymousClass002.A1a(context, str);
        if (!HatchDefaultAssistantStatus.INSTANCE.isDefaultAssistant(context)) {
            Set<String> setEarnedKeys = earnedKeys();
            if (setEarnedKeys.contains(str)) {
                return new Decision(zA1a, null);
            }
            if (z && setEarnedKeys.size() < 3) {
                return new Decision(zA1a, str);
            }
        }
        return new Decision(false, null);
    }

    public final void recordEarned(String str) {
        C7384Etj.A0Y(str, 0);
        Set setA0f = AbstractC0878AGe.A0f(earnedKeys());
        setA0f.add(str);
        BzK bzKA9q = HatchPrefsStore.INSTANCE.internalPrefs().A9q();
        bzKA9q.A09(EARNED_KEYS_PREF, setA0f);
        bzKA9q.apply();
    }

    private final Set<String> earnedKeys() {
        C4oT c4oTInternalPrefs = HatchPrefsStore.INSTANCE.internalPrefs();
        A3q a3q = A3q.A00;
        Set<String> stringSet = c4oTInternalPrefs.getStringSet(EARNED_KEYS_PREF, a3q);
        return stringSet == null ? a3q : stringSet;
    }
}
