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
public final class VoiceEntryPoint {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ VoiceEntryPoint[] $VALUES;
    public static final F0C<C9hr<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    public static final VoiceEntryPoint SETTINGS;
    public static final VoiceEntryPoint VOICE_WIDGET;
    public final String value;

    public final class Companion {

        /* renamed from: com.facebook.aura.navigation.key.VoiceEntryPoint$Companion$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<C9hr<Object>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C9hr<Object> invoke() {
                return C9iL.A01("com.facebook.aura.navigation.key.VoiceEntryPoint", VoiceEntryPoint.values());
            }
        }

        private final /* synthetic */ C9hr get$cachedSerializer() {
            return AnonymousClass001.A12(VoiceEntryPoint.$cachedSerializer$delegate);
        }

        public final C9hr<VoiceEntryPoint> serializer() {
            return AnonymousClass001.A12(VoiceEntryPoint.$cachedSerializer$delegate);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        VoiceEntryPoint voiceEntryPoint = new VoiceEntryPoint("SETTINGS", 0, "settings");
        SETTINGS = voiceEntryPoint;
        VoiceEntryPoint voiceEntryPoint2 = new VoiceEntryPoint("VOICE_WIDGET", 1, "voice_widget");
        VOICE_WIDGET = voiceEntryPoint2;
        VoiceEntryPoint[] voiceEntryPointArr = {voiceEntryPoint, voiceEntryPoint2};
        $VALUES = voiceEntryPointArr;
        $ENTRIES = C3cG.A0w(voiceEntryPointArr);
        Companion = new Companion();
        $cachedSerializer$delegate = AbstractC5321DgF.A02(C79.A01, Companion.AnonymousClass1.INSTANCE);
    }

    public static Ey9<VoiceEntryPoint> getEntries() {
        return $ENTRIES;
    }

    public static VoiceEntryPoint valueOf(String str) {
        return (VoiceEntryPoint) Enum.valueOf(VoiceEntryPoint.class, str);
    }

    public static VoiceEntryPoint[] values() {
        return (VoiceEntryPoint[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public VoiceEntryPoint(String str, int i, String str2) {
        this.value = str2;
    }
}
