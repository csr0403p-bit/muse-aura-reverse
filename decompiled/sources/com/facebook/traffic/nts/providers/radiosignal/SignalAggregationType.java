package com.facebook.traffic.nts.providers.radiosignal;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class SignalAggregationType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ SignalAggregationType[] $VALUES;
    public static final Companion Companion;
    public static final SignalAggregationType EWMA;
    public static final SignalAggregationType NONE;
    public final String value;

    static {
        SignalAggregationType signalAggregationType = new SignalAggregationType(HatchPersistedMessageJson.UNSEND_STATUS_NONE, 0, "None");
        NONE = signalAggregationType;
        SignalAggregationType signalAggregationType2 = new SignalAggregationType("EWMA", 1, "Ewma");
        EWMA = signalAggregationType2;
        SignalAggregationType[] signalAggregationTypeArr = {signalAggregationType, signalAggregationType2};
        $VALUES = signalAggregationTypeArr;
        $ENTRIES = C3cG.A0w(signalAggregationTypeArr);
        Companion = new Companion();
    }

    public final class Companion {
        public final SignalAggregationType fromString(String str) {
            SignalAggregationType next;
            C7384Etj.A0Y(str, 0);
            Iterator<SignalAggregationType> it = SignalAggregationType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                String value = next.getValue();
                if (value != null && value.equalsIgnoreCase(str)) {
                    break;
                }
            }
            SignalAggregationType signalAggregationType = next;
            return signalAggregationType == null ? SignalAggregationType.EWMA : signalAggregationType;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static Ey9<SignalAggregationType> getEntries() {
        return $ENTRIES;
    }

    public static SignalAggregationType valueOf(String str) {
        return (SignalAggregationType) Enum.valueOf(SignalAggregationType.class, str);
    }

    public static SignalAggregationType[] values() {
        return (SignalAggregationType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public SignalAggregationType(String str, int i, String str2) {
        this.value = str2;
    }
}
