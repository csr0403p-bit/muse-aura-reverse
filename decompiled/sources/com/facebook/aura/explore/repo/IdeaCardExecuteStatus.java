package com.facebook.aura.explore.repo;

import X.AnonymousClass001;
import X.C06H;
import X.C7384Etj;
import X.Ey9;
import X.F3w;
import com.facebook.aura.activation.model.HatchReTosViewModelKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class IdeaCardExecuteStatus {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ IdeaCardExecuteStatus[] $VALUES;
    public static final IdeaCardExecuteStatus ACCEPTED;
    public static final Companion Companion;
    public static final IdeaCardExecuteStatus QUEUED;
    public static final IdeaCardExecuteStatus UNKNOWN;

    static {
        IdeaCardExecuteStatus ideaCardExecuteStatus = new IdeaCardExecuteStatus("ACCEPTED", 0);
        ACCEPTED = ideaCardExecuteStatus;
        IdeaCardExecuteStatus ideaCardExecuteStatus2 = new IdeaCardExecuteStatus("QUEUED", 1);
        QUEUED = ideaCardExecuteStatus2;
        IdeaCardExecuteStatus ideaCardExecuteStatus3 = new IdeaCardExecuteStatus("UNKNOWN", 2);
        UNKNOWN = ideaCardExecuteStatus3;
        IdeaCardExecuteStatus[] ideaCardExecuteStatusArr = {ideaCardExecuteStatus, ideaCardExecuteStatus2, ideaCardExecuteStatus3};
        $VALUES = ideaCardExecuteStatusArr;
        $ENTRIES = new F3w(ideaCardExecuteStatusArr);
        Companion = new Companion();
    }

    public static Ey9<IdeaCardExecuteStatus> getEntries() {
        return $ENTRIES;
    }

    public static IdeaCardExecuteStatus valueOf(String str) {
        return (IdeaCardExecuteStatus) Enum.valueOf(IdeaCardExecuteStatus.class, str);
    }

    public static IdeaCardExecuteStatus[] values() {
        return (IdeaCardExecuteStatus[]) $VALUES.clone();
    }

    public final class Companion {
        public final IdeaCardExecuteStatus fromWire(String str) {
            C7384Etj.A0Y(str, 0);
            String strA0u = AnonymousClass001.A0u(str);
            return strA0u.equals(HatchReTosViewModelKt.RESULT_ACCEPTED) ? IdeaCardExecuteStatus.ACCEPTED : strA0u.equals("queued") ? IdeaCardExecuteStatus.QUEUED : IdeaCardExecuteStatus.UNKNOWN;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public IdeaCardExecuteStatus(String str, int i) {
    }
}
