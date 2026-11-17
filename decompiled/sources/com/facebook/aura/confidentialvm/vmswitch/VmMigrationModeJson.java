package com.facebook.aura.confidentialvm.vmswitch;

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
import com.facebook.aura.subscription.repo.AuraSubscriptionRepositoryJsonKt;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable
/* loaded from: classes2.dex */
public final class VmMigrationModeJson {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ VmMigrationModeJson[] $VALUES;
    public static final F0C<C9hr<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    public static final VmMigrationModeJson DOWNGRADE;

    public final class Companion {

        /* renamed from: com.facebook.aura.confidentialvm.vmswitch.VmMigrationModeJson$Companion$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<C9hr<Object>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C9hr<Object> invoke() {
                return C9iL.A01("com.facebook.aura.confidentialvm.vmswitch.VmMigrationModeJson", VmMigrationModeJson.values());
            }
        }

        private final /* synthetic */ C9hr get$cachedSerializer() {
            return AnonymousClass001.A12(VmMigrationModeJson.$cachedSerializer$delegate);
        }

        public final C9hr<VmMigrationModeJson> serializer() {
            return AnonymousClass001.A12(VmMigrationModeJson.$cachedSerializer$delegate);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        VmMigrationModeJson vmMigrationModeJson = new VmMigrationModeJson(AuraSubscriptionRepositoryJsonKt.PENDING_PLAN_CHANGE_DOWNGRADE, 0);
        DOWNGRADE = vmMigrationModeJson;
        VmMigrationModeJson[] vmMigrationModeJsonArr = {vmMigrationModeJson};
        $VALUES = vmMigrationModeJsonArr;
        $ENTRIES = C3cG.A0w(vmMigrationModeJsonArr);
        Companion = new Companion();
        $cachedSerializer$delegate = AbstractC5321DgF.A02(C79.A01, Companion.AnonymousClass1.INSTANCE);
    }

    public static Ey9<VmMigrationModeJson> getEntries() {
        return $ENTRIES;
    }

    public static VmMigrationModeJson valueOf(String str) {
        return (VmMigrationModeJson) Enum.valueOf(VmMigrationModeJson.class, str);
    }

    public static VmMigrationModeJson[] values() {
        return (VmMigrationModeJson[]) $VALUES.clone();
    }

    public VmMigrationModeJson(String str, int i) {
    }
}
