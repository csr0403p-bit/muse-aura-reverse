package com.facebook.aura.model;

import X.AbstractC5321DgF;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iL;
import X.Ey9;
import X.F0C;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable
/* loaded from: classes2.dex */
public final class AvatarVideoVariant {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AvatarVideoVariant[] $VALUES;
    public static final F0C<C9hr<Object>> $cachedSerializer$delegate;
    public static final AvatarVideoVariant CONNECTING;
    public static final Companion Companion;
    public static final AvatarVideoVariant IDLE;
    public static final AvatarVideoVariant MAKING_SOMETHING;
    public static final AvatarVideoVariant MILESTONE_ACHIEVEMENT;
    public static final AvatarVideoVariant MILESTONE_LEVEL_UP;
    public static final AvatarVideoVariant WAITING_FOR_SUBAGENTS;
    public static final AvatarVideoVariant WAKING;
    public static final AvatarVideoVariant WORKING;
    public final String key;

    public final class Companion {
        public final AvatarVideoVariant fromKey(String str) {
            C7384Etj.A0Y(str, 0);
            for (AvatarVideoVariant avatarVideoVariant : AvatarVideoVariant.values()) {
                if (str.equals(avatarVideoVariant.getKey())) {
                    return avatarVideoVariant;
                }
            }
            return null;
        }

        /* renamed from: com.facebook.aura.model.AvatarVideoVariant$Companion$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<C9hr<Object>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C9hr<Object> invoke() {
                return C9iL.A01("com.facebook.aura.model.AvatarVideoVariant", AvatarVideoVariant.values());
            }
        }

        private final /* synthetic */ C9hr get$cachedSerializer() {
            return AnonymousClass001.A12(AvatarVideoVariant.$cachedSerializer$delegate);
        }

        public final C9hr<AvatarVideoVariant> serializer() {
            return AnonymousClass001.A12(AvatarVideoVariant.$cachedSerializer$delegate);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        AvatarVideoVariant avatarVideoVariant = new AvatarVideoVariant("IDLE", 0, "idle");
        IDLE = avatarVideoVariant;
        AvatarVideoVariant avatarVideoVariant2 = new AvatarVideoVariant("WORKING", 1, "working");
        WORKING = avatarVideoVariant2;
        AvatarVideoVariant avatarVideoVariant3 = new AvatarVideoVariant("WAKING", 2, "waking");
        WAKING = avatarVideoVariant3;
        AvatarVideoVariant avatarVideoVariant4 = new AvatarVideoVariant("MAKING_SOMETHING", 3, "making_something");
        MAKING_SOMETHING = avatarVideoVariant4;
        AvatarVideoVariant avatarVideoVariant5 = new AvatarVideoVariant("WAITING_FOR_SUBAGENTS", 4, "waiting_for_subagents");
        WAITING_FOR_SUBAGENTS = avatarVideoVariant5;
        AvatarVideoVariant avatarVideoVariant6 = new AvatarVideoVariant("MILESTONE_ACHIEVEMENT", 5, "milestone_achievement");
        MILESTONE_ACHIEVEMENT = avatarVideoVariant6;
        AvatarVideoVariant avatarVideoVariant7 = new AvatarVideoVariant("MILESTONE_LEVEL_UP", 6, "milestone_level_up");
        MILESTONE_LEVEL_UP = avatarVideoVariant7;
        AvatarVideoVariant avatarVideoVariant8 = new AvatarVideoVariant("CONNECTING", 7, "connecting");
        CONNECTING = avatarVideoVariant8;
        AvatarVideoVariant[] avatarVideoVariantArr = {avatarVideoVariant, avatarVideoVariant2, avatarVideoVariant3, avatarVideoVariant4, avatarVideoVariant5, avatarVideoVariant6, avatarVideoVariant7, avatarVideoVariant8};
        $VALUES = avatarVideoVariantArr;
        $ENTRIES = C3cG.A0w(avatarVideoVariantArr);
        Companion = new Companion();
        $cachedSerializer$delegate = AbstractC5321DgF.A02(C79.A01, Companion.AnonymousClass1.INSTANCE);
    }

    public static Ey9<AvatarVideoVariant> getEntries() {
        return $ENTRIES;
    }

    public static AvatarVideoVariant valueOf(String str) {
        return (AvatarVideoVariant) Enum.valueOf(AvatarVideoVariant.class, str);
    }

    public static AvatarVideoVariant[] values() {
        return (AvatarVideoVariant[]) $VALUES.clone();
    }

    public final String getKey() {
        return this.key;
    }

    public AvatarVideoVariant(String str, int i, String str2) {
        this.key = str2;
    }
}
