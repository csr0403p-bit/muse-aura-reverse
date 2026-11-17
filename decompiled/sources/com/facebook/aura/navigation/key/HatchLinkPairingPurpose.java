package com.facebook.aura.navigation.key;

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
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable
/* loaded from: classes4.dex */
public final class HatchLinkPairingPurpose {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchLinkPairingPurpose[] $VALUES;
    public static final F0C<C9hr<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    public static final HatchLinkPairingPurpose NEW_PAIRING;
    public static final HatchLinkPairingPurpose PAIR_AGAIN;

    public final class Companion {

        /* renamed from: com.facebook.aura.navigation.key.HatchLinkPairingPurpose$Companion$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<C9hr<Object>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C9hr<Object> invoke() {
                return C9iL.A01("com.facebook.aura.navigation.key.HatchLinkPairingPurpose", HatchLinkPairingPurpose.values());
            }
        }

        private final /* synthetic */ C9hr get$cachedSerializer() {
            return AnonymousClass001.A12(HatchLinkPairingPurpose.$cachedSerializer$delegate);
        }

        public final C9hr<HatchLinkPairingPurpose> serializer() {
            return AnonymousClass001.A12(HatchLinkPairingPurpose.$cachedSerializer$delegate);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        HatchLinkPairingPurpose hatchLinkPairingPurpose = new HatchLinkPairingPurpose("NEW_PAIRING", 0);
        NEW_PAIRING = hatchLinkPairingPurpose;
        HatchLinkPairingPurpose hatchLinkPairingPurpose2 = new HatchLinkPairingPurpose("PAIR_AGAIN", 1);
        PAIR_AGAIN = hatchLinkPairingPurpose2;
        HatchLinkPairingPurpose[] hatchLinkPairingPurposeArr = {hatchLinkPairingPurpose, hatchLinkPairingPurpose2};
        $VALUES = hatchLinkPairingPurposeArr;
        $ENTRIES = C3cG.A0w(hatchLinkPairingPurposeArr);
        Companion = new Companion();
        $cachedSerializer$delegate = AbstractC5321DgF.A02(C79.A01, Companion.AnonymousClass1.INSTANCE);
    }

    public static Ey9<HatchLinkPairingPurpose> getEntries() {
        return $ENTRIES;
    }

    public static HatchLinkPairingPurpose valueOf(String str) {
        return (HatchLinkPairingPurpose) Enum.valueOf(HatchLinkPairingPurpose.class, str);
    }

    public static HatchLinkPairingPurpose[] values() {
        return (HatchLinkPairingPurpose[]) $VALUES.clone();
    }

    public HatchLinkPairingPurpose(String str, int i) {
    }
}
