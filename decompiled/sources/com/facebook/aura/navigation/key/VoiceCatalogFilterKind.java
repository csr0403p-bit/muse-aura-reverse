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
public final class VoiceCatalogFilterKind {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ VoiceCatalogFilterKind[] $VALUES;
    public static final F0C<C9hr<Object>> $cachedSerializer$delegate;
    public static final VoiceCatalogFilterKind ACCENT;
    public static final Companion Companion;
    public static final VoiceCatalogFilterKind GENDER;
    public static final VoiceCatalogFilterKind TONE;

    public final class Companion {

        /* renamed from: com.facebook.aura.navigation.key.VoiceCatalogFilterKind$Companion$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<C9hr<Object>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C9hr<Object> invoke() {
                return C9iL.A01("com.facebook.aura.navigation.key.VoiceCatalogFilterKind", VoiceCatalogFilterKind.values());
            }
        }

        private final /* synthetic */ C9hr get$cachedSerializer() {
            return AnonymousClass001.A12(VoiceCatalogFilterKind.$cachedSerializer$delegate);
        }

        public final C9hr<VoiceCatalogFilterKind> serializer() {
            return AnonymousClass001.A12(VoiceCatalogFilterKind.$cachedSerializer$delegate);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        VoiceCatalogFilterKind voiceCatalogFilterKind = new VoiceCatalogFilterKind("GENDER", 0);
        GENDER = voiceCatalogFilterKind;
        VoiceCatalogFilterKind voiceCatalogFilterKind2 = new VoiceCatalogFilterKind("ACCENT", 1);
        ACCENT = voiceCatalogFilterKind2;
        VoiceCatalogFilterKind voiceCatalogFilterKind3 = new VoiceCatalogFilterKind("TONE", 2);
        TONE = voiceCatalogFilterKind3;
        VoiceCatalogFilterKind[] voiceCatalogFilterKindArr = {voiceCatalogFilterKind, voiceCatalogFilterKind2, voiceCatalogFilterKind3};
        $VALUES = voiceCatalogFilterKindArr;
        $ENTRIES = C3cG.A0w(voiceCatalogFilterKindArr);
        Companion = new Companion();
        $cachedSerializer$delegate = AbstractC5321DgF.A02(C79.A01, Companion.AnonymousClass1.INSTANCE);
    }

    public static Ey9<VoiceCatalogFilterKind> getEntries() {
        return $ENTRIES;
    }

    public static VoiceCatalogFilterKind valueOf(String str) {
        return (VoiceCatalogFilterKind) Enum.valueOf(VoiceCatalogFilterKind.class, str);
    }

    public static VoiceCatalogFilterKind[] values() {
        return (VoiceCatalogFilterKind[]) $VALUES.clone();
    }

    public VoiceCatalogFilterKind(String str, int i) {
    }
}
