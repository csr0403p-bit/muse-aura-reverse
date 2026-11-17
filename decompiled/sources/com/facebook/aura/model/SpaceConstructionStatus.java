package com.facebook.aura.model;

import X.AbstractC5321DgF;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iL;
import X.Ey9;
import X.F0C;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;
import com.facebook.aura.conversation.repo.HatchConversationRepositoryKt;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable
/* loaded from: classes3.dex */
public final class SpaceConstructionStatus {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ SpaceConstructionStatus[] $VALUES;
    public static final F0C<C9hr<Object>> $cachedSerializer$delegate;
    public static final SpaceConstructionStatus CONSTRUCTING;
    public static final Companion Companion;
    public static final SpaceConstructionStatus FAILED;
    public static final SpaceConstructionStatus INTERRUPTED;
    public static final SpaceConstructionStatus SUCCEEDED;
    public static final SpaceConstructionStatus UPDATING;
    public final String serverValue;

    public final class Companion {
        public final SpaceConstructionStatus fromServerValue(String str) {
            SpaceConstructionStatus next;
            C7384Etj.A0Y(str, 0);
            String strA0l = AnonymousClass002.A0l(str);
            if (strA0l.length() == 0) {
                return null;
            }
            Iterator<SpaceConstructionStatus> it = SpaceConstructionStatus.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                String serverValue = next.getServerValue();
                if (serverValue != null && serverValue.equalsIgnoreCase(strA0l)) {
                    break;
                }
            }
            SpaceConstructionStatus spaceConstructionStatus = next;
            if (spaceConstructionStatus != null) {
                return spaceConstructionStatus;
            }
            if (strA0l.equalsIgnoreCase("BUILDING")) {
                return SpaceConstructionStatus.CONSTRUCTING;
            }
            if (strA0l.equalsIgnoreCase("READY")) {
                return SpaceConstructionStatus.SUCCEEDED;
            }
            if (strA0l.equalsIgnoreCase(CvmMigrationStatusJson.STAGE_FAILED)) {
                return SpaceConstructionStatus.FAILED;
            }
            return null;
        }

        /* renamed from: com.facebook.aura.model.SpaceConstructionStatus$Companion$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<C9hr<Object>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C9hr<Object> invoke() {
                return C9iL.A01("com.facebook.aura.model.SpaceConstructionStatus", SpaceConstructionStatus.values());
            }
        }

        private final /* synthetic */ C9hr get$cachedSerializer() {
            return AnonymousClass001.A12(SpaceConstructionStatus.$cachedSerializer$delegate);
        }

        public final C9hr<SpaceConstructionStatus> serializer() {
            return AnonymousClass001.A12(SpaceConstructionStatus.$cachedSerializer$delegate);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        SpaceConstructionStatus spaceConstructionStatus = new SpaceConstructionStatus("CONSTRUCTING", 0, "constructing");
        CONSTRUCTING = spaceConstructionStatus;
        SpaceConstructionStatus spaceConstructionStatus2 = new SpaceConstructionStatus("UPDATING", 1, "updating");
        UPDATING = spaceConstructionStatus2;
        SpaceConstructionStatus spaceConstructionStatus3 = new SpaceConstructionStatus(CvmMigrationStatusJson.STAGE_SUCCEEDED, 2, "succeeded");
        SUCCEEDED = spaceConstructionStatus3;
        SpaceConstructionStatus spaceConstructionStatus4 = new SpaceConstructionStatus(CvmMigrationStatusJson.STAGE_FAILED, 3, "failed");
        FAILED = spaceConstructionStatus4;
        SpaceConstructionStatus spaceConstructionStatus5 = new SpaceConstructionStatus("INTERRUPTED", 4, HatchConversationRepositoryKt.TERMINAL_STATUS_INTERRUPTED);
        INTERRUPTED = spaceConstructionStatus5;
        SpaceConstructionStatus[] spaceConstructionStatusArr = {spaceConstructionStatus, spaceConstructionStatus2, spaceConstructionStatus3, spaceConstructionStatus4, spaceConstructionStatus5};
        $VALUES = spaceConstructionStatusArr;
        $ENTRIES = C3cG.A0w(spaceConstructionStatusArr);
        Companion = new Companion();
        $cachedSerializer$delegate = AbstractC5321DgF.A02(C79.A01, Companion.AnonymousClass1.INSTANCE);
    }

    public static Ey9<SpaceConstructionStatus> getEntries() {
        return $ENTRIES;
    }

    public static SpaceConstructionStatus valueOf(String str) {
        return (SpaceConstructionStatus) Enum.valueOf(SpaceConstructionStatus.class, str);
    }

    public static SpaceConstructionStatus[] values() {
        return (SpaceConstructionStatus[]) $VALUES.clone();
    }

    public final String getServerValue() {
        return this.serverValue;
    }

    public SpaceConstructionStatus(String str, int i, String str2) {
        this.serverValue = str2;
    }
}
