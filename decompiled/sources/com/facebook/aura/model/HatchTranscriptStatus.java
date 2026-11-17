package com.facebook.aura.model;

import X.AbstractC5321DgF;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C06H;
import X.C3cG;
import X.C79;
import X.C9hr;
import X.C9iL;
import X.Ey9;
import X.F0C;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable
/* loaded from: classes3.dex */
public final class HatchTranscriptStatus {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchTranscriptStatus[] $VALUES;
    public static final F0C<C9hr<Object>> $cachedSerializer$delegate;
    public static final HatchTranscriptStatus COMPLETED;
    public static final Companion Companion;
    public static final HatchTranscriptStatus FAILED;
    public static final HatchTranscriptStatus INTERRUPTED;
    public static final HatchTranscriptStatus STREAMING;

    public final class Companion {

        /* renamed from: com.facebook.aura.model.HatchTranscriptStatus$Companion$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<C9hr<Object>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C9hr<Object> invoke() {
                return C9iL.A01("com.facebook.aura.model.HatchTranscriptStatus", HatchTranscriptStatus.values());
            }
        }

        private final /* synthetic */ C9hr get$cachedSerializer() {
            return AnonymousClass001.A12(HatchTranscriptStatus.$cachedSerializer$delegate);
        }

        public final C9hr<HatchTranscriptStatus> serializer() {
            return AnonymousClass001.A12(HatchTranscriptStatus.$cachedSerializer$delegate);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        HatchTranscriptStatus hatchTranscriptStatus = new HatchTranscriptStatus("STREAMING", 0);
        STREAMING = hatchTranscriptStatus;
        HatchTranscriptStatus hatchTranscriptStatus2 = new HatchTranscriptStatus("COMPLETED", 1);
        COMPLETED = hatchTranscriptStatus2;
        HatchTranscriptStatus hatchTranscriptStatus3 = new HatchTranscriptStatus(CvmMigrationStatusJson.STAGE_FAILED, 2);
        FAILED = hatchTranscriptStatus3;
        HatchTranscriptStatus hatchTranscriptStatus4 = new HatchTranscriptStatus("INTERRUPTED", 3);
        INTERRUPTED = hatchTranscriptStatus4;
        HatchTranscriptStatus[] hatchTranscriptStatusArr = {hatchTranscriptStatus, hatchTranscriptStatus2, hatchTranscriptStatus3, hatchTranscriptStatus4};
        $VALUES = hatchTranscriptStatusArr;
        $ENTRIES = C3cG.A0w(hatchTranscriptStatusArr);
        Companion = new Companion();
        $cachedSerializer$delegate = AbstractC5321DgF.A02(C79.A01, Companion.AnonymousClass1.INSTANCE);
    }

    public static Ey9<HatchTranscriptStatus> getEntries() {
        return $ENTRIES;
    }

    public static HatchTranscriptStatus valueOf(String str) {
        return (HatchTranscriptStatus) Enum.valueOf(HatchTranscriptStatus.class, str);
    }

    public static HatchTranscriptStatus[] values() {
        return (HatchTranscriptStatus[]) $VALUES.clone();
    }

    public HatchTranscriptStatus(String str, int i) {
    }
}
